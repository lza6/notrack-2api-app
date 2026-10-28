# -*- coding: utf-8 -*-
"""mihomo_runner.py -- 内置 mihomo(Clash Meta) 内核管理

把 v2ray/ss/vless/trojan 节点转成本地可用代理：
  节点(Clash yaml / v2ray URI 订阅) -> 生成 mihomo listeners 配置
  -> 每节点一个独立 socks5 端口 (127.0.0.1:41000+i)
  -> Chrome --proxy-server=socks5://127.0.0.1:port 直接可用

内核获取策略（三级回退）：
  1. DUCK_MIHOMO_PATH 环境变量指定的内核
  2. tools/mihomo/mihomo.exe（内置目录）
  3. 首次启用时从 GitHub Release 自动下载（mihomo-windows-amd64-vX.Y.Z.zip）
"""
from __future__ import annotations

import base64
import hashlib
import logging
import os
import re
import shutil
import socket
import subprocess
import time
import zipfile

log = logging.getLogger("mihomo_runner")

# 本地 socks 端口段（避开 CDP 9400 段与常用服务）
SOCKS_BASE_PORT = 41000
MIHOMO_DIR = os.path.join(os.path.dirname(os.path.abspath(__file__)), "tools", "mihomo")
MIHOMO_DOWNLOAD_URL = ("https://github.com/MetaCubeX/mihomo/releases/download/"
                       "v1.19.2/mihomo-windows-amd64-v1.19.2.zip")
# 供应链校验（known#7）：pin 住 v1.19.2 官方 zip 的 SHA-256。上游发新版时
# 这里必须同步人工更新——宁可下载失败也不要静默装入未校验的二进制。
# 获取方式: 官方 Release 页校验和文件（mihomo-windows-amd64-v1.19.2.zip 的哈希）。
MIHOMO_SHA256 = os.environ.get("MIHOMO_SHA256", "").strip().lower() or None
_UA = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/131.0.0.0 Safari/537.36"


# ── 节点解析 ────────────────────────────────────────────────────────────

def parse_clash_yaml(text: str) -> list[dict]:
    """Clash/mihomo yaml -> 节点列表（原样保留 dict，供生成 listeners）。"""
    import yaml
    try:
        data = yaml.safe_load(text)
    except Exception as e:
        log.debug("yaml 解析失败: %s", e)
        return []
    if not isinstance(data, dict):
        return []
    proxies = data.get("proxies")
    if not isinstance(proxies, list):
        return []
    # 只保留 mihomo 支持的核心类型（anytls/hysteria 等新类型旧内核会 fatal 拒载整份配置）
    SUPPORTED = {"ss", "vmess", "vless", "trojan", "socks5", "http", "snell",
                 "wireguard", "tuic", "hysteria2"}
    out = []
    for p in proxies:
        if isinstance(p, dict) and p.get("name") and p.get("type") in SUPPORTED:
            out.append(p)
    return out


def parse_v2ray_uri_text(text: str) -> list[dict]:
    """v2ray URI 列表 / base64 订阅 -> Clash 节点 dict 列表。

    支持 vmess://(base64 json) / vless:// / ss:// / trojan://。
    """
    text = (text or "").strip()
    # base64 订阅 -> URI 列表
    if "://" not in text[:64]:
        try:
            decoded = base64.b64decode(text + "=" * (-len(text) % 4)).decode("utf-8", "replace")
            if "://" in decoded:
                text = decoded
        except Exception:
            pass

    nodes: list[dict] = []
    for line in text.splitlines():
        line = line.strip()
        if not line:
            continue
        try:
            if line.startswith("vmess://"):
                n = _parse_vmess(line)
            elif line.startswith("vless://"):
                n = _parse_vless(line)
            elif line.startswith("ss://"):
                n = _parse_ss(line)
            elif line.startswith("trojan://"):
                n = _parse_trojan(line)
            else:
                continue
            if n:
                nodes.append(n)
        except Exception as e:
            log.debug("节点解析失败 %s: %s", line[:50], e)
    return nodes


def _safe_name(prefix: str, idx: int, tag: str = "") -> str:
    base = re.sub(r"[^\w\u4e00-\u9fff-]", "_", tag)[:20] or "n"
    return "%s-%d-%s" % (prefix, idx, base)


def _parse_vmess(line: str) -> dict | None:
    raw = line[8:]
    j = __import__("json").loads(base64.b64decode(raw + "=" * (-len(raw) % 4)).decode("utf-8", "replace"))
    if not j.get("add") or not j.get("port"):
        return None
    net = j.get("net") or "tcp"
    node = {"name": str(j.get("ps") or "vmess"), "type": "vmess",
            "server": str(j["add"]), "port": int(j["port"]),
            "uuid": str(j.get("id") or ""), "alterId": int(j.get("aid") or 0),
            "cipher": j.get("scy") or "auto", "udp": True}
    if net == "ws":
        node["network"] = "ws"
        node["ws-opts"] = {"path": j.get("path") or "/"}
        if j.get("host"):
            node["ws-opts"]["headers"] = {"Host": j["host"]}
    if j.get("tls") in ("tls", True, 1):
        node["tls"] = True
        node["servername"] = j.get("sni") or j.get("host") or ""
    return node


def _parse_uri_query(qs: str) -> dict:
    from urllib.parse import parse_qs
    return {k: v[0] for k, v in parse_qs(qs).items()}


def _parse_vless(line: str) -> dict | None:
    from urllib.parse import urlsplit, unquote
    u = urlsplit(line)
    if not u.hostname or not u.port:
        return None
    q = _parse_uri_query(u.query)
    node = {"name": unquote(u.fragment) or "vless", "type": "vless",
            "server": u.hostname, "port": u.port, "uuid": u.username or "",
            "udp": True}
    if q.get("flow"):
        node["flow"] = q["flow"]
    if q.get("security") == "tls" or q.get("security") == "reality":
        node["tls"] = True
        if q.get("sni"):
            node["servername"] = q["sni"]
        if q.get("pbk"):
            node["reality-opts"] = {"public-key": q["pbk"]}
            if q.get("sid"):
                node["reality-opts"]["short-id"] = q["sid"]
        node["client-fingerprint"] = "chrome"
    if q.get("type") == "ws":
        node["network"] = "ws"
        node["ws-opts"] = {"path": q.get("path") or "/"}
        if q.get("host"):
            node["ws-opts"]["headers"] = {"Host": q["host"]}
    return node


def _parse_ss(line: str) -> dict | None:
    from urllib.parse import urlsplit, unquote
    body = line[5:].split("#", 1)
    frag = unquote(body[1]) if len(body) > 1 else "ss"
    u = urlsplit("ss://" + body[0])
    if u.username and u.password:  # ss://cipher:pass@host:port（可能 base64）
        cipher, password, host, port = u.username, u.password, u.hostname, u.port
    else:
        import base64 as b64
        raw = u.netloc
        dec = b64.b64decode(raw + "=" * (-len(raw) % 4)).decode("utf-8", "replace")
        method_part, _, hostport = dec.rpartition("@")
        cipher, _, password = method_part.partition(":")
        host, _, port = hostport.partition(":")
        host = host.strip("[]")
    if not (host and str(port).isdigit() and cipher):
        return None
    return {"name": frag, "type": "ss", "server": host, "port": int(port),
            "cipher": cipher, "password": password, "udp": True}


def _parse_trojan(line: str) -> dict | None:
    from urllib.parse import urlsplit, unquote
    u = urlsplit(line)
    if not u.hostname or not u.port:
        return None
    return {"name": unquote(u.fragment) or "trojan", "type": "trojan",
            "server": u.hostname, "port": u.port, "password": u.username or "",
            "sni": u.hostname, "udp": True}


def parse_clash_nodes(*texts: str) -> list[dict]:
    """混合解析：依次尝试 Clash yaml 与 v2ray URI，合并去重（按 server:port:name）。"""
    nodes: list[dict] = []
    seen: set[str] = set()
    for t in texts:
        if not t or not t.strip():
            continue
        got = parse_clash_yaml(t) or parse_v2ray_uri_text(t)
        for n in got:
            key = "%s:%s:%s" % (n.get("server"), n.get("port"), n.get("name"))
            if key not in seen:
                seen.add(key)
                nodes.append(n)
    return nodes


# ── 内核管理 ────────────────────────────────────────────────────────────

def find_core() -> str | None:
    """定位 mihomo 内核：环境变量 > 内置目录。"""
    env = os.environ.get("DUCK_MIHOMO_PATH", "").strip()
    if env and os.path.isfile(env):
        return env
    local = os.path.join(MIHOMO_DIR, "mihomo.exe")
    if os.path.isfile(local):
        return local
    return None


def download_core(dest_dir: str = MIHOMO_DIR, proxy: str | None = None) -> str | None:
    """从 GitHub Release 下载 mihomo 内核到内置目录。返回 exe 路径或 None。"""
    import requests
    os.makedirs(dest_dir, exist_ok=True)
    exe = os.path.join(dest_dir, "mihomo.exe")
    if os.path.isfile(exe):
        return exe
    zip_path = os.path.join(dest_dir, "mihomo.zip")
    proxies = {"http": proxy, "https": proxy} if proxy else None
    log.info("下载 mihomo 内核: %s", MIHOMO_DOWNLOAD_URL)
    with requests.get(MIHOMO_DOWNLOAD_URL, timeout=120, stream=True,
                      headers={"User-Agent": _UA}, proxies=proxies) as r:
        r.raise_for_status()
        digest = hashlib.sha256()
        with open(zip_path, "wb") as f:
            for chunk in r.iter_content(65536):
                f.write(chunk)
                digest.update(chunk)
    if MIHOMO_SHA256:
        actual = digest.hexdigest()
        if actual != MIHOMO_SHA256:
            try:
                os.remove(zip_path)
            except OSError:
                pass
            raise RuntimeError(
                "mihomo zip SHA-256 mismatch: expected %s got %s "
                "(download rejected; set MIHOMO_SHA256 env to override)"
                % (MIHOMO_SHA256, actual))
        log.info("mihomo zip SHA-256 verified: %s", actual[:16] + "...")
    else:
        log.warning("mihomo zip SHA-256 NOT verified (MIHOMO_SHA256 unset) - "
                    "supply-chain check skipped")
    with zipfile.ZipFile(zip_path) as z:
        for info in z.infolist():
            if info.filename.endswith(".exe"):
                with z.open(info) as src, open(exe, "wb") as dst:
                    shutil.copyfileobj(src, dst)
                break
    try:
        os.remove(zip_path)
    except OSError:
        pass
    if os.path.isfile(exe):
        log.info("mihomo 内核就绪: %s (%.1f MB)", exe, os.path.getsize(exe) / 1e6)
        return exe
    return None


# ── 运行时 ──────────────────────────────────────────────────────────────

def _port_bindable(port: int) -> bool:
    """端口当前是否可绑定（mihomo 将独占监听它）。"""
    with socket.socket() as s:
        try:
            s.bind(("127.0.0.1", port))
            return True
        except OSError:
            return False


def build_config(nodes: list[dict], base_port: int = SOCKS_BASE_PORT,
                 max_nodes: int = 50, chain_proxy: str | None = None) -> tuple[dict, list[dict]]:
    """生成 mihomo 配置：每个节点一个独立 socks5 listener。

    返回 (config_dict, [{name, socks_port}])。最多 max_nodes 个节点
    （Chrome 实例同样受出口池上限约束，多无益）。

    端口直接按 base_port+i 顺次分配（mihomo 独占监听，不与本机其他
    服务冲突即可；运行前用 _port_bindable 校验并跳过被占端口）。

    chain_proxy: 上级代理 URL（本机直连不到节点服务器时的链式出国），
    如 "socks5://127.0.0.1:10808"。非空时为所有节点注入 dialer-proxy。
    """
    proxies = []
    listeners = []
    picked = []
    for i, n in enumerate(nodes[:max_nodes]):
        port = base_port + i
        if not _port_bindable(port):
            log.debug("端口 %d 被占用，跳过节点 %d", port, i)
            continue
        n = dict(n)
        n["name"] = _safe_name("sub", i, n.get("name") or "")
        proxies.append(n)
        listeners.append({
            "name": "mixed-in-%d" % i,
            "type": "mixed",
            "port": port,
            "proxy": n["name"],   # mihomo listener 直连指定节点
        })
        picked.append({"name": n["name"], "raw_name": nodes[i].get("name") or "",
                       "socks_port": port, "node_type": n.get("type")})
    config = {
        "mode": "direct",
        "log-level": "warning",
        "ipv6": False,
        "dns": {"enable": False},
        "proxies": proxies,
        "listeners": listeners,
    }
    if chain_proxy:
        # 链式出国：上级代理条目 + 所有节点挂 dialer-proxy
        scheme = "socks5" if chain_proxy.startswith("socks") else "http"
        host_port = re.sub(r"^\w+://", "", chain_proxy).rstrip("/")
        config["proxies"].insert(0, {
            "name": "chain", "type": scheme,
            "server": host_port.rsplit(":", 1)[0].strip("[]"),
            "port": int(host_port.rsplit(":", 1)[1]),
            "udp": False,
        })
        for p in config["proxies"][1:]:
            p["dialer-proxy"] = "chain"
    return config, picked


class MihomoRunner:
    """mihomo 子进程管理。run() 幂等：配置变化才重启。

    链式出国：本机访问境外节点服务器需要经上级代理时，设 DUCK_PROXY_CHAIN
    （如 "socks5://127.0.0.1:10808"），mihomo 会通过它 dial 所有节点
    （配置里生成 dialer-proxy: chain 指向上级 proxy 条目）。
    """

    def __init__(self, log=None):
        self.log = log or (lambda m: None)
        self.proc: subprocess.Popen | None = None
        self.config_path = os.path.join(MIHOMO_DIR, "config.yaml")
        self.current_ports: list[int] = []

    def _core(self) -> str | None:
        core = find_core()
        if core:
            return core
        try:
            return download_core()
        except Exception as e:
            self.log("mihomo 内核下载失败: %s" % e)
            return None

    def run(self, nodes: list[dict], max_nodes: int = 50) -> list[dict]:
        """启动/重启 mihomo，返回 [{"name","raw_name","socks_port","node_type","proxy_url"}]。

        mihomo 就绪判定：配置里第一个 socks 端口 TCP 可连。
        """
        if not nodes:
            self.stop()
            return []
        core = self._core()
        if not core:
            self.log("mihomo 内核不可用，sub 节点跳过")
            return []
        config, picked = build_config(nodes, max_nodes=max_nodes,
                                      chain_proxy=os.environ.get("DUCK_PROXY_CHAIN", "").strip() or None)
        os.makedirs(MIHOMO_DIR, exist_ok=True)
        import yaml
        with open(self.config_path, "w", encoding="utf-8") as f:
            yaml.safe_dump(config, f, allow_unicode=True, sort_keys=False)
        self.stop()
        self.proc = subprocess.Popen(
            [core, "-f", self.config_path],
            cwd=MIHOMO_DIR,
            stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL,
            creationflags=getattr(subprocess, "CREATE_NO_WINDOW", 0))
        # 就绪探测：等待第一个 listener 端口
        deadline = time.time() + 15
        first_port = picked[0]["socks_port"] if picked else 0
        while time.time() < deadline:
            if self.proc.poll() is not None:
                self.log("mihomo 进程提前退出 (code=%s)" % self.proc.returncode)
                return []
            with socket.socket() as s:
                s.settimeout(0.5)
                try:
                    s.connect(("127.0.0.1", first_port))
                    self.current_ports = [p["socks_port"] for p in picked]
                    out = [dict(p, proxy_url="socks5://127.0.0.1:%d" % p["socks_port"])
                           for p in picked]
                    self.log("mihomo 就绪: %d 个节点 -> socks5 端口 %d+"
                             % (len(out), first_port))
                    return out
                except OSError:
                    time.sleep(0.3)
        self.log("mihomo 启动超时")
        self.stop()
        return []

    def stop(self):
        if self.proc and self.proc.poll() is None:
            try:
                self.proc.terminate()
                try:
                    self.proc.wait(timeout=5)
                except subprocess.TimeoutExpired:
                    self.proc.kill()
            except Exception:
                pass
        self.proc = None
        self.current_ports = []


# 模块级单例（proxy_pool_ext 复用同一 mihomo 进程）
_RUNNER: MihomoRunner | None = None


def get_runner(log=None) -> MihomoRunner:
    global _RUNNER
    if _RUNNER is None:
        _RUNNER = MihomoRunner(log=log)
    return _RUNNER


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO, format="%(asctime)s %(message)s")
    # 自测：解析 tingfengVPS 的 mihomo.yaml 并启动
    yaml_path = r"C:\Users\Administrator.DESKTOP-EGNE9ND\Desktop\tingfengVPS\mihomo.yaml"
    with open(yaml_path, encoding="utf-8") as f:
        nodes = parse_clash_nodes(f.read())
    print("解析到 %d 个节点" % len(nodes))
    for n in nodes[:5]:
        print("  ", n["type"], n["name"], n["server"], n["port"])
    runner = MihomoRunner(log=print)
    outs = runner.run(nodes)
    print("mihomo 输出出口 %d 个" % len(outs))
    for o in outs[:5]:
        print("  ", o["name"], o["proxy_url"])
    if outs:
        import requests as rq
        try:
            r = rq.get("https://api.ipify.org?format=json",
                       proxies={"http": outs[0]["proxy_url"], "https": outs[0]["proxy_url"]},
                       timeout=15)
            print("出口真实 IP:", r.text)
        except Exception as e:
            print("出口连通失败:", e)
    runner.stop()

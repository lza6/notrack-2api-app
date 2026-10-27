# -*- coding: utf-8 -*-
"""proxy_sources.py -- 免费代理源抓取器（DuckFlow 出口池扩展）

三个来源，统一产出 {"name": ..., "proxy": "http://ip:port" | "socks5://ip:port"} 列表：

  1. free_http  -- 13 个纯 API 免费代理源（移植自 lza6/Aggregate-to-2api
                   api/free_proxy_fetcher.py，简化为同步 requests 版）
  2. mihomo     -- 本地 mihomo.yaml / Clash 订阅（tingfengVPS 格式），经
                   mihomo_runner 转成本地 socks5 listeners 后注入
  3. sub        -- v2ray/Clash 订阅链接（lza6/free-VPN README 汇总源），
                   拉下来交给 mihomo_runner 解析运行

安全红线（与上游一致）：免费代理是明文第三方中转，只用于 duck.ai 匿名
chat 转发（无凭据、无个人数据），不承载面板密码/API Key 等敏感流量。
"""
from __future__ import annotations

import ipaddress
import logging
import re
import time

import requests

log = logging.getLogger("proxy_sources")

FETCH_TIMEOUT = 15.0
_SCHEME_PREFIX_RE = re.compile(r"^(?:https?|socks[45]?|socks)://", re.IGNORECASE)

# ── 免费源 1：13 个纯 API 源（Aggregate-to-2api 同款） ──────────────────
FREE_PROXY_SOURCES = [
    ("proxyscrape-http", "https://api.proxyscrape.com/v3/free-proxy-list/get?request=displayproxies&protocol=http&proxy_format=ipport&format=text&timeout=5000&country=all", "ipport"),
    ("proxyscrape-ssl", "https://api.proxyscrape.com/v3/free-proxy-list/get?request=displayproxies&protocol=https&proxy_format=ipport&format=text&timeout=5000&country=all", "ipport"),
    ("proxyscrape-socks4", "https://api.proxyscrape.com/v3/free-proxy-list/get?request=displayproxies&protocol=socks4&proxy_format=ipport&format=text&timeout=5000&country=all", "ipport"),
    ("proxyscrape-socks5", "https://api.proxyscrape.com/v3/free-proxy-list/get?request=displayproxies&protocol=socks5&proxy_format=ipport&format=text&timeout=5000&country=all", "ipport"),
    ("proxyscrape-v2", "https://api.proxyscrape.com/v2/?request=getproxies&protocol=http&timeout=10000&country=all&ssl=all&anonymity=all", "ipport"),
    ("geonode", "https://proxylist.geonode.com/api/proxy-list?limit=500&page=1&sort_by=lastChecked&sort_type=desc&protocols=http", "geonode"),
    ("proxifly", "https://raw.githubusercontent.com/proxifly/free-proxy-list/main/proxies/all/data.txt", "ipport"),
    ("thespeedx-http", "https://raw.githubusercontent.com/TheSpeedX/PROXY-List/master/http.txt", "ipport"),
    ("ercindedeoglu-http", "https://raw.githubusercontent.com/ErcinDedeoglu/proxies/main/proxies/http.txt", "ipport"),
    ("proxy4parsing-http", "https://raw.githubusercontent.com/proxy4parsing/proxy-list/main/http.txt", "ipport"),
    ("monosans-http", "https://raw.githubusercontent.com/monosans/proxy-list/main/proxies/http.txt", "ipport"),
    ("thespeedx-socks5", "https://raw.githubusercontent.com/TheSpeedX/PROXY-List/master/socks5.txt", "ipport"),
    ("thespeedx-socks4", "https://raw.githubusercontent.com/TheSpeedX/PROXY-List/master/socks4.txt", "ipport"),
]

# ── 免费源 2：v2ray/Clash 订阅（lza6/free-VPN + lza6/tingfengVPS README 汇总） ──
#   格式均为 Clash/mihomo yaml 或 base64 v2ray 订阅，交给 mihomo_runner 解析。
SUB_SOURCES = [
    "https://raw.githubusercontent.com/roosterkid/openproxylist/refs/heads/main/V2RAY_RAW.txt",
    "https://raw.githubusercontent.com/pawdroid/Free-servers/main/sub",
    "https://raw.githubusercontent.com/mfuu/v2ray/master/v2ray",
    "https://raw.githubusercontent.com/ermaozi/get_subscribe/main/subscribe/v2ray.txt",
    "https://raw.githubusercontent.com/mahdibland/V2RayAggregator/master/Eternity",
    "https://raw.githubusercontent.com/peasoft/NoMoreWalls/master/list.txt",
    "https://raw.githubusercontent.com/ssrsub/ssr/master/v2ray",
    "https://raw.githubusercontent.com/snakem982/proxypool/main/source/v2ray-2.txt",
    # 高星代理池仓库（GitHub 搜索精选，2026-10-28）
    "https://raw.githubusercontent.com/VPN-Subcription-Links/ClashX-V2Ray-TopFreeProxy/main/combine/clash.config.yaml",
    "https://raw.githubusercontent.com/Au1rxx/free-vpn-subscriptions/main/output/all-verified/clash-0001.yaml",
    "https://raw.githubusercontent.com/sunmiao4458/free-proxy-airport/main/output/clash.yaml",
]


def _is_valid_public_ip(host: str) -> bool:
    """仅保留公网 IP；hostname/内网/回环一律拒绝（防恶意源注入内网地址）。"""
    try:
        addr = ipaddress.ip_address(host)
    except ValueError:
        return False
    return not (addr.is_private or addr.is_loopback or addr.is_link_local
                or addr.is_reserved or addr.is_multicast or addr.is_unspecified)


def parse_ipport_text(text: str, scheme: str = "http") -> list[str]:
    """ip:port 文本行 -> 规范化代理 URL 列表（去重、仅公网）。"""
    seen: set[str] = set()
    out: list[str] = []
    for line in (text or "").splitlines():
        line = line.strip()
        if not line or line.startswith("#"):
            continue
        line = _SCHEME_PREFIX_RE.sub("", line, count=1)
        if line.count(":") != 1:
            continue
        host, port = line.rsplit(":", 1)
        if not host or not port.isdigit():
            continue
        if not _is_valid_public_ip(host):
            continue
        url = "%s://%s:%s" % (scheme, host, port)
        if url not in seen:
            seen.add(url)
            out.append(url)
    return out


def parse_geonode_json(text: str) -> list[str]:
    """geonode JSON -> 代理 URL 列表。"""
    import json
    try:
        data = json.loads(text or "")
    except (ValueError, TypeError):
        return []
    items = data.get("data") if isinstance(data, dict) else None
    if not isinstance(items, list):
        return []
    seen: set[str] = set()
    out: list[str] = []
    for item in items:
        if not isinstance(item, dict):
            continue
        ip, port = str(item.get("ip") or "").strip(), str(item.get("port") or "").strip()
        if ip and port.isdigit() and _is_valid_public_ip(ip):
            url = "http://%s:%s" % (ip, port)
            if url not in seen:
                seen.add(url)
                out.append(url)
    return out


def fetch_free_http_proxies(session: requests.Session | None = None) -> list[str]:
    """抓全部 13 个免费源，返回去重后的 http/socks 代理 URL 列表。

    socks5 源保留 socks5:// scheme —— Chrome --proxy-server 与 mihomo
    listeners 都直接支持，无需转换。
    """
    s = session or requests.Session()
    seen: set[str] = set()
    out: list[str] = []
    ok_sources = 0
    for name, url, fmt in FREE_PROXY_SOURCES:
        try:
            r = s.get(url, timeout=FETCH_TIMEOUT)
            if r.status_code != 200:
                continue
            scheme = "socks5" if "socks5" in name else ("socks4" if "socks4" in name else "http")
            urls = (parse_geonode_json(r.text) if fmt == "geonode"
                    else parse_ipport_text(r.text, scheme))
            if urls:
                ok_sources += 1
                for u in urls:
                    if u not in seen:
                        seen.add(u)
                        out.append(u)
        except Exception as e:
            log.debug("免费代理源 %s 抓取失败: %s", name, e)
    log.info("免费代理抓取: %d/%d 源成功, 共 %d 个候选", ok_sources, len(FREE_PROXY_SOURCES), len(out))
    return out


def fetch_sub_texts(session: requests.Session | None = None) -> list[str]:
    """拉取所有订阅源原文（Clash yaml 或 v2ray base64/URI 列表）。"""
    s = session or requests.Session()
    texts = []
    for url in SUB_SOURCES:
        try:
            r = s.get(url, timeout=FETCH_TIMEOUT)
            if r.status_code == 200 and r.text.strip():
                texts.append(r.text)
        except Exception as e:
            log.debug("订阅源 %s 抓取失败: %s", url, e)
    log.info("订阅源抓取: %d/%d 成功", len(texts), len(SUB_SOURCES))
    return texts


# ── TCP 预检（Aggregate-to-2api 同款，改线程池同步版） ───────────────────
import socket
from concurrent.futures import ThreadPoolExecutor

PRECHECK_TIMEOUT = 3.0
PRECHECK_WORKERS = 50
PRECHECK_LIMIT = 3000


def _precheck_one(url: str) -> bool:
    m = re.match(r"^(?:\w+://)?([^:]+):(\d+)$", url)
    if not m:
        return False
    host, port = m.group(1), int(m.group(2))
    try:
        sock = socket.create_connection((host, port), timeout=PRECHECK_TIMEOUT)
        sock.close()
        return True
    except OSError:
        return False


def precheck(urls: list[str], limit: int = PRECHECK_LIMIT) -> list[str]:
    """TCP 连通性并发预检（快筛，不验证真实转发）。"""
    cand = urls[:limit]
    with ThreadPoolExecutor(max_workers=PRECHECK_WORKERS) as ex:
        results = list(ex.map(_precheck_one, cand))
    healthy = [u for u, ok in zip(cand, results) if ok]
    log.info("TCP 预检: %d/%d 通过", len(healthy), len(cand))
    return healthy


# ── duck.ai L7 真实验证 ────────────────────────────────────────────────
#   只有真实请求能证明出口能过 418 ERR_BN_LIMIT 信誉层。
#   判定：GET https://duck.ai/ 经代理返回 < 400 => 出口可用。
#        418/403 => IP 信誉层拦截，标记 rejected。
L7_TIMEOUT = 12.0
L7_WORKERS = 20
L7_PROBE_URL = "https://duck.ai/"
_UA = ("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 "
       "(KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36")


def _l7_probe_one(session: requests.Session, url: str) -> tuple[str, int]:
    """返回 (proxy_url, http_status)。异常时 status=-1。"""
    try:
        r = session.get(L7_PROBE_URL, proxies={"http": url, "https": url},
                        timeout=L7_TIMEOUT, headers={"User-Agent": _UA}, allow_redirects=True)
        return url, r.status_code
    except Exception:
        return url, -1


def l7_validate(urls: list[str], workers: int = L7_WORKERS) -> tuple[list[str], dict]:
    """真实访问 duck.ai 验证。返回 (通过列表, 统计)。

    统计: {"tested": n, "ok": n, "rate_limited": n(418/403), "dead": n}
    """
    stats = {"tested": 0, "ok": 0, "rate_limited": 0, "dead": 0}
    ok_list: list[str] = []
    session = requests.Session()
    session.headers.update({"User-Agent": _UA})
    with ThreadPoolExecutor(max_workers=workers) as ex:
        for url, status in ex.map(lambda u: _l7_probe_one(session, u), urls):
            stats["tested"] += 1
            if 200 <= status < 400:
                ok_list.append(url)
                stats["ok"] += 1
            elif status in (418, 403, 429):
                stats["rate_limited"] += 1
            else:
                stats["dead"] += 1
    log.info("duck.ai L7 验证: ok=%(ok)d rate_limited=%(rate_limited)d dead=%(dead)d / %(tested)d" % stats)
    return ok_list, stats


def gather_candidates(fetch_subs: bool = True, mihomo_yaml: str | None = None) -> dict:
    """汇总所有源的候选代理。返回 {"free_http": [...], "sub": [...]}。

    sub 的解析依赖 mihomo_runner（Clash yaml / v2ray URI -> 本地 socks5 端口），
    这里只负责拉原文与静态 yaml 文件解析；真正的转换在 mihomo_runner 侧做。
    """
    out: dict[str, list[str]] = {"free_http": [], "sub": []}
    try:
        out["free_http"] = fetch_free_http_proxies()
    except Exception as e:
        log.warning("free_http 抓取失败: %s", e)
    if fetch_subs:
        try:
            import mihomo_runner
            texts = fetch_sub_texts()
            if mihomo_yaml:
                try:
                    with open(mihomo_yaml, encoding="utf-8") as f:
                        texts.append(f.read())
                except OSError:
                    pass
            nodes = mihomo_runner.parse_clash_nodes("".join(texts))
            out["sub"] = [n["name"] for n in nodes]  # mihomo 节点名（转换后变 socks5://127.0.0.1:port）
        except Exception as e:
            log.warning("sub 解析失败: %s", e)
    return out


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO, format="%(asctime)s %(name)s %(message)s")
    t0 = time.time()
    cands = fetch_free_http_proxies()
    print("候选 %d 个 (%.1fs)" % (len(cands), time.time() - t0))
    healthy = precheck(cands, limit=500)
    print("TCP 通过 %d 个 (%.1fs)" % (len(healthy), time.time() - t0))
    ok, stats = l7_validate(healthy[:200])
    print("duck.ai 可用 %d 个 (%.1fs) stats=%s" % (len(ok), time.time() - t0, stats))
    for u in ok[:10]:
        print("  ", u)

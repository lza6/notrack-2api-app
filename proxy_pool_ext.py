# -*- coding: utf-8 -*-
"""proxy_pool_ext.py -- DuckFlow 出口池自动扩展（代理源聚合 + 验证 + 注册）

数据流：
  proxy_sources (13 免费源 + mihomo 订阅节点)
    -> mihomo_runner (v2ray/ss/vless -> 本地 socks5 listeners)
    -> TCP 预检（快筛）
    -> duck.ai L7 验证（真实 requests 过 418 信誉层）
    -> duck_upstream.POOL.register_exit()（每个可用出口 = 一个 Chrome + 代理）

环境变量：
  DUCK_AUTO_PROXY=1        开启自动出口扩展（默认关，零行为变化）
  DUCK_PROXY_CHAIN=...     本机出国链式代理（mihomo 连节点服务器用）
  DUCK_AUTO_PROXY_MAX=20   自动出口上限（Chrome 实例数上限）
  DUCK_AUTO_PROXY_INTERVAL=30 分钟刷新周期
"""
from __future__ import annotations

import json
import logging
import os
import threading
import time

log = logging.getLogger("proxy_pool_ext")

STATE_PATH = os.path.join(os.path.dirname(os.path.abspath(__file__)),
                          "tools", "mihomo", "auto_exits_state.json")


class AutoProxyManager:
    """后台线程：周期 抓取->验证->注册/摘除 出口。"""

    def __init__(self, pool, log=None):
        self.pool = pool          # duck_client.DuckClientPool
        self.log = log or (lambda m: None)
        self._thread: threading.Thread | None = None
        self._stop = threading.Event()
        self.state = {"exits": {}, "last_run": 0, "last_stats": {}}
        self._load_state()

    # ---- 状态持久化（面板可查） ----
    def _load_state(self):
        try:
            with open(STATE_PATH, encoding="utf-8") as f:
                self.state = json.load(f)
        except (OSError, ValueError):
            pass

    def _save_state(self):
        try:
            os.makedirs(os.path.dirname(STATE_PATH), exist_ok=True)
            with open(STATE_PATH, "w", encoding="utf-8") as f:
                json.dump(self.state, f, ensure_ascii=False, indent=1)
        except OSError:
            pass

    def snapshot(self) -> dict:
        return {
            "enabled": self._thread is not None,
            "last_run": self.state.get("last_run", 0),
            "stats": self.state.get("last_stats", {}),
            "exits": [
                {"name": n, "proxy": u, "ok": v.get("ok"), "checked_at": v.get("checked_at")}
                for n, u, v in
                ((n, v.get("proxy"), v) for n, v in self.state.get("exits", {}).items())
            ],
        }

    # ---- 主循环 ----
    def start(self):
        if self._thread is not None:
            return
        self._thread = threading.Thread(target=self._loop, daemon=True,
                                        name="duck-auto-proxy")
        self._thread.start()
        self.log("auto proxy manager started")

    def stop(self):
        self._stop.set()
        try:
            import mihomo_runner
            mihomo_runner._RUNNER and mihomo_runner._RUNNER.stop()
        except Exception:
            pass

    def _loop(self):
        interval = int(os.environ.get("DUCK_AUTO_PROXY_INTERVAL", "30")) * 60
        # 启动先跑一轮（后台，不阻塞主服务）
        while not self._stop.is_set():
            try:
                self.run_once()
            except Exception as e:
                self.log("auto proxy run error: %s" % e)
            self._stop.wait(interval)

    def run_once(self, max_exits: int | None = None):
        """一轮完整流程。返回统计 dict。"""
        import proxy_sources
        import mihomo_runner

        max_exits = max_exits or int(os.environ.get("DUCK_AUTO_PROXY_MAX", "50"))
        t0 = time.time()
        stats = {"free_http": 0, "sub_nodes": 0, "tcp_ok": 0, "l7_ok": 0, "registered": 0}

        # 1. 免费源 HTTP 代理（无需 mihomo，直接可用）
        free_urls = []
        try:
            free_urls = proxy_sources.fetch_free_http_proxies()
            stats["free_http"] = len(free_urls)
        except Exception as e:
            self.log("free_http fetch failed: %s" % e)

        # 2. 订阅节点 -> mihomo socks5 端口
        mihomo_urls = []
        try:
            texts = proxy_sources.fetch_sub_texts()
            # 本地 mihomo.yaml（tingfengVPS 之类）若存在也并入
            local_yaml = os.path.join(os.path.dirname(STATE_PATH), "..", "..", "..",
                                      "tingfengVPS", "mihomo.yaml")
            nodes = mihomo_runner.parse_clash_nodes(*texts)
            if nodes:
                runner = mihomo_runner.get_runner(self.log)
                outs = runner.run(nodes, max_nodes=50)
                mihomo_urls = [o["proxy_url"] for o in outs]
                stats["sub_nodes"] = len(mihomo_urls)
        except Exception as e:
            self.log("sub/mihomo failed: %s" % e)

        candidates = free_urls + mihomo_urls
        if not candidates:
            self.state["last_stats"] = stats
            self._save_state()
            return stats

        # 3. TCP 预检（快筛）
        try:
            healthy = proxy_sources.precheck(candidates)
            stats["tcp_ok"] = len(healthy)
        except Exception as e:
            self.log("precheck failed: %s" % e)
            healthy = candidates[:100]

        # 4. duck.ai L7 验证（真实信誉层测试）
        #    mihomo 出口（socks5://127.0.0.1）优先验证 —— 质量通常更高
        mihomo_first = [u for u in healthy if u.startswith("socks5://127.0.0.1")]
        others = [u for u in healthy if not u.startswith("socks5://127.0.0.1")]
        l7_ok, l7_stats = proxy_sources.l7_validate((mihomo_first + others)[:300])
        stats["l7_ok"] = len(l7_ok)

        # 4.5 直连代理文件（working_proxies 格式，免 mihomo）也纳入候选
        direct_file = os.environ.get("DUCK_PROXY_FILE", "").strip()
        if direct_file:
            try:
                with open(direct_file, encoding="utf-8") as f:
                    arr = json.load(f)
                if isinstance(arr, list):
                    extra = []
                    for item in arr:
                        u = item.get("proxy") if isinstance(item, dict) else item
                        if isinstance(u, str) and "://" in u and u not in candidates:
                            extra.append(u)
                    if extra:
                        d_ok, _ = proxy_sources.l7_validate(extra[:200])
                        l7_ok = l7_ok + d_ok
                        stats["direct_file_ok"] = len(d_ok)
            except (OSError, ValueError):
                pass

        # 5. 注册进出出口池（懒 spawn，不超过 max_exits）
        for url in l7_ok[:max_exits]:
            name = ("auto-mihomo-" + url.rsplit(":", 1)[1]) if url.startswith("socks5://127.0.0.1") \
                else "auto-" + url.split("//", 1)[1].replace(":", "-")
            try:
                self.pool.register_exit(name, proxy=url)
                self.state["exits"][name] = {"proxy": url, "ok": True,
                                             "checked_at": time.time()}
                stats["registered"] += 1
            except Exception as e:
                self.log("register %s failed: %s" % (name, e))

        stats["elapsed_s"] = round(time.time() - t0, 1)
        self.state["last_run"] = time.time()
        self.state["last_stats"] = stats
        self._save_state()
        self.log("auto proxy done: %s" % stats)
        return stats


if __name__ == "__main__":
    logging.basicConfig(level=logging.INFO, format="%(asctime)s %(message)s")
    import duck_client
    pool = duck_client.DuckClientPool(log=print)
    mgr = AutoProxyManager(pool, log=print)
    mgr.run_once()

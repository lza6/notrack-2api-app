# -*- coding: utf-8 -*-
"""duck_client.py -- Duck.ai (DuckChat) 上游客户端（CDP 真浏览器层）

为什么必须真浏览器（2026-10-26/27 实测结论）：
  1. x-vqd-hash-1 是"挑战-应答"机制：/duckchat/v1/status 响应头每次返回一段
     base64 的混淆 JS（~5-7KB，每请求不同），必须在浏览器环境执行后组装应答。
  2. 纯 Node shim 能执行挑战 JS，但应答被服务端识别（418 ERR_CHALLENGE）——
     挑战内部采集 webdriver / 字体测量 / iframe Error.stack / window 污染等指纹。
  3. headless Chrome 里官方 UI 自己的请求也被 418 ERR_BN_LIMIT 拦——出口 IP
     信誉层封锁。因此每个出口（出口池条目）绑定一个独立 Chrome 实例 + 独立代理，
     代理建议住宅 IP。

架构：
  DuckExit          一个"出口"= 一个 Chrome 用户目录 + 一个代理 + 一个常驻页面。
                    对应上游池里的一个"账号"位（复用 workbuddy-hub 的调度语义）。
  DuckClientPool    出口池：加权轮询、忙时排队、代理绑定、健康检查。
  每次对话：
      POST /duckchat/v1/status (x-vqd-accept: 1)  -> 响应头挑战 JS
      页面内 fetch 执行挑战 + 组装应答（与官方前端 35488 模块一致）
      POST /duckchat/v1/chat (SSE)                -> 转发增量文本
"""
import base64
import json
import os
import queue
import subprocess
import threading
import time
import urllib.request
import uuid

CHROME_CANDIDATES = [
    r"C:\Program Files\Google\Chrome\Application\chrome.exe",
    r"C:\Program Files (x86)\Google\Chrome\Application\chrome.exe",
    "/usr/bin/google-chrome",
    "/usr/bin/chromium-browser",
    "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome",
]

STATUS_URL = "https://duck.ai/duckchat/v1/status"
CHAT_URL = "https://duck.ai/duckchat/v1/chat"

# 实测可用模型（2026-10-26 前端模块提取 + 抓包验证 gpt-6-luna）
DUCK_MODELS = [
    {"id": "gpt-6-luna", "name": "GPT-6 Luna", "default": True},
    {"id": "gpt-5.4-mini", "name": "GPT-5.4 Mini"},
    {"id": "claude-haiku-4-5", "name": "Claude Haiku 4.5"},
    {"id": "mistral-small-2603", "name": "Mistral Small"},
    {"id": "tinfoil/gpt-oss-120b", "name": "gpt-oss 120b"},
    {"id": "tinfoil/gemma4-31b", "name": "Gemma 4 31b"},
]
DUCK_MODEL_IDS = frozenset(m["id"] for m in DUCK_MODELS)

JS_BRIDGE = r"""
(async () => {
  // 1. status 取挑战
  const r = await fetch('https://duck.ai/duckchat/v1/status', {
    headers: {'Cache-Control': 'no-store', 'x-vqd-accept': '1'},
    credentials: 'include'});
  const vqd64 = r.headers.get('x-vqd-hash-1');
  if (!vqd64) return JSON.stringify({ok:false, stage:'status', status:r.status,
    body:(await r.text()).slice(0,300)});
  // 2. 页面内执行挑战（真浏览器环境，与官方前端一致）
  let raw;
  try { raw = await eval(atob(vqd64)); }
  catch(e) { return JSON.stringify({ok:false, stage:'challenge', err:String(e&&e.message||e)}); }
  // 3. 前端后处理（entry.duckai 模块 35488 逻辑）
  const out = {...raw};
  out.client_hashes = await Promise.all(raw.client_hashes.map(async e => {
    const d = await crypto.subtle.digest('SHA-256', new TextEncoder().encode(e));
    return btoa(String.fromCharCode(...new Uint8Array(d)));}));
  out.meta = {...(raw.meta||{}), origin:'https://duck.ai',
    stack: (new Error().stack||'').split('\n').slice(0,5).join('\n'),
    duration: '4'};
  return JSON.stringify({ok:true, vqd: btoa(JSON.stringify(out))});
})()
"""

CHAT_BRIDGE = r"""
(async (argsJson) => {
  const args = JSON.parse(argsJson);
  const controller = new AbortController();
  window.__duckAbort = controller;
  try {
    const r = await fetch('https://duck.ai/duckchat/v1/chat', {
      method: 'POST', signal: controller.signal, credentials: 'include',
      headers: {
        'Content-Type': 'application/json',
        'Accept': 'text/event-stream',
        'x-vqd-hash-1': args.vqd,
        'x-ddg-journey-id': args.journey,
        'x-duckai-consent-purposes': 'user-location,image-generation,web-search',
        'x-duckai-continuation': 'resubmit-context',
        'x-duckai-response-id': args.responseId,
        'x-duckai-tool-approval': 'web-search',
        'x-fe-version': `${window.__DDG_BE_VERSION__||'dev'}-${window.__DDG_FE_CHAT_HASH__||'hash'}`,
        'x-fe-signals': args.signals,
      },
      body: JSON.stringify(args.body)});
    if (!r.ok) {
      return JSON.stringify({ok:false, status:r.status, body:(await r.text()).slice(0,400)});
    }
    const reader = r.body.getReader();
    const dec = new TextDecoder();
    let buf = '';
    for (;;) {
      const {done, value} = await reader.read();
      if (done) break;
      buf += dec.decode(value, {stream:true});
      let idx;
      while ((idx = buf.indexOf('\n\n')) >= 0) {
        const frame = buf.slice(0, idx); buf = buf.slice(idx+2);
        for (const line of frame.split('\n')) {
          if (line.startsWith('data: ')) {
            // 通过 console.log 通道把增量交给 CDP Runtime.consoleAPICalled
            console.log('__DUCK_FRAME__' + line.slice(6));
          }
        }
      }
    }
    return JSON.stringify({ok:true, done:true});
  } catch(e) {
    return JSON.stringify({ok:false, stage:'stream', err:String(e&&e.message||e)});
  }
})('__ARGS__')
"""


def find_chrome():
    env = os.environ.get("DUCK_CHROME_PATH")
    if env and os.path.exists(env):
        return env
    for p in CHROME_CANDIDATES:
        if os.path.exists(p):
            return p
    return None


def _ws_connect(url, origin, timeout=120):
    import websocket  # websocket-client
    return websocket.create_connection(url, timeout=timeout, origin=origin)


class CdpPage:
    """一个最小 CDP 页面控制器：导航 duck.ai + evaluate + console 捕获。"""

    def __init__(self, chrome_path, user_data_dir, port, proxy=None, headless=True, log=None):
        self.log = log or (lambda m: None)
        self.chrome_path = chrome_path
        self.user_data_dir = user_data_dir
        self.port = port
        self.proc = None
        self.ws = None
        self._id = 0
        self._lock = threading.RLock()
        self._frames = queue.Queue()
        os.makedirs(user_data_dir, exist_ok=True)
        args = [
            chrome_path,
            f"--remote-debugging-port={port}",
            "--remote-allow-origins=*",
            f"--user-data-dir={user_data_dir}",
            "--no-first-run", "--no-default-browser-check",
            "--disable-background-timer-throttling",
            "--window-size=1280,900",
            "about:blank",
        ]
        if headless:
            args.insert(1, "--headless=new")
        if proxy:
            args.insert(1, f"--proxy-server={proxy}")
        self.proc = subprocess.Popen(args, stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        if not self._wait_debugger(30):
            raise RuntimeError(f"chrome debugger not up on port {port}")

    def _wait_debugger(self, timeout):
        deadline = time.time() + timeout
        while time.time() < deadline:
            if self.proc.poll() is not None:
                return False
            try:
                urllib.request.urlopen(f"http://127.0.0.1:{self.port}/json/version", timeout=2).read()
                return True
            except Exception:
                time.sleep(0.5)
        return False

    def _connect_page(self):
        tabs = json.loads(urllib.request.urlopen(
            f"http://127.0.0.1:{self.port}/json", timeout=5).read())
        page = next((t for t in tabs if t.get("type") == "page"), None)
        if not page:
            raise RuntimeError("no CDP page target")
        self.ws = _ws_connect(page["webSocketDebuggerUrl"], "http://127.0.0.1:%d" % self.port)
        self._send("Page.enable")
        self._send("Runtime.enable")

    def _send(self, method, params=None):
        with self._lock:
            self._id += 1
            i = self._id
            self.ws.send(json.dumps({"id": i, "method": method, "params": params or {}}))
            deadline = time.time() + 30
            while time.time() < deadline:
                m = json.loads(self.ws.recv())
                if m.get("id") == i:
                    return m
            raise RuntimeError("cdp recv timeout")

    def ensure_duck_page(self):
        if self.ws is None:
            self._connect_page()
        st = self._send("Runtime.evaluate", {"expression": "location.href", "returnByValue": True})
        href = ((st.get("result") or {}).get("result") or {}).get("value") or ""
        if "duck.ai" not in href:
            self._send("Page.navigate", {"url": "https://duck.ai/"})
            time.sleep(5)
        # 探活：页面能执行 JS
        st = self._send("Runtime.evaluate", {"expression": "1+1", "returnByValue": True})
        if ((st.get("result") or {}).get("result") or {}).get("value") != 2:
            raise RuntimeError("cdp page not responsive")

    def get_vqd(self):
        """status + 页面内执行挑战 -> b64 应答。"""
        self.ensure_duck_page()
        res = self._send("Runtime.evaluate", {"expression": JS_BRIDGE,
                                              "awaitPromise": True, "returnByValue": True})
        val = ((res.get("result") or {}).get("result") or {}).get("value")
        if not val:
            raise RuntimeError("challenge evaluate failed: %s" % json.dumps(res)[:300])
        data = json.loads(val)
        if not data.get("ok"):
            raise RuntimeError("challenge failed at %s: %s" % (data.get("stage"), data))
        return data["vqd"]

    def chat_stream(self, vqd, body, on_frame):
        """页面内 fetch chat，console 通道回传 SSE 帧。阻塞到流结束。"""
        journey = uuid.uuid4().hex
        response_id = str(uuid.uuid4())
        signals = base64.b64encode(json.dumps({
            "start": int(time.time() * 1000) - 6000,
            "events": [{"name": "startNewChat_free", "delta": 5000}],
            "end": 5800}).encode()).decode()
        script = CHAT_BRIDGE.replace("__ARGS__", json.dumps({
            "vqd": vqd, "journey": journey, "responseId": response_id,
            "signals": signals, "body": body}).replace("\\", "\\\\"))
        # 先挂 console 收集器线程
        stop = threading.Event()

        def pump():
            self.ws.settimeout(0.5)
            while not stop.is_set():
                try:
                    m = json.loads(self.ws.recv())
                except Exception:
                    continue
                if m.get("method") == "Runtime.consoleAPICalled":
                    for a in (m["params"].get("args") or []):
                        v = a.get("value") or ""
                        if isinstance(v, str) and v.startswith("__DUCK_FRAME__"):
                            self._frames.put(v[len("__DUCK_FRAME__"):])
            self.ws.settimeout(30)

        t = threading.Thread(target=pump, daemon=True)
        t.start()
        try:
            res = self._send_long("Runtime.evaluate",
                                  {"expression": script, "awaitPromise": True, "returnByValue": True},
                                  timeout=600)
        finally:
            stop.set()
            t.join(timeout=2)
            # 排空
            while not self._frames.empty():
                on_frame(self._frames.get())
        val = ((res.get("result") or {}).get("result") or {}).get("value")
        # 排空剩余帧
        while not self._frames.empty():
            on_frame(self._frames.get())
        if not val:
            raise RuntimeError("chat evaluate failed: %s" % json.dumps(res)[:300])
        data = json.loads(val)
        if not data.get("ok"):
            raise RuntimeError("chat failed: %s" % json.dumps(data)[:400])

    def _send_long(self, method, params, timeout=600):
        with self._lock:
            self._id += 1
            i = self._id
            self.ws.send(json.dumps({"id": i, "method": method, "params": params or {}}))
            deadline = time.time() + timeout
            while time.time() < deadline:
                m = json.loads(self.ws.recv())
                if m.get("id") == i:
                    return m
            raise RuntimeError("cdp long recv timeout")

    def close(self):
        try:
            if self.ws:
                self.ws.close()
        except Exception:
            pass
        if self.proc and self.proc.poll() is None:
            self.proc.terminate()


class DuckExit:
    """一个出口 = 独立 Chrome + 可选代理。thread-safe 的单会话客户端。"""

    def __init__(self, name, proxy=None, headless=True, base_port=9400, log=None):
        self.name = name
        self.proxy = proxy
        self.log = log or (lambda m: None)
        chrome = find_chrome()
        if not chrome:
            raise RuntimeError("Chrome not found; set DUCK_CHROME_PATH")
        port = base_port + (hash(name) % 500)
        self.page = CdpPage(chrome, os.path.join(
            os.path.expanduser("~"), ".duck2api", "profiles", name),
            port=port, proxy=proxy, headless=headless, log=log)
        self.busy = False
        self.last_ok = 0.0
        self.last_err = ""

    def get_vqd(self):
        return self.page.get_vqd()

    def chat_stream(self, body, on_frame):
        vqd = self.page.get_vqd()
        self.page.chat_stream(vqd, body, on_frame)
        self.last_ok = time.time()

    def close(self):
        self.page.close()


class DuckClientPool:
    """出口池：按 name 复用；请求时独占（每 Chrome 同时只跑一条流）。"""

    def __init__(self, log=None, headless=True, base_port=9400):
        self.log = log or (lambda m: None)
        self.headless = headless
        self.base_port = base_port
        self._exits = {}
        self._lock = threading.RLock()
        self._cond = threading.Condition(self._lock)
        self._rr = 0

    # ---- 出口管理（面板可调用）----
    def list_exits(self):
        with self._lock:
            return [{"name": n, "proxy": e.proxy, "busy": e.busy,
                     "last_ok": e.last_ok, "last_err": e.last_err,
                     "alive": e.page.proc.poll() is None if e.page.proc else False}
                    for n, e in self._exits.items()]

    def upsert_exit(self, name, proxy=None):
        with self._lock:
            e = self._exits.get(name)
            if e and e.proxy == proxy and (e.page.proc.poll() is None):
                return e
            if e:
                try: e.close()
                except Exception: pass
            e = DuckExit(name, proxy=proxy, headless=self.headless,
                         base_port=self.base_port, log=self.log)
            self._exits[name] = e
            return e

    def remove_exit(self, name):
        with self._lock:
            e = self._exits.pop(name, None)
            if e:
                try: e.close()
                except Exception: pass

    def _pick(self, preferred=None):
        """选一个空闲出口：优先指定名，否则轮询空闲者。"""
        with self._cond:
            for _ in range(300):
                if preferred and preferred in self._exits:
                    e = self._exits[preferred]
                    if not e.busy and e.page.proc.poll() is None:
                        e.busy = True
                        return e
                alive = [e for e in self._exits.values()
                         if not e.busy and e.page.proc.poll() is None]
                if alive:
                    e = alive[self._rr % len(alive)]
                    self._rr += 1
                    e.busy = True
                    return e
                self._cond.wait(1.0)
        return None

    def chat(self, body, on_frame, exit_name=None, timeout=600):
        e = self._pick(exit_name)
        if e is None:
            raise RuntimeError("no idle duck exit available")
        try:
            e.chat_stream(body, on_frame)
        except Exception as exc:
            e.last_err = str(exc)[:300]
            raise
        finally:
            with self._cond:
                e.busy = False
                self._cond.notify_all()

    def shutdown(self):
        with self._lock:
            for e in list(self._exits.values()):
                try: e.close()
                except Exception: pass
            self._exits.clear()

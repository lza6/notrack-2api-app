#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""DuckFlow 网关 —— duck.ai -> OpenAI 兼容 API（精简版，零 workbuddy 残留）

只做四件事：
  1. /v1/chat/completions + /v1/models + /v1/balance （OpenAI 兼容，流式/非流式）
  2. 多 API Key 管理（面板可增删启停，可限定模型）
  3. Duck 出口池（Chrome CDP + 可选代理，多住宅 IP）
  4. 用量流水（SQLite）+ Web 面板（单页，无框架）

启动：  python server.py [--port 8788] [--host 127.0.0.1]
数据：  data/keys.json   data/usage.sqlite3   ~/.duck2api/profiles/<exit>
"""
import argparse
import base64
import hashlib
import json
import os
import queue
import secrets
import sqlite3
import threading
import time
import urllib.error
from http.server import BaseHTTPRequestHandler, ThreadingHTTPServer

import duck_client
import duck_upstream

ROOT = os.path.dirname(os.path.abspath(__file__))
DATA_DIR = os.path.join(ROOT, "data")
DB_PATH = os.path.join(DATA_DIR, "usage.sqlite3")
KEYS_PATH = os.path.join(DATA_DIR, "keys.json")
PANEL_HTML = os.path.join(ROOT, "dashboard.html")
LOG = lambda msg, **kw: print("[duckflow] " + str(msg), flush=True)

os.makedirs(DATA_DIR, exist_ok=True)


# ---------------------------------------------------------------- API Keys
class KeyStore:
    """多 API Key：name/key/enabled/models(通配)/created。并发安全，JSON 落盘。"""

    def __init__(self, path):
        self.path = path
        self.lock = threading.RLock()
        self.keys = []
        self._load()

    def _load(self):
        try:
            with open(self.path, encoding="utf-8") as f:
                self.keys = json.load(f)
        except Exception:
            self.keys = []

    def _save(self):
        tmp = self.path + ".tmp"
        with open(tmp, "w", encoding="utf-8") as f:
            json.dump(self.keys, f, ensure_ascii=False, indent=1)
        os.replace(tmp, self.path)

    def list(self):
        with self.lock:
            return [dict(k, key=self._mask(k["key"])) for k in self.keys]

    @staticmethod
    def _mask(key):
        return key[:10] + "..." + key[-4:] if len(key) > 18 else key

    def generate(self, name=""):
        key = "sk-duck-" + secrets.token_hex(16)
        with self.lock:
            self.keys.append({"name": name or ("key-%d" % (len(self.keys) + 1)),
                              "key": key, "enabled": True, "models": "",
                              "created": time.time()})
            self._save()
        return key

    def delete(self, masked_or_full):
        with self.lock:
            before = len(self.keys)
            self.keys = [k for k in self.keys
                         if k["key"] != masked_or_full
                         and self._mask(k["key"]) != masked_or_full]
            changed = len(self.keys) != before
            if changed:
                self._save()
            return changed

    def set_enabled(self, ident, enabled):
        with self.lock:
            for k in self.keys:
                if k["key"] == ident or self._mask(k["key"]) == ident:
                    k["enabled"] = bool(enabled)
                    self._save()
                    return True
            return False

    def set_models(self, ident, models):
        with self.lock:
            for k in self.keys:
                if k["key"] == ident or self._mask(k["key"]) == ident:
                    k["models"] = str(models or "").strip()
                    self._save()
                    return True
            return False

    def validate(self, provided, model):
        """(ok, reason)。provided 为客户端 Bearer；空表 = 不校验（本机自用）。"""
        with self.lock:
            if not self.keys:
                return True, ""
            for k in self.keys:
                if k["enabled"] and k["key"] == (provided or ""):
                    allow = str(k.get("models") or "").strip()
                    if allow and model:
                        pats = [p.strip().lower() for p in allow.split(",") if p.strip()]
                        m = (model or "").lower()
                        if not any(p.endswith("*") and m.startswith(p[:-1])
                                   or m == p for p in pats):
                            return False, "model %s not allowed for key %s" % (model, k["name"])
                    return True, ""
        return False, "invalid or disabled api key"


# ---------------------------------------------------------------- usage db
class UsageDB:
    def __init__(self, path):
        self.lock = threading.RLock()
        self.conn = sqlite3.connect(path, check_same_thread=False)
        self.conn.execute("""CREATE TABLE IF NOT EXISTS usage (
            ts INTEGER, key_name TEXT, model TEXT, stream INTEGER,
            prompt_tokens INTEGER, completion_tokens INTEGER,
            elapsed_ms INTEGER, ok INTEGER, detail TEXT)""")
        self.conn.execute("""CREATE TABLE IF NOT EXISTS stats (
            k TEXT PRIMARY KEY, v INTEGER)""")
        self.conn.commit()

    def record(self, key_name, model, stream, pt, ct, elapsed_ms, ok, detail=""):
        with self.lock:
            self.conn.execute(
                "INSERT INTO usage VALUES (?,?,?,?,?,?,?,?,?)",
                (int(time.time()), key_name, model, 1 if stream else 0,
                 pt, ct, elapsed_ms, 1 if ok else 0, detail[:300]))
            self.conn.commit()

    def summary(self):
        with self.lock:
            cur = self.conn.execute(
                """SELECT model, COUNT(*), SUM(CASE WHEN ok THEN 1 ELSE 0 END),
                          COALESCE(SUM(prompt_tokens),0), COALESCE(SUM(completion_tokens),0)
                   FROM usage GROUP BY model ORDER BY 2 DESC LIMIT 50""")
            rows = [{"model": r[0], "requests": r[1], "ok": r[2],
                     "prompt_tokens": r[3], "completion_tokens": r[4]} for r in cur]
            cur2 = self.conn.execute(
                """SELECT COALESCE(SUM(prompt_tokens),0), COALESCE(SUM(completion_tokens),0),
                          COUNT(*) FROM usage WHERE ts > ?""",
                (int(time.time()) - 86400,))
            r = cur2.fetchone()
            return {"models": rows, "day": {"prompt_tokens": r[0],
                    "completion_tokens": r[1], "requests": r[2]}}

    def recent(self, limit=100):
        with self.lock:
            cur = self.conn.execute(
                """SELECT ts,key_name,model,stream,prompt_tokens,completion_tokens,
                          elapsed_ms,ok,detail FROM usage ORDER BY ts DESC LIMIT ?""",
                (int(limit),))
            return [{"ts": r[0], "key": r[1], "model": r[2], "stream": bool(r[3]),
                     "prompt_tokens": r[4], "completion_tokens": r[5],
                     "elapsed_ms": r[6], "ok": bool(r[7]), "detail": r[8]}
                    for r in cur]


# ---------------------------------------------------------------- globals
KEYS = KeyStore(KEYS_PATH)
DB = UsageDB(DB_PATH)
POOL = None  # duck_upstream.POOL 由 init_pool 建


def _json_bytes(obj, status=200):
    body = json.dumps(obj, ensure_ascii=False).encode("utf-8")
    return status, [("Content-Type", "application/json; charset=utf-8"),
                    ("Content-Length", str(len(body))),
                    ("Access-Control-Allow-Origin", "*")], body


def _panel_token_headers(token, body=b""):
    return [("Content-Type", "application/json; charset=utf-8"),
            ("Content-Length", str(len(body))),
            ("X-Panel-Token", token)]


PANEL_TOKEN = secrets.token_hex(16)
PANEL_TOKEN_TS = time.time()  # 简化：单会话 token，进程生命周期有效


# ---------------------------------------------------------------- handler
class Handler(BaseHTTPRequestHandler):
    protocol_version = "HTTP/1.1"
    server_version = "DuckFlow/2.0"

    def log_message(self, fmt, *args):
        LOG("%s %s" % (self.address_string(), fmt % args))

    # ---- helpers ----
    def _send(self, status, headers, body):
        self.send_response(status)
        for k, v in headers:
            self.send_header(k, v)
        self.end_headers()
        if body:
            self.wfile.write(body)

    def _json(self, obj, status=200):
        s, h, b = _json_bytes(obj, status)
        self._send(s, h, b)

    def _error(self, status, message, code="error"):
        self._json({"error": {"message": message, "type": "invalid_request_error",
                              "code": code}}, status)

    def _bearer(self):
        h = self.headers.get("Authorization") or ""
        return h[7:].strip() if h.lower().startswith("bearer ") else ""

    def _panel_ok(self):
        return (self.headers.get("X-Panel-Token") or "").strip() == PANEL_TOKEN

    def _body_json(self):
        n = int(self.headers.get("Content-Length") or 0)
        if n <= 0:
            return {}
        raw = self.rfile.read(n)
        try:
            return json.loads(raw)
        except Exception:
            return {}

    def _cors(self):
        self.send_response(204)
        self.send_header("Access-Control-Allow-Origin", "*")
        self.send_header("Access-Control-Allow-Methods", "GET, POST, OPTIONS")
        self.send_header("Access-Control-Allow-Headers",
                         "Authorization, Content-Type, X-Panel-Token")
        self.send_header("Content-Length", "0")
        self.end_headers()

    # ---- routing ----
    def do_OPTIONS(self):
        self._cors()

    def do_GET(self):
        path = self.path.split("?")[0]
        if path in ("/", "/panel", "/index.html"):
            return self._serve_panel()
        if path == "/health":
            return self._json({"ok": True, "upstream": "duck.ai",
                               "exits": POOL.list_exits() if POOL else []})
        if path == "/v1/models":
            return self._handle_models()
        if path in ("/panel/status",):
            return self._json({"ok": True, "auth": "panel-token", "version": "2.0"})
        if path in ("/api/summary", "/api/recent", "/api/keys", "/api/exits"):
            if not self._panel_ok():
                return self._error(401, "panel token required")
            if path == "/api/summary":
                return self._json(DB.summary())
            if path == "/api/recent":
                return self._json({"rows": DB.recent(100)})
            if path == "/api/keys":
                return self._json({"keys": KEYS.list()})
            if path == "/api/exits":
                return self._json({"exits": POOL.list_exits() if POOL else []})
        return self._error(404, "not found: %s" % path)

    def do_POST(self):
        path = self.path.split("?")[0]
        if path == "/v1/chat/completions":
            return self._handle_chat()
        if path in ("/api/keys/generate", "/api/keys/delete", "/api/keys/toggle",
                    "/api/keys/models", "/api/exits/upsert", "/api/exits/remove",
                    "/api/logs/clear"):
            if not self._panel_ok():
                return self._error(401, "panel token required")
            payload = self._body_json()
            if path == "/api/keys/generate":
                key = KEYS.generate(str(payload.get("name") or ""))
                return self._json({"ok": True, "key": key})
            if path == "/api/keys/delete":
                return self._json({"ok": KEYS.delete(str(payload.get("id") or ""))})
            if path == "/api/keys/toggle":
                return self._json({"ok": KEYS.set_enabled(
                    str(payload.get("id") or ""), bool(payload.get("enabled")))})
            if path == "/api/keys/models":
                return self._json({"ok": KEYS.set_models(
                    str(payload.get("id") or ""), payload.get("models"))})
            if path == "/api/exits/upsert":
                return self._exit_upsert(payload)
            if path == "/api/exits/remove":
                if POOL:
                    POOL.remove_exit(str(payload.get("name") or ""))
                return self._json({"ok": True})
            if path == "/api/logs/clear":
                with DB.lock:
                    DB.conn.execute("DELETE FROM usage")
                    DB.conn.commit()
                return self._json({"ok": True})
        return self._error(404, "not found: %s" % path)

    # ---- panel ----
    def _serve_panel(self):
        try:
            with open(PANEL_HTML, "rb") as f:
                body = f.read()
            self._send(200, [("Content-Type", "text/html; charset=utf-8"),
                             ("Content-Length", str(len(body)))], body)
        except Exception as exc:
            self._error(500, "dashboard.html unavailable: %s" % exc)

    # ---- models ----
    def _handle_models(self):
        data = [{"id": m["id"], "object": "model", "owned_by": "duck.ai",
                 "created": 1793031767}
                for m in duck_client.DUCK_MODELS]
        self._json({"object": "list", "data": data})

    # ---- exits ----
    def _exit_upsert(self, payload):
        global POOL
        name = str(payload.get("name") or "").strip()
        proxy = payload.get("proxy")
        proxy = str(proxy).strip() if isinstance(proxy, str) and proxy.strip() else None
        if not name:
            return self._error(400, "name required")
        if POOL is None:
            duck_upstream.init_pool(log=LOG)
        try:
            POOL.upsert_exit(name, proxy=proxy)
        except Exception as exc:
            return self._json({"ok": False, "msg": str(exc)})
        return self._json({"ok": True, "msg": "exit %s ready (proxy=%s)"
                           % (name, proxy or "direct")})

    # ---- chat ----
    def _handle_chat(self):
        payload = self._body_json()
        model = payload.get("model") or "gpt-6-luna"
        ok, reason = KEYS.validate(self._bearer(), model)
        if not ok:
            # 空 key 表 = 本机自用放行；有表但没带 key 才拒
            if KEYS.keys:
                t0 = time.time()
                DB.record(self._bearer()[:12] or "-", model, bool(payload.get("stream")),
                          0, 0, 0, False, reason)
                return self._error(401, reason, "authentication_error")
        want_stream = bool(payload.get("stream"))
        messages = payload.get("messages") or []
        if duck_upstream.POOL is None:
            duck_upstream.init_pool(log=LOG)
        t0 = time.time()
        key_name = self._bearer()[:12] or "-"
        try:
            adapter = duck_upstream.duck_chat_stream(model, messages)
        except Exception as exc:
            DB.record(key_name, model, want_stream, 0, 0,
                      int((time.time() - t0) * 1000), False, str(exc))
            return self._error(502, "duck upstream error: %s" % exc)
        if want_stream:
            return self._chat_stream(adapter, model, key_name, t0)
        return self._chat_nonstream(adapter, model, key_name, t0)

    def _chat_stream(self, adapter, model, key_name, t0):
        self.send_response(200)
        self.send_header("Content-Type", "text/event-stream; charset=utf-8")
        self.send_header("Cache-Control", "no-cache")
        self.send_header("Connection", "close")
        self.send_header("Access-Control-Allow-Origin", "*")
        self.end_headers()
        chunk_id = "chatcmpl-duck-" + secrets.token_hex(8)
        text_parts = []
        failed = False
        first_ms = None
        try:
            for line in self._iter_sse(adapter):
                data = line.decode("utf-8", "replace")
                if data.startswith("data: "):
                    data = data[6:]
                data = data.strip()
                if not data or data == "[DONE]":
                    continue
                try:
                    j = json.loads(data)
                except Exception:
                    continue
                if "error" in j:
                    failed = True
                    self.wfile.write(("data: %s\n\n" % json.dumps({
                        "error": {"message": str(j["error"].get("message") or "")[:300],
                                  "type": "upstream_error",
                                  "code": "upstream_error"}})).encode())
                    self.wfile.flush()
                    break
                delta = ((j.get("choices") or [{}])[0].get("delta") or {})
                if delta.get("content"):
                    if first_ms is None:
                        first_ms = int((time.time() - t0) * 1000)
                    text_parts.append(delta["content"])
                    out = {"id": chunk_id, "object": "chat.completion.chunk",
                           "model": model,
                           "choices": [{"index": 0,
                                        "delta": {"content": delta["content"]},
                                        "finish_reason": None}]}
                    self.wfile.write(("data: %s\n\n" % json.dumps(
                        out, ensure_ascii=False)).encode("utf-8"))
                    self.wfile.flush()
            if not failed:
                fin = {"id": chunk_id, "object": "chat.completion.chunk", "model": model,
                       "choices": [{"index": 0, "delta": {}, "finish_reason": "stop"}]}
                self.wfile.write(("data: %s\n\n" % json.dumps(fin)).encode())
                self.wfile.write(b"data: [DONE]\n\n")
                self.wfile.flush()
        except (BrokenPipeError, ConnectionResetError):
            pass
        finally:
            adapter.close()
            full = "".join(text_parts)
            DB.record(key_name, model, True, max(1, len(full) // 4),
                      max(1, len(full) // 4), int((time.time() - t0) * 1000),
                      not failed, "" if not failed else "stream error")

    @staticmethod
    def _iter_sse(source, block=65536):
        """source.read1() 兼容的 SSE 行迭代（带换行）。"""
        read1 = getattr(source, "read1")
        buf = b""
        while True:
            chunk = read1(block)
            if not chunk:
                break
            buf += chunk
            if b"\n" not in buf:
                continue
            head, _, buf = buf.rpartition(b"\n")
            for line in head.split(b"\n"):
                yield line + b"\n"
        if buf:
            yield buf

    def _chat_nonstream(self, adapter, model, key_name, t0):
        content = []
        failed = False
        err_msg = ""
        try:
            for line in self._iter_sse(adapter):
                data = line.decode("utf-8", "replace")
                if data.startswith("data: "):
                    data = data[6:]
                data = data.strip()
                if not data or data == "[DONE]":
                    continue
                try:
                    j = json.loads(data)
                except Exception:
                    continue
                if "error" in j:
                    failed = True
                    err_msg = str(j["error"].get("message") or "")[:300]
                    break
                delta = ((j.get("choices") or [{}])[0].get("delta") or {})
                if delta.get("content"):
                    content.append(delta["content"])
        finally:
            adapter.close()
        full = "".join(content)
        elapsed = int((time.time() - t0) * 1000)
        if failed:
            DB.record(key_name, model, False, 0, 0, elapsed, False, err_msg)
            return self._error(502, err_msg or "upstream error")
        DB.record(key_name, model, False, max(1, len(full) // 4),
                  max(1, len(full) // 4), elapsed, True)
        self._json({"id": "chatcmpl-duck-" + secrets.token_hex(8),
                    "object": "chat.completion", "created": int(time.time()),
                    "model": model,
                    "choices": [{"index": 0,
                                 "message": {"role": "assistant", "content": full},
                                 "finish_reason": "stop"}],
                    "usage": {"prompt_tokens": max(1, len(full) // 4),
                              "completion_tokens": max(1, len(full) // 4),
                              "total_tokens": max(2, len(full) // 2)}})


# ---------------------------------------------------------------- main
def main():
    global POOL
    ap = argparse.ArgumentParser(description="DuckFlow gateway (duck.ai -> OpenAI API)")
    ap.add_argument("--port", type=int, default=int(os.environ.get("PORT") or 8788))
    ap.add_argument("--host", default=os.environ.get("HOST") or "127.0.0.1")
    ap.add_argument("--headless", default=os.environ.get("DUCK_HEADLESS", "1"),
                    help="1=无头 Chrome（默认） 0=有头")
    args = ap.parse_args()
    duck_upstream.init_pool(log=LOG, headless=str(args.headless) == "1")
    POOL = duck_upstream.POOL
    srv = ThreadingHTTPServer((args.host, args.port), Handler)
    LOG("DuckFlow gateway on http://%s:%d" % (args.host, args.port))
    LOG("  panel : http://127.0.0.1:%d/  (token in window.PANEL_TOKEN? -> /panel/status)" % args.port)
    LOG("  api   : http://127.0.0.1:%d/v1  (keys: %s)" %
        (args.port, "%d configured" % len(KEYS.keys) if KEYS.keys else "open (no keys)"))
    LOG("  models: %s" % ", ".join(m["id"] for m in duck_client.DUCK_MODELS))
    try:
        srv.serve_forever()
    except KeyboardInterrupt:
        pass
    finally:
        if POOL:
            POOL.shutdown()


if __name__ == "__main__":
    main()

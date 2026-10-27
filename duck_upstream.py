# -*- coding: utf-8 -*-
"""duck_upstream.py -- duck.ai 上游接入 wb_proxy 的适配层

把 DuckClientPool（CDP Chrome 出口池）包装成 wb_proxy 期望的
"upstream response" 形状：
  - 实现 read1(size) 供 iter_sse_lines 消费（duck SSE 帧已转成上游同款行格式）
  - 实现 with 语义（__enter__/__exit__）
  - 把 duck 的 {"action":"success","message":...} 帧转写成 workbuddy 上游的
    chat.completion.chunk 形状，下游 _chat_stream_response / aggregate_stream
    一行都不用改。

出口（exit）= 一个 Chrome 用户目录 + 可选代理。出口池条目即"账号"位：
  - DUCK_EXITS 环境变量: name=proxy[,name=proxy...]  预置出口
  - 面板 /accounts/duck-exits 可动态增删（多住宅 IP 入口）
  - 没有配置任何出口时自动建一个无代理默认出口（本机直连）
"""
import json
import queue
import threading
import time

import duck_client

# 全局出口池（wb_proxy.main 里 init）
POOL = None

_DUCK_START = object()


class DuckUpstreamAdapter:
    """把 duck SSE 帧队列伪装成 read1()-able 的上游响应。

    iter_sse_lines 只需要 read1(n) -> bytes（b"" = EOF）。我们把 CDP console
    通道收到的原始 duck SSE data 行按上游线格式重写：
      [CHAT_TITLE:x] / [PING] / [DONE] 原样透传（下游有解析）；
      {"action":"success","message":...} -> chat.completion.chunk JSON 行。
    """

    def __init__(self, model, chunk_queue):
        self.model = model
        self._q = chunk_queue
        self._buf = b""
        self._closed = False
        self.length = 0  # iter_sse_lines EOF 判断用
        self._done = False

    # -- iter_sse_lines 接口 --
    def read1(self, size=65536):
        if self._buf:
            out, self._buf = self._buf, b""
            return out
        if self._done:
            return b""
        while True:
            try:
                item = self._q.get(timeout=0.25)
            except queue.Empty:
                if self._closed:
                    return b""
                continue
            if item is _DUCK_START or item is None:
                if item is None:
                    self._done = True
                    return self._buf or b""
                continue
            self._buf += self._translate(item)
            if self._buf:
                out, self._buf = self._buf, b""
                return out

    def _translate(self, data_line):
        # data_line: 原始 duck SSE 的 data: 后内容（字符串）
        if data_line in ("[DONE]",) or data_line.startswith("[PING]") \
                or data_line.startswith("[CHAT_TITLE") \
                or data_line.startswith("[ADS:") \
                or data_line.startswith("[FIXED_COST_WINDOW_USAGE:") \
                or data_line.startswith("[SUMMARY"):
            if data_line == "[DONE]":
                return b"data: [DONE]\n\n"
            return b""  # 下游不认识这些，丢弃（标题等暂不透传）
        try:
            j = json.loads(data_line)
        except Exception:
            return b""
        if not isinstance(j, dict):
            return b""
        if j.get("action") != "success":
            # 上游错误帧 -> 转 SSE error 形状，让下游按流内错误处理
            err = {"error": {"message": str(j.get("message") or j)[:300],
                             "type": "upstream_error", "code": j.get("action")}}
            return ("data: %s\n\n" % json.dumps(err)).encode("utf-8")
        text = j.get("message")
        if not isinstance(text, str) or not text:
            return b""
        chunk = {
            "id": j.get("id") or "chatcmpl-duck",
            "object": "chat.completion.chunk",
            "created": int((j.get("created") or time.time() * 1000) / 1000),
            "model": self.model,
            "choices": [{"index": 0, "delta": {"content": text}, "finish_reason": None}],
        }
        return ("data: %s\n\n" % json.dumps(chunk, ensure_ascii=False)).encode("utf-8")

    # -- with 语义 --
    def close(self):
        self._closed = True

    def __enter__(self):
        return self

    def __exit__(self, *a):
        self.close()
        return False


def init_pool(log=None, headless=None):
    """wb_proxy.main 启动时调用。读 DUCK_EXITS 预置出口。"""
    global POOL
    if POOL is not None:
        return POOL
    if headless is None:
        headless = str(__import__("os").environ.get("DUCK_HEADLESS", "1")) == "1"
    base_port = int(__import__("os").environ.get("DUCK_CDP_BASE_PORT", "9400"))
    POOL = duck_client.DuckClientPool(log=log, headless=headless, base_port=base_port)
    # 出口懒加载：只注册配置，首次请求到达才 spawn Chrome（启动不延迟）。
    spec = __import__("os").environ.get("DUCK_EXITS", "").strip()
    n = 0
    for part in spec.split(","):
        part = part.strip()
        if not part:
            continue
        if "=" in part:
            name, proxy = part.split("=", 1)
            name, proxy = name.strip(), proxy.strip() or None
        else:
            name, proxy = part, None
        POOL.register_exit(name, proxy=proxy)
        n += 1
    if n == 0:
        POOL.register_exit("default", proxy=None)
        n = 1
    if log:
        log("duck upstream ready: %d exit(s) (lazy start), chrome=%s"
            % (n, duck_client.find_chrome()))
    return POOL


_FC_MODE = False


def set_fc_mode(on: bool):
    """伪 FC 模式开关：wb_proxy 在 tools 存在时置 True（canUseTools 关闭）。"""
    global _FC_MODE
    _FC_MODE = bool(on)


def build_duck_body(model, messages, stream=True):
    """OpenAI messages -> duck chat 请求体。

    duck 只认 {role, content:[{type:'text',text}]}；system 合并成首条 user 前缀
    （duck 无 system 角色；官方前端把 system 注入对话文本）。
    """
    duck_msgs = []
    sys_parts = []
    for m in messages or []:
        if not isinstance(m, dict):
            continue
        role = m.get("role")
        content = m.get("content")
        if isinstance(content, list):
            text = "\n".join(
                c.get("text", "") for c in content
                if isinstance(c, dict) and c.get("type") == "text")
        else:
            text = content if isinstance(content, str) else ""
        if not text:
            continue
        if role == "system" or role == "developer":
            sys_parts.append(text)
        elif role in ("user", "assistant"):
            duck_msgs.append({"role": role, "content": [{"type": "text", "text": text}]})
    if sys_parts:
        prefix = "[System]\n" + "\n".join(sys_parts) + "\n"
        if duck_msgs and duck_msgs[0]["role"] == "user":
            duck_msgs[0]["content"][0]["text"] = prefix + duck_msgs[0]["content"][0]["text"]
        else:
            duck_msgs.insert(0, {"role": "user", "content": [{"type": "text", "text": prefix}]})
    return {
        "model": model,
        "messages": duck_msgs,
        "canUseTools": not _FC_MODE,
        "reasoningEffort": "none",
        "canUseApproxLocation": None,
        "canDelegateImageGeneration": None,
        "canShowGreeting": False,
        # 服务端已强制要求 durableStream（2026-10-28 实测 400 ERR_BAD_REQUEST）。
        # RSA-OAEP 公钥由浏览器 WebCrypto 生成（页面内注入生成），Python 侧预生成
        # 固定密钥即可（duck 只用公钥加密下行流，私钥我们不需要——SSE 已直接回读）。
        "durableStream": {
            "messageId": str(__import__("uuid").uuid4()),
            "conversationId": str(__import__("uuid").uuid4()),
            "publicKey": None,  # 页面内 WebCrypto 实时生成填充
        },
    }


def duck_chat_stream(model, messages, on_chunk_error=None):
    """发起 duck 流式请求，返回 DuckUpstreamAdapter。

    wb_proxy 的 _chat_stream_response 直接把它当 upstream 用。
    messages 可能已含 FC 协议注入（wb_proxy 侧处理 tools）；此处原样转发。
    """
    body = build_duck_body(model, messages)
    q = queue.Queue()
    adapter = DuckUpstreamAdapter(model, q)
    got_first = threading.Event()

    def on_frame(data_line):
        q.put(data_line)
        if not got_first.is_set():
            got_first.set()

    def run():
        try:
            POOL.chat(body, on_frame)
        except Exception as exc:
            # 错误转成流内 error 帧 + EOF
            err = {"error": {"message": str(exc)[:300], "type": "upstream_error",
                             "code": "duck_exit_error"}}
            q.put(json.dumps({"action": "error", "message": str(exc)[:300]}))
        finally:
            q.put(None)

    threading.Thread(target=run, daemon=True).start()
    return adapter

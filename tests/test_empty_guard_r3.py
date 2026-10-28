"""R3 接线补测：/v1/responses 与 /v1/messages 非流式也必须拦截空产出。

上一轮只给 chat.completions 的两条路径写了接线测试；这两条是同一缺陷族，
审查指出「只修 2/4 条出口」。这里用最小的 handler 替身验证真实决策与返回。
"""
import os
import sys
import types

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)

SSE_EMPTY = b'data: {"id": "c1", "choices": [{"index": 0, "delta": {}}]}\ndata: [DONE]\n\n'
SSE_TEXT = (b'data: {"id": "c1", "choices": [{"index": 0, '
            b'"delta": {"content": "hello"}}]}\ndata: [DONE]\n\n')


class Up:
    def __init__(self, payload):
        self.payload, self.sent, self.closed = payload, False, False

    def read1(self, size=65536):
        if self.sent:
            return b""
        self.sent = True
        return self.payload

    def close(self):
        self.closed = True


class H:
    """handler 替身：只实现被测方法用到的那几个出口。"""

    def __init__(self):
        self.error = None
        self.json_body = None

    def _json(self, code, payload):
        self.json_body = (code, payload)
        return None

    def _error(self, code, message, typ="invalid_request_error"):
        self.error = (code, message, typ)
        return None

    def _anthropic_error(self, code, message):
        self.error = ("anthropic", code, message)
        return None

    def _key_id(self):
        return "k"


@pytest.fixture()
def stubs(monkeypatch):
    import wb_proxy
    rec = {"errors": [], "usage": []}
    monkeypatch.setattr(wb_proxy, "record_error", lambda *a, **k: rec["errors"].append((a, k)))
    monkeypatch.setattr(wb_proxy, "record_upstream_usage", lambda *a, **k: rec["usage"].append((a, k)))
    # responses 路径要 request_meta / web_tools 等，这里给最小可用值
    monkeypatch.setattr(wb_proxy, "web_tools_active", lambda body: False, raising=False)
    monkeypatch.setattr(wb_proxy, "internal_calls_from_chat", lambda obj, web_tools=False: [],
                        raising=False)
    monkeypatch.setattr(wb_proxy, "reasoning_only_response", lambda result: False, raising=False)
    monkeypatch.setattr(wb_proxy, "chat_to_response",
                        lambda chat_obj, *a, **k: {"output": chat_obj.get("choices")}, raising=False)
    return rec


def _account():
    return types.SimpleNamespace(uid="acct-1")


def test_responses_empty_returns_502(stubs):
    import wb_proxy
    h = H()
    wb_proxy.Handler._responses_nonstream_response(
        h, Up(SSE_EMPTY), "gpt-6-luna", {}, {"k": "v"}, "fp", _account(), 0.0)
    assert h.error is not None and h.error[0] == 502
    assert h.json_body is None
    assert stubs["errors"] and stubs["errors"][0][1].get("outcome") == "empty_completion"


def test_responses_text_returns_200(stubs):
    import wb_proxy
    h = H()
    wb_proxy.Handler._responses_nonstream_response(
        h, Up(SSE_TEXT), "gpt-6-luna", {}, {"k": "v"}, "fp", _account(), 0.0)
    assert h.error is None and h.json_body[0] == 200


def test_messages_empty_returns_anthropic_502(stubs, monkeypatch):
    import wb_proxy
    monkeypatch.setattr(wb_proxy, "chat_to_messages",
                        lambda chat_obj: {"content": []}, raising=False)
    h = H()
    wb_proxy.Handler._messages_nonstream_response(
        h, Up(SSE_EMPTY), "gpt-6-luna", "fp", _account(), 0.0)
    assert h.error is not None and h.error[0] == "anthropic" and h.error[1] == 502
    assert stubs["errors"] and stubs["errors"][0][1].get("outcome") == "empty_completion"


def test_messages_text_returns_200(stubs, monkeypatch):
    import wb_proxy
    monkeypatch.setattr(wb_proxy, "chat_to_messages",
                        lambda chat_obj: {"content": [{"type": "text", "text": "hello"}]},
                        raising=False)
    h = H()
    wb_proxy.Handler._messages_nonstream_response(
        h, Up(SSE_TEXT), "gpt-6-luna", "fp", _account(), 0.0)
    assert h.error is None and h.json_body[0] == 200

"""R5：502 接线测试 —— 不只是谓词，要断言非流式出口真的返回 502 且带对参数。"""
import os
import sys

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)

# aggregate_stream 吃的是 **OpenAI chunk**（duck→OpenAI 的转换在适配器里做）
SSE_EMPTY = b'data: {"id": "c1", "choices": [{"index": 0, "delta": {}}]}\ndata: [DONE]\n\n'
SSE_TEXT = (b'data: {"id": "c1", "choices": [{"index": 0, '
            b'"delta": {"content": "hello"}}]}\ndata: [DONE]\n\n')


class FakeUpstream:
    """最小 SSE 上游：按给定字节流返回，之后返回 b''。"""

    def __init__(self, payload=b"", last_error=""):
        self._payload = payload
        self._sent = False
        self.closed = False
        self.last_error = last_error

    def read1(self, size=65536):
        if self._sent:
            return b""
        self._sent = True
        return self._payload

    def close(self):
        self.closed = True


def _duck_error_upstream(msg="no idle duck exit"):
    """真实适配器 + duck 错误帧：验证 last_error 被记录并透出到 502 文案。"""
    import queue

    import duck_pure
    q = queue.Queue()
    adapter = duck_pure.PureUpstreamAdapter("gpt-6-luna", q)
    q.put('{"action": "error", "message": "%s"}' % msg)
    q.put(None)
    return adapter


class FakeHandler:
    """只实现 _duck_nonstream_response 用到的那几个方法。"""

    def __init__(self):
        self.error = None
        self.json_body = None

    def _error(self, code, message, typ="invalid_request_error"):
        self.error = (code, message, typ)
        return None

    def _json(self, code, payload):
        self.json_body = (code, payload)
        return None

    def _key_id(self):
        return "k-test"


def _call(monkeypatch, upstream, fc_mode=False):
    import wb_proxy
    recorded = []
    monkeypatch.setattr(wb_proxy, "record_error",
                        lambda *a, **k: recorded.append((a, k)))
    monkeypatch.setattr(wb_proxy, "record_usage", lambda *a, **k: None)
    h = FakeHandler()
    wb_proxy.Handler._duck_nonstream_response(h, upstream, "gpt-6-luna", None, 0.0,
                                              fc_mode=fc_mode)
    return h, recorded


def test_empty_completion_returns_502(monkeypatch):
    h, recorded = _call(monkeypatch, FakeUpstream(SSE_EMPTY))
    assert h.error is not None and h.error[0] == 502
    assert h.json_body is None
    # 归因参数：outcome / usage 必须带上（R1）
    assert recorded and recorded[0][1].get("outcome") == "empty_completion"
    assert "usage" in recorded[0][1]


def test_nonempty_completion_returns_200(monkeypatch):
    h, recorded = _call(monkeypatch, FakeUpstream(SSE_TEXT))
    assert h.error is None and h.json_body[0] == 200
    assert not recorded


def test_upstream_error_text_is_surfaced(monkeypatch):
    """R2：上游错误帧原文要出现在 502 文案里，而不是只说 empty。"""
    h, _ = _call(monkeypatch, _duck_error_upstream())
    assert h.error[0] == 502
    assert "no idle duck exit" in h.error[1]


def test_upstream_closed_even_on_empty(monkeypatch):
    up = FakeUpstream(SSE_EMPTY)
    _call(monkeypatch, up)
    assert up.closed is True


def test_content_filter_not_treated_as_empty(monkeypatch):
    """S5：上游明确拒绝（content_filter）不算空产出，照常 200。"""
    payload = (b'data: {"id": "c1", "choices": [{"index": 0, "delta": {}, '
               b'"finish_reason": "content_filter"}]}\ndata: [DONE]\n\n')
    h, recorded = _call(monkeypatch, FakeUpstream(payload))
    assert h.error is None and h.json_body[0] == 200
    assert not recorded

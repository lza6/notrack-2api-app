"""P1 回归：上游空完成不得静默回 200 空串（duck.ai 偶发空 success 帧）。"""
import os
import sys

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


def _obj(content="", reasoning="", tool_calls=None):
    msg = {"role": "assistant", "content": content}
    if reasoning:
        msg["reasoning_content"] = reasoning
    if tool_calls:
        msg["tool_calls"] = tool_calls
    return {"choices": [{"index": 0, "message": msg, "finish_reason": "stop"}]}


def test_empty_content_detected():
    import wb_proxy
    assert wb_proxy.completion_is_empty(_obj("")) is True
    assert wb_proxy.completion_is_empty(_obj("   ")) is True
    assert wb_proxy.completion_is_empty(_obj(None)) is True


def test_real_content_not_empty():
    import wb_proxy
    assert wb_proxy.completion_is_empty(_obj("hello")) is False


def test_reasoning_only_not_empty():
    import wb_proxy
    # 只有 reasoning（推理模型）也是有效产出
    assert wb_proxy.completion_is_empty(_obj("", "thinking...")) is False


def test_tool_calls_not_empty():
    import wb_proxy
    tc = [{"id": "call_1", "type": "function",
           "function": {"name": "f", "arguments": "{}"}}]
    assert wb_proxy.completion_is_empty(_obj("", "", tc)) is False


def test_no_choices_is_empty():
    import wb_proxy
    assert wb_proxy.completion_is_empty({"choices": []}) is True
    assert wb_proxy.completion_is_empty({}) is True

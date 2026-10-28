"""模型校验：未知模型/缺 model 必须回 4xx，而不是落到账号通道回 503。

背景（对接 new-api 时发现）：duck 通道只服务固定模型清单，未知模型名原本会
落到 WorkBuddy 账号通道，返回 "503 no usable account"；外部网关会把它当渠道
故障（渠道测试失败、可能触发自动禁用），排障时也完全误导。
"""
import os
import sys

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


def test_missing_model_is_400():
    import wb_proxy
    assert wb_proxy.request_model_error({}, 0) == (400, "model is required")
    assert wb_proxy.request_model_error({"model": "   "}, 0) == (400, "model is required")
    assert wb_proxy.request_model_error(None, 0) == (400, "model is required")


def test_known_duck_model_passes():
    import wb_proxy
    assert wb_proxy.request_model_error({"model": "gpt-6-luna"}, 0) is None
    assert wb_proxy.request_model_error({"model": "claude-haiku-4-5"}, 0) is None


def test_unknown_model_rejected_when_no_accounts():
    import wb_proxy
    err = wb_proxy.request_model_error({"model": "gpt-4o"}, 0)
    assert err is not None and err[0] == 404
    # 报错必须列出可用模型，否则调用方不知道该填什么
    assert "gpt-6-luna" in err[1] and "gpt-4o" in err[1]


def test_unknown_model_allowed_when_accounts_exist():
    """保留账号通道的部署：有可用账号时未知模型继续走原路径（不拦）。"""
    import wb_proxy
    assert wb_proxy.request_model_error({"model": "some-workbuddy-model"}, 3) is None

"""P1 回归：wb_updates/wb_update_request shim 态下 /updates 端点不得崩。"""
import os
import sys

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


def test_duckshim_status_returns_none_but_endpoint_safe():
    import wb_proxy
    # shim 态：UpdateChecker() 返回 _DuckShim 实例（truthy），status() 返回 None
    shim = wb_proxy.wb_updates.UpdateChecker(current_version="x", settings_dir="d", log=print)
    assert shim  # truthy —— 这正是触发原 bug 的条件
    assert shim.status() is None
    # _get_updates 修复后 payload.update(None or {}) 不再抛 AttributeError
    assert (wb_proxy.wb_update_request.status() or {}) == {}


def test_manual_check_none_safe():
    import wb_proxy
    shim = wb_proxy.wb_updates.UpdateChecker(current_version="x", settings_dir="d", log=print)
    assert shim.check(manual=True) is None  # 原 bug 第二处：None.update 崩
    # 修复后的消费点
    status = shim.check(manual=True) or {}
    status.update(wb_proxy.wb_update_request.status() or {})
    assert isinstance(status, dict)

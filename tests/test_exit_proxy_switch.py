"""P3：已 spawn 出口换 proxy 必须立即生效（不再需要重启）。"""
import os
import sys

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


@pytest.fixture()
def pool(tmp_path):
    import duck_pure
    duck_pure.PureDuckPool.set_persist_path(str(tmp_path / "exits.json"))
    p = duck_pure.PureDuckPool()
    yield p
    duck_pure.PureDuckPool.set_persist_path(None)


def _session_proxies(session):
    """取 curl_cffi Session 的代理配置（不同版本字段名可能不同，做兼容）。"""
    for attr in ("proxies", "_proxies"):
        value = getattr(session, attr, None)
        if value:
            return value
    return {}


def test_proxy_change_rebuilds_session(pool):
    pool.upsert_exit("e1", "http://1.1.1.1:80")
    e = pool._pick()
    assert e is not None
    session_before = e["session"]
    assert "1.1.1.1" in str(_session_proxies(session_before))

    with pool._cond:
        e["busy"] = False
        pool._cond.notify_all()

    pool.upsert_exit("e1", "http://2.2.2.2:80")
    e2 = pool._exits["e1"]
    assert e2["proxy"] == "http://2.2.2.2:80"
    assert e2["session"] is not session_before, "换 proxy 必须重建 session"
    assert "2.2.2.2" in str(_session_proxies(e2["session"]))


def test_same_proxy_keeps_session(pool):
    pool.upsert_exit("e1", "http://1.1.1.1:80")
    pool._pick()
    before = pool._exits["e1"]["session"]
    pool.upsert_exit("e1", "http://1.1.1.1:80")   # 未变
    assert pool._exits["e1"]["session"] is before


def test_proxy_change_clears_last_error(pool):
    pool.upsert_exit("e1", "http://1.1.1.1:80")
    pool._pick()
    pool._exits["e1"]["last_err"] = "chat 418"
    with pool._cond:
        pool._exits["e1"]["busy"] = False
        pool._cond.notify_all()
    pool.upsert_exit("e1", "http://3.3.3.3:80")
    assert pool._exits["e1"]["last_err"] == ""


def test_busy_exit_defers_rebuild_until_idle(pool):
    """审查 P1：出口在途（busy=True）时换 proxy 不得中途替换 session。

    一次请求内会多次读 `e['session']`（status / POST / 重试 / 自愈），中途换掉
    会让 vqd 挑战与随后的 POST 打到不同出口；旧 session 还会泄漏 curl handle。
    """
    pool.upsert_exit("e1", "http://1.1.1.1:80")
    e = pool._pick()
    assert e["busy"] is True
    session_in_flight = e["session"]

    pool.upsert_exit("e1", "http://2.2.2.2:80")

    # 在途请求仍拿旧 session；变更被挂起
    assert e["session"] is session_in_flight
    assert e.get("pending_proxy") == "http://2.2.2.2:80"
    # 面板看到的是"新 proxy + 待生效"，不是旧值
    listed = {x["name"]: x for x in pool.list_exits()}
    assert listed["e1"]["proxy"] == "http://2.2.2.2:80"
    assert listed["e1"].get("rebuilding") is True

    # 释放后下一次 pick 才真正换：新 proxy + 新 session + 旧 session 已关闭
    with pool._cond:
        e["busy"] = False
        pool._cond.notify_all()
    e2 = pool._pick()
    assert e2["proxy"] == "http://2.2.2.2:80"
    assert e2["session"] is not session_in_flight
    assert "2.2.2.2" in str(_session_proxies(e2["session"]))
    assert "pending_proxy" not in e2
    assert getattr(session_in_flight, "_closed", False) is True, "旧 session 必须关闭（防句柄泄漏）"


def test_idle_exit_rebuilds_immediately(pool):
    """空闲出口换 proxy 仍是立即生效（不引入额外延迟）。"""
    pool.upsert_exit("e1", "http://1.1.1.1:80")
    pool._pick()
    with pool._cond:
        pool._exits["e1"]["busy"] = False
        pool._cond.notify_all()
    before = pool._exits["e1"]["session"]
    pool.upsert_exit("e1", "http://4.4.4.4:80")
    assert pool._exits["e1"]["proxy"] == "http://4.4.4.4:80"
    assert pool._exits["e1"]["session"] is not before
    assert "pending_proxy" not in pool._exits["e1"]

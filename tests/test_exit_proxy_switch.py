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

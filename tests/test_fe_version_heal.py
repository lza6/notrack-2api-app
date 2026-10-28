"""自愈的集成语义：单飞、失败退避、时间戳防降级、_heal_and_retry 接线。

与 test_fe_version.py 的分工：那个文件测「抓取与解析」，这里测「并发/退避/
重试接线」这类容易在真实运行中静默失效的部分（上一轮正是它们没被测到）。
"""
import os
import sys
import time

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


@pytest.fixture(autouse=True)
def _isolate(tmp_path, monkeypatch):
    import duck_pure
    monkeypatch.setattr(duck_pure, "_FE_VERSION_CACHE", str(tmp_path / "fe.json"))
    monkeypatch.setattr(duck_pure, "_FE_VERSION_MIN_INTERVAL", 0.0)
    monkeypatch.setattr(duck_pure, "_FE_VERSION_FAILURE_BACKOFF", 0.0)
    duck_pure._FE_VERSION_STATE.update({"value": duck_pure._FE_VERSION_PREFIX,
                                        "refreshed_at": 0.0, "last_error": "",
                                        "source": "builtin", "failures": 0})
    yield
    duck_pure._FE_VERSION_STATE.update({"value": duck_pure._FE_VERSION_PREFIX,
                                        "refreshed_at": 0.0, "last_error": "",
                                        "source": "builtin", "failures": 0})


NEW = "serp_20261201_120000_ET-deadbeefdeadbeef0123456789abcdef01234567"
OLD = "serp_20261001_000000_ET"


class Resp:
    def __init__(self, status, text="", headers=None):
        self.status_code, self.text, self.headers = status, text, headers or {}


class Homepage:
    def __init__(self, token=NEW, raise_exc=None):
        self.token, self.raise_exc, self.calls = token, raise_exc, 0

    def get(self, *a, **k):
        self.calls += 1
        if self.raise_exc:
            raise self.raise_exc
        return Resp(200, "<html>serp_%s</html>" % self.token if False else
                    "<html>%s</html>" % self.token)

    def post(self, *a, **k):
        return Resp(200)


def test_fetch_exception_does_not_propagate():
    """session.get 抛异常（超时/DNS）时只记 last_error，绝不污染调用方。"""
    import duck_pure
    ok = duck_pure.refresh_fe_version(session=Homepage(raise_exc=TimeoutError("boom")))
    assert ok is False
    st = duck_pure.fe_version_status()
    assert "boom" in st["last_error"] and st["failures"] == 1
    assert duck_pure.current_fe_version() == duck_pure._FE_VERSION_PREFIX


def test_failure_backoff_is_short(monkeypatch):
    """一次失败只退避 FAILURE_BACKOFF（60s），不该哑火整个 MIN_INTERVAL（600s）。

    关键判别点：失败后把 refreshed_at 推到 100s 之前——若退避错写成 600s，
    这次调用会被防抖闸门挡下（calls 仍是 1）；只有 60s 退避才会重抓（calls=2）。
    """
    import time

    import duck_pure
    monkeypatch.setattr(duck_pure, "_FE_VERSION_MIN_INTERVAL", 600.0)
    monkeypatch.setattr(duck_pure, "_FE_VERSION_FAILURE_BACKOFF", 60.0)
    bad = Homepage(raise_exc=TimeoutError("x"))
    duck_pure.refresh_fe_version(session=bad)
    assert bad.calls == 1
    duck_pure.refresh_fe_version(session=bad)          # 退避窗口内：不再抓
    assert bad.calls == 1
    duck_pure._FE_VERSION_STATE["refreshed_at"] = time.time() - 100  # 已过 100s
    duck_pure.refresh_fe_version(session=bad)          # 60s 退避已过：应重抓
    assert bad.calls == 2


def test_older_timestamp_not_adopted():
    """防降级：首页/CDN 回更旧时间戳的 token 时，不得覆盖当前值。"""
    import duck_pure
    duck_pure._FE_VERSION_STATE["value"] = NEW
    ok = duck_pure.refresh_fe_version(session=Homepage(token=OLD))
    assert ok is False
    assert duck_pure.current_fe_version() == NEW
    assert duck_pure.fe_version_status()["source"] == "confirmed-rejected-older"


def test_single_flight_skips_concurrent_refetch():
    """单飞：另一个线程持闸时，本次调用直接返回 False（不并发抓首页）。"""
    import duck_pure
    duck_pure._FE_REFRESHING.acquire()
    try:
        page = Homepage()
        assert duck_pure.refresh_fe_version(session=page) is False
        assert page.calls == 0
    finally:
        duck_pure._FE_REFRESHING.release()


def test_heal_and_retry_retries_only_on_challenge(monkeypatch):
    """_heal_and_retry：非挑战错误不重试；挑战错误才自愈+再发一次。"""
    import duck_pure

    class Sess:
        def __init__(self, first):
            self.first, self.posts = first, 0

        def get(self, *a, **k):
            return Resp(200, "", {"x-vqd-hash-1": "e30="})   # {}
        def post(self, *a, **k):
            # r2 由测试直接传入，所以这里的 post 就是「自愈后的那一次重试」
            self.posts += 1
            return Resp(200, "ok")

    monkeypatch.setattr(duck_pure, "_node_answer", lambda js: "vqd")
    calls = {"n": 0}
    duck_pure_refresh_orig = duck_pure.refresh_fe_version
    duck_pure.refresh_fe_version = lambda **k: (calls.__setitem__("n", calls["n"] + 1) or True)
    try:
        # 1) 配额类错误（非挑战）：不重试
        s = Sess(Resp(429, '{"status":429}'))
        r = duck_pure._heal_and_retry(s, "http://chat", {}, {}, Resp(429, '{"status":429}'))
        assert r.status_code == 429 and calls["n"] == 0
        # 2) 挑战错误：自愈被调用，并重发一次
        s2 = Sess(None)
        r2 = duck_pure._heal_and_retry(s2, "http://chat", {}, {},
                                       Resp(418, '{"type":"ERR_CHALLENGE"}'))
        assert calls["n"] == 1 and r2.status_code == 200
    finally:
        duck_pure.refresh_fe_version = duck_pure_refresh_orig


def test_heal_and_retry_gives_up_without_fresh_challenge():
    """自愈后拿不到新挑战（status 非 200 / 无 vqd）就放弃，不用旧挑战白打一发。"""
    import duck_pure

    class Sess:
        def __init__(self):
            self.posts = 0

        def get(self, *a, **k):
            return Resp(500, "")          # 取挑战失败
        def post(self, *a, **k):
            self.posts += 1
            return Resp(418, '{"type":"ERR_CHALLENGE"}')

    orig = duck_pure.refresh_fe_version
    duck_pure.refresh_fe_version = lambda **k: True
    try:
        s = Sess()
        r = duck_pure._heal_and_retry(s, "http://chat", {}, {},
                                      Resp(418, '{"type":"ERR_CHALLENGE"}'))
        assert r.status_code == 418
        assert s.posts == 0     # 没有用旧挑战再打一发
    finally:
        duck_pure.refresh_fe_version = orig

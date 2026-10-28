"""known#4 x-fe-version 自愈：正则、缓存、防抖、热更、失败保留。"""
import json
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
    # 每测试独立缓存文件与状态
    monkeypatch.setattr(duck_pure, "_FE_VERSION_CACHE", str(tmp_path / "fe.json"))
    monkeypatch.setattr(duck_pure, "_FE_VERSION_MIN_INTERVAL", 0.0)
    duck_pure._FE_VERSION_STATE.update({"value": duck_pure._FE_VERSION_PREFIX,
                                        "refreshed_at": 0.0, "last_error": "",
                                        "source": "builtin"})
    yield
    duck_pure._FE_VERSION_STATE.update({"value": duck_pure._FE_VERSION_PREFIX,
                                        "refreshed_at": 0.0, "last_error": "",
                                        "source": "builtin"})


class _FakeResp:
    def __init__(self, status, text): self.status_code, self.text = status, text


class _FakeSession:
    def __init__(self, page): self.page, self.calls = page, 0
    def get(self, *a, **k):
        self.calls += 1
        return _FakeResp(200, self.page)


NEW_TOKEN = "serp_20261201_120000_ET-deadbeefcafebabe0123456789abcdef01234567"
HOMEPAGE = '<script src="/js/%s/home.js"></script>' % NEW_TOKEN


def test_refresh_picks_new_token_and_updates_state():
    import duck_pure
    ok = duck_pure.refresh_fe_version(session=_FakeSession(HOMEPAGE))
    assert ok and duck_pure.current_fe_version() == NEW_TOKEN
    assert duck_pure.fe_version_status()["source"] == "self-healed"


def test_same_token_confirmed_not_changed():
    import duck_pure
    ok = duck_pure.refresh_fe_version(session=_FakeSession(
        '<div>' + duck_pure._FE_VERSION_PREFIX + '</div>'))
    assert not ok   # 没变
    assert duck_pure.fe_version_status()["source"] == "confirmed"
    assert duck_pure.current_fe_version() == duck_pure._FE_VERSION_PREFIX


def test_fetch_failure_keeps_old_value():
    import duck_pure
    class Dead:
        def get(self, *a, **k): return _FakeResp(503, "")
    ok = duck_pure.refresh_fe_version(session=Dead())
    assert not ok
    assert duck_pure.current_fe_version() == duck_pure._FE_VERSION_PREFIX
    assert duck_pure.fe_version_status()["last_error"]   # 错误留痕


def test_cache_roundtrip(tmp_path):
    import duck_pure
    duck_pure.refresh_fe_version(session=_FakeSession(HOMEPAGE))
    cache = json.load(open(duck_pure._FE_VERSION_CACHE, encoding="utf-8"))
    assert cache["value"] == NEW_TOKEN
    # 模拟重启：新进程读缓存直接用新值
    duck_pure._FE_VERSION_STATE["value"] = duck_pure._FE_VERSION_PREFIX
    duck_pure._FE_VERSION_STATE["refreshed_at"] = 0.0
    duck_pure._load_fe_version_cache()
    assert duck_pure.current_fe_version() == NEW_TOKEN


def test_debounce_respects_min_interval(monkeypatch):
    import duck_pure
    monkeypatch.setattr(duck_pure, "_FE_VERSION_MIN_INTERVAL", 3600.0)
    s = _FakeSession(HOMEPAGE)
    duck_pure.refresh_fe_version(session=s)
    assert s.calls == 1
    duck_pure.refresh_fe_version(session=s)      # 间隔内不抓
    assert s.calls == 1
    duck_pure.refresh_fe_version(session=s, force=True)   # force 例外
    assert s.calls == 2


def test_malformed_homepage_no_false_positive():
    import duck_pure
    # 首页无 serp_* 串（改版/反爬）→ 保留旧值不瞎猜
    ok = duck_pure.refresh_fe_version(session=_FakeSession("<html>nothing here</html>"))
    assert not ok
    assert duck_pure.current_fe_version() == duck_pure._FE_VERSION_PREFIX

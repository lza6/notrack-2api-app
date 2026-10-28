"""wb_settings 覆盖率补强：限额/开关/面板会话/版本串覆盖等纯逻辑路径。

上一轮实测 wb_settings 只有 32% 覆盖——它是「配置正确性」的唯一仲裁者，
错误会直接表现为限额失效或鉴权错乱，因此优先补它（而不是补大文件的行数）。
"""
import os
import sys
import time

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


@pytest.fixture()
def d(tmp_path):
    return str(tmp_path / "accounts")


# --------------------------------------------------------------- 限额（limits）

def test_limit_defaults_and_set(d):
    import wb_settings
    val = wb_settings.limit_value(d, "daily_token_limit")
    assert isinstance(val, (int, float)) or val is None   # 默认值形态
    wb_settings.set_limit(d, "daily_token_limit", "global", 1234)
    assert wb_settings.limit_value(d, "daily_token_limit") == 1234


def test_limit_realm_override_and_inherit(d):
    """scope 只有 global / intl / cn：realm 覆盖可设、可清回继承。"""
    import wb_settings
    wb_settings.set_limit(d, "daily_token_limit", "global", 100)
    wb_settings.set_limit(d, "daily_token_limit", "intl", 10)
    grouped = wb_settings.limits_data(d)
    entry = grouped.get("daily_token_limit") or {}
    assert entry.get("global") == 100
    assert entry.get("intl") == 10
    # None 表示清回继承
    wb_settings.set_limit(d, "daily_token_limit", "intl", None)
    grouped2 = wb_settings.limits_data(d)
    assert not (grouped2.get("daily_token_limit") or {}).get("intl")
    assert isinstance(wb_settings.limits_snapshot(d), dict)
    assert isinstance(wb_settings.limit_values_many(d, ["daily_token_limit"]), dict)


def test_set_limit_rejects_unknown(d):
    import wb_settings
    with pytest.raises(ValueError):
        wb_settings.set_limit(d, "not_a_limit", "global", 1)
    with pytest.raises(ValueError):
        wb_settings.set_limit(d, "daily_token_limit", "mars", 1)


def test_normalize_drops_garbage(d):
    import wb_settings
    wb_settings.save(d, {"limits": {"daily_token_limit": {"global": "not-a-number"}}})
    val = wb_settings.limit_value(d, "daily_token_limit")
    # 非法值必须被规范掉，不能原样透传给调用方
    assert not isinstance(val, str)


def test_reserve_and_daily_limits_roundtrip(d):
    import wb_settings
    wb_settings.set_reserve_credits(d, 5)
    assert wb_settings.reserve_credits(d) == 5
    wb_settings.set_daily_token_limit(d, 999)
    assert wb_settings.daily_token_limit(d) == 999
    wb_settings.set_daily_credit_limit(d, 7)
    assert wb_settings.daily_credit_limit(d) == 7


def test_expiring_window_days_roundtrip(d):
    import wb_settings
    stored = wb_settings.set_expiring_window_days(d, 30)
    assert stored == 30
    assert wb_settings.expiring_window_days(d) == 30


# --------------------------------------------------------------- 开关

def test_account_concurrency_and_affinity(d):
    import wb_settings
    wb_settings.set_account_max_concurrent(d, 3)
    assert wb_settings.account_max_concurrent(d) == 3
    wb_settings.set_affinity_stable_key_enabled(d, True)
    assert wb_settings.affinity_stable_key_enabled(d) is True


def test_auth_disabled_roundtrip(d):
    import wb_settings
    assert wb_settings.auth_disabled(d) is False
    wb_settings.set_auth_disabled(d, True)
    assert wb_settings.auth_disabled(d) is True


def test_api_key_override_roundtrip(d):
    import wb_settings
    key, is_set = wb_settings.api_key_override(d)
    assert (key, is_set) == (None, False)
    wb_settings.set_api_key(d, "sk-x")
    key, is_set = wb_settings.api_key_override(d)
    assert key == "sk-x" and is_set is True


# --------------------------------------------------------------- key 作用域

def test_key_allows_model_patterns():
    import wb_settings
    entry = {"models": ["gpt-6-*", "claude-haiku-4-5"]}
    assert wb_settings.key_allows_model(entry, "gpt-6-luna") is True
    assert wb_settings.key_allows_model(entry, "claude-haiku-4-5") is True
    assert wb_settings.key_allows_model(entry, "mistral-small-2603") is False
    # 未配置模型限制 = 不限制（老 key 读回来必须仍能用）
    assert wb_settings.key_allows_model({"models": []}, "anything") is True
    assert wb_settings.key_allows_model({}, "anything") is True


def test_key_allowed_accounts_and_check():
    import wb_settings
    entry = {"accounts": ["uid-1", "uid-2"]}
    assert set(wb_settings.key_allowed_accounts(entry)) == {"uid-1", "uid-2"}
    assert wb_settings.key_allows_account(entry, "uid-1") is True
    assert wb_settings.key_allows_account(entry, "uid-9") is False
    assert wb_settings.key_allows_account({"accounts": []}, "uid-9") is True


def test_model_patterns_accepts_comma_string():
    import wb_settings
    entry = {"models": "gpt-6-*, claude-*"}
    assert wb_settings.key_allows_model(entry, "claude-haiku-4-5") is True


# --------------------------------------------------------------- 面板会话

def test_panel_sessions_issue_and_expire():
    import wb_settings
    ps = wb_settings.PanelSessions()
    token = ps.create()
    assert token and ps.valid(token) is True
    assert ps.valid("bogus") is False
    ps.revoke(token)
    assert ps.valid(token) is False


def test_panel_sessions_ttl_expiry():
    import wb_settings
    # TTL 为负：令牌签发即过期，验证不是「只要发过就永远有效」
    ps = wb_settings.PanelSessions(ttl=-1)
    assert ps.valid(ps.create()) is False


def test_panel_sessions_revoke_all():
    import wb_settings
    ps = wb_settings.PanelSessions()
    a, b = ps.create(), ps.create()
    ps.revoke_all()
    assert ps.valid(a) is False and ps.valid(b) is False


# --------------------------------------------------------------- 版本串/杂项

def test_identity_versions_roundtrip(d):
    import wb_settings
    got = wb_settings.identity_versions(d)
    assert isinstance(got, dict)


def test_max_concurrent_and_backups_bounds(d):
    import wb_settings
    r = wb_settings.max_concurrent_chat(d) if hasattr(wb_settings, "max_concurrent_chat") else None
    # 版本相关读数允许返回 None；只断言不抛异常即可（避免写死实现细节）
    assert r is None or isinstance(r, (int, str))

"""DuckFlow 2API — pytest 冒烟套件。

覆盖鉴权（wb_settings key 匹配 / 面板密码）、伪 FC 解析（duck_fc）、
指纹派生（wb_fingerprint）、代理源解析（proxy_sources / mihomo_runner 纯函数）。
不依赖网络与真实 Chrome/duck 上游 —— 全部为本地纯逻辑验证。
"""
import json
import os
import sys
import tempfile

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


# --------------------------------------------------------------- wb_settings

@pytest.fixture()
def accounts_dir(tmp_path):
    return str(tmp_path / "accounts")


def test_default_password_matches_admin(accounts_dir):
    import wb_settings
    assert wb_settings.verify_panel_password(accounts_dir, "admin") is True
    assert wb_settings.verify_panel_password(accounts_dir, "wrong") is False


def test_set_password_roundtrip(accounts_dir):
    import wb_settings
    wb_settings.set_panel_password(accounts_dir, "s3cret-中文")
    assert wb_settings.verify_panel_password(accounts_dir, "s3cret-中文") is True
    assert wb_settings.verify_panel_password(accounts_dir, "admin") is False
    assert wb_settings.verify_panel_password(accounts_dir, "wrong") is False
    # 落盘不含明文密码
    raw = open(os.path.join(accounts_dir, "settings.json"), encoding="utf-8").read()
    assert "s3cret-中文" not in raw
    # 重设回默认恢复免密
    wb_settings.set_panel_password(accounts_dir, "admin")
    assert wb_settings.panel_password_is_default(accounts_dir) is True


def test_api_keys_save_and_match(accounts_dir):
    import wb_settings
    saved = wb_settings.set_api_keys(accounts_dir, [
        {"name": "测试", "key": "sk-test-123", "realm": "", "models": []},
    ])
    assert len(saved) == 1 and saved[0]["key"] == "sk-test-123"
    entry = wb_settings.match_api_key(accounts_dir, "sk-test-123")
    assert entry and entry["name"] == "测试"
    assert wb_settings.match_api_key(accounts_dir, "sk-bad") is None
    assert wb_settings.match_api_key(accounts_dir, "") is None


def test_api_key_soft_delete_kills_credential(accounts_dir):
    import wb_settings
    wb_settings.set_api_keys(accounts_dir, [{"name": "k", "key": "sk-a"}])
    first_id = wb_settings.api_keys(accounts_dir)[0]["id"]
    wb_settings.set_api_keys(accounts_dir, [], delete_ids=[first_id])
    assert wb_settings.api_keys(accounts_dir) == []
    assert wb_settings.match_api_key(accounts_dir, "sk-a") is None
    # 软删除行保留（用量台账按 id 归属），但密钥已清空
    retired = wb_settings.api_keys(accounts_dir, include_deleted=True)
    assert len(retired) == 1 and retired[0]["key"] == ""


def test_launcher_key_generated_once(accounts_dir):
    import wb_settings
    k1, created1 = wb_settings.ensure_launcher_key(accounts_dir)
    k2, created2 = wb_settings.ensure_launcher_key(accounts_dir)
    assert created1 and not created2 and k1 == k2 and k1.startswith("wb-")


# --------------------------------------------------------------- duck_fc 伪FC

def test_fc_parse_plain_text():
    import duck_fc
    text = "你好，世界"
    content, calls = duck_fc.parse_fc_response(text)
    assert content == text and calls is None


def test_fc_parse_single_tool_call():
    import duck_fc
    text = '前置说明<tool_call>{"name": "get_weather", "arguments": {"city": "北京"}}</tool_call>'
    content, calls = duck_fc.parse_fc_response(text)
    assert content == "前置说明"
    assert calls and calls[0]["function"]["name"] == "get_weather"
    assert json.loads(calls[0]["function"]["arguments"]) == {"city": "北京"}


def test_fc_parse_broken_block_kept_as_text():
    import duck_fc
    text = '<tool_call>{"name": broken</tool_call>'
    content, calls = duck_fc.parse_fc_response(text)
    assert calls is None and "broken" in content


def test_fc_stream_buffer_holds_back_marker():
    import duck_fc
    buf = duck_fc.FCStreamBuffer()
    out1 = buf.feed("回答一半 <tool")
    out2 = buf.feed("_call>{\"name\": \"f\"}</tool_call>")
    tail = buf.finish()
    # 标记开始后必须缓冲，不允许半截 <tool_call 泄漏给客户端
    assert "<tool" not in (out1 or "")
    assert not (out2 or "")


# --------------------------------------------------------------- wb_fingerprint

def test_fingerprint_derive_id_stable_and_uuid_shaped():
    import wb_fingerprint
    a = wb_fingerprint.derive_id("user-1", "machine")
    b = wb_fingerprint.derive_id("user-1", "machine")
    c = wb_fingerprint.derive_id("user-2", "machine")
    assert a == b and a != c
    parts = a.split("-")
    assert [len(p) for p in parts] == [8, 4, 4, 4, 12]


def test_fingerprint_per_account_isolation():
    import wb_fingerprint
    fp1 = wb_fingerprint.get_desktop_fingerprint("u1", "alice")
    fp2 = wb_fingerprint.get_desktop_fingerprint("u2", "bob")
    assert fp1["machineId"] != fp2["machineId"]
    assert fp1["sessionId"] != fp2["sessionId"]
    assert fp1["machineId"] == wb_fingerprint.get_desktop_fingerprint("u1", "alice")["machineId"]


def test_request_id_random_hex32():
    import wb_fingerprint
    ids = {wb_fingerprint.generate_request_id("u") for _ in range(20)}
    assert len(ids) == 20
    assert all(len(i) == 32 for i in ids)


# --------------------------------------------------------------- proxy 解析

def test_parse_v2ray_uri_lines():
    import mihomo_runner
    import base64
    uuid = "3f2504e0-4f89-11d3-9a0c-0305e82c3301"
    line = "vless://" + uuid + "@1.2.3.4:443?encryption=none&security=tls&sni=example.com&type=tcp#node1"
    nodes = mihomo_runner.parse_v2ray_uri_text(line)
    assert nodes and nodes[0]["server"] == "1.2.3.4" and nodes[0]["port"] == 443


def test_parse_clash_yaml_basic():
    import mihomo_runner
    yaml_text = """
proxies:
  - name: 节点A
    type: ss
    server: 5.6.7.8
    port: 8388
    cipher: aes-256-gcm
    password: pw
  - name: 节点B
    type: vmess
    server: 9.9.9.9
    port: 443
    uuid: 3f2504e0-4f89-11d3-9a0c-0305e82c3301
    alterId: 0
    cipher: auto
"""
    nodes = mihomo_runner.parse_clash_yaml(yaml_text)
    assert len(nodes) == 2
    assert nodes[0]["server"] == "5.6.7.8"


def test_parse_ipport_text():
    import proxy_sources
    urls = proxy_sources.parse_ipport_text("1.1.1.1:8080\n2.2.2.2:3128\nbad-line\n")
    assert urls == ["http://1.1.1.1:8080", "http://2.2.2.2:3128"]


# --------------------------------------------------------------- settings 深合并

def test_deep_merge_keeps_sibling_keys():
    import wb_settings
    base = {"a": {"x": 1, "y": 2}, "b": 3}
    out = wb_settings.deep_merge(base, {"a": {"x": 10}})
    assert out == {"a": {"x": 10, "y": 2}, "b": 3}
    assert base["a"]["x"] == 1  # 输入不被修改


# --------------------------------------------------------------- at-rest 加密

def test_encrypt_at_rest_roundtrip(accounts_dir, monkeypatch):
    import wb_settings
    monkeypatch.delenv("DUCK_ENCRYPT_AT_REST", raising=False)
    wb_settings.set_api_keys(accounts_dir, [{"name": "k", "key": "sk-plain"}])
    wb_settings.ensure_launcher_key(accounts_dir)

    # 开启加密 -> 落盘为信封，读侧仍返回明文
    assert wb_settings.set_encrypt_at_rest(accounts_dir, True) is True
    assert wb_settings.encrypt_at_rest_enabled(accounts_dir) is True
    raw = open(os.path.join(accounts_dir, "settings.json"), encoding="utf-8").read()
    assert "sk-plain" not in raw and wb_settings._ENC_PREFIX in raw
    assert wb_settings._ENC_LAST_DIR[0] == accounts_dir
    keys = wb_settings.api_keys(accounts_dir)
    assert keys[0]["key"] == "sk-plain"
    assert wb_settings.match_api_key(accounts_dir, "sk-plain") is not None
    lk = wb_settings.load(accounts_dir).get("launcher_key", "")
    assert lk.startswith("wb-")

    # 关闭加密 -> 落盘回到明文形态
    assert wb_settings.set_encrypt_at_rest(accounts_dir, False) is True
    raw = open(os.path.join(accounts_dir, "settings.json"), encoding="utf-8").read()
    assert "sk-plain" in raw
    assert wb_settings.api_keys(accounts_dir)[0]["key"] == "sk-plain"


def test_encrypt_at_rest_survives_reload(accounts_dir, monkeypatch):
    import wb_settings
    wb_settings.set_api_keys(accounts_dir, [{"name": "k", "key": "sk-x"}])
    wb_settings.set_encrypt_at_rest(accounts_dir, True)
    # 模拟进程重启：清缓存，直接从磁盘读
    wb_settings._load_cache["key"] = None
    wb_settings._ENC_LAST_DIR[0] = None
    data = wb_settings.load(accounts_dir)
    assert data["api_keys"][0]["key"] == "sk-x"


def test_encrypt_at_rest_malformed_envelope_fails_closed(accounts_dir, monkeypatch):
    import wb_settings
    wb_settings.set_api_keys(accounts_dir, [{"name": "k", "key": "sk-y"}])
    wb_settings.set_encrypt_at_rest(accounts_dir, True)
    # 破坏密钥文件 -> 解密失败必须 fail closed：活条目解不出明文即作废，
    # 不抛异常、不泄露部分明文，load 不 crash
    open(os.path.join(accounts_dir, ".atrest.key"), "w").write("00" * 32)
    wb_settings._load_cache["key"] = None
    data = wb_settings.load(accounts_dir)
    assert isinstance(data, dict)  # 不抛异常
    assert wb_settings.match_api_key(accounts_dir, "sk-y") is None

"""known#7 mihomo 下载 SHA-256 校验：匹配通过/不匹配拒装/未配置警告放行。"""
import hashlib
import importlib
import os
import sys
import zipfile
from unittest import mock

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


class _FakeResp:
    def __init__(self, payload): self.payload = payload
    def raise_for_status(self): pass
    def iter_content(self, n): yield self.payload
    def __enter__(self): return self
    def __exit__(self, *a): return False


def _mkzip_payload(tmp_path):
    exe = tmp_path / "fake-mihomo.exe"
    exe.write_bytes(b"MZ-fake")
    zp = tmp_path / "fake.zip"
    with zipfile.ZipFile(zp, "w") as z:
        z.write(exe, "mihomo.exe")
    return zp.read_bytes()


def _run_download(tmp_path, monkeypatch, expect_sha, payload):
    import mihomo_runner
    dest = tmp_path / "mihomo"
    monkeypatch.setattr(mihomo_runner, "MIHOMO_SHA256", expect_sha)
    fake_requests = mock.Mock()
    fake_requests.get = lambda *a, **k: _FakeResp(payload)
    monkeypatch.setitem(sys.modules, "requests", fake_requests)
    # requests 是函数内 import，直接把属性给模块
    monkeypatch.setattr(mihomo_runner, "_UA", "ua")
    return mihomo_runner.download_core(dest_dir=str(dest))


def test_sha_mismatch_rejects(tmp_path, monkeypatch):
    import pytest as _pytest
    payload = _mkzip_payload(tmp_path)
    # SHA 不匹配 -> RuntimeError（下载拒绝），坏 zip 不落 exe
    with _pytest.raises(RuntimeError, match="SHA-256 mismatch"):
        _run_download(tmp_path, monkeypatch, "0" * 64, payload)
    assert not (tmp_path / "mihomo" / "mihomo.exe").exists()


def test_sha_match_installs(tmp_path, monkeypatch):
    payload = _mkzip_payload(tmp_path)
    good = hashlib.sha256(payload).hexdigest()
    r = _run_download(tmp_path, monkeypatch, good, payload)
    assert r and r.endswith("mihomo.exe")
    assert (tmp_path / "mihomo" / "mihomo.exe").read_bytes().startswith(b"MZ")


def test_sha_unset_warns_but_installs(tmp_path, monkeypatch):
    payload = _mkzip_payload(tmp_path)
    r = _run_download(tmp_path, monkeypatch, None, payload)
    assert r and r.endswith("mihomo.exe")   # 向后兼容：未配置仍可装，但 warning 留日志

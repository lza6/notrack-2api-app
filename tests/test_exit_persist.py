"""known#10 出口池持久化：面板注册的出口落盘、重启恢复、remove 同步删除。"""
import json
import os
import sys

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


@pytest.fixture(autouse=True)
def _isolated_persist(tmp_path):
    import duck_pure
    path = str(tmp_path / "duck-exits.json")
    duck_pure.PureDuckPool.set_persist_path(path)
    duck_pure.PureDuckPool.PERSIST_PATH = path
    yield path
    duck_pure.PureDuckPool.set_persist_path(None)


def test_panel_upsert_persists(tmp_path):
    import duck_pure
    pool = duck_pure.PureDuckPool()
    pool.upsert_exit("home-1", "http://u:p@1.2.3.4:8080")
    data = json.load(open(tmp_path / "duck-exits.json", encoding="utf-8"))
    assert data == {"home-1": "http://u:p@1.2.3.4:8080"}


def test_env_register_not_persisted(tmp_path):
    import duck_pure
    pool = duck_pure.PureDuckPool()
    pool.register_exit("env-exit", "http://5.6.7.8:80")   # 非 panel 来源
    assert not (tmp_path / "duck-exits.json").exists()
    pool.register_exit("panel-exit", None, panel=True)     # panel 来源落盘
    data = json.load(open(tmp_path / "duck-exits.json", encoding="utf-8"))
    assert data == {"panel-exit": None}   # env 来源不混入


def test_restart_restores(tmp_path):
    import duck_pure
    pool = duck_pure.PureDuckPool()
    pool.upsert_exit("a", "http://1.1.1.1:80")
    pool.upsert_exit("b", None)
    # 模拟重启：新池从盘恢复
    pool2 = duck_pure.PureDuckPool()
    n = pool2.load_persisted()
    assert n == 2
    pool2._pick()  # 懒注册会消费 _registered；先记录
    # b 是直连（None）也恢复
    pool3 = duck_pure.PureDuckPool()
    pool3.load_persisted()
    assert pool3._registered["b"] is None


def test_remove_deletes_from_disk(tmp_path):
    import duck_pure
    pool = duck_pure.PureDuckPool()
    pool.upsert_exit("gone", "http://1.1.1.1:80")
    pool.remove_exit("gone")
    data = json.load(open(tmp_path / "duck-exits.json", encoding="utf-8"))
    assert data == {}


def test_corrupt_file_fails_safe(tmp_path):
    import duck_pure
    (tmp_path / "duck-exits.json").write_text("{broken", encoding="utf-8")
    pool = duck_pure.PureDuckPool()
    assert pool.load_persisted() == 0   # 不抛异常

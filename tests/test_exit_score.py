"""B3 出口质量评分：评分口径、选取排序、池集成。"""
import os
import sys
import threading

import pytest

GATEWAY = os.path.join(os.path.dirname(os.path.dirname(os.path.abspath(__file__))), "gateway")
if GATEWAY not in sys.path:
    sys.path.insert(0, GATEWAY)


def test_new_exit_neutral_score():
    import exit_score
    s = exit_score.ExitScore()
    assert s.score() == exit_score.NEUTRAL_SCORE


def test_all_success_scores_higher_than_all_fail():
    import exit_score
    good = exit_score.ExitScore()
    bad = exit_score.ExitScore()
    for _ in range(10):
        good.record_success(1.0)
        bad.record_failure("upstream 500")
    assert good.score() > 90
    assert bad.score() < 10
    assert good.score() > bad.score()


def test_latency_bonus_orders_fast_over_slow():
    import exit_score
    fast = exit_score.ExitScore()
    slow = exit_score.ExitScore()
    for _ in range(10):
        fast.record_success(1.0)
        slow.record_success(12.0)
    assert fast.score() > slow.score()


def test_consecutive_fails_drag_score_down_then_recover():
    import exit_score
    s = exit_score.ExitScore()
    for _ in range(5):
        s.record_failure("x")
    low = s.score()
    s.record_success(1.0)
    assert s.score() > low


def test_sliding_window_forgets_old_failures():
    import exit_score
    s = exit_score.ExitScore(window=5)
    for _ in range(5):
        s.record_failure("x")
    for _ in range(5):
        s.record_success(1.0)
    snap = s.snapshot()
    assert snap["recent_total"] == 5 and snap["recent_ok"] == 5


def test_scoreboard_thread_safety():
    import exit_score
    board = exit_score.ExitScoreboard()
    def worker(i):
        for _ in range(50):
            board.record_success("e%d" % (i % 3), 1.0)
            board.record_failure("e%d" % (i % 3), "err")
    threads = [threading.Thread(target=worker, args=(i,)) for i in range(8)]
    for t in threads: t.start()
    for t in threads: t.join()
    snap = board.snapshot()
    assert set(snap) == {"e0", "e1", "e2"}
    assert all(0 <= s["score"] <= 100 for s in snap.values())


def test_pure_pool_list_exits_includes_score():
    import duck_pure
    import exit_score
    pool = duck_pure.PureDuckPool()
    pool.register_exit("exitA", None)
    exit_score.BOARD.record_success("exitA", 1.0)
    # register 只是登记；先 pick 一次让懒注册真正建档，再释放
    e = pool._pick()
    assert e is not None
    with pool._cond:
        e["busy"] = False
        pool._cond.notify_all()
    exits = pool.list_exits()
    assert exits and exits[0]["name"] == "exitA"
    assert exits[0]["score"] is not None and exits[0]["score"] > 0
    pool.remove_exit("exitA")
    exit_score.BOARD._scores.pop("exitA", None)


def test_pick_prefers_higher_scored_exit():
    import duck_pure
    import exit_score
    pool = duck_pure.PureDuckPool()
    pool.register_exit("good2", None)
    pool.register_exit("bad2", None)
    for _ in range(10):
        exit_score.BOARD.record_success("good2", 1.0)
        exit_score.BOARD.record_failure("bad2", "dead")
    first = pool._pick()
    assert first is not None and first["name"] == "good2"
    # 清理：释放忙标志 + 移除出口 + 清记分板，避免污染同进程其它测试
    with pool._cond:
        first["busy"] = False
        pool._cond.notify_all()
    pool.remove_exit("good2")
    pool.remove_exit("bad2")
    for n in ("good", "bad", "good2", "bad2", "exitA"):
        exit_score.BOARD._scores.pop(n, None)

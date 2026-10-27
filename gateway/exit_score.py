"""exit_score.py —— 出口质量评分（B3：节点质量评分）。

两个出口池（duck_client.DuckClientPool / duck_pure.PureDuckPool）共享这套
评分：每次请求成败都记一笔，出口按分数排序后选取，坏节点自然沉底。

评分口径（0~100）：
    score = 100 * w_success + 时延奖励 - 惩罚
    - w_success：最近 N 次的成功率（N=SCORE_WINDOW，默认 20），占 70 分；
    - 时延奖励：最近成功请求的 EMA 时延，<2s 满奖励 20 分，>10s 0 分，占 20 分；
    - 惩罚：连续失败每次 -10，最低压到 0，占 10 分起评。
新出口（无样本）给 60 的中性分：不抢最优、也不至于永远轮不到。

纯标准库、线程安全、进程内存态——评分丢了就重学，不值得落盘。
"""
from __future__ import annotations

import threading
import time

SCORE_WINDOW = 20
NEUTRAL_SCORE = 60.0
SUCCESS_WEIGHT = 70.0
LATENCY_WEIGHT = 20.0
LATENCY_FULL_SECONDS = 2.0
LATENCY_ZERO_SECONDS = 10.0
CONSECUTIVE_FAIL_PENALTY = 10.0
# 惩罚只作用于这 10 分的余量：分数下限 = 100 - 70 - 20 - 余量。
PENALTY_HEADROOM = 10.0


class ExitScore:
    """一个出口的滑动窗口成败与时延记录。线程安全。"""

    def __init__(self, window: int = SCORE_WINDOW):
        self._lock = threading.Lock()
        self._window = window
        self._results: list[bool] = []      # 最近 N 次，True=成功
        self._latency_ema: float = 0.0      # 成功请求时延的 EMA（秒）
        self._consecutive_fails = 0
        self._last_error = ""
        self._last_success = 0.0
        self._total_ok = 0
        self._total_fail = 0

    def record_success(self, latency_seconds: float | None = None):
        with self._lock:
            self._results.append(True)
            if len(self._results) > self._window:
                self._results.pop(0)
            self._consecutive_fails = 0
            self._last_success = time.time()
            self._total_ok += 1
            if latency_seconds is not None and latency_seconds >= 0:
                alpha = 0.3
                self._latency_ema = (latency_seconds if self._latency_ema == 0.0
                                     else alpha * latency_seconds + (1 - alpha) * self._latency_ema)

    def record_failure(self, error: str = ""):
        with self._lock:
            self._results.append(False)
            if len(self._results) > self._window:
                self._results.pop(0)
            self._consecutive_fails += 1
            self._last_error = str(error or "")[:300]
            self._total_fail += 1

    def score(self) -> float:
        with self._lock:
            return self._score_locked()

    def _score_locked(self) -> float:
        # 调用方必须已持有 _lock（snapshot 复用，避免可重入死锁）。
        if not self._results:
            return NEUTRAL_SCORE
        success_rate = sum(self._results) / len(self._results)
        value = SUCCESS_WEIGHT * success_rate
        if self._latency_ema > 0:
            if self._latency_ema <= LATENCY_FULL_SECONDS:
                latency_bonus = 1.0
            elif self._latency_ema >= LATENCY_ZERO_SECONDS:
                latency_bonus = 0.0
            else:
                latency_bonus = ((LATENCY_ZERO_SECONDS - self._latency_ema)
                                 / (LATENCY_ZERO_SECONDS - LATENCY_FULL_SECONDS))
            value += LATENCY_WEIGHT * latency_bonus
        value += PENALTY_HEADROOM - min(self._consecutive_fails * CONSECUTIVE_FAIL_PENALTY,
                                        PENALTY_HEADROOM)
        return round(max(0.0, min(100.0, value)), 1)

    def snapshot(self) -> dict:
        with self._lock:
            return {
                "score": self._score_locked(),
                "recent_ok": sum(self._results),
                "recent_total": len(self._results),
                "consecutive_fails": self._consecutive_fails,
                "latency_ema_s": round(self._latency_ema, 2) if self._latency_ema else None,
                "last_error": self._last_error,
                "last_success": self._last_success,
                "total_ok": self._total_ok,
                "total_fail": self._total_fail,
            }


class ExitScoreboard:
    """name -> ExitScore 的注册表。线程安全，按需自动建档。"""

    def __init__(self):
        self._lock = threading.Lock()
        self._scores: dict[str, ExitScore] = {}

    def get(self, name: str) -> ExitScore:
        with self._lock:
            entry = self._scores.get(name)
            if entry is None:
                entry = ExitScore()
                self._scores[name] = entry
            return entry

    def record_success(self, name: str, latency_seconds: float | None = None):
        self.get(name).record_success(latency_seconds)

    def record_failure(self, name: str, error: str = ""):
        self.get(name).record_failure(error)

    def score_of(self, name: str) -> float:
        return self.get(name).score()

    def snapshot(self) -> dict:
        with self._lock:
            return {name: entry.snapshot() for name, entry in self._scores.items()}


BOARD = ExitScoreboard()

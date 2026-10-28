# 技能：高并发 / 稳定性检查清单

## 适用场景
改动涉及并发控制、连接池、出口池、缓存、限流时。

## 前置读取
policy.md §2（压测只打只读/错误路径）· gateway/duck_pure.py（信号量/条件变量）· exit_score.py

## 清单
### 并发安全
- [ ] 共享状态有锁；锁内不做 IO、不调用会再取锁的方法（ExitScore 曾因此死锁）
- [ ] 条件变量 `wait` 有超时与退出条件，不会永久挂起
- [ ] 每请求 `busy` 标志在 finally 中释放（异常路径也不漏）
- [ ] 每 key 并发槽（`_acquire_key_slot`）获取后必有 release

### 资源
- [ ] 出口/会话/文件句柄在异常路径关闭（`finally`）
- [ ] 出口池不会无限增长（`max_exits` 上限生效）
- [ ] 后台线程有 stop 事件与 join 超时

### 可观测
- [ ] 失败计数（record_error / exit_score）能定位到出口/账号/模型
- [ ] 健康检查 `/health` 在高压下仍快速返回（实测 P95 20ms / QPS 1790 基线）

### 压测口径
- [ ] 只打 `/health`、`/v1/models`、`/panel/status`、畸形 body 400 路径
- [ ] 记录 n / conc / QPS / P95 / P99 / 状态码分布，写入 evidence
- [ ] 压后立即 `/health` 复验服务存活

## 基线（2026-10-28 本机实测）
/health n=1000 conc=50 → QPS 1790, P95 20ms, P99 21ms, 0 错误
/v1/models n=600 conc=30 → QPS 2423, P95 13ms
/panel/status n=600 conc=30 → QPS 2757, P95 12ms
POST 畸形 JSON n=300 conc=30 → QPS 1069, P95 17ms（全 400）

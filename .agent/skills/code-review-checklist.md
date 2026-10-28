# 技能：代码审查清单

## 适用场景
提交前自审 / 独立 reviewer 审查。

## 前置读取
本轮 `git diff` · policy.md §4 · test_ledger.md

## 清单
### 阻塞项（发现即 Request Changes）
- [ ] 鉴权/权限绕过；错误消息泄露 key/token/路径
- [ ] 静默失败：异常被 `except: pass` 吞掉且无日志
- [ ] 空/失败结果被当成成功返回（本项目已踩：空 completion 回 200）
- [ ] 死锁/竞态：持锁调用自身取锁（已踩：ExitScore.snapshot）
- [ ] 声明的验证结果与实际不符（伪造证据）
- [ ] 在 `<thread>` 外共享可变全局无锁保护

### 需改进
- [ ] 裸 `except Exception: pass` 无最少日志
- [ ] 重复实现（同一逻辑在 pure / CDP 两处各写一份，改一处漏另一处）
- [ ] 魔数散落（超时、上限、轮询间隔未进 wb_settings 或模块常量）
- [ ] 文档字符串与实现不符（已踩：`_is_panel_route` 注释与 bfc7906 行为矛盾）

### 建议
- [ ] 新增环境变量是否写进 README/AGENTS
- [ ] 是否补了 test_ledger 接缝行

## 输出格式
Summary(BLUF) → Critical Issues(file:line) → Required Changes → Suggestions → Verdict

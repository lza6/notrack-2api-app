# 技能：新增功能

## 适用场景
给网关注入新能力（新通道、新策略、新面板卡片）。

## 前置读取
policy.md §3（复杂度分级）· .agent/memory/known-issues.md · docs/plan-b5-split.md（若涉巨石文件）

## 步骤
1. 分级：trivial/standard/complex/high-risk（policy §3 判定表），high-risk 先出方案再执行。
2. 复用优先：先 grep `gateway/` 现有实现；能否用扩展点（`proxy_pool_ext` 后台任务、
   `exit_score` 记分板、`wb_settings` 配置项、`wb_logstore` 审计日志）而非新机制。
3. 配置项统一放 `wb_settings`（带默认值 + 上限 + 注释说明取舍），不要新增散落的 env 读取。
4. 先写失败测试（TDD），再最小实现。
5. 触达接缝 → 复测（test_ledger.md 对应行标 pending-retest，通过后回 locked）。
6. 同步：README（若是用户可见项）· CHANGELOG · 记忆 · test_ledger。

## 验收标准
- 用户路径真实跑通（curl 或 exe 真机），不是只有单测
- 失败路径有清晰错误消息且不泄露敏感数据
- 有回滚方式（revert 单提交即可）

## 常见坑
- 多通道并存（pure / CDP）时，功能要**两处都覆盖**或明确只支持其一并写进文档。
- 懒加载结构（如 PureDuckPool._registered）在 list 接口里容易漏展示。

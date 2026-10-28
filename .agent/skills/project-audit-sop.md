# 技能：项目审计 SOP

## 适用场景
接到"全量审计 / 终验 / 交付前检查"类指令。

## 前置读取
policy.md · workflow_status.md · .agent/memory/*（全部）· test_ledger.md · evidence/

## 步骤（顺序固定）
1. **缺口盘点**：列出要求交付物 vs 实际存在（policy/workflow/test_ledger/evidence/CHANGELOG/AGENTS/skills/memory）。
2. **真实验证矩阵**（不 Credential 造假）：起服务 → 接口矩阵 → 鉴权四态 → 真实对话（流式+非流式）
   → 用量台账 → 出口/管理端点（带 panel token）→ 压测 → exe 真机。原始输出一律落 `evidence/raw/`。
3. **可疑信号必复现**：某次 200 但内容为空 / 状态码与预期不符 / 日志出现异常栈 → 立即复现 3 次以上定级。
4. **分级修复**：P0 → P1 → P2；每项写清改了什么/为什么/影响面/验证/回滚。
5. **证据 JSON**：`evidence/T-*.json`，commands_executed 必须含真实 cmd + exit_code + 原始输出尾段。
6. **独立审查**：reviewer 只读，有罪推定，Verdict 才允许 Done。
7. **文档同步**：CHANGELOG / README / workflow_status / test_ledger / 记忆全部对齐事实。
8. **提交发布**：原子提交 → push main → tag → Release（禁 force push）。

## 验收标准
- 每个"通过"都有原始命令输出可回溯
- 未验证项在 test_ledger「未覆盖」表登记，不隐藏
- 工作树干净

## 常见坑
- 把历史轮次的验证结论当本轮证据（必须重跑或明确标注为历史）
- 压测把生成类接口打爆（policy §2 禁止）
- 面板端点用 query token 调不通就判定功能坏了（应使用 `X-Panel-Token` 头）

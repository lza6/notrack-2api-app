# Archive Manifest — 2026-10-28

| 原路径 | 归档路径 | 类型 | 任务总数 | 已闭环 | 已过时 | 不适用 | 用户决策 | 删除时间 | 回滚方式 |
|---|---|---|---|---|---|---|---|---|---|
| docs/计划书/下一步改进指南.md | docs/archive/plans/20261028/下一步改进指南.md | 改进指南(v2) | 24 | 11 | 3 | 2 | 8(全部已拍板执行或记录) | 2026-10-28 | git 历史可恢复 |

## 闭环判定摘要
- **已闭环**（v1.1/v1.2/v1.9.0 实施）: 鉴权复验(P1-2)、.gitignore 卫生(P2-4/P1-5)、backend 单源化(P1-1/P1-4)、README 同步(P2-3)、requirements.txt、pytest 基线(T1-T4)、at-rest 加密(P2-6)、出口质量评分(P3-3)、指纹面补齐
- **已过时**: F6 零测试/零 requirements（已建立）；F11 README 描述旧结构（已同步）
- **不适用**: 方案A双拷贝同步（被方案B取代）
- **保留未闭环项**（已提炼至 .agent/memory/known-issues.md，原文档归档）:
  x-fe-version 漂移自愈(P2-5→known#4)、EBUSY 脚本化(P1-3→known#6)、mihomo 哈希校验(P2-7→known#7)、
  dashboard score 展示(P3→known#8)、B5 巨石拆分(docs/plan-b5-split.md 待批)
- 决策依据: 用户 2026-10-28 拍板「部分归档」——已闭环部分归档，未闭环项提炼至记忆文件

# 审计历史（audit-history）

| 轮次 | 日期 | 范围 | 发现 | 处置 |
|---|---|---|---|---|
| R1 | 2026-10-27 | 只读扫描 + git 历史 | 零测试/零 requirements；backend 双拷贝 drift；EBUSY；鉴权疑云 | 产出《下一步改进指南》v2（已归档） |
| R2 | 2026-10-28 | Phase B 实施 B1–B4 | 见 decisions.md | v1.9.0 |
| R3 | 2026-10-28 | 计划文档闭环 + 单源化 | backend drift 实锤（缺 exit_score.py）；`/updates` shim 态 AttributeError（真机才暴露）；鉴权 401/200 两说=两部署态；bind 仅回环 | v1.9.1 |
| R4 | 2026-10-28 | known-issues 清零 | 面板出口管理只操作 CDP 池而 pure 为默认通道；pure list 漏懒注册出口 | v1.9.2 |
| R5 | 2026-10-28 | 审计基础设施 + 复验 | **静默空回复 P1**（空 completion 回 200）；**fe-version 自愈未接主路径**（source 恒 builtin）+ 正则不认首页真实裸 token | v1.9.3 |

## 每轮固定动作
1. 起服务跑接口/鉴权/对话矩阵，原始输出落 evidence/raw/
2. 可疑信号复现 3 次以上再定级
3. 压测只打只读/错误路径
4. exe 真机（打包类改动必做）
5. 独立审查后才标 Done

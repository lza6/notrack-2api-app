# DuckFlow 2API — 项目规格与任务追踪（权威来源）

> 更新：2026-10-27 · 维护者：主控代理 · 项目路径：`Desktop/duck-2api/duck2api-hub`
> 仓库：https://github.com/lza6/notrack-2api-app（子目录 duck2api-hub/）

## 项目定位
duck.ai（DuckDuckGo Duck.ai）→ OpenAI 兼容网关 + Web 看板 + Windows 桌面 exe。
**无账号体系**（duck 匿名可用）、**无积分**、**单上游**。多 IP 通过 Chrome CDP 出口池实现。

## 核心架构
```
OpenAI 客户端 → wb_proxy.py（网关: /v1/*, 多Key, 面板）
  → duck_upstream.py（SSE 适配）
  → duck_client.py（出口池: 每出口=独立Chrome CDP+可选代理）
  → duck.ai（挑战JS真浏览器执行; IP信誉层需住宅代理）
```

## 硬性事实（实测结论，勿再质疑）
1. x-vqd-hash-1 挑战 JS 每请求不同（v4），必须真浏览器执行；Node shim 产出被拒（ERR_CHALLENGE）
2. duck.ai 对数据中心 IP 硬拦 418 ERR_BN_LIMIT（连官方 UI 自身请求都拦）→ **必须住宅代理**
3. /duckchat/v1/status 是 **GET**（POST 404），带 x-vqd-accept:1 返回挑战
4. duck 模型 6 个：gpt-6-luna(默认)/gpt-5.4-mini/claude-haiku-4-5/mistral-small-2603/tinfoil/gpt-oss-120b/tinfoil/gemma4-31b
5. SSE 帧格式见 duck_upstream.py 头注释

## 当前状态
- 鉴权矩阵（401/200/400 模型限制）：✅ 已验证
- 免密直进（本机回环+未设密码）：✅ 已验证；**注意 _key_ok 不得被免密豁免（安全修复 bfc7906）**
- UI：账号体系/OAuth/签到/积分/双区域 全部移除（d2f690c）
- 待办：见 known-issues.md

## 禁止事项
- 禁止恢复 workbuddy 账号/OAuth/积分/双区域功能（用户明确否决）
- 禁止全局 taskkill chrome.exe（会误杀用户浏览器）
- 禁止纯 Node/curl 执行挑战（必被 418）

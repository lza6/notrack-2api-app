# -*- coding: utf-8 -*-
"""duck_fc.py -- duck.ai 伪 Function Calling 层

duck.ai 协议不支持 OpenAI function calling（无 tool_calls 返回机制）。
本模块用 prompt 注入模拟完整 FC 闭环：

  请求侧：
    tools/tool_choice/tool_messages( role:"tool" / assistant.tool_calls )
      -> 序列化为协议文本，注入 system 前缀
  响应侧：
    模型文本中的 <tool_call>{...}</tool_call> 块
      -> 解析回标准 OpenAI tool_calls 结构（finish_reason="tool_calls"）

协议设计（对模型友好 + 对客户端透明）：
  - 模型侧看到的是一段明确指令 + JSON schema 清单
  - 模型想调用工具时输出 <tool_call>{"name":..,"arguments":{..}}</tool_call>
  - 多工具并行 = 多个连续块
  - 解析失败降级为纯文本（绝不吞内容）

流式：内容里一旦出现 <tool_call> 前缀即缓冲不再外发；
     流结束解析出 tool_calls 后补发 finish_reason="tool_calls"。
"""
from __future__ import annotations

import json
import re
import time

FC_MARKER_OPEN = "<tool_call>"
FC_MARKER_CLOSE = "</tool_call>"

_FC_BLOCK_RE = re.compile(
    r"<tool_call>\s*(\{.*?\})\s*</tool_call>", re.DOTALL)
# 流式检测：开头即缓冲（未闭合也算）
_FC_OPEN_RE = re.compile(r"<tool_call>\s*\{.*", re.DOTALL)


# ── 请求侧：tools -> system 文本 ────────────────────────────────────────

def build_fc_system(tools, tool_choice=None) -> str:
    """把 OpenAI tools 定义转成注入 system 的 FC 协议说明。"""
    defs = []
    for t in tools or []:
        if not isinstance(t, dict) or t.get("type") != "function":
            continue
        fn = t.get("function") or {}
        defs.append({
            "name": fn.get("name") or "",
            "description": fn.get("description") or "",
            "parameters": fn.get("parameters") or {"type": "object", "properties": {}},
        })
    if not defs:
        return ""
    parts = [
        "# Tool Calling Protocol",
        "",
        "You have access to the following tools (functions):",
        "",
        "```json",
        json.dumps(defs, ensure_ascii=False, indent=1),
        "```",
        "",
        "To call one or more tools, output ONLY tool call blocks in this exact format:",
        "<tool_call>{\"name\": \"function_name\", \"arguments\": {\"arg\": \"value\"}}</tool_call>",
        "",
        "Rules:",
        "- You may output multiple <tool_call> blocks to call several tools in parallel.",
        "- When you intend to call tools, do NOT write any other text besides the blocks.",
        "- Arguments MUST be valid JSON matching the tool's parameters schema.",
        "- If you don't need any tool, just answer the user normally in plain text.",
        "- After tool results are provided (messages with role 'tool'), use them to continue.",
    ]
    if isinstance(tool_choice, dict) and tool_choice.get("type") == "function":
        forced = (tool_choice.get("function") or {}).get("name")
        if forced:
            parts.append("- You MUST call the tool '%s' now." % forced)
    elif tool_choice == "required":
        parts.append("- You MUST call at least one tool now.")
    return "\n".join(parts)


def inject_fc(messages, tools, tool_choice=None):
    """返回注入 FC 协议后的 messages（原列表不变，浅拷贝新列表）。"""
    sys_block = build_fc_system(tools, tool_choice)
    if not sys_block:
        return list(messages or [])
    out = []
    injected = False
    for m in messages or []:
        if not injected and isinstance(m, dict) and m.get("role") in ("system", "developer"):
            out.append(dict(m, content=(str(m.get("content") or "") + "\n\n" + sys_block)))
            injected = True
        else:
            out.append(m)
    if not injected:
        out.insert(0, {"role": "system", "content": sys_block})
    return out


# ── 请求侧：role:"tool" / assistant.tool_calls -> 文本 ─────────────────

def translate_tool_messages(messages):
    """把 OpenAI FC 会话轮次转成 duck 能理解的纯文本轮次。

    - assistant 消息带 tool_calls -> 转成 <tool_call> 块文本
    - role:"tool" 消息 -> 转成 role:"user" 的工具结果文本块
    """
    out = []
    for m in messages or []:
        if not isinstance(m, dict):
            continue
        role = m.get("role")
        if role == "assistant" and m.get("tool_calls"):
            blocks = []
            for tc in m["tool_calls"]:
                fn = tc.get("function") or {}
                try:
                    args = json.loads(fn.get("arguments") or "{}")
                except (ValueError, TypeError):
                    args = {"_raw": fn.get("arguments")}
                blocks.append("<tool_call>%s</tool_call>" % json.dumps(
                    {"name": fn.get("name"), "arguments": args}, ensure_ascii=False))
            out.append({"role": "assistant",
                        "content": "\n".join(blocks) or str(m.get("content") or "")})
        elif role == "tool":
            tool_call_id = m.get("tool_call_id") or ""
            out.append({"role": "user",
                        "content": "[Tool result for call %s]\n%s"
                                   % (tool_call_id, str(m.get("content") or ""))})
        else:
            out.append(m)
    return out


# ── 响应侧：模型文本 -> tool_calls ─────────────────────────────────────

def parse_fc_response(text: str):
    """解析模型文本。返回 (content_or_None, tool_calls_or_None)。

    - 有 <tool_call> 块：content=块外文本(若非空)，tool_calls=标准 OpenAI 结构
    - 无块：content=原文, tool_calls=None
    解析失败的块降级为文本保留（不吞内容）。
    """
    if not text or FC_MARKER_OPEN not in text:
        return text, None
    tool_calls = []
    leftover_parts = []
    last = 0
    idx_name = 0
    for m in _FC_BLOCK_RE.finditer(text):
        leftover_parts.append(text[last:m.start()])
        last = m.end()
        try:
            call = json.loads(m.group(1))
            name = call.get("name")
            if not name:
                raise ValueError("missing name")
            args = call.get("arguments")
            args_str = args if isinstance(args, str) else json.dumps(
                args if args is not None else {}, ensure_ascii=False)
            idx_name += 1
            tool_calls.append({
                "id": "call_%s_%d" % (idx_name, abs(hash(name)) % 10**8),
                "type": "function",
                "function": {"name": name, "arguments": args_str},
            })
        except (ValueError, TypeError):
            # 解析失败 -> 原样保留为文本
            leftover_parts.append(m.group(0))
    leftover_parts.append(text[last:])
    leftover = "".join(leftover_parts).strip()
    if not tool_calls:
        return text, None
    return (leftover or None), tool_calls


# ── 流式支持：缓冲检测 ─────────────────────────────────────────────────

class FCStreamBuffer:
    """流式 FC 检测：检测到 <tool_call> 开始缓冲，流结束后整体解析。

    用法：
        buf = FCStreamBuffer()
        for chunk in stream:
            for out in buf.feed(chunk):   # out=None 表示被缓冲（不外发）
                yield out                  # out 为普通文本 delta
        tail = buf.finish()                # 返回 (剩余文本delta, tool_calls|None)
    """
    def __init__(self):
        self._buf = ""
        self._buffering = False
        self._emitted = ""

    def feed(self, chunk: str):
        """喂入增量。返回可安全外发的文本列表（可能为空）。"""
        self._buf += chunk
        if not self._buffering and _FC_OPEN_RE.search(self._buf):
            self._buffering = True
        if self._buffering:
            return []
        # 无 FC 迹象：外发，但保留尾部 12 字符防 "<tool_call>" 跨块
        keep = 12
        if len(self._buf) <= keep:
            return []
        out, self._buf = self._buf[:-keep], self._buf[-keep:]
        self._emitted += out
        return [out]

    def finish(self):
        """流结束。返回 (未外发的剩余文本delta列表, tool_calls|None)。"""
        tail_text = self._buf
        self._buf = ""
        if self._buffering:
            content, tool_calls = parse_fc_response(tail_text)
            if tool_calls:
                return [], tool_calls
            # 降级：整段当普通文本返回
            return ([tail_text] if tail_text else []), None
        self._emitted += tail_text
        return ([tail_text] if tail_text else []), None


def fc_finish_chunk(model, chunk_id):
    """构造 finish_reason="tool_calls" 的 SSE chunk（供 wb_proxy 用）。"""
    return {
        "id": chunk_id,
        "object": "chat.completion.chunk",
        "created": int(time.time()),
        "model": model,
        "choices": [{"index": 0, "delta": {}, "finish_reason": "tool_calls"}],
    }

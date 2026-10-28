# -*- coding: utf-8 -*-
"""duck_pure.py -- duck.ai 纯协议客户端（零浏览器）

架构（2026-10-28 打通验证）：
  curl_cffi(impersonate='chrome', TLS/JA3+HTTP2 指纹伪装)
  + GET /duckchat/v1/status 拿挑战（每次变体不同）
  + Node vm 沙箱执行挑战（duck_challenge_shim.mjs：Chrome 指纹 8 类模拟
    + 自指万能 Proxy 兜底；client_hashes 检测聚合值已对齐真 Chrome）
  + 官方 35488 后处理（duck_vqd_answer.mjs：SHA-256/b64 + meta 补 origin/stack）
  + POST /duckchat/v1/chat（durableStream：Python cryptography 生成 RSA JWK，
    带 use:'enc'；x-fe-signals 4 事件序列）

对比 CDP 通道（duck_client.py）：单次请求 ~1s vs 15-20s，零 Chrome 实例，
适合 new-api 等网关直连集成。CDP 通道保留作为兜底（DUCK_PURE=0 切换）。

依赖：curl_cffi、cryptography、node（挑战沙箱）。
"""
from __future__ import annotations

import base64
import json
import os
import re
import queue
import subprocess
import threading
import time
import uuid

from curl_cffi import requests as creq

UA = ('Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 '
      '(KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36')
IMPERSONATE = 'chrome'
_STATUS_URL = 'https://duck.ai/duckchat/v1/status'
_CHAT_URL = 'https://duckchat'  # placeholder, replaced below
_CHAT_URL = 'https://duck.ai/duckchat/v1/chat'
_FE_VERSION_PREFIX = 'serp_20261027_103404_ET-bfbdb13e3759d1fae557b46cb8f446ef5962b787'

_DIR = os.path.dirname(os.path.abspath(__file__))

# ── x-fe-version 漂移自愈（known#4，方案D）────────────────────────────────
# duck.ai 前端发版后旧版本串会被 418 拒绝且 shim 无法救——唯一出路是从
# duck.ai 首页抓最新的 serp_* 串。这里做成「失效才抓、抓到即热更」：
# 进程内存热更新 + 落盘缓存（下次启动直接用新值，不用再等一次失败）。
_FE_VERSION_LOCK = threading.Lock()
_FE_VERSION_STATE = {"value": _FE_VERSION_PREFIX, "refreshed_at": 0.0,
                     "last_error": "", "source": "builtin"}
_FE_VERSION_CACHE = os.path.join(_DIR, ".fe-version-cache.json")
_FE_VERSION_MIN_INTERVAL = 600.0   # 自愈抓取最小间隔（秒），防抖


def current_fe_version() -> str:
    with _FE_VERSION_LOCK:
        return _FE_VERSION_STATE["value"]


def fe_version_status() -> dict:
    with _FE_VERSION_LOCK:
        return dict(_FE_VERSION_STATE)


def refresh_fe_version(session=None, force: bool = False, log=None) -> bool:
    """从 duck.ai 首页抓最新 serp_* 版本串并热更。成功返回 True。

    - 有缓存文件且未过期（force=False 时受最小间隔约束）优先用缓存；
    - 抓取失败静默保留旧值（调用方的 418 重试逻辑不受影响）。
    """
    now = time.time()
    with _FE_VERSION_LOCK:
        if not force and now - _FE_VERSION_STATE["refreshed_at"] < _FE_VERSION_MIN_INTERVAL:
            return False
    try:
        s = session or creq.Session(impersonate=IMPERSONATE, timeout=20)
        r = s.get("https://duck.ai/", headers={"User-Agent": UA})
        if r.status_code != 200:
            raise RuntimeError("status %s" % r.status_code)
        m = re.search(r'serp_\d{8}_\d{6}_[A-Za-z0-9_-]{20,}', r.text)
        if not m:
            raise RuntimeError("no serp_* token in homepage")
        fresh = m.group(0)
        if fresh == current_fe_version():
            with _FE_VERSION_LOCK:
                _FE_VERSION_STATE.update({"refreshed_at": now, "last_error": "",
                                          "source": "confirmed"})
            return False   # 没变，但确认了当前值仍有效
        with _FE_VERSION_LOCK:
            _FE_VERSION_STATE.update({"value": fresh, "refreshed_at": now,
                                      "last_error": "", "source": "self-healed"})
        try:
            with open(_FE_VERSION_CACHE, "w", encoding="utf-8") as fh:
                json.dump({"value": fresh, "at": now}, fh)
        except OSError:
            pass
        if log:
            log("x-fe-version self-healed: %s" % fresh[:40] + "...")
        return True
    except Exception as exc:
        with _FE_VERSION_LOCK:
            _FE_VERSION_STATE.update({"refreshed_at": now, "last_error": str(exc)[:200]})
        return False


def _load_fe_version_cache():
    """启动时若有比内置值新的缓存则采用（duck 发版后的第二次启动不再先失败一次）。"""
    try:
        with open(_FE_VERSION_CACHE, encoding="utf-8") as fh:
            data = json.load(fh)
        v = str(data.get("value") or "")
        at = float(data.get("at") or 0)
        if v.startswith("serp_") and at > _FE_VERSION_STATE["refreshed_at"]:
            _FE_VERSION_STATE.update({"value": v, "refreshed_at": at, "source": "cache"})
    except (OSError, ValueError):
        pass


_load_fe_version_cache()

# duck 模型清单（与 duck_client.DUCK_MODEL_IDS 对齐）
DUCK_MODEL_IDS = ['gpt-6-luna', 'gpt-5.4-mini', 'claude-haiku-4-5',
                  'mistral-small-2603', 'tinfoil/gpt-oss-120b', 'tinfoil/gemma4-31b']
DUCK_MODELS = [{'id': m, 'object': 'model', 'owned_by': 'duck.ai'} for m in DUCK_MODEL_IDS]


# ── 挑战应答缓存（Node 子进程单飞） ─────────────────────────────────────

_ANSWER_LOCK = threading.Lock()


def _node_answer(challenge_js: str) -> str:
    """Node vm 沙箱解挑战 → x-vqd-hash-1 应答（b64）。"""
    chal_path = os.path.join(_DIR, 'challenge_js.js')
    with open(chal_path, 'w', encoding='utf-8') as f:
        f.write(challenge_js)
    code = ("import { answerChallenge } from './duck_vqd_answer.mjs';"
            "import fs from 'fs';"
            "process.stdout.write(await answerChallenge(fs.readFileSync('challenge_js.js','utf-8')));")
    with _ANSWER_LOCK:
        r = subprocess.run(['node', '--input-type=module', '-e', code],
                           capture_output=True, text=True, timeout=60, cwd=_DIR)
    if r.returncode != 0 or not r.stdout.strip():
        raise RuntimeError('challenge node err: %s' % (r.stderr or '')[-200:])
    return r.stdout.strip()


# ── durableStream RSA JWK（每进程生成一次，会话内复用） ──────────────────

_JWK_LOCK = threading.Lock()
_JWK: dict | None = None


def _normalize_proxy(url: str | None) -> str | None:
    """socks5:// → socks5h://（curl 远端解析 DNS，防 DNS 泄漏 + 兼容 xray）。"""
    if url and url.startswith('socks5://'):
        return 'socks5h://' + url[len('socks5://'):]
    return url


def _public_jwk() -> dict:
    global _JWK
    with _JWK_LOCK:
        if _JWK is None:
            from cryptography.hazmat.primitives.asymmetric import rsa
            key = rsa.generate_private_key(public_exponent=65537, key_size=2048)
            pub = key.public_key().public_numbers()
            def b64u(n: int) -> str:
                b = n.to_bytes((n.bit_length() + 7) // 8, 'big')
                return base64.urlsafe_b64encode(b).rstrip(b'=').decode()
            _JWK = {'kty': 'RSA', 'e': b64u(pub.e), 'n': b64u(pub.n),
                    'alg': 'RSA-OAEP-256', 'ext': True,
                    'key_ops': ['encrypt'], 'use': 'enc'}
        return _JWK


def _fe_signals() -> str:
    return base64.b64encode(json.dumps({
        'start': int(time.time() * 1000) - 8000,
        'events': [
            {'name': 'onboarding_impression', 'delta': 170},
            {'name': 'action', 'delta': 6790, 'trusted': True},
            {'name': 'onboarding_finish', 'delta': 7801},
            {'name': 'startNewChat_free', 'delta': 7834},
        ],
        'end': 7839}).encode()).decode()


# ── 上游适配（duck_upstream 同款接口，wb_proxy 零改动切换） ─────────────

class PureUpstreamAdapter:
    """SSE 帧队列 → read1() 上游形状（与 duck_upstream.DuckUpstreamAdapter 同款）。"""

    def __init__(self, model, chunk_queue):
        self.model = model
        self._q = chunk_queue
        self._buf = b''
        self._closed = False
        self.length = 0
        self._done = False
        self._first = object()

    def read1(self, size=65536):
        if self._buf:
            out, self._buf = self._buf, b''
            return out
        if self._done:
            return b''
        while True:
            try:
                item = self._q.get(timeout=0.25)
            except queue.Empty:
                if self._closed:
                    return b''
                continue
            if item is self._first:
                continue
            if item is None:
                self._done = True
                return self._buf or b''
            self._buf += self._translate(item)
            if self._buf:
                out, self._buf = self._buf, b''
                return out

    def _translate(self, data_line):
        if data_line in ('[DONE]',) or data_line.startswith(('[PING]', '[CHAT_TITLE',
                '[ADS:', '[FIXED_COST_WINDOW_USAGE:', '[SUMMARY')):
            if data_line == '[DONE]':
                return b'data: [DONE]\n\n'
            return b''
        try:
            j = json.loads(data_line)
        except Exception:
            return b''
        if not isinstance(j, dict):
            return b''
        if j.get('action') != 'success':
            err = {'error': {'message': str(j.get('message') or j)[:300],
                             'type': 'upstream_error', 'code': j.get('action')}}
            return ('data: %s\n\n' % json.dumps(err)).encode('utf-8')
        text = j.get('message')
        if not isinstance(text, str) or not text:
            return b''
        chunk = {
            'id': j.get('id') or 'chatcmpl-duck',
            'object': 'chat.completion.chunk',
            'created': int((j.get('created') or time.time() * 1000) / 1000),
            'model': self.model,
            'choices': [{'index': 0, 'delta': {'content': text}, 'finish_reason': None}],
        }
        return ('data: %s\n\n' % json.dumps(chunk, ensure_ascii=False)).encode('utf-8')

    def close(self):
        self._closed = True

    def __enter__(self):
        return self

    def __exit__(self, *a):
        self.close()
        return False


def _flatten_multiturn(messages):
    """多轮（含 assistant）→ 拼接单轮。

    duck 纯协议下含 assistant 角色的 messages 返回 400（多轮格式校验，
    CDP/纯协议皆然，2026-10-28 实测）。duck 无服务端会话——历史本来就是
    客户端携带的，拼接成 User/Assistant 文本块语义等价，实测模型正确续写。
    """
    if not any(isinstance(m, dict) and m.get('role') == 'assistant'
               for m in messages or []):
        return messages
    lines = []
    for m in messages or []:
        if not isinstance(m, dict):
            continue
        role = m.get('role')
        c = m.get('content')
        if isinstance(c, list):  # [{type:text,text}] → 文本
            c = chr(10).join(p.get('text', '') for p in c
                          if isinstance(p, dict) and p.get('type') == 'text')
        if c is None and m.get('tool_calls'):
            c = ' '.join(str((tc.get('function') or {}).get('name') or '')
                         for tc in m['tool_calls'])
        if role in ('user', 'assistant') and c:
            lines.append('%s: %s' % ('User' if role == 'user' else 'Assistant', c))
        elif role == 'tool' and c:
            lines.append('Tool result: %s' % c)
    lines.append('Assistant:')
    return [{'role': 'user', 'content': chr(10).join(lines)}]


def build_duck_body(model, messages, stream=True, fc_mode=False):
    """OpenAI messages -> duck body（纯协议版，与 duck_upstream 同款语义）。

    多轮（含 assistant）自动拼接为单轮（duck 多轮格式 400 的绕过）。
    fc_mode: 伪 FC 场景下 canUseTools 必须 False——duck 内置工具（联网搜索）
    会把 <tool_call> 文本当搜索意图吞掉（模型输出进 CHAT_TITLE/continuation
    而非正文帧）。FC 协议在客户端侧执行，不需要 duck 的服务端工具。
    """
    import duck_upstream  # 复用 build_duck_body 的消息转换
    messages = _flatten_multiturn(messages)
    body = duck_upstream.build_duck_body(model, messages, stream)
    if fc_mode:
        body['canUseTools'] = False
    # 纯协议版在页面外：durableStream 由本模块生成（页面内 WebCrypto 不可用），
    # Python RSA JWK（use:'enc'）实测同样被接受。
    body['durableStream'] = {
        'messageId': str(uuid.uuid4()),
        'conversationId': str(uuid.uuid4()),
        'publicKey': _public_jwk(),
    }
    return body


def chat_stream_via_session(session, model, messages, exit_proxy=None):
    """纯协议发起 chat，返回 PureUpstreamAdapter。

    exit_proxy: 'socks5://127.0.0.1:41001' 之类（出口池分配）；None=直连。
    """
    body = build_duck_body(model, messages)
    q = queue.Queue()
    adapter = PureUpstreamAdapter(model, q)
    got_first = threading.Event()

    def on_frame(data_line):
        q.put(data_line)
        if not got_first.is_set():
            got_first.set()

    def run():
        try:
            # 1. status 挑战
            r1 = session.get(_STATUS_URL,
                             headers={'Cache-Control': 'no-store',
                                      'x-vqd-accept': '1',
                                      'Referer': 'https://duck.ai/'})
            vqd64 = r1.headers.get('x-vqd-hash-1') or ''
            if r1.status_code != 200 or not vqd64:
                raise RuntimeError('status %s (no challenge)' % r1.status_code)
            challenge = base64.b64decode(vqd64).decode('utf-8')
            # 2. Node 解答
            vqd = _node_answer(challenge)
            # 3. chat
            headers = {
                'Content-Type': 'application/json',
                'Accept': 'text/event-stream',
                'x-vqd-hash-1': vqd,
                'x-ddg-journey-id': uuid.uuid4().hex,
                'x-duckai-consent-purposes': 'user-location,image-generation,web-search',
                'x-duckai-continuation': 'resubmit-context',
                'x-duckai-response-id': str(uuid.uuid4()),
                'x-duckai-tool-approval': 'web-search',
                'x-fe-version': current_fe_version() + '-dev'[:64],
                'x-fe-signals': _fe_signals(),
                'Referer': 'https://duck.ai/',
                'Origin': 'https://duck.ai',
            }
            # 挑战变体覆盖率：shim 未适配的变体返回 418 ERR_CHALLENGE，
            # 换新挑战重试（拉新 status 重新解答），实测 ~30%/轮，3 轮 >95%
            r2 = None
            for attempt in range(int(os.environ.get('DUCK_PURE_RETRIES', '4'))):
                r2 = session.post(_CHAT_URL, json=body, headers=headers)
                if r2.status_code == 200:
                    break
                if 'ERR_CHALLENGE' not in r2.text:
                    break   # 非挑战类错误（配额/IP）不重试
                time.sleep(0.3)
                # 重新拉挑战+解答
                r1 = session.get(_STATUS_URL,
                                 headers={'Cache-Control': 'no-store',
                                          'x-vqd-accept': '1',
                                          'Referer': 'https://duck.ai/'})
                vqd64 = r1.headers.get('x-vqd-hash-1') or ''
                if not vqd64:
                    break
                vqd = _node_answer(base64.b64decode(vqd64).decode('utf-8'))
                headers['x-vqd-hash-1'] = vqd
            if r2 is None or r2.status_code != 200:
                # 重试耗尽仍是挑战失败 → 可能 x-fe-version 已随 duck 发版漂移，
                # 触发自愈抓取（有最小间隔防抖），抓到新值则换头最后再试一轮。
                if r2 is not None and 'ERR_CHALLENGE' in r2.text:
                    if refresh_fe_version(session=session):
                        headers['x-fe-version'] = current_fe_version() + '-dev'[:64]
                        r1 = session.get(_STATUS_URL,
                                         headers={'Cache-Control': 'no-store',
                                                  'x-vqd-accept': '1',
                                                  'Referer': 'https://duck.ai/'})
                        vqd64 = r1.headers.get('x-vqd-hash-1') or ''
                        if vqd64:
                            headers['x-vqd-hash-1'] = _node_answer(
                                base64.b64decode(vqd64).decode('utf-8'))
                        r2 = session.post(_CHAT_URL, json=body, headers=headers)
                        if r2.status_code == 200:
                            for line in r2.text.splitlines():
                                line = line.strip()
                                if line.startswith('data: '):
                                    on_frame(line[6:])
                            return
                raise RuntimeError('chat %s: %s' % (getattr(r2, 'status_code', '?'),
                                                    getattr(r2, 'text', '')[:200]))
            for line in r2.text.split('\n'):
                line = line.strip()
                if line.startswith('data: '):
                    on_frame(line[6:])
                elif line:
                    on_frame(line)
        except Exception as exc:
            q.put(json.dumps({'action': 'error', 'message': str(exc)[:300]}))
        finally:
            q.put(None)

    threading.Thread(target=run, daemon=True).start()
    return adapter


# ── 出口池（curl_cffi session 轮换；与 DuckClientPool 接口兼容） ─────────

class PureDuckPool:
    """纯协议出口池：name -> curl_cffi Session（绑定出口代理）。

    与 duck_client.DuckClientPool 相同的调度语义（轮询/忙时排队/懒注册），
    但不 spawn Chrome。来源：DUCK_EXITS 环境变量 / 面板 / proxy_pool_ext。
    """

    #: 面板注册出口的持久化文件（known#10：重启丢配置 → 落盘恢复）。
    #: None = 不持久化（测试/环境变量来源场景）；只记「面板 upsert 过」的出口，
    #: 环境变量/代理文件来源的重启后由各自来源恢复，不重复落盘。
    PERSIST_PATH: str | None = None

    def __init__(self, log=None, headless=True, base_port=9400):
        self.log = log or (lambda m: None)
        self._exits: dict[str, dict] = {}
        self._registered: dict[str, str | None] = {}
        self._lock = threading.RLock()
        self._cond = threading.Condition(self._lock)
        self._rr = 0
        self._panel_registered: set[str] = set()   # 面板 upsert 过的名字（持久化范围）

    # -- 持久化（仅面板注册面；环境变量来源重启后自然恢复，不落盘）--
    @classmethod
    def set_persist_path(cls, path: str | None):
        cls.PERSIST_PATH = path

    def _persist(self):
        """把面板注册的出口写盘（原子写）。PERSIST_PATH 为 None 时跳过。"""
        path = self.PERSIST_PATH
        if not path:
            return
        try:
            with self._lock:
                data = {n: self._registered.get(n)
                        for n in sorted(self._panel_registered)
                        if n in self._registered}
            os.makedirs(os.path.dirname(path) or ".", exist_ok=True)
            tmp = path + ".tmp"
            with open(tmp, "w", encoding="utf-8") as fh:
                json.dump(data, fh, ensure_ascii=False, indent=2)
            os.replace(tmp, path)
        except OSError as exc:
            self.log("exit persist failed %s: %s" % (path, exc))

    def load_persisted(self) -> int:
        """启动时恢复面板注册过的出口。返回恢复数量。"""
        path = self.PERSIST_PATH
        if not path:
            return 0
        try:
            with open(path, encoding="utf-8") as fh:
                data = json.load(fh)
        except (OSError, ValueError):
            return 0
        if not isinstance(data, dict):
            return 0
        n = 0
        for name, proxy in data.items():
            name = str(name).strip()
            if not name:
                continue
            self._registered[name] = (str(proxy).strip() or None) if proxy else None
            self._panel_registered.add(name)
            n += 1
        if n:
            self.log("exits restored from %s: %d" % (path, n))
        return n

    # -- 出口管理（面板可调用）--
    def list_exits(self):
        try:
            import exit_score
            scores = {n: s['score'] for n, s in exit_score.BOARD.snapshot().items()}
        except Exception:
            scores = {}
        with self._lock:
            # 已 spawn 的出口带完整状态；仅注册未 spawn 的（懒加载）也列出，
            # 否则面板看不到恢复/注册了但还没用过的出口。
            spawned = {e['name']: {'name': n, 'proxy': e['proxy'], 'busy': e['busy'],
                                   'last_ok': e['last_ok'], 'last_err': e['last_err'],
                                   'score': scores.get(n), 'alive': True}
                       for n, e in self._exits.items()}
            out = list(spawned.values())
            for rname, rproxy in self._registered.items():
                if rname not in spawned:
                    out.append({'name': rname, 'proxy': rproxy, 'busy': False,
                                'last_ok': 0.0, 'last_err': '',
                                'score': scores.get(rname), 'alive': False})
            return out

    def register_exit(self, name, proxy=None, panel=False):
        with self._lock:
            self._registered[name] = proxy
            if panel:
                self._panel_registered.add(name)
        if panel:
            self._persist()

    def upsert_exit(self, name, proxy=None):
        with self._lock:
            e = self._exits.get(name)
            if e and e['proxy'] == proxy:
                return
            self._registered[name] = proxy
            self._panel_registered.add(name)
        self._persist()

    def remove_exit(self, name):
        with self._lock:
            self._exits.pop(name, None)
            self._registered.pop(name, None)
            self._panel_registered.discard(name)
        self._persist()

    def _pick(self, preferred=None):
        with self._cond:
            for _ in range(60):
                if preferred and preferred in self._exits:
                    e = self._exits[preferred]
                    if not e['busy']:
                        e['busy'] = True
                        return e
                for rname, rproxy in list(self._registered.items()):
                    if rname not in self._exits:
                        self._exits[rname] = {
                            'name': rname, 'proxy': rproxy, 'busy': False,
                            'last_ok': 0.0, 'last_err': '',
                            'session': creq.Session(
                                impersonate=IMPERSONATE,
                                proxies=({'http': _normalize_proxy(rproxy),
                                          'https': _normalize_proxy(rproxy)} if rproxy else None),
                                timeout=60),
                        }
                        self._registered.pop(rname, None)
                idle = [e for e in self._exits.values() if not e['busy']]
                if idle:
                    # B3 质量评分：按分数降序取最好者（分数相同时保持轮询公平）。
                    import exit_score
                    idle.sort(key=lambda e: (-exit_score.BOARD.score_of(e['name']),
                                             self._rr))
                    e = idle[0]
                    self._rr += 1
                    e['busy'] = True
                    return e
                self._cond.wait(1.0)
        return None

    def chat(self, body, on_frame, exit_name=None, timeout=600):
        e = self._pick(exit_name)
        if e is None:
            raise RuntimeError('no idle duck exit available')
        try:
            # body 已含 messages（duck_upstream.build_duck_body 形状）
            model = body.get('model', 'gpt-6-luna')
            r1 = e['session'].get(_STATUS_URL,
                                  headers={'Cache-Control': 'no-store',
                                           'x-vqd-accept': '1',
                                           'Referer': 'https://duck.ai/'})
            vqd64 = r1.headers.get('x-vqd-hash-1') or ''
            if r1.status_code != 200 or not vqd64:
                raise RuntimeError('status %s' % r1.status_code)
            challenge = base64.b64decode(vqd64).decode('utf-8')
            vqd = _node_answer(challenge)
            headers = {
                'Content-Type': 'application/json',
                'Accept': 'text/event-stream',
                'x-vqd-hash-1': vqd,
                'x-ddg-journey-id': uuid.uuid4().hex,
                'x-duckai-consent-purposes': 'user-location,image-generation,web-search',
                'x-duckai-continuation': 'resubmit-context',
                'x-duckai-response-id': str(uuid.uuid4()),
                'x-duckai-tool-approval': 'web-search',
                'x-fe-version': current_fe_version() + '-dev'[:64],
                'x-fe-signals': _fe_signals(),
                'Referer': 'https://duck.ai/',
                'Origin': 'https://duck.ai',
            }
            # 挑战变体重试（同 chat_stream_via_session）
            r2 = None
            for attempt in range(int(os.environ.get('DUCK_PURE_RETRIES', '4'))):
                r2 = e['session'].post(_CHAT_URL, json=body, headers=headers)
                if r2.status_code == 200 or 'ERR_CHALLENGE' not in r2.text:
                    break
                time.sleep(0.3)
                r1 = e['session'].get(_STATUS_URL,
                                      headers={'Cache-Control': 'no-store',
                                               'x-vqd-accept': '1',
                                               'Referer': 'https://duck.ai/'})
                vqd64 = r1.headers.get('x-vqd-hash-1') or ''
                if not vqd64:
                    break
                headers['x-vqd-hash-1'] = _node_answer(
                    base64.b64decode(vqd64).decode('utf-8'))
            if r2 is None or r2.status_code != 200:
                raise RuntimeError('chat %s: %s' % (getattr(r2, 'status_code', '?'),
                                                    getattr(r2, 'text', '')[:200]))
            started = time.time()
            for line in r2.text.split('\n'):
                line = line.strip()
                if line.startswith('data: '):
                    on_frame(line[6:])
            e['last_ok'] = time.time()
            try:
                import exit_score
                exit_score.BOARD.record_success(e['name'], time.time() - started)
            except Exception:
                pass
        except Exception as exc:
            e['last_err'] = str(exc)[:300]
            try:
                import exit_score
                exit_score.BOARD.record_failure(e['name'], str(exc))
            except Exception:
                pass
            raise
        finally:
            with self._cond:
                e['busy'] = False
                self._cond.notify_all()

    def shutdown(self):
        with self._lock:
            self._exits.clear()


# ── wb_proxy 集成接口（与 duck_upstream 同款形状） ─────────────────────

POOL = None


def init_pool(log=None, headless=None):
    global POOL
    if POOL is not None:
        return POOL
    POOL = PureDuckPool(log=log)
    # 面板注册出口持久化（known#10）：文件放 accounts/ 同级目录。
    # 注意 ACCOUNTS_DIR 由 wb_proxy 决定，这里从环境变量取，取不到则不持久化。
    persist = os.environ.get("DUCK_EXITS_PERSIST", "").strip()
    if persist:
        PureDuckPool.set_persist_path(persist)
        POOL.load_persisted()
    # 出口来源：DUCK_EXITS 环境变量（与 CDP 通道同格式）+ 直连代理文件
    spec = os.environ.get("DUCK_EXITS", "").strip()
    n = 0
    for part in spec.split(","):
        part = part.strip()
        if not part:
            continue
        if "=" in part:
            name, proxy = part.split("=", 1)
            name, proxy = name.strip(), (proxy.strip() or None)
        else:
            name, proxy = part, None
        POOL.register_exit(name, proxy=proxy)
        n += 1
    # 直连代理文件（working_proxies.json / 纯 URL 列表）：免费 http/socks 直连代理，
    # 无需 mihomo。DUCK_PROXY_FILE 指向文件，每行一个 URL 或 JSON 数组 [{proxy:...}]
    proxy_file = os.environ.get("DUCK_PROXY_FILE", "").strip()
    if proxy_file:
        try:
            with open(proxy_file, encoding="utf-8") as f:
                content = f.read()
            urls = []
            try:
                arr = json.loads(content)
                if isinstance(arr, list):
                    for item in arr:
                        u = item.get("proxy") if isinstance(item, dict) else item
                        if isinstance(u, str) and "://" in u:
                            urls.append(u)
            except ValueError:
                urls = [l.strip() for l in content.splitlines()
                        if l.strip() and "://" in l]
            for i, u in enumerate(urls[:80]):
                POOL.register_exit("pf%d" % i, proxy=u)
                n += 1
            if log:
                log("duck pure: %d direct proxies from %s" % (len(urls[:80]), proxy_file))
        except OSError as exc:
            if log:
                log("proxy file unreadable %s: %s" % (proxy_file, exc))
    if n == 0:
        POOL.register_exit("direct", proxy=None)
        n = 1
    if log:
        log("duck pure ready: %d exit(s) (zero-browser, curl_cffi+node)" % n)
    return POOL


def duck_chat_stream(model, messages, on_chunk_error=None):
    """发起纯协议 duck 流式请求，返回 PureUpstreamAdapter（wb_proxy 直接当 upstream 用）。"""
    body = build_duck_body(model, messages)
    q = queue.Queue()
    adapter = PureUpstreamAdapter(model, q)
    got_first = threading.Event()

    def on_frame(data_line):
        q.put(data_line)
        if not got_first.is_set():
            got_first.set()

    def run():
        try:
            if POOL is None:
                init_pool()
            e = POOL._pick()
            if e is None:
                raise RuntimeError("no idle duck exit available")
            try:
                r1 = e['session'].get(_STATUS_URL,
                                      headers={'Cache-Control': 'no-store',
                                               'x-vqd-accept': '1',
                                               'Referer': 'https://duck.ai/'})
                vqd64 = r1.headers.get('x-vqd-hash-1') or ''
                if r1.status_code != 200 or not vqd64:
                    raise RuntimeError('status %s' % r1.status_code)
                vqd = _node_answer(base64.b64decode(vqd64).decode('utf-8'))
                headers = {
                    'Content-Type': 'application/json',
                    'Accept': 'text/event-stream',
                    'x-vqd-hash-1': vqd,
                    'x-ddg-journey-id': uuid.uuid4().hex,
                    'x-duckai-consent-purposes': 'user-location,image-generation,web-search',
                    'x-duckai-continuation': 'resubmit-context',
                    'x-duckai-response-id': str(uuid.uuid4()),
                    'x-duckai-tool-approval': 'web-search',
                    'x-fe-version': current_fe_version() + '-dev'[:64],
                    'x-fe-signals': _fe_signals(),
                    'Referer': 'https://duck.ai/',
                    'Origin': 'https://duck.ai',
                }
                # 挑战变体重试
                r2 = None
                for attempt in range(int(os.environ.get('DUCK_PURE_RETRIES', '4'))):
                    r2 = e['session'].post(_CHAT_URL, json=body, headers=headers)
                    if r2.status_code == 200 or 'ERR_CHALLENGE' not in r2.text:
                        break
                    time.sleep(0.3)
                    r1 = e['session'].get(_STATUS_URL,
                                          headers={'Cache-Control': 'no-store',
                                                   'x-vqd-accept': '1',
                                                   'Referer': 'https://duck.ai/'})
                    vqd64 = r1.headers.get('x-vqd-hash-1') or ''
                    if not vqd64:
                        break
                    headers['x-vqd-hash-1'] = _node_answer(
                        base64.b64decode(vqd64).decode('utf-8'))
                if r2 is None or r2.status_code != 200:
                    raise RuntimeError('chat %s: %s' % (getattr(r2, 'status_code', '?'),
                                                        getattr(r2, 'text', '')[:200]))
                for line in r2.text.split(chr(10)):
                    line = line.strip()
                    if line.startswith('data: '):
                        on_frame(line[6:])
                e['last_ok'] = time.time()
            except Exception as exc:
                e['last_err'] = str(exc)[:300]
                raise
            finally:
                with POOL._cond:
                    e['busy'] = False
                    POOL._cond.notify_all()
        except Exception as exc:
            q.put(json.dumps({'action': 'error', 'message': str(exc)[:300]}))
        finally:
            q.put(None)

    threading.Thread(target=run, daemon=True).start()
    return adapter


if __name__ == '__main__':
    import sys
    sys.stdout.reconfigure(encoding='utf-8')
    logging_hint = 'proxy from argv[1] or direct'
    pool = PureDuckPool(log=print)
    pool.register_exit('direct', proxy=(sys.argv[1] if len(sys.argv) > 1 else None))
    import duck_upstream
    body = build_duck_body('gpt-6-luna', [{'role': 'user', 'content': 'say ok'}])
    frames = []
    t0 = time.time()
    pool.chat(body, lambda f: frames.append(f), exit_name='direct', timeout=120)
    text = ''.join(str(f) for f in frames)
    full = ''
    for line in text.split('\n'):
        line = line.strip()
        if line.startswith('{'):
            try:
                j = json.loads(line)
                if j.get('action') == 'success' and isinstance(j.get('message'), str):
                    full += j['message']
            except Exception:
                pass
    print('回复 (%.1fs):' % (time.time() - t0), full[:150])

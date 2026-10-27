// Node 端 duck.ai 挑战执行沙箱
// 挑战 JS 采集的指纹面（混淆解码后确认）：
//   1. navigator.userAgent / hardwareConcurrency / userAgentData
//   2. iframe 解析怪癖（'<br><div></br><br></div' → contentWindow.Error.stack）
//   3. window 污染检查（_Array/_Proxy/_JSON 等后缀属性）
//   4. crypto.subtle.digest (SHA-256)
// Node 21+ 自带只读 globalThis.navigator/crypto → 必须用 vm 隔离上下文。
import vm from 'node:vm';
import { webcrypto } from 'node:crypto';

class G_Element {}
class G_HTMLElement extends G_Element {}
class G_HTMLDivElement extends G_HTMLElement {}
class G_NodeList extends Array {}
const G = { Element: G_Element, HTMLElement: G_HTMLElement, HTMLDivElement: G_HTMLDivElement, NodeList: G_NodeList };
const UA = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36';

// ── B4 指纹面补齐：Canvas / WebGL / AudioContext / WebRTC ────────────────
// 挑战 JS 若探测这些 API，缺 API 本身就是「非浏览器」特征。这里给出形态
// 正确的假实现：返回值稳定（同输入同输出，避免每次挑战产生新指纹）、
// 形态与真 Chrome 一致（方法存在、类型正确），数值取自常见 Win11 + Intel
// 核显机器的中位样本。稳定性优先于真实性——上游风控主要看跨请求一致性。
function makeFingerprintSurface(seedStr) {
  // 由种子派生一个稳定的 32 位哈希，保证同一出口每次挑战指纹一致
  let h = 2166136261;
  for (let i = 0; i < seedStr.length; i++) { h ^= seedStr.charCodeAt(i); h = Math.imul(h, 16777619); }
  const seed = h >>> 0;
  const canvasHash = 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAYAAAAfFcSJAAAADUlEQVR42mNk' +
    (seed % 100).toString().padStart(2, '0') + 'AAAAAElFTkSuQmCC';

  const canvas2d = {
    fillRect() {}, fillText() {}, strokeText() {}, arc() {}, beginPath() {},
    closePath() {}, fill() {}, stroke() {}, save() {}, restore() {},
    measureText: (t) => ({ width: String(t).length * 7.2 + (seed % 97) / 10 }),
    getImageData: (x, y, w, h) => ({ data: new Uint8ClampedArray(Math.max(4, (w || 1) * (h || 1) * 4)), width: w, height: h }),
    isPointInPath: () => false,
    createLinearGradient: () => ({ addColorStop() {} }),
  };
  const makeCanvas = () => ({
    width: 300, height: 150, style: {},
    getContext(kind) {
      const k = String(kind || '');
      if (k === '2d') return canvas2d;
      if (k === 'webgl' || k === 'webgl2' || k === 'experimental-webgl') return makeWebgl(k);
      return null;  // 真 Chrome 对未知类型也返回 null
    },
    toDataURL: () => canvasHash,               // 稳定哈希：同出口每次一致
    toBlob: (cb) => { if (typeof cb === 'function') cb({ size: 68, type: 'image/png' }); },
    addEventListener() {}, removeEventListener() {},
  });
  const glConst = (v) => v;  // 常量直接透传数值
  function makeWebgl(kind) {
    return {
      // 常见 getParameter 查询项（Win11 + Intel UHD 770 形态）
      VENDOR: glConst(0x1F00), RENDERER: glConst(0x1F01), VERSION: glConst(0x1F02),
      SHADING_LANGUAGE_VERSION: glConst(0x8B8C),
      UNMASKED_VENDOR_WEBGL: glConst(0x9245), UNMASKED_RENDERER_WEBGL: glConst(0x9246),
      MAX_TEXTURE_SIZE: glConst(0x0D33), MAX_VIEWPORT_DIMS: glConst(0x0D3A),
      MAX_RENDERBUFFER_SIZE: glConst(0x84E8), MAX_TEXTURE_IMAGE_UNITS: glConst(0x8872),
      getParameter(p) {
        switch (p) {
          case 0x1F00: return 'WebKit';
          case 0x1F01: return 'WebKit WebGL';
          case 0x1F02: return kind === 'webgl2' ? 'WebGL 2.0 (OpenGL ES 3.0 Chromium)' : 'WebGL 1.0 (OpenGL ES 2.0 Chromium)';
          case 0x8B8C: return 'WebGL GLSL ES 3.00' + (kind === 'webgl2' ? '' : ' 1.00');
          case 0x9245: return 'Google Inc. (Intel)';
          case 0x9246: return 'ANGLE (Intel, Intel(R) UHD Graphics 770 (0x00004680) Direct3D11 vs_5_0 ps_5_0, D3D11)';
          case 0x0D33: return 16384;
          case 0x84E8: return 16384;
          case 0x8872: return 16;
          case 0x0D3A: return new Int32Array([32767, 32767]);
          default: return 0;
        }
      },
      getExtension(name) {
        if (name === 'WEBGL_debug_renderer_info') return { UNMASKED_VENDOR_WEBGL: 0x9245, UNMASKED_RENDERER_WEBGL: 0x9246 };
        return {};   // 其余扩展返回真对象，扩展名探测不穿帮
      },
      getSupportedExtensions: () => ['ANGLE_instanced_arrays', 'EXT_blend_minmax', 'EXT_color_buffer_half_float',
        'OES_texture_float', 'OES_standard_derivatives', 'WEBGL_debug_renderer_info', 'WEBGL_lose_context'],
      createBuffer: () => ({}), bindBuffer() {}, bufferData() {},
      createProgram: () => ({}), createShader: () => ({}),
      attachShader() {}, linkProgram() {}, useProgram() {}, shaderSource() {}, compileShader() {},
      getShaderParameter: () => true, getProgramParameter: () => true,
      getShaderInfoLog: () => '', getProgramInfoLog: () => '',
      readPixels: (x, y, w, h, fmt, type, pixels) => { if (pixels) pixels.fill(128); },
      canvas: null,
    };
  }
  const audioCtx = {
    sampleRate: 44100, state: 'running', currentTime: 0,
    destination: { channelCount: 2, channelCountMode: 'explicit', channelInterpretation: 'speakers', maxChannelCount: 2 },
    createOscillator: () => ({ type: 'triangle', frequency: { value: 10000, setValueAtTime() {} },
      connect() {}, start() {}, stop() {}, disconnect() {} }),
    createDynamicsCompressor: () => ({ threshold: { value: -24 }, knee: { value: 30 }, ratio: { value: 12 },
      attack: { value: 0.003 }, release: { value: 0.25 },
      connect() {}, disconnect() {} }),
    createAnalyser: () => ({ frequencyBinCount: 1024, getFloatFrequencyData(a) { if (a) a.fill(-100 + (seed % 50) / 10); },
      connect() {}, disconnect() {} }),
    createBuffer: (ch, len, rate) => ({ numberOfChannels: ch, length: len, sampleRate: rate,
      getChannelData: () => new Float32Array(len || 1) }),
    createBufferSource: () => ({ buffer: null, connect() {}, start() {}, stop() {}, disconnect() {} }),
    createGain: () => ({ gain: { value: 1, setValueAtTime() {} }, connect() {}, disconnect() {} }),
    decodeAudioData: (buf) => Promise.resolve({ numberOfChannels: 2, length: 44100, sampleRate: 44100,
      getChannelData: () => new Float32Array(44100) }),
    close: () => Promise.resolve(), resume: () => Promise.resolve(),
  };
  const rtc = {
    createDataChannel: () => ({ close() {}, send() {} }),
    createOffer: () => Promise.resolve({ type: 'offer', sdp: 'v=0\r\no=- ' + seed + ' 2 IN IP4 127.0.0.1\r\ns=-\r\nt=0 0\r\n' }),
    setLocalDescription: () => Promise.resolve(),
    localDescription: { type: 'offer', sdp: '' },
    close() {},
    addEventListener() {},
  };
  return {
    install(sandbox) {
      sandbox.HTMLCanvasElement = function HTMLCanvasElement() {};
      sandbox.HTMLCanvasElement.prototype = Object.create(G.HTMLDivElement.prototype);
      sandbox.OffscreenCanvas = function OffscreenCanvas(w, h) { return Object.assign(makeCanvas(), { width: w, height: h }); };
      sandbox.AudioContext = function AudioContext() { return audioCtx; };
      sandbox.webkitAudioContext = sandbox.AudioContext;
      sandbox.OfflineAudioContext = function OfflineAudioContext(ch, len, rate) {
        return Object.assign(Object.create(audioCtx), { length: len, sampleRate: rate,
          startRendering: () => Promise.resolve({ numberOfChannels: ch, length: len, sampleRate: rate,
            getChannelData: () => { const a = new Float32Array(len || 1); a[0] = (seed % 1000) / 1e6 - 5e-4; return a; } }) });
      };
      sandbox.RTCPeerConnection = function RTCPeerConnection() { return rtc; };
      sandbox.webkitRTCPeerConnection = sandbox.RTCPeerConnection;
      sandbox.RTCDataChannel = function RTCDataChannel() {};
      sandbox.MediaStreamTrack = function MediaStreamTrack() {};
      const origCreateElement = sandbox.document.createElement;
      sandbox.document.createElement = function (tag) {
        const t = String(tag || '').toLowerCase();
        if (t === 'canvas') return makeCanvas();
        return origCreateElement.call(this, tag);
      };
      // OffscreenCanvas 的 webgl 上下文也要有 getContext
      sandbox.OffscreenCanvas.prototype = { getContext: makeCanvas().getContext };
    },
  };
}


function makeSandbox() {
  // 万能元素 v2：自指函数代理——未知属性全部返回自身（既是函数又是对象）
  const magic = new Proxy(function magic() { return magic; }, {
    get(t, k) {
      if (k === Symbol.toPrimitive) return () => '100';
      if (k === 'length') return 4;
      if (k === Symbol.toStringTag) return 'Object';
      if (k === 'constructor') return function Named() {};
      return magic;   // 任何属性都是 magic 自己 → 链式无限安全
    },
    apply() { return magic; },
  });
  const elStore = { innerHTML: '', textContent: '', style: magic,
    offsetWidth: 100, offsetHeight: 20,
    getBoundingClientRect() { return { width: 100, height: 20, top: 0, left: 0, right: 100, bottom: 20 }; },
    querySelectorAll() { return magic; },
    appendChild() { return magic; }, removeChild() { return magic; },
    remove() {}, split() { return []; },
  };
  class Element_ {}
  class HTMLElement_ extends Element_ {}
  class HTMLDivElement_ extends HTMLElement_ {}
  const magicEl = new Proxy(Object.create(HTMLDivElement_.prototype), {
    get(t, k) {
      if (k in t) return t[k];
      return magic;
    },
    set(t, k, v) { t[k] = v; return true; },
  });
  const iframeWindow = new Proxy({}, {
    get(t, k) {
      if (k === 'get') return function () { return undefined; };
      if (k === 'Error') return function (...args) { const e = new Error(...args); e.stack = 'Error'; return e; };
      if (k === 'self' || k === 'top' || k === 'parent' || k === 'window') return t;
      return t[k] ?? undefined;
    },
  });
  const fakeIframe = new Proxy({}, {
    get(t, k) {
      if (k === 'contentWindow') return iframeWindow;
      if (k === 'srcdoc') return '';
      return t[k];
    },
    set(t, k, v) { t[k] = v; return true; },
  });
  const sandbox = {

    crypto: webcrypto,
    __trace: [],
    navigator: {
      userAgent: UA,
      hardwareConcurrency: 16,
      webdriver: false,
    },
    document: {
      createElement(tag) {
        if (String(tag).toLowerCase() === 'iframe') return fakeIframe;
        // 万能假元素：未知属性返回链式安全的值，未知方法返回空函数
        const store = { innerHTML: '', textContent: '', style: {},
          offsetWidth: 100, offsetHeight: 20,   // 可见性检测（真 Chrome 中非零）
          scrollWidth: 100, scrollHeight: 20,   // 滚动尺寸检测（第5项）
          clientWidth: 100, clientHeight: 20,
          getBoundingClientRect() { return { width: 100, height: 20, top: 0, left: 0, right: 100, bottom: 20 }; },
        };
        const el = Object.create(G.HTMLDivElement.prototype);   // instanceof 检测
        Object.assign(el, store);
        return new Proxy(el, {
          get(t, k) {
            if (k in t) return t[k];
            if (k === 'querySelectorAll') return () => [1, 2, 3, 4];
            if (k === 'split') return () => [];
            return () => undefined;
          },
          set(t, k, v) { t[k] = v; return true; },
        });
      },
      body: (() => {
        const b = { children: [], childElementCount: 0 };
        b.appendChild = (el) => { b.children.push(el); b.childElementCount = b.children.length; };
        b.removeChild = (el) => { const i = b.children.indexOf(el); if (i >= 0) b.children.splice(i, 1); b.childElementCount = b.children.length; };
        return b;
      })(),
      // 全局 querySelectorAll：返回带 children 的 NodeList（constructor.name 检测）
      querySelectorAll() {
        const nl = new G.NodeList();
        nl.children = { constructor: { name: 'NodeList' } };
        return nl;
      },
      querySelector() {
        // duck.ai 页面特有元素检测（#jsa 等）——真页面上存在，返回万能元素
        return magicEl;
      },
      getElementById() { return magicEl; },
      documentElement: { childElementCount: 0 },
    },
    console,
    setTimeout,
    TextEncoder,
    TextDecoder,
    atob: (s) => Buffer.from(s, 'base64').toString('binary'),
    btoa: (s) => Buffer.from(s, 'binary').toString('base64'),
    JSON, Object, Array, String, Promise, Error, Math, Date,
    parseInt, Symbol, Uint8Array,
    Window: function Window() {},       // 跨 frame Window 构造器（挑战检测用）
    Proxy, Reflect, Map, Set, WeakMap,
    // 屏幕/视口（新挑战变体检测）
    getComputedStyle() { return { getPropertyValue() { return '12px'; }, width: '100px', height: '20px', display: 'block' }; },
    screen: { width: 1920, height: 1080, availWidth: 1920, availHeight: 1040,
              colorDepth: 24, pixelDepth: 24, availLeft: 0, availTop: 0 },
    innerWidth: 1920, innerHeight: 937,
    outerWidth: 1920, outerHeight: 1080,
    devicePixelRatio: 1,
    screenX: 0, screenY: 0, pageXOffset: 0, pageYOffset: 0,
    location: { href: 'https://duck.ai/', origin: 'https://duck.ai',
                protocol: 'https:', host: 'duck.ai', hostname: 'duck.ai',
                pathname: '/', search: '', hash: '' },
    history: { length: 2 },
  };
  // B4：Canvas/WebGL/AudioContext/WebRTC 指纹面（出口种子 → 每出口稳定指纹）
  makeFingerprintSurface(process.env.DUCK_EXIT_SEED || 'default-exit').install(sandbox);
  // [object Window] 检测：vm 沙箱默认是 [object Object]，用 toStringTag 伪装
  Object.defineProperty(sandbox, Symbol.toStringTag, { value: 'Window', configurable: true });
  Object.defineProperty(sandbox, 'Element', { value: G.Element, configurable: true });
  Object.defineProperty(sandbox, 'HTMLElement', { value: G.HTMLElement, configurable: true });
  Object.defineProperty(sandbox, 'HTMLDivElement', { value: G.HTMLDivElement, configurable: true });
  Object.defineProperty(sandbox, 'NodeList', { value: G.NodeList, configurable: true });
  // Error.captureStackTrace（V8 特有，挑战检测 Error[name]===undefined||typeof function）
  if (!Error.captureStackTrace) Error.captureStackTrace = function (o) { return o; };
  sandbox.top = sandbox;   // 顶层窗口 top === window
  sandbox.window = sandbox;
  if (process.env.DUCK_TRACE) {
    const origDoc = sandbox.document;
    sandbox.document = new Proxy(origDoc, {
      get(t, k) { console.error('[doc]', k); const v = t[k]; return v; },
    });
    sandbox.window = new Proxy(sandbox, {
      get(t, k) { if (typeof k === 'string' && !(k in t)) console.error('[MISS window]', k); return t[k]; },
    });
    sandbox.globalThis = sandbox.window;
    sandbox.self = sandbox.window;
  }
  sandbox.globalThis = sandbox;
  sandbox.self = sandbox;
  return vm.createContext(sandbox);
}

export async function runChallenge(jsCode) {
  const ctx = makeSandbox();
  const script = new vm.Script('(' + jsCode + ')');
  return await script.runInContext(ctx);
}

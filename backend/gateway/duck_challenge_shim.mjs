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

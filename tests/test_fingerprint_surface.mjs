// B4：挑战沙箱指纹面 Node 冒烟测试（node --test 风格，可直接 node 执行）
import { runChallenge } from '../gateway/duck_challenge_shim.mjs';

let failures = 0;
async function check(name, code, expect) {
  try {
    const v = await runChallenge(code);
    const ok = expect(v);
    if (!ok) { console.error('FAIL', name, '->', v); failures++; }
    else console.log('ok  ', name);
  } catch (e) { console.error('FAIL', name, 'threw:', e.message); failures++; }
}

await check('canvas 2d toDataURL 稳定',
  `(() => { const c = document.createElement('canvas'); const x = c.getContext('2d');
    x.fillRect(0,0,10,10); x.fillText('a',1,1);
    return [c.toDataURL(), c.toDataURL()].join('|'); })()`,
  v => { const [a, b] = v.split('|'); return a === b && a.startsWith('data:image/png;base64,'); });

await check('canvas toDataURL 同种子跨挑战稳定',
  `document.createElement('canvas').toDataURL()`,
  v => v.length > 20);

await check('webgl renderer 形态',
  `(() => { const gl = document.createElement('canvas').getContext('webgl');
    const ext = gl.getExtension('WEBGL_debug_renderer_info');
    return gl.getParameter(ext.UNMASKED_RENDERER_WEBGL); })()`,
  v => typeof v === 'string' && v.includes('ANGLE') && v.includes('Intel'));

await check('webgl2 可取且类型一致',
  `(() => { const gl = document.createElement('canvas').getContext('webgl2');
    return gl ? gl.getParameter(gl.VERSION) : null; })()`,
  v => typeof v === 'string' && v.includes('WebGL 2.0'));

await check('getSupportedExtensions 非空数组',
  `(() => { const gl = document.createElement('canvas').getContext('webgl');
    return Array.isArray(gl.getSupportedExtensions()) && gl.getSupportedExtensions().length > 0; })()`,
  v => v === true);

await check('AudioContext 采样率',
  `(() => { const c = new AudioContext(); return c.sampleRate; })()`,
  v => v === 44100);

await check('OfflineAudioContext 渲染稳定（音频指纹核心路径）',
  `(async () => { const c = new OfflineAudioContext(1, 5000, 44100);
     const buf = await c.startRendering(); return buf.getChannelData(0)[0]; })()`,
  v => typeof v === 'number');

await check('RTCPeerConnection createOffer 出 SDP',
  `(async () => { const p = new RTCPeerConnection(); const o = await p.createOffer(); return o.sdp.slice(0, 4); })()`,
  v => v === 'v=0\r');

await check('challenge 现有 8 类面不受影响（iframe 怪癖）',
  `(() => { const f = document.createElement('iframe'); return typeof f.contentWindow.Error; })()`,
  v => v === 'function');

await check('navigator 形态不变',
  `(() => { return [navigator.userAgent.slice(0, 7), navigator.hardwareConcurrency].join('/'); })()`,
  v => v === 'Mozilla/16');

console.log(failures ? ('FAILED: ' + failures) : 'ALL PASS');
process.exit(failures ? 1 : 0);

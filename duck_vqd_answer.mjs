// 挑战应答后处理（与官方前端 35488 模块一致）：
// client_hashes 每项 SHA-256 -> base64；meta 补 origin/stack/duration。
import { createHash } from 'node:crypto';
import { runChallenge } from './duck_challenge_shim.mjs';

export async function answerChallenge(jsCode) {
  const raw = await runChallenge(jsCode);
  const out = { ...raw };
  out.client_hashes = await Promise.all(raw.client_hashes.map(async (e) => {
    const d = createHash('sha256').update(e, 'utf8').digest();
    return d.toString('base64');
  }));
  out.meta = {
    ...(raw.meta || {}),
    origin: 'https://duck.ai',
    stack: 'Error\n    at l (https://duck.ai/dist/duckai-dist/entry.duckai.ee812f528704ac6cf8c3.js:2:2140175)\n    at async https://duck.ai/dist/duckai-dist/entry.duckai.ee812f528704ac6cf8c3.js:2:1867302',
    duration: '4',
  };
  return Buffer.from(JSON.stringify(out), 'utf8').toString('base64');
}

package okio;

import defpackage.dy;
import defpackage.lz;
import defpackage.mt2;
import defpackage.q30;
import defpackage.u41;
import defpackage.yo4;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class Path$Companion {
    public static final void access$insertIntoQueue(b bVar, long j, boolean z) {
        b bVar2;
        ReentrantLock reentrantLock = b.h;
        if (b.l == null) {
            b.l = new b();
            a aVar = new a("Okio Watchdog");
            aVar.setDaemon(true);
            aVar.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            bVar.g = Math.min(j, bVar.c() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            bVar.g = j + jNanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            bVar.g = bVar.c();
        }
        long j2 = bVar.g - jNanoTime;
        b bVar3 = b.l;
        bVar3.getClass();
        while (true) {
            bVar2 = bVar3.f;
            if (bVar2 == null || j2 < bVar2.g - jNanoTime) {
                break;
            } else {
                bVar3 = bVar2;
            }
        }
        bVar.f = bVar2;
        bVar3.f = bVar;
        if (bVar3 == b.l) {
            b.i.signal();
        }
    }

    public static b awaitTimeout() throws InterruptedException {
        b bVar = b.l;
        bVar.getClass();
        b bVar2 = bVar.f;
        if (bVar2 == null) {
            long jNanoTime = System.nanoTime();
            b.i.await(b.j, TimeUnit.MILLISECONDS);
            b bVar3 = b.l;
            bVar3.getClass();
            if (bVar3.f != null || System.nanoTime() - jNanoTime < b.k) {
                return null;
            }
            return b.l;
        }
        long jNanoTime2 = bVar2.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            b.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        b bVar4 = b.l;
        bVar4.getClass();
        bVar4.f = bVar2.f;
        bVar2.f = null;
        bVar2.e = 2;
        return bVar2;
    }

    public static lz decodeHex(String str) {
        if (str.length() % 2 != 0) {
            u41.h("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (yo4.e(str.charAt(i2 + 1)) + (yo4.e(str.charAt(i2)) << 4));
        }
        return new lz(bArr);
    }

    public static lz encodeUtf8(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(q30.a);
        bytes.getClass();
        lz lzVar = new lz(bytes);
        lzVar.h = str;
        return lzVar;
    }

    public static mt2 get(String str) {
        str.getClass();
        lz lzVar = defpackage.c.a;
        dy dyVar = new dy();
        dyVar.b0(str);
        return defpackage.c.d(dyVar, false);
    }
}

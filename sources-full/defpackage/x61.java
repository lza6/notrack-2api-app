package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class x61 implements wl3 {
    public final au1 c;
    public long d;
    public boolean h;

    public x61(au1 au1Var, long j) {
        this.c = au1Var;
        this.d = j;
    }

    @Override // defpackage.wl3
    public final c b() {
        return c.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        au1 au1Var = this.c;
        if (this.h) {
            return;
        }
        this.h = true;
        ReentrantLock reentrantLock = au1Var.h;
        reentrantLock.lock();
        try {
            int i = au1Var.d - 1;
            au1Var.d = i;
            if (i == 0 && au1Var.c) {
                reentrantLock.unlock();
                synchronized (au1Var) {
                    au1Var.l.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) {
        long j2;
        long j3;
        int i;
        dyVar.getClass();
        if (this.h) {
            u41.r("closed");
            return 0L;
        }
        au1 au1Var = this.c;
        long j4 = this.d;
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                uc3 uc3VarR = dyVar.R(1);
                byte[] bArr = uc3VarR.a;
                int i2 = uc3VarR.c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (au1Var) {
                    bArr.getClass();
                    au1Var.l.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = au1Var.l.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (uc3VarR.b == uc3VarR.c) {
                        dyVar.c = uc3VarR.a();
                        xc3.a(uc3VarR);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    uc3VarR.c += i;
                    long j7 = i;
                    j6 += j7;
                    dyVar.d += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.d += j3;
        }
        return j3;
    }
}

package defpackage;

import java.io.InterruptedIOException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class mk1 implements zh3 {
    public final boolean c;
    public final dy d = new dy();
    public boolean h;
    public final /* synthetic */ pk1 l;

    public mk1(pk1 pk1Var, boolean z) {
        this.l = pk1Var;
        this.c = z;
    }

    public final void a(boolean z) {
        long jMin;
        boolean z2;
        pk1 pk1Var = this.l;
        synchronized (pk1Var) {
            pk1Var.l.h();
            while (pk1Var.e >= pk1Var.f && !this.c && !this.h) {
                try {
                    synchronized (pk1Var) {
                        int i = pk1Var.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            pk1Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    pk1Var.l.k();
                    throw th;
                }
            }
            pk1Var.l.k();
            pk1Var.b();
            jMin = Math.min(pk1Var.f - pk1Var.e, this.d.d);
            pk1Var.e += jMin;
            z2 = z && jMin == this.d.d;
        }
        this.l.l.h();
        try {
            pk1 pk1Var2 = this.l;
            pk1Var2.b.x(pk1Var2.a, z2, this.d, jMin);
        } finally {
            this.l.l.k();
        }
    }

    @Override // defpackage.zh3
    public final c b() {
        return this.l.l;
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        pk1 pk1Var = this.l;
        byte[] bArr = ka4.a;
        synchronized (pk1Var) {
            if (this.h) {
                return;
            }
            synchronized (pk1Var) {
                z = pk1Var.m == 0;
            }
            pk1 pk1Var2 = this.l;
            if (!pk1Var2.j.c) {
                if (this.d.d > 0) {
                    while (this.d.d > 0) {
                        a(true);
                    }
                } else if (z) {
                    pk1Var2.b.x(pk1Var2.a, true, null, 0L);
                }
            }
            synchronized (this.l) {
                this.h = true;
            }
            this.l.b.flush();
            this.l.a();
        }
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) {
        byte[] bArr = ka4.a;
        dy dyVar2 = this.d;
        dyVar2.d(dyVar, j);
        while (dyVar2.d >= 16384) {
            a(false);
        }
    }

    @Override // defpackage.zh3, java.io.Flushable
    public final void flush() {
        pk1 pk1Var = this.l;
        byte[] bArr = ka4.a;
        synchronized (pk1Var) {
            pk1Var.b();
        }
        while (this.d.d > 0) {
            a(false);
            this.l.b.flush();
        }
    }
}

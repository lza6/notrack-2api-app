package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class pk1 {
    public final int a;
    public final ik1 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final nk1 i;
    public final mk1 j;
    public final ok1 k;
    public final ok1 l;
    public int m;
    public IOException n;

    public pk1(int i, ik1 ik1Var, boolean z, boolean z2, th1 th1Var) {
        ik1Var.getClass();
        this.a = i;
        this.b = ik1Var;
        this.f = ik1Var.y.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new nk1(this, ik1Var.x.a(), z2);
        this.j = new mk1(this, z);
        this.k = new ok1(this);
        this.l = new ok1(this);
        if (th1Var == null) {
            if (g()) {
                return;
            }
            u41.r("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            u41.r("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(th1Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = ka4.a;
        synchronized (this) {
            try {
                nk1 nk1Var = this.i;
                if (nk1Var.d || !nk1Var.m) {
                    z = false;
                } else {
                    mk1 mk1Var = this.j;
                    if (mk1Var.c || mk1Var.h) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.b.h(this.a);
        }
    }

    public final void b() throws IOException {
        mk1 mk1Var = this.j;
        if (mk1Var.h) {
            m51.l("stream closed");
            return;
        }
        if (mk1Var.c) {
            m51.l("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException != null) {
                throw iOException;
            }
            if (i == 0) {
                throw null;
            }
            throw new bo3(i);
        }
    }

    public final void c(int i, IOException iOException) {
        if (i == 0) {
            throw null;
        }
        if (d(i, iOException)) {
            ik1 ik1Var = this.b;
            ik1Var.getClass();
            ik1Var.E.A(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = ka4.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.d && this.j.c) {
                return false;
            }
            this.b.h(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (i == 0) {
            throw null;
        }
        if (d(i, null)) {
            this.b.A(this.a, i);
        }
    }

    public final mk1 f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            nk1 nk1Var = this.i;
            if (nk1Var.d || nk1Var.m) {
                mk1 mk1Var = this.j;
                if ((mk1Var.c || mk1Var.h) && this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(th1 th1Var, boolean z) {
        boolean zH;
        th1Var.getClass();
        byte[] bArr = ka4.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(th1Var);
                }
                if (z) {
                    this.i.d = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.h(this.a);
    }
}

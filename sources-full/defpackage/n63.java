package defpackage;

import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class n63 implements wu0 {
    public int c;
    public float d;
    public float h;
    public float l;
    public float m;
    public long n;
    public long o;
    public float p;
    public float q;
    public long r;
    public rg3 s;
    public boolean t;
    public int u;
    public long v;
    public wu0 w;
    public dx1 x;
    public rq2 y;

    public final void a(float f) {
        if (this.l == f) {
            return;
        }
        this.c |= 4;
        this.l = f;
    }

    public final void c(long j) {
        if (re0.c(this.n, j)) {
            return;
        }
        this.c |= 64;
        this.n = j;
    }

    public final void d(boolean z) {
        if (this.t != z) {
            this.c |= 16384;
            this.t = z;
        }
    }

    public final void e(float f) {
        if (this.p == f) {
            return;
        }
        this.c |= 1024;
        this.p = f;
    }

    public final void g(float f) {
        if (this.d == f) {
            return;
        }
        this.c |= 1;
        this.d = f;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.w.getDensity();
    }

    public final void i(float f) {
        if (this.h == f) {
            return;
        }
        this.c |= 2;
        this.h = f;
    }

    public final void j(float f) {
        if (this.m == f) {
            return;
        }
        this.c |= 32;
        this.m = f;
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.w.l();
    }

    public final void m(rg3 rg3Var) {
        if (kr1.n(this.s, rg3Var)) {
            return;
        }
        this.c |= ConstantsKt.DEFAULT_BUFFER_SIZE;
        this.s = rg3Var;
    }

    public final void n(long j) {
        if (re0.c(this.o, j)) {
            return;
        }
        this.c |= Uuid.SIZE_BITS;
        this.o = j;
    }

    public final void o(long j) {
        if (e54.a(this.r, j)) {
            return;
        }
        this.c |= ConstantsKt.DEFAULT_BLOCK_SIZE;
        this.r = j;
    }
}

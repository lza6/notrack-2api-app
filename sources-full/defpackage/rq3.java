package defpackage;

import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class rq3 implements wu0, so0 {
    public final t00 c;
    public final /* synthetic */ sq3 d;
    public t00 h;
    public zw2 l = zw2.d;
    public final x21 m = x21.c;
    public final /* synthetic */ sq3 n;

    public rq3(sq3 sq3Var, t00 t00Var) {
        this.n = sq3Var;
        this.c = t00Var;
        this.d = sq3Var;
    }

    @Override // defpackage.wu0
    public final int C(long j) {
        return this.d.C(j);
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        return this.d.E(j);
    }

    @Override // defpackage.wu0
    public final int O(float f) {
        return this.d.O(f);
    }

    public final Object a(zw2 zw2Var, wr wrVar) {
        t00 t00Var = new t00(1, gm4.G(wrVar));
        t00Var.u();
        this.l = zw2Var;
        this.h = t00Var;
        return t00Var.s();
    }

    public final long c() {
        sq3 sq3Var = this.n;
        long jC0 = sq3Var.c0(y64.M(sq3Var).I.mo133x26874ded());
        long j = sq3Var.s;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jC0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    @Override // defpackage.wu0
    public final long c0(long j) {
        return this.d.c0(j);
    }

    @Override // defpackage.wu0
    public final float f0(long j) {
        return this.d.f0(j);
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return this.m;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.d.getDensity();
    }

    public final ViewConfiguration i() {
        return y64.M(this.n).I;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(long j, ne1 ne1Var, uo0 uo0Var) throws Throwable {
        pq3 pq3Var;
        Throwable th;
        ym3 ym3Var;
        t00 t00Var;
        if (uo0Var instanceof pq3) {
            pq3Var = (pq3) uo0Var;
            int i = pq3Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                pq3Var.l = i - Integer.MIN_VALUE;
            } else {
                pq3Var = new pq3(this, uo0Var);
            }
        } else {
            pq3Var = new pq3(this, uo0Var);
        }
        Object objInvoke = pq3Var.d;
        int i2 = pq3Var.l;
        if (i2 != 0) {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ym3Var = pq3Var.c;
            try {
                g13.O(objInvoke);
                ym3Var.c(o00.c);
                return objInvoke;
            } catch (Throwable th2) {
                th = th2;
                ym3Var.c(o00.c);
                throw th;
            }
        }
        g13.O(objInvoke);
        if (j <= 0 && (t00Var = this.h) != null) {
            t00Var.resumeWith(new i63(new ax2(j)));
        }
        ym3 ym3VarF = py.F(this.n.getCoroutineScope(), null, null, new ke(j, this, null), 3);
        try {
            pq3Var.c = ym3VarF;
            pq3Var.l = 1;
            objInvoke = ne1Var.invoke(this, pq3Var);
            Object obj = hq0.c;
            if (objInvoke == obj) {
                return obj;
            }
            ym3Var = ym3VarF;
            ym3Var.c(o00.c);
            return objInvoke;
        } catch (Throwable th3) {
            th = th3;
            ym3Var = ym3VarF;
            ym3Var.c(o00.c);
            throw th;
        }
    }

    @Override // defpackage.wu0
    public final long k0(float f) {
        return this.d.k0(f);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.d.l();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(long j, ne1 ne1Var, wr wrVar) {
        qq3 qq3Var;
        if (wrVar instanceof qq3) {
            qq3Var = (qq3) wrVar;
            int i = qq3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qq3Var.h = i - Integer.MIN_VALUE;
            } else {
                qq3Var = new qq3(this, wrVar);
            }
        } else {
            qq3Var = new qq3(this, wrVar);
        }
        Object obj = qq3Var.c;
        int i2 = qq3Var.h;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    g13.O(obj);
                    return obj;
                }
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g13.O(obj);
            qq3Var.h = 1;
            Object objJ = j(j, ne1Var, qq3Var);
            Object obj2 = hq0.c;
            return objJ == obj2 ? obj2 : objJ;
        } catch (ax2 unused) {
            return null;
        }
    }

    @Override // defpackage.wu0
    public final float q0(int i) {
        return this.d.q0(i);
    }

    @Override // defpackage.wu0
    public final float r0(float f) {
        return f / this.d.getDensity();
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) {
        sq3 sq3Var = this.n;
        synchronized (sq3Var.p) {
            sq3Var.o.l(this);
        }
        this.c.resumeWith(obj);
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return this.d.t(f);
    }

    @Override // defpackage.wu0
    public final long u(long j) {
        return this.d.u(j);
    }

    @Override // defpackage.wu0
    public final float w(float f) {
        return this.d.getDensity() * f;
    }
}

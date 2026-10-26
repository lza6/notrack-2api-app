package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wx1 implements tz0 {
    public final a10 c = new a10();
    public rz0 d;

    @Override // defpackage.tz0
    public final ci4 A() {
        return this.c.d;
    }

    @Override // defpackage.wu0
    public final int C(long j) {
        return this.c.C(j);
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        return this.c.E(j);
    }

    @Override // defpackage.tz0
    public final void I(ng3 ng3Var, float f, long j) {
        this.c.I(ng3Var, f, j);
    }

    @Override // defpackage.wu0
    public final int O(float f) {
        return this.c.O(f);
    }

    @Override // defpackage.tz0
    public final void S(long j, long j2, long j3, float f, int i) {
        this.c.S(j, j2, j3, f, i);
    }

    @Override // defpackage.tz0
    public final long W() {
        return this.c.W();
    }

    @Override // defpackage.tz0
    public final void Z(nt2 nt2Var, long j, uz0 uz0Var) {
        this.c.Z(nt2Var, j, uz0Var);
    }

    public final void a() {
        a10 a10Var = this.c;
        y00 y00VarY = a10Var.d.y();
        iu0 iu0Var = this.d;
        if (iu0Var == null) {
            throw fq2.i("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        of2 of2Var = (of2) iu0Var;
        of2 child$ui_release = of2Var.getNode().getChild$ui_release();
        if (child$ui_release == null || (child$ui_release.getAggregateChildKindSet$ui_release() & 4) == 0) {
            child$ui_release = null;
            break;
        }
        while (true) {
            if (child$ui_release == null || (child$ui_release.getKindSet$ui_release() & 2) != 0) {
                child$ui_release = null;
                break;
            } else if ((child$ui_release.getKindSet$ui_release() & 4) != 0) {
                break;
            } else {
                child$ui_release = child$ui_release.getChild$ui_release();
            }
        }
        if (child$ui_release == null) {
            wl2 wl2VarK = y64.K(iu0Var, 4);
            if (wl2VarK.P0() == of2Var.getNode()) {
                wl2VarK = wl2VarK.u;
                wl2VarK.getClass();
            }
            wl2VarK.e1(y00VarY, (gg1) a10Var.d.h);
            return;
        }
        oi2 oi2Var = null;
        while (child$ui_release != null) {
            if (child$ui_release instanceof rz0) {
                rz0 rz0Var = (rz0) child$ui_release;
                gg1 gg1Var = (gg1) a10Var.d.h;
                wl2 wl2VarK2 = y64.K(rz0Var, 4);
                long jW = y64.W(wl2VarK2.h);
                ux1 ux1Var = wl2VarK2.t;
                ux1Var.getClass();
                xx1.a(ux1Var).getSharedDrawScope().c(y00VarY, jW, wl2VarK2, rz0Var, gg1Var);
            } else if ((child$ui_release.getKindSet$ui_release() & 4) != 0 && (child$ui_release instanceof ju0)) {
                int i = 0;
                for (of2 child$ui_release2 = ((ju0) child$ui_release).d; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                    if ((child$ui_release2.getKindSet$ui_release() & 4) != 0) {
                        i++;
                        if (i == 1) {
                            child$ui_release = child$ui_release2;
                        } else {
                            if (oi2Var == null) {
                                oi2Var = new oi2(0, new of2[16]);
                            }
                            if (child$ui_release != null) {
                                oi2Var.c(child$ui_release);
                                child$ui_release = null;
                            }
                            oi2Var.c(child$ui_release2);
                        }
                    }
                }
                if (i == 1) {
                }
            }
            child$ui_release = y64.e(oi2Var);
        }
    }

    @Override // defpackage.tz0
    public final void a0(long j, long j2, long j3, float f, te0 te0Var, int i) {
        this.c.a0(j, j2, j3, f, te0Var, i);
    }

    @Override // defpackage.tz0
    public final long b() {
        return this.c.b();
    }

    public final void c(y00 y00Var, long j, wl2 wl2Var, rz0 rz0Var, gg1 gg1Var) {
        rz0 rz0Var2 = this.d;
        this.d = rz0Var;
        dx1 dx1Var = wl2Var.t.H;
        a10 a10Var = this.c;
        ci4 ci4Var = a10Var.d;
        z00 z00Var = ((a10) ci4Var.l).c;
        wu0 wu0Var = z00Var.a;
        dx1 dx1Var2 = z00Var.b;
        y00 y00VarY = ci4Var.y();
        ci4 ci4Var2 = a10Var.d;
        long jC = ci4Var2.C();
        gg1 gg1Var2 = (gg1) ci4Var2.h;
        ci4Var2.K(wl2Var);
        ci4Var2.M(dx1Var);
        ci4Var2.J(y00Var);
        ci4Var2.N(j);
        ci4Var2.h = gg1Var;
        y00Var.l();
        try {
            rz0Var.L(this);
            y00Var.i();
            ci4Var2.K(wu0Var);
            ci4Var2.M(dx1Var2);
            ci4Var2.J(y00VarY);
            ci4Var2.N(jC);
            ci4Var2.h = gg1Var2;
            this.d = rz0Var2;
        } catch (Throwable th) {
            y00Var.i();
            ci4Var2.K(wu0Var);
            ci4Var2.M(dx1Var2);
            ci4Var2.J(y00VarY);
            ci4Var2.N(jC);
            ci4Var2.h = gg1Var2;
            throw th;
        }
    }

    @Override // defpackage.wu0
    public final long c0(long j) {
        return this.c.c0(j);
    }

    public final void d(yx yxVar, long j, long j2, float f, uz0 uz0Var, int i) {
        a10 a10Var = this.c;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        a10Var.c.c.r(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), a10Var.c(yxVar, uz0Var, f, null, i, 1));
    }

    public final void e(yx yxVar, long j, long j2, long j3, float f, uz0 uz0Var) {
        a10 a10Var = this.c;
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        a10Var.c.c.b(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), a10Var.c(yxVar, uz0Var, f, null, 3, 1));
    }

    @Override // defpackage.wu0
    public final float f0(long j) {
        return this.c.f0(j);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c.getDensity();
    }

    @Override // defpackage.tz0
    public final dx1 getLayoutDirection() {
        return this.c.c.b;
    }

    @Override // defpackage.tz0
    public final void j0(long j, float f, long j2, uz0 uz0Var) {
        this.c.j0(j, f, j2, uz0Var);
    }

    @Override // defpackage.tz0
    public final void k(bm1 bm1Var, long j, long j2, long j3, long j4, float f, te0 te0Var, int i) {
        this.c.k(bm1Var, j, j2, j3, j4, f, te0Var, i);
    }

    @Override // defpackage.wu0
    public final long k0(float f) {
        return this.c.k0(f);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.c.l();
    }

    @Override // defpackage.wu0
    public final float q0(int i) {
        return this.c.q0(i);
    }

    @Override // defpackage.wu0
    public final float r0(float f) {
        return f / this.c.getDensity();
    }

    @Override // defpackage.tz0
    public final void s0(long j, float f, float f2, long j2, long j3, uz0 uz0Var) {
        this.c.s0(j, f, f2, j2, j3, uz0Var);
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return this.c.t(f);
    }

    @Override // defpackage.tz0
    public final void t0(nt2 nt2Var, yx yxVar, float f, uz0 uz0Var, int i) {
        this.c.t0(nt2Var, yxVar, f, uz0Var, i);
    }

    @Override // defpackage.wu0
    public final long u(long j) {
        return this.c.u(j);
    }

    @Override // defpackage.tz0
    public final void v(long j, long j2, long j3, long j4, uz0 uz0Var) {
        this.c.v(j, j2, j3, j4, uz0Var);
    }

    @Override // defpackage.wu0
    public final float w(float f) {
        return this.c.getDensity() * f;
    }
}

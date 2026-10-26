package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pn0 extends of2 implements rz0, lx1, xe3 {
    public a8 c;
    public sn0 d;
    public float h;
    public te0 l;
    public boolean m;
    public String n;
    public ym0 o;
    public final tm p;

    public pn0(tm tmVar, a8 a8Var, sn0 sn0Var, float f, te0 te0Var, boolean z, String str, ym0 ym0Var) {
        this.c = a8Var;
        this.d = sn0Var;
        this.h = f;
        this.l = te0Var;
        this.m = z;
        this.n = str;
        this.o = ym0Var;
        this.p = tmVar;
    }

    @Override // defpackage.rz0
    public final void L(wx1 wx1Var) {
        a10 a10Var = wx1Var.c;
        long jV0 = v0(a10Var.b());
        long jA = this.c.a(ra4.a(jV0), ra4.a(a10Var.b()), wx1Var.getLayoutDirection());
        int i = (int) (jA >> 32);
        int i2 = (int) (jA & 4294967295L);
        ci4 ci4Var = a10Var.d;
        long jC = ci4Var.C();
        ci4Var.y().l();
        try {
            jb jbVar = (jb) ci4Var.d;
            ci4 ci4Var2 = (ci4) jbVar.d;
            if (this.m) {
                jbVar.u(0.0f, 0.0f, Float.intBitsToFloat((int) (ci4Var2.C() >> 32)), Float.intBitsToFloat((int) (4294967295L & ci4Var2.C())), 1);
            }
            jbVar.B(i, i2);
            this.p.g(wx1Var, jV0, this.h, this.l);
            ci4Var.y().i();
            ci4Var.N(jC);
            wx1Var.a();
        } catch (Throwable th) {
            fq2.x(ci4Var, jC);
            throw th;
        }
    }

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        long jB = wm0.b(0, i, 7);
        ym0 ym0Var = this.o;
        if (ym0Var != null) {
            ym0Var.c(jB);
        }
        if (this.p.h() == 9205357640488583168L) {
            return qb2Var.M(i);
        }
        long jW0 = w0(jB);
        return Math.max(um0.j(jW0), qb2Var.M(i));
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        String str = this.n;
        if (str != null) {
            ef3.f(gf3Var, str);
            ef3.j(gf3Var, 5);
        }
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        ym0 ym0Var = this.o;
        if (ym0Var != null) {
            ym0Var.c(j);
        }
        nv2 nv2VarC = qb2Var.c(w0(j));
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new v(nv2VarC, 0));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        long jB = wm0.b(0, i, 7);
        ym0 ym0Var = this.o;
        if (ym0Var != null) {
            ym0Var.c(jB);
        }
        if (this.p.h() == 9205357640488583168L) {
            return qb2Var.Q(i);
        }
        long jW0 = w0(jB);
        return Math.max(um0.j(jW0), qb2Var.Q(i));
    }

    @Override // defpackage.of2
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        long jB = wm0.b(i, 0, 13);
        ym0 ym0Var = this.o;
        if (ym0Var != null) {
            ym0Var.c(jB);
        }
        if (this.p.h() == 9205357640488583168L) {
            return qb2Var.d(i);
        }
        long jW0 = w0(jB);
        return Math.max(um0.i(jW0), qb2Var.d(i));
    }

    @Override // defpackage.of2
    public final void onAttach() {
        gq0 coroutineScope = getCoroutineScope();
        tm tmVar = this.p;
        tmVar.t = coroutineScope;
        tmVar.a();
    }

    @Override // defpackage.of2
    public final void onDetach() {
        this.p.d();
    }

    @Override // defpackage.of2
    public final void onReset() {
        this.p.m(null);
    }

    public final long v0(long j) {
        if (bi3.e(j)) {
            return 0L;
        }
        long jH = this.p.h();
        if (jH != 9205357640488583168L) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
            if (Math.abs(fIntBitsToFloat) > Float.MAX_VALUE) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
            if (Math.abs(fIntBitsToFloat2) > Float.MAX_VALUE) {
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            long jB = this.d.b(jFloatToRawIntBits, j);
            if (Math.abs(Float.intBitsToFloat((int) (jB >> 32))) <= Float.MAX_VALUE && Math.abs(Float.intBitsToFloat((int) (4294967295L & jB))) <= Float.MAX_VALUE) {
                return vl0.e0(jFloatToRawIntBits, jB);
            }
        }
        return j;
    }

    public final long w0(long j) {
        float fJ;
        int i;
        float fW;
        boolean zF = um0.f(j);
        boolean zE = um0.e(j);
        if (!zF || !zE) {
            boolean z = um0.d(j) && um0.c(j);
            tm tmVar = this.p;
            long jH = tmVar.h();
            if (jH != 9205357640488583168L) {
                if (!z || (!zF && !zE)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
                    if (Math.abs(fIntBitsToFloat) <= Float.MAX_VALUE) {
                        int i2 = ra4.b;
                        fJ = py.w(fIntBitsToFloat, um0.j(j), um0.h(j));
                    } else {
                        fJ = um0.j(j);
                    }
                    if (Math.abs(fIntBitsToFloat2) <= Float.MAX_VALUE) {
                        int i3 = ra4.b;
                        fW = py.w(fIntBitsToFloat2, um0.i(j), um0.g(j));
                    } else {
                        i = um0.i(j);
                    }
                    long jV0 = v0((((long) Float.floatToRawIntBits(fW)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                    return um0.a(j, wm0.g(j, gb2.R(Float.intBitsToFloat((int) (jV0 >> 32)))), 0, wm0.f(j, gb2.R(Float.intBitsToFloat((int) (jV0 & 4294967295L)))), 0, 10);
                }
                fJ = um0.h(j);
                i = um0.g(j);
                fW = i;
                long jV1 = v0((((long) Float.floatToRawIntBits(fW)) & 4294967295L) | (((long) Float.floatToRawIntBits(fJ)) << 32));
                return um0.a(j, wm0.g(j, gb2.R(Float.intBitsToFloat((int) (jV1 >> 32)))), 0, wm0.f(j, gb2.R(Float.intBitsToFloat((int) (jV1 & 4294967295L)))), 0, 10);
            }
            if (z && ((sm) tmVar.C.c.getValue()).a() != null) {
                return um0.a(j, um0.h(j), 0, um0.g(j), 0, 10);
            }
        }
        return j;
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        long jB = wm0.b(i, 0, 13);
        ym0 ym0Var = this.o;
        if (ym0Var != null) {
            ym0Var.c(jB);
        }
        if (this.p.h() == 9205357640488583168L) {
            return qb2Var.R(i);
        }
        long jW0 = w0(jB);
        return Math.max(um0.i(jW0), qb2Var.R(i));
    }
}

package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class s82 extends nv2 implements qb2, f8, bg2 {
    public boolean C;
    public Object E;
    public boolean F;
    public final yx1 n;
    public boolean o;
    public boolean s;
    public boolean t;
    public boolean u;
    public um0 v;
    public le1 x;
    public int p = IntCompanionObject.MAX_VALUE;
    public int q = IntCompanionObject.MAX_VALUE;
    public sx1 r = sx1.h;
    public long w = 0;
    public q82 y = q82.h;
    public final vx1 z = new vx1(this, 1);
    public final oi2 A = new oi2(0, new s82[16]);
    public boolean B = true;
    public boolean D = true;

    public s82(yx1 yx1Var) {
        this.n = yx1Var;
        this.E = yx1Var.p.z;
    }

    @Override // defpackage.qb2
    public final int M(int i) {
        v0();
        o82 o82VarN0 = this.n.a().N0();
        o82VarN0.getClass();
        return o82VarN0.M(i);
    }

    @Override // defpackage.f8
    public final void P() {
        ux1.Q(this.n.a, false, 7);
    }

    @Override // defpackage.qb2
    public final int Q(int i) {
        v0();
        o82 o82VarN0 = this.n.a().N0();
        o82VarN0.getClass();
        return o82VarN0.Q(i);
    }

    @Override // defpackage.qb2
    public final int R(int i) {
        v0();
        o82 o82VarN0 = this.n.a().N0();
        o82VarN0.getClass();
        return o82VarN0.R(i);
    }

    @Override // defpackage.nv2
    public final int U(ti1 ti1Var) {
        yx1 yx1Var = this.n;
        ux1 ux1VarT = yx1Var.a.t();
        qx1 qx1Var = ux1VarT != null ? ux1VarT.O.d : null;
        qx1 qx1Var2 = qx1.d;
        vx1 vx1Var = this.z;
        if (qx1Var == qx1Var2) {
            vx1Var.c = true;
        } else {
            ux1 ux1VarT2 = yx1Var.a.t();
            if ((ux1VarT2 != null ? ux1VarT2.O.d : null) == qx1.l) {
                vx1Var.d = true;
            }
        }
        this.s = true;
        o82 o82VarN0 = yx1Var.a().N0();
        o82VarN0.getClass();
        int iU = o82VarN0.U(ti1Var);
        this.s = false;
        return iU;
    }

    @Override // defpackage.nv2
    public final int X() {
        o82 o82VarN0 = this.n.a().N0();
        o82VarN0.getClass();
        return o82VarN0.X();
    }

    @Override // defpackage.f8
    public final vx1 a() {
        return this.z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    @Override // defpackage.qb2
    public final nv2 c(long j) {
        sx1 sx1Var;
        yx1 yx1Var = this.n;
        ux1 ux1Var = yx1Var.a;
        ux1 ux1Var2 = yx1Var.a;
        ux1 ux1VarT = ux1Var.t();
        if ((ux1VarT != null ? ux1VarT.O.d : null) == qx1.d) {
            yx1Var.b = false;
        } else {
            ux1 ux1VarT2 = ux1Var2.t();
            if ((ux1VarT2 != null ? ux1VarT2.O.d : null) == qx1.l) {
                yx1Var.b = false;
            }
        }
        ux1 ux1VarT3 = ux1Var2.t();
        sx1 sx1Var2 = sx1.h;
        if (ux1VarT3 != null) {
            yx1 yx1Var2 = ux1VarT3.O;
            if (this.r != sx1Var2 && !ux1Var2.M) {
                po1.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = yx1Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                sx1Var = sx1.c;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    m51.B(yx1Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                sx1Var = sx1.d;
            }
            this.r = sx1Var;
        } else {
            this.r = sx1Var2;
        }
        if (ux1Var2.K == sx1Var2) {
            ux1Var2.c();
        }
        y0(j);
        return this;
    }

    @Override // defpackage.qb2
    public final int d(int i) {
        v0();
        o82 o82VarN0 = this.n.a().N0();
        o82VarN0.getClass();
        return o82VarN0.d(i);
    }

    @Override // defpackage.nv2
    public final int e0() {
        o82 o82VarN0 = this.n.a().N0();
        o82VarN0.getClass();
        return o82VarN0.e0();
    }

    @Override // defpackage.nv2, defpackage.qb2
    public final Object i() {
        return this.E;
    }

    @Override // defpackage.nv2
    public final void i0(long j, float f, le1 le1Var) {
        x0(j, le1Var);
    }

    @Override // defpackage.f8
    public final void m(e8 e8Var) {
        oi2 oi2VarX = this.n.a.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            s82 s82Var = ((ux1) objArr[i2]).O.q;
            s82Var.getClass();
            e8Var.invoke(s82Var);
        }
    }

    @Override // defpackage.bg2
    public final void n(boolean z) {
        o82 o82VarN0;
        yx1 yx1Var = this.n;
        o82 o82VarN1 = yx1Var.a().N0();
        if (Boolean.valueOf(z).equals(o82VarN1 != null ? Boolean.valueOf(o82VarN1.n) : null) || (o82VarN0 = yx1Var.a().N0()) == null) {
            return;
        }
        o82VarN0.n = z;
    }

    public final void n0(boolean z) {
        yx1 yx1Var = this.n;
        if (z && yx1Var.c) {
            return;
        }
        if (z || yx1Var.c) {
            this.y = q82.h;
            oi2 oi2VarX = yx1Var.a.x();
            Object[] objArr = oi2VarX.c;
            int i = oi2VarX.h;
            for (int i2 = 0; i2 < i; i2++) {
                s82 s82Var = ((ux1) objArr[i2]).O.q;
                s82Var.getClass();
                s82Var.n0(true);
            }
        }
    }

    @Override // defpackage.f8
    public final xo1 o() {
        return (xo1) this.n.a.N.c;
    }

    public final void o0() {
        q82 q82Var = this.y;
        yx1 yx1Var = this.n;
        boolean z = yx1Var.c;
        ux1 ux1Var = yx1Var.a;
        q82 q82Var2 = q82.c;
        if (z) {
            this.y = q82.d;
        } else {
            this.y = q82Var2;
        }
        if (q82Var != q82Var2 && yx1Var.e) {
            ux1.Q(ux1Var, true, 6);
        }
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            s82 s82Var = ux1Var2.O.q;
            if (s82Var == null) {
                u41.k("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (s82Var.q != Integer.MAX_VALUE) {
                s82Var.o0();
                ux1.T(ux1Var2);
            }
        }
    }

    @Override // defpackage.f8
    public final f8 p() {
        yx1 yx1Var;
        ux1 ux1VarT = this.n.a.t();
        if (ux1VarT == null || (yx1Var = ux1VarT.O) == null) {
            return null;
        }
        return yx1Var.q;
    }

    public final void p0() {
        yx1 yx1Var = this.n;
        if (yx1Var.o > 0) {
            oi2 oi2VarX = yx1Var.a.x();
            Object[] objArr = oi2VarX.c;
            int i = oi2VarX.h;
            for (int i2 = 0; i2 < i; i2++) {
                ux1 ux1Var = (ux1) objArr[i2];
                yx1 yx1Var2 = ux1Var.O;
                if ((yx1Var2.m || yx1Var2.n) && !yx1Var2.f) {
                    ux1Var.P(false);
                }
                s82 s82Var = yx1Var2.q;
                if (s82Var != null) {
                    s82Var.p0();
                }
            }
        }
    }

    @Override // defpackage.f8
    public final void q() {
        this.C = true;
        vx1 vx1Var = this.z;
        vx1Var.h();
        yx1 yx1Var = this.n;
        boolean z = yx1Var.f;
        ux1 ux1Var = yx1Var.a;
        if (z) {
            oi2 oi2VarX = ux1Var.x();
            Object[] objArr = oi2VarX.c;
            int i = oi2VarX.h;
            for (int i2 = 0; i2 < i; i2++) {
                ux1 ux1Var2 = (ux1) objArr[i2];
                yx1 yx1Var2 = ux1Var2.O;
                if (yx1Var2.e && ux1Var2.r() == sx1.c) {
                    s82 s82Var = yx1Var2.q;
                    s82Var.getClass();
                    s82 s82Var2 = yx1Var2.q;
                    um0 um0Var = s82Var2 != null ? s82Var2.v : null;
                    um0Var.getClass();
                    if (s82Var.y0(um0Var.a)) {
                        ux1.Q(ux1Var, false, 7);
                    }
                }
            }
        }
        wo1 wo1Var = o().U;
        wo1Var.getClass();
        if (yx1Var.g || (!this.s && !wo1Var.p && yx1Var.f)) {
            yx1Var.f = false;
            qx1 qx1Var = yx1Var.d;
            yx1Var.d = qx1.l;
            yr2 yr2VarA = xx1.a(ux1Var);
            yx1Var.g(false);
            as2 snapshotObserver = yr2VarA.getSnapshotObserver();
            c9 c9Var = new c9(this, 16, wo1Var);
            snapshotObserver.getClass();
            if (ux1Var.p != null) {
                snapshotObserver.a(ux1Var, snapshotObserver.h, c9Var);
            } else {
                snapshotObserver.a(ux1Var, snapshotObserver.e, c9Var);
            }
            yx1Var.d = qx1Var;
            if (yx1Var.m && wo1Var.p) {
                requestLayout();
            }
            yx1Var.g = false;
        }
        if (vx1Var.d) {
            vx1Var.e = true;
        }
        if (vx1Var.b && vx1Var.e()) {
            vx1Var.g();
        }
        this.C = false;
    }

    @Override // defpackage.f8
    public final void requestLayout() {
        this.n.a.P(false);
    }

    public final void v0() {
        sx1 sx1Var;
        yx1 yx1Var = this.n;
        ux1.Q(yx1Var.a, false, 7);
        ux1 ux1Var = yx1Var.a;
        ux1 ux1VarT = ux1Var.t();
        if (ux1VarT == null || ux1Var.K != sx1.h) {
            return;
        }
        int iOrdinal = ux1VarT.O.d.ordinal();
        if (iOrdinal != 0) {
            sx1Var = iOrdinal != 2 ? ux1VarT.K : sx1.d;
        } else {
            sx1Var = sx1.c;
        }
        ux1Var.K = sx1Var;
    }

    public final void w0() {
        qx1 qx1Var;
        this.F = true;
        yx1 yx1Var = this.n;
        ux1 ux1VarT = yx1Var.a.t();
        q82 q82Var = this.y;
        if ((q82Var != q82.c && !yx1Var.c) || (q82Var != q82.d && yx1Var.c)) {
            o0();
            if (this.o && ux1VarT != null) {
                ux1VarT.P(false);
            }
        }
        if (ux1VarT != null) {
            yx1 yx1Var2 = ux1VarT.O;
            if (!this.o && ((qx1Var = yx1Var2.d) == qx1.h || qx1Var == qx1.l)) {
                if (this.q != Integer.MAX_VALUE) {
                    po1.b("Place was called on a node which was placed already");
                }
                int i = yx1Var2.h;
                this.q = i;
                yx1Var2.h = i + 1;
            }
        } else {
            this.q = 0;
        }
        q();
    }

    @Override // defpackage.f8
    public final boolean x() {
        return this.y != q82.h;
    }

    public final void x0(long j, le1 le1Var) {
        yx1 yx1Var = this.n;
        ux1 ux1Var = yx1Var.a;
        ux1 ux1Var2 = yx1Var.a;
        ux1 ux1VarT = ux1Var.t();
        qx1 qx1Var = ux1VarT != null ? ux1VarT.O.d : null;
        qx1 qx1Var2 = qx1.l;
        if (qx1Var == qx1Var2) {
            yx1Var.c = false;
        }
        if (ux1Var2.X) {
            po1.a("place is called on a deactivated node");
        }
        yx1Var.d = qx1Var2;
        this.t = true;
        this.F = false;
        if (!iq1.a(j, this.w)) {
            if (yx1Var.n || yx1Var.m) {
                yx1Var.f = true;
            }
            p0();
        }
        yr2 yr2VarA = xx1.a(ux1Var2);
        if (yx1Var.f || !x()) {
            yx1Var.f(false);
            this.z.g = false;
            as2 snapshotObserver = yr2VarA.getSnapshotObserver();
            r82 r82Var = new r82(this, yr2VarA, j);
            snapshotObserver.getClass();
            if (ux1Var2.p != null) {
                snapshotObserver.a(ux1Var2, snapshotObserver.g, r82Var);
            } else {
                snapshotObserver.a(ux1Var2, snapshotObserver.f, r82Var);
            }
        } else {
            o82 o82VarN0 = yx1Var.a().N0();
            o82VarN0.getClass();
            o82VarN0.F0(iq1.c(j, o82VarN0.m));
            w0();
        }
        this.w = j;
        this.x = le1Var;
        yx1Var.d = qx1.m;
    }

    public final boolean y0(long j) {
        yx1 yx1Var = this.n;
        ux1 ux1Var = yx1Var.a;
        ux1 ux1Var2 = yx1Var.a;
        if (ux1Var.X) {
            po1.a("measure is called on a deactivated node");
        }
        ux1 ux1VarT = ux1Var2.t();
        int i = 1;
        ux1Var2.M = ux1Var2.M || (ux1VarT != null && ux1VarT.M);
        if (!ux1Var2.O.e) {
            um0 um0Var = this.v;
            if (um0Var == null ? false : um0.b(um0Var.a, j)) {
                yr2 yr2Var = ux1Var2.v;
                if (yr2Var != null) {
                    yr2Var.forceMeasureTheSubtree(ux1Var2, true);
                }
                ux1Var2.U();
                return false;
            }
        }
        this.v = new um0(j);
        m0(j);
        this.z.f = false;
        oi2 oi2VarX = ux1Var2.x();
        Object[] objArr = oi2VarX.c;
        int i2 = oi2VarX.h;
        for (int i3 = 0; i3 < i2; i3++) {
            s82 s82Var = ((ux1) objArr[i3]).O.q;
            s82Var.getClass();
            s82Var.z.c = false;
        }
        long j2 = this.u ? this.h : -9223372034707292160L;
        this.u = true;
        o82 o82VarN0 = yx1Var.a().N0();
        if (o82VarN0 == null) {
            po1.b("Lookahead result from lookaheadRemeasure cannot be null");
        }
        s82 s82Var2 = yx1Var.q;
        if (s82Var2 != null) {
            yx1 yx1Var2 = s82Var2.n;
            yx1Var2.d = qx1.d;
            ux1 ux1Var3 = yx1Var2.a;
            yx1Var2.e = false;
            as2 snapshotObserver = xx1.a(ux1Var3).getSnapshotObserver();
            ae aeVar = new ae(i, j, s82Var2);
            snapshotObserver.getClass();
            if (ux1Var3.p != null) {
                snapshotObserver.a(ux1Var3, snapshotObserver.b, aeVar);
            } else {
                snapshotObserver.a(ux1Var3, snapshotObserver.c, aeVar);
            }
            yx1Var2.f = true;
            yx1Var2.g = true;
            boolean zL = sf3.L(ux1Var3);
            ub2 ub2Var = yx1Var2.p;
            if (zL) {
                ub2Var.D = true;
                ub2Var.E = true;
            } else {
                ub2Var.C = true;
            }
            yx1Var2.d = qx1.m;
        }
        l0((((long) o82VarN0.c) << 32) | (((long) o82VarN0.d) & 4294967295L));
        return (((int) (j2 >> 32)) == o82VarN0.c && ((int) (j2 & 4294967295L)) == o82VarN0.d) ? false : true;
    }
}

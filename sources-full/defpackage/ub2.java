package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 extends nv2 implements qb2, f8, bg2 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean I;
    public float M;
    public boolean N;
    public le1 O;
    public float Q;
    public boolean S;
    public final yx1 n;
    public boolean o;
    public boolean r;
    public boolean s;
    public boolean u;
    public le1 w;
    public float x;
    public Object z;
    public int p = IntCompanionObject.MAX_VALUE;
    public int q = IntCompanionObject.MAX_VALUE;
    public sx1 t = sx1.h;
    public long v = 0;
    public boolean y = true;
    public final vx1 F = new vx1(this, 0);
    public final oi2 G = new oi2(0, new ub2[16]);
    public boolean H = true;
    public long J = wm0.b(0, 0, 15);
    public final tb2 K = new tb2(this, 1);
    public final tb2 L = new tb2(this, 0);
    public long P = 0;
    public final tb2 R = new tb2(this, 2);

    public ub2(yx1 yx1Var) {
        this.n = yx1Var;
    }

    @Override // defpackage.qb2
    public final int M(int i) {
        yx1 yx1Var = this.n;
        if (!sf3.L(yx1Var.a)) {
            w0();
            return yx1Var.a().M(i);
        }
        s82 s82Var = yx1Var.q;
        s82Var.getClass();
        return s82Var.M(i);
    }

    @Override // defpackage.f8
    public final void P() {
        ux1.S(this.n.a, false, 7);
    }

    @Override // defpackage.qb2
    public final int Q(int i) {
        yx1 yx1Var = this.n;
        if (!sf3.L(yx1Var.a)) {
            w0();
            return yx1Var.a().Q(i);
        }
        s82 s82Var = yx1Var.q;
        s82Var.getClass();
        return s82Var.Q(i);
    }

    @Override // defpackage.qb2
    public final int R(int i) {
        yx1 yx1Var = this.n;
        if (!sf3.L(yx1Var.a)) {
            w0();
            return yx1Var.a().R(i);
        }
        s82 s82Var = yx1Var.q;
        s82Var.getClass();
        return s82Var.R(i);
    }

    @Override // defpackage.nv2
    public final int U(ti1 ti1Var) {
        yx1 yx1Var = this.n;
        ux1 ux1VarT = yx1Var.a.t();
        qx1 qx1Var = ux1VarT != null ? ux1VarT.O.d : null;
        qx1 qx1Var2 = qx1.c;
        vx1 vx1Var = this.F;
        if (qx1Var == qx1Var2) {
            vx1Var.c = true;
        } else {
            ux1 ux1VarT2 = yx1Var.a.t();
            if ((ux1VarT2 != null ? ux1VarT2.O.d : null) == qx1.h) {
                vx1Var.d = true;
            }
        }
        this.u = true;
        int iU = yx1Var.a().U(ti1Var);
        this.u = false;
        return iU;
    }

    @Override // defpackage.nv2
    public final int X() {
        return this.n.a().X();
    }

    @Override // defpackage.f8
    public final vx1 a() {
        return this.F;
    }

    @Override // defpackage.qb2
    public final nv2 c(long j) {
        sx1 sx1Var;
        yx1 yx1Var = this.n;
        ux1 ux1Var = yx1Var.a;
        ux1 ux1Var2 = yx1Var.a;
        sx1 sx1Var2 = ux1Var.K;
        sx1 sx1Var3 = sx1.h;
        if (sx1Var2 == sx1Var3) {
            ux1Var.c();
        }
        if (sf3.L(ux1Var2)) {
            s82 s82Var = yx1Var.q;
            s82Var.getClass();
            s82Var.r = sx1Var3;
            s82Var.c(j);
        }
        ux1 ux1VarT = ux1Var2.t();
        if (ux1VarT != null) {
            yx1 yx1Var2 = ux1VarT.O;
            if (this.t != sx1Var3 && !ux1Var2.M) {
                po1.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = yx1Var2.d.ordinal();
            if (iOrdinal == 0) {
                sx1Var = sx1.c;
            } else {
                if (iOrdinal != 2) {
                    m51.B(yx1Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                sx1Var = sx1.d;
            }
            this.t = sx1Var;
        } else {
            this.t = sx1Var3;
        }
        z0(j);
        return this;
    }

    @Override // defpackage.qb2
    public final int d(int i) {
        yx1 yx1Var = this.n;
        if (!sf3.L(yx1Var.a)) {
            w0();
            return yx1Var.a().d(i);
        }
        s82 s82Var = yx1Var.q;
        s82Var.getClass();
        return s82Var.d(i);
    }

    @Override // defpackage.nv2
    public final int e0() {
        return this.n.a().e0();
    }

    @Override // defpackage.nv2, defpackage.qb2
    public final Object i() {
        return this.z;
    }

    @Override // defpackage.nv2
    public final void i0(long j, float f, le1 le1Var) {
        boolean z;
        mv2 placementScope;
        this.B = true;
        boolean zA = iq1.a(j, this.v);
        yx1 yx1Var = this.n;
        if (!zA || this.S) {
            if (yx1Var.k || yx1Var.j || this.S) {
                this.D = true;
                this.S = false;
            }
            v0();
        }
        s82 s82Var = yx1Var.q;
        ux1 ux1Var = yx1Var.a;
        if (s82Var != null) {
            yx1 yx1Var2 = s82Var.n;
            if (sf3.L(yx1Var2.a)) {
                z = true;
            } else {
                if (s82Var.y == q82.h && !yx1Var2.b) {
                    yx1Var2.c = true;
                }
                z = yx1Var2.c;
            }
            if (z) {
                wl2 wl2Var = yx1Var.a().v;
                if (wl2Var == null || (placementScope = wl2Var.q) == null) {
                    placementScope = xx1.a(ux1Var).getPlacementScope();
                }
                s82 s82Var2 = yx1Var.q;
                s82Var2.getClass();
                ux1 ux1VarT = ux1Var.t();
                if (ux1VarT != null) {
                    ux1VarT.O.h = 0;
                }
                s82Var2.q = IntCompanionObject.MAX_VALUE;
                mv2.d(placementScope, s82Var2, (int) (j >> 32), (int) (4294967295L & j));
            }
        }
        s82 s82Var3 = yx1Var.q;
        if (s82Var3 != null && !s82Var3.t) {
            po1.b("Error: Placement happened before lookahead.");
        }
        y0(j, f, le1Var);
    }

    @Override // defpackage.f8
    public final void m(e8 e8Var) {
        oi2 oi2VarX = this.n.a.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            e8Var.invoke(((ux1) objArr[i2]).O.p);
        }
    }

    @Override // defpackage.bg2
    public final void n(boolean z) {
        yx1 yx1Var = this.n;
        if (z != yx1Var.a().n) {
            yx1Var.a().n = z;
            this.S = true;
        }
    }

    public final List n0() {
        yx1 yx1Var = this.n;
        yx1Var.a.a0();
        boolean z = this.H;
        oi2 oi2Var = this.G;
        if (!z) {
            return oi2Var.h();
        }
        ux1 ux1Var = yx1Var.a;
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (oi2Var.h <= i2) {
                oi2Var.c(ux1Var2.O.p);
            } else {
                ub2 ub2Var = ux1Var2.O.p;
                Object[] objArr2 = oi2Var.c;
                Object obj = objArr2[i2];
                objArr2[i2] = ub2Var;
            }
        }
        oi2Var.n(((oi2) ((th2) ux1Var.n()).d).h, oi2Var.h);
        this.H = false;
        return oi2Var.h();
    }

    @Override // defpackage.f8
    public final xo1 o() {
        return (xo1) this.n.a.N.c;
    }

    public final void o0() {
        boolean z = this.A;
        this.A = true;
        ux1 ux1Var = this.n.a;
        yd ydVar = ux1Var.N;
        if (!z) {
            ((xo1) ydVar.c).c1();
            if (ux1Var.q()) {
                ux1.S(ux1Var, true, 6);
            } else if (ux1Var.O.e) {
                ux1.Q(ux1Var, true, 6);
            }
        }
        wl2 wl2Var = ((xo1) ydVar.c).u;
        for (wl2 wl2Var2 = (wl2) ydVar.d; !kr1.n(wl2Var2, wl2Var) && wl2Var2 != null; wl2Var2 = wl2Var2.u) {
            if (wl2Var2.M) {
                wl2Var2.W0();
            }
        }
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (ux1Var2.u() != Integer.MAX_VALUE) {
                ux1Var2.O.p.o0();
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
        return yx1Var.p;
    }

    public final void p0() {
        if (this.A) {
            this.A = false;
            yx1 yx1Var = this.n;
            yd ydVar = yx1Var.a.N;
            wl2 wl2Var = ((xo1) ydVar.c).u;
            for (wl2 wl2Var2 = (wl2) ydVar.d; !kr1.n(wl2Var2, wl2Var) && wl2Var2 != null; wl2Var2 = wl2Var2.u) {
                of2 of2VarR0 = wl2Var2.R0(xl2.h(1048576));
                if (of2VarR0 != null && (of2VarR0.getNode().getAggregateChildKindSet$ui_release() & 1048576) != 0) {
                    boolean zH = xl2.h(1048576);
                    of2 of2VarP0 = wl2Var2.P0();
                    if (zH || (of2VarP0 = of2VarP0.getParent$ui_release()) != null) {
                        for (of2 of2VarR1 = wl2Var2.R0(zH); of2VarR1 != null && (of2VarR1.getAggregateChildKindSet$ui_release() & 1048576) != 0; of2VarR1 = of2VarR1.getChild$ui_release()) {
                            if ((of2VarR1.getKindSet$ui_release() & 1048576) != 0) {
                                of2 of2VarE = of2VarR1;
                                oi2 oi2Var = null;
                                while (of2VarE != null) {
                                    if ((of2VarE.getKindSet$ui_release() & 1048576) != 0 && (of2VarE instanceof ju0)) {
                                        int i = 0;
                                        for (of2 child$ui_release = ((ju0) of2VarE).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                                            if ((child$ui_release.getKindSet$ui_release() & 1048576) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    of2VarE = child$ui_release;
                                                } else {
                                                    if (oi2Var == null) {
                                                        oi2Var = new oi2(0, new of2[16]);
                                                    }
                                                    if (of2VarE != null) {
                                                        oi2Var.c(of2VarE);
                                                        of2VarE = null;
                                                    }
                                                    oi2Var.c(child$ui_release);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    of2VarE = y64.e(oi2Var);
                                }
                            }
                            if (of2VarR1 == of2VarP0) {
                                break;
                            }
                        }
                    }
                }
                if (wl2Var2.N != null) {
                    wl2Var2.l1(null, false);
                    wl2Var2.t.R(false);
                }
            }
            oi2 oi2VarX = yx1Var.a.x();
            Object[] objArr = oi2VarX.c;
            int i2 = oi2VarX.h;
            for (int i3 = 0; i3 < i2; i3++) {
                ((ux1) objArr[i3]).O.p.p0();
            }
        }
    }

    @Override // defpackage.f8
    public final void q() {
        boolean zZ0;
        this.I = true;
        vx1 vx1Var = this.F;
        vx1Var.h();
        boolean z = this.D;
        yx1 yx1Var = this.n;
        if (z) {
            oi2 oi2VarX = yx1Var.a.x();
            Object[] objArr = oi2VarX.c;
            int i = oi2VarX.h;
            for (int i2 = 0; i2 < i; i2++) {
                ux1 ux1Var = (ux1) objArr[i2];
                boolean zQ = ux1Var.q();
                yx1 yx1Var2 = ux1Var.O;
                if (zQ) {
                    ub2 ub2Var = yx1Var2.p;
                    if (ub2Var.t == sx1.c) {
                        um0 um0Var = ub2Var.r ? new um0(ub2Var.l) : null;
                        if (um0Var != null) {
                            if (ux1Var.K == sx1.h) {
                                ux1Var.c();
                            }
                            zZ0 = yx1Var2.p.z0(um0Var.a);
                        } else {
                            zZ0 = false;
                        }
                        if (zZ0) {
                            ux1.S(yx1Var.a, false, 7);
                        }
                    }
                }
            }
        }
        if (this.E || (!this.u && !o().p && this.D)) {
            this.D = false;
            qx1 qx1Var = yx1Var.d;
            yx1Var.d = qx1.h;
            yx1Var.e(false);
            ux1 ux1Var2 = yx1Var.a;
            as2 snapshotObserver = xx1.a(ux1Var2).getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(ux1Var2, snapshotObserver.e, this.L);
            yx1Var.d = qx1Var;
            if (o().p && yx1Var.j) {
                requestLayout();
            }
            this.E = false;
        }
        if (vx1Var.d) {
            vx1Var.e = true;
        }
        if (vx1Var.b && vx1Var.e()) {
            vx1Var.g();
        }
        this.I = false;
    }

    @Override // defpackage.f8
    public final void requestLayout() {
        this.n.a.R(false);
    }

    public final void v0() {
        yx1 yx1Var = this.n;
        if (yx1Var.l > 0) {
            oi2 oi2VarX = yx1Var.a.x();
            Object[] objArr = oi2VarX.c;
            int i = oi2VarX.h;
            for (int i2 = 0; i2 < i; i2++) {
                ux1 ux1Var = (ux1) objArr[i2];
                yx1 yx1Var2 = ux1Var.O;
                boolean z = yx1Var2.j;
                ub2 ub2Var = yx1Var2.p;
                if ((z || yx1Var2.k) && !ub2Var.D) {
                    ux1Var.R(false);
                }
                ub2Var.v0();
            }
        }
    }

    public final void w0() {
        sx1 sx1Var;
        yx1 yx1Var = this.n;
        ux1.S(yx1Var.a, false, 7);
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

    @Override // defpackage.f8
    public final boolean x() {
        return this.A;
    }

    public final void x0() {
        this.N = true;
        yx1 yx1Var = this.n;
        ux1 ux1VarT = yx1Var.a.t();
        float f = o().F;
        ux1 ux1Var = yx1Var.a;
        yd ydVar = ux1Var.N;
        xo1 xo1Var = (xo1) ydVar.c;
        for (wl2 wl2Var = (wl2) ydVar.d; wl2Var != xo1Var; wl2Var = wl2Var.u) {
            wl2Var.getClass();
            f += ((nx1) wl2Var).F;
        }
        if (f != this.M) {
            this.M = f;
            if (ux1VarT != null) {
                ux1VarT.L();
            }
            if (ux1VarT != null) {
                ux1VarT.A();
            }
        }
        if (this.A) {
            ((xo1) ux1Var.N.c).c1();
        } else {
            if (ux1VarT != null) {
                ux1VarT.A();
            }
            o0();
            if (this.o && ux1VarT != null) {
                ux1VarT.R(false);
            }
        }
        if (ux1VarT != null) {
            yx1 yx1Var2 = ux1VarT.O;
            if (!this.o && yx1Var2.d == qx1.h) {
                if (this.q != Integer.MAX_VALUE) {
                    po1.b("Place was called on a node which was placed already");
                }
                int i = yx1Var2.i;
                this.q = i;
                yx1Var2.i = i + 1;
            }
        } else {
            this.q = 0;
        }
        q();
    }

    public final void y0(long j, float f, le1 le1Var) {
        yx1 yx1Var = this.n;
        ux1 ux1Var = yx1Var.a;
        ux1 ux1Var2 = yx1Var.a;
        if (ux1Var.X) {
            po1.a("place is called on a deactivated node");
        }
        yx1Var.d = qx1.h;
        boolean z = !this.s;
        this.v = j;
        this.x = f;
        this.w = le1Var;
        this.s = true;
        this.N = false;
        yr2 yr2VarA = xx1.a(ux1Var2);
        yr2VarA.getRectManager().f(ux1Var2, j, z);
        if (this.D || !this.A) {
            this.F.g = false;
            yx1Var.d(false);
            this.O = le1Var;
            this.P = j;
            this.Q = f;
            as2 snapshotObserver = yr2VarA.getSnapshotObserver();
            snapshotObserver.getClass();
            snapshotObserver.a(ux1Var2, snapshotObserver.f, this.R);
        } else {
            wl2 wl2VarA = yx1Var.a();
            wl2VarA.f1(iq1.c(j, wl2VarA.m), f, le1Var);
            x0();
        }
        yx1Var.d = qx1.m;
    }

    public final boolean z0(long j) {
        yx1 yx1Var = this.n;
        ux1 ux1Var = yx1Var.a;
        ux1 ux1Var2 = yx1Var.a;
        if (ux1Var.X) {
            po1.a("measure is called on a deactivated node");
        }
        yr2 yr2VarA = xx1.a(ux1Var2);
        ux1 ux1VarT = ux1Var2.t();
        boolean z = true;
        ux1Var2.M = ux1Var2.M || (ux1VarT != null && ux1VarT.M);
        if (!ux1Var2.q() && um0.b(this.l, j)) {
            yr2VarA.forceMeasureTheSubtree(ux1Var2, false);
            ux1Var2.U();
            return false;
        }
        this.F.f = false;
        oi2 oi2VarX = ux1Var2.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ux1) objArr[i2]).O.p.F.c = false;
        }
        this.r = true;
        long j2 = yx1Var.a().h;
        m0(j);
        qx1 qx1Var = yx1Var.d;
        qx1 qx1Var2 = qx1.m;
        if (qx1Var != qx1Var2) {
            po1.b("layout state is not idle before measure starts");
        }
        this.J = j;
        qx1 qx1Var3 = qx1.c;
        yx1Var.d = qx1Var3;
        this.C = false;
        as2 snapshotObserver = xx1.a(ux1Var2).getSnapshotObserver();
        snapshotObserver.getClass();
        snapshotObserver.a(ux1Var2, snapshotObserver.c, this.K);
        if (yx1Var.d == qx1Var3) {
            this.D = true;
            this.E = true;
            yx1Var.d = qx1Var2;
        }
        if (qq1.a(yx1Var.a().h, j2) && yx1Var.a().c == this.c && yx1Var.a().d == this.d) {
            z = false;
        }
        l0((((long) yx1Var.a().d) & 4294967295L) | (((long) yx1Var.a().c) << 32));
        return z;
    }
}

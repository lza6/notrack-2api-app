package defpackage;

import java.util.Arrays;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class sb2 {
    public final ux1 a;
    public boolean c;
    public boolean d;
    public um0 i;
    public final bv0 b = new bv0(5);
    public final bv0 e = new bv0(9);
    public final oi2 f = new oi2(0, new xr2[16]);
    public final long g = 1;
    public final oi2 h = new oi2(0, new rb2[16]);

    public sb2(ux1 ux1Var) {
        this.a = ux1Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean c(ux1 ux1Var, um0 um0Var) {
        boolean zY0;
        ux1 ux1Var2 = ux1Var.p;
        yx1 yx1Var = ux1Var.O;
        if (ux1Var2 == null) {
            return false;
        }
        if (um0Var == null) {
            s82 s82Var = yx1Var.q;
            um0 um0Var2 = s82Var != null ? s82Var.v : null;
            if (um0Var2 == null || ux1Var2 == null) {
                zY0 = false;
            } else {
                s82Var.getClass();
                zY0 = s82Var.y0(um0Var2.a);
            }
        } else if (ux1Var2 != null) {
            s82 s82Var2 = yx1Var.q;
            s82Var2.getClass();
            zY0 = s82Var2.y0(um0Var.a);
        } else {
            zY0 = false;
        }
        ux1 ux1VarT = ux1Var.t();
        if (zY0 && ux1VarT != null) {
            if (ux1VarT.p == null) {
                ux1.S(ux1VarT, false, 3);
                return zY0;
            }
            if (ux1Var.r() == sx1.c) {
                ux1.Q(ux1VarT, false, 3);
                return zY0;
            }
            if (ux1Var.r() == sx1.d) {
                ux1VarT.P(false);
            }
        }
        return zY0;
    }

    public static boolean d(ux1 ux1Var, um0 um0Var) {
        boolean zZ0;
        sx1 sx1Var = sx1.h;
        if (um0Var != null) {
            if (ux1Var.K == sx1Var) {
                ux1Var.c();
            }
            zZ0 = ux1Var.O.p.z0(um0Var.a);
        } else {
            ub2 ub2Var = ux1Var.O.p;
            um0 um0Var2 = ub2Var.r ? new um0(ub2Var.l) : null;
            if (um0Var2 != null) {
                if (ux1Var.K == sx1Var) {
                    ux1Var.c();
                }
                zZ0 = ux1Var.O.p.z0(um0Var2.a);
            } else {
                zZ0 = false;
            }
        }
        ux1 ux1VarT = ux1Var.t();
        if (zZ0 && ux1VarT != null) {
            sx1 sx1Var2 = ux1Var.O.p.t;
            if (sx1Var2 == sx1.c) {
                ux1.S(ux1VarT, false, 3);
                return zZ0;
            }
            if (sx1Var2 == sx1.d) {
                ux1VarT.R(false);
            }
        }
        return zZ0;
    }

    public static boolean i(ux1 ux1Var) {
        if (!ux1Var.q()) {
            return false;
        }
        do {
            if (!j(ux1Var)) {
                ux1 ux1VarT = ux1Var.t();
                if ((ux1VarT != null ? ux1VarT.O.d : null) != qx1.c) {
                    return false;
                }
            }
            ux1Var = ux1Var.t();
            if (ux1Var == null) {
                return false;
            }
        } while (!ux1Var.G());
        return true;
    }

    public static boolean j(ux1 ux1Var) {
        ub2 ub2Var = ux1Var.O.p;
        return ub2Var.t == sx1.c || ub2Var.F.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v2, types: [of2] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void a() {
        of2 parent$ui_release;
        oi2 oi2Var = this.f;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            yd ydVar = ((ux1) ((xr2) objArr[i2])).N;
            xo1 xo1Var = (xo1) ydVar.c;
            boolean zH = xl2.h(Uuid.SIZE_BITS);
            if (zH) {
                parent$ui_release = xo1Var.T;
            } else {
                parent$ui_release = xo1Var.T.getParent$ui_release();
                if (parent$ui_release == null) {
                }
            }
            n63 n63Var = wl2.O;
            for (of2 of2VarR0 = xo1Var.R0(zH); of2VarR0 != null && (of2VarR0.getAggregateChildKindSet$ui_release() & Uuid.SIZE_BITS) != 0; of2VarR0 = of2VarR0.getChild$ui_release()) {
                if ((of2VarR0.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0) {
                    ?? E = of2VarR0;
                    ?? oi2Var2 = 0;
                    while (E != 0) {
                        if (E instanceof ax1) {
                            ((ax1) E).n((xo1) ydVar.c);
                        } else if ((E.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0 && (E instanceof ju0)) {
                            of2 child$ui_release = ((ju0) E).d;
                            int i3 = 0;
                            E = E;
                            oi2Var2 = oi2Var2;
                            while (child$ui_release != null) {
                                if ((child$ui_release.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        oi2Var2 = oi2Var2;
                                        E = child$ui_release;
                                    } else {
                                        if (oi2Var2 == 0) {
                                            oi2Var2 = new oi2(0, new of2[16]);
                                        }
                                        if (E != 0) {
                                            oi2Var2.c(E);
                                            E = 0;
                                        }
                                        oi2Var2.c(child$ui_release);
                                    }
                                }
                                child$ui_release = child$ui_release.getChild$ui_release();
                                E = E;
                                oi2Var2 = oi2Var2;
                            }
                            if (i3 == 1) {
                            }
                        }
                        E = y64.e(oi2Var2);
                    }
                }
                if (of2VarR0 == parent$ui_release) {
                    break;
                }
            }
        }
        oi2Var.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(boolean z) {
        Object[] objArr;
        bv0 bv0Var = this.e;
        if (z) {
            oi2 oi2Var = (oi2) bv0Var.d;
            oi2Var.i();
            ux1 ux1Var = this.a;
            oi2Var.c(ux1Var);
            ux1Var.W = true;
        }
        oi2 oi2Var2 = (oi2) bv0Var.d;
        Arrays.sort(oi2Var2.c, 0, oi2Var2.h, fb1.c);
        int i = oi2Var2.h;
        ux1[] ux1VarArr = (ux1[]) bv0Var.h;
        if (ux1VarArr == null || ux1VarArr.length < i) {
            objArr = ux1VarArr;
            objArr = new ux1[Math.max(16, i)];
        }
        objArr = ux1VarArr;
        bv0Var.h = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = oi2Var2.c[i2];
        }
        oi2Var2.i();
        for (int i3 = i - 1; -1 < i3; i3--) {
            ux1 ux1Var2 = objArr[i3];
            ux1Var2.getClass();
            if (ux1Var2.W) {
                bv0.i(ux1Var2);
            }
        }
        bv0Var.h = objArr;
    }

    public final void e() {
        oi2 oi2Var = this.h;
        int i = oi2Var.h;
        if (i != 0) {
            Object[] objArr = oi2Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                rb2 rb2Var = (rb2) objArr[i2];
                if (rb2Var.a.F()) {
                    boolean z = rb2Var.b;
                    ux1 ux1Var = rb2Var.a;
                    boolean z2 = rb2Var.c;
                    if (z) {
                        ux1.Q(ux1Var, z2, 2);
                    } else {
                        ux1.S(ux1Var, z2, 2);
                    }
                }
            }
            oi2Var.i();
        }
    }

    public final void f(ux1 ux1Var) {
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (kr1.n(ux1Var2.H(), Boolean.TRUE) && !ux1Var2.X) {
                if (((k64) ((jb) this.b.d).d).contains(ux1Var2)) {
                    ux1Var2.I();
                }
                f(ux1Var2);
            }
        }
    }

    public final void g(ux1 ux1Var, boolean z) {
        if (!this.c) {
            po1.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? ux1Var.O.e : ux1Var.q()) {
            po1.a("node not yet measured");
        }
        h(ux1Var, z);
    }

    public final void h(ux1 ux1Var, boolean z) {
        s82 s82Var;
        vx1 vx1Var;
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if ((!z && j(ux1Var2)) || (z && (ux1Var2.r() == sx1.c || ((s82Var = ux1Var2.O.q) != null && (vx1Var = s82Var.z) != null && vx1Var.e())))) {
                boolean zL = sf3.L(ux1Var2);
                yx1 yx1Var = ux1Var2.O;
                if (zL && !z) {
                    if (yx1Var.e && ((k64) ((jb) this.b.d).d).contains(ux1Var2)) {
                        n(ux1Var2, true, false);
                    } else {
                        g(ux1Var2, true);
                    }
                }
                if (z ? yx1Var.e : ux1Var2.q()) {
                    n(ux1Var2, z, false);
                }
                if (!(z ? yx1Var.e : ux1Var2.q())) {
                    h(ux1Var2, z);
                }
            }
        }
        if (z ? ux1Var.O.e : ux1Var.q()) {
            n(ux1Var, z, false);
        }
    }

    public final boolean k(je1 je1Var) {
        boolean z;
        ux1 ux1Var;
        bv0 bv0Var = this.b;
        ux1 ux1Var2 = this.a;
        if (!ux1Var2.F()) {
            po1.a("performMeasureAndLayout called with unattached root");
        }
        if (!ux1Var2.G()) {
            po1.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            po1.a("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                if (bv0Var.A()) {
                    z = false;
                    while (true) {
                        boolean zA = bv0Var.A();
                        jb jbVar = (jb) bv0Var.d;
                        if (!zA) {
                            break;
                        }
                        boolean zIsEmpty = ((k64) jbVar.d).isEmpty();
                        boolean z3 = !zIsEmpty;
                        if (zIsEmpty) {
                            jb jbVar2 = (jb) bv0Var.h;
                            ux1 ux1Var3 = (ux1) ((k64) jbVar2.d).first();
                            jbVar2.y(ux1Var3);
                            ux1Var = ux1Var3;
                        } else {
                            ux1Var = (ux1) ((k64) jbVar.d).first();
                            jbVar.y(ux1Var);
                        }
                        boolean zN = n(ux1Var, z3, true);
                        if (ux1Var == ux1Var2 && zN) {
                            z = true;
                        }
                    }
                    if (je1Var != null) {
                        je1Var.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
                z2 = z;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        }
        a();
        return z2;
    }

    public final void l(ux1 ux1Var, long j) {
        if (ux1Var.X) {
            return;
        }
        ux1 ux1Var2 = this.a;
        if (ux1Var == ux1Var2) {
            po1.a("measureAndLayout called on root");
        }
        if (!ux1Var2.F()) {
            po1.a("performMeasureAndLayout called with unattached root");
        }
        if (!ux1Var2.G()) {
            po1.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            po1.a("performMeasureAndLayout called during measure layout");
        }
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                bv0 bv0Var = this.b;
                ((jb) bv0Var.d).y(ux1Var);
                ((jb) bv0Var.h).y(ux1Var);
                if ((c(ux1Var, new um0(j)) || ux1Var.O.f) && kr1.n(ux1Var.H(), Boolean.TRUE)) {
                    ux1Var.I();
                }
                f(ux1Var);
                d(ux1Var, new um0(j));
                if (ux1Var.p() && ux1Var.G()) {
                    ux1Var.O();
                    ((oi2) this.e.d).c(ux1Var);
                    ux1Var.W = true;
                }
                e();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                this.c = false;
                this.d = false;
                throw th;
            }
        }
        a();
    }

    public final void m() {
        bv0 bv0Var = this.b;
        if (bv0Var.A()) {
            ux1 ux1Var = this.a;
            if (!ux1Var.F()) {
                po1.a("performMeasureAndLayout called with unattached root");
            }
            if (!ux1Var.G()) {
                po1.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                po1.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((k64) ((jb) bv0Var.d).d).isEmpty()) {
                        if (ux1Var.p != null) {
                            p(ux1Var, true);
                        } else {
                            o(ux1Var);
                        }
                    }
                    p(ux1Var, false);
                } finally {
                    this.c = false;
                    this.d = false;
                }
            }
        }
    }

    public final boolean n(ux1 ux1Var, boolean z, boolean z2) {
        um0 um0Var;
        boolean zC;
        mv2 placementScope;
        xo1 xo1Var;
        ux1 ux1VarT;
        s82 s82Var;
        vx1 vx1Var;
        s82 s82Var2;
        vx1 vx1Var2;
        boolean z3 = ux1Var.X;
        yx1 yx1Var = ux1Var.O;
        if (z3 || (!ux1Var.G() && !yx1Var.p.B && !i(ux1Var) && !kr1.n(ux1Var.H(), Boolean.TRUE) && ((!yx1Var.e || (ux1Var.r() != sx1.c && ((s82Var2 = yx1Var.q) == null || (vx1Var2 = s82Var2.z) == null || !vx1Var2.e()))) && !yx1Var.p.F.e() && ((s82Var = yx1Var.q) == null || (vx1Var = s82Var.z) == null || !vx1Var.e())))) {
            return false;
        }
        ux1 ux1Var2 = this.a;
        if (ux1Var == ux1Var2) {
            um0Var = this.i;
            um0Var.getClass();
        } else {
            um0Var = null;
        }
        if (z) {
            zC = yx1Var.e ? c(ux1Var, um0Var) : false;
            if (z2 && ((zC || yx1Var.f) && kr1.n(ux1Var.H(), Boolean.TRUE))) {
                ux1Var.I();
            }
        } else {
            boolean zD = ux1Var.q() ? d(ux1Var, um0Var) : false;
            if (z2 && ux1Var.p() && (ux1Var == ux1Var2 || ((ux1VarT = ux1Var.t()) != null && ux1VarT.G() && yx1Var.p.B))) {
                if (ux1Var == ux1Var2) {
                    if (ux1Var.K == sx1.h) {
                        ux1Var.f();
                    }
                    ux1 ux1VarT2 = ux1Var.t();
                    if (ux1VarT2 == null || (xo1Var = (xo1) ux1VarT2.N.c) == null || (placementScope = xo1Var.q) == null) {
                        placementScope = xx1.a(ux1Var).getPlacementScope();
                    }
                    mv2.f(placementScope, yx1Var.p, 0, 0);
                } else {
                    ux1Var.O();
                }
                ((oi2) this.e.d).c(ux1Var);
                ux1Var.W = true;
                xx1.a(ux1Var).getRectManager().d(ux1Var);
            }
            zC = zD;
        }
        e();
        return zC;
    }

    public final void o(ux1 ux1Var) {
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (j(ux1Var2)) {
                if (sf3.L(ux1Var2)) {
                    p(ux1Var2, true);
                } else {
                    o(ux1Var2);
                }
            }
        }
    }

    public final void p(ux1 ux1Var, boolean z) {
        um0 um0Var;
        if (ux1Var.X) {
            return;
        }
        if (ux1Var == this.a) {
            um0Var = this.i;
            um0Var.getClass();
        } else {
            um0Var = null;
        }
        if (z) {
            c(ux1Var, um0Var);
        } else {
            d(ux1Var, um0Var);
        }
    }

    public final boolean q(ux1 ux1Var, boolean z) {
        int iOrdinal = ux1Var.O.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.c(new rb2(ux1Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    u41.e();
                    return false;
                }
                if (!ux1Var.q() || z) {
                    ux1Var.O.p.C = true;
                    if (!ux1Var.X && (ux1Var.G() || i(ux1Var))) {
                        ux1 ux1VarT = ux1Var.t();
                        if (ux1VarT == null || !ux1VarT.q()) {
                            this.b.e(ux1Var, false);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void r(long j) {
        um0 um0Var = this.i;
        if (um0Var == null ? false : um0.b(um0Var.a, j)) {
            return;
        }
        if (this.c) {
            po1.a("updateRootConstraints called while measuring");
        }
        this.i = new um0(j);
        ux1 ux1Var = this.a;
        ux1 ux1Var2 = ux1Var.p;
        yx1 yx1Var = ux1Var.O;
        if (ux1Var2 != null) {
            yx1Var.e = true;
        }
        yx1Var.p.C = true;
        this.b.e(ux1Var, ux1Var2 != null);
    }
}

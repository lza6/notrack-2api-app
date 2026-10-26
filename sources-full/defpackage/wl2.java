package defpackage;

import java.util.Map;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.uuid.Uuid;
import okhttp3.Headers$Companion;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class wl2 extends m82 implements qb2, cx1, zr2 {
    public static final n63 O;
    public static final zw1 P;
    public static final float[] Q;
    public static final qn0 R;
    public static final rn0 S;
    public dx1 A;
    public wb2 C;
    public rh2 D;
    public float F;
    public ei2 G;
    public zw1 H;
    public gg1 I;
    public y00 J;
    public da K;
    public boolean M;
    public wr2 N;
    public final ux1 t;
    public wl2 u;
    public wl2 v;
    public boolean w;
    public boolean x;
    public le1 y;
    public wu0 z;
    public float B = 0.8f;
    public long E = 0;
    public final tl2 L = new tl2(this, 1);

    static {
        n63 n63Var = new n63();
        n63Var.d = 1.0f;
        n63Var.h = 1.0f;
        n63Var.l = 1.0f;
        long j = ig1.a;
        n63Var.n = j;
        n63Var.o = j;
        n63Var.q = 8.0f;
        n63Var.r = e54.b;
        n63Var.s = k43.a;
        n63Var.u = 0;
        n63Var.v = 9205357640488583168L;
        n63Var.w = sf3.a();
        n63Var.x = dx1.c;
        O = n63Var;
        P = new zw1();
        Q = ob2.a();
        int i = 19;
        R = new qn0(i);
        S = new rn0(i);
    }

    public wl2(ux1 ux1Var) {
        this.t = ux1Var;
        this.z = ux1Var.G;
        this.A = ux1Var.H;
    }

    public static wl2 i1(cx1 cx1Var) {
        wl2 wl2Var;
        p82 p82Var = cx1Var instanceof p82 ? (p82) cx1Var : null;
        if (p82Var != null && (wl2Var = p82Var.c.t) != null) {
            return wl2Var;
        }
        cx1Var.getClass();
        return (wl2) cx1Var;
    }

    @Override // defpackage.m82
    public final long A0() {
        return this.E;
    }

    @Override // defpackage.m82
    public final void C0() {
        i0(this.E, this.F, this.y);
    }

    @Override // defpackage.cx1
    public final void D(float[] fArr) {
        yr2 yr2VarA = xx1.a(this.t);
        wl2 wl2VarI1 = i1(y64.u(this));
        k1(wl2VarI1, fArr);
        if (yr2VarA instanceof pb2) {
            ((pb2) yr2VarA).mo26x1a2a05c7(fArr);
            return;
        }
        if (!wl2VarI1.z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        long jMo27x2d3fc342 = xx1.a(wl2VarI1.t).mo27x2d3fc342(wl2VarI1.L(0L));
        if ((9223372034707292159L & jMo27x2d3fc342) != 9205357640488583168L) {
            ob2.f(fArr, Float.intBitsToFloat((int) (jMo27x2d3fc342 >> 32)), Float.intBitsToFloat((int) (jMo27x2d3fc342 & 4294967295L)));
        }
    }

    public final void D0(wl2 wl2Var, ei2 ei2Var, boolean z) {
        if (wl2Var == this) {
            return;
        }
        wl2 wl2Var2 = this.v;
        if (wl2Var2 != null) {
            wl2Var2.D0(wl2Var, ei2Var, z);
        }
        long j = this.E;
        float f = (int) (j >> 32);
        ei2Var.a -= f;
        ei2Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        ei2Var.b -= f2;
        ei2Var.d -= f2;
        wr2 wr2Var = this.N;
        if (wr2Var != null) {
            wr2Var.mapBounds(ei2Var, true);
            if (this.x && z) {
                long j2 = this.h;
                ei2Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final long E0(wl2 wl2Var, long j) {
        if (wl2Var == this) {
            return j;
        }
        wl2 wl2Var2 = this.v;
        return (wl2Var2 == null || kr1.n(wl2Var, wl2Var2)) ? L0(j) : L0(wl2Var2.E0(wl2Var, j));
    }

    @Override // defpackage.cx1
    public final void F(cx1 cx1Var, float[] fArr) {
        wl2 wl2VarI1 = i1(cx1Var);
        wl2VarI1.a1();
        wl2 wl2VarK0 = K0(wl2VarI1);
        ob2.d(fArr);
        wl2VarI1.k1(wl2VarK0, fArr);
        j1(wl2VarK0, fArr);
    }

    public final long F0(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - e0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - X();
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L);
    }

    @Override // defpackage.cx1
    public final h43 G(cx1 cx1Var, boolean z) {
        if (!z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!cx1Var.z()) {
            po1.b("LayoutCoordinates " + cx1Var + " is not attached!");
        }
        wl2 wl2VarI1 = i1(cx1Var);
        wl2VarI1.a1();
        wl2 wl2VarK0 = K0(wl2VarI1);
        ei2 ei2Var = this.G;
        if (ei2Var == null) {
            ei2Var = new ei2();
            this.G = ei2Var;
        }
        ei2Var.a = 0.0f;
        ei2Var.b = 0.0f;
        ei2Var.c = (int) (cx1Var.J() >> 32);
        ei2Var.d = (int) (cx1Var.J() & 4294967295L);
        while (wl2VarI1 != wl2VarK0) {
            wl2VarI1.g1(ei2Var, z, false);
            if (ei2Var.b()) {
                return h43.e;
            }
            wl2VarI1 = wl2VarI1.v;
            wl2VarI1.getClass();
        }
        D0(wl2VarK0, ei2Var, z);
        return new h43(ei2Var.a, ei2Var.b, ei2Var.c, ei2Var.d);
    }

    public final float G0(long j, long j2) {
        if (e0() >= Float.intBitsToFloat((int) (j2 >> 32)) && X() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jF0 = F0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jF0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jF0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - e0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - X()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return ln2.e(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void H0(y00 y00Var, gg1 gg1Var) {
        wr2 wr2Var = this.N;
        if (wr2Var != null) {
            wr2Var.drawLayer(y00Var, gg1Var);
            return;
        }
        long j = this.E;
        float f = (int) (j >> 32);
        float f2 = (int) (j & 4294967295L);
        y00Var.g(f, f2);
        I0(y00Var, gg1Var);
        y00Var.g(-f, -f2);
    }

    public final void I0(y00 y00Var, gg1 gg1Var) {
        wl2 wl2Var;
        y00 y00Var2;
        gg1 gg1Var2;
        of2 of2VarQ0 = Q0(4);
        if (of2VarQ0 == null) {
            e1(y00Var, gg1Var);
            return;
        }
        ux1 ux1Var = this.t;
        ux1Var.getClass();
        wx1 sharedDrawScope = xx1.a(ux1Var).getSharedDrawScope();
        long jW = y64.W(this.h);
        sharedDrawScope.getClass();
        oi2 oi2Var = null;
        while (of2VarQ0 != null) {
            if (of2VarQ0 instanceof rz0) {
                wl2Var = this;
                y00Var2 = y00Var;
                gg1Var2 = gg1Var;
                sharedDrawScope.c(y00Var2, jW, wl2Var, (rz0) of2VarQ0, gg1Var2);
            } else {
                wl2Var = this;
                y00Var2 = y00Var;
                gg1Var2 = gg1Var;
                if ((of2VarQ0.getKindSet$ui_release() & 4) != 0 && (of2VarQ0 instanceof ju0)) {
                    int i = 0;
                    for (of2 child$ui_release = ((ju0) of2VarQ0).d; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                        if ((child$ui_release.getKindSet$ui_release() & 4) != 0) {
                            i++;
                            if (i == 1) {
                                of2VarQ0 = child$ui_release;
                            } else {
                                if (oi2Var == null) {
                                    oi2Var = new oi2(0, new of2[16]);
                                }
                                if (of2VarQ0 != null) {
                                    oi2Var.c(of2VarQ0);
                                    of2VarQ0 = null;
                                }
                                oi2Var.c(child$ui_release);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                y00Var = y00Var2;
                this = wl2Var;
                gg1Var = gg1Var2;
            }
            of2VarQ0 = y64.e(oi2Var);
            y00Var = y00Var2;
            this = wl2Var;
            gg1Var = gg1Var2;
        }
    }

    @Override // defpackage.cx1
    public final long J() {
        return this.h;
    }

    public abstract void J0();

    public final wl2 K0(wl2 wl2Var) {
        ux1 ux1VarT = wl2Var.t;
        ux1 ux1Var = this.t;
        if (ux1VarT == ux1Var) {
            of2 of2VarP0 = wl2Var.P0();
            of2 of2VarP1 = P0();
            if (!of2VarP1.getNode().isAttached()) {
                po1.b("visitLocalAncestors called on an unattached node");
            }
            for (of2 parent$ui_release = of2VarP1.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & 2) != 0 && parent$ui_release == of2VarP0) {
                    return wl2Var;
                }
            }
            return this;
        }
        while (ux1VarT.x > ux1Var.x) {
            ux1VarT = ux1VarT.t();
            ux1VarT.getClass();
        }
        ux1 ux1VarT2 = ux1Var;
        while (ux1VarT2.x > ux1VarT.x) {
            ux1VarT2 = ux1VarT2.t();
            ux1VarT2.getClass();
        }
        while (ux1VarT != ux1VarT2) {
            ux1VarT = ux1VarT.t();
            ux1VarT2 = ux1VarT2.t();
            if (ux1VarT == null || ux1VarT2 == null) {
                u41.k("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (ux1VarT2 != ux1Var) {
            if (ux1VarT != wl2Var.t) {
                return (xo1) ux1VarT.N.c;
            }
            return wl2Var;
        }
        return this;
    }

    @Override // defpackage.cx1
    public final long L(long j) {
        if (!z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        a1();
        while (this != null) {
            wr2 wr2Var = this.N;
            if (wr2Var != null) {
                j = wr2Var.mo84xc59c8b2a(j, false);
            }
            j = g13.I(j, this.E);
            this = this.v;
        }
        return j;
    }

    public final long L0(long j) {
        long j2 = this.E;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32);
        wr2 wr2Var = this.N;
        return wr2Var != null ? wr2Var.mo84xc59c8b2a(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public final ne1 M0() {
        da daVar = this.K;
        if (daVar != null) {
            return daVar;
        }
        da daVar2 = new da(this, 6, new tl2(this, 0));
        this.K = daVar2;
        return daVar2;
    }

    public abstract o82 N0();

    public final long O0() {
        return this.z.c0(this.t.I.mo133x26874ded());
    }

    public abstract of2 P0();

    public final of2 Q0(int i) {
        boolean zH = xl2.h(i);
        of2 of2VarP0 = P0();
        if (!zH && (of2VarP0 = of2VarP0.getParent$ui_release()) == null) {
            return null;
        }
        for (of2 of2VarR0 = R0(zH); of2VarR0 != null && (of2VarR0.getAggregateChildKindSet$ui_release() & i) != 0; of2VarR0 = of2VarR0.getChild$ui_release()) {
            if ((of2VarR0.getKindSet$ui_release() & i) != 0) {
                return of2VarR0;
            }
            if (of2VarR0 == of2VarP0) {
                return null;
            }
        }
        return null;
    }

    public final of2 R0(boolean z) {
        of2 of2VarP0;
        yd ydVar = this.t.N;
        if (((wl2) ydVar.d) == this) {
            return (of2) ydVar.f;
        }
        wl2 wl2Var = this.v;
        if (!z) {
            if (wl2Var != null) {
                return wl2Var.P0();
            }
            return null;
        }
        if (wl2Var == null || (of2VarP0 = wl2Var.P0()) == null) {
            return null;
        }
        return of2VarP0.getChild$ui_release();
    }

    public final void S0(of2 of2Var, sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z) {
        if (of2Var == null) {
            V0(sl2Var, j, ii1Var, i, z);
            return;
        }
        int i2 = ii1Var.h;
        vh2 vh2Var = ii1Var.c;
        ii1Var.d(i2 + 1, vh2Var.b);
        ii1Var.h++;
        vh2Var.g(of2Var);
        ii1Var.d.a(p23.b(-1.0f, z, false));
        S0(kr1.i(of2Var, sl2Var.g()), sl2Var, j, ii1Var, i, z);
        ii1Var.h = i2;
    }

    public final void T0(of2 of2Var, sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z, float f) {
        if (of2Var == null) {
            V0(sl2Var, j, ii1Var, i, z);
            return;
        }
        int i2 = ii1Var.h;
        vh2 vh2Var = ii1Var.c;
        ii1Var.d(i2 + 1, vh2Var.b);
        ii1Var.h++;
        vh2Var.g(of2Var);
        ii1Var.d.a(p23.b(f, z, false));
        d1(kr1.i(of2Var, sl2Var.g()), sl2Var, j, ii1Var, i, z, f, true);
        ii1Var.h = i2;
    }

    public final void U0(sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        of2 of2VarQ0 = Q0(sl2Var.g());
        if (!n1(j)) {
            if (i == 1) {
                float fG0 = G0(j, O0());
                if ((Float.floatToRawIntBits(fG0) & IntCompanionObject.MAX_VALUE) < 2139095040) {
                    if (ii1Var.h != ii1Var.c.b - 1) {
                        if (vl0.y(ii1Var.b(), p23.b(fG0, false, false)) <= 0) {
                            return;
                        }
                    }
                    T0(of2VarQ0, sl2Var, j, ii1Var, i, false, fG0);
                    return;
                }
                return;
            }
            return;
        }
        if (of2VarQ0 == null) {
            V0(sl2Var, j, ii1Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < e0() && fIntBitsToFloat2 < X()) {
            S0(of2VarQ0, sl2Var, j, ii1Var, i, z);
            return;
        }
        float fG1 = i == 1 ? G0(j, O0()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fG1) & IntCompanionObject.MAX_VALUE) < 2139095040) {
            if (ii1Var.h != ii1Var.c.b - 1) {
                z2 = z;
                if (vl0.y(ii1Var.b(), p23.b(fG1, z2, false)) > 0) {
                }
                d1(of2VarQ0, sl2Var, j, ii1Var, i, z2, fG1, z3);
            }
            z2 = z;
            z3 = true;
            d1(of2VarQ0, sl2Var, j, ii1Var, i, z2, fG1, z3);
        }
        z2 = z;
        z3 = false;
        d1(of2VarQ0, sl2Var, j, ii1Var, i, z2, fG1, z3);
    }

    public void V0(sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z) {
        wl2 wl2Var = this.u;
        if (wl2Var != null) {
            wl2Var.U0(sl2Var, wl2Var.L0(j), ii1Var, i, z);
        }
    }

    public final void W0() {
        wr2 wr2Var = this.N;
        if (wr2Var != null) {
            wr2Var.invalidate();
            return;
        }
        wl2 wl2Var = this.v;
        if (wl2Var != null) {
            wl2Var.W0();
        }
    }

    public final boolean X0() {
        if (this.N != null && this.B <= 0.0f) {
            return true;
        }
        wl2 wl2Var = this.v;
        if (wl2Var != null) {
            return wl2Var.X0();
        }
        return false;
    }

    public final long Y0(cx1 cx1Var, long j) {
        if (cx1Var instanceof p82) {
            p82 p82Var = (p82) cx1Var;
            p82Var.c.t.a1();
            return p82Var.b(this, j ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        wl2 wl2VarI1 = i1(cx1Var);
        wl2VarI1.a1();
        wl2 wl2VarK0 = K0(wl2VarI1);
        while (wl2VarI1 != wl2VarK0) {
            wr2 wr2Var = wl2VarI1.N;
            if (wr2Var != null) {
                j = wr2Var.mo84xc59c8b2a(j, false);
            }
            j = g13.I(j, wl2VarI1.E);
            wl2VarI1 = wl2VarI1.v;
            wl2VarI1.getClass();
        }
        return E0(wl2VarK0, j);
    }

    public final void Z0() {
        if (this.N != null || this.y == null) {
            return;
        }
        wr2 wr2VarA = yr2.a(xx1.a(this.t), M0(), this.L, false, 8);
        wr2VarA.mo86x27e04be2(this.h);
        wr2VarA.mo85x3458c3d4(this.E);
        wr2VarA.invalidate();
        this.N = wr2VarA;
    }

    public final void a1() {
        yx1 yx1Var = this.t.O;
        qx1 qx1Var = yx1Var.a.O.d;
        qx1 qx1Var2 = qx1.h;
        qx1 qx1Var3 = qx1.l;
        if (qx1Var == qx1Var2 || qx1Var == qx1Var3) {
            if (yx1Var.p.I) {
                yx1Var.e(true);
            } else {
                yx1Var.d(true);
            }
        }
        if (qx1Var == qx1Var3) {
            s82 s82Var = yx1Var.q;
            if (s82Var == null || !s82Var.C) {
                yx1Var.f(true);
            } else {
                yx1Var.g(true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v7, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void b1() {
        of2 parent$ui_release;
        boolean zH = xl2.h(Uuid.SIZE_BITS);
        of2 of2VarR0 = R0(zH);
        if (of2VarR0 == null || (of2VarR0.getNode().getAggregateChildKindSet$ui_release() & Uuid.SIZE_BITS) == 0) {
            return;
        }
        pk3 currentThreadSnapshot = Protocol$Companion.getCurrentThreadSnapshot();
        le1 le1VarE = currentThreadSnapshot != null ? currentThreadSnapshot.e() : null;
        pk3 pk3VarMakeCurrentNonObservable = Protocol$Companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            if (!zH) {
                parent$ui_release = P0().getParent$ui_release();
                if (parent$ui_release == null) {
                }
                Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            }
            parent$ui_release = P0();
            for (of2 of2VarR1 = R0(zH); of2VarR1 != null && (of2VarR1.getAggregateChildKindSet$ui_release() & Uuid.SIZE_BITS) != 0; of2VarR1 = of2VarR1.getChild$ui_release()) {
                if ((of2VarR1.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0) {
                    ?? E = of2VarR1;
                    ?? oi2Var = 0;
                    while (E != 0) {
                        if (E instanceof ax1) {
                            ((ax1) E).q(this.h);
                        } else if ((E.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0 && (E instanceof ju0)) {
                            of2 child$ui_release = ((ju0) E).d;
                            int i = 0;
                            E = E;
                            oi2Var = oi2Var;
                            while (child$ui_release != null) {
                                if ((child$ui_release.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oi2Var = oi2Var;
                                        E = child$ui_release;
                                    } else {
                                        if (oi2Var == 0) {
                                            oi2Var = new oi2(0, new of2[16]);
                                        }
                                        if (E != 0) {
                                            oi2Var.c(E);
                                            E = 0;
                                        }
                                        oi2Var.c(child$ui_release);
                                    }
                                }
                                child$ui_release = child$ui_release.getChild$ui_release();
                                E = E;
                                oi2Var = oi2Var;
                            }
                            if (i == 1) {
                            }
                        }
                        E = y64.e(oi2Var);
                    }
                }
                if (of2VarR1 == parent$ui_release) {
                    break;
                }
            }
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
        } catch (Throwable th) {
            Protocol$Companion.restoreNonObservable(currentThreadSnapshot, pk3VarMakeCurrentNonObservable, le1VarE);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [of2] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void c1() {
        boolean zH = xl2.h(Uuid.SIZE_BITS);
        of2 of2VarP0 = P0();
        if (!zH && (of2VarP0 = of2VarP0.getParent$ui_release()) == null) {
            return;
        }
        for (of2 of2VarR0 = R0(zH); of2VarR0 != null && (of2VarR0.getAggregateChildKindSet$ui_release() & Uuid.SIZE_BITS) != 0; of2VarR0 = of2VarR0.getChild$ui_release()) {
            if ((of2VarR0.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0) {
                ?? E = of2VarR0;
                ?? oi2Var = 0;
                while (E != 0) {
                    if (E instanceof ax1) {
                        ((ax1) E).n(this);
                    } else if ((E.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0 && (E instanceof ju0)) {
                        of2 child$ui_release = ((ju0) E).d;
                        int i = 0;
                        E = E;
                        oi2Var = oi2Var;
                        while (child$ui_release != null) {
                            if ((child$ui_release.getKindSet$ui_release() & Uuid.SIZE_BITS) != 0) {
                                i++;
                                if (i == 1) {
                                    oi2Var = oi2Var;
                                    E = child$ui_release;
                                } else {
                                    if (oi2Var == 0) {
                                        oi2Var = new oi2(0, new of2[16]);
                                    }
                                    if (E != 0) {
                                        oi2Var.c(E);
                                        E = 0;
                                    }
                                    oi2Var.c(child$ui_release);
                                }
                            }
                            child$ui_release = child$ui_release.getChild$ui_release();
                            E = E;
                            oi2Var = oi2Var;
                        }
                        if (i == 1) {
                        }
                    }
                    E = y64.e(oi2Var);
                }
            }
            if (of2VarR0 == of2VarP0) {
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x018d A[PHI: r3
  0x018d: PHI (r3v17 ??) = (r3v1 ??), (r3v1 ??), (r3v19 ??) binds: [B:50:0x0155, B:52:0x0159, B:66:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v17, types: [oi2] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [oi2] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r5v14 */
    public final void d1(of2 of2Var, sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z, float f, boolean z2) {
        ?? E;
        int i2;
        if (of2Var == null) {
            V0(sl2Var, j, ii1Var, i, z);
            return;
        }
        int i3 = i;
        if (i3 == 3 || i3 == 4) {
            ?? r2 = of2Var;
            ?? oi2Var = 0;
            while (r2 != 0) {
                if (r2 instanceof hx2) {
                    long jP = ((hx2) r2).p();
                    int i4 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i4);
                    ux1 ux1Var = this.t;
                    dx1 dx1Var = ux1Var.H;
                    int i5 = x44.b;
                    long j2 = Long.MIN_VALUE & jP;
                    dx1 dx1Var2 = dx1.c;
                    if (fIntBitsToFloat < (-((j2 == 0 || dx1Var == dx1Var2) ? Headers$Companion.access$unpack(jP, 0) : Headers$Companion.access$unpack(jP, 2)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= e0() + ((j2 == 0 || ux1Var.H == dx1Var2) ? Headers$Companion.access$unpack(jP, 2) : Headers$Companion.access$unpack(jP, 0))) {
                        break;
                    }
                    int i6 = (int) (j & 4294967295L);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i6);
                    int i7 = x44.b;
                    if (fIntBitsToFloat2 < (-Headers$Companion.access$unpack(jP, 1))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i6) >= Headers$Companion.access$unpack(jP, 3) + X()) {
                        break;
                    }
                    ul2 ul2Var = new ul2(this, of2Var, sl2Var, j, ii1Var, i3, z, f, z2);
                    kh2 kh2Var = ii1Var.d;
                    vh2 vh2Var = ii1Var.c;
                    int i8 = ii1Var.h;
                    int i9 = vh2Var.b;
                    if (i8 == i9 - 1) {
                        ii1Var.d(i8 + 1, i9);
                        ii1Var.h++;
                        vh2Var.g(of2Var);
                        kh2Var.a(p23.b(0.0f, z, true));
                        ul2Var.invoke();
                        ii1Var.h = i8;
                        return;
                    }
                    long jB = ii1Var.b();
                    int i10 = ii1Var.h;
                    if (!vl0.V(jB)) {
                        if (vl0.K(jB) > 0.0f) {
                            int i11 = ii1Var.h;
                            ii1Var.d(i11 + 1, vh2Var.b);
                            ii1Var.h++;
                            vh2Var.g(of2Var);
                            kh2Var.a(p23.b(0.0f, z, true));
                            ul2Var.invoke();
                            ii1Var.h = i11;
                            return;
                        }
                        return;
                    }
                    int i12 = vh2Var.b;
                    int i13 = i12 - 1;
                    ii1Var.h = i13;
                    ii1Var.d(i12, vh2Var.b);
                    ii1Var.h++;
                    vh2Var.g(of2Var);
                    kh2Var.a(p23.b(0.0f, z, true));
                    ul2Var.invoke();
                    ii1Var.h = i13;
                    if (vl0.K(ii1Var.b()) < 0.0f) {
                        ii1Var.d(i10 + 1, ii1Var.h + 1);
                    }
                    ii1Var.h = i10;
                    return;
                }
                if ((r2.getKindSet$ui_release() & 16) == 0 || !(r2 instanceof ju0)) {
                    E = r2;
                    oi2Var = oi2Var;
                    E = y64.e(oi2Var);
                } else {
                    of2 child$ui_release = ((ju0) r2).d;
                    int i14 = 0;
                    while (child$ui_release != null) {
                        if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                            i14++;
                            if (i14 == 1) {
                                E = r2;
                                oi2Var = oi2Var;
                                oi2Var = oi2Var;
                                E = child$ui_release;
                            } else {
                                if (oi2Var == 0) {
                                    oi2Var = new oi2(0, new of2[16]);
                                }
                                if (E != 0) {
                                    oi2Var.c(E);
                                    E = 0;
                                }
                                oi2Var.c(child$ui_release);
                            }
                        } else {
                            E = r2;
                            oi2Var = oi2Var;
                        }
                        child$ui_release = child$ui_release.getChild$ui_release();
                        E = E;
                        oi2Var = oi2Var;
                    }
                    if (i14 == 1) {
                        E = r2;
                        oi2Var = oi2Var;
                    } else {
                        E = r2;
                        oi2Var = oi2Var;
                        E = y64.e(oi2Var);
                    }
                }
                i3 = i;
                r2 = E;
                oi2Var = oi2Var;
            }
        }
        if (z2) {
            T0(of2Var, sl2Var, j, ii1Var, i, z, f);
            return;
        }
        if (!sl2Var.d(of2Var)) {
            d1(kr1.i(of2Var, sl2Var.g()), sl2Var, j, ii1Var, i, z, f, false);
            return;
        }
        vl2 vl2Var = new vl2(this, of2Var, sl2Var, j, ii1Var, i, z, f);
        kh2 kh2Var2 = ii1Var.d;
        vh2 vh2Var2 = ii1Var.c;
        int i15 = ii1Var.h;
        int i16 = vh2Var2.b;
        if (i15 != i16 - 1) {
            long jB2 = ii1Var.b();
            int i17 = ii1Var.h;
            int i18 = vh2Var2.b;
            int i19 = i18 - 1;
            ii1Var.h = i19;
            ii1Var.d(i18, vh2Var2.b);
            ii1Var.h++;
            vh2Var2.g(of2Var);
            kh2Var2.a(p23.b(f, z, false));
            vl2Var.invoke();
            ii1Var.h = i19;
            long jB3 = ii1Var.b();
            if (ii1Var.h + 1 >= vh2Var2.b - 1 || vl0.y(jB2, jB3) <= 0) {
                ii1Var.d(ii1Var.h + 1, vh2Var2.b);
            } else {
                int i20 = i17 + 1;
                boolean zV = vl0.V(jB3);
                int i21 = ii1Var.h;
                ii1Var.d(i20, zV ? i21 + 2 : i21 + 1);
            }
            ii1Var.h = i17;
            return;
        }
        int i22 = i15 + 1;
        ii1Var.d(i22, i16);
        ii1Var.h++;
        vh2Var2.g(of2Var);
        kh2Var2.a(p23.b(f, z, false));
        vl2Var.invoke();
        ii1Var.h = i15;
        if (i22 == vh2Var2.b - 1 || vl0.V(ii1Var.b())) {
            int i23 = ii1Var.h;
            int i24 = i23 + 1;
            vh2Var2.k(i24);
            if (i24 < 0 || i24 >= (i2 = kh2Var2.b)) {
                m51.s("Index must be between 0 and size");
                return;
            }
            long[] jArr = kh2Var2.a;
            long j3 = jArr[i24];
            if (i24 != i2 - 1) {
                vl.l0(jArr, jArr, i24, i23 + 2, i2);
            }
            kh2Var2.b--;
        }
    }

    @Override // defpackage.cx1
    public final long e(long j) {
        if (!z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        cx1 cx1VarU = y64.u(this);
        return Y0(cx1VarU, ln2.h(xx1.a(this.t).mo23x4b94afde(j), cx1VarU.L(0L)));
    }

    public abstract void e1(y00 y00Var, gg1 gg1Var);

    public final void f1(long j, float f, le1 le1Var) {
        l1(le1Var, false);
        if (!iq1.a(this.E, j)) {
            this.E = j;
            ux1 ux1Var = this.t;
            ux1Var.O.p.v0();
            wr2 wr2Var = this.N;
            if (wr2Var != null) {
                wr2Var.mo85x3458c3d4(j);
            } else {
                wl2 wl2Var = this.v;
                if (wl2Var != null) {
                    wl2Var.W0();
                }
            }
            m82.B0(this);
            yr2 yr2Var = ux1Var.v;
            if (yr2Var != null) {
                yr2Var.onLayoutChange(ux1Var);
            }
        }
        this.F = f;
        if (this.p) {
            return;
        }
        o0(new pv2(y0(), this));
    }

    @Override // defpackage.cx1
    public final long g(long j) {
        return xx1.a(this.t).mo24xc4a27b34(L(j));
    }

    public final void g1(ei2 ei2Var, boolean z, boolean z2) {
        wr2 wr2Var = this.N;
        if (wr2Var != null) {
            if (this.x) {
                if (z2) {
                    long jO0 = O0();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jO0 >> 32)) / 2.0f;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jO0 & 4294967295L)) / 2.0f;
                    long j = this.h;
                    ei2Var.a(-fIntBitsToFloat, -fIntBitsToFloat2, ((int) (j >> 32)) + fIntBitsToFloat, ((int) (j & 4294967295L)) + fIntBitsToFloat2);
                } else if (z) {
                    long j2 = this.h;
                    ei2Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                }
                if (ei2Var.b()) {
                    return;
                }
            }
            wr2Var.mapBounds(ei2Var, false);
        }
        long j3 = this.E;
        float f = (int) (j3 >> 32);
        ei2Var.a += f;
        ei2Var.c += f;
        float f2 = (int) (j3 & 4294967295L);
        ei2Var.b += f2;
        ei2Var.d += f2;
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.t.G.getDensity();
    }

    @Override // defpackage.er1
    public final dx1 getLayoutDirection() {
        return this.t.H;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [of2] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [oi2] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [oi2] */
    public final void h1(wb2 wb2Var) {
        wl2 wl2Var;
        wb2 wb2Var2 = this.C;
        if (wb2Var != wb2Var2) {
            this.C = wb2Var;
            ux1 ux1Var = this.t;
            int i = 0;
            if (wb2Var2 == null || wb2Var.getWidth() != wb2Var2.getWidth() || wb2Var.getHeight() != wb2Var2.getHeight()) {
                int width = wb2Var.getWidth();
                int height = wb2Var.getHeight();
                wr2 wr2Var = this.N;
                if (wr2Var != null) {
                    wr2Var.mo86x27e04be2((((long) width) << 32) | (((long) height) & 4294967295L));
                } else if (ux1Var.G() && (wl2Var = this.v) != null) {
                    wl2Var.W0();
                }
                l0((((long) height) & 4294967295L) | (((long) width) << 32));
                if (this.y != null) {
                    m1(false);
                }
                boolean zH = xl2.h(4);
                of2 of2VarP0 = P0();
                if (zH || (of2VarP0 = of2VarP0.getParent$ui_release()) != null) {
                    for (of2 of2VarR0 = R0(zH); of2VarR0 != null && (of2VarR0.getAggregateChildKindSet$ui_release() & 4) != 0; of2VarR0 = of2VarR0.getChild$ui_release()) {
                        if ((of2VarR0.getKindSet$ui_release() & 4) != 0) {
                            ?? E = of2VarR0;
                            ?? oi2Var = 0;
                            while (E != 0) {
                                if (E instanceof rz0) {
                                    ((rz0) E).o0();
                                } else if ((E.getKindSet$ui_release() & 4) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release = ((ju0) E).d;
                                    int i2 = 0;
                                    E = E;
                                    oi2Var = oi2Var;
                                    while (child$ui_release != null) {
                                        if ((child$ui_release.getKindSet$ui_release() & 4) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oi2Var = oi2Var;
                                                E = child$ui_release;
                                            } else {
                                                if (oi2Var == 0) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (E != 0) {
                                                    oi2Var.c(E);
                                                    E = 0;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        }
                                        child$ui_release = child$ui_release.getChild$ui_release();
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = y64.e(oi2Var);
                            }
                        }
                        if (of2VarR0 == of2VarP0) {
                            break;
                        }
                    }
                }
                yr2 yr2Var = ux1Var.v;
                if (yr2Var != null) {
                    yr2Var.onLayoutChange(ux1Var);
                }
            }
            rh2 rh2Var = this.D;
            if ((rh2Var == null || rh2Var.e == 0) && wb2Var.a().isEmpty()) {
                return;
            }
            rh2 rh2Var2 = this.D;
            Map mapA = wb2Var.a();
            if (rh2Var2 != null && rh2Var2.e == mapA.size()) {
                Object[] objArr = rh2Var2.b;
                int[] iArr = rh2Var2.c;
                long[] jArr = rh2Var2.a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i3 = 0;
                loop0: while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = i; i5 < i4; i5++) {
                            if ((255 & j) < 128) {
                                int i6 = (i3 << 3) + i5;
                                Object obj = objArr[i6];
                                int i7 = iArr[i6];
                                Integer num = (Integer) mapA.get((ti1) obj);
                                if (num == null || num.intValue() != i7) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            return;
                        }
                    }
                    if (i3 == length) {
                        return;
                    }
                    i3++;
                    i = 0;
                }
            }
            ux1Var.O.p.F.f();
            rh2 rh2Var3 = this.D;
            if (rh2Var3 == null) {
                rh2 rh2Var4 = cn2.a;
                rh2Var3 = new rh2();
                this.D = rh2Var3;
            }
            rh2Var3.a();
            for (Map.Entry entry : wb2Var.a().entrySet()) {
                rh2Var3.h(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // defpackage.nv2, defpackage.qb2
    public final Object i() {
        ux1 ux1Var = this.t;
        if (!ux1Var.N.g(64)) {
            return null;
        }
        P0();
        Object objN0 = null;
        for (of2 parent$ui_release = (es3) ux1Var.N.e; parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if ((parent$ui_release.getKindSet$ui_release() & 64) != 0) {
                ?? E = parent$ui_release;
                ?? oi2Var = 0;
                while (E != 0) {
                    if (E instanceof gt2) {
                        objN0 = ((gt2) E).n0(objN0);
                    } else if ((E.getKindSet$ui_release() & 64) != 0 && (E instanceof ju0)) {
                        of2 child$ui_release = ((ju0) E).d;
                        int i = 0;
                        E = E;
                        oi2Var = oi2Var;
                        while (child$ui_release != null) {
                            if ((child$ui_release.getKindSet$ui_release() & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    oi2Var = oi2Var;
                                    E = child$ui_release;
                                } else {
                                    if (oi2Var == 0) {
                                        oi2Var = new oi2(0, new of2[16]);
                                    }
                                    if (E != 0) {
                                        oi2Var.c(E);
                                        E = 0;
                                    }
                                    oi2Var.c(child$ui_release);
                                }
                            }
                            child$ui_release = child$ui_release.getChild$ui_release();
                            E = E;
                            oi2Var = oi2Var;
                        }
                        if (i == 1) {
                        }
                    }
                    E = y64.e(oi2Var);
                }
            }
        }
        return objN0;
    }

    @Override // defpackage.zr2
    public final boolean isValidOwnerScope() {
        return (this.N == null || this.w || !this.t.F()) ? false : true;
    }

    @Override // defpackage.cx1
    public final cx1 j() {
        if (!z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        a1();
        return ((wl2) this.t.N.d).v;
    }

    public final void j1(wl2 wl2Var, float[] fArr) {
        if (kr1.n(wl2Var, this)) {
            return;
        }
        wl2 wl2Var2 = this.v;
        wl2Var2.getClass();
        wl2Var2.j1(wl2Var, fArr);
        if (!iq1.a(this.E, 0L)) {
            float[] fArr2 = Q;
            ob2.d(fArr2);
            long j = this.E;
            ob2.f(fArr2, -((int) (j >> 32)), -((int) (j & 4294967295L)));
            ob2.e(fArr, fArr2);
        }
        wr2 wr2Var = this.N;
        if (wr2Var != null) {
            wr2Var.mo82x9d378691(fArr);
        }
    }

    public final void k1(wl2 wl2Var, float[] fArr) {
        while (!this.equals(wl2Var)) {
            wr2 wr2Var = this.N;
            if (wr2Var != null) {
                wr2Var.mo87x63595be1(fArr);
            }
            long j = this.E;
            if (!iq1.a(j, 0L)) {
                float[] fArr2 = Q;
                ob2.d(fArr2);
                ob2.f(fArr2, (int) (j >> 32), (int) (j & 4294967295L));
                ob2.e(fArr, fArr2);
            }
            this = this.v;
            this.getClass();
        }
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.t.G.l();
    }

    public final void l1(le1 le1Var, boolean z) {
        yr2 yr2Var;
        ux1 ux1Var = this.t;
        boolean z2 = (!z && this.y == le1Var && kr1.n(this.z, ux1Var.G) && this.A == ux1Var.H) ? false : true;
        this.z = ux1Var.G;
        this.A = ux1Var.H;
        boolean zF = ux1Var.F();
        tl2 tl2Var = this.L;
        if (!zF || le1Var == null) {
            this.y = null;
            wr2 wr2Var = this.N;
            if (wr2Var != null) {
                wr2Var.destroy();
                ux1Var.R = true;
                tl2Var.invoke();
                if (z() && ux1Var.G() && (yr2Var = ux1Var.v) != null) {
                    yr2Var.onLayoutChange(ux1Var);
                }
            }
            this.N = null;
            this.M = false;
            return;
        }
        this.y = le1Var;
        if (this.N != null) {
            if (z2 && m1(true)) {
                xx1.a(ux1Var).getRectManager().e(ux1Var);
                return;
            }
            return;
        }
        wr2 wr2VarA = yr2.a(xx1.a(ux1Var), M0(), tl2Var, ux1Var.o, 4);
        wr2VarA.mo86x27e04be2(this.h);
        wr2VarA.mo85x3458c3d4(this.E);
        this.N = wr2VarA;
        m1(true);
        ux1Var.R = true;
        tl2Var.invoke();
    }

    public final boolean m1(boolean z) {
        yr2 yr2Var;
        wr2 wr2Var = this.N;
        le1 le1Var = this.y;
        boolean z2 = false;
        if (wr2Var == null) {
            if (le1Var == null) {
                return false;
            }
            po1.b("null layer with a non-null layerBlock");
            return false;
        }
        if (le1Var == null) {
            throw fq2.i("updateLayerParameters requires a non-null layerBlock");
        }
        n63 n63Var = O;
        n63Var.g(1.0f);
        n63Var.i(1.0f);
        n63Var.a(1.0f);
        n63Var.j(0.0f);
        long j = ig1.a;
        n63Var.c(j);
        n63Var.n(j);
        n63Var.e(0.0f);
        if (n63Var.q != 8.0f) {
            n63Var.c |= 2048;
            n63Var.q = 8.0f;
        }
        n63Var.o(e54.b);
        n63Var.m(k43.a);
        n63Var.d(false);
        if (n63Var.u != 0) {
            n63Var.c |= 32768;
            n63Var.u = 0;
        }
        n63Var.v = 9205357640488583168L;
        n63Var.y = null;
        n63Var.c = 0;
        ux1 ux1Var = this.t;
        n63Var.w = ux1Var.G;
        n63Var.x = ux1Var.H;
        n63Var.v = y64.W(this.h);
        xx1.a(ux1Var).getSnapshotObserver().a(this, fl1.L, new j(26, le1Var));
        zw1 zw1Var = this.H;
        if (zw1Var == null) {
            zw1Var = new zw1();
            this.H = zw1Var;
        }
        zw1 zw1Var2 = P;
        zw1Var2.getClass();
        zw1Var2.a = zw1Var.a;
        zw1Var2.b = zw1Var.b;
        zw1Var2.c = zw1Var.c;
        zw1Var2.d = zw1Var.d;
        zw1Var2.e = zw1Var.e;
        zw1Var.a = n63Var.d;
        zw1Var.b = n63Var.h;
        zw1Var.c = n63Var.p;
        zw1Var.d = n63Var.q;
        zw1Var.e = n63Var.r;
        wr2Var.updateLayerProperties(n63Var);
        boolean z3 = this.x;
        this.x = n63Var.t;
        this.B = n63Var.l;
        if (zw1Var2.a == zw1Var.a && zw1Var2.b == zw1Var.b && zw1Var2.c == zw1Var.c && zw1Var2.d == zw1Var.d && e54.a(zw1Var2.e, zw1Var.e)) {
            z2 = true;
        }
        boolean z4 = !z2;
        if (z && ((!z2 || z3 != this.x) && (yr2Var = ux1Var.v) != null)) {
            yr2Var.onLayoutChange(ux1Var);
        }
        return z4;
    }

    public final boolean n1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        wr2 wr2Var = this.N;
        return wr2Var == null || !this.x || wr2Var.mo83x467a9c69(j);
    }

    @Override // defpackage.m82
    public final m82 p0() {
        return this.u;
    }

    @Override // defpackage.cx1
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public final long mo174xf127194(long j) {
        if (!z()) {
            po1.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return Y0(y64.u(this), xx1.a(this.t).mo29xf127194(j));
    }

    @Override // defpackage.m82
    public final cx1 v0() {
        return this;
    }

    @Override // defpackage.m82
    public final boolean w0() {
        return this.C != null;
    }

    @Override // defpackage.m82
    public final ux1 x0() {
        return this.t;
    }

    @Override // defpackage.cx1
    public final long y(cx1 cx1Var, long j) {
        return Y0(cx1Var, j);
    }

    @Override // defpackage.m82
    public final wb2 y0() {
        wb2 wb2Var = this.C;
        if (wb2Var != null) {
            return wb2Var;
        }
        u41.r("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    @Override // defpackage.cx1
    public final boolean z() {
        return P0().isAttached();
    }

    @Override // defpackage.m82
    public final m82 z0() {
        return this.v;
    }
}

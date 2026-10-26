package defpackage;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.CompositionLocalMap$Companion;
import androidx.compose.ui.autofill.ContentDataType$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.node.a;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.platform.ViewConfiguration;
import java.util.Arrays;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ux1 implements vj0, zr2, a, xr2 {
    public static final s73 Y = new s73("Undefined intrinsics block and it is required", 1);
    public static final px1 Z = new px1();
    public static final lk0 a0 = new lk0(3);
    public ue3 A;
    public boolean B;
    public final oi2 C;
    public boolean D;
    public vb2 E;
    public bi4 F;
    public wu0 G;
    public dx1 H;
    public ViewConfiguration I;
    public androidx.compose.runtime.a J;
    public sx1 K;
    public sx1 L;
    public boolean M;
    public final yd N;
    public final yx1 O;
    public iy1 P;
    public wl2 Q;
    public boolean R;
    public c S;
    public c T;
    public fe U;
    public ge V;
    public boolean W;
    public boolean X;
    public final boolean c;
    public int d;
    public long h;
    public long l;
    public long m;
    public boolean n;
    public boolean o;
    public ux1 p;
    public int q;
    public final fp1 r;
    public oi2 s;
    public boolean t;
    public ux1 u;
    public yr2 v;
    public bd4 w;
    public int x;
    public boolean y;
    public boolean z;

    public ux1(int i) {
        this(we3.a.addAndGet(1), (i & 1) == 0);
    }

    public ux1(int i, boolean z) {
        this.c = z;
        this.d = i;
        this.h = 9223372034707292159L;
        this.l = 0L;
        this.m = 9223372034707292159L;
        this.n = true;
        this.r = new fp1(new oi2(0, new ux1[16]), new j(20, this));
        this.C = new oi2(0, new ux1[16]);
        this.D = true;
        this.E = Y;
        this.G = xx1.a;
        this.H = dx1.c;
        this.I = Z;
        androidx.compose.runtime.a.g.getClass();
        this.J = CompositionLocalMap$Companion.getEmpty();
        sx1 sx1Var = sx1.h;
        this.K = sx1Var;
        this.L = sx1Var;
        this.N = new yd(this);
        this.O = new yx1(this);
        this.R = true;
        this.S = c.i;
    }

    public static void Q(ux1 ux1Var, boolean z, int i) {
        ux1 ux1VarT;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (ux1Var.p == null) {
            po1.b("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        yr2 yr2Var = ux1Var.v;
        if (yr2Var == null || ux1Var.y || ux1Var.c) {
            return;
        }
        yr2Var.onRequestMeasure(ux1Var, true, z, z2);
        if (z3) {
            s82 s82Var = ux1Var.O.q;
            s82Var.getClass();
            yx1 yx1Var = s82Var.n;
            ux1 ux1VarT2 = yx1Var.a.t();
            sx1 sx1Var = yx1Var.a.K;
            if (ux1VarT2 == null || sx1Var == sx1.h) {
                return;
            }
            while (ux1VarT2.K == sx1Var && (ux1VarT = ux1VarT2.t()) != null) {
                ux1VarT2 = ux1VarT;
            }
            int iOrdinal = sx1Var.ordinal();
            if (iOrdinal == 0) {
                if (ux1VarT2.p != null) {
                    Q(ux1VarT2, z, 6);
                    return;
                } else {
                    S(ux1VarT2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                u41.r("Intrinsics isn't used by the parent");
            } else if (ux1VarT2.p != null) {
                ux1VarT2.P(z);
            } else {
                ux1VarT2.R(z);
            }
        }
    }

    public static void S(ux1 ux1Var, boolean z, int i) {
        yr2 yr2Var;
        ux1 ux1VarT;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (ux1Var.y || ux1Var.c || (yr2Var = ux1Var.v) == null) {
            return;
        }
        yr2Var.onRequestMeasure(ux1Var, false, z, z2);
        if (z3) {
            yx1 yx1Var = ux1Var.O.p.n;
            ux1 ux1VarT2 = yx1Var.a.t();
            sx1 sx1Var = yx1Var.a.K;
            if (ux1VarT2 == null || sx1Var == sx1.h) {
                return;
            }
            while (ux1VarT2.K == sx1Var && (ux1VarT = ux1VarT2.t()) != null) {
                ux1VarT2 = ux1VarT;
            }
            int iOrdinal = sx1Var.ordinal();
            if (iOrdinal == 0) {
                S(ux1VarT2, z, 6);
            } else if (iOrdinal == 1) {
                ux1VarT2.R(z);
            } else {
                u41.r("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void T(ux1 ux1Var) {
        yx1 yx1Var = ux1Var.O;
        if (tx1.a[yx1Var.d.ordinal()] != 1) {
            m51.B(yx1Var.d, "Unexpected state ");
            return;
        }
        if (yx1Var.e) {
            Q(ux1Var, true, 6);
            return;
        }
        if (yx1Var.f) {
            ux1Var.P(true);
        }
        if (ux1Var.q()) {
            S(ux1Var, true, 6);
        } else if (ux1Var.p()) {
            ux1Var.R(true);
        }
    }

    private final String j(ux1 ux1Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(ux1Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(h(0));
        sb.append(" Other tree: ");
        ux1 ux1Var2 = ux1Var.u;
        sb.append(ux1Var2 != null ? ux1Var2.h(0) : null);
        return sb.toString();
    }

    public final void A() {
        if (this.R) {
            yd ydVar = this.N;
            wl2 wl2Var = (xo1) ydVar.c;
            wl2 wl2Var2 = ((wl2) ydVar.d).v;
            this.Q = null;
            while (!kr1.n(wl2Var, wl2Var2)) {
                if ((wl2Var != null ? wl2Var.N : null) != null) {
                    this.Q = wl2Var;
                    break;
                }
                wl2Var = wl2Var != null ? wl2Var.v : null;
            }
        }
        wl2 wl2Var3 = this.Q;
        if (wl2Var3 != null && wl2Var3.N == null) {
            throw fq2.i("layer was not set");
        }
        if (wl2Var3 != null) {
            wl2Var3.W0();
            return;
        }
        ux1 ux1VarT = t();
        if (ux1VarT != null) {
            ux1VarT.A();
        }
    }

    public final void B() {
        yd ydVar = this.N;
        xo1 xo1Var = (xo1) ydVar.c;
        for (wl2 wl2Var = (wl2) ydVar.d; wl2Var != xo1Var; wl2Var = wl2Var.u) {
            wl2Var.getClass();
            wr2 wr2Var = ((nx1) wl2Var).N;
            if (wr2Var != null) {
                wr2Var.invalidate();
            }
        }
        wr2 wr2Var2 = ((xo1) ydVar.c).N;
        if (wr2Var2 != null) {
            wr2Var2.invalidate();
        }
    }

    public final void C() {
        this.n = true;
        if (this.p != null) {
            Q(this, false, 7);
        } else {
            S(this, false, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    public final void D() {
        String str;
        String str2;
        if (this.B) {
            return;
        }
        this.N.getClass();
        if (rl2.a.getChild$ui_release() != null || this.T != null) {
            this.z = true;
            return;
        }
        ue3 ue3Var = this.A;
        this.B = true;
        q43 q43Var = new q43();
        q43Var.c = new ue3();
        as2 snapshotObserver = xx1.a(this).getSnapshotObserver();
        snapshotObserver.a(this, snapshotObserver.d, new c9(this, 12, q43Var));
        this.B = false;
        this.A = (ue3) q43Var.c;
        this.z = false;
        yr2 yr2VarA = xx1.a(this);
        vh2 vh2Var = yr2VarA.getSemanticsOwner().d;
        Object[] objArr = vh2Var.a;
        int i = vh2Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            m9 m9Var = (m9) objArr[i2];
            AndroidComposeView androidComposeView = m9Var.c;
            sz0 sz0Var = m9Var.a;
            ue3 ue3VarV = v();
            int i3 = this.d;
            if (ue3Var != null) {
                Object objG = ue3Var.c.g(cf3.C);
                if (objG == null) {
                    objG = null;
                }
                hg hgVar = (hg) objG;
                if (hgVar != null) {
                    str = hgVar.d;
                } else {
                    str = null;
                }
            } else {
                str = null;
            }
            if (ue3VarV != null) {
                Object objG2 = ue3VarV.c.g(cf3.C);
                if (objG2 == null) {
                    objG2 = null;
                }
                hg hgVar2 = (hg) objG2;
                if (hgVar2 != null) {
                    str2 = hgVar2.d;
                } else {
                    str2 = null;
                }
            } else {
                str2 = null;
            }
            if (str != str2) {
                if (str == null) {
                    sz0Var.s(androidComposeView, i3, true);
                } else if (str2 == null) {
                    sz0Var.s(androidComposeView, i3, false);
                } else if (kr1.n((ga) y64.B(ue3VarV, cf3.q), ContentDataType$Companion.getText())) {
                    ((AutofillManager) sz0Var.c).notifyValueChanged(androidComposeView, i3, AutofillValue.forText(str2.toString()));
                }
            }
            boolean z = ue3Var != null && ue3Var.c.b(cf3.p);
            boolean z2 = ue3VarV != null && ue3VarV.c.b(cf3.p);
            if (z != z2) {
                eh2 eh2Var = m9Var.h;
                if (z2) {
                    eh2Var.a(i3);
                } else {
                    eh2Var.e(i3);
                }
            }
        }
        yr2VarA.onSemanticsChange();
    }

    public final void E() {
        ux1 ux1Var;
        if (this.q > 0) {
            this.t = true;
        }
        if (!this.c || (ux1Var = this.u) == null) {
            return;
        }
        ux1Var.E();
    }

    public final boolean F() {
        return this.v != null;
    }

    public final boolean G() {
        return this.O.p.A;
    }

    public final Boolean H() {
        s82 s82Var = this.O.q;
        if (s82Var != null) {
            return Boolean.valueOf(s82Var.x());
        }
        return null;
    }

    public final void I() {
        ux1 ux1VarT;
        if (this.K == sx1.h) {
            f();
        }
        s82 s82Var = this.O.q;
        s82Var.getClass();
        try {
            s82Var.o = true;
            if (!s82Var.t) {
                po1.b("replace() called on item that was not placed");
            }
            s82Var.F = false;
            boolean zX = s82Var.x();
            s82Var.x0(s82Var.w, s82Var.x);
            if (zX && !s82Var.F && (ux1VarT = s82Var.n.a.t()) != null) {
                ux1VarT.P(false);
            }
        } finally {
            s82Var.o = false;
        }
    }

    public final void J(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            fp1 fp1Var = this.r;
            oi2 oi2Var = (oi2) fp1Var.c;
            j jVar = (j) fp1Var.d;
            Object objM = oi2Var.m(i5);
            jVar.invoke();
            ((oi2) fp1Var.c).b(i6, (ux1) objM);
            jVar.invoke();
        }
        L();
        E();
        C();
    }

    public final void K(ux1 ux1Var) {
        if (ux1Var.O.l > 0) {
            yx1 yx1Var = this.O;
            yx1Var.b(yx1Var.l - 1);
        }
        if (this.v != null) {
            ux1Var.i();
        }
        ux1Var.u = null;
        ((wl2) ux1Var.N.d).v = null;
        if (ux1Var.c) {
            this.q--;
            oi2 oi2Var = (oi2) ux1Var.r.c;
            Object[] objArr = oi2Var.c;
            int i = oi2Var.h;
            for (int i2 = 0; i2 < i; i2++) {
                ((wl2) ((ux1) objArr[i2]).N.d).v = null;
            }
        }
        E();
        L();
    }

    public final void L() {
        if (!this.c) {
            this.D = true;
            return;
        }
        ux1 ux1VarT = t();
        if (ux1VarT != null) {
            ux1VarT.L();
        }
    }

    public final void M() {
        fp1 fp1Var = this.r;
        int i = ((oi2) fp1Var.c).h;
        while (true) {
            i--;
            oi2 oi2Var = (oi2) fp1Var.c;
            if (-1 >= i) {
                oi2Var.i();
                ((j) fp1Var.d).invoke();
                return;
            }
            K((ux1) oi2Var.c[i]);
        }
    }

    public final void N(int i, int i2) {
        if (i2 < 0) {
            po1.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            fp1 fp1Var = this.r;
            K((ux1) ((oi2) fp1Var.c).c[i3]);
            Object objM = ((oi2) fp1Var.c).m(i3);
            ((j) fp1Var.d).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void O() {
        ux1 ux1VarT;
        if (this.K == sx1.h) {
            f();
        }
        ub2 ub2Var = this.O.p;
        ub2Var.getClass();
        try {
            ub2Var.o = true;
            if (!ub2Var.s) {
                po1.b("replace called on unplaced item");
            }
            boolean z = ub2Var.A;
            ub2Var.y0(ub2Var.v, ub2Var.x, ub2Var.w);
            if (z && !ub2Var.N && (ux1VarT = ub2Var.n.a.t()) != null) {
                ux1VarT.R(false);
            }
        } finally {
            ub2Var.o = false;
        }
    }

    public final void P(boolean z) {
        yr2 yr2Var;
        if (this.c || (yr2Var = this.v) == null) {
            return;
        }
        yr2Var.onRequestRelayout(this, true, z);
    }

    public final void R(boolean z) {
        yr2 yr2Var;
        this.n = true;
        if (this.c || (yr2Var = this.v) == null) {
            return;
        }
        yr2Var.onRequestRelayout(this, false, z);
    }

    public final void U() {
        oi2 oi2VarX = x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var = (ux1) objArr[i2];
            sx1 sx1Var = ux1Var.L;
            ux1Var.K = sx1Var;
            if (sx1Var != sx1.h) {
                ux1Var.U();
            }
        }
    }

    public final void V(wu0 wu0Var) {
        if (kr1.n(this.G, wu0Var)) {
            return;
        }
        this.G = wu0Var;
        C();
        ux1 ux1VarT = t();
        if (ux1VarT != null) {
            ux1VarT.A();
        }
        B();
        for (of2 child$ui_release = (of2) this.N.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.onDensityChange();
        }
    }

    public final void W(ux1 ux1Var) {
        if (kr1.n(ux1Var, this.p)) {
            return;
        }
        this.p = ux1Var;
        yx1 yx1Var = this.O;
        if (ux1Var != null) {
            if (yx1Var.q == null) {
                yx1Var.q = new s82(yx1Var);
            }
            yd ydVar = this.N;
            wl2 wl2Var = ((xo1) ydVar.c).u;
            for (wl2 wl2Var2 = (wl2) ydVar.d; !kr1.n(wl2Var2, wl2Var) && wl2Var2 != null; wl2Var2 = wl2Var2.u) {
                wl2Var2.J0();
            }
        } else {
            yx1Var.q = null;
        }
        C();
    }

    public final void X(vb2 vb2Var) {
        if (kr1.n(this.E, vb2Var)) {
            return;
        }
        this.E = vb2Var;
        bi4 bi4Var = this.F;
        if (bi4Var != null) {
            ((ft2) bi4Var.d).setValue(vb2Var);
        }
        C();
    }

    public final void Y(c cVar) {
        if (this.c && this.S != c.i) {
            po1.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.X) {
            po1.a("modifier is updated when deactivated");
        }
        if (!F()) {
            this.T = cVar;
            return;
        }
        a(cVar);
        if (this.z) {
            D();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [of2] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [oi2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [oi2] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void Z(ViewConfiguration viewConfiguration) {
        if (kr1.n(this.I, viewConfiguration)) {
            return;
        }
        this.I = viewConfiguration;
        yd ydVar = this.N;
        if ((((of2) ydVar.f).getAggregateChildKindSet$ui_release() & 16) != 0) {
            for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                if ((child$ui_release.getKindSet$ui_release() & 16) != 0) {
                    ?? E = child$ui_release;
                    ?? oi2Var = 0;
                    while (E != 0) {
                        if (E instanceof hx2) {
                            ((hx2) E).e0();
                        } else if ((E.getKindSet$ui_release() & 16) != 0 && (E instanceof ju0)) {
                            of2 child$ui_release2 = ((ju0) E).d;
                            int i = 0;
                            E = E;
                            oi2Var = oi2Var;
                            while (child$ui_release2 != null) {
                                if ((child$ui_release2.getKindSet$ui_release() & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oi2Var = oi2Var;
                                        E = child$ui_release2;
                                    } else {
                                        if (oi2Var == 0) {
                                            oi2Var = new oi2(0, new of2[16]);
                                        }
                                        if (E != 0) {
                                            oi2Var.c(E);
                                            E = 0;
                                        }
                                        oi2Var.c(child$ui_release2);
                                    }
                                }
                                child$ui_release2 = child$ui_release2.getChild$ui_release();
                                E = E;
                                oi2Var = oi2Var;
                            }
                            if (i == 1) {
                            }
                        }
                        E = y64.e(oi2Var);
                    }
                }
                if ((child$ui_release.getAggregateChildKindSet$ui_release() & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void a(c cVar) {
        boolean z;
        yd ydVar;
        oi2 oi2Var;
        ql2 ql2Var;
        oi2 oi2Var2;
        boolean z2;
        this.S = cVar;
        yd ydVar2 = this.N;
        xo1 xo1Var = (xo1) ydVar2.c;
        of2 of2Var = (es3) ydVar2.e;
        ux1 ux1Var = (ux1) ydVar2.b;
        of2 of2Var2 = (of2) ydVar2.f;
        ql2 ql2Var2 = rl2.a;
        if (of2Var2 == ql2Var2) {
            po1.b("padChain called on already padded chain");
        }
        of2 of2Var3 = (of2) ydVar2.f;
        of2Var3.setParent$ui_release(ql2Var2);
        ql2Var2.setChild$ui_release(of2Var3);
        oi2 oi2Var3 = (oi2) ydVar2.g;
        int i = oi2Var3 != null ? oi2Var3.h : 0;
        oi2 oi2Var4 = (oi2) ydVar2.h;
        if (oi2Var4 == null) {
            oi2Var4 = new oi2(0, new nf2[16]);
        }
        int i2 = oi2Var4.h;
        if (i2 < 16) {
            i2 = 16;
        }
        oi2 oi2Var5 = new oi2(0, new c[i2]);
        oi2Var5.c(cVar);
        t91 t91Var = null;
        while (true) {
            int i3 = oi2Var5.h;
            int i4 = 1;
            if (i3 == 0) {
                break;
            }
            c cVar2 = (c) oi2Var5.m(i3 - 1);
            if (cVar2 instanceof uf0) {
                uf0 uf0Var = (uf0) cVar2;
                oi2Var5.c(uf0Var.d);
                oi2Var5.c(uf0Var.c);
            } else if (cVar2 instanceof nf2) {
                oi2Var4.c(cVar2);
            } else {
                if (t91Var == null) {
                    t91Var = new t91(i4, oi2Var4);
                }
                cVar2.all(t91Var);
                t91Var = t91Var;
            }
        }
        int i5 = oi2Var4.h;
        if (i5 == i) {
            of2 child$ui_release = ql2Var2.getChild$ui_release();
            int i6 = 0;
            while (child$ui_release != null && i6 < i) {
                if (oi2Var3 == null) {
                    throw fq2.i("expected prior modifier list to be non-empty");
                }
                nf2 nf2Var = (nf2) oi2Var3.c[i6];
                nf2 nf2Var2 = (nf2) oi2Var4.c[i6];
                char c = kr1.n(nf2Var, nf2Var2) ? (char) 2 : nf2Var.getClass() == nf2Var2.getClass() ? (char) 1 : (char) 0;
                if (c == 0) {
                    child$ui_release = child$ui_release.getParent$ui_release();
                    break;
                }
                if (c == 1) {
                    yd.l(nf2Var, nf2Var2, child$ui_release);
                }
                child$ui_release = child$ui_release.getChild$ui_release();
                i6++;
            }
            if (i6 >= i) {
                ydVar2 = ydVar2;
                ydVar = ydVar2;
                oi2Var = oi2Var3;
                ql2Var = ql2Var2;
                oi2Var2 = oi2Var4;
                z2 = false;
            } else {
                if (oi2Var3 == null) {
                    throw fq2.i("expected prior modifier list to be non-empty");
                }
                if (child$ui_release == null) {
                    throw fq2.i("structuralUpdate requires a non-null tail");
                }
                boolean z3 = ux1Var.T != null;
                of2 of2Var4 = child$ui_release;
                ydVar = ydVar2;
                oi2Var = oi2Var3;
                oi2Var2 = oi2Var4;
                ydVar.j(i6, oi2Var, oi2Var2, of2Var4, !z3);
                ql2Var = ql2Var2;
                z2 = true;
            }
        } else {
            c cVar3 = ux1Var.T;
            if (cVar3 != null && i == 0) {
                of2 of2VarD = ql2Var2;
                for (int i7 = 0; i7 < oi2Var4.h; i7++) {
                    of2VarD = yd.d((nf2) oi2Var4.c[i7], of2VarD);
                }
                int kindSet$ui_release = 0;
                for (of2 parent$ui_release = of2Var.getParent$ui_release(); parent$ui_release != null && parent$ui_release != rl2.a; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                    kindSet$ui_release |= parent$ui_release.getKindSet$ui_release();
                    parent$ui_release.setAggregateChildKindSet$ui_release(kindSet$ui_release);
                }
                ydVar = ydVar2;
                oi2Var = oi2Var3;
                ql2Var = ql2Var2;
                oi2Var2 = oi2Var4;
            } else if (i5 != 0) {
                if (oi2Var3 == null) {
                    z = false;
                    oi2Var3 = new oi2(0, new nf2[16]);
                } else {
                    z = false;
                }
                boolean z4 = cVar3 != null ? true : z;
                ydVar = ydVar2;
                oi2Var = oi2Var3;
                ql2Var = ql2Var2;
                oi2Var2 = oi2Var4;
                ydVar.j(0, oi2Var, oi2Var2, ql2Var, !z4);
            } else {
                if (oi2Var3 == null) {
                    throw fq2.i("expected prior modifier list to be non-empty");
                }
                of2 child$ui_release2 = ql2Var2.getChild$ui_release();
                for (int i8 = 0; child$ui_release2 != null && i8 < oi2Var3.h; i8++) {
                    child$ui_release2 = yd.e(child$ui_release2).getChild$ui_release();
                }
                ux1 ux1VarT = ux1Var.t();
                xo1Var.v = ux1VarT != null ? (xo1) ux1VarT.N.c : null;
                ydVar2.d = xo1Var;
                ydVar = ydVar2;
                oi2Var = oi2Var3;
                ql2Var = ql2Var2;
                oi2Var2 = oi2Var4;
                z2 = false;
            }
            z2 = true;
        }
        ydVar.g = oi2Var2;
        if (oi2Var != null) {
            oi2Var.i();
        } else {
            oi2Var = null;
        }
        ydVar.h = oi2Var;
        ql2 ql2Var3 = rl2.a;
        if (ql2Var != ql2Var3) {
            po1.b("trimChain called on already trimmed chain");
        }
        of2 child$ui_release3 = ql2Var3.getChild$ui_release();
        if (child$ui_release3 != null) {
            of2Var = child$ui_release3;
        }
        of2Var.setParent$ui_release(null);
        ql2Var3.setChild$ui_release(null);
        ql2Var3.setAggregateChildKindSet$ui_release(-1);
        ql2Var3.updateCoordinator$ui_release(null);
        if (of2Var == ql2Var3) {
            po1.b("trimChain did not update the head");
        }
        ydVar.f = of2Var;
        if (z2) {
            ydVar.k();
        }
        this.O.h();
        if (this.p == null && ydVar.g(ConstantsKt.MINIMUM_BLOCK_SIZE)) {
            W(this);
        }
    }

    public final void a0() {
        if (this.q <= 0 || !this.t) {
            return;
        }
        this.t = false;
        oi2 oi2Var = this.s;
        if (oi2Var == null) {
            oi2Var = new oi2(0, new ux1[16]);
            this.s = oi2Var;
        }
        oi2Var.i();
        oi2 oi2Var2 = (oi2) this.r.c;
        Object[] objArr = oi2Var2.c;
        int i = oi2Var2.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var = (ux1) objArr[i2];
            if (ux1Var.c) {
                oi2Var.d(oi2Var.h, ux1Var.x());
            } else {
                oi2Var.c(ux1Var);
            }
        }
        yx1 yx1Var = this.O;
        yx1Var.p.H = true;
        s82 s82Var = yx1Var.q;
        if (s82Var != null) {
            s82Var.B = true;
        }
    }

    public final void b(yr2 yr2Var) {
        ux1 ux1Var;
        if (this.v != null) {
            po1.b("Cannot attach " + this + " as it already is attached.  Tree: " + h(0));
        }
        ux1 ux1Var2 = this.u;
        if (ux1Var2 != null && !kr1.n(ux1Var2.v, yr2Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(yr2Var);
            sb.append(") than the parent's owner(");
            ux1 ux1VarT = t();
            sb.append(ux1VarT != null ? ux1VarT.v : null);
            sb.append("). This tree: ");
            sb.append(h(0));
            sb.append(" Parent tree: ");
            ux1 ux1Var3 = this.u;
            sb.append(ux1Var3 != null ? ux1Var3.h(0) : null);
            po1.b(sb.toString());
        }
        ux1 ux1VarT2 = t();
        yx1 yx1Var = this.O;
        if (ux1VarT2 == null) {
            yx1Var.p.A = true;
            s82 s82Var = yx1Var.q;
            if (s82Var != null) {
                s82Var.y = q82.c;
            }
        }
        yd ydVar = this.N;
        ((wl2) ydVar.d).v = ux1VarT2 != null ? (xo1) ux1VarT2.N.c : null;
        this.v = yr2Var;
        this.x = (ux1VarT2 != null ? ux1VarT2.x : -1) + 1;
        c cVar = this.T;
        if (cVar != null) {
            a(cVar);
        }
        this.T = null;
        yr2Var.onPreAttach(this);
        ux1 ux1Var4 = this.u;
        if (ux1Var4 == null || (ux1Var = ux1Var4.p) == null) {
            ux1Var = this.p;
        }
        W(ux1Var);
        if (this.p == null && ydVar.g(ConstantsKt.MINIMUM_BLOCK_SIZE)) {
            W(this);
        }
        if (!this.X) {
            for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                child$ui_release.markAsAttached$ui_release();
            }
        }
        oi2 oi2Var = (oi2) this.r.c;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ux1) objArr[i2]).b(yr2Var);
        }
        if (!this.X) {
            ydVar.h();
        }
        C();
        if (ux1VarT2 != null) {
            ux1VarT2.C();
        }
        wl2 wl2Var = ((xo1) ydVar.c).u;
        for (wl2 wl2Var2 = (wl2) ydVar.d; !kr1.n(wl2Var2, wl2Var) && wl2Var2 != null; wl2Var2 = wl2Var2.u) {
            wl2Var2.l1(wl2Var2.y, true);
            wr2 wr2Var = wl2Var2.N;
            if (wr2Var != null) {
                wr2Var.invalidate();
            }
        }
        fe feVar = this.U;
        if (feVar != null) {
            feVar.invoke(yr2Var);
        }
        yx1Var.h();
        if (!this.X && ydVar.g(8)) {
            D();
        }
        yr2Var.onPostAttach(this);
    }

    public final void c() {
        this.L = this.K;
        sx1 sx1Var = sx1.h;
        this.K = sx1Var;
        oi2 oi2VarX = x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var = (ux1) objArr[i2];
            if (ux1Var.K != sx1Var) {
                ux1Var.c();
            }
        }
    }

    @Override // defpackage.vj0
    public final void d() {
        if (!F()) {
            po1.a("onReuse is only expected on attached node");
        }
        bd4 bd4Var = this.w;
        if (bd4Var != null) {
            bd4Var.d();
        }
        iy1 iy1Var = this.P;
        if (iy1Var != null) {
            iy1Var.c(false);
        }
        this.B = false;
        boolean z = this.X;
        yd ydVar = this.N;
        if (z) {
            this.X = false;
        } else {
            for (of2 parent$ui_release = (es3) ydVar.e; parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if (parent$ui_release.isAttached()) {
                    parent$ui_release.reset$ui_release();
                }
            }
            ydVar.i();
            for (of2 parent$ui_release2 = (es3) ydVar.e; parent$ui_release2 != null; parent$ui_release2 = parent$ui_release2.getParent$ui_release()) {
                if (parent$ui_release2.isAttached()) {
                    parent$ui_release2.markAsDetached$ui_release();
                }
            }
        }
        int i = this.d;
        this.d = we3.a.addAndGet(1);
        yr2 yr2Var = this.v;
        if (yr2Var != null) {
            yr2Var.onPreLayoutNodeReused(this, i);
        }
        for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
            child$ui_release.markAsAttached$ui_release();
        }
        ydVar.h();
        if (ydVar.g(8)) {
            D();
        }
        T(this);
        yr2 yr2Var2 = this.v;
        if (yr2Var2 != null) {
            yr2Var2.onPostLayoutNodeReused(this, i);
        }
    }

    @Override // defpackage.vj0
    public final void e() {
        bd4 bd4Var = this.w;
        if (bd4Var != null) {
            bd4Var.e();
        }
        iy1 iy1Var = this.P;
        if (iy1Var != null) {
            iy1Var.e();
        }
        yd ydVar = this.N;
        wl2 wl2Var = ((xo1) ydVar.c).u;
        for (wl2 wl2Var2 = (wl2) ydVar.d; !kr1.n(wl2Var2, wl2Var) && wl2Var2 != null; wl2Var2 = wl2Var2.u) {
            wl2Var2.w = true;
            wl2Var2.L.invoke();
            if (wl2Var2.N != null) {
                wl2Var2.l1(null, false);
                wl2Var2.t.R(false);
            }
        }
    }

    public final void f() {
        this.L = this.K;
        this.K = sx1.h;
        oi2 oi2VarX = x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var = (ux1) objArr[i2];
            if (ux1Var.K == sx1.d) {
                ux1Var.f();
            }
        }
    }

    @Override // defpackage.vj0
    public final void g() {
        bd4 bd4Var = this.w;
        if (bd4Var != null) {
            bd4Var.g();
        }
        iy1 iy1Var = this.P;
        if (iy1Var != null) {
            iy1Var.c(true);
        }
        this.X = true;
        yd ydVar = this.N;
        for (of2 parent$ui_release = (es3) ydVar.e; parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release.isAttached()) {
                parent$ui_release.reset$ui_release();
            }
        }
        ydVar.i();
        for (of2 parent$ui_release2 = (es3) ydVar.e; parent$ui_release2 != null; parent$ui_release2 = parent$ui_release2.getParent$ui_release()) {
            if (parent$ui_release2.isAttached()) {
                parent$ui_release2.markAsDetached$ui_release();
            }
        }
        if (F()) {
            this.A = null;
            this.z = false;
        }
        yr2 yr2Var = this.v;
        if (yr2Var != null) {
            yr2Var.onLayoutNodeDeactivated(this);
        }
    }

    public final String h(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        oi2 oi2VarX = x();
        Object[] objArr = oi2VarX.c;
        int i3 = oi2VarX.h;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((ux1) objArr[i4]).h(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    public final void i() {
        String str;
        String str2;
        vx1 vx1Var;
        yr2 yr2Var = this.v;
        String str3 = null;
        if (yr2Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            ux1 ux1VarT = t();
            sb.append(ux1VarT != null ? ux1VarT.h(0) : null);
            po1.c(sb.toString());
            u41.p();
            return;
        }
        ux1 ux1VarT2 = t();
        yx1 yx1Var = this.O;
        if (ux1VarT2 != null) {
            ux1VarT2.A();
            ux1VarT2.C();
            ub2 ub2Var = yx1Var.p;
            sx1 sx1Var = sx1.h;
            ub2Var.t = sx1Var;
            s82 s82Var = yx1Var.q;
            if (s82Var != null) {
                s82Var.r = sx1Var;
            }
        }
        vx1 vx1Var2 = yx1Var.p.F;
        vx1Var2.b = true;
        vx1Var2.c = false;
        vx1Var2.e = false;
        vx1Var2.d = false;
        vx1Var2.f = false;
        vx1Var2.g = false;
        vx1Var2.h = null;
        s82 s82Var2 = yx1Var.q;
        if (s82Var2 != null && (vx1Var = s82Var2.z) != null) {
            vx1Var.b = true;
            vx1Var.c = false;
            vx1Var.e = false;
            vx1Var.d = false;
            vx1Var.f = false;
            vx1Var.g = false;
            vx1Var.h = null;
        }
        ge geVar = this.V;
        if (geVar != null) {
            geVar.invoke(yr2Var);
        }
        yd ydVar = this.N;
        ydVar.i();
        this.y = true;
        oi2 oi2Var = (oi2) this.r.c;
        Object[] objArr = oi2Var.c;
        int i = oi2Var.h;
        for (int i2 = 0; i2 < i; i2++) {
            ((ux1) objArr[i2]).i();
        }
        this.y = false;
        for (of2 parent$ui_release = (es3) ydVar.e; parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
            if (parent$ui_release.isAttached()) {
                parent$ui_release.markAsDetached$ui_release();
            }
        }
        yr2Var.onDetach(this);
        this.v = null;
        W(null);
        this.x = 0;
        ub2 ub2Var2 = yx1Var.p;
        ub2Var2.q = IntCompanionObject.MAX_VALUE;
        ub2Var2.p = IntCompanionObject.MAX_VALUE;
        ub2Var2.A = false;
        s82 s82Var3 = yx1Var.q;
        if (s82Var3 != null) {
            s82Var3.q = IntCompanionObject.MAX_VALUE;
            s82Var3.p = IntCompanionObject.MAX_VALUE;
            s82Var3.y = q82.h;
        }
        if (ydVar.g(8)) {
            ue3 ue3Var = this.A;
            this.A = null;
            this.z = false;
            vh2 vh2Var = yr2Var.getSemanticsOwner().d;
            Object[] objArr2 = vh2Var.a;
            int i3 = vh2Var.b;
            int i4 = 0;
            while (i4 < i3) {
                m9 m9Var = (m9) objArr2[i4];
                AndroidComposeView androidComposeView = m9Var.c;
                sz0 sz0Var = m9Var.a;
                ue3 ue3VarV = v();
                int i5 = this.d;
                if (ue3Var != null) {
                    Object objG = ue3Var.c.g(cf3.C);
                    if (objG == null) {
                        objG = str3;
                    }
                    hg hgVar = (hg) objG;
                    if (hgVar != null) {
                        str = hgVar.d;
                    } else {
                        str = str3;
                    }
                } else {
                    str = str3;
                }
                if (ue3VarV != null) {
                    Object objG2 = ue3VarV.c.g(cf3.C);
                    if (objG2 == null) {
                        objG2 = null;
                    }
                    hg hgVar2 = (hg) objG2;
                    if (hgVar2 != null) {
                        str2 = hgVar2.d;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        sz0Var.s(androidComposeView, i5, true);
                    } else if (str2 == null) {
                        sz0Var.s(androidComposeView, i5, false);
                    } else if (kr1.n((ga) y64.B(ue3VarV, cf3.q), ContentDataType$Companion.getText())) {
                        ((AutofillManager) sz0Var.c).notifyValueChanged(androidComposeView, i5, AutofillValue.forText(str2.toString()));
                    }
                }
                boolean z = ue3Var != null && ue3Var.c.b(cf3.p);
                boolean z2 = ue3VarV != null && ue3VarV.c.b(cf3.p);
                if (z != z2) {
                    eh2 eh2Var = m9Var.h;
                    if (z2) {
                        eh2Var.a(i5);
                    } else {
                        eh2Var.e(i5);
                    }
                }
                i4++;
                str3 = null;
            }
            yr2Var.onSemanticsChange();
        }
    }

    @Override // defpackage.zr2
    public final boolean isValidOwnerScope() {
        return F();
    }

    public final void k() {
        if (this.p != null) {
            Q(this, false, 5);
        } else {
            S(this, false, 5);
        }
        ub2 ub2Var = this.O.p;
        um0 um0Var = ub2Var.r ? new um0(ub2Var.l) : null;
        yr2 yr2Var = this.v;
        if (um0Var != null) {
            if (yr2Var != null) {
                yr2Var.mo28x12711d1e(this, um0Var.a);
            }
        } else if (yr2Var != null) {
            yr2Var.measureAndLayout(true);
        }
    }

    public final List l() {
        s82 s82Var = this.O.q;
        s82Var.getClass();
        oi2 oi2Var = s82Var.A;
        yx1 yx1Var = s82Var.n;
        yx1Var.a.n();
        if (!s82Var.B) {
            return oi2Var.h();
        }
        ux1 ux1Var = yx1Var.a;
        oi2 oi2VarX = ux1Var.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (oi2Var.h <= i2) {
                s82 s82Var2 = ux1Var2.O.q;
                s82Var2.getClass();
                oi2Var.c(s82Var2);
            } else {
                s82 s82Var3 = ux1Var2.O.q;
                s82Var3.getClass();
                Object[] objArr2 = oi2Var.c;
                Object obj = objArr2[i2];
                objArr2[i2] = s82Var3;
            }
        }
        oi2Var.n(((oi2) ((th2) ux1Var.n()).d).h, oi2Var.h);
        s82Var.B = false;
        return oi2Var.h();
    }

    public final List m() {
        return this.O.p.n0();
    }

    public final List n() {
        return x().h();
    }

    public final List o() {
        return ((oi2) this.r.c).h();
    }

    public final boolean p() {
        return this.O.p.D;
    }

    public final boolean q() {
        return this.O.p.C;
    }

    public final sx1 r() {
        sx1 sx1Var;
        s82 s82Var = this.O.q;
        return (s82Var == null || (sx1Var = s82Var.r) == null) ? sx1.h : sx1Var;
    }

    public final bi4 s() {
        bi4 bi4Var = this.F;
        if (bi4Var != null) {
            return bi4Var;
        }
        vb2 vb2Var = this.E;
        bi4 bi4Var2 = new bi4();
        bi4Var2.c = this;
        bi4Var2.d = cl3.d(vb2Var);
        this.F = bi4Var2;
        return bi4Var2;
    }

    public final ux1 t() {
        ux1 ux1Var = this.u;
        while (ux1Var != null && ux1Var.c) {
            ux1Var = ux1Var.u;
        }
        return ux1Var;
    }

    public final String toString() {
        return JvmActuals_jvmKt.simpleIdentityToString(this, null) + " children: " + ((oi2) ((th2) n()).d).h + " measurePolicy: " + this.E;
    }

    public final int u() {
        return this.O.p.q;
    }

    public final ue3 v() {
        if (F() && !this.X && this.N.g(8)) {
            return this.A;
        }
        return null;
    }

    public final oi2 w() {
        boolean z = this.D;
        oi2 oi2Var = this.C;
        if (z) {
            oi2Var.i();
            oi2Var.d(oi2Var.h, x());
            Arrays.sort(oi2Var.c, 0, oi2Var.h, a0);
            this.D = false;
        }
        return oi2Var;
    }

    public final oi2 x() {
        a0();
        if (this.q == 0) {
            return (oi2) this.r.c;
        }
        oi2 oi2Var = this.s;
        oi2Var.getClass();
        return oi2Var;
    }

    public final void y(long j, ii1 ii1Var, int i, boolean z) {
        yd ydVar = this.N;
        wl2 wl2Var = (wl2) ydVar.d;
        n63 n63Var = wl2.O;
        ((wl2) ydVar.d).U0(wl2.R, wl2Var.L0(j), ii1Var, i, z);
    }

    public final void z(ux1 ux1Var, int i) {
        if (ux1Var.u != null && ux1Var.v != null) {
            po1.b(j(ux1Var));
        }
        ux1Var.u = this;
        fp1 fp1Var = this.r;
        ((oi2) fp1Var.c).b(i, ux1Var);
        ((j) fp1Var.d).invoke();
        L();
        if (ux1Var.c) {
            this.q++;
        }
        E();
        yr2 yr2Var = this.v;
        if (yr2Var != null) {
            ux1Var.b(yr2Var);
        }
        if (ux1Var.O.l > 0) {
            yx1 yx1Var = this.O;
            yx1Var.b(yx1Var.l + 1);
        }
    }
}

package defpackage;

import android.os.Trace;
import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class kk0 implements ck0 {
    public int A;
    public boolean B;
    public final ik0 C;
    public final ArrayList D;
    public boolean E;
    public wj3 F;
    public yj3 G;
    public bk3 H;
    public boolean I;
    public su2 J;
    public s20 K;
    public final dk0 L;
    public h8 M;
    public u71 N;
    public boolean O;
    public int P;
    public sk0 Q;
    public final xk a;
    public final qk0 b;
    public final yj3 c;
    public final ji2 d;
    public final s20 e;
    public final s20 f;
    public final tk0 g;
    public ou2 i;
    public int j;
    public int k;
    public int l;
    public int[] n;
    public bh2 o;
    public boolean p;
    public boolean q;
    public dh2 u;
    public boolean v;
    public boolean x;
    public int z;
    public final ArrayList h = new ArrayList();
    public final rq1 m = new rq1();
    public final ArrayList r = new ArrayList();
    public final rq1 s = new rq1();
    public su2 t = su2.l;
    public final rq1 w = new rq1();
    public int y = -1;

    public kk0(xk xkVar, qk0 qk0Var, yj3 yj3Var, ji2 ji2Var, s20 s20Var, s20 s20Var2, tk0 tk0Var) {
        this.a = xkVar;
        this.b = qk0Var;
        this.c = yj3Var;
        this.d = ji2Var;
        this.e = s20Var;
        this.f = s20Var2;
        this.g = tk0Var;
        this.B = qk0Var.e() || qk0Var.c();
        this.C = new ik0(0, this);
        this.D = new ArrayList();
        wj3 wj3VarG = yj3Var.g();
        wj3VarG.c();
        this.F = wj3VarG;
        yj3 yj3Var2 = new yj3();
        if (qk0Var.e()) {
            yj3Var2.d();
        }
        if (qk0Var.c()) {
            yj3Var2.s = new dh2();
        }
        this.G = yj3Var2;
        bk3 bk3VarJ = yj3Var2.j();
        bk3VarJ.e(true);
        this.H = bk3VarJ;
        this.L = new dk0(this, s20Var);
        wj3 wj3VarG2 = this.G.g();
        try {
            h8 h8VarA = wj3VarG2.a(0);
            wj3VarG2.c();
            this.M = h8VarA;
            this.N = new u71();
        } catch (Throwable th) {
            wj3VarG2.c();
            throw th;
        }
    }

    public static final int R(kk0 kk0Var, int i, boolean z, int i2) {
        wj3 wj3Var = kk0Var.F;
        int[] iArr = wj3Var.b;
        int i3 = i * 5;
        int i4 = iArr[i3 + 1];
        if ((134217728 & i4) != 0) {
            int i5 = iArr[i3];
            Object objM = wj3Var.m(iArr, i);
            if (i5 == 206 && kr1.n(objM, mk0.e)) {
                Object objG = wj3Var.g(i, 0);
                gk0 gk0Var = objG instanceof gk0 ? (gk0) objG : null;
                if (gk0Var != null) {
                    for (kk0 kk0Var2 : gk0Var.c.e) {
                        yj3 yj3Var = kk0Var2.c;
                        if (yj3Var.d > 0 && (yj3Var.c[1] & 67108864) != 0) {
                            tk0 tk0Var = kk0Var2.g;
                            synchronized (tk0Var.l) {
                                tk0Var.q();
                                fi2 fi2Var = tk0Var.v;
                                tk0Var.v = xr0.Q();
                                try {
                                    tk0Var.A.h0(fi2Var);
                                } catch (Exception e) {
                                    tk0Var.v = fi2Var;
                                    throw e;
                                }
                            }
                            s20 s20Var = new s20();
                            kk0Var2.K = s20Var;
                            wj3 wj3VarG = kk0Var2.c.g();
                            try {
                                kk0Var2.F = wj3VarG;
                                dk0 dk0Var = kk0Var2.L;
                                s20 s20Var2 = dk0Var.b;
                                try {
                                    dk0Var.b = s20Var;
                                    kk0Var2.Q(0);
                                    dk0 dk0Var2 = kk0Var2.L;
                                    dk0Var2.b();
                                    if (dk0Var2.c) {
                                        dk0Var2.b.k.S(vp2.c);
                                        if (dk0Var2.c) {
                                            dk0Var2.d(false);
                                            dk0Var2.d(false);
                                            dk0Var2.b.k.S(gp2.c);
                                            dk0Var2.c = false;
                                        }
                                    }
                                    dk0Var.b = s20Var2;
                                    wj3VarG.c();
                                } catch (Throwable th) {
                                    dk0Var.b = s20Var2;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                wj3VarG.c();
                                throw th2;
                            }
                        }
                        kk0Var.b.m(kk0Var2.g);
                    }
                }
                return wj3Var.l(i);
            }
            if (!wj3Var.i(i)) {
                return wj3Var.l(i);
            }
        } else if ((i4 & 67108864) != 0) {
            int i6 = iArr[i3 + 3] + i;
            int iR = 0;
            for (int i7 = i + 1; i7 < i6; i7 += wj3Var.b[(i7 * 5) + 3]) {
                boolean zI = wj3Var.i(i7);
                if (zI) {
                    kk0Var.L.c();
                    dk0 dk0Var3 = kk0Var.L;
                    Object objK = wj3Var.k(i7);
                    dk0Var3.c();
                    dk0Var3.h.add(objK);
                }
                iR += R(kk0Var, i7, zI || z, zI ? 0 : i2 + iR);
                if (zI) {
                    kk0Var.L.c();
                    kk0Var.L.a();
                }
            }
            if (!wj3Var.i(i)) {
                return iR;
            }
        } else if (!wj3Var.i(i)) {
            return wj3Var.l(i);
        }
        return 1;
    }

    public static final void b(kk0 kk0Var, su2 su2Var, Object obj) {
        kk0Var.W(126665345, 0, null, null);
        kk0Var.H();
        kk0Var.m0(obj);
        int i = kk0Var.P;
        try {
            kk0Var.P = 126665345;
            if (kk0Var.O) {
                bk3.x(kk0Var.H);
            }
            boolean z = (kk0Var.O || kr1.n(kk0Var.F.e(), su2Var)) ? false : true;
            if (z) {
                kk0Var.N(su2Var);
            }
            kk0Var.W(202, 0, mk0.c, su2Var);
            kk0Var.J = null;
            boolean z2 = kk0Var.v;
            kk0Var.v = z;
            yh4.E(kk0Var, new yg0(316014703, new jk0(obj), true));
            kk0Var.v = z2;
        } finally {
            kk0Var.r(false);
            kk0Var.J = null;
            kk0Var.P = i;
            kk0Var.r(false);
        }
    }

    public final xk A() {
        return this.a;
    }

    public final su2 B() {
        return n();
    }

    public final w33 C() {
        if (this.z != 0) {
            return null;
        }
        ArrayList arrayList = this.D;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (w33) arrayList.get(arrayList.size() - 1);
    }

    public final boolean D() {
        w33 w33VarC;
        return !F() || this.v || ((w33VarC = C()) != null && w33VarC.getDefaultsInvalid());
    }

    public final boolean E() {
        return this.O;
    }

    public final boolean F() {
        w33 w33VarC;
        return (this.O || this.x || this.v || (w33VarC = C()) == null || w33VarC.getRequiresRecompose()) ? false : true;
    }

    public final void G(ArrayList arrayList) {
        s20 s20Var = this.f;
        dk0 dk0Var = this.L;
        s20 s20Var2 = dk0Var.b;
        try {
            dk0Var.b = s20Var;
            s20Var.k.S(tp2.c);
            if (arrayList.size() <= 0) {
                dk0Var.b.k.S(hp2.c);
                dk0Var.f = 0;
                dk0Var.b = s20Var2;
            } else {
                ps2 ps2Var = (ps2) arrayList.get(0);
                jg2 jg2Var = (jg2) ps2Var.c;
                jg2Var.getClass();
                throw null;
            }
        } catch (Throwable th) {
            dk0Var.b = s20Var2;
            throw th;
        }
    }

    public final Object H() {
        if (!this.O) {
            Object objJ = this.F.j();
            return (!this.x || (objJ instanceof gk0)) ? objJ : Composer$Companion.getEmpty();
        }
        if (this.q) {
            mk0.c("A call to createNode(), emitNode() or useNode() expected");
        }
        return Composer$Companion.getEmpty();
    }

    public final int I(int i) {
        int iN = this.F.n(i) + 1;
        int i2 = 0;
        while (iN < i) {
            if (!this.F.h(iN)) {
                i2++;
            }
            iN += this.F.b[(iN * 5) + 3];
        }
        return i2;
    }

    public final boolean J(fi2 fi2Var) {
        hq2 hq2Var = this.e.k;
        if (!hq2Var.Q()) {
            mk0.c("Expected applyChanges() to have been called");
        }
        if (fi2Var.e <= 0 && this.r.isEmpty()) {
            return false;
        }
        p(fi2Var, null);
        return hq2Var.R();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0055 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:20:0x003c, B:22:0x0044, B:24:0x004a, B:25:0x004e, B:26:0x004f, B:28:0x0055, B:21:0x0040), top: B:33:0x0005, inners: #1 }] */
    public final Object K(tk0 tk0Var, tk0 tk0Var2, Integer num, List list, je1 je1Var) {
        Object objInvoke;
        boolean z = this.E;
        int i = this.j;
        try {
            this.E = true;
            this.j = 0;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ps2 ps2Var = (ps2) list.get(i2);
                w33 w33Var = (w33) ps2Var.c;
                Object obj = ps2Var.d;
                if (obj != null) {
                    g0(w33Var, obj);
                } else {
                    g0(w33Var, null);
                }
            }
            if (tk0Var == null) {
                objInvoke = je1Var.invoke();
            } else {
                int iIntValue = num != null ? num.intValue() : -1;
                if (tk0Var2 == null || tk0Var2 == tk0Var || iIntValue < 0) {
                    objInvoke = je1Var.invoke();
                } else {
                    tk0Var.x = tk0Var2;
                    tk0Var.y = iIntValue;
                    try {
                        objInvoke = je1Var.invoke();
                        tk0Var.x = null;
                        tk0Var.y = 0;
                    } catch (Throwable th) {
                        tk0Var.x = null;
                        tk0Var.y = 0;
                        throw th;
                    }
                }
                if (objInvoke == null) {
                    objInvoke = je1Var.invoke();
                }
            }
            this.E = z;
            this.j = i;
            return objInvoke;
        } catch (Throwable th2) {
            this.E = z;
            this.j = i;
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    public final void L() {
        tr1 tr1Var;
        int i;
        int i2;
        tr1 tr1Var2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int iHashCode;
        Object objB;
        boolean z2 = this.E;
        this.E = true;
        wj3 wj3Var = this.F;
        int i6 = wj3Var.i;
        int i7 = (i6 * 5) + 3;
        int i8 = wj3Var.b[i7] + i6;
        int i9 = this.j;
        int i10 = this.P;
        int i11 = this.k;
        int i12 = this.l;
        int i13 = wj3Var.g;
        ArrayList arrayList = this.r;
        int iF = mk0.f(i13, arrayList);
        if (iF < 0) {
            iF = -(iF + 1);
        }
        if (iF < arrayList.size()) {
            tr1Var = (tr1) arrayList.get(iF);
            if (tr1Var.b >= i8) {
                tr1Var = null;
            }
        } else {
            tr1Var = null;
        }
        boolean z3 = false;
        int i14 = i6;
        while (tr1Var != null) {
            w33 w33Var = tr1Var.a;
            int i15 = tr1Var.b;
            int iF2 = mk0.f(i15, arrayList);
            if (iF2 >= 0) {
            }
            if (w33Var.isInvalidFor(tr1Var.c)) {
                this.F.o(i15);
                int i16 = this.F.g;
                O(i14, i16, i6);
                int iN = this.F.n(i16);
                while (iN != i6 && !this.F.i(iN)) {
                    iN = this.F.n(iN);
                }
                int iN0 = this.F.i(iN) ? 0 : i9;
                if (iN == i16) {
                    i = i7;
                } else {
                    i = i7;
                    int iN1 = (n0(iN) - this.F.l(i16)) + iN0;
                    while (iN0 < iN1 && iN != i15) {
                        iN++;
                        while (true) {
                            if (iN >= i15) {
                                break;
                            }
                            wj3 wj3Var2 = this.F;
                            i3 = i9;
                            int i17 = wj3Var2.b[(iN * 5) + 3] + iN;
                            if (i15 >= i17) {
                                iN0 += wj3Var2.i(iN) ? 1 : n0(iN);
                                iN = i17;
                                i9 = i3;
                            }
                        }
                        i9 = i3;
                    }
                }
                i2 = i9;
                this.j = iN0;
                this.l = I(i16);
                int iN2 = this.F.n(i16);
                int i18 = 3;
                int iRotateLeft = 0;
                int i19 = 0;
                while (true) {
                    if (iN2 < 0) {
                        i4 = i16;
                        break;
                    }
                    if (iN2 == i6) {
                        iRotateLeft ^= Integer.rotateLeft(i10, i19);
                        i4 = i16;
                        break;
                    }
                    wj3 wj3Var3 = this.F;
                    boolean zH = wj3Var3.h(iN2);
                    i4 = i16;
                    int[] iArr = wj3Var3.b;
                    if (zH) {
                        Object objM = wj3Var3.m(iArr, iN2);
                        if (objM != null) {
                            iHashCode = objM instanceof Enum ? ((Enum) objM).ordinal() : objM.hashCode();
                            i5 = iRotateLeft;
                        } else {
                            i5 = iRotateLeft;
                            iHashCode = 0;
                        }
                    } else {
                        int i20 = iArr[iN2 * 5];
                        i5 = iRotateLeft;
                        iHashCode = (i20 != 207 || (objB = wj3Var3.b(iArr, iN2)) == null || objB.equals(Composer$Companion.getEmpty())) ? i20 : objB.hashCode();
                    }
                    if (iHashCode == 126665345) {
                        iRotateLeft = i5 ^ Integer.rotateLeft(iHashCode, i19);
                        break;
                    }
                    iRotateLeft = Integer.rotateLeft(this.F.h(iN2) ? 0 : I(iN2), i19) ^ (i5 ^ Integer.rotateLeft(iHashCode, i18));
                    i18 = (i18 + 6) % 32;
                    i19 = (i19 + 6) % 32;
                    iN2 = this.F.n(iN2);
                    i16 = i4;
                }
                this.P = iRotateLeft;
                this.J = null;
                boolean z4 = !this.x && w33Var.getReusing();
                if (z4) {
                    this.x = true;
                }
                w33Var.compose(this);
                if (z4) {
                    this.x = false;
                }
                tr1Var2 = null;
                this.J = null;
                wj3 wj3Var4 = this.F;
                int i21 = wj3Var4.b[i] + i6;
                int i22 = wj3Var4.g;
                if (i22 < i6 || i22 > i21) {
                    mk0.c("Index " + i6 + " is not a parent of " + i22);
                }
                wj3Var4.i = i6;
                wj3Var4.h = i21;
                wj3Var4.l = 0;
                wj3Var4.m = 0;
                i14 = i4;
                z3 = true;
                z = true;
            } else {
                i = i7;
                i2 = i9;
                tr1Var2 = null;
                ArrayList arrayList2 = this.D;
                arrayList2.add(w33Var);
                w33Var.rereadTrackedInstances();
                z = true;
                arrayList2.remove(arrayList2.size() - 1);
            }
            int iF3 = mk0.f(this.F.g, arrayList);
            if (iF3 < 0) {
                iF3 = -(iF3 + 1);
            }
            if (iF3 < arrayList.size()) {
                tr1Var = (tr1) arrayList.get(iF3);
                if (tr1Var.b >= i8) {
                    tr1Var = tr1Var2;
                }
            } else {
                tr1Var = tr1Var2;
            }
            i7 = i;
            i9 = i2;
        }
        int i23 = i9;
        if (z3) {
            O(i14, i6, i6);
            this.F.q();
            int iN3 = n0(i6);
            this.j = i23 + iN3;
            this.k = i11 + iN3;
            this.l = i12;
        } else {
            U();
        }
        this.P = i10;
        this.E = z2;
    }

    public final void M() {
        int i;
        Q(this.F.g);
        dk0 dk0Var = this.L;
        dk0Var.d(false);
        rq1 rq1Var = dk0Var.d;
        kk0 kk0Var = dk0Var.a;
        wj3 wj3Var = kk0Var.F;
        if (wj3Var.c > 0 && rq1Var.c(-2) != (i = wj3Var.i)) {
            if (!dk0Var.c && dk0Var.e) {
                dk0Var.d(false);
                dk0Var.b.k.S(kp2.c);
                dk0Var.c = true;
            }
            if (i > 0) {
                h8 h8VarA = wj3Var.a(i);
                rq1Var.e(i);
                dk0Var.d(false);
                hq2 hq2Var = dk0Var.b.k;
                hq2Var.S(jp2.c);
                xr0.q0(hq2Var, 0, h8VarA);
                dk0Var.c = true;
            }
        }
        dk0Var.b.k.S(rp2.c);
        int i2 = dk0Var.f;
        wj3 wj3Var2 = kk0Var.F;
        dk0Var.f = wj3Var2.b[(wj3Var2.g * 5) + 3] + i2;
    }

    public final void N(su2 su2Var) {
        dh2 dh2Var = this.u;
        if (dh2Var == null) {
            dh2Var = new dh2();
            this.u = dh2Var;
        }
        dh2Var.h(this.F.g, su2Var);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void O(int i, int i2, int i3) {
        wj3 wj3Var = this.F;
        if (i == i2) {
            i3 = i;
        } else if (i != i3 && i2 != i3) {
            if (wj3Var.n(i) == i2) {
                i3 = i2;
            } else if (wj3Var.n(i2) == i) {
                i3 = i;
            } else if (wj3Var.n(i) == wj3Var.n(i2)) {
                i3 = wj3Var.n(i);
            } else {
                int iN = i;
                int i4 = 0;
                while (iN > 0 && iN != i3) {
                    iN = wj3Var.n(iN);
                    i4++;
                }
                int iN2 = i2;
                int i5 = 0;
                while (iN2 > 0 && iN2 != i3) {
                    iN2 = wj3Var.n(iN2);
                    i5++;
                }
                int i6 = i4 - i5;
                int iN3 = i;
                for (int i7 = 0; i7 < i6; i7++) {
                    iN3 = wj3Var.n(iN3);
                }
                int i8 = i5 - i4;
                int iN4 = i2;
                for (int i9 = 0; i9 < i8; i9++) {
                    iN4 = wj3Var.n(iN4);
                }
                i3 = iN3;
                for (int iN5 = iN4; i3 != iN5; iN5 = wj3Var.n(iN5)) {
                    i3 = wj3Var.n(i3);
                }
            }
        }
        while (i > 0 && i != i3) {
            if (wj3Var.i(i)) {
                this.L.a();
            }
            i = wj3Var.n(i);
        }
        q(i2, i3);
    }

    public final Object P() {
        if (this.O) {
            if (this.q) {
                mk0.c("A call to createNode(), emitNode() or useNode() expected");
            }
            return Composer$Companion.getEmpty();
        }
        Object objJ = this.F.j();
        if (!this.x || (objJ instanceof gk0)) {
            return objJ instanceof b53 ? ((b53) objJ).a : objJ;
        }
        return Composer$Companion.getEmpty();
    }

    public final void Q(int i) {
        boolean zI = this.F.i(i);
        dk0 dk0Var = this.L;
        if (zI) {
            dk0Var.c();
            Object objK = this.F.k(i);
            dk0Var.c();
            dk0Var.h.add(objK);
        }
        R(this, i, zI, 0);
        dk0Var.c();
        if (zI) {
            dk0Var.a();
        }
    }

    public final boolean S(int i, boolean z) {
        return ((i & 1) == 0 && (this.O || this.x)) || z || !F();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ee  */
    public final void T() {
        int iRotateLeft;
        if (this.r.isEmpty()) {
            this.k = this.F.p() + this.k;
            return;
        }
        wj3 wj3Var = this.F;
        int iF = wj3Var.f();
        int[] iArr = wj3Var.b;
        int i = wj3Var.g;
        Object objM = i < wj3Var.h ? wj3Var.m(iArr, i) : null;
        Object objE = wj3Var.e();
        int i2 = this.l;
        if (objM == null) {
            if (objE == null || iF != 207 || objE.equals(Composer$Companion.getEmpty())) {
                iRotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ iF, 3) ^ i2;
            } else {
                this.P = Integer.rotateLeft(objE.hashCode() ^ Integer.rotateLeft(this.P, 3), 3) ^ i2;
            }
            Z(null, (iArr[(wj3Var.g * 5) + 1] & 1073741824) != 0);
            L();
            wj3Var.d();
            if (objM != null) {
                if (objM instanceof Enum) {
                    this.P = Integer.rotateRight(Integer.hashCode(((Enum) objM).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
                } else {
                    this.P = Integer.rotateRight(Integer.hashCode(objM.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
                }
            }
            if (objE == null && iF == 207 && !objE.equals(Composer$Companion.getEmpty())) {
                this.P = Integer.rotateRight(Integer.hashCode(objE.hashCode()) ^ Integer.rotateRight(this.P ^ i2, 3), 3);
                return;
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i2, 3) ^ Integer.hashCode(iF), 3);
            }
        }
        iRotateLeft = Integer.rotateLeft((objM instanceof Enum ? ((Enum) objM).ordinal() : objM.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        this.P = iRotateLeft;
        Z(null, (iArr[(wj3Var.g * 5) + 1] & 1073741824) != 0);
        L();
        wj3Var.d();
        if (objM != null) {
            if (objE == null) {
            }
            this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i2, 3) ^ Integer.hashCode(iF), 3);
        } else if (objM instanceof Enum) {
            this.P = Integer.rotateRight(Integer.hashCode(((Enum) objM).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
        } else {
            this.P = Integer.rotateRight(Integer.hashCode(objM.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
        }
    }

    public final void U() {
        wj3 wj3Var = this.F;
        int i = wj3Var.i;
        this.k = i >= 0 ? wj3Var.b[(i * 5) + 1] & 67108863 : 0;
        wj3Var.q();
    }

    public final void V() {
        if (this.k != 0) {
            mk0.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.O) {
            return;
        }
        w33 w33VarC = C();
        if (w33VarC != null) {
            w33VarC.scopeSkipped();
        }
        if (this.r.isEmpty()) {
            U();
        } else {
            L();
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0232 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x0234 A[LOOP:1: B:109:0x01e8->B:126:0x0234, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x0338  */
    /* JADX WARN: Code duplicated, block: B:173:0x034e  */
    /* JADX WARN: Code duplicated, block: B:176:0x0369  */
    /* JADX WARN: Code duplicated, block: B:177:0x0377 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0379 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:179:0x037b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0384  */
    /* JADX WARN: Code duplicated, block: B:183:0x0387  */
    /* JADX WARN: Code duplicated, block: B:187:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:188:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ba A[EDGE_INSN: B:197:0x02ba->B:155:0x02ba BREAK  A[LOOP:1: B:109:0x01e8->B:126:0x0234], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:26:0x0078  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x012f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0131  */
    /* JADX WARN: Code duplicated, block: B:76:0x0152  */
    /* JADX WARN: Code duplicated, block: B:78:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:82:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x017c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0180  */
    /* JADX WARN: Code duplicated, block: B:87:0x018d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0197  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a0  */
    public final void W(int i, int i2, Object obj, Object obj2) {
        int iRotateLeft;
        boolean z;
        boolean z2;
        ou2 ou2Var;
        ou2 ou2Var2;
        ArrayList arrayList;
        dh2 dh2Var;
        int i3;
        Object objValueOf;
        fi2 fi2Var;
        Object objG;
        vh2 vh2Var;
        bk3 bk3Var;
        int i4;
        int i5;
        int i6;
        int i7;
        Object[] objArr;
        int i8;
        Object[] objArr2;
        int i9;
        int i10;
        int i11;
        wj3 wj3Var;
        int[] iArr;
        ArrayList arrayList2;
        int i12;
        int i13;
        int i14;
        bk3 bk3Var2;
        int i15;
        ou2 ou2Var3;
        Object empty = obj;
        if (this.q) {
            mk0.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i16 = this.l;
        if (empty == null) {
            if (obj2 == null || i != 207 || obj2.equals(Composer$Companion.getEmpty())) {
                iRotateLeft = i16 ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i, 3);
            } else {
                this.P = i16 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(this.P, 3), 3);
            }
            if (empty == null) {
                this.l++;
            }
            if (i2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (this.O) {
                this.F.k++;
                bk3Var2 = this.H;
                i15 = bk3Var2.t;
                if (z) {
                    bk3Var2.O(i, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), true);
                } else if (obj2 != null) {
                    if (empty == null) {
                        empty = Composer$Companion.getEmpty();
                    }
                    bk3Var2.O(i, empty, obj2, false);
                } else {
                    if (empty == null) {
                        empty = Composer$Companion.getEmpty();
                    }
                    bk3Var2.O(i, empty, Composer$Companion.getEmpty(), false);
                }
                ou2Var3 = this.i;
                if (ou2Var3 != null) {
                    int i17 = (-2) - i15;
                    bv1 bv1Var = new bv1(-1, i, i17, -1);
                    ou2Var3.e.h(i17, new vg1(-1, this.j - ou2Var3.b, 0));
                    ou2Var3.d.add(bv1Var);
                }
                y(z, null);
                return;
            }
            if (i2 != 1 && this.x) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.i == null) {
                int iF = this.F.f();
                if (z2 && iF == i) {
                    wj3 wj3Var2 = this.F;
                    int i18 = wj3Var2.g;
                    if (kr1.n(empty, i18 < wj3Var2.h ? wj3Var2.m(wj3Var2.b, i18) : null)) {
                        Z(obj2, z);
                    } else {
                        wj3Var = this.F;
                        iArr = wj3Var.b;
                        arrayList2 = new ArrayList();
                        if (wj3Var.k <= 0) {
                            i12 = wj3Var.g;
                            while (i12 < wj3Var.h) {
                                int i19 = i12 * 5;
                                int i20 = iArr[i19];
                                Object objM = wj3Var.m(iArr, i12);
                                i13 = iArr[i19 + 1];
                                if ((i13 & 1073741824) != 0) {
                                    i14 = 1;
                                } else {
                                    i14 = i13 & 67108863;
                                }
                                arrayList2.add(new bv1(objM, i20, i12, i14));
                                i12 += iArr[i19 + 3];
                            }
                        }
                        this.i = new ou2(arrayList2, this.j);
                    }
                } else {
                    wj3Var = this.F;
                    iArr = wj3Var.b;
                    arrayList2 = new ArrayList();
                    if (wj3Var.k <= 0) {
                        i12 = wj3Var.g;
                        while (i12 < wj3Var.h) {
                            int i110 = i12 * 5;
                            int i21 = iArr[i110];
                            Object objM2 = wj3Var.m(iArr, i12);
                            i13 = iArr[i110 + 1];
                            if ((i13 & 1073741824) != 0) {
                                i14 = 1;
                            } else {
                                i14 = i13 & 67108863;
                            }
                            arrayList2.add(new bv1(objM2, i21, i12, i14));
                            i12 += iArr[i110 + 3];
                        }
                    }
                    this.i = new ou2(arrayList2, this.j);
                }
            }
            ou2Var = this.i;
            if (ou2Var != null) {
                arrayList = ou2Var.d;
                dh2Var = ou2Var.e;
                i3 = ou2Var.b;
                if (empty != null) {
                    objValueOf = new ps1(Integer.valueOf(i), empty);
                } else {
                    objValueOf = Integer.valueOf(i);
                }
                fi2Var = ((ug2) ou2Var.f.getValue()).a;
                objG = fi2Var.g(objValueOf);
                if (objG == null) {
                    objG = null;
                } else if (objG instanceof vh2) {
                    vh2Var = (vh2) objG;
                    Object objK = vh2Var.k(0);
                    if (vh2Var.d()) {
                        fi2Var.j(objValueOf);
                    }
                    if (vh2Var.b == 1) {
                        fi2Var.l(objValueOf, vh2Var.a());
                    }
                    objG = objK;
                } else {
                    fi2Var.j(objValueOf);
                }
                bv1 bv1Var2 = (bv1) objG;
                if (!z2 || bv1Var2 == null) {
                    this.F.k++;
                    this.O = true;
                    this.J = null;
                    if (this.H.w) {
                        bk3 bk3VarJ = this.G.j();
                        this.H = bk3VarJ;
                        bk3VarJ.J();
                        this.I = false;
                        this.J = null;
                    }
                    this.H.d();
                    bk3Var = this.H;
                    int i22 = bk3Var.t;
                    if (z) {
                        bk3Var.O(i, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), true);
                        i4 = 0;
                    } else if (obj2 != null) {
                        if (empty == null) {
                            empty = Composer$Companion.getEmpty();
                        }
                        i4 = 0;
                        bk3Var.O(i, empty, obj2, false);
                    } else {
                        i4 = 0;
                        if (empty == null) {
                            empty = Composer$Companion.getEmpty();
                        }
                        bk3Var.O(i, empty, Composer$Companion.getEmpty(), false);
                    }
                    this.M = this.H.b(i22);
                    int i23 = (-2) - i22;
                    bv1 bv1Var3 = new bv1(-1, i, i23, -1);
                    dh2Var.h(i23, new vg1(-1, this.j - i3, i4));
                    arrayList.add(bv1Var3);
                    ArrayList arrayList3 = new ArrayList();
                    if (z) {
                        i5 = i4;
                    } else {
                        i5 = this.j;
                    }
                    ou2Var2 = new ou2(arrayList3, i5);
                } else {
                    int i24 = bv1Var2.c;
                    arrayList.add(bv1Var2);
                    vg1 vg1Var = (vg1) dh2Var.b(i24);
                    this.j = (vg1Var != null ? vg1Var.b : -1) + i3;
                    vg1 vg1Var2 = (vg1) dh2Var.b(i24);
                    int i25 = vg1Var2 != null ? vg1Var2.a : -1;
                    int i26 = ou2Var.c;
                    int i27 = i25 - i26;
                    int i28 = 8;
                    if (i25 <= i26) {
                        i6 = i27;
                        if (i26 > i25) {
                            Object[] objArr3 = dh2Var.c;
                            long[] jArr = dh2Var.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i29 = 0;
                                while (true) {
                                    long j = jArr[i29];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i30 = 8 - ((~(i29 - length)) >>> 31);
                                        int i31 = 0;
                                        while (i31 < i30) {
                                            if ((j & 255) < 128) {
                                                vg1 vg1Var3 = (vg1) objArr3[(i29 << 3) + i31];
                                                objArr2 = objArr3;
                                                int i32 = vg1Var3.a;
                                                if (i32 == i25) {
                                                    vg1Var3.a = i26;
                                                    i8 = i25;
                                                } else {
                                                    i8 = i25;
                                                    if (i8 + 1 <= i32 && i32 < i26) {
                                                        vg1Var3.a = i32 - 1;
                                                    }
                                                }
                                            } else {
                                                i8 = i25;
                                                objArr2 = objArr3;
                                            }
                                            j >>= 8;
                                            i31++;
                                            objArr3 = objArr2;
                                            i25 = i8;
                                        }
                                        i7 = i25;
                                        objArr = objArr3;
                                        if (i30 != 8) {
                                            break;
                                        }
                                    } else {
                                        i7 = i25;
                                        objArr = objArr3;
                                    }
                                    if (i29 == length) {
                                        break;
                                    }
                                    i29++;
                                    objArr3 = objArr;
                                    i25 = i7;
                                }
                            }
                        }
                    } else {
                        Object[] objArr4 = dh2Var.c;
                        long[] jArr2 = dh2Var.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i33 = 0;
                            while (true) {
                                long j2 = jArr2[i33];
                                i6 = i27;
                                Object[] objArr5 = objArr4;
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i33 != length2) {
                                        break;
                                        break;
                                    }
                                    i33++;
                                    i27 = i6;
                                    objArr4 = objArr5;
                                    i28 = 8;
                                } else {
                                    int i34 = 8 - ((~(i33 - length2)) >>> 31);
                                    int i35 = 0;
                                    while (i35 < i34) {
                                        if ((j2 & 255) < 128) {
                                            i11 = i28;
                                            vg1 vg1Var4 = (vg1) objArr5[(i33 << 3) + i35];
                                            i10 = i35;
                                            int i36 = vg1Var4.a;
                                            if (i36 == i25) {
                                                vg1Var4.a = i26;
                                            } else if (i26 <= i36 && i36 < i25) {
                                                vg1Var4.a = i36 + 1;
                                            }
                                        } else {
                                            i10 = i35;
                                            i11 = i28;
                                        }
                                        j2 >>= i11;
                                        i35 = i10 + 1;
                                        i28 = i11;
                                    }
                                    if (i34 != i28) {
                                        break;
                                    }
                                    if (i33 != length2) {
                                        break;
                                    }
                                    i33++;
                                    i27 = i6;
                                    objArr4 = objArr5;
                                    i28 = 8;
                                }
                            }
                        } else {
                            i6 = i27;
                        }
                    }
                    dk0 dk0Var = this.L;
                    int i37 = dk0Var.f;
                    kk0 kk0Var = dk0Var.a;
                    dk0Var.f = (i24 - kk0Var.F.g) + i37;
                    this.F.o(i24);
                    if (i6 > 0) {
                        dk0Var.d(false);
                        rq1 rq1Var = dk0Var.d;
                        wj3 wj3Var3 = kk0Var.F;
                        if (wj3Var3.c > 0 && rq1Var.c(-2) != (i9 = wj3Var3.i)) {
                            if (!dk0Var.c && dk0Var.e) {
                                dk0Var.d(false);
                                dk0Var.b.k.S(kp2.c);
                                dk0Var.c = true;
                            }
                            if (i9 > 0) {
                                h8 h8VarA = wj3Var3.a(i9);
                                rq1Var.e(i9);
                                dk0Var.d(false);
                                hq2 hq2Var = dk0Var.b.k;
                                hq2Var.S(jp2.c);
                                xr0.q0(hq2Var, 0, h8VarA);
                                dk0Var.c = true;
                            }
                        }
                        hq2 hq2Var2 = dk0Var.b.k;
                        hq2Var2.S(op2.c);
                        hq2Var2.m[hq2Var2.n - hq2Var2.k[hq2Var2.l - 1].a] = i6;
                    }
                    Z(obj2, z);
                    ou2Var2 = null;
                }
            } else {
                ou2Var2 = null;
            }
            y(z, ou2Var2);
        }
        iRotateLeft = Integer.rotateLeft((empty instanceof Enum ? ((Enum) empty).ordinal() : empty.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        this.P = iRotateLeft;
        if (empty == null) {
            this.l++;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.O) {
            this.F.k++;
            bk3Var2 = this.H;
            i15 = bk3Var2.t;
            if (z) {
                bk3Var2.O(i, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), true);
            } else if (obj2 != null) {
                if (empty == null) {
                    empty = Composer$Companion.getEmpty();
                }
                bk3Var2.O(i, empty, obj2, false);
            } else {
                if (empty == null) {
                    empty = Composer$Companion.getEmpty();
                }
                bk3Var2.O(i, empty, Composer$Companion.getEmpty(), false);
            }
            ou2Var3 = this.i;
            if (ou2Var3 != null) {
                int i111 = (-2) - i15;
                bv1 bv1Var4 = new bv1(-1, i, i111, -1);
                ou2Var3.e.h(i111, new vg1(-1, this.j - ou2Var3.b, 0));
                ou2Var3.d.add(bv1Var4);
            }
            y(z, null);
            return;
        }
        if (i2 != 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.i == null) {
            int iF2 = this.F.f();
            if (z2) {
                wj3Var = this.F;
                iArr = wj3Var.b;
                arrayList2 = new ArrayList();
                if (wj3Var.k <= 0) {
                    i12 = wj3Var.g;
                    while (i12 < wj3Var.h) {
                        int i112 = i12 * 5;
                        int i210 = iArr[i112];
                        Object objM3 = wj3Var.m(iArr, i12);
                        i13 = iArr[i112 + 1];
                        if ((i13 & 1073741824) != 0) {
                            i14 = 1;
                        } else {
                            i14 = i13 & 67108863;
                        }
                        arrayList2.add(new bv1(objM3, i210, i12, i14));
                        i12 += iArr[i112 + 3];
                    }
                }
                this.i = new ou2(arrayList2, this.j);
            } else {
                wj3Var = this.F;
                iArr = wj3Var.b;
                arrayList2 = new ArrayList();
                if (wj3Var.k <= 0) {
                    i12 = wj3Var.g;
                    while (i12 < wj3Var.h) {
                        int i113 = i12 * 5;
                        int i211 = iArr[i113];
                        Object objM4 = wj3Var.m(iArr, i12);
                        i13 = iArr[i113 + 1];
                        if ((i13 & 1073741824) != 0) {
                            i14 = 1;
                        } else {
                            i14 = i13 & 67108863;
                        }
                        arrayList2.add(new bv1(objM4, i211, i12, i14));
                        i12 += iArr[i113 + 3];
                    }
                }
                this.i = new ou2(arrayList2, this.j);
            }
        }
        ou2Var = this.i;
        if (ou2Var != null) {
            arrayList = ou2Var.d;
            dh2Var = ou2Var.e;
            i3 = ou2Var.b;
            if (empty != null) {
                objValueOf = new ps1(Integer.valueOf(i), empty);
            } else {
                objValueOf = Integer.valueOf(i);
            }
            fi2Var = ((ug2) ou2Var.f.getValue()).a;
            objG = fi2Var.g(objValueOf);
            if (objG == null) {
                objG = null;
            } else if (objG instanceof vh2) {
                vh2Var = (vh2) objG;
                Object objK2 = vh2Var.k(0);
                if (vh2Var.d()) {
                    fi2Var.j(objValueOf);
                }
                if (vh2Var.b == 1) {
                    fi2Var.l(objValueOf, vh2Var.a());
                }
                objG = objK2;
            } else {
                fi2Var.j(objValueOf);
            }
            bv1 bv1Var5 = (bv1) objG;
            if (z2) {
            }
            this.F.k++;
            this.O = true;
            this.J = null;
            if (this.H.w) {
                bk3 bk3VarJ2 = this.G.j();
                this.H = bk3VarJ2;
                bk3VarJ2.J();
                this.I = false;
                this.J = null;
            }
            this.H.d();
            bk3Var = this.H;
            int i212 = bk3Var.t;
            if (z) {
                bk3Var.O(i, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), true);
                i4 = 0;
            } else if (obj2 != null) {
                if (empty == null) {
                    empty = Composer$Companion.getEmpty();
                }
                i4 = 0;
                bk3Var.O(i, empty, obj2, false);
            } else {
                i4 = 0;
                if (empty == null) {
                    empty = Composer$Companion.getEmpty();
                }
                bk3Var.O(i, empty, Composer$Companion.getEmpty(), false);
            }
            this.M = this.H.b(i212);
            int i213 = (-2) - i212;
            bv1 bv1Var6 = new bv1(-1, i, i213, -1);
            dh2Var.h(i213, new vg1(-1, this.j - i3, i4));
            arrayList.add(bv1Var6);
            ArrayList arrayList4 = new ArrayList();
            if (z) {
                i5 = i4;
            } else {
                i5 = this.j;
            }
            ou2Var2 = new ou2(arrayList4, i5);
        } else {
            ou2Var2 = null;
        }
        y(z, ou2Var2);
    }

    public final void X() {
        W(-127, 0, null, null);
    }

    public final void Y(int i, vo2 vo2Var) {
        W(i, 0, vo2Var, null);
    }

    public final void Z(Object obj, boolean z) {
        if (z) {
            wj3 wj3Var = this.F;
            if (wj3Var.k <= 0) {
                if ((wj3Var.b[(wj3Var.g * 5) + 1] & 1073741824) == 0) {
                    zx2.a("Expected a node group");
                }
                wj3Var.r();
                return;
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            dk0 dk0Var = this.L;
            dk0Var.getClass();
            dk0Var.d(false);
            hq2 hq2Var = dk0Var.b.k;
            hq2Var.S(aq2.c);
            xr0.q0(hq2Var, 0, obj);
        }
        this.F.r();
    }

    public final void a() {
        k();
        this.h.clear();
        this.m.b = 0;
        this.s.b = 0;
        this.w.b = 0;
        this.u = null;
        u71 u71Var = this.N;
        u71Var.l.O();
        u71Var.k.O();
        this.P = 0;
        this.z = 0;
        this.q = false;
        this.O = false;
        this.x = false;
        this.E = false;
        this.y = -1;
        wj3 wj3Var = this.F;
        if (!wj3Var.f) {
            wj3Var.c();
        }
        if (this.H.w) {
            return;
        }
        z();
    }

    public final void a0(int i) {
        int i2;
        int i3;
        if (this.i != null) {
            W(i, 0, null, null);
            return;
        }
        if (this.q) {
            mk0.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.P = this.l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i, 3);
        this.l++;
        wj3 wj3Var = this.F;
        if (this.O) {
            wj3Var.k++;
            this.H.O(i, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), false);
            y(false, null);
            return;
        }
        if (wj3Var.f() == i && ((i3 = wj3Var.g) >= wj3Var.h || (wj3Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            wj3Var.r();
            y(false, null);
            return;
        }
        if (wj3Var.k <= 0 && (i2 = wj3Var.g) != wj3Var.h) {
            int i4 = this.j;
            M();
            this.L.e(i4, wj3Var.p());
            mk0.a(this.r, i2, wj3Var.g);
        }
        wj3Var.k++;
        this.O = true;
        this.J = null;
        if (this.H.w) {
            bk3 bk3VarJ = this.G.j();
            this.H = bk3VarJ;
            bk3VarJ.J();
            this.I = false;
            this.J = null;
        }
        bk3 bk3Var = this.H;
        bk3Var.d();
        int i5 = bk3Var.t;
        bk3Var.O(i, Composer$Companion.getEmpty(), Composer$Companion.getEmpty(), false);
        this.M = bk3Var.b(i5);
        y(false, null);
    }

    public final void b0(int i) {
        W(i, 0, null, null);
    }

    public final void c(Object obj, ne1 ne1Var) {
        if (this.O) {
            hq2 hq2Var = this.N.k;
            hq2Var.S(bq2.c);
            xr0.q0(hq2Var, 0, obj);
            ne1Var.getClass();
            y64.l(2, ne1Var);
            xr0.q0(hq2Var, 1, ne1Var);
            return;
        }
        dk0 dk0Var = this.L;
        dk0Var.b();
        hq2 hq2Var2 = dk0Var.b.k;
        hq2Var2.S(bq2.c);
        ne1Var.getClass();
        y64.l(2, ne1Var);
        xr0.r0(hq2Var2, 0, obj, 1, ne1Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    public final kk0 c0(int i) {
        w33 w33Var;
        boolean z;
        a0(i);
        boolean z2 = this.O;
        ArrayList arrayList = this.D;
        tk0 tk0Var = this.g;
        if (z2) {
            w33 w33Var2 = new w33(tk0Var);
            arrayList.add(w33Var2);
            m0(w33Var2);
            w33Var2.start(this.A);
            return this;
        }
        int i2 = this.F.i;
        ArrayList arrayList2 = this.r;
        int iF = mk0.f(i2, arrayList2);
        tr1 tr1Var = iF >= 0 ? (tr1) arrayList2.remove(iF) : null;
        Object objJ = this.F.j();
        if (kr1.n(objJ, Composer$Companion.getEmpty())) {
            w33Var = new w33(tk0Var);
            m0(w33Var);
        } else {
            objJ.getClass();
            w33Var = (w33) objJ;
        }
        if (tr1Var != null) {
            z = true;
        } else {
            boolean forcedRecompose = w33Var.getForcedRecompose();
            if (forcedRecompose) {
                w33Var.setForcedRecompose(false);
            }
            if (forcedRecompose) {
                z = true;
            } else {
                z = false;
            }
        }
        w33Var.setRequiresRecompose(z);
        arrayList.add(w33Var);
        w33Var.start(this.A);
        if (w33Var.getPaused()) {
            w33Var.setPaused(false);
            w33Var.setResuming(true);
            hq2 hq2Var = this.L.b.k;
            hq2Var.S(wp2.c);
            xr0.q0(hq2Var, 0, w33Var);
        }
        return this;
    }

    public final hk0 d() {
        kk0 kk0Var;
        Y(206, mk0.e);
        if (this.O) {
            bk3.x(this.H);
        }
        Object objH = H();
        gk0 gk0Var = objH instanceof gk0 ? (gk0) objH : null;
        if (gk0Var == null) {
            kk0Var = this;
            gk0Var = new gk0(new hk0(kk0Var, this.P, this.p, this.B, this.g.z));
            kk0Var.m0(gk0Var);
        } else {
            kk0Var = this;
        }
        hk0 hk0Var = gk0Var.c;
        hk0Var.f.setValue(kk0Var.n());
        kk0Var.r(false);
        return hk0Var;
    }

    public final void d0(Object obj) {
        if (!this.O && this.F.f() == 207 && !kr1.n(this.F.e(), obj) && this.y < 0) {
            this.y = this.F.g;
            this.x = true;
        }
        W(207, 0, null, obj);
    }

    public final boolean e(float f) {
        Object objH = H();
        if ((objH instanceof Float) && f == ((Number) objH).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f));
        return true;
    }

    public final void e0() {
        W(125, 2, null, null);
        this.q = true;
    }

    public final boolean f(int i) {
        Object objH = H();
        if ((objH instanceof Integer) && i == ((Number) objH).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i));
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f0() {
        this.l = 0;
        this.F = this.c.g();
        W(100, 0, null, null);
        qk0 qk0Var = this.b;
        qk0Var.n();
        this.t = qk0Var.f();
        this.w.e(this.v ? 1 : 0);
        this.v = h(this.t);
        this.J = null;
        if (!this.p) {
            this.p = qk0Var.d();
        }
        if (!this.B) {
            this.B = qk0Var.e();
        }
        Set set = (Set) yo4.O(this.t, vp1.a);
        if (set != null) {
            sk0 sk0Var = this.Q;
            if (sk0Var == null) {
                sk0Var = new sk0(this.g);
                this.Q = sk0Var;
            }
            set.add(sk0Var);
            qk0Var.k(set);
        }
        W(qk0Var.g(), 0, null, null);
    }

    public final boolean g(long j) {
        Object objH = H();
        if ((objH instanceof Long) && j == ((Number) objH).longValue()) {
            return false;
        }
        m0(Long.valueOf(j));
        return true;
    }

    public final boolean g0(w33 w33Var, Object obj) {
        h8 anchor = w33Var.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iB = this.F.a.b(anchor);
        if (!this.E || iB < this.F.g) {
            return false;
        }
        ArrayList arrayList = this.r;
        int iF = mk0.f(iB, arrayList);
        if (iF < 0) {
            int i = -(iF + 1);
            if (!(obj instanceof gv0)) {
                obj = null;
            }
            arrayList.add(i, new tr1(w33Var, iB, obj));
            return true;
        }
        tr1 tr1Var = (tr1) arrayList.get(iF);
        if (!(obj instanceof gv0)) {
            tr1Var.c = null;
            return true;
        }
        Object obj2 = tr1Var.c;
        if (obj2 == null) {
            tr1Var.c = obj;
            return true;
        }
        if (obj2 instanceof gi2) {
            ((gi2) obj2).a(obj);
            return true;
        }
        int i2 = sa3.a;
        gi2 gi2Var = new gi2(2);
        gi2Var.k(obj2);
        gi2Var.k(obj);
        tr1Var.c = gi2Var;
        return true;
    }

    public final boolean h(Object obj) {
        if (kr1.n(H(), obj)) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d A[LOOP:0: B:5:0x000f->B:20:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0060 A[EDGE_INSN: B:24:0x0060->B:21:0x0060 BREAK  A[LOOP:0: B:5:0x000f->B:20:0x005d], SYNTHETIC] */
    public final void h0(fi2 fi2Var) {
        Object[] objArr = fi2Var.b;
        Object[] objArr2 = fi2Var.c;
        long[] jArr = fi2Var.a;
        int length = jArr.length - 2;
        ArrayList arrayList = this.r;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            obj.getClass();
                            w33 w33Var = (w33) obj;
                            h8 anchor = w33Var.getAnchor();
                            if (anchor != null) {
                                int i5 = anchor.a;
                                if (obj2 == bg1.y) {
                                    obj2 = null;
                                }
                                arrayList.add(new tr1(w33Var, i5, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        oe0.r0(arrayList, mk0.f);
    }

    public final boolean i(boolean z) {
        Object objH = H();
        if ((objH instanceof Boolean) && z == ((Boolean) objH).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z));
        return true;
    }

    public final void i0(int i, int i2) {
        if (n0(i) != i2) {
            if (i < 0) {
                bh2 bh2Var = this.o;
                if (bh2Var == null) {
                    bh2Var = new bh2();
                    this.o = bh2Var;
                }
                bh2Var.f(i, i2);
                return;
            }
            int[] iArr = this.n;
            if (iArr == null) {
                int i3 = this.F.c;
                int[] iArr2 = new int[i3];
                Arrays.fill(iArr2, 0, i3, -1);
                this.n = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i2;
        }
    }

    public final boolean j(Object obj) {
        if (H() == obj) {
            return false;
        }
        m0(obj);
        return true;
    }

    public final void j0(int i, int i2) {
        int iN0 = n0(i);
        if (iN0 != i2) {
            int i3 = i2 - iN0;
            ArrayList arrayList = this.h;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iN1 = n0(i) + i3;
                i0(i, iN1);
                for (int i4 = size; -1 < i4; i4--) {
                    ou2 ou2Var = (ou2) arrayList.get(i4);
                    if (ou2Var != null && ou2Var.a(i, iN1)) {
                        size = i4 - 1;
                        break;
                    }
                }
                wj3 wj3Var = this.F;
                if (i < 0) {
                    i = wj3Var.i;
                } else if (wj3Var.i(i)) {
                    return;
                } else {
                    i = this.F.n(i);
                }
            }
        }
    }

    public final void k() {
        this.i = null;
        this.j = 0;
        this.k = 0;
        this.P = 0;
        this.q = false;
        dk0 dk0Var = this.L;
        dk0Var.c = false;
        dk0Var.d.b = 0;
        dk0Var.f = 0;
        this.D.clear();
        this.n = null;
        this.o = null;
    }

    public final su2 k0(su2 su2Var, su2 su2Var2) {
        su2Var.getClass();
        ru2 ru2Var = new ru2(su2Var);
        ru2Var.putAll(su2Var2);
        su2 su2VarA = ru2Var.a();
        Y(204, mk0.d);
        H();
        m0(su2VarA);
        H();
        m0(su2Var2);
        r(false);
        return su2VarA;
    }

    public final Object l(vk0 vk0Var) {
        return yo4.O(n(), vk0Var);
    }

    public final void l0(Object obj) {
        int i;
        wj3 wj3Var;
        int i2;
        bk3 bk3Var;
        if (obj instanceof a53) {
            a53 a53Var = (a53) obj;
            h8 h8VarA = null;
            if (this.O) {
                bk3 bk3Var2 = this.H;
                int i3 = bk3Var2.t;
                if (i3 > bk3Var2.v + 1) {
                    int i4 = i3 - 1;
                    int iC = bk3Var2.C(bk3Var2.b, i4);
                    while (true) {
                        i2 = i4;
                        i4 = iC;
                        bk3Var = this.H;
                        if (i4 == bk3Var.v || i4 < 0) {
                            break;
                        } else {
                            iC = bk3Var.C(bk3Var.b, i4);
                        }
                    }
                    h8VarA = bk3Var.b(i2);
                }
            } else {
                wj3 wj3Var2 = this.F;
                int i5 = wj3Var2.g;
                if (i5 > wj3Var2.i + 1) {
                    int i6 = i5 - 1;
                    int iN = wj3Var2.n(i6);
                    while (true) {
                        i = i6;
                        i6 = iN;
                        wj3Var = this.F;
                        if (i6 == wj3Var.i || i6 < 0) {
                            break;
                        } else {
                            iN = wj3Var.n(i6);
                        }
                    }
                    h8VarA = wj3Var.a(i);
                }
            }
            b53 b53Var = new b53(a53Var, h8VarA);
            if (this.O) {
                hq2 hq2Var = this.L.b.k;
                hq2Var.S(qp2.c);
                xr0.q0(hq2Var, 0, b53Var);
            }
            this.d.add(obj);
            obj = b53Var;
        }
        m0(obj);
    }

    public final void m(je1 je1Var) {
        if (!this.q) {
            mk0.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (!this.O) {
            mk0.c("createNode() can only be called when inserting");
        }
        rq1 rq1Var = this.m;
        int i = rq1Var.a[rq1Var.b - 1];
        bk3 bk3Var = this.H;
        h8 h8VarB = bk3Var.b(bk3Var.v);
        this.k++;
        u71 u71Var = this.N;
        hq2 hq2Var = u71Var.k;
        hq2Var.S(lp2.d);
        xr0.q0(hq2Var, 0, je1Var);
        hq2Var.m[hq2Var.n - hq2Var.k[hq2Var.l - 1].a] = i;
        xr0.q0(hq2Var, 1, h8VarB);
        hq2 hq2Var2 = u71Var.l;
        hq2Var2.S(lp2.e);
        hq2Var2.m[hq2Var2.n - hq2Var2.k[hq2Var2.l - 1].a] = i;
        xr0.q0(hq2Var2, 0, h8VarB);
    }

    public final void m0(Object obj) {
        if (this.O) {
            bk3 bk3Var = this.H;
            if (bk3Var.n <= 0 || bk3Var.i == bk3Var.k) {
                bk3Var.D(obj);
                return;
            }
            dh2 dh2Var = bk3Var.s;
            if (dh2Var == null) {
                dh2Var = new dh2();
            }
            bk3Var.s = dh2Var;
            int i = bk3Var.v;
            Object objB = dh2Var.b(i);
            if (objB == null) {
                objB = new vh2();
                dh2Var.h(i, objB);
            }
            ((vh2) objB).g(obj);
            return;
        }
        wj3 wj3Var = this.F;
        boolean z = wj3Var.n;
        dk0 dk0Var = this.L;
        if (!z) {
            h8 h8VarA = wj3Var.a(wj3Var.i);
            hq2 hq2Var = dk0Var.b.k;
            hq2Var.S(yo2.c);
            xr0.r0(hq2Var, 0, h8VarA, 1, obj);
            return;
        }
        int iB = (wj3Var.l - ak3.b(wj3Var.b, wj3Var.i)) - 1;
        if (dk0Var.a.F.i - dk0Var.f >= 0) {
            dk0Var.d(true);
            hq2 hq2Var2 = dk0Var.b.k;
            hq2Var2.S(lp2.g);
            xr0.q0(hq2Var2, 0, obj);
            hq2Var2.m[hq2Var2.n - hq2Var2.k[hq2Var2.l - 1].a] = iB;
            return;
        }
        wj3 wj3Var2 = this.F;
        h8 h8VarA2 = wj3Var2.a(wj3Var2.i);
        hq2 hq2Var3 = dk0Var.b.k;
        hq2Var3.S(lp2.f);
        xr0.r0(hq2Var3, 0, obj, 1, h8VarA2);
        hq2Var3.m[hq2Var3.n - hq2Var3.k[hq2Var3.l - 1].a] = iB;
    }

    public final su2 n() {
        su2 su2Var;
        su2 su2Var2 = this.J;
        if (su2Var2 != null) {
            return su2Var2;
        }
        int iN = this.F.i;
        boolean z = this.O;
        vo2 vo2Var = mk0.c;
        if (z && this.I) {
            int iC = this.H.v;
            while (iC > 0) {
                bk3 bk3Var = this.H;
                if (bk3Var.b[bk3Var.q(iC) * 5] == 202 && kr1.n(this.H.r(iC), vo2Var)) {
                    Object objP = this.H.p(iC);
                    objP.getClass();
                    su2 su2Var3 = (su2) objP;
                    this.J = su2Var3;
                    return su2Var3;
                }
                bk3 bk3Var2 = this.H;
                iC = bk3Var2.C(bk3Var2.b, iC);
            }
        }
        if (this.F.c > 0) {
            while (iN > 0) {
                wj3 wj3Var = this.F;
                int[] iArr = wj3Var.b;
                if (iArr[iN * 5] == 202 && kr1.n(wj3Var.m(iArr, iN), vo2Var)) {
                    dh2 dh2Var = this.u;
                    if (dh2Var == null || (su2Var = (su2) dh2Var.b(iN)) == null) {
                        wj3 wj3Var2 = this.F;
                        Object objB = wj3Var2.b(wj3Var2.b, iN);
                        objB.getClass();
                        su2Var = (su2) objB;
                    }
                    this.J = su2Var;
                    return su2Var;
                }
                iN = this.F.n(iN);
            }
        }
        su2 su2Var4 = this.t;
        this.J = su2Var4;
        return su2Var4;
    }

    public final int n0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.n;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.F.l(i) : i2;
        }
        bh2 bh2Var = this.o;
        if (bh2Var != null && bh2Var.c(i) >= 0) {
            int iC = bh2Var.c(i);
            if (iC >= 0) {
                return bh2Var.c[iC];
            }
            j93.g(ud2.m(i, "Cannot find value for key "));
        }
        return 0;
    }

    public final void o(boolean z) {
        if (this.k != 0) {
            mk0.c("No nodes can be emitted before calling dactivateToEndGroup");
        }
        if (this.O) {
            return;
        }
        if (!z) {
            U();
            return;
        }
        wj3 wj3Var = this.F;
        int i = wj3Var.g;
        int i2 = wj3Var.h;
        dk0 dk0Var = this.L;
        dk0Var.getClass();
        dk0Var.d(false);
        dk0Var.b.k.S(cp2.c);
        mk0.a(this.r, i, i2);
        this.F.q();
    }

    public final void o0() {
        if (!this.q) {
            mk0.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.q = false;
        if (this.O) {
            mk0.c("useNode() called while inserting");
        }
        wj3 wj3Var = this.F;
        Object objK = wj3Var.k(wj3Var.i);
        dk0 dk0Var = this.L;
        dk0Var.c();
        dk0Var.h.add(objK);
        if (this.x && (objK instanceof vj0)) {
            dk0Var.b();
            dk0Var.b.k.S(dq2.c);
        }
    }

    public final void p(fi2 fi2Var, yg0 yg0Var) {
        ArrayList arrayList = this.r;
        if (this.E) {
            mk0.c("Reentrant composition is not supported");
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = Long.hashCode(vk3.k().g());
            this.u = null;
            h0(fi2Var);
            this.j = 0;
            this.E = true;
            try {
                f0();
                Object objH = H();
                if (objH != yg0Var && yg0Var != null) {
                    m0(yg0Var);
                }
                ik0 ik0Var = this.C;
                oi2 oi2VarA = cl3.a();
                try {
                    oi2VarA.c(ik0Var);
                    vo2 vo2Var = mk0.a;
                    if (yg0Var != null) {
                        Y(200, vo2Var);
                        yh4.E(this, yg0Var);
                        r(false);
                    } else if (!this.v || objH == null || objH.equals(Composer$Companion.getEmpty())) {
                        T();
                    } else {
                        Y(200, vo2Var);
                        y64.l(2, objH);
                        yh4.E(this, (ne1) objH);
                        r(false);
                    }
                    oi2VarA.m(oi2VarA.h - 1);
                    x();
                    this.E = false;
                    arrayList.clear();
                    if (!this.H.w) {
                        mk0.c("Check failed");
                    }
                    z();
                    Trace.endSection();
                } catch (Throwable th) {
                    oi2VarA.m(oi2VarA.h - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                this.E = false;
                arrayList.clear();
                a();
                if (!this.H.w) {
                    mk0.c("Check failed");
                }
                z();
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final void q(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        q(this.F.n(i), i2);
        if (this.F.i(i)) {
            Object objK = this.F.k(i);
            dk0 dk0Var = this.L;
            dk0Var.c();
            dk0Var.h.add(objK);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:201:0x051f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    public final void r(boolean z) {
        int iHashCode;
        rq1 rq1Var;
        ArrayList arrayList;
        int i;
        ?? r3;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        rq1 rq1Var2;
        int i7;
        LinkedHashSet linkedHashSet;
        int i8;
        int i9;
        ArrayList arrayList2;
        ArrayList arrayList3;
        HashSet hashSet;
        int i10;
        int i11;
        Object[] objArr;
        long[] jArr;
        int i12;
        Object[] objArr2;
        long[] jArr2;
        int i13;
        Object[] objArr3;
        long[] jArr3;
        int i14;
        Object[] objArr4;
        long[] jArr4;
        int iHashCode2;
        rq1 rq1Var3 = this.m;
        int i15 = rq1Var3.a[rq1Var3.b - 2] - 1;
        if (this.O) {
            bk3 bk3Var = this.H;
            int i16 = bk3Var.v;
            int i17 = bk3Var.b[bk3Var.q(i16) * 5];
            Object objR = this.H.r(i16);
            Object objP = this.H.p(i16);
            if (objR != null) {
                iHashCode2 = Integer.hashCode(objR instanceof Enum ? ((Enum) objR).ordinal() : objR.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (objP == null || i17 != 207 || objP.equals(Composer$Companion.getEmpty())) {
                iHashCode2 = Integer.rotateRight(i15 ^ this.P, 3) ^ Integer.hashCode(i17);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i15 ^ this.P, 3) ^ Integer.hashCode(objP.hashCode()), 3);
            }
            this.P = Integer.rotateRight(iHashCode2, 3);
        } else {
            wj3 wj3Var = this.F;
            int i18 = wj3Var.i;
            int[] iArr = wj3Var.b;
            int i19 = iArr[i18 * 5];
            Object objM = wj3Var.m(iArr, i18);
            wj3 wj3Var2 = this.F;
            Object objB = wj3Var2.b(wj3Var2.b, i18);
            if (objM != null) {
                iHashCode = Integer.hashCode(objM instanceof Enum ? ((Enum) objM).ordinal() : objM.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (objB == null || i19 != 207 || objB.equals(Composer$Companion.getEmpty())) {
                iHashCode = Integer.rotateRight(i15 ^ this.P, 3) ^ Integer.hashCode(i19);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i15 ^ this.P, 3) ^ Integer.hashCode(objB.hashCode()), 3);
            }
            this.P = Integer.rotateRight(iHashCode, 3);
        }
        int i20 = this.k;
        ou2 ou2Var = this.i;
        ArrayList arrayList4 = this.r;
        dk0 dk0Var = this.L;
        if (ou2Var != null) {
            dh2 dh2Var = ou2Var.e;
            int i21 = ou2Var.b;
            ArrayList arrayList5 = ou2Var.a;
            if (arrayList5.size() > 0) {
                ArrayList arrayList6 = ou2Var.d;
                HashSet hashSet2 = new HashSet(arrayList6.size());
                int size = arrayList6.size();
                for (int i22 = 0; i22 < size; i22++) {
                    hashSet2.add(arrayList6.get(i22));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList6.size();
                int size3 = arrayList5.size();
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                while (i23 < size3) {
                    bv1 bv1Var = (bv1) arrayList5.get(i23);
                    if (hashSet2.contains(bv1Var)) {
                        rq1Var2 = rq1Var3;
                        i7 = i23;
                        if (!linkedHashSet2.contains(bv1Var)) {
                            int i26 = i24;
                            if (i26 < size2) {
                                bv1 bv1Var2 = (bv1) arrayList6.get(i26);
                                if (bv1Var2 != bv1Var) {
                                    vg1 vg1Var = (vg1) dh2Var.b(bv1Var2.c);
                                    int i27 = vg1Var != null ? vg1Var.b : -1;
                                    linkedHashSet2.add(bv1Var2);
                                    i10 = i25;
                                    if (i27 != i10) {
                                        vg1 vg1Var2 = (vg1) dh2Var.b(bv1Var2.c);
                                        int i28 = vg1Var2 != null ? vg1Var2.c : bv1Var2.d;
                                        linkedHashSet = linkedHashSet2;
                                        int i29 = i27 + i21;
                                        i8 = size2;
                                        int i30 = i10 + i21;
                                        if (i28 > 0) {
                                            i9 = i21;
                                            int i31 = dk0Var.l;
                                            if (i31 > 0) {
                                                arrayList2 = arrayList5;
                                                if (dk0Var.j == i29 - i31 && dk0Var.k == i30 - i31) {
                                                    dk0Var.l = i31 + i28;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                            dk0Var.c();
                                            dk0Var.j = i29;
                                            dk0Var.k = i30;
                                            dk0Var.l = i28;
                                        } else {
                                            i9 = i21;
                                            arrayList2 = arrayList5;
                                            dk0Var.getClass();
                                        }
                                        if (i27 <= i10) {
                                            int i32 = i28;
                                            arrayList4 = arrayList4;
                                            arrayList3 = arrayList6;
                                            hashSet = hashSet2;
                                            if (i10 > i27) {
                                                Object[] objArr5 = dh2Var.c;
                                                long[] jArr5 = dh2Var.a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i33 = 0;
                                                    while (true) {
                                                        long j = jArr5[i33];
                                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i34 = 8 - ((~(i33 - length)) >>> 31);
                                                            int i35 = 0;
                                                            while (i35 < i34) {
                                                                if ((j & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    vg1 vg1Var3 = (vg1) objArr5[(i33 << 3) + i35];
                                                                    jArr2 = jArr5;
                                                                    int i36 = vg1Var3.b;
                                                                    i13 = i27;
                                                                    if (i27 <= i36 && i36 < i13 + i32) {
                                                                        vg1Var3.b = (i36 - i13) + i10;
                                                                    } else if (i13 + 1 <= i36 && i36 < i10) {
                                                                        vg1Var3.b = i36 - i32;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i13 = i27;
                                                                }
                                                                j >>= 8;
                                                                i35++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i27 = i13;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i27;
                                                            if (i34 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i12 = i27;
                                                        }
                                                        if (i33 == length) {
                                                            break;
                                                        }
                                                        i33++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i27 = i12;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = dh2Var.c;
                                            long[] jArr6 = dh2Var.a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                arrayList3 = arrayList6;
                                                hashSet = hashSet2;
                                                int i37 = 0;
                                                while (true) {
                                                    long j2 = jArr6[i37];
                                                    int i38 = i28;
                                                    arrayList4 = arrayList4;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i39 = 8 - ((~(i37 - length2)) >>> 31);
                                                        int i40 = 0;
                                                        while (i40 < i39) {
                                                            if ((j2 & 255) < 128) {
                                                                i14 = i40;
                                                                vg1 vg1Var4 = (vg1) objArr6[(i37 << 3) + i40];
                                                                objArr4 = objArr6;
                                                                int i41 = vg1Var4.b;
                                                                jArr4 = jArr6;
                                                                if (i27 <= i41 && i41 < i27 + i38) {
                                                                    vg1Var4.b = (i41 - i27) + i10;
                                                                } else if (i10 <= i41 && i41 < i27) {
                                                                    vg1Var4.b = i41 + i38;
                                                                }
                                                            } else {
                                                                i14 = i40;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j2 >>= 8;
                                                            i40 = i14 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i39 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i37 == length2) {
                                                        break;
                                                    }
                                                    i37++;
                                                    arrayList4 = arrayList4;
                                                    i28 = i38;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i11 = i7;
                                    } else {
                                        linkedHashSet = linkedHashSet2;
                                        i8 = size2;
                                        i9 = i21;
                                        arrayList2 = arrayList5;
                                    }
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i11 = i7;
                                } else {
                                    arrayList4 = arrayList4;
                                    linkedHashSet = linkedHashSet2;
                                    i8 = size2;
                                    i9 = i21;
                                    arrayList2 = arrayList5;
                                    arrayList3 = arrayList6;
                                    hashSet = hashSet2;
                                    i10 = i25;
                                    i11 = i7 + 1;
                                }
                                i24 = i26 + 1;
                                vg1 vg1Var5 = (vg1) dh2Var.b(bv1Var2.c);
                                int i42 = i10 + (vg1Var5 != null ? vg1Var5.c : bv1Var2.d);
                                i23 = i11;
                                ou2Var = ou2Var;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i8;
                                i21 = i9;
                                arrayList5 = arrayList2;
                                arrayList6 = arrayList3;
                                hashSet2 = hashSet;
                                arrayList4 = arrayList4;
                                i25 = i42;
                                rq1Var3 = rq1Var2;
                            } else {
                                i24 = i26;
                                rq1Var3 = rq1Var2;
                                i23 = i7;
                            }
                        }
                    } else {
                        rq1Var2 = rq1Var3;
                        vg1 vg1Var6 = (vg1) dh2Var.b(bv1Var.c);
                        int i43 = vg1Var6 != null ? vg1Var6.b : -1;
                        int i44 = bv1Var.c;
                        i7 = i23;
                        dk0Var.e(i43 + i21, bv1Var.d);
                        ou2Var.a(i44, 0);
                        dk0Var.f = (i44 - dk0Var.a.F.g) + dk0Var.f;
                        this.F.o(i44);
                        M();
                        this.F.p();
                        mk0.a(arrayList4, i44, this.F.b[(i44 * 5) + 3] + i44);
                    }
                    i23 = i7 + 1;
                    rq1Var3 = rq1Var2;
                }
                rq1Var = rq1Var3;
                arrayList = arrayList4;
                dk0Var.c();
                if (arrayList5.size() > 0) {
                    wj3 wj3Var3 = this.F;
                    dk0Var.f = (wj3Var3.h - dk0Var.a.F.g) + dk0Var.f;
                    wj3Var3.q();
                }
            } else {
                rq1Var = rq1Var3;
                arrayList = arrayList4;
                i = -1;
            }
        } else {
            rq1Var = rq1Var3;
            arrayList = arrayList4;
            i = -1;
        }
        boolean z2 = this.O;
        if (!z2) {
            wj3 wj3Var4 = this.F;
            int i45 = wj3Var4.m - wj3Var4.l;
            if (i45 > 0) {
                if (i45 > 0) {
                    dk0Var.d(false);
                    rq1 rq1Var4 = dk0Var.d;
                    wj3 wj3Var5 = dk0Var.a.F;
                    if (wj3Var5.c > 0 && rq1Var4.c(-2) != (i6 = wj3Var5.i)) {
                        if (!dk0Var.c && dk0Var.e) {
                            dk0Var.d(false);
                            dk0Var.b.k.S(kp2.c);
                            dk0Var.c = true;
                        }
                        if (i6 > 0) {
                            h8 h8VarA = wj3Var5.a(i6);
                            rq1Var4.e(i6);
                            dk0Var.d(false);
                            hq2 hq2Var = dk0Var.b.k;
                            hq2Var.S(jp2.c);
                            xr0.q0(hq2Var, 0, h8VarA);
                            dk0Var.c = true;
                        }
                    }
                    hq2 hq2Var2 = dk0Var.b.k;
                    hq2Var2.S(zp2.c);
                    hq2Var2.m[hq2Var2.n - hq2Var2.k[hq2Var2.l - 1].a] = i45;
                } else {
                    dk0Var.getClass();
                }
            }
        }
        int i46 = this.j;
        while (true) {
            wj3 wj3Var6 = this.F;
            if (wj3Var6.k > 0 || (i5 = wj3Var6.g) == wj3Var6.h) {
                break;
            }
            M();
            dk0Var.e(i46, this.F.p());
            mk0.a(arrayList, i5, this.F.g);
        }
        if (z2) {
            if (z) {
                u71 u71Var = this.N;
                hq2 hq2Var3 = u71Var.l;
                if (!hq2Var3.R()) {
                    mk0.c("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                hq2 hq2Var4 = u71Var.k;
                eq2[] eq2VarArr = hq2Var3.k;
                int i47 = hq2Var3.l - 1;
                hq2Var3.l = i47;
                eq2 eq2Var = eq2VarArr[i47];
                eq2VarArr[i47] = null;
                hq2Var4.S(eq2Var);
                Object[] objArr7 = hq2Var3.o;
                Object[] objArr8 = hq2Var4.o;
                int i48 = hq2Var4.p;
                int i49 = eq2Var.b;
                int i50 = hq2Var3.p;
                int i51 = i50 - i49;
                System.arraycopy(objArr7, i51, objArr8, i48 - i49, i50 - i51);
                Object[] objArr9 = hq2Var3.o;
                int i52 = hq2Var3.p;
                Arrays.fill(objArr9, i52 - i49, i52, (Object) null);
                int[] iArr2 = hq2Var3.m;
                int[] iArr3 = hq2Var4.m;
                int i53 = hq2Var4.n;
                int i54 = eq2Var.a;
                int i55 = hq2Var3.n;
                vl.i0(i53 - i54, i55 - i54, i55, iArr2, iArr3);
                hq2Var3.p -= i49;
                hq2Var3.n -= i54;
                i20 = 1;
            }
            wj3 wj3Var7 = this.F;
            if (wj3Var7.k <= 0) {
                zx2.a("Unbalanced begin/end empty");
            }
            wj3Var7.k--;
            bk3 bk3Var2 = this.H;
            int i56 = bk3Var2.v;
            bk3Var2.i();
            if (this.F.k <= 0) {
                int i57 = (-2) - i56;
                this.H.j();
                this.H.e(true);
                h8 h8Var = this.M;
                boolean zQ = this.N.k.Q();
                yj3 yj3Var = this.G;
                if (zQ) {
                    dk0Var.b();
                    dk0Var.d(false);
                    rq1 rq1Var5 = dk0Var.d;
                    wj3 wj3Var8 = dk0Var.a.F;
                    if (wj3Var8.c <= 0 || rq1Var5.c(-2) == (i4 = wj3Var8.i)) {
                        i3 = 1;
                    } else {
                        if (!dk0Var.c && dk0Var.e) {
                            dk0Var.d(false);
                            dk0Var.b.k.S(kp2.c);
                            dk0Var.c = true;
                        }
                        if (i4 > 0) {
                            h8 h8VarA2 = wj3Var8.a(i4);
                            rq1Var5.e(i4);
                            dk0Var.d(false);
                            hq2 hq2Var5 = dk0Var.b.k;
                            hq2Var5.S(jp2.c);
                            xr0.q0(hq2Var5, 0, h8VarA2);
                            i3 = 1;
                            dk0Var.c = true;
                        } else {
                            i3 = 1;
                        }
                    }
                    dk0Var.c();
                    hq2 hq2Var6 = dk0Var.b.k;
                    hq2Var6.S(mp2.c);
                    xr0.r0(hq2Var6, 0, h8Var, i3, yj3Var);
                    r3 = 0;
                } else {
                    u71 u71Var2 = this.N;
                    dk0Var.b();
                    dk0Var.d(false);
                    rq1 rq1Var6 = dk0Var.d;
                    wj3 wj3Var9 = dk0Var.a.F;
                    if (wj3Var9.c > 0 && rq1Var6.c(-2) != (i2 = wj3Var9.i)) {
                        if (!dk0Var.c && dk0Var.e) {
                            dk0Var.d(false);
                            dk0Var.b.k.S(kp2.c);
                            dk0Var.c = true;
                        }
                        if (i2 > 0) {
                            h8 h8VarA3 = wj3Var9.a(i2);
                            rq1Var6.e(i2);
                            dk0Var.d(false);
                            hq2 hq2Var7 = dk0Var.b.k;
                            hq2Var7.S(jp2.c);
                            xr0.q0(hq2Var7, 0, h8VarA3);
                            dk0Var.c = true;
                        }
                    }
                    dk0Var.c();
                    hq2 hq2Var8 = dk0Var.b.k;
                    hq2Var8.S(np2.c);
                    int i58 = hq2Var8.p - hq2Var8.k[hq2Var8.l - 1].b;
                    Object[] objArr10 = hq2Var8.o;
                    objArr10[i58] = h8Var;
                    objArr10[i58 + 1] = yj3Var;
                    objArr10[i58 + 2] = u71Var2;
                    this.N = new u71();
                    r3 = 0;
                }
                this.O = r3;
                if (this.c.d != 0) {
                    i0(i57, r3);
                    j0(i57, i20);
                }
            }
        } else {
            if (z) {
                dk0Var.a();
            }
            int i59 = dk0Var.a.F.i;
            rq1 rq1Var7 = dk0Var.d;
            int i60 = i;
            if (rq1Var7.c(i60) > i59) {
                mk0.c("Missed recording an endGroup");
            }
            if (rq1Var7.c(i60) == i59) {
                dk0Var.d(false);
                rq1Var7.d();
                dk0Var.b.k.S(gp2.c);
            }
            int i61 = this.F.i;
            if (i20 != n0(i61)) {
                j0(i61, i20);
            }
            if (z) {
                i20 = 1;
            }
            this.F.d();
            dk0Var.c();
        }
        ArrayList arrayList7 = this.h;
        ou2 ou2Var2 = (ou2) arrayList7.remove(arrayList7.size() - 1);
        if (ou2Var2 != null && !z2) {
            ou2Var2.c++;
        }
        this.i = ou2Var2;
        this.j = rq1Var.d() + i20;
        this.l = rq1Var.d();
        this.k = rq1Var.d() + i20;
    }

    public final void s() {
        r(false);
        w33 w33VarC = C();
        if (w33VarC == null || !w33VarC.getUsed()) {
            return;
        }
        w33VarC.setDefaultsInScope(true);
    }

    public final void t() {
        r(true);
    }

    public final void u() {
        r(false);
    }

    public final w33 v() {
        h8 h8VarA;
        ArrayList arrayList = this.D;
        w33 w33Var = null;
        w33 w33Var2 = !arrayList.isEmpty() ? (w33) arrayList.remove(arrayList.size() - 1) : null;
        if (w33Var2 != null) {
            w33Var2.setRequiresRecompose(false);
            le1 le1VarEnd = w33Var2.end(this.A);
            dk0 dk0Var = this.L;
            if (le1VarEnd != null) {
                hq2 hq2Var = dk0Var.b.k;
                hq2Var.S(fp2.c);
                xr0.r0(hq2Var, 0, le1VarEnd, 1, this.g);
            }
            if (w33Var2.getResuming()) {
                w33Var2.setResuming(false);
                hq2 hq2Var2 = dk0Var.b.k;
                hq2Var2.S(ip2.c);
                xr0.q0(hq2Var2, 0, w33Var2);
            }
        }
        if (w33Var2 != null && !w33Var2.getSkipped$runtime_release() && (w33Var2.getUsed() || this.p)) {
            if (w33Var2.getAnchor() == null) {
                if (this.O) {
                    bk3 bk3Var = this.H;
                    h8VarA = bk3Var.b(bk3Var.v);
                } else {
                    wj3 wj3Var = this.F;
                    h8VarA = wj3Var.a(wj3Var.i);
                }
                w33Var2.setAnchor(h8VarA);
            }
            w33Var2.setDefaultsInvalid(false);
            w33Var = w33Var2;
        }
        r(false);
        return w33Var;
    }

    public final void w() {
        if (this.x && this.F.i == this.y) {
            this.y = -1;
            this.x = false;
        }
        r(false);
    }

    public final void x() {
        r(false);
        this.b.b();
        r(false);
        dk0 dk0Var = this.L;
        if (dk0Var.c) {
            dk0Var.d(false);
            dk0Var.d(false);
            dk0Var.b.k.S(gp2.c);
            dk0Var.c = false;
        }
        dk0Var.b();
        if (dk0Var.d.b != 0) {
            mk0.c("Missed recording an endGroup()");
        }
        if (!this.h.isEmpty()) {
            mk0.c("Start/end imbalance");
        }
        k();
        this.F.c();
        this.v = this.w.d() != 0;
    }

    public final void y(boolean z, ou2 ou2Var) {
        this.h.add(this.i);
        this.i = ou2Var;
        int i = this.k;
        rq1 rq1Var = this.m;
        rq1Var.e(i);
        rq1Var.e(this.l);
        rq1Var.e(this.j);
        if (z) {
            this.j = 0;
        }
        this.k = 0;
        this.l = 0;
    }

    public final void z() {
        yj3 yj3Var = new yj3();
        if (this.B) {
            yj3Var.d();
        }
        if (this.b.c()) {
            yj3Var.s = new dh2();
        }
        this.G = yj3Var;
        bk3 bk3VarJ = yj3Var.j();
        bk3VarJ.e(true);
        this.H = bk3VarJ;
    }
}

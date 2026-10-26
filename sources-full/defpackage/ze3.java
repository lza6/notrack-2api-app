package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.time.InstantKt;

/* JADX INFO: loaded from: classes.dex */
public final class ze3 {
    public final of2 a;
    public final boolean b;
    public final ux1 c;
    public final ue3 d;
    public boolean e;
    public ze3 f;
    public final int g;

    public ze3(of2 of2Var, boolean z, ux1 ux1Var, ue3 ue3Var) {
        this.a = of2Var;
        this.b = z;
        this.c = ux1Var;
        this.d = ue3Var;
        this.g = ux1Var.d;
    }

    public static /* synthetic */ List h(ze3 ze3Var, int i) {
        return ze3Var.g((i & 1) != 0 ? !ze3Var.b : false, (i & 2) == 0);
    }

    public final ze3 a(n73 n73Var, le1 le1Var) {
        ue3 ue3Var = new ue3();
        ue3Var.h = false;
        ue3Var.l = false;
        le1Var.invoke(ue3Var);
        ze3 ze3Var = new ze3(new ye3(le1Var), false, new ux1(this.g + (n73Var != null ? InstantKt.NANOS_PER_SECOND : 2000000000), true), ue3Var);
        ze3Var.e = true;
        ze3Var.f = this;
        return ze3Var;
    }

    public final void b(ux1 ux1Var, ArrayList arrayList) {
        oi2 oi2VarW = ux1Var.w();
        Object[] objArr = oi2VarW.c;
        int i = oi2VarW.h;
        for (int i2 = 0; i2 < i; i2++) {
            ux1 ux1Var2 = (ux1) objArr[i2];
            if (ux1Var2.F() && !ux1Var2.X) {
                if (ux1Var2.N.g(8)) {
                    arrayList.add(yh4.i(ux1Var2, this.b));
                } else {
                    b(ux1Var2, arrayList);
                }
            }
        }
    }

    public final wl2 c() {
        if (this.e) {
            ze3 ze3VarJ = j();
            if (ze3VarJ != null) {
                return ze3VarJ.c();
            }
            return null;
        }
        iu0 iu0VarD = yh4.D(this.c);
        if (iu0VarD == null) {
            iu0VarD = this.a;
        }
        return y64.K(iu0VarD, 8);
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        n(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ze3 ze3Var = (ze3) arrayList.get(size2);
            if (ze3Var.k()) {
                arrayList2.add(ze3Var);
            } else if (!ze3Var.d.l) {
                ze3Var.d(arrayList, arrayList2);
            }
        }
    }

    public final h43 e() {
        wl2 wl2VarC = c();
        if (wl2VarC != null) {
            if (!wl2VarC.z()) {
                wl2VarC = null;
            }
            if (wl2VarC != null) {
                return y64.u(wl2VarC).G(wl2VarC, true);
            }
        }
        return h43.e;
    }

    public final h43 f() {
        wl2 wl2VarC = c();
        if (wl2VarC != null) {
            if (!wl2VarC.z()) {
                wl2VarC = null;
            }
            if (wl2VarC != null) {
                return y64.n(wl2VarC);
            }
        }
        return h43.e;
    }

    public final List g(boolean z, boolean z2) {
        if (!z && this.d.l) {
            return z21.c;
        }
        ArrayList arrayList = new ArrayList();
        if (!k()) {
            return n(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final ue3 i() {
        boolean zK = k();
        ue3 ue3Var = this.d;
        if (!zK) {
            return ue3Var;
        }
        ue3 ue3VarB = ue3Var.b();
        m(new ArrayList(), ue3VarB);
        return ue3VarB;
    }

    public final ze3 j() {
        ux1 ux1VarT;
        ze3 ze3Var = this.f;
        if (ze3Var != null) {
            return ze3Var;
        }
        ux1 ux1Var = this.c;
        boolean z = this.b;
        if (!z) {
            ux1VarT = null;
            break;
        }
        ux1VarT = ux1Var.t();
        while (true) {
            if (ux1VarT == null) {
                ux1VarT = null;
                break;
            }
            ue3 ue3VarV = ux1VarT.v();
            if (ue3VarV != null && ue3VarV.h) {
                break;
            }
            ux1VarT = ux1VarT.t();
        }
        if (ux1VarT == null) {
            for (ux1 ux1VarT2 = ux1Var.t(); ux1VarT2 != null; ux1VarT2 = ux1VarT2.t()) {
                if (ux1VarT2.N.g(8)) {
                    ux1VarT = ux1VarT2;
                }
            }
            ux1VarT = null;
        }
        if (ux1VarT == null) {
            return null;
        }
        return yh4.i(ux1VarT, z);
    }

    public final boolean k() {
        return this.b && this.d.h;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean l() {
        if (this.e || !h(this, 4).isEmpty()) {
            return false;
        }
        ux1 ux1VarT = this.c.t();
        while (ux1VarT != null) {
            ue3 ue3VarV = ux1VarT.v();
            if (ue3VarV != null && ue3VarV.h) {
                if (ux1VarT == null) {
                    return true;
                }
                return false;
            }
            ux1VarT = ux1VarT.t();
        }
        ux1VarT = null;
        if (ux1VarT == null) {
            return true;
        }
        return false;
    }

    public final void m(ArrayList arrayList, ue3 ue3Var) {
        if (this.d.l) {
            return;
        }
        n(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ze3 ze3Var = (ze3) arrayList.get(size2);
            if (!ze3Var.k()) {
                ue3Var.g(ze3Var.d);
                ze3Var.m(arrayList, ue3Var);
            }
        }
    }

    public final List n(ArrayList arrayList, boolean z) {
        if (this.e) {
            return z21.c;
        }
        b(this.c, arrayList);
        if (z) {
            ue3 ue3Var = this.d;
            fi2 fi2Var = ue3Var.c;
            Object objG = fi2Var.g(cf3.w);
            if (objG == null) {
                objG = null;
            }
            n73 n73Var = (n73) objG;
            if (n73Var != null && ue3Var.h && !arrayList.isEmpty()) {
                arrayList.add(a(n73Var, new pj2(13, n73Var)));
            }
            ff3 ff3Var = cf3.a;
            if (fi2Var.c(ff3Var) && !arrayList.isEmpty() && ue3Var.h) {
                Object objG2 = fi2Var.g(ff3Var);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) ke0.z0(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new v7(str, 8)));
                }
            }
        }
        return arrayList;
    }
}

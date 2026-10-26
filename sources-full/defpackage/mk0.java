package defpackage;

import androidx.compose.runtime.Composer$Companion;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class mk0 {
    public static final vo2 a = new vo2("provider");
    public static final vo2 b = new vo2("provider");
    public static final vo2 c = new vo2("compositionLocalMap");
    public static final vo2 d = new vo2("providers");
    public static final vo2 e = new vo2("reference");
    public static final lk0 f = new lk0(0);

    public static final void a(ArrayList arrayList, int i, int i2) {
        int iF = f(i, arrayList);
        if (iF < 0) {
            iF = -(iF + 1);
        }
        while (iF < arrayList.size() && ((tr1) arrayList.get(iF)).b < i2) {
            arrayList.remove(iF);
        }
    }

    public static final void b(wj3 wj3Var, ArrayList arrayList, int i) {
        boolean zI = wj3Var.i(i);
        int[] iArr = wj3Var.b;
        if (zI) {
            arrayList.add(wj3Var.k(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(wj3Var, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new wj0(fq2.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new wj0(fq2.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(bk3 bk3Var, z43 z43Var) {
        int iO;
        int[] iArr = bk3Var.b;
        int i = bk3Var.t;
        int iF = bk3Var.f(iArr, bk3Var.q(bk3Var.s(i) + i));
        for (int iF2 = bk3Var.f(bk3Var.b, bk3Var.q(bk3Var.t)); iF2 < iF; iF2++) {
            Object obj = bk3Var.c[bk3Var.g(iF2)];
            int iC = -1;
            if (obj instanceof vj0) {
                z43Var.d((vj0) obj, bk3Var.o() - iF2, -1, -1);
            } else if (obj instanceof b53) {
                b53 b53Var = (b53) obj;
                if (!(b53Var.a instanceof gk0)) {
                    h(bk3Var, iF2, obj);
                    int iO2 = bk3Var.o() - iF2;
                    h8 h8Var = b53Var.b;
                    if (h8Var == null || !h8Var.a()) {
                        iO = -1;
                    } else {
                        iC = bk3Var.c(h8Var);
                        iO = bk3Var.o() - bk3Var.M(iC);
                    }
                    z43Var.d(b53Var, iO2, iC, iO);
                }
            } else if (obj instanceof w33) {
                h(bk3Var, iF2, obj);
                ((w33) obj).release();
            }
        }
    }

    public static final int f(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iZ = kr1.z(((tr1) list.get(i3)).b, i);
            if (iZ < 0) {
                i2 = i3 + 1;
            } else {
                if (iZ <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void g(bk3 bk3Var, z43 z43Var) {
        int iO;
        int[] iArr = bk3Var.b;
        int i = bk3Var.t;
        int iF = bk3Var.f(iArr, bk3Var.q(bk3Var.s(i) + i));
        for (int iF2 = bk3Var.f(bk3Var.b, bk3Var.q(bk3Var.t)); iF2 < iF; iF2++) {
            Object obj = bk3Var.c[bk3Var.g(iF2)];
            int iC = -1;
            if (obj instanceof vj0) {
                int iO2 = bk3Var.o() - iF2;
                Object obj2 = (vj0) obj;
                gi2 gi2Var = z43Var.f;
                if (gi2Var == null) {
                    int i2 = sa3.a;
                    gi2Var = new gi2();
                    z43Var.f = gi2Var;
                }
                gi2Var.k(obj2);
                z43Var.d(obj2, iO2, -1, -1);
            }
            if (obj instanceof b53) {
                int iO3 = bk3Var.o() - iF2;
                b53 b53Var = (b53) obj;
                h8 h8Var = b53Var.b;
                if (h8Var == null || !h8Var.a()) {
                    iO = -1;
                } else {
                    iC = bk3Var.c(h8Var);
                    iO = bk3Var.o() - bk3Var.M(iC);
                }
                z43Var.d(b53Var, iO3, iC, iO);
            }
            if (obj instanceof w33) {
                ((w33) obj).release();
            }
        }
        bk3Var.F();
    }

    public static final void h(bk3 bk3Var, int i, Object obj) {
        int iG = bk3Var.g(i);
        Object[] objArr = bk3Var.c;
        Object obj2 = objArr[iG];
        objArr[iG] = Composer$Companion.getEmpty();
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}

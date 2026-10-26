package androidx.compose.runtime;

import defpackage.ak3;
import defpackage.bk3;
import defpackage.d43;
import defpackage.dv2;
import defpackage.h8;
import defpackage.jn3;
import defpackage.mk0;
import defpackage.n64;
import defpackage.rn0;
import defpackage.t73;
import defpackage.uu2;
import defpackage.vl;
import defpackage.w42;
import defpackage.z21;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Composer$Companion {
    private static final t73 Empty = new t73(27);

    public static final void access$removeRunning(rn0 rn0Var) {
        jn3 jn3Var;
        dv2 dv2Var;
        dv2 dv2Var2;
        jn3 jn3Var2 = d43.x;
        do {
            jn3Var = d43.x;
            dv2Var = (dv2) jn3Var.getValue();
            uu2 uu2VarA = dv2Var.h;
            w42 w42Var = (w42) uu2VarA.get(rn0Var);
            if (w42Var == null) {
                dv2Var2 = dv2Var;
            } else {
                Object obj = w42Var.a;
                Object obj2 = w42Var.b;
                n64 n64Var = uu2VarA.c;
                n64 n64VarV = n64Var.v(rn0Var != null ? rn0Var.hashCode() : 0, 0, rn0Var);
                if (n64Var != n64VarV) {
                    uu2VarA = n64VarV == null ? uu2.h : new uu2(n64VarV, uu2VarA.d - 1);
                }
                t73 t73Var = t73.p;
                if (obj != t73Var) {
                    Object obj3 = uu2VarA.get(obj);
                    obj3.getClass();
                    uu2VarA = uu2VarA.a(obj, new w42(((w42) obj3).a, obj2));
                }
                if (obj2 != t73Var) {
                    Object obj4 = uu2VarA.get(obj2);
                    obj4.getClass();
                    uu2VarA = uu2VarA.a(obj2, new w42(obj, ((w42) obj4).b));
                }
                Object obj5 = obj != t73Var ? dv2Var.c : obj2;
                if (obj2 != t73Var) {
                    obj = dv2Var.d;
                }
                dv2Var2 = new dv2(obj5, obj, uu2VarA);
            }
            if (dv2Var == dv2Var2) {
                return;
            }
        } while (!jn3Var.n(dv2Var, dv2Var2));
    }

    public static t73 getEmpty() {
        return Empty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List moveGroup(bk3 bk3Var, int i, bk3 bk3Var2, boolean z, boolean z2, boolean z3) {
        List list;
        boolean z4;
        h8 h8VarP;
        int iS = bk3Var.s(i);
        int i2 = i + iS;
        int iF = bk3Var.f(bk3Var.b, bk3Var.q(i));
        int iF2 = bk3Var.f(bk3Var.b, bk3Var.q(i2));
        int i3 = iF2 - iF;
        boolean z5 = i >= 0 && (bk3Var.b[(bk3Var.q(i) * 5) + 1] & 201326592) != 0;
        bk3Var2.u(iS);
        bk3Var2.v(i3, bk3Var2.t);
        if (bk3Var.g < i2) {
            bk3Var.z(i2);
        }
        if (bk3Var.k < iF2) {
            bk3Var.A(iF2, i2);
        }
        int[] iArr = bk3Var2.b;
        int i4 = bk3Var2.t;
        int i5 = i4 * 5;
        vl.i0(i5, i * 5, i2 * 5, bk3Var.b, iArr);
        Object[] objArr = bk3Var2.c;
        int i6 = bk3Var2.i;
        System.arraycopy(bk3Var.c, iF, objArr, i6, i3);
        int i7 = bk3Var2.v;
        iArr[i5 + 2] = i7;
        int i8 = i4 - i;
        int i9 = i4 + iS;
        int iF3 = i6 - bk3Var2.f(iArr, i4);
        int i10 = bk3Var2.m;
        int i11 = bk3Var2.l;
        int length = objArr.length;
        boolean z6 = z5;
        int i12 = i10;
        int i13 = i4;
        while (i13 < i9) {
            if (i13 != i4) {
                int i14 = (i13 * 5) + 2;
                iArr[i14] = iArr[i14] + i8;
            }
            int[] iArr2 = iArr;
            iArr2[(i13 * 5) + 4] = bk3.h(bk3Var2.f(iArr, i13) + iF3, i12 < i13 ? 0 : bk3Var2.k, i11, length);
            if (i13 == i12) {
                i12++;
            }
            i13++;
            i4 = i4;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        bk3Var2.m = i12;
        int iA = ak3.a(bk3Var.d, i, bk3Var.n());
        int iA2 = ak3.a(bk3Var.d, i2, bk3Var.n());
        if (iA < iA2) {
            ArrayList arrayList = bk3Var.d;
            ArrayList arrayList2 = new ArrayList(iA2 - iA);
            for (int i15 = iA; i15 < iA2; i15++) {
                h8 h8Var = (h8) arrayList.get(i15);
                h8Var.a += i8;
                arrayList2.add(h8Var);
            }
            bk3Var2.d.addAll(ak3.a(bk3Var2.d, bk3Var2.t, bk3Var2.n()), arrayList2);
            arrayList.subList(iA, iA2).clear();
            list = arrayList2;
        } else {
            list = z21.c;
        }
        if (!list.isEmpty()) {
            HashMap map = bk3Var.e;
            HashMap map2 = bk3Var2.e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i16 = 0; i16 < size; i16++) {
                }
            }
        }
        int i17 = bk3Var2.v;
        HashMap map3 = bk3Var2.e;
        if (map3 != null && (h8VarP = bk3Var2.P(i7)) != null) {
        }
        int iC = bk3Var.C(bk3Var.b, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = iC >= 0;
            if (z7) {
                bk3Var.N();
                bk3Var.a(iC - bk3Var.t);
                bk3Var.N();
            }
            bk3Var.a(i - bk3Var.t);
            boolean zF = bk3Var.F();
            if (z7) {
                bk3Var.J();
                bk3Var.i();
                bk3Var.J();
                bk3Var.i();
            }
            z4 = zF;
        } else {
            boolean zG = bk3Var.G(i, iS);
            bk3Var.H(iF, i3, i - 1);
            z4 = zG;
        }
        if (z4) {
            mk0.c("Unexpectedly removed anchors");
        }
        int i18 = bk3Var2.o;
        int i19 = iArr3[i5 + 1];
        bk3Var2.o = i18 + ((1073741824 & i19) != 0 ? 1 : i19 & 67108863);
        if (z2) {
            bk3Var2.t = i9;
            bk3Var2.i = i6 + i3;
        }
        if (z6) {
            bk3Var2.R(i7);
        }
        return list;
    }
}

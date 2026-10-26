package defpackage;

import androidx.compose.ui.layout.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ua implements vb2 {
    public static final ua b = new ua(0);
    public static final ua c = new ua(1);
    public static final ua d = new ua(2);
    public static final ua e = new ua(3);
    public static final ua f = new ua(4);
    public static final ua g = new ua(5);
    public static final ua h = new ua(6);
    public static final ua i = new ua(7);
    public static final ua j = new ua(8);
    public static final ua k = new ua(9);
    public final /* synthetic */ int a;

    public /* synthetic */ ua(int i2) {
        this.a = i2;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j2) {
        Object obj;
        Object obj2;
        long j3;
        nv2 nv2VarC;
        int i2 = this.a;
        int i3 = 0;
        a31 a31Var = a31.c;
        switch (i2) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    nv2 nv2VarC2 = ((qb2) list.get(i5)).c(j2);
                    iJ = Math.max(iJ, nv2VarC2.c);
                    i4 = Math.max(i4, nv2VarC2.d);
                    arrayList.add(nv2VarC2);
                }
                if (list.isEmpty()) {
                    iJ = um0.j(j2);
                    i4 = um0.i(j2);
                }
                return xb2Var.s(iJ, i4, a31Var, new ta(arrayList, 0));
            case 1:
                int size2 = list.size();
                if (size2 == 0) {
                    return xb2Var.s(0, 0, a31Var, v1.p);
                }
                if (size2 == 1) {
                    nv2 nv2VarC3 = ((qb2) list.get(0)).c(j2);
                    return xb2Var.s(nv2VarC3.c, nv2VarC3.d, a31Var, new xc(nv2VarC3, 0));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                while (i3 < size3) {
                    nv2 nv2VarC4 = ((qb2) list.get(i3)).c(j2);
                    iMax = Math.max(iMax, nv2VarC4.c);
                    iMax2 = Math.max(iMax2, nv2VarC4.d);
                    arrayList2.add(nv2VarC4);
                    i3++;
                }
                return xb2Var.s(iMax, iMax2, a31Var, new ta(arrayList2, 1));
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                while (i3 < size4) {
                    arrayList3.add(((qb2) list.get(i3)).c(j2));
                    i3++;
                }
                return xb2Var.s(um0.h(j2), um0.g(j2), a31Var, new ta(arrayList3, 3));
            case 3:
                return xb2Var.s(um0.j(j2), um0.i(j2), a31Var, v1.L);
            case 4:
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size5) {
                        obj = list.get(i6);
                        if (!kr1.n(a.a((qb2) obj), "leadingIcon")) {
                            i6++;
                        }
                    } else {
                        obj = null;
                    }
                }
                qb2 qb2Var = (qb2) obj;
                nv2 nv2VarC5 = qb2Var != null ? qb2Var.c(um0.a(j2, 0, 0, 0, 0, 10)) : null;
                float f2 = ov3.b;
                int i7 = nv2VarC5 != null ? nv2VarC5.c : 0;
                int i8 = nv2VarC5 != null ? nv2VarC5.d : 0;
                int size6 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size6) {
                        obj2 = list.get(i9);
                        if (!kr1.n(a.a((qb2) obj2), "trailingIcon")) {
                            i9++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                qb2 qb2Var2 = (qb2) obj2;
                if (qb2Var2 != null) {
                    j3 = j2;
                    nv2VarC = qb2Var2.c(um0.a(j3, 0, 0, 0, 0, 10));
                } else {
                    j3 = j2;
                    nv2VarC = null;
                }
                int i10 = nv2VarC != null ? nv2VarC.c : 0;
                int i11 = nv2VarC != null ? nv2VarC.d : 0;
                int size7 = list.size();
                for (int i12 = 0; i12 < size7; i12++) {
                    qb2 qb2Var3 = (qb2) list.get(i12);
                    if (kr1.n(a.a(qb2Var3), "label")) {
                        nv2 nv2VarC6 = qb2Var3.c(wm0.j(j3, -(i7 + i10), 0, 2));
                        int i13 = i7 + nv2VarC6.c + i10;
                        int iMax3 = Math.max(i8, Math.max(nv2VarC6.d, i11));
                        return xb2Var.s(i13, iMax3, a31Var, new ec0(nv2VarC5, i8, iMax3, nv2VarC6, i7, nv2VarC, i11));
                    }
                }
                j93.g("Collection contains no element matching the predicate.");
                return null;
            case 5:
                return xb2Var.s(um0.h(j2), um0.g(j2), a31Var, sx.y);
            case 6:
                return xb2Var.s(um0.j(j2), um0.i(j2), a31Var, fl1.p);
            case 7:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size8 = list.size();
                int iMax4 = 0;
                int iMax5 = 0;
                while (i3 < size8) {
                    nv2 nv2VarC7 = ((qb2) list.get(i3)).c(j2);
                    iMax4 = Math.max(iMax4, nv2VarC7.c);
                    iMax5 = Math.max(iMax5, nv2VarC7.d);
                    arrayList4.add(nv2VarC7);
                    i3++;
                }
                return xb2Var.s(iMax4, iMax5, a31Var, new ta(arrayList4, 7));
            case 8:
                return xb2Var.s(um0.f(j2) ? um0.h(j2) : 0, um0.e(j2) ? um0.g(j2) : 0, a31Var, ba3.G);
            default:
                return xb2Var.s(um0.j(j2), um0.i(j2), a31Var, new s80(20));
        }
    }
}

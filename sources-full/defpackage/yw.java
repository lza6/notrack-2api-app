package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yw implements vb2 {
    public final a8 a;
    public final boolean b;

    public yw(a8 a8Var, boolean z) {
        this.a = a8Var;
        this.b = z;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        int iJ;
        int i;
        nv2 nv2VarC;
        boolean zIsEmpty = list.isEmpty();
        a31 a31Var = a31.c;
        if (zIsEmpty) {
            return xb2Var.s(um0.j(j), um0.i(j), a31Var, jh4.d);
        }
        long j2 = this.b ? j : j & (-8589934589L);
        if (list.size() == 1) {
            qb2 qb2Var = (qb2) list.get(0);
            Object objI = qb2Var.i();
            tw twVar = objI instanceof tw ? (tw) objI : null;
            if (twVar != null ? twVar.d : false) {
                iJ = um0.j(j);
                i = um0.i(j);
                int iJ2 = um0.j(j);
                int i2 = um0.i(j);
                if (!((i2 >= 0) & (iJ2 >= 0))) {
                    ro1.a("width and height must be >= 0");
                }
                nv2VarC = qb2Var.c(wm0.h(iJ2, iJ2, i2, i2));
            } else {
                nv2VarC = qb2Var.c(j2);
                iJ = Math.max(um0.j(j), nv2VarC.c);
                i = Math.max(um0.i(j), nv2VarC.d);
            }
            int i3 = i;
            int i4 = iJ;
            return xb2Var.s(i4, i3, a31Var, new ww(nv2VarC, qb2Var, xb2Var, i4, i3, this));
        }
        nv2[] nv2VarArr = new nv2[list.size()];
        o43 o43Var = new o43();
        o43Var.c = um0.j(j);
        o43 o43Var2 = new o43();
        o43Var2.c = um0.i(j);
        int size = list.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            qb2 qb2Var2 = (qb2) list.get(i5);
            Object objI2 = qb2Var2.i();
            tw twVar2 = objI2 instanceof tw ? (tw) objI2 : null;
            if (twVar2 != null ? twVar2.d : false) {
                z = true;
            } else {
                nv2 nv2VarC2 = qb2Var2.c(j2);
                nv2VarArr[i5] = nv2VarC2;
                o43Var.c = Math.max(o43Var.c, nv2VarC2.c);
                o43Var2.c = Math.max(o43Var2.c, nv2VarC2.d);
            }
        }
        if (z) {
            int i6 = o43Var.c;
            int i7 = i6 != Integer.MAX_VALUE ? i6 : 0;
            int i8 = o43Var2.c;
            long jA = wm0.a(i7, i6, i8 != Integer.MAX_VALUE ? i8 : 0, i8);
            int size2 = list.size();
            for (int i9 = 0; i9 < size2; i9++) {
                qb2 qb2Var3 = (qb2) list.get(i9);
                Object objI3 = qb2Var3.i();
                tw twVar3 = objI3 instanceof tw ? (tw) objI3 : null;
                if (twVar3 != null ? twVar3.d : false) {
                    nv2VarArr[i9] = qb2Var3.c(jA);
                }
            }
        }
        return xb2Var.s(o43Var.c, o43Var2.c, a31Var, new xw(nv2VarArr, list, xb2Var, o43Var, o43Var2, this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw)) {
            return false;
        }
        yw ywVar = (yw) obj;
        return kr1.n(this.a, ywVar.a) && this.b == ywVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxMeasurePolicy(alignment=" + this.a + ", propagateMinConstraints=" + this.b + ')';
    }
}

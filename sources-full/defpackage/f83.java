package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class f83 implements vb2, c83 {
    public final el a;
    public final z7 b;

    public f83(el elVar, z7 z7Var) {
        this.a = elVar;
        this.b = z7Var;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
        int iO = er1Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iO, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            qb2 qb2Var = (qb2) list.get(i2);
            float fG = sf3.G(sf3.F(qb2Var));
            if (fG == 0.0f) {
                int iMin2 = Math.min(qb2Var.Q(IntCompanionObject.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qb2Var.d(iMin2));
            } else if (fG > 0.0f) {
                f += fG;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            qb2 qb2Var2 = (qb2) list.get(i3);
            float fG2 = sf3.G(sf3.F(qb2Var2));
            if (fG2 > 0.0f) {
                iMax = Math.max(iMax, qb2Var2.d(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
        int iO = er1Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            qb2 qb2Var = (qb2) list.get(i3);
            float fG = sf3.G(sf3.F(qb2Var));
            int iQ = qb2Var.Q(i);
            if (fG == 0.0f) {
                i2 += iQ;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iQ / fG));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        return gm4.J(this, um0.j(j), um0.i(j), um0.h(j), um0.g(j), xb2Var.O(this.a.a()), xb2Var, list, new nv2[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
        int iO = er1Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((list.size() - 1) * iO, i);
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            qb2 qb2Var = (qb2) list.get(i2);
            float fG = sf3.G(sf3.F(qb2Var));
            if (fG == 0.0f) {
                int iMin2 = Math.min(qb2Var.Q(IntCompanionObject.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qb2Var.R(iMin2));
            } else if (fG > 0.0f) {
                f += fG;
            }
        }
        int iRound = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - iMin, 0) / f);
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            qb2 qb2Var2 = (qb2) list.get(i3);
            float fG2 = sf3.G(sf3.F(qb2Var2));
            if (fG2 > 0.0f) {
                iMax = Math.max(iMax, qb2Var2.R(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
        int iO = er1Var.O(this.a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int iMax = 0;
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            qb2 qb2Var = (qb2) list.get(i3);
            float fG = sf3.G(sf3.F(qb2Var));
            int iM = qb2Var.M(i);
            if (fG == 0.0f) {
                i2 += iM;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iM / fG));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f83)) {
            return false;
        }
        f83 f83Var = (f83) obj;
        return kr1.n(this.a, f83Var.a) && kr1.n(this.b, f83Var.b);
    }

    @Override // defpackage.c83
    public final void f(int i, int[] iArr, int[] iArr2, xb2 xb2Var) {
        this.a.h(xb2Var, i, iArr, xb2Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.c83
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? wm0.a(i, i2, 0, i3) : Protocol$Companion.m1784x4c29bdda(i, i2, 0, i3);
    }

    @Override // defpackage.c83
    public final int h(nv2 nv2Var) {
        return nv2Var.d;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.c83
    public final int i(nv2 nv2Var) {
        return nv2Var.c;
    }

    @Override // defpackage.c83
    public final wb2 j(nv2[] nv2VarArr, xb2 xb2Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return xb2Var.s(i, i2, a31.c, new ev0(nv2VarArr, this, i2, iArr));
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.a + ", verticalAlignment=" + this.b + ')';
    }
}

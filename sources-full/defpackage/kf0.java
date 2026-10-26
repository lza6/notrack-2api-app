package defpackage;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class kf0 implements vb2, c83 {
    public final gl a;
    public final y7 b;

    public kf0(gl glVar, y7 y7Var) {
        this.a = glVar;
        this.b = y7Var;
    }

    @Override // defpackage.vb2
    public final int a(er1 er1Var, List list, int i) {
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
            int iD = qb2Var.d(i);
            if (fG == 0.0f) {
                i2 += iD;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iD / fG));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.vb2
    public final int b(er1 er1Var, List list, int i) {
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
                int iMin2 = Math.min(qb2Var.d(IntCompanionObject.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qb2Var.Q(iMin2));
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
                iMax = Math.max(iMax, qb2Var2.Q(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        return gm4.J(this, um0.i(j), um0.j(j), um0.g(j), um0.h(j), xb2Var.O(this.a.a()), xb2Var, list, new nv2[list.size()], 0, list.size(), null, 0);
    }

    @Override // defpackage.vb2
    public final int d(er1 er1Var, List list, int i) {
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
            int iR = qb2Var.R(i);
            if (fG == 0.0f) {
                i2 += iR;
            } else if (fG > 0.0f) {
                f += fG;
                iMax = Math.max(iMax, Math.round(iR / fG));
            }
        }
        return ((list.size() - 1) * iO) + Math.round(iMax * f) + i2;
    }

    @Override // defpackage.vb2
    public final int e(er1 er1Var, List list, int i) {
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
                int iMin2 = Math.min(qb2Var.d(IntCompanionObject.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, qb2Var.M(iMin2));
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
                iMax = Math.max(iMax, qb2Var2.M(iRound != Integer.MAX_VALUE ? Math.round(iRound * fG2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf0)) {
            return false;
        }
        kf0 kf0Var = (kf0) obj;
        return kr1.n(this.a, kf0Var.a) && kr1.n(this.b, kf0Var.b);
    }

    @Override // defpackage.c83
    public final void f(int i, int[] iArr, int[] iArr2, xb2 xb2Var) {
        this.a.k(xb2Var, i, iArr, iArr2);
    }

    @Override // defpackage.c83
    public final long g(int i, int i2, int i3, boolean z) {
        return !z ? wm0.a(0, i3, i, i2) : Protocol$Companion.m1783xcb8e775(0, i3, i, i2);
    }

    @Override // defpackage.c83
    public final int h(nv2 nv2Var) {
        return nv2Var.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.c83
    public final int i(nv2 nv2Var) {
        return nv2Var.d;
    }

    @Override // defpackage.c83
    public final wb2 j(nv2[] nv2VarArr, xb2 xb2Var, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        return xb2Var.s(i2, i, a31.c, new jf0(nv2VarArr, this, i2, xb2Var, iArr));
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.a + ", horizontalAlignment=" + this.b + ')';
    }
}

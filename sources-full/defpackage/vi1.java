package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class vi1 implements jx1 {
    public final rw3 c;
    public final int d;
    public final f54 h;
    public final je1 l;

    public vi1(rw3 rw3Var, int i, f54 f54Var, je1 je1Var) {
        this.c = rw3Var;
        this.d = i;
        this.h = f54Var;
        this.l = je1Var;
    }

    @Override // defpackage.jx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        long j2;
        if (qb2Var.Q(um0.g(j)) < um0.h(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = um0.a(j2, 0, IntCompanionObject.MAX_VALUE, 0, 0, 13);
        }
        nv2 nv2VarC = qb2Var.c(j);
        int iMin = Math.min(nv2VarC.c, um0.h(j2));
        return xb2Var.s(iMin, nv2VarC.d, a31.c, new ev0(xb2Var, this, nv2VarC, iMin, 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vi1) {
            vi1 vi1Var = (vi1) obj;
            if (this.c == vi1Var.c && this.d == vi1Var.d && this.h.equals(vi1Var.h) && kr1.n(this.l, vi1Var.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.h.hashCode() + fq2.e(this.d, this.c.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.c + ", cursorOffset=" + this.d + ", transformedText=" + this.h + ", textLayoutResultProvider=" + this.l + ')';
    }
}

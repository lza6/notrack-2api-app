package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class mc4 implements jx1 {
    public final rw3 c;
    public final int d;
    public final f54 h;
    public final je1 l;

    public mc4(rw3 rw3Var, int i, f54 f54Var, je1 je1Var) {
        this.c = rw3Var;
        this.d = i;
        this.h = f54Var;
        this.l = je1Var;
    }

    @Override // defpackage.jx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(um0.a(j, 0, 0, 0, IntCompanionObject.MAX_VALUE, 7));
        int iMin = Math.min(nv2VarC.d, um0.g(j));
        return xb2Var.s(nv2VarC.c, iMin, a31.c, new ev0(xb2Var, this, nv2VarC, iMin, 3));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mc4) {
            mc4 mc4Var = (mc4) obj;
            if (this.c == mc4Var.c && this.d == mc4Var.d && this.h.equals(mc4Var.h) && kr1.n(this.l, mc4Var.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + ((this.h.hashCode() + fq2.e(this.d, this.c.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.c + ", cursorOffset=" + this.d + ", transformedText=" + this.h + ", textLayoutResultProvider=" + this.l + ')';
    }
}

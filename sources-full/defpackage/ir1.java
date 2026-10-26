package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ir1 extends of2 implements lx1 {
    public gr1 c;
    public boolean d;

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        return this.c == gr1.c ? qb2Var.M(i) : qb2Var.Q(i);
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        int iM = this.c == gr1.c ? qb2Var.M(um0.g(j)) : qb2Var.Q(um0.g(j));
        if (iM < 0) {
            iM = 0;
        }
        if (iM < 0) {
            ro1.a("width must be >= 0");
        }
        long jH = wm0.h(iM, iM, 0, IntCompanionObject.MAX_VALUE);
        if (this.d) {
            jH = wm0.e(j, jH);
        }
        nv2 nv2VarC = qb2Var.c(jH);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 9));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        return this.c == gr1.c ? qb2Var.M(i) : qb2Var.Q(i);
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        return qb2Var.d(i);
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        return qb2Var.R(i);
    }
}

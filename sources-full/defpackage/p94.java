package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p94 extends of2 implements lx1 {
    public float c;
    public float d;

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        int iM = qb2Var.M(i);
        int iO = !Float.isNaN(this.c) ? m82Var.O(this.c) : 0;
        return iM < iO ? iO : iM;
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.c) || um0.j(j) != 0) {
            iJ = um0.j(j);
        } else {
            int iO = xb2Var.O(this.c);
            iJ = um0.h(j);
            if (iO < 0) {
                iO = 0;
            }
            if (iO <= iJ) {
                iJ = iO;
            }
        }
        int iH = um0.h(j);
        if (Float.isNaN(this.d) || um0.i(j) != 0) {
            i = um0.i(j);
        } else {
            int iO2 = xb2Var.O(this.d);
            i = um0.g(j);
            int i2 = iO2 >= 0 ? iO2 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        nv2 nv2VarC = qb2Var.c(wm0.a(iJ, iH, i, um0.g(j)));
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 18));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        int iQ = qb2Var.Q(i);
        int iO = !Float.isNaN(this.c) ? m82Var.O(this.c) : 0;
        return iQ < iO ? iO : iQ;
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        int iD = qb2Var.d(i);
        int iO = !Float.isNaN(this.d) ? m82Var.O(this.d) : 0;
        return iD < iO ? iO : iD;
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        int iR = qb2Var.R(i);
        int iO = !Float.isNaN(this.d) ? m82Var.O(this.d) : 0;
        return iR < iO ? iO : iR;
    }
}

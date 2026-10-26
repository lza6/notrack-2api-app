package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fi3 extends of2 implements lx1 {
    public float c;
    public float d;
    public float h;
    public float l;
    public boolean m;

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        long jV0 = v0(m82Var);
        if (um0.f(jV0)) {
            return um0.h(jV0);
        }
        if (!this.m) {
            i = wm0.f(jV0, i);
        }
        return wm0.g(jV0, qb2Var.M(i));
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jV0 = v0(xb2Var);
        if (this.m) {
            jA = wm0.e(j, jV0);
        } else {
            if (Float.isNaN(this.c)) {
                iJ = um0.j(j);
                int iH2 = um0.h(jV0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = um0.j(jV0);
            }
            if (Float.isNaN(this.h)) {
                iH = um0.h(j);
                int iJ2 = um0.j(jV0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = um0.h(jV0);
            }
            if (Float.isNaN(this.d)) {
                i = um0.i(j);
                int iG2 = um0.g(jV0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = um0.i(jV0);
            }
            if (Float.isNaN(this.l)) {
                iG = um0.g(j);
                int i2 = um0.i(jV0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = um0.g(jV0);
            }
            jA = wm0.a(iJ, iH, i, iG);
        }
        nv2 nv2VarC = qb2Var.c(jA);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 13));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        long jV0 = v0(m82Var);
        if (um0.f(jV0)) {
            return um0.h(jV0);
        }
        if (!this.m) {
            i = wm0.f(jV0, i);
        }
        return wm0.g(jV0, qb2Var.Q(i));
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        long jV0 = v0(m82Var);
        if (um0.e(jV0)) {
            return um0.g(jV0);
        }
        if (!this.m) {
            i = wm0.g(jV0, i);
        }
        return wm0.f(jV0, qb2Var.d(i));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long v0(xb2 xb2Var) {
        int iO;
        int iO2;
        int iO3;
        int i = 0;
        if (Float.isNaN(this.h)) {
            iO = Integer.MAX_VALUE;
        } else {
            iO = xb2Var.O(this.h);
            if (iO < 0) {
                iO = 0;
            }
        }
        if (Float.isNaN(this.l)) {
            iO2 = Integer.MAX_VALUE;
        } else {
            iO2 = xb2Var.O(this.l);
            if (iO2 < 0) {
                iO2 = 0;
            }
        }
        if (Float.isNaN(this.c)) {
            iO3 = 0;
        } else {
            iO3 = xb2Var.O(this.c);
            if (iO3 < 0) {
                iO3 = 0;
            }
            if (iO3 > iO) {
                iO3 = iO;
            }
            if (iO3 == Integer.MAX_VALUE) {
                iO3 = 0;
            }
        }
        if (!Float.isNaN(this.d)) {
            int iO4 = xb2Var.O(this.d);
            if (iO4 < 0) {
                iO4 = 0;
            }
            if (iO4 > iO2) {
                iO4 = iO2;
            }
            if (iO4 != Integer.MAX_VALUE) {
                i = iO4;
            }
        }
        return wm0.a(iO3, iO, i, iO2);
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        long jV0 = v0(m82Var);
        if (um0.e(jV0)) {
            return um0.g(jV0);
        }
        if (!this.m) {
            i = wm0.g(jV0, i);
        }
        return wm0.f(jV0, qb2Var.R(i));
    }
}

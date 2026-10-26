package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g02 extends of2 implements rf2, lx1 {
    public static final e02 m = new e02();
    public h02 c;
    public jx d;
    public boolean h;
    public nq2 l;

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        nv2 nv2VarC = qb2Var.c(j);
        return xb2Var.s(nv2VarC.c, nv2VarC.d, a31.c, new xc(nv2VarC, 10));
    }

    @Override // defpackage.rf2
    public final gm4 i() {
        sh3 sh3Var = new sh3(pt.a);
        sh3Var.s.setValue(this);
        return sh3Var;
    }

    public final boolean v0(d02 d02Var, int i) {
        if (i != 5 && i != 6) {
            if (i == 3 || i == 4) {
                if (this.l != nq2.c) {
                }
            } else if (i != 1 && i != 2) {
                u41.r("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (w0(i) ? d02Var.a > 0 : d02Var.b < this.c.a() - 1) {
                return true;
            }
        } else if (this.l != nq2.d) {
            if (w0(i)) {
            }
        }
        return false;
    }

    public final boolean w0(int i) {
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            if (i == 5) {
                return this.h;
            }
            if (i == 6) {
                if (this.h) {
                    return false;
                }
            } else if (i == 3) {
                int iOrdinal = y64.M(this).H.ordinal();
                if (iOrdinal == 0) {
                    return this.h;
                }
                if (iOrdinal != 1) {
                    u41.e();
                    return false;
                }
                if (this.h) {
                    return false;
                }
            } else {
                if (i != 4) {
                    u41.r("Lazy list does not support beyond bounds layout for the specified direction");
                    return false;
                }
                int iOrdinal2 = y64.M(this).H.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        return this.h;
                    }
                    u41.e();
                    return false;
                }
                if (this.h) {
                    return false;
                }
            }
        }
        return true;
    }
}

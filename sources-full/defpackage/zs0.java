package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zs0 implements qb2 {
    public final /* synthetic */ int c;
    public final qb2 d;
    public final Enum h;
    public final Enum l;

    public /* synthetic */ zs0(qb2 qb2Var, Enum r2, Enum r3, int i) {
        this.c = i;
        this.d = qb2Var;
        this.h = r2;
        this.l = r3;
    }

    @Override // defpackage.qb2
    public final int M(int i) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d.M(i);
    }

    @Override // defpackage.qb2
    public final int Q(int i) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d.Q(i);
    }

    @Override // defpackage.qb2
    public final int R(int i) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d.R(i);
    }

    @Override // defpackage.qb2
    public final nv2 c(long j) {
        int i = this.c;
        Enum r1 = this.h;
        Enum r2 = this.l;
        qb2 qb2Var = this.d;
        switch (i) {
            case 0:
                hr1 hr1Var = (hr1) r2;
                fr1 fr1Var = (fr1) r1;
                fr1 fr1Var2 = fr1.d;
                if (hr1Var == hr1.c) {
                    return new t71(fr1Var == fr1Var2 ? qb2Var.Q(um0.g(j)) : qb2Var.M(um0.g(j)), um0.c(j) ? um0.g(j) : 32767, 0);
                }
                return new t71(um0.d(j) ? um0.h(j) : 32767, fr1Var == fr1Var2 ? qb2Var.d(um0.h(j)) : qb2Var.R(um0.h(j)), 0);
            case 1:
                zb2 zb2Var = (zb2) r2;
                yb2 yb2Var = (yb2) r1;
                yb2 yb2Var2 = yb2.d;
                if (zb2Var == zb2.c) {
                    return new t71(yb2Var == yb2Var2 ? qb2Var.Q(um0.g(j)) : qb2Var.M(um0.g(j)), um0.c(j) ? um0.g(j) : 32767, 1);
                }
                return new t71(um0.d(j) ? um0.h(j) : 32767, yb2Var == yb2Var2 ? qb2Var.d(um0.h(j)) : qb2Var.R(um0.h(j)), 1);
            default:
                am2 am2Var = (am2) r2;
                zl2 zl2Var = (zl2) r1;
                zl2 zl2Var2 = zl2.d;
                if (am2Var == am2.c) {
                    return new t71(zl2Var == zl2Var2 ? qb2Var.Q(um0.g(j)) : qb2Var.M(um0.g(j)), um0.c(j) ? um0.g(j) : 32767, 2);
                }
                return new t71(um0.d(j) ? um0.h(j) : 32767, zl2Var == zl2Var2 ? qb2Var.d(um0.h(j)) : qb2Var.R(um0.h(j)), 2);
        }
    }

    @Override // defpackage.qb2
    public final int d(int i) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d.d(i);
    }

    @Override // defpackage.qb2
    public final Object i() {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.d.i();
    }
}

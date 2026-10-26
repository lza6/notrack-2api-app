package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class ob3 extends of2 implements lx1, xe3 {
    public rb3 c;
    public boolean d;

    @Override // defpackage.lx1
    public final int P(m82 m82Var, qb2 qb2Var, int i) {
        if (this.d) {
            i = IntCompanionObject.MAX_VALUE;
        }
        return qb2Var.M(i);
    }

    @Override // defpackage.xe3
    public final void applySemantics(gf3 gf3Var) {
        ef3.k(gf3Var);
        fb3 fb3Var = new fb3(new nb3(this, 0), new nb3(this, 1), false);
        if (this.d) {
            ff3 ff3Var = cf3.t;
            pu1 pu1Var = ef3.a[11];
            ff3Var.a(gf3Var, fb3Var);
        } else {
            ff3 ff3Var2 = cf3.s;
            pu1 pu1Var2 = ef3.a[10];
            ff3Var2.a(gf3Var, fb3Var);
        }
    }

    @Override // defpackage.lx1
    public final wb2 d(xb2 xb2Var, qb2 qb2Var, long j) {
        vl0.x(j, this.d ? nq2.c : nq2.d);
        boolean z = this.d;
        int iH = IntCompanionObject.MAX_VALUE;
        int iG = z ? Integer.MAX_VALUE : um0.g(j);
        if (this.d) {
            iH = um0.h(j);
        }
        nv2 nv2VarC = qb2Var.c(um0.a(j, 0, iH, 0, iG, 5));
        int i = nv2VarC.c;
        int iH2 = um0.h(j);
        if (i > iH2) {
            i = iH2;
        }
        int i2 = nv2VarC.d;
        int iG2 = um0.g(j);
        if (i2 > iG2) {
            i2 = iG2;
        }
        int i3 = nv2VarC.d - i2;
        int i4 = nv2VarC.c - i;
        if (!this.d) {
            i3 = i4;
        }
        this.c.f(i3);
        this.c.b.h(this.d ? i2 : i);
        return xb2Var.s(i, i2, a31.c, new hn1(i3, 2, this, nv2VarC));
    }

    @Override // defpackage.lx1
    public final int e(m82 m82Var, qb2 qb2Var, int i) {
        if (this.d) {
            i = IntCompanionObject.MAX_VALUE;
        }
        return qb2Var.Q(i);
    }

    @Override // defpackage.lx1
    public final int m(m82 m82Var, qb2 qb2Var, int i) {
        if (!this.d) {
            i = IntCompanionObject.MAX_VALUE;
        }
        return qb2Var.d(i);
    }

    @Override // defpackage.lx1
    public final int z(m82 m82Var, qb2 qb2Var, int i) {
        if (!this.d) {
            i = IntCompanionObject.MAX_VALUE;
        }
        return qb2Var.R(i);
    }
}

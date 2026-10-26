package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo1 extends o82 {
    @Override // defpackage.o82
    public final void E0() {
        s82 s82Var = this.t.t.O.q;
        s82Var.getClass();
        s82Var.w0();
    }

    @Override // defpackage.qb2
    public final int M(int i) {
        bi4 bi4VarS = this.t.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.e((wl2) ux1Var.N.d, ux1Var.l(), i);
    }

    @Override // defpackage.qb2
    public final int Q(int i) {
        bi4 bi4VarS = this.t.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.b((wl2) ux1Var.N.d, ux1Var.l(), i);
    }

    @Override // defpackage.qb2
    public final int R(int i) {
        bi4 bi4VarS = this.t.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.d((wl2) ux1Var.N.d, ux1Var.l(), i);
    }

    @Override // defpackage.qb2
    public final nv2 c(long j) {
        m0(j);
        wl2 wl2Var = this.t;
        oi2 oi2VarX = wl2Var.t.x();
        Object[] objArr = oi2VarX.c;
        int i = oi2VarX.h;
        for (int i2 = 0; i2 < i; i2++) {
            s82 s82Var = ((ux1) objArr[i2]).O.q;
            s82Var.getClass();
            s82Var.r = sx1.h;
        }
        ux1 ux1Var = wl2Var.t;
        o82.D0(this, ux1Var.E.c(this, ux1Var.l(), j));
        return this;
    }

    @Override // defpackage.qb2
    public final int d(int i) {
        bi4 bi4VarS = this.t.t.s();
        vb2 vb2VarF = bi4VarS.f();
        ux1 ux1Var = (ux1) bi4VarS.c;
        return vb2VarF.a((wl2) ux1Var.N.d, ux1Var.l(), i);
    }

    @Override // defpackage.m82
    public final int n0(ti1 ti1Var) {
        s82 s82Var = this.t.t.O.q;
        s82Var.getClass();
        vx1 vx1Var = s82Var.z;
        if (!s82Var.s) {
            yx1 yx1Var = s82Var.n;
            if (yx1Var.d == qx1.d) {
                vx1Var.f = true;
                if (vx1Var.b) {
                    yx1Var.f = true;
                    yx1Var.g = true;
                }
            } else {
                vx1Var.g = true;
            }
        }
        wo1 wo1Var = s82Var.o().U;
        if (wo1Var != null) {
            wo1Var.p = true;
        }
        s82Var.q();
        wo1 wo1Var2 = s82Var.o().U;
        if (wo1Var2 != null) {
            wo1Var2.p = false;
        }
        Integer num = (Integer) vx1Var.i.get(ti1Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.y.h(iIntValue, ti1Var);
        return iIntValue;
    }
}

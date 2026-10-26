package defpackage;

import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes.dex */
public final class nx1 extends wl2 {
    public static final bc V;
    public lx1 T;
    public mx1 U;

    static {
        bc bcVarF = vl0.f();
        bcVarF.f(re0.g);
        bcVarF.l(1.0f);
        bcVarF.m(1);
        V = bcVarF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public nx1(ux1 ux1Var, lx1 lx1Var) {
        super(ux1Var);
        this.T = lx1Var;
        this.U = ux1Var.p != null ? new mx1(this) : null;
        if ((((of2) lx1Var).getNode().getKindSet$ui_release() & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            return;
        }
        m51.t();
        throw null;
    }

    @Override // defpackage.wl2
    public final void J0() {
        if (this.U == null) {
            this.U = new mx1(this);
        }
    }

    @Override // defpackage.qb2
    public final int M(int i) {
        lx1 lx1Var = this.T;
        wl2 wl2Var = this.u;
        wl2Var.getClass();
        return lx1Var.P(this, wl2Var, i);
    }

    @Override // defpackage.wl2
    public final o82 N0() {
        return this.U;
    }

    @Override // defpackage.wl2
    public final of2 P0() {
        return ((of2) this.T).getNode();
    }

    @Override // defpackage.qb2
    public final int Q(int i) {
        lx1 lx1Var = this.T;
        wl2 wl2Var = this.u;
        wl2Var.getClass();
        return lx1Var.e(this, wl2Var, i);
    }

    @Override // defpackage.qb2
    public final int R(int i) {
        lx1 lx1Var = this.T;
        wl2 wl2Var = this.u;
        wl2Var.getClass();
        return lx1Var.z(this, wl2Var, i);
    }

    @Override // defpackage.qb2
    public final nv2 c(long j) {
        m0(j);
        lx1 lx1Var = this.T;
        wl2 wl2Var = this.u;
        wl2Var.getClass();
        h1(lx1Var.d(this, wl2Var, j));
        b1();
        return this;
    }

    @Override // defpackage.qb2
    public final int d(int i) {
        lx1 lx1Var = this.T;
        wl2 wl2Var = this.u;
        wl2Var.getClass();
        return lx1Var.m(this, wl2Var, i);
    }

    @Override // defpackage.wl2
    public final void e1(y00 y00Var, gg1 gg1Var) {
        wl2 wl2Var = this.u;
        wl2Var.getClass();
        wl2Var.H0(y00Var, gg1Var);
        if (xx1.a(this.t).getShowLayoutBounds()) {
            long j = this.h;
            y00Var.r(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, V);
        }
    }

    @Override // defpackage.nv2
    public final void i0(long j, float f, le1 le1Var) {
        f1(j, f, le1Var);
        if (this.o) {
            return;
        }
        c1();
        y0().b();
        this.u.getClass();
    }

    @Override // defpackage.m82
    public final int n0(ti1 ti1Var) {
        mx1 mx1Var = this.U;
        if (mx1Var == null) {
            return yh4.j(this, ti1Var);
        }
        rh2 rh2Var = mx1Var.y;
        int iD = rh2Var.d(ti1Var);
        if (iD >= 0) {
            return rh2Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o1(lx1 lx1Var) {
        if (lx1Var.equals(this.T) || (((of2) lx1Var).getNode().getKindSet$ui_release() & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0) {
            this.T = lx1Var;
        } else {
            m51.t();
        }
    }
}

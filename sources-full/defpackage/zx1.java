package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zx1 implements jp3, xb2 {
    public final /* synthetic */ cy1 c;
    public final /* synthetic */ iy1 d;

    public zx1(iy1 iy1Var) {
        this.d = iy1Var;
        this.c = iy1Var.p;
    }

    @Override // defpackage.wu0
    public final int C(long j) {
        return this.c.C(j);
    }

    @Override // defpackage.wu0
    public final float E(long j) {
        return this.c.E(j);
    }

    @Override // defpackage.wu0
    public final int O(float f) {
        return this.c.O(f);
    }

    @Override // defpackage.jp3
    public final List b0(Object obj, ne1 ne1Var) {
        iy1 iy1Var = this.d;
        ux1 ux1Var = iy1Var.c;
        ux1 ux1Var2 = (ux1) iy1Var.o.g(obj);
        if (ux1Var2 != null && ((oi2) ((th2) ux1Var.o()).d).k(ux1Var2) < iy1Var.l) {
            return ux1Var2.m();
        }
        fi2 fi2Var = iy1Var.r;
        oi2 oi2Var = iy1Var.u;
        if (oi2Var.h < iy1Var.m) {
            po1.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int i = oi2Var.h;
        int i2 = iy1Var.m;
        if (i == i2) {
            oi2Var.c(obj);
        } else {
            Object[] objArr = oi2Var.c;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        iy1Var.m++;
        if (!fi2Var.b(obj)) {
            iy1Var.t.l(obj, iy1Var.f(obj, ne1Var));
            if (ux1Var.O.d == qx1.h) {
                ux1Var.P(true);
            } else {
                ux1.Q(ux1Var, true, 6);
            }
        }
        ux1 ux1Var3 = (ux1) fi2Var.g(obj);
        if (ux1Var3 == null) {
            return z21.c;
        }
        List listN0 = ux1Var3.O.p.n0();
        th2 th2Var = (th2) listN0;
        int i3 = ((oi2) th2Var.d).h;
        for (int i4 = 0; i4 < i3; i4++) {
            ((ub2) th2Var.get(i4)).n.b = true;
        }
        return listN0;
    }

    @Override // defpackage.wu0
    public final long c0(long j) {
        return this.c.c0(j);
    }

    @Override // defpackage.wu0
    public final float f0(long j) {
        return this.c.f0(j);
    }

    @Override // defpackage.xb2
    public final wb2 g0(int i, int i2, Map map, le1 le1Var) {
        return this.c.g0(i, i2, map, le1Var);
    }

    @Override // defpackage.wu0
    public final float getDensity() {
        return this.c.d;
    }

    @Override // defpackage.er1
    public final dx1 getLayoutDirection() {
        return this.c.c;
    }

    @Override // defpackage.wu0
    public final long k0(float f) {
        return this.c.k0(f);
    }

    @Override // defpackage.wu0
    public final float l() {
        return this.c.h;
    }

    @Override // defpackage.wu0
    public final float q0(int i) {
        return this.c.q0(i);
    }

    @Override // defpackage.er1
    public final boolean r() {
        return this.c.r();
    }

    @Override // defpackage.wu0
    public final float r0(float f) {
        return f / this.c.getDensity();
    }

    @Override // defpackage.xb2
    public final wb2 s(int i, int i2, Map map, le1 le1Var) {
        return this.c.g0(i, i2, map, le1Var);
    }

    @Override // defpackage.wu0
    public final long t(float f) {
        return this.c.t(f);
    }

    @Override // defpackage.wu0
    public final long u(long j) {
        return this.c.u(j);
    }

    @Override // defpackage.wu0
    public final float w(float f) {
        return this.c.getDensity() * f;
    }
}

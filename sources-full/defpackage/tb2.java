package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class tb2 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ub2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tb2(ub2 ub2Var, int i) {
        super(0);
        this.c = i;
        this.d = ub2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        mv2 placementScope;
        int i = this.c;
        w84 w84Var = w84.a;
        ub2 ub2Var = this.d;
        switch (i) {
            case 0:
                yx1 yx1Var = ub2Var.n;
                yx1Var.i = 0;
                oi2 oi2VarX = yx1Var.a.x();
                Object[] objArr = oi2VarX.c;
                int i2 = oi2VarX.h;
                for (int i3 = 0; i3 < i2; i3++) {
                    ub2 ub2Var2 = ((ux1) objArr[i3]).O.p;
                    ub2Var2.p = ub2Var2.q;
                    ub2Var2.q = IntCompanionObject.MAX_VALUE;
                    ub2Var2.B = false;
                    if (ub2Var2.t == sx1.d) {
                        ub2Var2.t = sx1.h;
                    }
                }
                ux1 ux1Var = yx1Var.a;
                ux1 ux1Var2 = yx1Var.a;
                oi2 oi2VarX2 = ux1Var.x();
                Object[] objArr2 = oi2VarX2.c;
                int i4 = oi2VarX2.h;
                for (int i5 = 0; i5 < i4; i5++) {
                    ((ux1) objArr2[i5]).O.p.F.d = false;
                }
                ub2Var.o().y0().b();
                oi2 oi2VarX3 = ux1Var2.x();
                Object[] objArr3 = oi2VarX3.c;
                int i6 = oi2VarX3.h;
                for (int i7 = 0; i7 < i6; i7++) {
                    ux1 ux1Var3 = (ux1) objArr3[i7];
                    yx1 yx1Var2 = ux1Var3.O;
                    if (yx1Var2.p.p != ux1Var3.u()) {
                        ux1Var2.L();
                        ux1Var2.A();
                        if (ux1Var3.u() == Integer.MAX_VALUE) {
                            if (yx1Var2.c) {
                                s82 s82Var = yx1Var2.q;
                                s82Var.getClass();
                                s82Var.n0(false);
                            }
                            yx1Var2.p.p0();
                        }
                    }
                }
                oi2 oi2VarX4 = ux1Var2.x();
                Object[] objArr4 = oi2VarX4.c;
                int i8 = oi2VarX4.h;
                for (int i9 = 0; i9 < i8; i9++) {
                    vx1 vx1Var = ((ux1) objArr4[i9]).O.p.F;
                    vx1Var.e = vx1Var.d;
                }
                break;
            case 1:
                ub2Var.n.a().c(ub2Var.J);
                break;
            default:
                yx1 yx1Var3 = ub2Var.n;
                wl2 wl2Var = yx1Var3.a().v;
                if (wl2Var == null || (placementScope = wl2Var.q) == null) {
                    placementScope = xx1.a(yx1Var3.a).getPlacementScope();
                }
                le1 le1Var = ub2Var.O;
                if (le1Var == null) {
                    wl2 wl2VarA = yx1Var3.a();
                    long j = ub2Var.P;
                    float f = ub2Var.Q;
                    placementScope.getClass();
                    mv2.a(placementScope, wl2VarA);
                    wl2VarA.i0(iq1.c(j, wl2VarA.m), f, null);
                } else {
                    wl2 wl2VarA2 = yx1Var3.a();
                    long j2 = ub2Var.P;
                    float f2 = ub2Var.Q;
                    placementScope.getClass();
                    mv2.a(placementScope, wl2VarA2);
                    wl2VarA2.i0(iq1.c(j2, wl2VarA2.m), f2, le1Var);
                }
                break;
        }
        return w84Var;
    }
}

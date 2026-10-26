package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class gh extends ww1 implements ne1 {
    public final /* synthetic */ e c;
    public final /* synthetic */ float d;
    public final /* synthetic */ v44 h;
    public final /* synthetic */ t44 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ uz3 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ ne1 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh(e eVar, float f, v44 v44Var, t44 t44Var, ne1 ne1Var, uz3 uz3Var, boolean z, ne1 ne1Var2, wg0 wg0Var) {
        super(2);
        this.c = eVar;
        this.d = f;
        this.h = v44Var;
        this.l = t44Var;
        this.m = ne1Var;
        this.n = uz3Var;
        this.o = z;
        this.p = ne1Var2;
        this.q = wg0Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        c cVarF = d.f(xr0.O(fh4.a(c.i, this.c)), 0.0f, this.d, 1);
        kk0 kk0Var2 = (kk0) ck0Var;
        v44 v44Var = this.h;
        boolean zH = kk0Var2.h(v44Var);
        Object objP = kk0Var2.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new fh(v44Var, 0);
            kk0Var2.l0(objP);
        }
        ic3 ic3Var = (ic3) objP;
        t44 t44Var = this.l;
        long j = t44Var.c;
        long j2 = t44Var.d;
        long j3 = t44Var.e;
        boolean z = this.o;
        bg1 bg1Var = hl.e;
        wh.m1867xb14448e9(cVarF, ic3Var, j, j2, j3, this.m, this.n, 1.0f, bg1Var, z ? bg1Var : hl.a, 0, false, this.p, this.q, kk0Var2, 113246208, 3126);
    }
}

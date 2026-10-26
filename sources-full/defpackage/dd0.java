package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class dd0 extends ww1 implements oe1 {
    public final /* synthetic */ je1 c;
    public final /* synthetic */ je1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd0(je1 je1Var, je1 je1Var2) {
        super(3);
        this.c = je1Var;
        this.d = je1Var2;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        gh2 gh2Var;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1534186401);
        vn1 vn1Var = (vn1) kk0Var.l(d.a);
        if (vn1Var instanceof ao1) {
            kk0Var.a0(-1726068379);
            kk0Var.r(false);
            gh2Var = null;
        } else {
            kk0Var.a0(-1725935761);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = fq2.j(kk0Var);
            }
            gh2Var = (gh2) objP;
            kk0Var.r(false);
        }
        c cVarF = a.f(c.i, gh2Var, vn1Var, this.c, this.d);
        kk0Var.r(false);
        return cVarF;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

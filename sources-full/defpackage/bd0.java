package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class bd0 extends ww1 implements oe1 {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ String d;
    public final /* synthetic */ je1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(boolean z, String str, je1 je1Var) {
        super(3);
        this.c = z;
        this.d = str;
        this.h = je1Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        gh2 gh2Var;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-756081143);
        vn1 vn1Var = (vn1) kk0Var.l(d.a);
        if (vn1Var instanceof ao1) {
            kk0Var.a0(617653824);
            kk0Var.r(false);
            gh2Var = null;
        } else {
            kk0Var.a0(617786442);
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = fq2.j(kk0Var);
            }
            gh2Var = (gh2) objP;
            kk0Var.r(false);
        }
        gh2 gh2Var2 = gh2Var;
        c cVarC = a.c(c.i, gh2Var2, vn1Var, this.c, this.d, null, this.h);
        kk0Var.r(false);
        return cVarC;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

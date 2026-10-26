package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class dh4 extends ww1 implements oe1 {
    public final /* synthetic */ le1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh4(le1 le1Var) {
        super(3);
        this.c = le1Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1608161351);
        le1 le1Var = this.c;
        boolean zH = kk0Var.h(le1Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new cn0(le1Var);
            kk0Var.l0(objP);
        }
        cn0 cn0Var = (cn0) objP;
        kk0Var.r(false);
        return cn0Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

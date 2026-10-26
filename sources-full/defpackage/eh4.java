package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class eh4 extends ww1 implements oe1 {
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh4(e eVar) {
        super(3);
        this.c = eVar;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-1415685722);
        e eVar = this.c;
        boolean zH = kk0Var.h(eVar);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new sp1(eVar);
            kk0Var.l0(objP);
        }
        sp1 sp1Var = (sp1) objP;
        kk0Var.r(false);
        return sp1Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

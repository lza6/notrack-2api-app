package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* JADX INFO: loaded from: classes.dex */
public final class nw3 extends ww1 implements oe1 {
    public final /* synthetic */ le1 c;
    public final /* synthetic */ gh2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw3(le1 le1Var, gh2 gh2Var) {
        super(3);
        this.c = le1Var;
        this.d = gh2Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-102778667);
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = r11.a(x21.c, kk0Var);
            kk0Var.l0(objP);
        }
        gq0 gq0Var = (gq0) objP;
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = cl3.d(null);
            kk0Var.l0(objP2);
        }
        mi2 mi2Var = (mi2) objP2;
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(this.c, kk0Var, 0);
        gh2 gh2Var = this.d;
        boolean zH = kk0Var.h(gh2Var);
        Object objP3 = kk0Var.P();
        if (zH || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new sg2(mi2Var, 15, gh2Var);
            kk0Var.l0(objP3);
        }
        r11.DisposableEffect(gh2Var, (le1) objP3, kk0Var, 0);
        Modifier$Companion modifier$Companion = c.i;
        boolean zJ = kk0Var.j(gq0Var) | kk0Var.h(gh2Var) | kk0Var.h(gn3VarRememberUpdatedState);
        Object objP4 = kk0Var.P();
        if (zJ || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new mq(gq0Var, mi2Var, gh2Var, gn3VarRememberUpdatedState);
            kk0Var.l0(objP4);
        }
        c cVarB = oq3.b(modifier$Companion, gh2Var, (PointerInputEventHandler) objP4);
        kk0Var.r(false);
        return cVarB;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

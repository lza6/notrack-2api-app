package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class he3 extends ww1 implements oe1 {
    public final /* synthetic */ je1 c;
    public final /* synthetic */ le1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he3(je1 je1Var, le1 le1Var) {
        super(3);
        this.c = je1Var;
        this.d = le1Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(759876635);
        gn3 gn3VarRememberAnimatedMagnifierPosition = ie3.rememberAnimatedMagnifierPosition(this.c, kk0Var, 0);
        boolean zH = kk0Var.h(gn3VarRememberAnimatedMagnifierPosition);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new ap0(gn3VarRememberAnimatedMagnifierPosition, 5);
            kk0Var.l0(objP);
        }
        c cVar2 = (c) this.d.invoke((je1) objP);
        kk0Var.r(false);
        return cVar2;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

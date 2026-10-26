package defpackage;

import androidx.compose.foundation.gestures.b;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class qw3 extends ww1 implements oe1 {
    public final /* synthetic */ rw3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ gh2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw3(gh2 gh2Var, rw3 rw3Var, boolean z) {
        super(3);
        this.c = rw3Var;
        this.d = z;
        this.h = gh2Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        rw3 rw3Var = this.c;
        ft2 ft2Var = rw3Var.f;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(805428266);
        boolean z = ((nq2) ft2Var.getValue()) == nq2.c || !(kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d);
        boolean zH = kk0Var.h(rw3Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new pj2(24, rw3Var);
            kk0Var.l0(objP);
        }
        gc3 gc3VarRememberScrollableState = hc3.rememberScrollableState((le1) objP, kk0Var, 0);
        boolean zH2 = kk0Var.h(gc3VarRememberScrollableState) | kk0Var.h(rw3Var);
        Object objP2 = kk0Var.P();
        if (zH2 || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new pw3(gc3VarRememberScrollableState, rw3Var);
            kk0Var.l0(objP2);
        }
        c cVarB = b.b(c.i, (pw3) objP2, (nq2) ft2Var.getValue(), this.d && rw3Var.b.f() != 0.0f, z, this.h);
        kk0Var.r(false);
        return cVarB;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

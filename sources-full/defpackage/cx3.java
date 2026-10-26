package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;

/* JADX INFO: loaded from: classes.dex */
public final class cx3 extends ww1 implements oe1 {
    public final /* synthetic */ xw3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx3(xw3 xw3Var) {
        super(3);
        this.c = xw3Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1980580247);
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(new qq1(0L));
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        xw3 xw3Var = this.c;
        boolean zJ = kk0Var.j(xw3Var);
        Object objP2 = kk0Var.P();
        if (zJ || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new c9(xw3Var, 25, mi2Var);
            kk0Var.l0(objP2);
        }
        je1 je1Var = (je1) objP2;
        boolean zH = kk0Var.h(wu0Var);
        Object objP3 = kk0Var.P();
        if (zH || objP3 == Composer$Companion.getEmpty()) {
            objP3 = new oe3(wu0Var, mi2Var, 3);
            kk0Var.l0(objP3);
        }
        zf zfVar = ie3.a;
        c cVarA = b.a(cVar, InspectableValueKt.getNoInspectorInfo(), new he3(je1Var, (le1) objP3));
        kk0Var.r(false);
        return cVarA;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

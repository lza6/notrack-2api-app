package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class nd extends ww1 implements oe1 {
    public final /* synthetic */ je1 c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(je1 je1Var, boolean z) {
        super(3);
        this.c = je1Var;
        this.d = z;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-196777734);
        long j = ((lz3) kk0Var.l(mz3.a)).a;
        boolean zG = kk0Var.g(j);
        je1 je1Var = this.c;
        boolean zH = zG | kk0Var.h(je1Var);
        boolean z = this.d;
        boolean zI = zH | kk0Var.i(z);
        Object objP = kk0Var.P();
        if (zI || objP == Composer$Companion.getEmpty()) {
            objP = new md(j, je1Var, z);
            kk0Var.l0(objP);
        }
        c cVarB = a.b(cVar, (le1) objP);
        kk0Var.r(false);
        return cVarB;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

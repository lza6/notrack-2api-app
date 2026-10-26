package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer$Companion;
import defpackage.ap0;
import defpackage.b12;
import defpackage.b93;
import defpackage.c12;
import defpackage.ck0;
import defpackage.cp0;
import defpackage.da;
import defpackage.fp3;
import defpackage.gn3;
import defpackage.ip3;
import defpackage.jy2;
import defpackage.kk0;
import defpackage.ky2;
import defpackage.le1;
import defpackage.mi4;
import defpackage.n02;
import defpackage.ne1;
import defpackage.oe1;
import defpackage.r11;
import defpackage.w84;
import defpackage.ww1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends ww1 implements oe1 {
    public final /* synthetic */ b12 c;
    public final /* synthetic */ androidx.compose.ui.c d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ gn3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b12 b12Var, androidx.compose.ui.c cVar, ne1 ne1Var, gn3 gn3Var) {
        super(3);
        this.c = b12Var;
        this.d = cVar;
        this.h = ne1Var;
        this.l = gn3Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((b93) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(b93 b93Var, ck0 ck0Var, int i) {
        androidx.compose.ui.c cVarThen;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new n02(b93Var, new ap0(this.l, 2));
            kk0Var.l0(objP);
        }
        n02 n02Var = (n02) objP;
        Object objP2 = kk0Var.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = new ip3(new mi4(n02Var));
            kk0Var.l0(objP2);
        }
        ip3 ip3Var = (ip3) objP2;
        b12 b12Var = this.c;
        if (b12Var != null) {
            kk0Var.a0(204281539);
            kk0Var.a0(6591363);
            jy2 jy2VarRememberDefaultPrefetchScheduler = ky2.rememberDefaultPrefetchScheduler(kk0Var, 0);
            kk0Var.r(false);
            Object[] objArr = {b12Var, n02Var, ip3Var, jy2VarRememberDefaultPrefetchScheduler};
            boolean zH = kk0Var.h(b12Var) | kk0Var.j(n02Var) | kk0Var.j(ip3Var) | kk0Var.j(jy2VarRememberDefaultPrefetchScheduler);
            Object objP3 = kk0Var.P();
            if (zH || objP3 == Composer$Companion.getEmpty()) {
                cp0 cp0Var = new cp0(b12Var, n02Var, ip3Var, jy2VarRememberDefaultPrefetchScheduler, 2);
                kk0Var.l0(cp0Var);
                objP3 = cp0Var;
            }
            r11.DisposableEffect(objArr, (le1) objP3, (ck0) kk0Var, 0);
            kk0Var.r(false);
        } else {
            kk0Var.a0(204710145);
            kk0Var.r(false);
        }
        int i2 = c12.b;
        androidx.compose.ui.c cVar = this.d;
        androidx.compose.ui.c cVar2 = (b12Var == null || (cVarThen = cVar.then(new TraversablePrefetchStateModifierElement(b12Var))) == null) ? cVar : cVarThen;
        boolean zH2 = kk0Var.h(n02Var);
        ne1 ne1Var = this.h;
        boolean zH3 = zH2 | kk0Var.h(ne1Var);
        Object objP4 = kk0Var.P();
        if (zH3 || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new da(n02Var, 5, ne1Var);
            kk0Var.l0(objP4);
        }
        fp3.SubcomposeLayout(ip3Var, cVar2, (ne1) objP4, kk0Var, 8, 0);
    }
}

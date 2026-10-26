package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;

/* JADX INFO: loaded from: classes.dex */
public final class na extends ww1 implements oe1 {
    public static final na c = new na(3);

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-2126899193);
        long j = ((lz3) kk0Var.l(mz3.a)).a;
        Modifier$Companion modifier$Companion = c.i;
        boolean zG = kk0Var.g(j);
        Object objP = kk0Var.P();
        int i2 = 0;
        if (zG || objP == Composer$Companion.getEmpty()) {
            objP = new ma(j, i2);
            kk0Var.l0(objP);
        }
        c cVarThen = cVar.then(a.b(modifier$Companion, (le1) objP));
        kk0Var.r(false);
        return cVarThen;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

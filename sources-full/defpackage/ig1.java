package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ig1 {
    public static final long a;

    static {
        int i = re0.j;
        a = re0.b;
    }

    public static final gg1 rememberGraphicsLayer(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        eg1 eg1Var = (eg1) kk0Var.l(CompositionLocalsKt.getLocalGraphicsContext());
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = new fg1(eg1Var);
            kk0Var.l0(objP);
        }
        return ((fg1) objP).d;
    }
}

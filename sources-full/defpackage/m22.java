package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class m22 {
    public static final g12 rememberLazyGridSemanticState(wz1 wz1Var, boolean z, ck0 ck0Var, int i) {
        boolean z2 = ((((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(wz1Var)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((kk0) ck0Var).i(z)) || (i & 48) == 32);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z2 || objP == Composer$Companion.getEmpty()) {
            objP = new l22(wz1Var);
            kk0Var.l0(objP);
        }
        return (l22) objP;
    }
}

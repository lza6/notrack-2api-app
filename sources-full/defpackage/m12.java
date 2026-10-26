package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class m12 {
    public static final h02 rememberLazyListBeyondBoundsState(g22 g22Var, int i, ck0 ck0Var, int i2) {
        boolean z = ((((i2 & 14) ^ 6) > 4 && ((kk0) ck0Var).h(g22Var)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && ((kk0) ck0Var).f(i)) || (i2 & 48) == 32);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new n12(g22Var, i);
            kk0Var.l0(objP);
        }
        return (n12) objP;
    }
}

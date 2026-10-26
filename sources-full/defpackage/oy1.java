package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class oy1 {
    public static final h02 rememberLazyGridBeyondBoundsState(wz1 wz1Var, ck0 ck0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(wz1Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new py1(wz1Var);
            kk0Var.l0(objP);
        }
        return (py1) objP;
    }
}

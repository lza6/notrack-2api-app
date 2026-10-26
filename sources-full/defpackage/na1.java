package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class na1 {
    public static final gn3 collectIsFocusedAsState(uq1 uq1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(Boolean.FALSE);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        int i2 = i & 14;
        int i3 = 0;
        boolean z = ((i2 ^ 6) > 4 && kk0Var.h(uq1Var)) || (i & 6) == 4;
        Object objP2 = kk0Var.P();
        if (z || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new ma1(uq1Var, mi2Var, null, i3);
            kk0Var.l0(objP2);
        }
        r11.LaunchedEffect(uq1Var, (ne1) objP2, kk0Var, i2);
        return mi2Var;
    }
}

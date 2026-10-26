package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class yy1 {
    public static final je1 rememberLazyGridItemProviderLambda(wz1 wz1Var, le1 le1Var, ck0 ck0Var, int i) {
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var, ck0Var, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(wz1Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            t73 t73Var = t73.x;
            ra1 ra1Var = new ra1(0, 1, gn3.class, cl3.c(new c9(cl3.c(new ap0(gn3VarRememberUpdatedState, 1), t73Var), 13, wz1Var), t73Var), "value", "getValue()Ljava/lang/Object;");
            kk0Var.l0(ra1Var);
            objP = ra1Var;
        }
        return (ou1) objP;
    }
}

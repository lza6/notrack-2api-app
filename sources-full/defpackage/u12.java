package defpackage;

import androidx.compose.runtime.Composer$Companion;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class u12 {
    public static final je1 rememberLazyListItemProviderLambda(g22 g22Var, le1 le1Var, ck0 ck0Var, int i) {
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var, ck0Var, (i >> 3) & 14);
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(g22Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            c02 c02Var = new c02();
            c02Var.a = new ct2(IntCompanionObject.MAX_VALUE);
            c02Var.b = new ct2(IntCompanionObject.MAX_VALUE);
            t73 t73Var = t73.x;
            ra1 ra1Var = new ra1(0, 2, gn3.class, cl3.c(new oh(cl3.c(new ap0(gn3VarRememberUpdatedState, 3), t73Var), g22Var, c02Var, 6), t73Var), "value", "getValue()Ljava/lang/Object;");
            kk0Var.l0(ra1Var);
            objP = ra1Var;
        }
        return (ou1) objP;
    }
}

package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class hc3 {
    public static final gc3 rememberScrollableState(le1 le1Var, ck0 ck0Var, int i) {
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var, ck0Var, i & 14);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            mt0 mt0Var = new mt0(new jz0(gn3VarRememberUpdatedState, 1));
            kk0Var.l0(mt0Var);
            objP = mt0Var;
        }
        return (gc3) objP;
    }
}

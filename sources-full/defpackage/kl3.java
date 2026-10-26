package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kl3 {
    public static final <T> gn3 rememberUpdatedState(T t, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(t);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        mi2Var.setValue(t);
        return mi2Var;
    }
}

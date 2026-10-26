package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class jl3 {
    public static final <T> gn3 collectAsState(hn3 hn3Var, xp0 xp0Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            xp0Var = x21.c;
        }
        return cl3.collectAsState(hn3Var, hn3Var.getValue(), xp0Var, ck0Var, (i & 14) | ((i << 3) & 896), 0);
    }

    public static final <T extends R, R> gn3 collectAsState(k81 k81Var, R r, xp0 xp0Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            xp0Var = x21.c;
        }
        xp0 xp0Var2 = xp0Var;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zJ = kk0Var.j(xp0Var2) | kk0Var.j(k81Var);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new il3(xp0Var2, k81Var, null, 0);
            kk0Var.l0(objP);
        }
        return cl3.produceState(r, k81Var, xp0Var2, (ne1) objP, kk0Var, ((i >> 3) & 14) | ((i << 3) & 112) | (i & 896));
    }
}

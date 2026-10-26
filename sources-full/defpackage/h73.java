package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class h73 {
    public static final t64 a = new t64(15, c11.d, 2);

    @cv0
    /* JADX INFO: renamed from: rememberRipple-9IZ8Weo, reason: not valid java name */
    public static final vn1 m205x1702383(boolean z, float f, long j, ck0 ck0Var, int i, int i2) {
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            f = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            j = re0.i;
        }
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(new re0(j), ck0Var, (i >> 6) & 14);
        boolean z3 = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).i(z)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !((kk0) ck0Var).e(f)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z4 || objP == Composer$Companion.getEmpty()) {
            objP = new gw2(z, f, gn3VarRememberUpdatedState);
            kk0Var.l0(objP);
        }
        return (gw2) objP;
    }
}

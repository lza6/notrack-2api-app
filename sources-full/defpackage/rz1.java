package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class rz1 {
    public static final int a(kz1 kz1Var, nq2 nq2Var) {
        return (int) (nq2Var == nq2.c ? kz1Var.q & 4294967295L : kz1Var.q >> 32);
    }

    public static final int b(kz1 kz1Var, nq2 nq2Var) {
        return (int) (nq2Var == nq2.c ? kz1Var.p & 4294967295L : kz1Var.p >> 32);
    }

    public static final w71 rememberSnapFlingBehavior(wz1 wz1Var, nk3 nk3Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            nk3Var = bg1.A;
        }
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(wz1Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new qz1(wz1Var, nk3Var);
            kk0Var.l0(objP);
        }
        return lk3.rememberSnapFlingBehavior((mk3) objP, kk0Var, 0);
    }
}

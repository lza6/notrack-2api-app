package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class a02 {
    public static final jz1 a = new jz1(null, 0, false, 0.0f, new xz1(0), 0.0f, false, yo4.a(x21.c), sf3.a(), 0, fl1.t, z21.c, 0, 0, 0, false, nq2.c, 0, 0);

    public static final wz1 rememberLazyGridState(int i, int i2, ck0 ck0Var, int i3, int i4) {
        int i5 = 0;
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        fp1 fp1Var = wz1.w;
        boolean z = true;
        boolean z2 = (((i3 & 14) ^ 6) > 4 && ((kk0) ck0Var).f(i)) || (i3 & 6) == 4;
        if ((((i3 & 112) ^ 48) <= 32 || !((kk0) ck0Var).f(i2)) && (i3 & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z3 || objP == Composer$Companion.getEmpty()) {
            objP = new yz1(i, i2, i5);
            kk0Var.l0(objP);
        }
        return (wz1) d53.rememberSaveable(objArr, (x93) fp1Var, (String) null, (je1) objP, (ck0) kk0Var, 0, 4);
    }

    public static final wz1 rememberLazyGridState(int i, int i2, mz1 mz1Var, ck0 ck0Var, int i3, int i4) {
        int i5 = 0;
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            kk0 kk0Var = (kk0) ck0Var;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new bt0();
                kk0Var.l0(objP);
            }
            mz1Var = (mz1) objP;
        }
        Object[] objArr = {mz1Var};
        fp1 fp1Var = wz1.w;
        fp1 fp1VarJ = yo4.J(pe.E, new e8(19, mz1Var));
        boolean z = true;
        boolean z2 = ((((i3 & 14) ^ 6) > 4 && ((kk0) ck0Var).f(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && ((kk0) ck0Var).f(i2)) || (i3 & 48) == 32);
        if ((((i3 & 896) ^ 384) <= 256 || !((kk0) ck0Var).j(mz1Var)) && (i3 & 384) != 256) {
            z = false;
        }
        boolean z3 = z2 | z;
        kk0 kk0Var2 = (kk0) ck0Var;
        Object objP2 = kk0Var2.P();
        if (z3 || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new zz1(mz1Var, i, i2, i5);
            kk0Var2.l0(objP2);
        }
        return (wz1) d53.rememberSaveable(objArr, (x93) fp1VarJ, (String) null, (je1) objP2, (ck0) kk0Var2, 0, 4);
    }
}

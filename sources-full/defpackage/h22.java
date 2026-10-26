package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class h22 {
    public static final z12 a = new z12(null, 0, false, 0.0f, new xz1(1), 0.0f, false, yo4.a(x21.c), sf3.a(), wm0.b(0, 0, 15), z21.c, 0, 0, 0, false, nq2.c, 0, 0);

    public static final g22 rememberLazyListState(int i, int i2, b22 b22Var, ck0 ck0Var, int i3, int i4) {
        Object obj;
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
                obj = objP;
                dt0 dt0Var = new dt0();
                dt0Var.a = -1;
                kk0Var.l0(dt0Var);
                obj = dt0Var;
            }
            obj = objP;
            b22Var = (b22) obj;
        }
        Object[] objArr = {b22Var};
        fp1 fp1Var = g22.w;
        fp1 fp1VarJ = yo4.J(pe.G, new e8(25, b22Var));
        int i5 = 1;
        boolean z = ((((i3 & 14) ^ 6) > 4 && ((kk0) ck0Var).f(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && ((kk0) ck0Var).f(i2)) || (i3 & 48) == 32) | ((((i3 & 896) ^ 384) > 256 && ((kk0) ck0Var).j(b22Var)) || (i3 & 384) == 256);
        kk0 kk0Var2 = (kk0) ck0Var;
        Object objP2 = kk0Var2.P();
        if (z || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new zz1(b22Var, i, i2, i5);
            kk0Var2.l0(objP2);
        }
        return (g22) d53.rememberSaveable(objArr, (x93) fp1VarJ, (String) null, (je1) objP2, (ck0) kk0Var2, 0, 4);
    }

    public static final g22 rememberLazyListState(int i, int i2, ck0 ck0Var, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        fp1 fp1Var = g22.w;
        int i5 = 1;
        boolean z = ((((i3 & 14) ^ 6) > 4 && ((kk0) ck0Var).f(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && ((kk0) ck0Var).f(i2)) || (i3 & 48) == 32);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new yz1(i, i2, i5);
            kk0Var.l0(objP);
        }
        return (g22) d53.rememberSaveable(objArr, (x93) fp1Var, (String) null, (je1) objP, (ck0) kk0Var, 0, 4);
    }
}

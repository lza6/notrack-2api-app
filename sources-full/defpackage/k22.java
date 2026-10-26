package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class k22 {
    public static final void LazySaveableStateHolderProvider(oe1 oe1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(674185128);
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(oe1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            un3 un3Var = i93.a;
            Object obj = (g93) kk0Var.l(un3Var);
            Object objRememberSaveableStateHolder = e93.rememberSaveableStateHolder(kk0Var, 0);
            Object[] objArr = {obj};
            pe peVar = pe.H;
            rc rcVar = new rc(obj, 26, objRememberSaveableStateHolder);
            fp1 fp1Var = z93.a;
            fp1 fp1Var2 = new fp1(peVar, rcVar);
            boolean zJ = kk0Var.j(obj) | kk0Var.j(objRememberSaveableStateHolder);
            Object objP = kk0Var.P();
            if (zJ || objP == Composer$Companion.getEmpty()) {
                objP = new c9(obj, 14, objRememberSaveableStateHolder);
                kk0Var.l0(objP);
            }
            i22 i22Var = (i22) d53.rememberSaveable(objArr, (x93) fp1Var2, (String) null, (je1) objP, (ck0) kk0Var, 0, 4);
            yk0.CompositionLocalProvider(un3Var.c(i22Var), zg0.rememberComposableLambda(1863926504, true, new j22(oe1Var, i22Var), kk0Var, 54), kk0Var, 56);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uw(i, 3, oe1Var));
        }
    }
}

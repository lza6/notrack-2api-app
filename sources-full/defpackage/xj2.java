package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class xj2 {
    public static final void DrawerPredictiveBackHandler(h01 h01Var, oe1 oe1Var, ck0 ck0Var, int i) {
        int i2;
        Object wj2Var;
        boolean z;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1444817207);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(h01Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(oe1Var) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 19) == 18 && kk0Var.F()) {
            kk0Var.V();
        } else {
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new e01();
                kk0Var.l0(objP);
            }
            e01 e01Var = (e01) objP;
            Object objP2 = kk0Var.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                al0 al0Var = new al0(r11.a(x21.c, kk0Var));
                kk0Var.l0(al0Var);
                objP2 = al0Var;
            }
            gq0 gq0Var = ((al0) objP2).c;
            boolean z2 = kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection()) == dx1.d;
            n43 n43Var = new n43();
            n43 n43Var2 = new n43();
            n43 n43Var3 = new n43();
            wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
            n43Var.c = wu0Var.w(12.0f);
            n43Var2.c = wu0Var.w(24.0f);
            n43Var3.c = wu0Var.w(48.0f);
            boolean zC = h01Var.c();
            int i4 = i3 & 14;
            boolean zI = kk0Var.i(z2) | kk0Var.e(n43Var.c) | kk0Var.e(n43Var2.c) | kk0Var.e(n43Var3.c) | kk0Var.j(gq0Var) | (i4 == 4);
            Object objP3 = kk0Var.P();
            if (zI || objP3 == Composer$Companion.getEmpty()) {
                z = zC;
                wj2Var = new wj2(e01Var, gq0Var, h01Var, z2, n43Var, n43Var2, n43Var3, null);
                kk0Var.l0(wj2Var);
            } else {
                z = zC;
                wj2Var = objP3;
            }
            cy2.PredictiveBackHandler(z, (ne1) wj2Var, kk0Var, 0, 0);
            Boolean boolValueOf = Boolean.valueOf(((i01) ((ft2) h01Var.a.g).getValue()) == i01.c);
            boolean z3 = i4 == 4;
            Object objP4 = kk0Var.P();
            if (z3 || objP4 == Composer$Companion.getEmpty()) {
                objP4 = new h2(h01Var, e01Var, null, 7);
                kk0Var.l0(objP4);
            }
            r11.LaunchedEffect(boolValueOf, (ne1) objP4, kk0Var, 0);
            oe1Var.invoke(e01Var, kk0Var, Integer.valueOf((i3 & 112) | 6));
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 10, h01Var, oe1Var));
        }
    }
}

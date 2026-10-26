package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class fz3 {
    public static final ez3 rememberTextMeasurer(int i, ck0 ck0Var, int i2, int i3) {
        boolean z = true;
        if ((i3 & 1) != 0) {
            i = 8;
        }
        kk0 kk0Var = (kk0) ck0Var;
        kb1 kb1Var = (kb1) kk0Var.l(CompositionLocalsKt.getLocalFontFamilyResolver());
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        dx1 dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
        boolean zH = kk0Var.h(kb1Var) | kk0Var.h(wu0Var) | kk0Var.h(dx1Var);
        if ((((i2 & 14) ^ 6) <= 4 || !kk0Var.f(i)) && (i2 & 6) != 4) {
            z = false;
        }
        boolean z2 = zH | z;
        Object objP = kk0Var.P();
        if (z2 || objP == Composer$Companion.getEmpty()) {
            objP = new ez3(kb1Var, wu0Var, dx1Var, i);
            kk0Var.l0(objP);
        }
        return (ez3) objP;
    }
}

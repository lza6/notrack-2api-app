package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class fh3 {
    public static final t64 a = kr1.o0(300, 0, c11.a, 2);

    public static final hh3 rememberSheetState(boolean z, le1 le1Var, ih3 ih3Var, boolean z2, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            le1Var = ba3.E;
        }
        if ((i2 & 4) != 0) {
            ih3Var = ih3.c;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        kk0 kk0Var = (kk0) ck0Var;
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {Boolean.valueOf(z), le1Var, Boolean.valueOf(z2)};
        bf3 bf3Var = bf3.y;
        gh3 gh3Var = new gh3(z, wu0Var, le1Var, z2);
        fp1 fp1Var = z93.a;
        fp1 fp1Var2 = new fp1(bf3Var, gh3Var);
        boolean zH = ((((i & 14) ^ 6) > 4 && kk0Var.i(z)) || (i & 6) == 4) | kk0Var.h(wu0Var) | ((((i & 896) ^ 384) > 256 && kk0Var.h(ih3Var)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && kk0Var.h(le1Var)) || (i & 48) == 32) | ((((i & 7168) ^ 3072) > 2048 && kk0Var.i(z2)) || (i & 3072) == 2048);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            eh3 eh3Var = new eh3(z, wu0Var, ih3Var, le1Var, z2);
            kk0Var.l0(eh3Var);
            objP = eh3Var;
        }
        return (hh3) d53.rememberSaveable(objArr, (x93) fp1Var2, (String) null, (je1) objP, (ck0) kk0Var, 0, 4);
    }
}

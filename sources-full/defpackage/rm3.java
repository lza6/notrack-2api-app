package defpackage;

import android.view.ViewConfiguration;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class rm3 {
    public static final float a = ViewConfiguration.getScrollFriction();

    public static final <T> zr0 rememberSplineBasedDecay(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        boolean zE = kk0Var.e(wu0Var.getDensity());
        Object objP = kk0Var.P();
        if (zE || objP == Composer$Companion.getEmpty()) {
            objP = new as0(new sk3(wu0Var));
            kk0Var.l0(objP);
        }
        return (zr0) objP;
    }
}

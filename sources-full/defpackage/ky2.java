package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class ky2 {
    public static final rn0 a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = lowerCase.equals("robolectric") ? new rn0(23) : null;
    }

    public static final jy2 rememberDefaultPrefetchScheduler(ck0 ck0Var, int i) {
        rn0 rn0Var = a;
        if (rn0Var != null) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(1213893039);
            kk0Var.r(false);
            return rn0Var;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(1213931944);
        View view = (View) kk0Var2.l(AndroidCompositionLocals_androidKt.getLocalView());
        boolean zH = kk0Var2.h(view);
        Object objP = kk0Var2.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new ad(view);
            kk0Var2.l0(objP);
        }
        ad adVar = (ad) objP;
        kk0Var2.r(false);
        return adVar;
    }
}

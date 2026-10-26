package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class uo3 {
    /* JADX INFO: renamed from: getString-2EP1pXo, reason: not valid java name */
    public static final String m1830xa862b2cd(int i, ck0 ck0Var, int i2) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.l(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        return ((Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext())).getResources().getString(i);
    }

    /* JADX INFO: renamed from: getString-qBjtwXw, reason: not valid java name */
    public static final String m1831xa979b035(int i, Object[] objArr, ck0 ck0Var, int i2) {
        String strM1830xa862b2cd = m1830xa862b2cd(i, ck0Var, i2 & 14);
        Locale localeB = new i72(new j72(((Configuration) ((kk0) ck0Var).l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales())).b(0);
        if (localeB == null) {
            localeB = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(localeB, strM1830xa862b2cd, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}

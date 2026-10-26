package defpackage;

import androidx.compose.runtime.Composer$Companion;
import app.template.extension.BuildConfig;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class by3 {
    public static final List a(jz3 jz3Var, oi2 oi2Var) {
        if (oi2Var != null && oi2Var.h != 0) {
            return ke0.O0(oi2Var.h());
        }
        if (jz3Var != null) {
            long j = jz3Var.a;
            if (!jz3.c(j)) {
                return kr1.T(new gg(jz3.f(j), jz3.e(j), new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, tt3.c, (pg3) null, 61439)));
            }
        }
        return z21.c;
    }

    /* JADX INFO: renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final ay3 m164x849944f4(String str, long j, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = BuildConfig.VERSION_NAME;
        }
        int i3 = 2;
        if ((i2 & 2) != 0) {
            int length = str.length();
            j = p23.d(length, length);
        }
        Object[] objArr = new Object[0];
        t73 t73Var = t73.B;
        boolean z = ((((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((kk0) ck0Var).g(j)) || (i & 48) == 32);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new ae(i3, j, str);
            kk0Var.l0(objP);
        }
        return (ay3) d53.rememberSaveable(objArr, (x93) t73Var, (String) null, (je1) objP, (ck0) kk0Var, 48, 4);
    }
}

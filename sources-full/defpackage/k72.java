package defpackage;

import android.content.res.Configuration;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class k72 {
    public static final uz3 a(uz3 uz3Var, eb3 eb3Var) {
        float f;
        long jL;
        if (eb3Var == eb3.c) {
            return uz3Var;
        }
        long j = uz3Var.a.b;
        long jD = gm4.D(0);
        long j2 = 1095216660480L & j;
        if (j2 == 0) {
            jL = uz3Var.b.c;
        } else {
            int iOrdinal = eb3Var.ordinal();
            if (iOrdinal != 0) {
                f = 1.55f;
                if (iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        u41.e();
                        return null;
                    }
                    f = 1.65f;
                }
            } else {
                f = 1.34f;
            }
            gm4.j(j);
            jL = gm4.L(yz3.c(j) * f, j2);
        }
        return uz3.a(uz3Var, 0L, 0L, null, null, jD, 0, jL, new jw2(true), null, 16121727);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    public static final m74 rememberLocalizedTypography(m74 m74Var, ck0 ck0Var, int i) {
        String language;
        eb3 eb3Var;
        m74 m74Var2 = m74Var;
        m74Var2.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        Locale locale = ((Configuration) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalConfiguration())).getLocales().get(0);
        if (locale == null || (language = locale.getLanguage()) == null) {
            language = "en";
        }
        boolean zH = kk0Var.h(language);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            String lowerCase = language.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            eb3 eb3Var2 = eb3.c;
            switch (lowerCase) {
                case "ar":
                    eb3Var = eb3.d;
                    break;
                case "bn":
                    eb3Var = eb3.h;
                    break;
                case "fa":
                case "he":
                    eb3Var = eb3.d;
                    break;
                case "hi":
                    eb3Var = eb3.h;
                    break;
                case "ja":
                case "ko":
                    eb3Var = eb3.l;
                    break;
                case "mr":
                case "ne":
                case "pa":
                    eb3Var = eb3.h;
                    break;
                case "ps":
                case "ur":
                    eb3Var = eb3.d;
                    break;
                case "zh":
                case "yue":
                    eb3Var = eb3.l;
                    break;
                default:
                    eb3Var = eb3Var2;
                    break;
            }
            if (eb3Var != eb3Var2) {
                m74Var2 = new m74(a(m74Var2.a, eb3Var), a(m74Var2.b, eb3Var), a(m74Var2.c, eb3Var), a(m74Var2.d, eb3Var), a(m74Var2.e, eb3Var), a(m74Var2.f, eb3Var), a(m74Var2.g, eb3Var), a(m74Var2.h, eb3Var), a(m74Var2.i, eb3Var), a(m74Var2.j, eb3Var), a(m74Var2.k, eb3Var), a(m74Var2.l, eb3Var), a(m74Var2.m, eb3Var), a(m74Var2.n, eb3Var), a(m74Var2.o, eb3Var));
            }
            kk0Var.l0(m74Var2);
            objP = m74Var2;
        }
        return (m74) objP;
    }
}

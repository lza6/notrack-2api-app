package defpackage;

import android.os.Build;
import java.util.Locale;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class oy {
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            k1.b(30);
        }
        if (i >= 30) {
            k1.b(31);
        }
        if (i >= 30) {
            k1.b(33);
        }
        if (i >= 30) {
            k1.b(DurationKt.NANOS_IN_MILLIS);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            return true;
        }
        if (i < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        String upperCase2 = "VanillaIceCream".toUpperCase(locale);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }
}

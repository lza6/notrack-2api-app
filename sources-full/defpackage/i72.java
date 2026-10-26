package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i72 {
    public static final i72 b = new i72(new j72(new LocaleList(new Locale[0])));
    public final j72 a;

    public i72(j72 j72Var) {
        this.a = j72Var;
    }

    public static i72 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = h72.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new i72(new j72(new LocaleList(localeArr)));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i72) {
            return this.a.equals(((i72) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}

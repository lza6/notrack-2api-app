package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class qi {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static i72 b(Configuration configuration) {
        return i72.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(i72 i72Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(i72Var.a.a.toLanguageTags()));
    }

    public static void d(Configuration configuration, i72 i72Var) {
        configuration.setLocales(LocaleList.forLanguageTags(i72Var.a.a.toLanguageTags()));
    }
}

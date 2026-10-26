package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class f72 {
    public final Locale a;

    public f72(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f72)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return kr1.n(this.a.toLanguageTag(), ((f72) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}

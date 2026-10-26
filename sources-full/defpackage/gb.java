package defpackage;

import androidx.compose.ui.text.font.a;

/* JADX INFO: loaded from: classes.dex */
public final class gb implements a {
    public final int c;

    public gb(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb) && this.c == ((gb) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return fq2.p(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.c, ')');
    }
}

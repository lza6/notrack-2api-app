package defpackage;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class an1 {
    public final Resources.Theme a;
    public final int b;

    public an1(Resources.Theme theme, int i) {
        this.a = theme;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof an1)) {
            return false;
        }
        an1 an1Var = (an1) obj;
        return kr1.n(this.a, an1Var.a) && this.b == an1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.a);
        sb.append(", id=");
        return fq2.p(sb, this.b, ')');
    }
}

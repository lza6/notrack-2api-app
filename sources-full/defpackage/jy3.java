package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jy3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof jy3) {
            return this.a == ((jy3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "TextHighlightType(value=" + this.a + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gc1 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gc1) {
            return this.a == ((gc1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}

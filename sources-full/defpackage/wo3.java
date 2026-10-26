package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wo3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof wo3) {
            return this.a == ((wo3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Butt";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Square" : "Unknown";
    }
}

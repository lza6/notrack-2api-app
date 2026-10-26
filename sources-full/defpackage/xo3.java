package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xo3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof xo3) {
            return this.a == ((xo3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "Miter";
        }
        if (i == 1) {
            return "Round";
        }
        return i == 2 ? "Bevel" : "Unknown";
    }
}

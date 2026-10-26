package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hc1) {
            return this.a == ((hc1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}

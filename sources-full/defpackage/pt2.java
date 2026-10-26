package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pt2 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof pt2) {
            return this.a == ((pt2) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 0) {
            return "NonZero";
        }
        return i == 1 ? "EvenOdd" : "Unknown";
    }
}

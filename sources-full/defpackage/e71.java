package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e71 {
    public final int a;

    public static String a(int i) {
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Low";
        }
        if (i == 2) {
            return "Medium";
        }
        return i == 3 ? "High" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e71) {
            return this.a == ((e71) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}

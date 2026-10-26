package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hz3 {
    public static final hz3 c = new hz3(2, false);
    public static final hz3 d = new hz3(1, true);
    public final int a;
    public final boolean b;

    public hz3(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3Var = (hz3) obj;
        return this.a == hz3Var.a && this.b == hz3Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return "TextMotion.Static";
        }
        return equals(d) ? "TextMotion.Animated" : "Invalid";
    }
}

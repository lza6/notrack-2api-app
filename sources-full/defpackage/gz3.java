package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gz3 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gz3) {
            return this.a == ((gz3) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gp1 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof gp1) {
            return this.a == ((gp1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}

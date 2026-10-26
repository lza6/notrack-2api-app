package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b42 {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof b42) {
            return this.a == ((b42) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}

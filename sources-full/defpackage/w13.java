package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w13 implements z13 {
    public final String a;
    public final String b;

    public w13(String str) {
        this.a = str;
        this.b = null;
    }

    public w13(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w13)) {
            return false;
        }
        w13 w13Var = (w13) obj;
        return kr1.n(this.a, w13Var.a) && kr1.n(this.b, w13Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Failed(code=" + this.a + ", message=" + this.b + ")";
    }
}

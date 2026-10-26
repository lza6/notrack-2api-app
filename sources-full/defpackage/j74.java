package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j74 {
    public final lb1 a;
    public final ic1 b;
    public final int c;
    public final int d;
    public final Object e;

    public j74(lb1 lb1Var, ic1 ic1Var, int i, int i2, Object obj) {
        this.a = lb1Var;
        this.b = ic1Var;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j74)) {
            return false;
        }
        j74 j74Var = (j74) obj;
        return kr1.n(this.a, j74Var.a) && kr1.n(this.b, j74Var.b) && this.c == j74Var.c && this.d == j74Var.d && kr1.n(this.e, j74Var.e);
    }

    public final int hashCode() {
        lb1 lb1Var = this.a;
        int iE = fq2.e(this.d, fq2.e(this.c, (((lb1Var == null ? 0 : lb1Var.hashCode()) * 31) + this.b.c) * 31, 31), 31);
        Object obj = this.e;
        return iE + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i = this.c;
        if (i == 0) {
            str = "Normal";
        } else {
            str = i == 1 ? "Italic" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i2 = this.d;
        if (i2 == 0) {
            str2 = "None";
        } else if (i2 == 1) {
            str2 = "Weight";
        } else if (i2 == 2) {
            str2 = "Style";
        } else if (i2 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}

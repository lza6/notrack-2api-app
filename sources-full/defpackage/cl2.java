package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cl2 {
    public final String a;
    public final String b;
    public final yk2 c;
    public final g61 d;

    public cl2(String str, String str2, yk2 yk2Var, g61 g61Var) {
        this.a = str;
        this.b = str2;
        this.c = yk2Var;
        this.d = g61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl2)) {
            return false;
        }
        cl2 cl2Var = (cl2) obj;
        return this.a.equals(cl2Var.a) && kr1.n(this.b, cl2Var.b) && this.c.equals(cl2Var.c) && kr1.n(this.d, cl2Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.a.hashCode() + ud2.i(this.a.hashCode() * 31, 31, this.b)) * 961);
    }

    public final String toString() {
        return "NetworkRequest(url=" + this.a + ", method=" + this.b + ", headers=" + this.c + ", body=null, extras=" + this.d + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl3 implements r61 {
    public final wm1 a;
    public final String b;
    public final qr0 c;

    public xl3(wm1 wm1Var, String str, qr0 qr0Var) {
        this.a = wm1Var;
        this.b = str;
        this.c = qr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xl3)) {
            return false;
        }
        xl3 xl3Var = (xl3) obj;
        return kr1.n(this.a, xl3Var.a) && kr1.n(this.b, xl3Var.b) && this.c == xl3Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ')';
    }
}

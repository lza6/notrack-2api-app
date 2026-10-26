package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s31 {
    public final am1 a;
    public final boolean b;
    public final qr0 c;
    public final String d;

    public s31(am1 am1Var, boolean z, qr0 qr0Var, String str) {
        this.a = am1Var;
        this.b = z;
        this.c = qr0Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s31)) {
            return false;
        }
        s31 s31Var = (s31) obj;
        return kr1.n(this.a, s31Var.a) && this.b == s31Var.b && this.c == s31Var.c && kr1.n(this.d, s31Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ud2.k(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExecuteResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        sb.append(this.b);
        sb.append(", dataSource=");
        sb.append(this.c);
        sb.append(", diskCacheKey=");
        return ud2.r(sb, this.d, ')');
    }
}

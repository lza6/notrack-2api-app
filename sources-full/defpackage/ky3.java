package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ky3 {
    public static final ky3 c = new ky3(gm4.D(0), gm4.D(0));
    public final long a;
    public final long b;

    public ky3(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky3)) {
            return false;
        }
        ky3 ky3Var = (ky3) obj;
        return yz3.a(this.a, ky3Var.a) && yz3.a(this.b, ky3Var.b);
    }

    public final int hashCode() {
        zz3[] zz3VarArr = yz3.b;
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) yz3.d(this.a)) + ", restLine=" + ((Object) yz3.d(this.b)) + ')';
    }
}

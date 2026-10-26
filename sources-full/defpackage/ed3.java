package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ed3 {
    public final u53 a;
    public final int b;
    public final long c;

    public ed3(u53 u53Var, int i, long j) {
        this.a = u53Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed3)) {
            return false;
        }
        ed3 ed3Var = (ed3) obj;
        return this.a == ed3Var.a && this.b == ed3Var.b && this.c == ed3Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + fq2.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.a + ", offset=" + this.b + ", selectableId=" + this.c + ')';
    }
}

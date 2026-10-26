package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ex1 {
    public final int a;
    public final int b;
    public final boolean c;

    public ex1(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex1)) {
            return false;
        }
        ex1 ex1Var = (ex1) obj;
        return this.a == ex1Var.a && this.b == ex1Var.b && this.c == ex1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + fq2.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "BidiRun(start=" + this.a + ", end=" + this.b + ", isRtl=" + this.c + ')';
    }
}

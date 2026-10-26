package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm1 implements r61 {
    public final am1 a;
    public final boolean b;
    public final qr0 c;

    public dm1(am1 am1Var, boolean z, qr0 qr0Var) {
        this.a = am1Var;
        this.b = z;
        this.c = qr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm1)) {
            return false;
        }
        dm1 dm1Var = (dm1) obj;
        return this.a.equals(dm1Var.a) && this.b == dm1Var.b && this.c == dm1Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ud2.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ImageFetchResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ')';
    }
}

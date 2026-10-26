package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw1 {
    public final Float a;
    public b11 b;

    public aw1(Float f, b11 b11Var) {
        this.a = f;
        this.b = b11Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aw1)) {
            return false;
        }
        aw1 aw1Var = (aw1) obj;
        return aw1Var.a.equals(this.a) && kr1.n(aw1Var.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + fq2.e(0, this.a.hashCode() * 31, 31);
    }
}

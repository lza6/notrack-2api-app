package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class d83 {
    public float a = 0.0f;
    public boolean b = true;
    public qq0 c = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d83)) {
            return false;
        }
        d83 d83Var = (d83) obj;
        return Float.compare(this.a, d83Var.a) == 0 && this.b == d83Var.b && kr1.n(this.c, d83Var.c);
    }

    public final int hashCode() {
        int iK = ud2.k(Float.hashCode(this.a) * 31, 31, this.b);
        qq0 qq0Var = this.c;
        return (iK + (qq0Var == null ? 0 : qq0Var.s.hashCode())) * 31;
    }

    public final String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }
}

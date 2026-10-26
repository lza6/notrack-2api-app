package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t10 extends v10 {
    public final String a;
    public final y10 b;

    public t10(String str, y10 y10Var) {
        this.a = str;
        this.b = y10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t10)) {
            return false;
        }
        t10 t10Var = (t10) obj;
        return this.a.equals(t10Var.a) && this.b.equals(t10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Done(text=" + this.a + ", quota=" + this.b + ")";
    }
}

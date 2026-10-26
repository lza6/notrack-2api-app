package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ai3 {
    public static final ai3 c;
    public final bw0 a;
    public final bw0 b;

    static {
        aw0 aw0Var = aw0.a;
        c = new ai3(aw0Var, aw0Var);
    }

    public ai3(bw0 bw0Var, bw0 bw0Var2) {
        this.a = bw0Var;
        this.b = bw0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ai3)) {
            return false;
        }
        ai3 ai3Var = (ai3) obj;
        return this.a.equals(ai3Var.a) && this.b.equals(ai3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ')';
    }
}

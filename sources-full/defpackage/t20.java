package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t20 {
    public final yt a;
    public final le1 b;
    public final o71 c;

    public t20(yt ytVar, o71 o71Var, le1 le1Var) {
        this.a = ytVar;
        this.b = le1Var;
        this.c = o71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t20)) {
            return false;
        }
        t20 t20Var = (t20) obj;
        return this.a.equals(t20Var.a) && this.b.equals(t20Var.b) && kr1.n(this.c, t20Var.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}

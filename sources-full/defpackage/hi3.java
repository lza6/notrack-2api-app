package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hi3 {
    public final le1 a;
    public final o71 b;

    public hi3(le1 le1Var, o71 o71Var) {
        this.a = le1Var;
        this.b = o71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hi3)) {
            return false;
        }
        hi3 hi3Var = (hi3) obj;
        return this.a.equals(hi3Var.a) && this.b.equals(hi3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}

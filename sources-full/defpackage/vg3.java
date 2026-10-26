package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vg3 {
    public final y73 a;
    public final y73 b;
    public final y73 c;
    public final y73 d;
    public final y73 e;

    public vg3() {
        y73 y73Var = sg3.a;
        y73 y73Var2 = sg3.b;
        y73 y73Var3 = sg3.c;
        y73 y73Var4 = sg3.d;
        y73 y73Var5 = sg3.e;
        this.a = y73Var;
        this.b = y73Var2;
        this.c = y73Var3;
        this.d = y73Var4;
        this.e = y73Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg3)) {
            return false;
        }
        vg3 vg3Var = (vg3) obj;
        return kr1.n(this.a, vg3Var.a) && kr1.n(this.b, vg3Var.b) && kr1.n(this.c, vg3Var.c) && kr1.n(this.d, vg3Var.d) && kr1.n(this.e, vg3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd3 {
    public final ed3 a;
    public final ed3 b;
    public final boolean c;

    public fd3(ed3 ed3Var, ed3 ed3Var2, boolean z) {
        this.a = ed3Var;
        this.b = ed3Var2;
        this.c = z;
    }

    public static fd3 a(fd3 fd3Var, ed3 ed3Var, ed3 ed3Var2, boolean z, int i) {
        if ((i & 1) != 0) {
            ed3Var = fd3Var.a;
        }
        if ((i & 2) != 0) {
            ed3Var2 = fd3Var.b;
        }
        if ((i & 4) != 0) {
            z = fd3Var.c;
        }
        fd3Var.getClass();
        return new fd3(ed3Var, ed3Var2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd3)) {
            return false;
        }
        fd3 fd3Var = (fd3) obj;
        return kr1.n(this.a, fd3Var.a) && kr1.n(this.b, fd3Var.b) && this.c == fd3Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.a + ", end=" + this.b + ", handlesCrossed=" + this.c + ')';
    }
}

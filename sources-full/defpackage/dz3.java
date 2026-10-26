package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz3 {
    public final em3 a;
    public final em3 b;
    public final em3 c;
    public final em3 d;

    public dz3(em3 em3Var, em3 em3Var2, em3 em3Var3, em3 em3Var4) {
        this.a = em3Var;
        this.b = em3Var2;
        this.c = em3Var3;
        this.d = em3Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof dz3)) {
            return false;
        }
        dz3 dz3Var = (dz3) obj;
        return kr1.n(this.a, dz3Var.a) && kr1.n(this.b, dz3Var.b) && kr1.n(this.c, dz3Var.c) && kr1.n(this.d, dz3Var.d);
    }

    public final int hashCode() {
        em3 em3Var = this.a;
        int iHashCode = (em3Var != null ? em3Var.hashCode() : 0) * 31;
        em3 em3Var2 = this.b;
        int iHashCode2 = (iHashCode + (em3Var2 != null ? em3Var2.hashCode() : 0)) * 31;
        em3 em3Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (em3Var3 != null ? em3Var3.hashCode() : 0)) * 31;
        em3 em3Var4 = this.d;
        return iHashCode3 + (em3Var4 != null ? em3Var4.hashCode() : 0);
    }
}

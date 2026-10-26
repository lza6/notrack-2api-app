package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gi4 {
    public String a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gi4)) {
            return false;
        }
        gi4 gi4Var = (gi4) obj;
        return kr1.n(this.a, gi4Var.a) && this.b == gi4Var.b;
    }

    public final int hashCode() {
        return fq2.z(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + ud2.z(this.b) + ')';
    }
}

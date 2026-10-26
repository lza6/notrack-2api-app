package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k42 extends m42 {
    public final String a;
    public final dz3 b;

    public k42(String str, dz3 dz3Var) {
        this.a = str;
        this.b = dz3Var;
    }

    @Override // defpackage.m42
    public final dz3 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k42)) {
            return false;
        }
        k42 k42Var = (k42) obj;
        return this.a.equals(k42Var.a) && kr1.n(this.b, k42Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dz3 dz3Var = this.b;
        return (iHashCode + (dz3Var != null ? dz3Var.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return ud2.r(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}

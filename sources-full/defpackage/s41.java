package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s41 implements tm1 {
    public final am1 a;
    public final pm1 b;
    public final Throwable c;

    public s41(am1 am1Var, pm1 pm1Var, Throwable th) {
        this.a = am1Var;
        this.b = pm1Var;
        this.c = th;
    }

    @Override // defpackage.tm1
    public final pm1 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s41)) {
            return false;
        }
        s41 s41Var = (s41) obj;
        return kr1.n(this.a, s41Var.a) && kr1.n(this.b, s41Var.b) && this.c.equals(s41Var.c);
    }

    public final int hashCode() {
        am1 am1Var = this.a;
        int iHashCode = am1Var == null ? 0 : am1Var.hashCode();
        return this.c.hashCode() + ((this.b.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ErrorResult(image=" + this.a + ", request=" + this.b + ", throwable=" + this.c + ')';
    }
}

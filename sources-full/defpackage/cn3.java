package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cn3 implements xb4 {
    public final xb4 c;
    public final long d;

    public cn3(xb4 xb4Var, long j) {
        this.c = xb4Var;
        this.d = j;
    }

    @Override // defpackage.xb4
    public final boolean a() {
        return this.c.a();
    }

    @Override // defpackage.xb4
    public final long b(cg cgVar, cg cgVar2, cg cgVar3) {
        return this.c.b(cgVar, cgVar2, cgVar3) + this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cn3)) {
            return false;
        }
        cn3 cn3Var = (cn3) obj;
        return cn3Var.d == this.d && kr1.n(cn3Var.c, this.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    @Override // defpackage.xb4
    public final cg s(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        long j2 = this.d;
        return j < j2 ? cgVar3 : this.c.s(j - j2, cgVar, cgVar2, cgVar3);
    }

    @Override // defpackage.xb4
    public final cg u(long j, cg cgVar, cg cgVar2, cg cgVar3) {
        long j2 = this.d;
        return j < j2 ? cgVar : this.c.u(j - j2, cgVar, cgVar2, cgVar3);
    }
}

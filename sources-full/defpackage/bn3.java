package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bn3 implements wf {
    public final wf a;
    public final long b;

    public bn3(o71 o71Var, long j) {
        this.a = o71Var;
        this.b = j;
    }

    @Override // defpackage.wf
    public final xb4 a(w64 w64Var) {
        return new cn3(this.a.a(w64Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bn3)) {
            return false;
        }
        bn3 bn3Var = (bn3) obj;
        return bn3Var.b == this.b && kr1.n(bn3Var.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}

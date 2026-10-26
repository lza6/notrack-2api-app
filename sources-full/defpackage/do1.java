package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class do1 implements wf {
    public final w01 a;
    public final k53 b;

    public do1(w01 w01Var, k53 k53Var) {
        this.a = w01Var;
        this.b = k53Var;
    }

    @Override // defpackage.wf
    public final xb4 a(w64 w64Var) {
        return new p33(this.a.a(w64Var), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof do1)) {
            return false;
        }
        do1 do1Var = (do1) obj;
        return do1Var.a.equals(this.a) && do1Var.b == this.b;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}

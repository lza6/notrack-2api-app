package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t64 implements w01 {
    public final int a;
    public final int b;
    public final b11 c;

    public t64(int i, int i2, b11 b11Var) {
        this.a = i;
        this.b = i2;
        this.c = b11Var;
    }

    public t64(int i, b11 b11Var, int i2) {
        this((i2 & 1) != 0 ? 300 : i, 0, (i2 & 4) != 0 ? c11.a : b11Var);
    }

    @Override // defpackage.wf
    public final xb4 a(w64 w64Var) {
        return new eu(this.a, this.b, this.c);
    }

    @Override // defpackage.w01, defpackage.wf
    public final zb4 a(w64 w64Var) {
        return new eu(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t64) {
            t64 t64Var = (t64) obj;
            if (t64Var.a == this.a && t64Var.b == this.b && kr1.n(t64Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }
}

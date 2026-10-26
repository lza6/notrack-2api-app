package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p63 implements nx0 {
    public final /* synthetic */ int c;
    public final /* synthetic */ t63 d;

    public /* synthetic */ p63(t63 t63Var, int i) {
        this.c = i;
        this.d = t63Var;
    }

    @Override // defpackage.nx0
    public final double c(double d) {
        int i = this.c;
        t63 t63Var = this.d;
        switch (i) {
            case 0:
                return py.v(t63Var.k.c(d), t63Var.e, t63Var.f);
            default:
                return t63Var.n.c(py.v(d, t63Var.e, t63Var.f));
        }
    }
}

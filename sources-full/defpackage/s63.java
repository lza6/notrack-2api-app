package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class s63 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ t63 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s63(t63 t63Var, int i) {
        super(1);
        this.c = i;
        this.d = t63Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        t63 t63Var = this.d;
        switch (i) {
            case 0:
                return Double.valueOf(t63Var.n.c(py.v(((Number) obj).doubleValue(), t63Var.e, t63Var.f)));
            default:
                return Double.valueOf(py.v(t63Var.k.c(((Number) obj).doubleValue()), t63Var.e, t63Var.f));
        }
    }
}

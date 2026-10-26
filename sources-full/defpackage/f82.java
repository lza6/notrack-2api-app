package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f82 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xt3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f82(xt3 xt3Var, int i) {
        super(1);
        this.c = i;
        this.d = xt3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        xt3 xt3Var = this.d;
        switch (i) {
            case 0:
                xt3Var.c(((ln2) obj).a);
                break;
            case 1:
                dx2 dx2Var = (dx2) obj;
                xt3Var.e(py.L(dx2Var, false));
                dx2Var.a();
                break;
            case 2:
                dx2 dx2Var2 = (dx2) obj;
                xt3Var.e(py.L(dx2Var2, false));
                dx2Var2.a();
                break;
            default:
                dx2 dx2Var3 = (dx2) obj;
                xt3Var.e(py.L(dx2Var3, false));
                dx2Var3.a();
                break;
        }
        return w84Var;
    }
}

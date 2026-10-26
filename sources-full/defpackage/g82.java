package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class g82 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xt3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g82(xt3 xt3Var, int i) {
        super(0);
        this.c = i;
        this.d = xt3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        xt3 xt3Var = this.d;
        switch (i) {
            case 0:
                xt3Var.a();
                break;
            default:
                xt3Var.onCancel();
                break;
        }
        return w84Var;
    }
}

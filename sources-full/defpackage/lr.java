package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lr extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lr(mr mrVar, int i) {
        super(0);
        this.c = i;
        this.d = mrVar;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        mr mrVar = this.d;
        switch (i) {
            case 0:
                mrVar.x0();
                break;
            default:
                nf2 nf2Var = mrVar.c;
                nf2Var.getClass();
                ((pf2) nf2Var).g(mrVar);
                break;
        }
        return w84Var;
    }
}

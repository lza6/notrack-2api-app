package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class se2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ te2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se2(te2 te2Var, int i) {
        super(1);
        this.c = i;
        this.d = te2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        te2 te2Var = this.d;
        switch (i) {
            case 0:
                if (te2Var.m.b) {
                    te2Var.l.invoke();
                }
                return w84.a;
            default:
                te2Var.show();
                return new g4(9, te2Var);
        }
    }
}

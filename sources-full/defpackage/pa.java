package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pa extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xv0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pa(xv0 xv0Var, int i) {
        super(1);
        this.c = i;
        this.d = xv0Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        xv0 xv0Var = this.d;
        switch (i) {
            case 0:
                xv0Var.show();
                return new g4(1, xv0Var);
            default:
                if (xv0Var.m.a) {
                    xv0Var.l.invoke();
                }
                return w84.a;
        }
    }
}

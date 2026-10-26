package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bx3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ho0 d;
    public final /* synthetic */ xw3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bx3(ho0 ho0Var, xw3 xw3Var, int i) {
        super(0);
        this.c = i;
        this.d = ho0Var;
        this.h = xw3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        ho0 ho0Var = this.d;
        xw3 xw3Var = this.h;
        switch (i) {
            case 0:
                xw3Var.d();
                gb2.p(ho0Var);
                break;
            case 1:
                xw3Var.b(false);
                gb2.p(ho0Var);
                break;
            case 2:
                xw3Var.m();
                gb2.p(ho0Var);
                break;
            case 3:
                xw3Var.n();
                gb2.p(ho0Var);
                break;
            default:
                je1 je1Var = xw3Var.g;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                gb2.p(ho0Var);
                break;
        }
        return w84Var;
    }
}

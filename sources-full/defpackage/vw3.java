package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vw3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ xw3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw3(xw3 xw3Var, int i) {
        super(0);
        this.c = i;
        this.d = xw3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        jq0 jq0Var = jq0.l;
        w84 w84Var = w84.a;
        xw3 xw3Var = this.d;
        switch (i) {
            case 0:
                je1 je1Var = xw3Var.g;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                break;
            case 1:
                gq0 gq0Var = xw3Var.i;
                if (gq0Var != null) {
                    py.F(gq0Var, null, jq0Var, new ww3(xw3Var, null, 0), 1);
                }
                xw3Var.l();
                break;
            case 2:
                gq0 gq0Var2 = xw3Var.i;
                if (gq0Var2 != null) {
                    py.F(gq0Var2, null, jq0Var, new ww3(xw3Var, null, 1), 1);
                }
                xw3Var.l();
                break;
            case 3:
                gq0 gq0Var3 = xw3Var.i;
                if (gq0Var3 != null) {
                    py.F(gq0Var3, null, jq0Var, new ww3(xw3Var, null, 2), 1);
                }
                xw3Var.l();
                break;
            default:
                xw3Var.n();
                break;
        }
        return w84Var;
    }
}

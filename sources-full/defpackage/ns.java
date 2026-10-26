package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ns extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wx3 d;
    public final /* synthetic */ wx3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns(wx3 wx3Var, wx3 wx3Var2, int i) {
        super(0);
        this.c = i;
        switch (i) {
            case 1:
                this.d = wx3Var;
                this.h = wx3Var2;
                super(0);
                break;
            default:
                this.d = wx3Var;
                this.h = wx3Var2;
                break;
        }
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        wx3 wx3Var = this.d;
        wx3 wx3Var2 = this.h;
        switch (i) {
            case 0:
                wx3Var2.v();
                wx3Var.x(vz3.h);
                break;
            default:
                je1 je1Var = wx3Var2.l;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                wx3Var.x(vz3.c);
                break;
        }
        return w84Var;
    }
}

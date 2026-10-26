package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kx3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ p43 d;
    public final /* synthetic */ p43 h;
    public final /* synthetic */ wx3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx3(p43 p43Var, p43 p43Var2, wx3 wx3Var, int i) {
        super(0);
        this.c = i;
        this.d = p43Var;
        this.h = p43Var2;
        this.l = wx3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kx3(p43 p43Var, wx3 wx3Var, p43 p43Var2, int i) {
        super(0);
        this.c = i;
        this.d = p43Var;
        this.l = wx3Var;
        this.h = p43Var2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        p43 p43Var = this.h;
        wx3 wx3Var = this.l;
        p43 p43Var2 = this.d;
        switch (i) {
            case 0:
                wx3.h(p43Var2, p43Var, wx3Var);
                break;
            case 1:
                wx3.h(p43Var2, p43Var, wx3Var);
                break;
            case 2:
                wx3.i(p43Var2, p43Var, wx3Var);
                break;
            default:
                wx3.i(p43Var2, p43Var, wx3Var);
                break;
        }
        return w84Var;
    }
}

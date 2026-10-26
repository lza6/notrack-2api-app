package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xx3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ho0 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ wx3 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xx3(ho0 ho0Var, ne1 ne1Var, wx3 wx3Var, int i) {
        super(0);
        this.c = i;
        this.d = ho0Var;
        this.h = ne1Var;
        this.l = wx3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        ho0 ho0Var = this.d;
        wx3 wx3Var = this.l;
        ne1 ne1Var = this.h;
        switch (i) {
            case 0:
                ne1Var.invoke(wx3Var, st3.Cut);
                gb2.p(ho0Var);
                break;
            case 1:
                ne1Var.invoke(wx3Var, st3.Copy);
                gb2.p(ho0Var);
                break;
            case 2:
                ne1Var.invoke(wx3Var, st3.Paste);
                gb2.p(ho0Var);
                break;
            case 3:
                ne1Var.invoke(wx3Var, st3.SelectAll);
                gb2.p(ho0Var);
                break;
            default:
                ne1Var.invoke(wx3Var, st3.Autofill);
                gb2.p(ho0Var);
                break;
        }
        return w84Var;
    }
}

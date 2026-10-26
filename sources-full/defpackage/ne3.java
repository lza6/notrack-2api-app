package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ne3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ho0 d;
    public final /* synthetic */ le3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne3(ho0 ho0Var, le3 le3Var, int i) {
        super(0);
        this.c = i;
        this.d = ho0Var;
        this.h = le3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        ho0 ho0Var = this.d;
        le3 le3Var = this.h;
        switch (i) {
            case 0:
                le3Var.b();
                gb2.p(ho0Var);
                break;
            default:
                le3Var.k();
                gb2.p(ho0Var);
                break;
        }
        return w84Var;
    }
}

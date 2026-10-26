package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e70 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ lh1 d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ e70(lh1 lh1Var, mi2 mi2Var, int i) {
        this.c = i;
        this.d = lh1Var;
        this.h = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.h;
        lh1 lh1Var = this.d;
        switch (i) {
            case 0:
                lh1Var.mo63x70bb4fce(0);
                wa0.d1(mi2Var, true);
                break;
            default:
                lh1Var.mo63x70bb4fce(0);
                mi2Var.setValue(Boolean.TRUE);
                break;
        }
        return w84Var;
    }
}

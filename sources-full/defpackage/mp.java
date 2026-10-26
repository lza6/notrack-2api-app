package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ mp(mi2 mi2Var, mi2 mi2Var2, int i) {
        this.c = i;
        this.d = mi2Var;
        this.h = mi2Var2;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.h;
        mi2 mi2Var2 = this.d;
        switch (i) {
            case 0:
                mi2Var2.setValue(null);
                mi2Var.setValue(null);
                break;
            case 1:
                mi2Var2.setValue(null);
                mi2Var.setValue(Boolean.FALSE);
                break;
            case 2:
                mi2Var2.setValue(Boolean.FALSE);
                mi2Var.setValue(Boolean.TRUE);
                break;
            case 3:
                mi2Var2.setValue(Boolean.FALSE);
                mi2Var.setValue(Boolean.TRUE);
                break;
            default:
                mi2Var2.setValue(Boolean.FALSE);
                mi2Var.setValue(Boolean.TRUE);
                break;
        }
        return w84Var;
    }
}

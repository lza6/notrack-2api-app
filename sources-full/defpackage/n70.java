package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n70 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ n70(le1 le1Var, mi2 mi2Var, int i) {
        this.c = i;
        this.d = le1Var;
        this.h = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.h;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                le1Var.invoke((String) mi2Var.getValue());
                break;
            case 1:
                le1Var.invoke((String) mi2Var.getValue());
                break;
            case 2:
                mi2Var.setValue(Boolean.FALSE);
                le1Var.invoke(null);
                break;
            default:
                le1Var.invoke(Boolean.valueOf(!((Boolean) mi2Var.getValue()).booleanValue()));
                break;
        }
        return w84Var;
    }
}

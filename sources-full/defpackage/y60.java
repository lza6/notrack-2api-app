package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y60 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ y60(le1 le1Var, mi2 mi2Var, int i) {
        this.c = i;
        this.d = le1Var;
        this.h = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.h;
        le1 le1Var = this.d;
        switch (i) {
            case 0:
                ey3 ey3Var = (ey3) obj;
                ey3Var.getClass();
                mi2Var.setValue(ey3Var);
                le1Var.invoke(ey3Var.a.d);
                break;
            default:
                ((vv1) obj).getClass();
                if (!mo3.C0((String) mi2Var.getValue())) {
                    le1Var.invoke((String) mi2Var.getValue());
                }
                break;
        }
        return w84Var;
    }
}

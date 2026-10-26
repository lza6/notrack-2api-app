package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m70 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ mi2 d;

    public /* synthetic */ m70(int i, mi2 mi2Var) {
        this.c = i;
        this.d = mi2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.d;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                mi2Var.setValue(str);
                break;
            case 1:
                ey3 ey3Var = (ey3) obj;
                ey3Var.getClass();
                mi2Var.setValue(ey3Var);
                break;
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                mi2Var.setValue(str2);
                break;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                mi2Var.setValue(str3);
                break;
            case 4:
                cb1 cb1Var = (cb1) obj;
                cb1Var.getClass();
                mi2Var.setValue(Boolean.valueOf(cb1Var.b()));
                break;
            case 5:
                mi2Var.setValue(Integer.valueOf((int) (((qq1) obj).a >> 32)));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                mi2Var.setValue(bool);
                break;
        }
        return w84Var;
    }
}

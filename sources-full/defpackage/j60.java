package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j60 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hb0 d;
    public final /* synthetic */ mi2 h;

    public /* synthetic */ j60(hb0 hb0Var, mi2 mi2Var, int i) {
        this.c = i;
        this.d = hb0Var;
        this.h = mi2Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        mi2 mi2Var = this.h;
        hb0 hb0Var = this.d;
        switch (i) {
            case 0:
                hb0Var.d0(false);
                wa0.g1(mi2Var, true);
                break;
            case 1:
                hb0Var.d0(false);
                mi2Var.setValue(Boolean.TRUE);
                break;
            case 2:
                mi2Var.setValue(Boolean.FALSE);
                hb0Var.P("me");
                break;
            case 3:
                wa0.h1(mi2Var, true);
                hb0Var.v();
                break;
            case 4:
                wa0.h1(mi2Var, true);
                hb0Var.v();
                break;
            case 5:
                wa0.h1(mi2Var, true);
                hb0Var.u();
                break;
            case 6:
                wa0.h1(mi2Var, true);
                hb0Var.u();
                break;
            case 7:
                mi2Var.setValue(Boolean.FALSE);
                hb0Var.u.o(null);
                break;
            case 8:
                mi2Var.setValue(Boolean.FALSE);
                hb0Var.s();
                break;
            case 9:
                mi2Var.setValue(Boolean.FALSE);
                hb0Var.s();
                hb0Var.P("me");
                break;
            case 10:
                hb0Var.z("click", "chatbg_gate", "chatbg_app");
                hb0Var.k();
                mi2Var.setValue(Boolean.TRUE);
                break;
            case 11:
                hb0Var.z("click", "chatbg_gate", "chatbg_app");
                hb0Var.k();
                mi2Var.setValue(Boolean.TRUE);
                break;
            case 12:
                hb0Var.p();
                mi2Var.setValue(Boolean.TRUE);
                break;
            case 13:
                hb0Var.p();
                mi2Var.setValue(Boolean.TRUE);
                break;
            case 14:
                hb0Var.K();
                mi2Var.setValue(Boolean.TRUE);
                break;
            default:
                hb0Var.K();
                mi2Var.setValue(Boolean.TRUE);
                break;
        }
        return w84Var;
    }
}

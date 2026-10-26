package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x91 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ y91 d;
    public final /* synthetic */ aa1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x91(y91 y91Var, aa1 aa1Var, int i) {
        super(1);
        this.c = i;
        this.d = y91Var;
        this.h = aa1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int iH;
        int iH2;
        int i = this.c;
        w84 w84Var = w84.a;
        aa1 aa1Var = this.h;
        int i2 = 0;
        y91 y91Var = this.d;
        switch (i) {
            case 0:
                nv2 nv2Var = (nv2) obj;
                if (nv2Var != null) {
                    i2 = aa1Var.i(nv2Var);
                    iH = aa1Var.h(nv2Var);
                } else {
                    iH = 0;
                }
                y91Var.h = new dq1(dq1.a(i2, iH));
                y91Var.e = nv2Var;
                break;
            default:
                nv2 nv2Var2 = (nv2) obj;
                if (nv2Var2 != null) {
                    i2 = aa1Var.i(nv2Var2);
                    iH2 = aa1Var.h(nv2Var2);
                } else {
                    iH2 = 0;
                }
                y91Var.i = new dq1(dq1.a(i2, iH2));
                y91Var.g = nv2Var2;
                break;
        }
        return w84Var;
    }
}

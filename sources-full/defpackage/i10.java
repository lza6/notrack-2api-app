package defpackage;

import notrack.ai.data.account.DeletePreview;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i10 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ se1 o;

    public /* synthetic */ i10(Object obj, Object obj2, le1 le1Var, je1 je1Var, je1 je1Var2, int i, int i2) {
        this.c = i2;
        this.m = obj;
        this.n = obj2;
        this.o = le1Var;
        this.d = je1Var;
        this.h = je1Var2;
        this.l = i;
    }

    public /* synthetic */ i10(r10 r10Var, x10 x10Var, je1 je1Var, je1 je1Var2, je1 je1Var3, int i) {
        this.c = 0;
        this.m = r10Var;
        this.n = x10Var;
        this.d = je1Var;
        this.h = je1Var2;
        this.o = je1Var3;
        this.l = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        se1 se1Var = this.o;
        Object obj3 = this.n;
        Object obj4 = this.m;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iV = sf3.V(this.l | 1);
                q10.CarryGateDialog((r10) obj4, (x10) obj3, this.d, this.h, (je1) se1Var, (ck0) obj, iV);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wa0.S0((xa0) obj4, (DeletePreview) obj3, (le1) se1Var, this.d, this.h, (ck0) obj, this.l);
                break;
            default:
                ((Integer) obj2).getClass();
                wa0.a0((String) obj4, (String) obj3, (le1) se1Var, this.d, this.h, (ck0) obj, this.l);
                break;
        }
        return w84Var;
    }
}

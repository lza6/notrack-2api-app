package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k10 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ fh2 d;

    public /* synthetic */ k10(fh2 fh2Var, int i) {
        this.c = i;
        this.d = fh2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        fh2 fh2Var = this.d;
        qq1 qq1Var = (qq1) obj;
        switch (i) {
            case 0:
                ((ct2) fh2Var).h((int) (4294967295L & qq1Var.a));
                break;
            default:
                ct2 ct2Var = (ct2) fh2Var;
                if (((int) (qq1Var.a & 4294967295L)) > ct2Var.f()) {
                    ct2Var.h((int) (4294967295L & qq1Var.a));
                }
                break;
        }
        return w84Var;
    }
}

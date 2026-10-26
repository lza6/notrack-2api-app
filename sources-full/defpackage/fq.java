package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fq implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ se1 h;

    public /* synthetic */ fq(le1 le1Var, boolean z) {
        this.c = 2;
        this.h = le1Var;
        this.d = z;
    }

    public /* synthetic */ fq(boolean z, je1 je1Var, int i) {
        this.c = i;
        this.d = z;
        this.h = je1Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        boolean z = this.d;
        se1 se1Var = this.h;
        switch (i) {
            case 0:
                je1 je1Var = (je1) se1Var;
                if (!z) {
                    je1Var.invoke();
                }
                break;
            case 1:
                je1 je1Var2 = (je1) se1Var;
                if (!z) {
                    je1Var2.invoke();
                }
                break;
            default:
                ((le1) se1Var).invoke(Boolean.valueOf(!z));
                break;
        }
        return w84Var;
    }
}

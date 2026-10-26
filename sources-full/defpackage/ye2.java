package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ye2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ hh3 d;
    public final /* synthetic */ je1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ye2(hh3 hh3Var, je1 je1Var, int i) {
        super(1);
        this.c = i;
        this.d = hh3Var;
        this.h = je1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        je1 je1Var = this.h;
        hh3 hh3Var = this.d;
        switch (i) {
            case 0:
                if (!hh3Var.c()) {
                    je1Var.invoke();
                }
                break;
            default:
                if (!hh3Var.c()) {
                    je1Var.invoke();
                }
                break;
        }
        return w84Var;
    }
}

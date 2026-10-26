package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ cz3 d;
    public final /* synthetic */ le1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt(cz3 cz3Var, le1 le1Var, int i) {
        super(1);
        this.c = i;
        this.d = cz3Var;
        this.h = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        le1 le1Var = this.h;
        cz3 cz3Var = this.d;
        switch (i) {
            case 0:
                xy3 xy3Var = (xy3) obj;
                if (cz3Var != null) {
                    cz3Var.a.setValue(xy3Var);
                }
                if (le1Var != null) {
                    le1Var.invoke(xy3Var);
                }
                return w84.a;
            default:
                cz3Var.c.add(le1Var);
                return new ho1(cz3Var, 3, le1Var);
        }
    }
}

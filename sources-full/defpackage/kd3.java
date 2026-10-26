package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kd3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ le3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kd3(le3 le3Var, int i) {
        super(0);
        this.c = i;
        this.d = le3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        w84 w84Var = w84.a;
        le3 le3Var = this.d;
        switch (i) {
            case 0:
                ln2 ln2Var = (ln2) le3Var.n.getValue();
                return new ln2(ln2Var != null ? ln2Var.a : 9205357640488583168L);
            case 1:
                ln2 ln2Var2 = (ln2) le3Var.o.getValue();
                return new ln2(ln2Var2 != null ? ln2Var2.a : 9205357640488583168L);
            case 2:
                le3Var.s = true;
                le3Var.p();
                le3Var.p.setValue(null);
                le3Var.q.setValue(null);
                return w84Var;
            default:
                le3Var.i();
                return w84Var;
        }
    }
}

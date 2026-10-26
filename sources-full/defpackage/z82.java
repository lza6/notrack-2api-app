package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z82 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ a92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z82(a92 a92Var, int i) {
        super(0);
        this.c = i;
        this.d = a92Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        a92 a92Var = this.d;
        switch (i) {
            case 0:
                cx1 cx1Var = (cx1) a92Var.u.getValue();
                return new ln2(cx1Var != null ? cx1Var.L(0L) : 9205357640488583168L);
            case 1:
                return new ln2(a92Var.w);
            default:
                a92Var.x0();
                return w84.a;
        }
    }
}

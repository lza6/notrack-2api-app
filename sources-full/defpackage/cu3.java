package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cu3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ du3 d;
    public final /* synthetic */ xb2 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ nv2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu3(du3 du3Var, xb2 xb2Var, int i, nv2 nv2Var, int i2) {
        super(1);
        this.c = i2;
        this.d = du3Var;
        this.h = xb2Var;
        this.l = i;
        this.m = nv2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        nv2 nv2Var = this.m;
        switch (i) {
            case 0:
                int i2 = nv2Var.c;
                du3 du3Var = this.d;
                long j = du3Var.n.d().h;
                xb2 xb2Var = this.h;
                du3.y0(du3Var, xb2Var, this.l, i2, j, xb2Var.getLayoutDirection());
                mv2.f((mv2) obj, nv2Var, -du3Var.r.a.f(), 0);
                break;
            default:
                int i3 = nv2Var.d;
                du3 du3Var2 = this.d;
                long j2 = du3Var2.n.d().h;
                xb2 xb2Var2 = this.h;
                du3.y0(du3Var2, xb2Var2, this.l, i3, j2, xb2Var2.getLayoutDirection());
                mv2.f((mv2) obj, nv2Var, 0, -du3Var2.r.a.f());
                break;
        }
        return w84Var;
    }
}

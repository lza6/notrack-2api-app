package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ww extends ww1 implements le1 {
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ qb2 d;
    public final /* synthetic */ xb2 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ yw n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(nv2 nv2Var, qb2 qb2Var, xb2 xb2Var, int i, int i2, yw ywVar) {
        super(1);
        this.c = nv2Var;
        this.d = qb2Var;
        this.h = xb2Var;
        this.l = i;
        this.m = i2;
        this.n = ywVar;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        vw.a((mv2) obj, this.c, this.d, this.h.getLayoutDirection(), this.l, this.m, this.n.a);
        return w84.a;
    }
}

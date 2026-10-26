package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj4 extends ww1 implements le1 {
    public final /* synthetic */ dj4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ nv2 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ xb2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj4(dj4 dj4Var, int i, nv2 nv2Var, int i2, xb2 xb2Var) {
        super(1);
        this.c = dj4Var;
        this.d = i;
        this.h = nv2Var;
        this.l = i2;
        this.m = xb2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        ne1 ne1Var = this.c.d;
        nv2 nv2Var = this.h;
        mv2.e((mv2) obj, nv2Var, ((iq1) ne1Var.invoke(new qq1((((long) (this.d - nv2Var.c)) << 32) | (((long) (this.l - nv2Var.d)) & 4294967295L)), this.m.getLayoutDirection())).a);
        return w84.a;
    }
}

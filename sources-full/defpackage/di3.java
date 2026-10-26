package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class di3 extends ww1 implements le1 {
    public final /* synthetic */ ei3 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int h;
    public final /* synthetic */ int l;
    public final /* synthetic */ xb2 m;
    public final /* synthetic */ nv2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di3(ei3 ei3Var, long j, int i, int i2, xb2 xb2Var, nv2 nv2Var) {
        super(1);
        this.c = ei3Var;
        this.d = j;
        this.h = i;
        this.l = i2;
        this.m = xb2Var;
        this.n = nv2Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        mv2.e((mv2) obj, this.n, this.c.d.a(this.d, (((long) this.l) & 4294967295L) | (((long) this.h) << 32), this.m.getLayoutDirection()));
        return w84.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class oc extends ww1 implements ne1 {
    public final /* synthetic */ a8 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ ux2 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc(a8 a8Var, long j, je1 je1Var, ux2 ux2Var, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = a8Var;
        this.d = j;
        this.h = je1Var;
        this.l = ux2Var;
        this.m = ne1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yc.m1875xa9da4bae(this.c, this.d, this.h, this.l, this.m, (ck0) obj, sf3.V(this.n | 1), this.o);
        return w84.a;
    }
}

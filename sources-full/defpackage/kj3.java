package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kj3 extends ww1 implements le1 {
    public final /* synthetic */ nv2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ nv2 l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj3(nv2 nv2Var, int i, int i2, nv2 nv2Var2, int i3, int i4) {
        super(1);
        this.c = nv2Var;
        this.d = i;
        this.h = i2;
        this.l = nv2Var2;
        this.m = i3;
        this.n = i4;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        mv2 mv2Var = (mv2) obj;
        mv2.f(mv2Var, this.c, this.d, this.h);
        mv2.f(mv2Var, this.l, this.m, this.n);
        return w84.a;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vl2 extends ww1 implements je1 {
    public final /* synthetic */ wl2 c;
    public final /* synthetic */ of2 d;
    public final /* synthetic */ sl2 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ ii1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vl2(wl2 wl2Var, of2 of2Var, sl2 sl2Var, long j, ii1 ii1Var, int i, boolean z, float f) {
        super(0);
        this.c = wl2Var;
        this.d = of2Var;
        this.h = sl2Var;
        this.l = j;
        this.m = ii1Var;
        this.n = i;
        this.o = z;
        this.p = f;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        this.c.d1(kr1.i(this.d, this.h.g()), this.h, this.l, this.m, this.n, this.o, this.p, false);
        return w84.a;
    }
}

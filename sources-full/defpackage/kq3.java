package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kq3 extends ww1 implements le1 {
    public final /* synthetic */ q43 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ rf h;
    public final /* synthetic */ cg l;
    public final /* synthetic */ xf m;
    public final /* synthetic */ float n;
    public final /* synthetic */ le1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq3(q43 q43Var, Object obj, rf rfVar, cg cgVar, xf xfVar, float f, le1 le1Var) {
        super(1);
        this.c = q43Var;
        this.d = obj;
        this.h = rfVar;
        this.l = cgVar;
        this.m = xfVar;
        this.n = f;
        this.o = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        rf rfVar = this.h;
        vf vfVar = new vf(this.d, rfVar.d(), this.l, jLongValue, rfVar.e(), jLongValue, new jq3(0, this.m));
        vl0.B(vfVar, jLongValue, this.n, this.h, this.m, this.o);
        this.c.c = vfVar;
        return w84.a;
    }
}

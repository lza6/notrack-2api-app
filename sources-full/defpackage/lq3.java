package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lq3 extends ww1 implements le1 {
    public final /* synthetic */ q43 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ rf h;
    public final /* synthetic */ xf l;
    public final /* synthetic */ le1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq3(q43 q43Var, float f, rf rfVar, xf xfVar, le1 le1Var) {
        super(1);
        this.c = q43Var;
        this.d = f;
        this.h = rfVar;
        this.l = xfVar;
        this.m = le1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        Object obj2 = this.c.c;
        obj2.getClass();
        vl0.B((vf) obj2, jLongValue, this.d, this.h, this.l, this.m);
        return w84.a;
    }
}

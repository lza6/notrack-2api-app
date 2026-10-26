package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ki3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ float o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ oe1 q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ki3(Object obj, long j, long j2, long j3, long j4, float f, float f2, ne1 ne1Var, oe1 oe1Var, int i) {
        super(1);
        this.c = i;
        this.r = obj;
        this.d = j;
        this.h = j2;
        this.l = j3;
        this.m = j4;
        this.n = f;
        this.o = f2;
        this.p = ne1Var;
        this.q = oe1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        Object obj2 = this.r;
        switch (i) {
            case 0:
                tz0 tz0Var = (tz0) obj;
                ni3 ni3Var = ni3.a;
                n23 n23Var = (n23) obj2;
                ni3.b(tz0Var, n23Var.g, n23Var.b(), n23Var.a(), this.d, this.h, this.l, this.m, tz0Var.r0(n23Var.h.f()), tz0Var.r0(n23Var.i.f()), tz0Var.r0(n23Var.j.f()), this.n, this.o, this.p, this.q, true);
                break;
            default:
                tz0 tz0Var2 = (tz0) obj;
                ni3 ni3Var2 = ni3.a;
                uj3 uj3Var = (uj3) obj2;
                ni3.b(tz0Var2, uj3Var.f, 0.0f, uj3Var.c(), this.d, this.h, this.l, this.m, tz0Var2.r0(uj3Var.i.f()), tz0Var2.q0(0), tz0Var2.r0(uj3Var.j.f()), this.n, this.o, this.p, this.q, false);
                break;
        }
        return w84Var;
    }
}

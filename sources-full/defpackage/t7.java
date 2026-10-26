package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t7 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ rg3 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ ne1 r;
    public final /* synthetic */ ne1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, rg3 rg3Var, long j, float f, long j2, long j3, long j4, ne1 ne1Var4, ne1 ne1Var5) {
        super(2);
        this.c = ne1Var;
        this.d = ne1Var2;
        this.h = ne1Var3;
        this.l = rg3Var;
        this.m = j;
        this.n = f;
        this.o = j2;
        this.p = j3;
        this.q = j4;
        this.r = ne1Var4;
        this.s = ne1Var5;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        x7.m1872xa3017a6d(zg0.rememberComposableLambda(1163543932, true, new s7(this.r, this.s), ck0Var, 54), null, this.c, this.d, this.h, this.l, this.m, this.n, af0.getValue(ze0.r, ck0Var, 6), this.o, this.p, this.q, ck0Var, 6, 0, 2);
    }
}

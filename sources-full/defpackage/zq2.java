package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zq2 extends ww1 implements oe1 {
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ de4 l;
    public final /* synthetic */ gh2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ ne1 o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ ne1 r;
    public final /* synthetic */ ne1 s;
    public final /* synthetic */ ne1 t;
    public final /* synthetic */ ne1 u;
    public final /* synthetic */ bu3 v;
    public final /* synthetic */ rg3 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq2(ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, ne1 ne1Var6, ne1 ne1Var7, gh2 gh2Var, rg3 rg3Var, bu3 bu3Var, de4 de4Var, String str, boolean z, boolean z2, boolean z3) {
        super(3);
        this.c = str;
        this.d = z;
        this.h = z2;
        this.l = de4Var;
        this.m = gh2Var;
        this.n = z3;
        this.o = ne1Var;
        this.p = ne1Var2;
        this.q = ne1Var3;
        this.r = ne1Var4;
        this.s = ne1Var5;
        this.t = ne1Var6;
        this.u = ne1Var7;
        this.v = bu3Var;
        this.w = rg3Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((ne1) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        if ((i & 6) == 0) {
            i2 = i | (((kk0) ck0Var).j(ne1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 19) == 18) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        rg3 rg3Var = this.w;
        boolean z = this.d;
        boolean z2 = this.n;
        gh2 gh2Var = this.m;
        bu3 bu3Var = this.v;
        wq2.a.DecorationBox(this.c, ne1Var, z, this.h, this.l, gh2Var, z2, this.o, this.p, this.q, this.r, this.s, this.t, this.u, bu3Var, null, zg0.rememberComposableLambda(2108828640, true, new yq2(z, z2, gh2Var, bu3Var, rg3Var), ck0Var, 54), ck0Var, (i2 << 3) & 112, 14155776, 32768);
    }
}

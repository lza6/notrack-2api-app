package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ad2 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ kc2 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad2(ne1 ne1Var, kc2 kc2Var, boolean z, ne1 ne1Var2, ne1 ne1Var3) {
        super(2);
        this.c = ne1Var;
        this.d = kc2Var;
        this.h = z;
        this.l = ne1Var2;
        this.m = ne1Var3;
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
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(1264683960);
        boolean z = this.h;
        kc2 kc2Var = this.d;
        ne1 ne1Var = this.c;
        if (ne1Var != null) {
            yk0.CompositionLocalProvider(fq2.k(z ? kc2Var.b : kc2Var.e, gn0.a), zg0.rememberComposableLambda(2035552199, true, new xc2(ne1Var), kk0Var2, 54), kk0Var2, 56);
        }
        kk0Var2.r(false);
        dl0 dl0Var = gn0.a;
        s13 s13VarK = fq2.k(z ? kc2Var.a : kc2Var.d, dl0Var);
        ne1 ne1Var2 = this.m;
        ne1 ne1Var3 = this.l;
        yk0.CompositionLocalProvider(s13VarK, zg0.rememberComposableLambda(-1728894036, true, new yc2(ne1Var, ne1Var3, ne1Var2), kk0Var2, 54), kk0Var2, 56);
        if (ne1Var3 != null) {
            yk0.CompositionLocalProvider(fq2.k(z ? kc2Var.c : kc2Var.f, dl0Var), zg0.rememberComposableLambda(580312062, true, new zc2(ne1Var3), kk0Var2, 54), kk0Var2, 56);
        }
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fa3 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ oe1 h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ qi2 n;
    public final /* synthetic */ ne1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa3(int i, ne1 ne1Var, oe1 oe1Var, ne1 ne1Var2, ne1 ne1Var3, qi2 qi2Var, ne1 ne1Var4) {
        super(2);
        this.c = i;
        this.d = ne1Var;
        this.h = oe1Var;
        this.l = ne1Var2;
        this.m = ne1Var3;
        this.n = qi2Var;
        this.o = ne1Var4;
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
        ka3.m221x7705a90c(this.c, this.d, this.h, this.l, this.m, this.n, this.o, ck0Var, 0);
    }
}

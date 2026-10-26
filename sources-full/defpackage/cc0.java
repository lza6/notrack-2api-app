package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cc0 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ uz3 d;
    public final /* synthetic */ long h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ xb0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ float p;
    public final /* synthetic */ hs2 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(ne1 ne1Var, uz3 uz3Var, long j, ne1 ne1Var2, ne1 ne1Var3, xb0 xb0Var, boolean z, float f, hs2 hs2Var) {
        super(2);
        this.c = ne1Var;
        this.d = uz3Var;
        this.h = j;
        this.l = ne1Var2;
        this.m = ne1Var3;
        this.n = xb0Var;
        this.o = z;
        this.p = f;
        this.q = hs2Var;
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
        xb0 xb0Var = this.n;
        boolean z = this.o;
        pc0.m1801xcafa47d0(this.c, this.d, this.h, this.l, null, this.m, z ? xb0Var.c : xb0Var.g, z ? xb0Var.d : xb0Var.h, this.p, this.q, ck0Var, 24576);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends ww1 implements ne1 {
    public final /* synthetic */ zc3 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ uz3 m;
    public final /* synthetic */ ne1 n;
    public final /* synthetic */ ne1 o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ hs2 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc0(zc3 zc3Var, boolean z, boolean z2, ne1 ne1Var, uz3 uz3Var, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, float f, hs2 hs2Var) {
        super(2);
        this.c = zc3Var;
        this.d = z;
        this.h = z2;
        this.l = ne1Var;
        this.m = uz3Var;
        this.n = ne1Var2;
        this.o = ne1Var3;
        this.p = ne1Var4;
        this.q = f;
        this.r = hs2Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        long j;
        long j2;
        long j3;
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        zc3 zc3Var = this.c;
        boolean z = this.d;
        boolean z2 = this.h;
        if (z) {
            j = !z2 ? zc3Var.b : zc3Var.k;
        } else {
            j = zc3Var.f;
        }
        long j4 = j;
        if (z) {
            j2 = !z2 ? zc3Var.c : zc3Var.l;
        } else {
            j2 = zc3Var.g;
        }
        long j5 = j2;
        if (z) {
            j3 = !z2 ? zc3Var.d : zc3Var.m;
        } else {
            j3 = zc3Var.h;
        }
        pc0.m1801xcafa47d0(this.l, this.m, j4, this.n, this.o, this.p, j5, j3, this.q, this.r, ck0Var, 0);
    }
}

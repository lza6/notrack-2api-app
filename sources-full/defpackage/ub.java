package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ub extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ ni2 d;
    public final /* synthetic */ mi2 h;
    public final /* synthetic */ rb3 l;
    public final /* synthetic */ rg3 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ float o;
    public final /* synthetic */ float p;
    public final /* synthetic */ iw q;
    public final /* synthetic */ oe1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(c cVar, ni2 ni2Var, mi2 mi2Var, rb3 rb3Var, rg3 rg3Var, long j, float f, float f2, iw iwVar, oe1 oe1Var) {
        super(2);
        this.c = cVar;
        this.d = ni2Var;
        this.h = mi2Var;
        this.l = rb3Var;
        this.m = rg3Var;
        this.n = j;
        this.o = f;
        this.p = f2;
        this.q = iwVar;
        this.r = oe1Var;
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
        cd2.m165x82b162b9(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, ck0Var, 384);
    }
}

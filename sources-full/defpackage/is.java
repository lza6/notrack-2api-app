package defpackage;

import androidx.compose.foundation.text.input.a;
import androidx.compose.foundation.text.input.internal.c;

/* JADX INFO: loaded from: classes.dex */
public final class is extends ww1 implements ne1 {
    public final /* synthetic */ fu3 c;
    public final /* synthetic */ a d;
    public final /* synthetic */ az3 h;
    public final /* synthetic */ uz3 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ c p;
    public final /* synthetic */ wx3 q;
    public final /* synthetic */ yx r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ rb3 u;
    public final /* synthetic */ nq2 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ ne1 x;
    public final /* synthetic */ yv1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is(fu3 fu3Var, a aVar, az3 az3Var, uz3 uz3Var, boolean z, boolean z2, boolean z3, c cVar, wx3 wx3Var, yx yxVar, boolean z4, boolean z5, rb3 rb3Var, nq2 nq2Var, boolean z6, ne1 ne1Var, yv1 yv1Var) {
        super(2);
        this.c = fu3Var;
        this.d = aVar;
        this.h = az3Var;
        this.l = uz3Var;
        this.m = z;
        this.n = z2;
        this.o = z3;
        this.p = cVar;
        this.q = wx3Var;
        this.r = yxVar;
        this.s = z4;
        this.t = z5;
        this.u = rb3Var;
        this.v = nq2Var;
        this.w = z6;
        this.x = ne1Var;
        this.y = yv1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        Object obj = this.c;
        if (obj == null) {
            int i2 = us.b;
            obj = ps.a;
        }
        ((ps) obj).Decoration(zg0.rememberComposableLambda(1969169726, true, new hs(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y), kk0Var, 54), kk0Var, 6);
    }
}

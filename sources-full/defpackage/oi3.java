package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class oi3 extends ww1 implements ne1 {
    public final /* synthetic */ pd0 c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ pd0 m;
    public final /* synthetic */ je1 n;
    public final /* synthetic */ ii3 o;
    public final /* synthetic */ gh2 p;
    public final /* synthetic */ gh2 q;
    public final /* synthetic */ oe1 r;
    public final /* synthetic */ oe1 s;
    public final /* synthetic */ oe1 t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi3(pd0 pd0Var, le1 le1Var, c cVar, boolean z, pd0 pd0Var2, je1 je1Var, ii3 ii3Var, gh2 gh2Var, gh2 gh2Var2, oe1 oe1Var, oe1 oe1Var2, oe1 oe1Var3, int i, int i2, int i3, int i4) {
        super(2);
        this.c = pd0Var;
        this.d = le1Var;
        this.h = cVar;
        this.l = z;
        this.m = pd0Var2;
        this.n = je1Var;
        this.o = ii3Var;
        this.p = gh2Var;
        this.q = gh2Var2;
        this.r = oe1Var;
        this.s = oe1Var2;
        this.t = oe1Var3;
        this.u = i;
        this.v = i2;
        this.w = i3;
        this.x = i4;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = sf3.V(this.v | 1);
        int iV2 = sf3.V(this.w);
        int i = this.x;
        rj3.RangeSlider(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (ck0) obj, iV, iV2, i);
        return w84.a;
    }
}

package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ij3 extends ww1 implements ne1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ je1 m;
    public final /* synthetic */ ii3 n;
    public final /* synthetic */ gh2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ oe1 q;
    public final /* synthetic */ oe1 r;
    public final /* synthetic */ pd0 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij3(float f, le1 le1Var, c cVar, boolean z, je1 je1Var, ii3 ii3Var, gh2 gh2Var, int i, oe1 oe1Var, oe1 oe1Var2, pd0 pd0Var, int i2, int i3, int i4) {
        super(2);
        this.c = f;
        this.d = le1Var;
        this.h = cVar;
        this.l = z;
        this.m = je1Var;
        this.n = ii3Var;
        this.o = gh2Var;
        this.p = i;
        this.q = oe1Var;
        this.r = oe1Var2;
        this.s = pd0Var;
        this.t = i2;
        this.u = i3;
        this.v = i4;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = sf3.V(this.t | 1);
        int iV2 = sf3.V(this.u);
        int i = this.v;
        rj3.Slider(this.c, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV, iV2, i);
        return w84.a;
    }
}

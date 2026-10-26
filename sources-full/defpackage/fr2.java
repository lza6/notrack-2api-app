package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class fr2 extends ww1 implements ne1 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ gh2 D;
    public final /* synthetic */ rg3 E;
    public final /* synthetic */ bu3 F;
    public final /* synthetic */ int G;
    public final /* synthetic */ int H;
    public final /* synthetic */ int I;
    public final /* synthetic */ int J;
    public final /* synthetic */ int c;
    public final /* synthetic */ ey3 d;
    public final /* synthetic */ le1 h;
    public final /* synthetic */ c l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ uz3 o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ ne1 r;
    public final /* synthetic */ ne1 s;
    public final /* synthetic */ ne1 t;
    public final /* synthetic */ ne1 u;
    public final /* synthetic */ ne1 v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ de4 x;
    public final /* synthetic */ yv1 y;
    public final /* synthetic */ wv1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fr2(ey3 ey3Var, le1 le1Var, c cVar, boolean z, boolean z2, uz3 uz3Var, ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, ne1 ne1Var6, ne1 ne1Var7, boolean z3, de4 de4Var, yv1 yv1Var, wv1 wv1Var, boolean z4, int i, int i2, gh2 gh2Var, rg3 rg3Var, bu3 bu3Var, int i3, int i4, int i5, int i6, int i7) {
        super(2);
        this.c = i7;
        this.d = ey3Var;
        this.h = le1Var;
        this.l = cVar;
        this.m = z;
        this.n = z2;
        this.o = uz3Var;
        this.p = ne1Var;
        this.q = ne1Var2;
        this.r = ne1Var3;
        this.s = ne1Var4;
        this.t = ne1Var5;
        this.u = ne1Var6;
        this.v = ne1Var7;
        this.w = z3;
        this.x = de4Var;
        this.y = yv1Var;
        this.z = wv1Var;
        this.A = z4;
        this.B = i;
        this.C = i2;
        this.D = gh2Var;
        this.E = rg3Var;
        this.F = bu3Var;
        this.G = i3;
        this.H = i4;
        this.I = i5;
        this.J = i6;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.I;
        int i3 = this.H;
        int i4 = this.G;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i4 | 1);
                int iV2 = sf3.V(i3);
                int iV3 = sf3.V(i2);
                int i5 = this.J;
                ir2.OutlinedTextField(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (ck0) obj, iV, iV2, iV3, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i4 | 1);
                int iV5 = sf3.V(i3);
                int iV6 = sf3.V(i2);
                int i6 = this.J;
                xv3.TextField(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (ck0) obj, iV4, iV5, iV6, i6);
                break;
        }
        return w84Var;
    }
}

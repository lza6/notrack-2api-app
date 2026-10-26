package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class es extends ww1 implements ne1 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int c;
    public final /* synthetic */ le1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ uz3 n;
    public final /* synthetic */ yv1 o;
    public final /* synthetic */ wv1 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ int r;
    public final /* synthetic */ de4 s;
    public final /* synthetic */ le1 t;
    public final /* synthetic */ gh2 u;
    public final /* synthetic */ yx v;
    public final /* synthetic */ oe1 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es(Object obj, le1 le1Var, c cVar, boolean z, boolean z2, uz3 uz3Var, yv1 yv1Var, wv1 wv1Var, boolean z3, int i, de4 de4Var, le1 le1Var2, gh2 gh2Var, yx yxVar, oe1 oe1Var, int i2, int i3, int i4, int i5) {
        super(2);
        this.c = i5;
        this.A = obj;
        this.d = le1Var;
        this.h = cVar;
        this.l = z;
        this.m = z2;
        this.n = uz3Var;
        this.o = yv1Var;
        this.p = wv1Var;
        this.q = z3;
        this.r = i;
        this.s = de4Var;
        this.t = le1Var2;
        this.u = gh2Var;
        this.v = yxVar;
        this.w = oe1Var;
        this.x = i2;
        this.y = i3;
        this.z = i4;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.y;
        int i3 = this.x;
        Object obj3 = this.A;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i3 | 1);
                int iV2 = sf3.V(i2);
                int i4 = this.z;
                us.BasicTextField((String) obj3, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (ck0) obj, iV, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.z;
                us.BasicTextField((ey3) obj3, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (ck0) obj, iV3, iV4, i5);
                break;
        }
        return w84Var;
    }
}

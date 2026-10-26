package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ds extends ww1 implements ne1 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
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
    public final /* synthetic */ int s;
    public final /* synthetic */ de4 t;
    public final /* synthetic */ le1 u;
    public final /* synthetic */ gh2 v;
    public final /* synthetic */ yx w;
    public final /* synthetic */ oe1 x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ds(Object obj, le1 le1Var, c cVar, boolean z, boolean z2, uz3 uz3Var, yv1 yv1Var, wv1 wv1Var, boolean z3, int i, int i2, de4 de4Var, le1 le1Var2, gh2 gh2Var, yx yxVar, oe1 oe1Var, int i3, int i4, int i5, int i6) {
        super(2);
        this.c = i6;
        this.B = obj;
        this.d = le1Var;
        this.h = cVar;
        this.l = z;
        this.m = z2;
        this.n = uz3Var;
        this.o = yv1Var;
        this.p = wv1Var;
        this.q = z3;
        this.r = i;
        this.s = i2;
        this.t = de4Var;
        this.u = le1Var2;
        this.v = gh2Var;
        this.w = yxVar;
        this.x = oe1Var;
        this.y = i3;
        this.z = i4;
        this.A = i5;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.z;
        int i3 = this.y;
        Object obj3 = this.B;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i3 | 1);
                int iV2 = sf3.V(i2);
                int i4 = this.A;
                us.BasicTextField((ey3) obj3, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (ck0) obj, iV, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.A;
                us.BasicTextField((String) obj3, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, (ck0) obj, iV3, iV4, i5);
                break;
        }
        return w84Var;
    }
}

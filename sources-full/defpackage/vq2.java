package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vq2 extends ww1 implements ne1 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ String d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ de4 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ ne1 n;
    public final /* synthetic */ ne1 o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ ne1 r;
    public final /* synthetic */ ne1 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ uq1 w;
    public final /* synthetic */ hs2 x;
    public final /* synthetic */ bu3 y;
    public final /* synthetic */ ne1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq2(dy3 dy3Var, String str, ne1 ne1Var, de4 de4Var, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, ne1 ne1Var6, ne1 ne1Var7, ne1 ne1Var8, boolean z, boolean z2, boolean z3, uq1 uq1Var, hs2 hs2Var, bu3 bu3Var, ne1 ne1Var9, int i, int i2, int i3) {
        super(2);
        this.D = dy3Var;
        this.d = str;
        this.h = ne1Var;
        this.l = de4Var;
        this.m = ne1Var2;
        this.n = ne1Var3;
        this.o = ne1Var4;
        this.p = ne1Var5;
        this.q = ne1Var6;
        this.r = ne1Var7;
        this.s = ne1Var8;
        this.t = z;
        this.u = z2;
        this.v = z3;
        this.w = uq1Var;
        this.x = hs2Var;
        this.y = bu3Var;
        this.z = ne1Var9;
        this.A = i;
        this.B = i2;
        this.C = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq2(wq2 wq2Var, String str, ne1 ne1Var, boolean z, boolean z2, de4 de4Var, uq1 uq1Var, boolean z3, ne1 ne1Var2, ne1 ne1Var3, ne1 ne1Var4, ne1 ne1Var5, ne1 ne1Var6, ne1 ne1Var7, ne1 ne1Var8, bu3 bu3Var, hs2 hs2Var, ne1 ne1Var9, int i, int i2, int i3) {
        super(2);
        this.D = wq2Var;
        this.d = str;
        this.h = ne1Var;
        this.t = z;
        this.u = z2;
        this.l = de4Var;
        this.w = uq1Var;
        this.v = z3;
        this.m = ne1Var2;
        this.n = ne1Var3;
        this.o = ne1Var4;
        this.p = ne1Var5;
        this.q = ne1Var6;
        this.r = ne1Var7;
        this.s = ne1Var8;
        this.y = bu3Var;
        this.x = hs2Var;
        this.z = ne1Var9;
        this.A = i;
        this.B = i2;
        this.C = i3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.B;
        int i3 = this.A;
        Object obj3 = this.D;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i3 | 1);
                int iV2 = sf3.V(i2);
                int i4 = this.C;
                ((wq2) obj3).DecorationBox(this.d, this.h, this.t, this.u, this.l, this.w, this.v, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.y, this.x, this.z, (ck0) obj, iV, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i3 | 1);
                int iV4 = sf3.V(i2);
                int i5 = this.C;
                ov3.CommonDecorationBox((dy3) obj3, this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, (ck0) obj, iV3, iV4, i5);
                break;
        }
        return w84Var;
    }
}

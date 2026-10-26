package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class li3 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ni3 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ ii3 m;
    public final /* synthetic */ ne1 n;
    public final /* synthetic */ oe1 o;
    public final /* synthetic */ float p;
    public final /* synthetic */ float q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ li3(ni3 ni3Var, Object obj, c cVar, boolean z, ii3 ii3Var, ne1 ne1Var, oe1 oe1Var, float f, float f2, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = ni3Var;
        this.t = obj;
        this.h = cVar;
        this.l = z;
        this.m = ii3Var;
        this.n = ne1Var;
        this.o = oe1Var;
        this.p = f;
        this.q = f2;
        this.r = i;
        this.s = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.r;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.s;
                ni3 ni3Var = this.d;
                ni3Var.m1774x6ebfe39((n23) obj3, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.s;
                ni3 ni3Var2 = this.d;
                ni3Var2.m1775x6ebfe39((uj3) obj3, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

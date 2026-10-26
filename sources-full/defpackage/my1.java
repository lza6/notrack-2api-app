package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class my1 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ g22 h;
    public final /* synthetic */ hs2 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ w71 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ pr2 p;
    public final /* synthetic */ le1 q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my1(c cVar, g22 g22Var, hs2 hs2Var, boolean z, Object obj, Object obj2, w71 w71Var, boolean z2, pr2 pr2Var, le1 le1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = cVar;
        this.h = g22Var;
        this.l = hs2Var;
        this.m = z;
        this.t = obj;
        this.u = obj2;
        this.n = w71Var;
        this.o = z2;
        this.p = pr2Var;
        this.q = le1Var;
        this.r = i;
        this.s = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.r;
        Object obj3 = this.u;
        Object obj4 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                gl glVar = (gl) obj4;
                y7 y7Var = (y7) obj3;
                int iV = sf3.V(i2 | 1);
                int i3 = this.s;
                ny1.LazyColumn(this.d, this.h, this.l, this.m, glVar, y7Var, this.n, this.o, this.p, this.q, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.s;
                c cVar = this.d;
                g22 g22Var = this.h;
                hs2 hs2Var = this.l;
                boolean z = this.m;
                ny1.LazyRow(cVar, g22Var, hs2Var, z, (el) obj4, (z7) obj3, this.n, this.o, this.p, this.q, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

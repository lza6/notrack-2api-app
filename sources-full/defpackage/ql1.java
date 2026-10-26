package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ql1 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ le1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql1(c cVar, g22 g22Var, hs2 hs2Var, boolean z, Object obj, Object obj2, w71 w71Var, boolean z2, le1 le1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = cVar;
        this.p = g22Var;
        this.q = hs2Var;
        this.h = z;
        this.r = obj;
        this.s = obj2;
        this.t = w71Var;
        this.l = z2;
        this.m = le1Var;
        this.n = i;
        this.o = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql1(boolean z, le1 le1Var, c cVar, boolean z2, rg3 rg3Var, vl1 vl1Var, iw iwVar, gh2 gh2Var, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = 0;
        this.h = z;
        this.m = le1Var;
        this.d = cVar;
        this.l = z2;
        this.p = rg3Var;
        this.q = vl1Var;
        this.r = iwVar;
        this.s = gh2Var;
        this.t = ne1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.n;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.p;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.o;
                boolean z = this.h;
                le1 le1Var = this.m;
                c cVar = this.d;
                boolean z2 = this.l;
                rl1.OutlinedIconToggleButton(z, le1Var, cVar, z2, (rg3) obj7, (vl1) obj6, (iw) obj5, (gh2) obj4, (ne1) obj3, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                w71 w71Var = (w71) obj3;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.o;
                c cVar2 = this.d;
                boolean z3 = this.h;
                ny1.LazyColumn(cVar2, (g22) obj7, (hs2) obj6, z3, (gl) obj5, (y7) obj4, w71Var, this.l, this.m, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.o;
                c cVar3 = this.d;
                boolean z4 = this.h;
                ny1.LazyRow(cVar3, (g22) obj7, (hs2) obj6, z4, (el) obj5, (z7) obj4, (w71) obj3, this.l, this.m, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}

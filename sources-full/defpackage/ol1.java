package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ol1 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ se1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ol1(c cVar, g22 g22Var, hs2 hs2Var, boolean z, Object obj, Object obj2, w71 w71Var, le1 le1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = cVar;
        this.n = g22Var;
        this.o = hs2Var;
        this.h = z;
        this.p = obj;
        this.q = obj2;
        this.r = w71Var;
        this.s = le1Var;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol1(je1 je1Var, c cVar, boolean z, rg3 rg3Var, dl1 dl1Var, iw iwVar, gh2 gh2Var, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = 0;
        this.n = je1Var;
        this.d = cVar;
        this.h = z;
        this.o = rg3Var;
        this.p = dl1Var;
        this.q = iwVar;
        this.r = gh2Var;
        this.s = ne1Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        se1 se1Var = this.s;
        Object obj3 = this.r;
        Object obj4 = this.q;
        Object obj5 = this.p;
        Object obj6 = this.o;
        Object obj7 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.m;
                c cVar = this.d;
                boolean z = this.h;
                rl1.OutlinedIconButton((je1) obj7, cVar, z, (rg3) obj6, (dl1) obj5, (iw) obj4, (gh2) obj3, (ne1) se1Var, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.m;
                c cVar2 = this.d;
                boolean z2 = this.h;
                ny1.LazyColumn(cVar2, (g22) obj7, (hs2) obj6, z2, (gl) obj5, (y7) obj4, (w71) obj3, (le1) se1Var, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.m;
                c cVar3 = this.d;
                boolean z3 = this.h;
                ny1.LazyRow(cVar3, (g22) obj7, (hs2) obj6, z3, (el) obj5, (z7) obj4, (w71) obj3, (le1) se1Var, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}

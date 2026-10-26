package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class xb extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ c d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(ne1 ne1Var, c cVar, h01 h01Var, boolean z, long j, ne1 ne1Var2, int i, int i2) {
        super(2);
        this.o = ne1Var;
        this.d = cVar;
        this.p = h01Var;
        this.h = z;
        this.l = j;
        this.q = ne1Var2;
        this.m = i;
        this.n = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(ni3 ni3Var, gh2 gh2Var, c cVar, ii3 ii3Var, boolean z, long j, int i, int i2) {
        super(2);
        this.o = ni3Var;
        this.p = gh2Var;
        this.d = cVar;
        this.q = ii3Var;
        this.h = z;
        this.l = j;
        this.m = i;
        this.n = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(boolean z, je1 je1Var, c cVar, long j, ux2 ux2Var, oe1 oe1Var, int i, int i2) {
        super(2);
        this.h = z;
        this.o = je1Var;
        this.d = cVar;
        this.l = j;
        this.p = ux2Var;
        this.q = oe1Var;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.m;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ux2 ux2Var = (ux2) obj4;
                oe1 oe1Var = (oe1) obj3;
                int iV = sf3.V(i2 | 1);
                int i3 = this.n;
                boolean z = this.h;
                zb.m1893xd8504c19(z, (je1) obj5, this.d, this.l, ux2Var, oe1Var, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                ne1 ne1Var = (ne1) obj3;
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.n;
                c cVar = this.d;
                uj2.m1824x6ec692ea((ne1) obj5, cVar, (h01) obj4, this.h, this.l, ne1Var, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.n;
                c cVar2 = this.d;
                ((ni3) obj5).m1773xc69e18c1((gh2) obj4, cVar2, (ii3) obj3, this.h, this.l, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}

package defpackage;

import androidx.compose.material3.b;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ml1 extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ le1 h;
    public final /* synthetic */ c l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ gh2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(boolean z, le1 le1Var, c cVar, ne1 ne1Var, boolean z2, tq3 tq3Var, gh2 gh2Var, int i, int i2) {
        super(2);
        this.d = z;
        this.h = le1Var;
        this.l = cVar;
        this.m = ne1Var;
        this.n = z2;
        this.r = tq3Var;
        this.o = gh2Var;
        this.p = i;
        this.q = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml1(boolean z, le1 le1Var, c cVar, boolean z2, vl1 vl1Var, gh2 gh2Var, ne1 ne1Var, int i, int i2) {
        super(2);
        this.d = z;
        this.h = le1Var;
        this.l = cVar;
        this.n = z2;
        this.r = vl1Var;
        this.o = gh2Var;
        this.m = ne1Var;
        this.p = i;
        this.q = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.p;
        Object obj3 = this.r;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                vl1 vl1Var = (vl1) obj3;
                int iV = sf3.V(i2 | 1);
                int i3 = this.q;
                rl1.IconToggleButton(this.d, this.h, this.l, this.n, vl1Var, this.o, this.m, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.q;
                boolean z = this.d;
                le1 le1Var = this.h;
                c cVar = this.l;
                ne1 ne1Var = this.m;
                boolean z2 = this.n;
                b.Switch(z, le1Var, cVar, ne1Var, z2, (tq3) obj3, this.o, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class hf extends ww1 implements ne1 {
    public final /* synthetic */ int c = 2;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ oe1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(int i, ne1 ne1Var, oe1 oe1Var, ne1 ne1Var2, ne1 ne1Var3, e eVar, ne1 ne1Var4, int i2) {
        super(2);
        this.n = i;
        this.p = ne1Var;
        this.m = oe1Var;
        this.q = ne1Var2;
        this.d = ne1Var3;
        this.h = eVar;
        this.l = ne1Var4;
        this.o = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(ni2 ni2Var, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, int i, int i2) {
        super(2);
        this.p = ni2Var;
        this.d = cVar;
        this.h = k41Var;
        this.l = x51Var;
        this.q = str;
        this.m = oe1Var;
        this.n = i;
        this.o = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf(o54 o54Var, le1 le1Var, c cVar, k41 k41Var, x51 x51Var, oe1 oe1Var, int i, int i2) {
        super(2);
        this.p = o54Var;
        this.q = le1Var;
        this.d = cVar;
        this.h = k41Var;
        this.l = x51Var;
        this.m = oe1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        int i2 = this.n;
        w84 w84Var = w84.a;
        Object obj3 = this.l;
        Object obj4 = this.h;
        Object obj5 = this.d;
        Object obj6 = this.q;
        Object obj7 = this.p;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.o;
                nf.AnimatedVisibility((o54) obj7, (le1) obj6, (c) obj5, (k41) obj4, (x51) obj3, this.m, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.o;
                nf.AnimatedVisibility((ni2) obj7, (c) obj5, (k41) obj4, (x51) obj3, (String) obj6, this.m, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(this.o | 1);
                int i5 = this.n;
                oe1 oe1Var = this.m;
                ka3.m221x7705a90c(i5, (ne1) obj7, oe1Var, (ne1) obj6, (ne1) obj5, (e) obj4, (ne1) obj3, (ck0) obj, iV3);
                break;
        }
        return w84Var;
    }
}

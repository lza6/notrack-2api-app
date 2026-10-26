package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class jf extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ c d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(e14 e14Var, je1 je1Var, c cVar, boolean z, jb0 jb0Var, gh2 gh2Var, int i, int i2) {
        super(2);
        this.n = e14Var;
        this.o = je1Var;
        this.d = cVar;
        this.h = z;
        this.p = jb0Var;
        this.q = gh2Var;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(String str, boolean z, wn0 wn0Var, c cVar, oe1 oe1Var, je1 je1Var, int i, int i2) {
        super(2);
        this.p = str;
        this.h = z;
        this.n = wn0Var;
        this.d = cVar;
        this.q = oe1Var;
        this.o = je1Var;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(je1 je1Var, c cVar, boolean z, dl1 dl1Var, gh2 gh2Var, ne1 ne1Var, int i, int i2) {
        super(2);
        this.n = je1Var;
        this.d = cVar;
        this.h = z;
        this.o = dl1Var;
        this.p = gh2Var;
        this.q = ne1Var;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jf(boolean z, c cVar, k41 k41Var, x51 x51Var, String str, oe1 oe1Var, int i, int i2) {
        super(2);
        this.h = z;
        this.d = cVar;
        this.n = k41Var;
        this.o = x51Var;
        this.p = str;
        this.q = oe1Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        Object obj3 = this.q;
        Object obj4 = this.p;
        Object obj5 = this.o;
        Object obj6 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.m;
                boolean z = this.h;
                c cVar = this.d;
                nf.AnimatedVisibility(z, cVar, (k41) obj6, (x51) obj5, (String) obj4, (oe1) obj3, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.m;
                c cVar2 = this.d;
                boolean z2 = this.h;
                qb0.TriStateCheckbox((e14) obj6, (je1) obj5, cVar2, z2, (jb0) obj4, (gh2) obj3, (ck0) obj, iV2, i4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.m;
                boolean z3 = this.h;
                c cVar3 = this.d;
                ko0.ContextMenuItem((String) obj4, z3, (wn0) obj6, cVar3, (oe1) obj3, (je1) obj5, (ck0) obj, iV3, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i2 | 1);
                int i6 = this.m;
                c cVar4 = this.d;
                boolean z4 = this.h;
                rl1.IconButton((je1) obj6, cVar4, z4, (dl1) obj5, (gh2) obj4, (ne1) obj3, (ck0) obj, iV4, i6);
                break;
        }
        return w84Var;
    }
}

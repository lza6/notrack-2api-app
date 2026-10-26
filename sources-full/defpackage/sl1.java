package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class sl1 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c h;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl1(Object obj, String str, c cVar, long j, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.o = obj;
        this.d = str;
        this.h = cVar;
        this.l = j;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.m;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.n;
                ul1.m1829xf2a7a69((ym1) obj3, this.d, this.h, this.l, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.n;
                ul1.m1827xf2a7a69((bm1) obj3, this.d, this.h, this.l, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.n;
                ul1.m1828xf2a7a69((ms2) obj3, this.d, this.h, this.l, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}

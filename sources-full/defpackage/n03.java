package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class n03 extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ float d;
    public final /* synthetic */ c h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n03(float f, c cVar, long j, long j2, int i, int i2, int i3) {
        super(2);
        this.d = f;
        this.h = cVar;
        this.l = j;
        this.m = j2;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n03(c cVar, long j, float f, long j2, int i, int i2, int i3) {
        super(2);
        this.h = cVar;
        this.l = j;
        this.d = f;
        this.m = j2;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n03(c cVar, long j, long j2, int i, float f, int i2, int i3) {
        super(2);
        this.h = cVar;
        this.l = j;
        this.m = j2;
        this.n = i;
        this.d = f;
        this.o = i2;
        this.p = i3;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.o;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.p;
                z03.m1882xe8727fba(this.h, this.l, this.d, this.m, this.n, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.p;
                z03.m1888xcc3f5c16(this.d, this.h, this.l, this.m, this.n, (ck0) obj, iV2, i4);
                break;
            default:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.p;
                z03.m1891xdc38e88f(this.h, this.l, this.m, this.n, this.d, (ck0) obj, iV3, i5);
                break;
        }
        return w84Var;
    }
}

package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class dx0 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ float h;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dx0(c cVar, float f, long j, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = cVar;
        this.h = f;
        this.l = j;
        this.m = i;
        this.n = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx0(c cVar, long j, float f, int i, int i2) {
        super(2);
        this.c = 3;
        this.d = cVar;
        this.l = j;
        this.h = f;
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.m;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.n;
                fx0.m191xb6c3875f(this.d, this.h, this.l, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.n;
                fx0.m192xfb3e0e9b(this.d, this.h, this.l, (ck0) obj, iV2, i4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.n;
                fx0.m193x60d55d09(this.d, this.h, this.l, (ck0) obj, iV3, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i2 | 1);
                int i6 = this.n;
                z03.m1884xf49b4205(this.d, this.l, this.h, (ck0) obj, iV4, i6);
                break;
        }
        return w84Var;
    }
}

package defpackage;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ej2 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ c d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ e o;
    public final /* synthetic */ oe1 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej2(c cVar, long j, long j2, float f, hs2 hs2Var, e eVar, oe1 oe1Var, int i, int i2) {
        super(2);
        this.c = 3;
        this.d = cVar;
        this.l = j;
        this.m = j2;
        this.n = f;
        this.h = hs2Var;
        this.o = eVar;
        this.p = oe1Var;
        this.q = i;
        this.r = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej2(c cVar, rg3 rg3Var, long j, long j2, float f, e eVar, oe1 oe1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = cVar;
        this.h = rg3Var;
        this.l = j;
        this.m = j2;
        this.n = f;
        this.o = eVar;
        this.p = oe1Var;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.q;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.r;
                c cVar = this.d;
                uj2.m1820x115ca86b(cVar, (rg3) obj3, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.r;
                c cVar2 = this.d;
                uj2.m1823x654e5ffa(cVar2, (rg3) obj3, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV2, i4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.r;
                c cVar3 = this.d;
                uj2.m1825x2c3a8c59(cVar3, (rg3) obj3, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV3, i5);
                break;
            default:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i2 | 1);
                int i6 = this.r;
                c cVar4 = this.d;
                long j = this.l;
                long j2 = this.m;
                float f = this.n;
                wh.m1858xc24f4d15(cVar4, j, j2, f, (hs2) obj3, this.o, this.p, (ck0) obj, iV4, i6);
                break;
        }
        return w84Var;
    }
}

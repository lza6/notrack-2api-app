package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class sq2 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ uq1 l;
    public final /* synthetic */ c m;
    public final /* synthetic */ bu3 n;
    public final /* synthetic */ rg3 o;
    public final /* synthetic */ float p;
    public final /* synthetic */ float q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq2(Object obj, boolean z, boolean z2, uq1 uq1Var, c cVar, bu3 bu3Var, rg3 rg3Var, float f, float f2, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.t = obj;
        this.d = z;
        this.h = z2;
        this.l = uq1Var;
        this.m = cVar;
        this.n = bu3Var;
        this.o = rg3Var;
        this.p = f;
        this.q = f2;
        this.r = i;
        this.s = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.r;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.s;
                ((wq2) obj3).m1869x43ded36f(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.s;
                ((tu3) obj3).m1809x43ded36f(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

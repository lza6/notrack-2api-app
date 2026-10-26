package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class o91 extends ww1 implements ne1 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ c d;
    public final /* synthetic */ el h;
    public final /* synthetic */ gl l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ oe1 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o91(c cVar, el elVar, gl glVar, z7 z7Var, int i, int i2, oe1 oe1Var, int i3, int i4) {
        super(2);
        this.d = cVar;
        this.h = elVar;
        this.l = glVar;
        this.r = z7Var;
        this.m = i;
        this.n = i2;
        this.o = oe1Var;
        this.p = i3;
        this.q = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o91(c cVar, gl glVar, el elVar, y7 y7Var, int i, int i2, oe1 oe1Var, int i3, int i4) {
        super(2);
        this.d = cVar;
        this.l = glVar;
        this.h = elVar;
        this.r = y7Var;
        this.m = i;
        this.n = i2;
        this.o = oe1Var;
        this.p = i3;
        this.q = i4;
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
                y7 y7Var = (y7) obj3;
                int iV = sf3.V(i2 | 1);
                int i3 = this.q;
                u91.FlowColumn(this.d, this.l, this.h, y7Var, this.m, this.n, this.o, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.q;
                c cVar = this.d;
                el elVar = this.h;
                gl glVar = this.l;
                u91.FlowRow(cVar, elVar, glVar, (z7) obj3, this.m, this.n, this.o, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class n91 extends ww1 implements ne1 {
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
    public final /* synthetic */ w91 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(c cVar, el elVar, gl glVar, z7 z7Var, int i, int i2, ba1 ba1Var, oe1 oe1Var, int i3, int i4) {
        super(2);
        this.d = cVar;
        this.h = elVar;
        this.l = glVar;
        this.r = z7Var;
        this.m = i;
        this.n = i2;
        this.s = ba1Var;
        this.o = oe1Var;
        this.p = i3;
        this.q = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n91(c cVar, gl glVar, el elVar, y7 y7Var, int i, int i2, m81 m81Var, oe1 oe1Var, int i3, int i4) {
        super(2);
        this.d = cVar;
        this.l = glVar;
        this.h = elVar;
        this.r = y7Var;
        this.m = i;
        this.n = i2;
        this.s = m81Var;
        this.o = oe1Var;
        this.p = i3;
        this.q = i4;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.p;
        w91 w91Var = this.s;
        Object obj3 = this.r;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                y7 y7Var = (y7) obj3;
                m81 m81Var = (m81) w91Var;
                int iV = sf3.V(i2 | 1);
                int i3 = this.q;
                u91.FlowColumn(this.d, this.l, this.h, y7Var, this.m, this.n, m81Var, this.o, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.q;
                c cVar = this.d;
                el elVar = this.h;
                gl glVar = this.l;
                int i5 = this.m;
                int i6 = this.n;
                u91.FlowRow(cVar, elVar, glVar, (z7) obj3, i5, i6, (ba1) w91Var, this.o, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

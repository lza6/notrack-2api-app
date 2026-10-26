package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class az extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ rg3 m;
    public final /* synthetic */ ty n;
    public final /* synthetic */ xy o;
    public final /* synthetic */ iw p;
    public final /* synthetic */ hs2 q;
    public final /* synthetic */ gh2 r;
    public final /* synthetic */ oe1 s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ az(je1 je1Var, c cVar, boolean z, rg3 rg3Var, ty tyVar, xy xyVar, iw iwVar, hs2 hs2Var, gh2 gh2Var, oe1 oe1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = je1Var;
        this.h = cVar;
        this.l = z;
        this.m = rg3Var;
        this.n = tyVar;
        this.o = xyVar;
        this.p = iwVar;
        this.q = hs2Var;
        this.r = gh2Var;
        this.s = oe1Var;
        this.t = i;
        this.u = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.t;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.u;
                bz.Button(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV, i3);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.u;
                bz.ElevatedButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV2, i4);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iV3 = sf3.V(i2 | 1);
                int i5 = this.u;
                bz.FilledTonalButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV3, i5);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iV4 = sf3.V(i2 | 1);
                int i6 = this.u;
                bz.OutlinedButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV4, i6);
                break;
            default:
                ((Number) obj2).intValue();
                int iV5 = sf3.V(i2 | 1);
                int i7 = this.u;
                bz.TextButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, (ck0) obj, iV5, i7);
                break;
        }
        return w84Var;
    }
}

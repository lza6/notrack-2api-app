package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class hl1 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ rg3 m;
    public final /* synthetic */ dl1 n;
    public final /* synthetic */ gh2 o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl1(je1 je1Var, c cVar, boolean z, rg3 rg3Var, dl1 dl1Var, gh2 gh2Var, ne1 ne1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = je1Var;
        this.h = cVar;
        this.l = z;
        this.m = rg3Var;
        this.n = dl1Var;
        this.o = gh2Var;
        this.p = ne1Var;
        this.q = i;
        this.r = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.q;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.r;
                rl1.FilledIconButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.r;
                rl1.FilledTonalIconButton(this.d, this.h, this.l, this.m, this.n, this.o, this.p, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

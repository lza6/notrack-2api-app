package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class i7 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ c h;
    public final /* synthetic */ uv0 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i7(je1 je1Var, c cVar, uv0 uv0Var, ne1 ne1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = je1Var;
        this.h = cVar;
        this.l = uv0Var;
        this.m = ne1Var;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.o;
                x7.AlertDialog(this.d, this.h, this.l, this.m, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.o;
                x7.BasicAlertDialog(this.d, this.h, this.l, this.m, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

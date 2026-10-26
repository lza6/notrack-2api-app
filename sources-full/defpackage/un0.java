package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class un0 extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ ho0 d;
    public final /* synthetic */ je1 h;
    public final /* synthetic */ c l;
    public final /* synthetic */ le1 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un0(ho0 ho0Var, je1 je1Var, c cVar, le1 le1Var, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = ho0Var;
        this.h = je1Var;
        this.l = cVar;
        this.m = le1Var;
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
                vn0.ContextMenu(this.d, this.h, this.l, this.m, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.o;
                vn0.ContextMenu(this.d, this.h, this.l, this.m, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

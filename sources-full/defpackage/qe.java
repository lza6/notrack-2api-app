package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.viewinterop.a;

/* JADX INFO: loaded from: classes.dex */
public final class qe extends ww1 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ c d;
    public final /* synthetic */ le1 h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ se1 o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(le1 le1Var, c cVar, le1 le1Var2, le1 le1Var3, le1 le1Var4, int i, int i2) {
        super(2);
        this.h = le1Var;
        this.d = cVar;
        this.n = le1Var2;
        this.o = le1Var3;
        this.p = le1Var4;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(tx2 tx2Var, je1 je1Var, c cVar, wn0 wn0Var, le1 le1Var, int i, int i2) {
        super(2);
        this.n = tx2Var;
        this.o = je1Var;
        this.d = cVar;
        this.p = wn0Var;
        this.h = le1Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        Object obj3 = this.p;
        se1 se1Var = this.o;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                int i3 = this.m;
                le1 le1Var = this.h;
                c cVar = this.d;
                a.AndroidView(le1Var, cVar, (le1) obj4, (le1) se1Var, (le1) obj3, (ck0) obj, iV, i3);
                break;
            default:
                ((Number) obj2).intValue();
                int iV2 = sf3.V(i2 | 1);
                int i4 = this.m;
                c cVar2 = this.d;
                ko0.ContextMenuPopup((tx2) obj4, (je1) se1Var, cVar2, (wn0) obj3, this.h, (ck0) obj, iV2, i4);
                break;
        }
        return w84Var;
    }
}

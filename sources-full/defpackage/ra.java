package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.viewinterop.a;

/* JADX INFO: loaded from: classes.dex */
public final class ra extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra(int i, int i2, int i3, se1 se1Var, Object obj, Object obj2) {
        super(2);
        this.c = i3;
        this.l = obj;
        this.m = obj2;
        this.n = se1Var;
        this.d = i;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(c cVar, ne1 ne1Var, vb2 vb2Var, int i, int i2) {
        super(2);
        this.c = 3;
        this.l = cVar;
        this.n = ne1Var;
        this.m = vb2Var;
        this.d = i;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(Object obj, int i, y02 y02Var, ne1 ne1Var, int i2) {
        super(2);
        this.c = 5;
        this.l = obj;
        this.d = i;
        this.m = y02Var;
        this.n = ne1Var;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(ne1 ne1Var, c cVar, ne1 ne1Var2, int i, int i2) {
        super(2);
        this.c = 6;
        this.n = ne1Var;
        this.l = cVar;
        this.m = ne1Var2;
        this.d = i;
        this.h = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ra(q02 q02Var, Object obj, int i, Object obj2, int i2) {
        super(2);
        this.c = 4;
        this.l = q02Var;
        this.m = obj;
        this.d = i;
        this.n = obj2;
        this.h = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        int i2 = this.h;
        int i3 = this.d;
        Object obj3 = this.n;
        Object obj4 = this.m;
        Object obj5 = this.l;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                wa.Dialog((je1) obj5, (uv0) obj4, (ne1) obj3, (ck0) obj, sf3.V(i3 | 1), this.h);
                break;
            case 1:
                ((Number) obj2).intValue();
                a.AndroidView((le1) obj5, (c) obj4, (le1) obj3, (ck0) obj, sf3.V(i3 | 1), this.h);
                break;
            case 2:
                ((Number) obj2).intValue();
                ko0.ContextMenuColumn((wn0) obj5, (c) obj4, (oe1) obj3, (ck0) obj, sf3.V(i3 | 1), this.h);
                break;
            case 3:
                ((Number) obj2).intValue();
                ix1.MultiMeasureLayout((c) obj5, (ne1) obj3, (vb2) obj4, (ck0) obj, sf3.V(i3 | 1), this.h);
                break;
            case 4:
                ((Number) obj2).intValue();
                q02 q02Var = (q02) obj5;
                p02.m1799x1e2afaf6(q02Var, this.m, this.d, this.n, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                int iV = sf3.V(i2 | 1);
                Object obj6 = this.l;
                int i4 = this.d;
                x02.LazyLayoutPinnableItem(obj6, i4, (y02) obj4, (ne1) obj3, (ck0) obj, iV);
                break;
            case 6:
                ((Number) obj2).intValue();
                uj2.PermanentNavigationDrawer((ne1) obj3, (c) obj5, (ne1) obj4, (ck0) obj, sf3.V(i3 | 1), this.h);
                break;
            default:
                ((Number) obj2).intValue();
                fp3.SubcomposeLayout((ip3) obj5, (c) obj4, (ne1) obj3, (ck0) obj, sf3.V(i3 | 1), this.h);
                break;
        }
        return w84Var;
    }
}

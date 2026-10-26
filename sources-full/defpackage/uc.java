package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class uc extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uc(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = obj;
        this.h = obj2;
        this.n = obj3;
        this.o = obj4;
        this.l = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(je1 je1Var, c cVar, b12 b12Var, ne1 ne1Var, int i, int i2) {
        super(2);
        this.c = 3;
        this.h = je1Var;
        this.d = cVar;
        this.n = b12Var;
        this.o = ne1Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.l;
        Object obj3 = this.o;
        Object obj4 = this.n;
        Object obj5 = this.h;
        Object obj6 = this.d;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                yc.Popup((tx2) obj6, (je1) obj5, (ux2) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1), this.m);
                break;
            case 1:
                ((Number) obj2).intValue();
                ko0.ContextMenuPopup((tx2) obj6, (je1) obj5, (c) obj4, (le1) obj3, (ck0) obj, sf3.V(i2 | 1), this.m);
                break;
            case 2:
                ((Number) obj2).intValue();
                ul1.Icon((ms2) obj6, (xe0) obj5, (String) obj4, (c) obj3, (ck0) obj, sf3.V(i2 | 1), this.m);
                break;
            case 3:
                ((Number) obj2).intValue();
                r02.LazyLayout((je1) obj5, (c) obj6, (b12) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1), this.m);
                break;
            default:
                ((Number) obj2).intValue();
                qd3.SelectionContainer((c) obj6, (fd3) obj5, (le1) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1), this.m);
                break;
        }
        return w84Var;
    }
}

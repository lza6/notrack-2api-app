package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class kd extends ww1 implements ne1 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(c cVar, je1 je1Var, boolean z, int i) {
        super(2);
        this.l = cVar;
        this.m = je1Var;
        this.d = z;
        this.h = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(wx3 wx3Var, boolean z, ne1 ne1Var, int i) {
        super(2);
        this.l = wx3Var;
        this.d = z;
        this.m = ne1Var;
        this.h = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd(boolean z, u53 u53Var, xw3 xw3Var, int i) {
        super(2);
        this.d = z;
        this.l = u53Var;
        this.m = xw3Var;
        this.h = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        Object obj3 = this.m;
        Object obj4 = this.l;
        boolean z = this.d;
        ck0 ck0Var = (ck0) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                od.SelectionHandleIcon((c) obj4, (je1) obj3, z, ck0Var, sf3.V(i2 | 1));
                break;
            case 1:
                po0.ContextMenuArea((wx3) obj4, z, (ne1) obj3, ck0Var, sf3.V(i2 | 1));
                break;
            default:
                ax3.TextFieldSelectionHandle(z, (u53) obj4, (xw3) obj3, ck0Var, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}

package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class uw extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw(int i, int i2, Object obj) {
        super(2);
        this.c = i2;
        this.h = obj;
        this.d = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.d;
        Object obj3 = this.h;
        ck0 ck0Var = (ck0) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                vw.Box((c) obj3, ck0Var, sf3.V(i2 | 1));
                break;
            case 1:
                qp0.TextFieldCursorHandle((xw3) obj3, ck0Var, sf3.V(i2 | 1));
                break;
            case 2:
                ((go1) obj3).run$animation_core_release(ck0Var, sf3.V(i2 | 1));
                break;
            case 3:
                k22.LazySaveableStateHolderProvider((oe1) obj3, ck0Var, sf3.V(i2 | 1));
                break;
            case 4:
                ((re2) obj3).Content(ck0Var, sf3.V(i2 | 1));
                break;
            default:
                ((cz3) obj3).LinksComposables(ck0Var, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}

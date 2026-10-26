package defpackage;

import androidx.compose.ui.c;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ed extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed(Object obj, Object obj2, Object obj3, int i, int i2) {
        super(2);
        this.c = i2;
        this.h = obj;
        this.l = obj2;
        this.m = obj3;
        this.d = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.d;
        Object obj3 = this.m;
        Object obj4 = this.l;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                od.HandlePopup((pn2) obj5, (a8) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                c10.Canvas((c) obj5, (String) obj4, (le1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ((yg0) obj5).d(obj4, obj3, (ck0) obj, sf3.V(i2) | 1);
                break;
            case 3:
                ((Number) obj2).intValue();
                qp0.CoreTextFieldRootBox((c) obj5, (xw3) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                Object[] objArr = (Object[]) obj4;
                ((cz3) obj5).StyleAnnotation(Arrays.copyOf(objArr, objArr.length), (le1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}

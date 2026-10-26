package defpackage;

import androidx.compose.ui.c;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class va extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ va(Object obj, Object obj2, int i, int i2, int i3) {
        super(2);
        this.c = i3;
        this.d = obj;
        this.h = obj2;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.m;
        int i3 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.d;
        ck0 ck0Var = (ck0) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                wa.DialogLayout((c) obj4, (ne1) obj3, ck0Var, sf3.V(i3 | 1), i2);
                break;
            case 1:
                qd3.SelectionContainer((c) obj4, (ne1) obj3, ck0Var, sf3.V(i3 | 1), i2);
                break;
            case 2:
                rh3.SimpleLayout((c) obj4, (ne1) obj3, ck0Var, sf3.V(i3 | 1), i2);
                break;
            case 3:
                fp3.SubcomposeLayout((c) obj4, (ne1) obj3, ck0Var, sf3.V(i3 | 1), i2);
                break;
            default:
                ub4.RenderVectorGroup((ob4) obj4, (Map) obj3, ck0Var, sf3.V(i3 | 1), i2);
                break;
        }
        return w84Var;
    }
}

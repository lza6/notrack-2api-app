package defpackage;

import androidx.compose.ui.c;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wc extends ww1 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.c = i2;
        this.h = obj;
        this.l = obj2;
        this.d = i;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.d;
        Object obj3 = this.l;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                yc.PopupTestTag((String) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                jg.InlineChildren((hg) obj4, (List) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                c10.Canvas((c) obj4, (le1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                ((yg0) obj4).c(obj3, (ck0) obj, sf3.V(i2) | 1);
                break;
            case 4:
                ((Number) obj2).intValue();
                s13[] s13VarArr = (s13[]) obj4;
                yk0.CompositionLocalProvider((s13[]) Arrays.copyOf(s13VarArr, s13VarArr.length), (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                yk0.CompositionLocalProvider((s13) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                yk0.CompositionLocalProvider((xk0) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                ((co0) obj4).Content$foundation_release((wn0) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 8:
                ((Number) obj2).intValue();
                po0.ContextMenuArea((xw3) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                po0.ContextMenuArea((le3) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                xj2.DrawerPredictiveBackHandler((h01) obj4, (oe1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                uy3.ProvideTextStyle((uz3) obj4, (ne1) obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                ((o54) obj4).animateTo$animation_core_release(obj3, (ck0) obj, sf3.V(i2 | 1));
                break;
        }
        return w84Var;
    }
}

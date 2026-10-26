package defpackage;

import androidx.compose.ui.c;
import notrack.ai.data.promo.OwnConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr2 implements ne1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object l;

    public /* synthetic */ tr2(Object obj, int i, int i2, int i3) {
        this.c = i3;
        this.l = obj;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        w84 w84Var = w84.a;
        int i2 = this.h;
        int i3 = this.d;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vr2.a((OwnConfig) obj3, i3, (ck0) obj, i2);
                break;
            default:
                ((Integer) obj2).intValue();
                qz3.TextSizeGlyph((c) obj3, (ck0) obj, sf3.V(i3 | 1), i2);
                break;
        }
        return w84Var;
    }
}

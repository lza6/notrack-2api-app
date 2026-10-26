package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(c cVar, int i, int i2) {
        super(2);
        this.c = cVar;
        this.d = i;
        this.h = i2;
    }

    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iV = sf3.V(this.d | 1);
        int i = this.h;
        oa.DefaultCursorHandle(this.c, (ck0) obj, iV, i);
        return w84.a;
    }
}

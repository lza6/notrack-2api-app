package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class hd extends ww1 implements ne1 {
    public final /* synthetic */ ViewConfiguration c;
    public final /* synthetic */ long d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ c l;
    public final /* synthetic */ pn2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd(ViewConfiguration viewConfiguration, long j, boolean z, c cVar, pn2 pn2Var) {
        super(2);
        this.c = viewConfiguration;
        this.d = j;
        this.h = z;
        this.l = cVar;
        this.m = pn2Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            yk0.CompositionLocalProvider(CompositionLocalsKt.getLocalViewConfiguration().c(this.c), zg0.rememberComposableLambda(1260045569, true, new gd(this.d, this.h, this.l, this.m), kk0Var, 54), kk0Var, 56);
        } else {
            kk0Var.V();
        }
    }
}

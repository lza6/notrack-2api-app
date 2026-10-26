package defpackage;

import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class fw3 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ gw3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fw3(gw3 gw3Var, int i) {
        super(1);
        this.c = i;
        this.d = gw3Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        gw3 gw3Var = this.d;
        switch (i) {
            case 0:
                return new ln2(((ln2) gw3Var.p.d()).a);
            default:
                long j = ((ux0) obj).a;
                wu0 wu0Var = (wu0) gm4.t(gw3Var, CompositionLocalsKt.getLocalDensity());
                gw3Var.o.setValue(new qq1((((long) wu0Var.O(ux0.b(j))) << 32) | (((long) wu0Var.O(ux0.a(j))) & 4294967295L)));
                return w84.a;
        }
    }
}

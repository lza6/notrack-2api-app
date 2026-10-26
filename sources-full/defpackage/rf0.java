package defpackage;

import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class rf0 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ sf0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rf0(sf0 sf0Var, int i) {
        super(1);
        this.c = i;
        this.d = sf0Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        int i = this.c;
        w84 w84Var = w84.a;
        sf0 sf0Var = this.d;
        switch (i) {
            case 0:
                long j = ((ln2) obj).a;
                je1 je1Var = sf0Var.B;
                if (je1Var != null) {
                    je1Var.invoke();
                }
                if (sf0Var.C) {
                    ((lh1) gm4.t(sf0Var, CompositionLocalsKt.getLocalHapticFeedback())).mo63x70bb4fce(0);
                }
                break;
            default:
                long j2 = ((ln2) obj).a;
                if (sf0Var.o) {
                    sf0Var.p.invoke();
                }
                break;
        }
        return w84Var;
    }
}

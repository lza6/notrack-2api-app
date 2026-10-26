package defpackage;

import androidx.compose.animation.b;

/* JADX INFO: loaded from: classes.dex */
public final class i41 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ j41 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i41(j41 j41Var, int i) {
        super(1);
        this.c = i;
        this.d = j41Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        hi3 hi3Var;
        int i = this.c;
        d41 d41Var = d41.h;
        d41 d41Var2 = d41.d;
        d41 d41Var3 = d41.c;
        j41 j41Var = this.d;
        switch (i) {
            case 0:
                l54 l54Var = (l54) obj;
                boolean zA = l54Var.a(d41Var3, d41Var2);
                Object obj2 = null;
                if (zA) {
                    t20 t20Var = ((l41) j41Var.m).b.c;
                    if (t20Var != null) {
                        obj2 = t20Var.c;
                    }
                } else if (l54Var.a(d41Var2, d41Var)) {
                    t20 t20Var2 = ((y51) j41Var.n).c.c;
                    if (t20Var2 != null) {
                        obj2 = t20Var2.c;
                    }
                } else {
                    obj2 = b.d;
                }
                return obj2 == null ? b.d : obj2;
            default:
                l54 l54Var2 = (l54) obj;
                if (l54Var2.a(d41Var3, d41Var2)) {
                    hi3 hi3Var2 = ((l41) j41Var.m).b.b;
                    return hi3Var2 != null ? hi3Var2.b : b.c;
                }
                if (l54Var2.a(d41Var2, d41Var) && (hi3Var = ((y51) j41Var.n).c.b) != null) {
                    return hi3Var.b;
                }
                return b.c;
        }
    }
}

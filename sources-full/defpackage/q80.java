package defpackage;

import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q80 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ g22 d;

    public /* synthetic */ q80(g22 g22Var, int i) {
        this.c = i;
        this.d = g22Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        boolean z = true;
        int i2 = 0;
        g22 g22Var = this.d;
        switch (i) {
            case 0:
                a22 a22Var = (a22) ke0.F0(g22Var.g().k);
                if (a22Var != null && (a22Var.a != g22Var.g().n - 1 || a22Var.m + a22Var.n > g22Var.g().m)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                z12 z12VarG = g22Var.g();
                a22 a22Var2 = (a22) ke0.F0(z12VarG.k);
                if (a22Var2 != null) {
                    if (a22Var2.a < z12VarG.n - 1) {
                        i2 = IntCompanionObject.MAX_VALUE;
                    } else {
                        int i3 = (a22Var2.m + a22Var2.n) - z12VarG.m;
                        if (i3 >= 0) {
                            i2 = i3;
                        }
                    }
                }
                return Integer.valueOf(i2);
            default:
                return Boolean.valueOf(g22Var.h.b());
        }
    }
}

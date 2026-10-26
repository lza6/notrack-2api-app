package defpackage;

import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.WindowInfo;

/* JADX INFO: loaded from: classes.dex */
public final class hu3 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ nu3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hu3(nu3 nu3Var, int i) {
        super(0);
        this.c = i;
        this.d = nu3Var;
    }

    @Override // defpackage.je1
    public final Object invoke() {
        int i = this.c;
        int i2 = 2;
        vz3 vz3Var = vz3.h;
        int i3 = 1;
        int i4 = 3;
        so0 so0Var = null;
        w84 w84Var = w84.a;
        nu3 nu3Var = this.d;
        switch (i) {
            case 0:
                y64.J(nu3Var);
                return w84Var;
            case 1:
                py.F(nu3Var.getCoroutineScope(), null, null, new iu3(nu3Var, so0Var, i3), 3);
                return Boolean.TRUE;
            case 2:
                py.F(nu3Var.getCoroutineScope(), null, null, new iu3(nu3Var, so0Var, i2), 3);
                return Boolean.TRUE;
            case 3:
                if (!nu3Var.A0()) {
                    xp1.A(nu3Var);
                } else if (!nu3Var.o) {
                    nu3Var.C0().show();
                }
                return Boolean.TRUE;
            case 4:
                if (!nu3Var.A0()) {
                    xp1.A(nu3Var);
                }
                nu3Var.m.x(vz3Var);
                return Boolean.TRUE;
            case 5:
                py.F(nu3Var.getCoroutineScope(), null, null, new iu3(nu3Var, so0Var, i4), 3);
                return Boolean.TRUE;
            case 6:
                u33.a(nu3Var);
                return gu3.a;
            case 7:
                return nu3Var.h.a.b().d.toString();
            case 8:
                int iA = nu3Var.p.a();
                nu3 nu3Var2 = nu3Var.B.a;
                if (iA == 6) {
                    ((va1) ((pa1) gm4.t(nu3Var2, CompositionLocalsKt.getLocalFocusManager()))).f(1);
                } else if (iA == 5) {
                    ((va1) ((pa1) gm4.t(nu3Var2, CompositionLocalsKt.getLocalFocusManager()))).f(2);
                } else if (iA == 7) {
                    nu3Var2.C0().hide();
                }
                return w84Var;
            case 9:
                nu3Var.y = (WindowInfo) gm4.t(nu3Var, CompositionLocalsKt.getLocalWindowInfo());
                nu3Var.B0();
                return w84Var;
            case 10:
                if (nu3Var.D != null) {
                    nu3Var.C0().show();
                } else {
                    nu3Var.D0(true);
                }
                return w84Var;
            case 11:
                u33.a(nu3Var);
                return null;
            case 12:
                nu3Var.m.x(vz3Var);
                return w84Var;
            default:
                y64.J(nu3Var);
                return w84Var;
        }
    }
}

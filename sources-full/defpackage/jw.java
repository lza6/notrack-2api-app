package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class jw {
    public static final jw a = new jw();
    public static final is2 b;

    static {
        float f = wh.a;
        b = a.c(4.0f, 4.0f, 0.0f, 8);
    }

    public final kw exitAlwaysScrollBehavior(androidx.compose.material3.a aVar, je1 je1Var, wf wfVar, zr0 zr0Var, ck0 ck0Var, int i, int i2) {
        ck0 ck0Var2;
        if ((i2 & 1) != 0) {
            ck0Var2 = ck0Var;
            aVar = wh.rememberBottomAppBarState(0.0f, 0.0f, 0.0f, ck0Var2, 0, 7);
        } else {
            ck0Var2 = ck0Var;
        }
        if ((i2 & 2) != 0) {
            je1Var = d4.t;
        }
        if ((i2 & 4) != 0) {
            wfVar = kr1.l0(5, null);
        }
        if ((i2 & 8) != 0) {
            zr0Var = rm3.rememberSplineBasedDecay(ck0Var2, 0);
        }
        return new ci4(aVar, wfVar, zr0Var, je1Var);
    }

    public final long getBottomAppBarFabColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.u, ck0Var, 6);
    }

    public final long getContainerColor(ck0 ck0Var, int i) {
        return af0.getValue(ze0.w, ck0Var, 6);
    }

    public final e getWindowInsets(ck0 ck0Var, int i) {
        return new v32(dr3.getSystemBarsForVisualComponents(e.a, ck0Var, 6), mh4.e | 32);
    }
}

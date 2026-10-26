package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ao1;
import defpackage.av1;
import defpackage.bd0;
import defpackage.bg1;
import defpackage.cd0;
import defpackage.dd0;
import defpackage.gc3;
import defpackage.gh2;
import defpackage.hh2;
import defpackage.ir;
import defpackage.je1;
import defpackage.k43;
import defpackage.n73;
import defpackage.ng3;
import defpackage.nq2;
import defpackage.pr2;
import defpackage.rc;
import defpackage.rg3;
import defpackage.t73;
import defpackage.tu1;
import defpackage.vn1;
import defpackage.w71;
import defpackage.xr0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static androidx.compose.ui.c a(androidx.compose.ui.c cVar, ng3 ng3Var, rg3 rg3Var, int i) {
        if ((i & 2) != 0) {
            rg3Var = k43.a;
        }
        rg3 rg3Var2 = rg3Var;
        return cVar.then(new BackgroundElement(0L, ng3Var, rg3Var2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new rc(ng3Var, 4, rg3Var2) : InspectableValueKt.getNoInspectorInfo(), 1));
    }

    public static final androidx.compose.ui.c b(androidx.compose.ui.c cVar, long j, rg3 rg3Var) {
        return cVar.then(new BackgroundElement(j, null, rg3Var, InspectableValueKt.isDebugInspectorInfoEnabled() ? new ir(0, j, rg3Var) : InspectableValueKt.getNoInspectorInfo(), 2));
    }

    public static final androidx.compose.ui.c c(androidx.compose.ui.c cVar, gh2 gh2Var, vn1 vn1Var, boolean z, String str, n73 n73Var, je1 je1Var) {
        androidx.compose.ui.c cVarThen;
        if (vn1Var instanceof ao1) {
            cVarThen = new ClickableElement(gh2Var, (ao1) vn1Var, z, str, n73Var, je1Var);
        } else if (vn1Var == null) {
            cVarThen = new ClickableElement(gh2Var, null, z, str, n73Var, je1Var);
        } else {
            cVarThen = gh2Var != null ? d.a(androidx.compose.ui.c.i, gh2Var, vn1Var).then(new ClickableElement(gh2Var, null, z, str, n73Var, je1Var)) : androidx.compose.ui.b.a(androidx.compose.ui.c.i, InspectableValueKt.getNoInspectorInfo(), new b(vn1Var, z, str, n73Var, je1Var));
        }
        return cVar.then(cVarThen);
    }

    public static /* synthetic */ androidx.compose.ui.c d(androidx.compose.ui.c cVar, gh2 gh2Var, vn1 vn1Var, boolean z, n73 n73Var, je1 je1Var, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            n73Var = null;
        }
        return c(cVar, gh2Var, vn1Var, z2, null, n73Var, je1Var);
    }

    public static androidx.compose.ui.c e(androidx.compose.ui.c cVar, boolean z, String str, je1 je1Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return androidx.compose.ui.b.a(cVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new cd0(z, str, je1Var) : InspectableValueKt.getNoInspectorInfo(), new bd0(z, str, je1Var));
    }

    public static final androidx.compose.ui.c f(androidx.compose.ui.c cVar, gh2 gh2Var, vn1 vn1Var, je1 je1Var, je1 je1Var2) {
        androidx.compose.ui.c cVarThen;
        if (vn1Var instanceof ao1) {
            cVarThen = new CombinedClickableElement(je1Var2, je1Var, (ao1) vn1Var, gh2Var);
        } else if (vn1Var == null) {
            cVarThen = new CombinedClickableElement(je1Var2, je1Var, null, gh2Var);
        } else {
            cVarThen = gh2Var != null ? d.a(androidx.compose.ui.c.i, gh2Var, vn1Var).then(new CombinedClickableElement(je1Var2, je1Var, null, gh2Var)) : androidx.compose.ui.b.a(androidx.compose.ui.c.i, InspectableValueKt.getNoInspectorInfo(), new c(vn1Var, je1Var2, je1Var));
        }
        return cVar.then(cVarThen);
    }

    public static androidx.compose.ui.c g(androidx.compose.ui.c cVar, je1 je1Var, je1 je1Var2) {
        return androidx.compose.ui.b.a(cVar, InspectableValueKt.isDebugInspectorInfoEnabled() ? new rc(je1Var2, 13, je1Var) : InspectableValueKt.getNoInspectorInfo(), new dd0(je1Var, je1Var2));
    }

    public static final androidx.compose.ui.c h(androidx.compose.ui.c cVar, boolean z, gh2 gh2Var) {
        return cVar.then(z ? new FocusableElement(gh2Var) : androidx.compose.ui.c.i);
    }

    public static androidx.compose.ui.c i(androidx.compose.ui.c cVar, gh2 gh2Var) {
        return cVar.then(new HoverableElement(gh2Var));
    }

    public static final boolean j(KeyEvent keyEvent) {
        long jY = av1.y(keyEvent);
        int i = tu1.n;
        if (tu1.a(jY, tu1.f) ? true : tu1.a(jY, tu1.i) ? true : tu1.a(jY, tu1.m)) {
            return true;
        }
        return tu1.a(jY, tu1.h);
    }

    public static androidx.compose.ui.c k(androidx.compose.ui.c cVar, gc3 gc3Var, nq2 nq2Var, boolean z, boolean z2, w71 w71Var, hh2 hh2Var, boolean z3, pr2 pr2Var) {
        return cVar.then(nq2Var == nq2.c ? xr0.N(androidx.compose.ui.c.i, bg1.D) : xr0.N(androidx.compose.ui.c.i, t73.q)).then(new ScrollingContainerElement(w71Var, hh2Var, nq2Var, pr2Var, gc3Var, z, z2, z3));
    }
}

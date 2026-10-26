package defpackage;

import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public abstract class kz0 {
    public static final iz0 a;
    public static final iz0 b;

    static {
        int i = 3;
        so0 so0Var = null;
        a = new iz0(i, 0, so0Var);
        b = new iz0(i, 1, so0Var);
    }

    public static c a(c cVar, nz0 nz0Var, nq2 nq2Var, boolean z, gh2 gh2Var, boolean z2, oe1 oe1Var, boolean z3, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            gh2Var = null;
        }
        return cVar.then(new DraggableElement(nz0Var, nq2Var, z4, gh2Var, (i & 16) != 0 ? false : z2, a, oe1Var, (i & Uuid.SIZE_BITS) != 0 ? false : z3));
    }

    public static final nz0 rememberDraggableState(le1 le1Var, ck0 ck0Var, int i) {
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var, ck0Var, i & 14);
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (objP == Composer$Companion.getEmpty()) {
            ps0 ps0Var = new ps0(new jz0(gn3VarRememberUpdatedState, 0));
            kk0Var.l0(ps0Var);
            objP = ps0Var;
        }
        return (nz0) objP;
    }
}

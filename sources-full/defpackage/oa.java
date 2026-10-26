package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class oa {
    public static final float a = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: CursorHandle-USBMPiE, reason: not valid java name */
    public static final void m1777x858f5fb4(pn2 pn2Var, c cVar, long j, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1776202187);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? kk0Var.h(pn2Var) : kk0Var.j(pn2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= ((i2 & 4) == 0 && kk0Var.g(j)) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i3 & 1, (i3 & 147) != 146)) {
            kk0Var.X();
            if ((i & 1) != 0 && !kk0Var.D()) {
                kk0Var.V();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                i3 &= -897;
                j = 9205357640488583168L;
            }
            kk0Var.s();
            int i4 = i3 & 14;
            boolean z = i4 == 4 || ((i3 & 8) != 0 && kk0Var.j(pn2Var));
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new e8(1, pn2Var);
                kk0Var.l0(objP);
            }
            od.HandlePopup(pn2Var, Alignment$Companion.getTopCenter(), zg0.rememberComposableLambda(-1653527038, true, new ia(j, we3.b(cVar, false, (le1) objP)), kk0Var, 54), kk0Var, i4 | 432);
        } else {
            kk0Var.V();
        }
        long j2 = j;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ja(pn2Var, cVar, j2, i, i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DefaultCursorHandle(c cVar, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (kk0Var.S(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                cVar = c.i;
            }
            cm3.Spacer(b.a(d.k(cVar, a, 25.0f), InspectableValueKt.getNoInspectorInfo(), na.c), kk0Var, 0);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ka(cVar, i, i2));
        }
    }
}

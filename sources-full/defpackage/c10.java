package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.draw.a;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class c10 {
    public static final void Canvas(c cVar, String str, le1 le1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1162737955);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(le1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            c cVarA = a.a(cVar, le1Var);
            boolean z = (i2 & 112) == 32;
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = new v7(str, 2);
                kk0Var.l0(objP);
            }
            cm3.Spacer(we3.b(cVarA, false, (le1) objP), kk0Var, 0);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ed(cVar, str, le1Var, i, 1));
        }
    }

    public static final void Canvas(c cVar, le1 le1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-932836462);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(le1Var) ? 32 : 16;
        }
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            cm3.Spacer(a.a(cVar, le1Var), kk0Var, 0);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, i3, cVar, le1Var));
        }
    }
}

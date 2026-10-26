package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ax3 {
    public static final void TextFieldSelectionHandle(boolean z, u53 u53Var, xw3 xw3Var, ck0 ck0Var, int i) {
        int i2;
        boolean z2;
        u53 u53Var2;
        yy3 yy3VarD;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1344558920);
        if ((i & 6) == 0) {
            i2 = (kk0Var.i(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(u53Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(xw3Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        int i3 = 1;
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            int i4 = i2 & 14;
            boolean zH = (i4 == 4) | kk0Var.h(xw3Var);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                xw3Var.getClass();
                objP = new ke3(xw3Var, z);
                kk0Var.l0(objP);
            }
            xt3 xt3Var = (xt3) objP;
            boolean zJ = kk0Var.j(xw3Var) | (i4 == 4);
            Object objP2 = kk0Var.P();
            if (zJ || objP2 == Composer$Companion.getEmpty()) {
                objP2 = new yw3(xw3Var, z);
                kk0Var.l0(objP2);
            }
            pn2 pn2Var = (pn2) objP2;
            boolean zG = jz3.g(xw3Var.k().b);
            ey3 ey3VarK = xw3Var.k();
            int i5 = (int) (z ? ey3VarK.b >> 32 : ey3VarK.b & 4294967295L);
            z22 z22Var = xw3Var.d;
            float fU = (z22Var == null || (yy3VarD = z22Var.d()) == null) ? 0.0f : jr1.u(yy3VarD.a, i5);
            Modifier$Companion modifier$Companion = c.i;
            boolean zJ2 = kk0Var.j(xt3Var);
            Object objP3 = kk0Var.P();
            if (zJ2 || objP3 == Composer$Companion.getEmpty()) {
                objP3 = new jd3(xt3Var, i3);
                kk0Var.l0(objP3);
            }
            u53Var2 = u53Var;
            float f = fU;
            z2 = z;
            od.m1779x3a93ba2d(pn2Var, z2, u53Var2, zG, 0L, f, oq3.b(modifier$Companion, xt3Var, (PointerInputEventHandler) objP3), kk0Var, (i2 << 3) & 1008, 16);
        } else {
            z2 = z;
            u53Var2 = u53Var;
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new kd(z2, u53Var2, xw3Var, i));
        }
    }

    public static final boolean a(xw3 xw3Var, boolean z) {
        cx1 cx1VarC;
        z22 z22Var = xw3Var.d;
        if (z22Var == null || (cx1VarC = z22Var.c()) == null) {
            return false;
        }
        return vl0.z(xw3Var.j(z), vl0.j0(cx1VarC));
    }
}

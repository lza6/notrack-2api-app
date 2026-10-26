package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class cx {
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0064  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:53:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void BoxWithConstraints(c cVar, a8 a8Var, boolean z, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        boolean z3;
        a8 a8Var2;
        c cVar2;
        boolean z4;
        w33 w33VarV;
        a8 topStart;
        vb2 vb2VarC;
        boolean z5;
        boolean zH;
        Object objP;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1781813501);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(a8Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= kk0Var.i(z2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                if (kk0Var.j(oe1Var)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            i5 = 1;
            if ((i3 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (kk0Var.S(i3 & 1, z3)) {
                if (i6 != 0) {
                    cVar = c.i;
                }
                if (i7 != 0) {
                    topStart = Alignment$Companion.getTopStart();
                } else {
                    topStart = a8Var;
                }
                if (i8 != 0) {
                    z2 = false;
                }
                vb2VarC = vw.c(topStart, z2);
                if ((i3 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                zH = z5 | kk0Var.h(vb2VarC);
                objP = kk0Var.P();
                if (zH || objP == Composer$Companion.getEmpty()) {
                    objP = new da(vb2VarC, i5, oe1Var);
                    kk0Var.l0(objP);
                }
                fp3.SubcomposeLayout(cVar, (ne1) objP, kk0Var, i3 & 14, 0);
                a8Var2 = topStart;
                z4 = z2;
                cVar2 = cVar;
            } else {
                kk0Var.V();
                a8Var2 = a8Var;
                cVar2 = cVar;
                z4 = z2;
            }
            w33VarV = kk0Var.v();
            if (w33VarV != null) {
                w33VarV.updateScope(new bx(cVar2, a8Var2, z4, oe1Var, i, i2));
            }
        }
        i3 |= 384;
        z2 = z;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (kk0Var.j(oe1Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        i5 = 1;
        if ((i3 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kk0Var.S(i3 & 1, z3)) {
            if (i6 != 0) {
                cVar = c.i;
            }
            if (i7 != 0) {
                topStart = Alignment$Companion.getTopStart();
            } else {
                topStart = a8Var;
            }
            if (i8 != 0) {
                z2 = false;
            }
            vb2VarC = vw.c(topStart, z2);
            if ((i3 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            zH = z5 | kk0Var.h(vb2VarC);
            objP = kk0Var.P();
            if (zH) {
                objP = new da(vb2VarC, i5, oe1Var);
                kk0Var.l0(objP);
            } else {
                objP = new da(vb2VarC, i5, oe1Var);
                kk0Var.l0(objP);
            }
            fp3.SubcomposeLayout(cVar, (ne1) objP, kk0Var, i3 & 14, 0);
            a8Var2 = topStart;
            z4 = z2;
            cVar2 = cVar;
        } else {
            kk0Var.V();
            a8Var2 = a8Var;
            cVar2 = cVar;
            z4 = z2;
        }
        w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new bx(cVar2, a8Var2, z4, oe1Var, i, i2));
        }
    }
}

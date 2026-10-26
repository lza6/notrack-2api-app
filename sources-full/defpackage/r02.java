package defpackage;

import androidx.compose.ui.c;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class r02 {
    public static final void LazyLayout(je1 je1Var, c cVar, b12 b12Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(2002163445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(je1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(b12Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 2048 : 1024;
        }
        if (kk0Var.S(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                cVar = c.i;
            }
            if (i5 != 0) {
                b12Var = null;
            }
            k22.LazySaveableStateHolderProvider(zg0.rememberComposableLambda(-1488997347, true, new androidx.compose.foundation.lazy.layout.c(b12Var, cVar, ne1Var, cl3.rememberUpdatedState(je1Var, kk0Var, i3 & 14)), kk0Var, 54), kk0Var, 6);
        } else {
            kk0Var.V();
        }
        c cVar2 = cVar;
        b12 b12Var2 = b12Var;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uc(je1Var, cVar2, b12Var2, ne1Var, i, i2));
        }
    }
}

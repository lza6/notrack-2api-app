package defpackage;

import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class r13 {
    /* JADX INFO: renamed from: ProvideContentColorTextStyle-3J-VO9M, reason: not valid java name */
    public static final void m1803xc0df08af(long j, uz3 uz3Var, ne1 ne1Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-716124955);
        if ((i & 6) == 0) {
            i2 = (kk0Var.g(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.h(uz3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(ne1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i2 & 147) == 146 && kk0Var.F()) {
            kk0Var.V();
        } else {
            dl0 dl0Var = uy3.a;
            yk0.CompositionLocalProvider(new s13[]{fq2.k(j, gn0.a), dl0Var.c(((uz3) kk0Var.l(dl0Var)).d(uz3Var))}, ne1Var, kk0Var, ((i2 >> 3) & 112) | 8);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new q13(j, uz3Var, ne1Var, i, 0));
        }
    }
}

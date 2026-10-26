package defpackage;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class hq3 {
    public static final dl0 a = new dl0(bb2.x);

    /* JADX INFO: renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m210x8dcae10(c cVar, rg3 rg3Var, long j, long j2, float f, float f2, iw iwVar, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            cVar = c.i;
        }
        if ((i2 & 2) != 0) {
            rg3Var = k43.a;
        }
        if ((i2 & 4) != 0) {
            j = ab2.a.getColorScheme(ck0Var, 6).p;
        }
        if ((i2 & 8) != 0) {
            j2 = af0.m2x310ea166(j, ck0Var, (i >> 6) & 14);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            iwVar = null;
        }
        kk0 kk0Var = (kk0) ck0Var;
        dl0 dl0Var = a;
        float f3 = f + ((rx0) kk0Var.l(dl0Var)).c;
        yk0.CompositionLocalProvider(new s13[]{fq2.k(j2, gn0.a), dl0Var.c(new rx0(f3))}, zg0.rememberComposableLambda(-70914509, true, new dq3(cVar, rg3Var, j, f3, iwVar, f2, ne1Var), kk0Var, 54), kk0Var, 56);
    }

    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m211x54dd086a(boolean z, je1 je1Var, c cVar, boolean z2, rg3 rg3Var, long j, long j2, float f, float f2, iw iwVar, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2, int i3) {
        c cVar2 = (i3 & 4) != 0 ? c.i : cVar;
        boolean z3 = (i3 & 8) != 0 ? true : z2;
        rg3 rg3Var2 = (i3 & 16) != 0 ? k43.a : rg3Var;
        long j3 = (i3 & 32) != 0 ? ab2.a.getColorScheme(ck0Var, 6).p : j;
        long jM2x310ea166 = (i3 & 64) != 0 ? af0.m2x310ea166(j3, ck0Var, (i >> 15) & 14) : j2;
        float f3 = (i3 & Uuid.SIZE_BITS) != 0 ? 0.0f : f;
        float f4 = (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 0.0f : f2;
        iw iwVar2 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : iwVar;
        gh2 gh2Var2 = (i3 & 1024) == 0 ? gh2Var : null;
        kk0 kk0Var = (kk0) ck0Var;
        dl0 dl0Var = a;
        float f5 = ((rx0) kk0Var.l(dl0Var)).c + f3;
        yk0.CompositionLocalProvider(new s13[]{fq2.k(jM2x310ea166, gn0.a), dl0Var.c(new rx0(f5))}, zg0.rememberComposableLambda(-1164547968, true, new fq3(cVar2, rg3Var2, j3, f5, iwVar2, z, gh2Var2, z3, je1Var, f4, ne1Var), kk0Var, 54), kk0Var, 56);
    }

    /* JADX INFO: renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m212x54dd086a(boolean z, le1 le1Var, c cVar, boolean z2, rg3 rg3Var, long j, long j2, float f, float f2, iw iwVar, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2, int i3) {
        c cVar2 = (i3 & 4) != 0 ? c.i : cVar;
        boolean z3 = (i3 & 8) != 0 ? true : z2;
        rg3 rg3Var2 = (i3 & 16) != 0 ? k43.a : rg3Var;
        long j3 = (i3 & 32) != 0 ? ab2.a.getColorScheme(ck0Var, 6).p : j;
        long jM2x310ea166 = (i3 & 64) != 0 ? af0.m2x310ea166(j3, ck0Var, (i >> 15) & 14) : j2;
        float f3 = (i3 & Uuid.SIZE_BITS) != 0 ? 0.0f : f;
        float f4 = (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? 0.0f : f2;
        iw iwVar2 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? null : iwVar;
        gh2 gh2Var2 = (i3 & 1024) == 0 ? gh2Var : null;
        kk0 kk0Var = (kk0) ck0Var;
        dl0 dl0Var = a;
        float f5 = ((rx0) kk0Var.l(dl0Var)).c + f3;
        yk0.CompositionLocalProvider(new s13[]{fq2.k(jM2x310ea166, gn0.a), dl0Var.c(new rx0(f5))}, zg0.rememberComposableLambda(712720927, true, new gq3(cVar2, rg3Var2, j3, f5, iwVar2, z, gh2Var2, z3, le1Var, f4, ne1Var), kk0Var, 54), kk0Var, 56);
    }

    /* JADX INFO: renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m213xde3417d4(je1 je1Var, c cVar, boolean z, rg3 rg3Var, long j, long j2, float f, float f2, iw iwVar, gh2 gh2Var, ne1 ne1Var, ck0 ck0Var, int i, int i2, int i3) {
        c cVar2 = (i3 & 2) != 0 ? c.i : cVar;
        boolean z2 = (i3 & 4) != 0 ? true : z;
        rg3 rg3Var2 = (i3 & 8) != 0 ? k43.a : rg3Var;
        long j3 = (i3 & 16) != 0 ? ab2.a.getColorScheme(ck0Var, 6).p : j;
        long jM2x310ea166 = (i3 & 32) != 0 ? af0.m2x310ea166(j3, ck0Var, (i >> 12) & 14) : j2;
        float f3 = (i3 & 64) != 0 ? 0.0f : f;
        float f4 = (i3 & Uuid.SIZE_BITS) != 0 ? 0.0f : f2;
        iw iwVar2 = (i3 & FontInfo.NUMBER_OF_CHAR_CODES) != 0 ? null : iwVar;
        gh2 gh2Var2 = (i3 & ConstantsKt.MINIMUM_BLOCK_SIZE) == 0 ? gh2Var : null;
        kk0 kk0Var = (kk0) ck0Var;
        dl0 dl0Var = a;
        float f5 = f3 + ((rx0) kk0Var.l(dl0Var)).c;
        yk0.CompositionLocalProvider(new s13[]{fq2.k(jM2x310ea166, gn0.a), dl0Var.c(new rx0(f5))}, zg0.rememberComposableLambda(1279702876, true, new eq3(cVar2, rg3Var2, j3, f5, iwVar2, gh2Var2, z2, je1Var, f4, ne1Var), kk0Var, 54), kk0Var, 56);
    }

    public static final c a(c cVar, rg3 rg3Var, long j, iw iwVar, float f) {
        rg3 rg3Var2;
        c cVarB;
        c borderModifierNodeElement;
        if (f > 0.0f) {
            rg3Var2 = rg3Var;
            cVarB = a.b(c.i, 0.0f, f, 0.0f, rg3Var2, false, 124895);
        } else {
            rg3Var2 = rg3Var;
            cVarB = c.i;
        }
        c cVarThen = cVar.then(cVarB);
        if (iwVar != null) {
            Modifier$Companion modifier$Companion = c.i;
            borderModifierNodeElement = new BorderModifierNodeElement(iwVar.a, iwVar.b, rg3Var2);
        } else {
            borderModifierNodeElement = c.i;
        }
        return xr0.N(androidx.compose.foundation.a.b(cVarThen.then(borderModifierNodeElement), j, rg3Var2), rg3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m214x10dc4ab7(long j, float f, ck0 ck0Var, int i) {
        return af0.m1x70d5e9c1(ab2.a.getColorScheme(ck0Var, 6), j, f, ck0Var, (i << 3) & 1008);
    }
}

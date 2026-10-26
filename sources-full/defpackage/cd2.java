package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.InspectionModeKt;
import kotlin.io.ConstantsKt;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class cd2 {
    /* JADX INFO: renamed from: DropdownMenuContent-Qj0Zi0g, reason: not valid java name */
    public static final void m165x82b162b9(c cVar, ni2 ni2Var, mi2 mi2Var, rb3 rb3Var, rg3 rg3Var, long j, float f, float f2, iw iwVar, oe1 oe1Var, ck0 ck0Var, int i) {
        int i2;
        rg3 rg3Var2;
        Object sc2Var;
        int i3;
        kk0 kk0Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.c0(-151448888);
        if ((i & 6) == 0) {
            i2 = (kk0Var2.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? kk0Var2.h(ni2Var) : kk0Var2.j(ni2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var2.h(mi2Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var2.h(rb3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            rg3Var2 = rg3Var;
            i2 |= kk0Var2.h(rg3Var2) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        } else {
            rg3Var2 = rg3Var;
        }
        if ((196608 & i) == 0) {
            i2 |= kk0Var2.g(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= kk0Var2.e(f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= kk0Var2.e(f2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= kk0Var2.h(iwVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= kk0Var2.j(oe1Var) ? 536870912 : 268435456;
        }
        if ((i2 & 306783379) == 306783378 && kk0Var2.F()) {
            kk0Var2.V();
            kk0Var = kk0Var2;
        } else {
            o54 o54VarUpdateTransition = b64.updateTransition(ni2Var, "DropDownMenu", (ck0) kk0Var2, ((i2 >> 3) & 14) | 48, 0);
            x64 x64Var = mb4.a;
            Object objB = o54VarUpdateTransition.b();
            ft2 ft2Var = o54VarUpdateTransition.d;
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            kk0Var2.a0(2139028452);
            float f3 = zBooleanValue ? 1.0f : 0.8f;
            kk0Var2.r(false);
            Float fValueOf = Float.valueOf(f3);
            boolean zBooleanValue2 = ((Boolean) ft2Var.getValue()).booleanValue();
            kk0Var2.a0(2139028452);
            float f4 = zBooleanValue2 ? 1.0f : 0.8f;
            kk0Var2.r(false);
            gn3 gn3VarCreateTransitionAnimation = b64.createTransitionAnimation(o54VarUpdateTransition, fValueOf, Float.valueOf(f4), (o71) wc2.c.invoke((Object) o54VarUpdateTransition.e(), (Object) kk0Var2, (Object) 0), x64Var, "FloatAnimation", kk0Var2, 0);
            boolean zBooleanValue3 = ((Boolean) o54VarUpdateTransition.b()).booleanValue();
            kk0Var2.a0(-249413128);
            float f5 = zBooleanValue3 ? 1.0f : 0.0f;
            kk0Var2.r(false);
            Float fValueOf2 = Float.valueOf(f5);
            boolean zBooleanValue4 = ((Boolean) ft2Var.getValue()).booleanValue();
            kk0Var2.a0(-249413128);
            float f6 = zBooleanValue4 ? 1.0f : 0.0f;
            kk0Var2.r(false);
            gn3 gn3VarCreateTransitionAnimation2 = b64.createTransitionAnimation(o54VarUpdateTransition, fValueOf2, Float.valueOf(f6), (o71) vc2.c.invoke((Object) o54VarUpdateTransition.e(), (Object) kk0Var2, (Object) 0), x64Var, "FloatAnimation", kk0Var2, 0);
            boolean zBooleanValue5 = ((Boolean) kk0Var2.l(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            Modifier$Companion modifier$Companion = c.i;
            boolean zI = ((i2 & 112) == 32 || ((i2 & 64) != 0 && kk0Var2.j(ni2Var))) | kk0Var2.i(zBooleanValue5) | kk0Var2.h(gn3VarCreateTransitionAnimation) | kk0Var2.h(gn3VarCreateTransitionAnimation2) | ((i2 & 896) == 256);
            Object objP = kk0Var2.P();
            if (zI || objP == Composer$Companion.getEmpty()) {
                i3 = i2;
                sc2Var = new sc2(zBooleanValue5, ni2Var, mi2Var, gn3VarCreateTransitionAnimation, gn3VarCreateTransitionAnimation2);
                kk0Var2.l0(sc2Var);
            } else {
                sc2Var = objP;
                i3 = i2;
            }
            int i4 = i3 >> 9;
            int i5 = i3 >> 6;
            hq3.m210x8dcae10(a.a(modifier$Companion, (le1) sc2Var), rg3Var2, j, 0L, f, f2, iwVar, zg0.rememberComposableLambda(1573559053, true, new tc2(cVar, rb3Var, oe1Var), kk0Var2, 54), kk0Var2, (i4 & 896) | (i4 & 112) | 12582912 | (57344 & i5) | (458752 & i5) | (i5 & 3670016), 8);
            kk0Var = kk0Var2;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uc2(cVar, ni2Var, mi2Var, rb3Var, rg3Var, j, f, f2, iwVar, oe1Var, i));
        }
    }

    public static final void DropdownMenuItemContent(ne1 ne1Var, je1 je1Var, c cVar, ne1 ne1Var2, ne1 ne1Var3, boolean z, kc2 kc2Var, hs2 hs2Var, gh2 gh2Var, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1564716777);
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(ne1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.h(cVar) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if ((i & 3072) == 0) {
            i2 |= kk0Var.j(ne1Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= kk0Var.j(ne1Var3) ? 16384 : ConstantsKt.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= kk0Var.i(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= kk0Var.h(kc2Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= kk0Var.h(hs2Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= kk0Var.h(gh2Var) ? 67108864 : 33554432;
        }
        if ((i2 & 38347923) == 38347922 && kk0Var.F()) {
            kk0Var.V();
        } else {
            c cVarJ = androidx.compose.foundation.layout.a.j(d.l(androidx.compose.foundation.a.d(cVar, gh2Var, g73.m194xaeb141ad(true, 0.0f, 0L, kk0Var, 6, 6), z, null, je1Var, 24).then(d.a), 112.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 280.0f, Float.NaN), hs2Var);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarJ);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (kk0Var.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor);
            } else {
                kk0Var.o0();
            }
            pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            uy3.ProvideTextStyle(ab2.a.getTypography(kk0Var, 6).m, zg0.rememberComposableLambda(1065051884, true, new ad2(ne1Var2, kc2Var, z, ne1Var3, ne1Var), kk0Var, 54), kk0Var, 48);
            kk0Var.r(true);
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new bd2(ne1Var, je1Var, cVar, ne1Var2, ne1Var3, z, kc2Var, hs2Var, gh2Var, i));
        }
    }
}

package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void PreviewHeader(String str, je1 je1Var, je1 je1Var2, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(666841463);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(je1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= kk0Var.j(je1Var2) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i2 & 1, (i2 & 147) != 146)) {
            hq3.m210x8dcae10(null, null, ab2.a.getColorScheme(kk0Var, 0).n, 0L, 0.0f, 0.0f, null, zg0.rememberComposableLambda(1679324860, true, new oj1(je1Var, je1Var2, str), kk0Var, 54), kk0Var, 12582912, 123);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new j10(str, je1Var, je1Var2, i, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 PreviewHeader$lambda$2(je1 je1Var, je1 je1Var2, String str, ck0 ck0Var, int i) {
        String str2;
        kk0 kk0Var = (kk0) ck0Var;
        boolean zS = kk0Var.S(i & 1, (i & 3) != 2);
        xk xkVar = kk0Var.a;
        if (zS) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarN = a.n(d.a, 16.0f, 6.0f, 4.0f, 6.0f);
            vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), kk0Var, 48);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarN);
            androidx.compose.ui.node.a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            if (xkVar == null) {
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
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var, 0);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN2 = kk0Var.n();
            c cVarD2 = b.d(kk0Var, layoutWeightElement);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(constructor2);
            } else {
                kk0Var.o0();
            }
            pe peVarH2 = fq2.h(kk0Var, vb2VarColumnMeasurePolicy, kk0Var, su2VarN2);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            if (str == null) {
                kk0Var.a0(1543641308);
                String strStringResource = ko3.stringResource(R.string.preview_title, kk0Var, 0);
                kk0Var.r(false);
                str2 = strStringResource;
            } else {
                kk0Var.a0(1543641029);
                kk0Var.r(false);
                str2 = str;
            }
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(str2, (c) null, 0L, 0L, (gc1) null, ic1.m, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 2, false, 1, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).i, (ck0) kk0Var, 196608, 3120, 55262);
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.preview_note, kk0Var, 0), (c) null, gb2.d(4292911360L), 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).o, (ck0) kk0Var, 384, 0, 65530);
            kk0Var.r(true);
            rl1.IconButton(je1Var, null, false, null, null, qi0.a, kk0Var, 196608, 30);
            rl1.IconButton(je1Var2, null, false, null, null, qi0.b, kk0Var, 196608, 30);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    public static void a(je1 je1Var, je1 je1Var2, String str, ck0 ck0Var, int i) {
        PreviewHeader(str, je1Var, je1Var2, ck0Var, sf3.V(i | 1));
    }
}

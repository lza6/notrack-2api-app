package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class si0 {
    public static final yg0 a = new yg0(-410164966, new ri0(0), false);
    public static final yg0 b = new yg0(-108309374, new ri0(1), false);
    public static final yg0 c = new yg0(-1633929011, new ri0(2), false);
    public static final yg0 d = new yg0(1076015132, new ji0(24), false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 lambda_1076015132$lambda$4(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            Modifier$Companion modifier$Companion = c.i;
            c cVarB = a.b(xr0.N(d.j(modifier$Companion, 40.0f), z73.a), re0.b(0.12f, gx.getBrandGreen(kk0Var, 0)), k43.a);
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVarB);
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
            pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            ul1.m1829xf2a7a69(s22.a.getImage(kk0Var, 6), (String) null, d.j(modifier$Companion, 20.0f), gx.getBrandGreen(kk0Var, 0), kk0Var, 432, 0);
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 lambda__108309374$lambda$1(g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            String strStringResource = ko3.stringResource(R.string.gate_or_plus, kk0Var, 0);
            ab2 ab2Var = ab2.a;
            uy3.m1842xe1e389ce(strStringResource, (c) null, ab2Var.getColorScheme(kk0Var, 0).s, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, ab2Var.getTypography(kk0Var, 0).n, (ck0) kk0Var, 0, 0, 65530);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 lambda__1633929011$lambda$2(g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.voice_gate_close, kk0Var, 0), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 lambda__410164966$lambda$0(g83 g83Var, ck0 ck0Var, int i) {
        g83Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 17) != 16)) {
            uy3.m1842xe1e389ce(ko3.stringResource(R.string.voice_gate_cta, kk0Var, 0), (c) null, 0L, 0L, (gc1) null, (ic1) null, (lb1) null, 0L, (tt3) null, (jt3) null, 0L, 0, false, 0, 0, (le1) null, (uz3) null, (ck0) kk0Var, 0, 0, 131070);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }
}

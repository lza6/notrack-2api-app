package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class fp3 {
    public static final sb3 a = new sb3(3);

    public static final void SubcomposeLayout(c cVar, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        c cVar2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if (kk0Var.S(i3 & 1, (i3 & 19) != 18)) {
            c cVar3 = i4 != 0 ? c.i : cVar;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = new ip3(bg1.w);
                kk0Var.l0(objP);
            }
            SubcomposeLayout((ip3) objP, cVar3, ne1Var, kk0Var, (i3 << 3) & 1008, 0);
            cVar2 = cVar3;
        } else {
            kk0Var.V();
            cVar2 = cVar;
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new va(cVar2, ne1Var, i, i2, 3));
        }
    }

    public static final void SubcomposeLayout(ip3 ip3Var, c cVar, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-511989831);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.j(ip3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.h(cVar) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.j(ne1Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                cVar = c.i;
            }
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            qk0 qk0VarRememberCompositionContext = rj0.rememberCompositionContext(kk0Var, 0);
            c cVarD = b.d(kk0Var, cVar);
            su2 su2VarN = kk0Var.n();
            d4 d4Var = d4.J;
            if (kk0Var.a == null) {
                rj0.a();
                throw null;
            }
            kk0Var.e0();
            if (kk0Var.O) {
                kk0Var.m(d4Var);
            } else {
                kk0Var.o0();
            }
            xp1.E(kk0Var, ip3Var, ip3Var.c);
            xp1.E(kk0Var, qk0VarRememberCompositionContext, ip3Var.d);
            xp1.E(kk0Var, ne1Var, ip3Var.e);
            a.j.getClass();
            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            kk0Var.r(true);
            if (kk0Var.F()) {
                kk0Var.a0(-26267397);
                kk0Var.r(false);
            } else {
                kk0Var.a0(-26326018);
                boolean zJ = kk0Var.j(ip3Var);
                Object objP = kk0Var.P();
                if (zJ || objP == Composer$Companion.getEmpty()) {
                    objP = new i43(10, ip3Var);
                    kk0Var.l0(objP);
                }
                r11.SideEffect((je1) objP, kk0Var, 0);
                kk0Var.r(false);
            }
        } else {
            kk0Var.V();
        }
        c cVar2 = cVar;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(i, i2, 7, ne1Var, ip3Var, cVar2));
        }
    }
}

package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class rh3 {
    public static final void SimpleLayout(c cVar, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-2105228848);
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
            if (i4 != 0) {
                cVar = c.i;
            }
            ua uaVar = ua.i;
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            su2 su2VarN = kk0Var.n();
            c cVarD = b.d(kk0Var, cVar);
            a.j.getClass();
            d4 constructor = ComposeUiNode$Companion.getConstructor();
            int i5 = (((((i3 << 3) & 112) | (((i3 >> 3) & 14) | 384)) << 6) & 896) | 6;
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
            xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
            pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            fq2.w((i5 >> 6) & 14, ne1Var, kk0Var, true);
        } else {
            kk0Var.V();
        }
        c cVar2 = cVar;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new va(cVar2, ne1Var, i, i2, 2));
        }
    }
}

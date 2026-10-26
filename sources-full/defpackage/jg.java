package defpackage;

import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class jg {
    public static final ps2 a;

    static {
        z21 z21Var = z21.c;
        a = new ps2(z21Var, z21Var);
    }

    public static final void InlineChildren(hg hgVar, List<gg> list, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1794596951);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(hgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= kk0Var.j(list) ? 32 : 16;
        }
        int i3 = 0;
        if (kk0Var.S(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            int i4 = 0;
            while (i4 < size) {
                gg ggVar = list.get(i4);
                oe1 oe1Var = (oe1) ggVar.a;
                int i5 = ggVar.b;
                int i6 = ggVar.c;
                ua uaVar = ua.d;
                Modifier$Companion modifier$Companion = c.i;
                int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, i3);
                su2 su2VarN = kk0Var.n();
                c cVarD = b.d(kk0Var, modifier$Companion);
                a.j.getClass();
                d4 constructor = ComposeUiNode$Companion.getConstructor();
                int i7 = i3;
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
                oe1Var.invoke(hgVar.subSequence(i5, i6).d, kk0Var, Integer.valueOf(i7));
                kk0Var.r(true);
                i4++;
                i3 = i7;
            }
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new wc(i, 1, hgVar, list));
        }
    }
}

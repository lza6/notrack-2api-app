package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import java.util.List;
import kotlin.uuid.Uuid;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class ix1 {
    public static final void Layout(c cVar, vb2 vb2Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            cVar = c.i;
        }
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        c cVarD = b.d(ck0Var, cVar);
        su2 su2VarN = ((kk0) ck0Var).n();
        a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        kk0 kk0Var = (kk0) ck0Var;
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
        xp1.E(ck0Var, vb2Var, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(ck0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
        }
        kk0Var.r(true);
    }

    public static final void Layout(List<? extends ne1> list, c cVar, lg2 lg2Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            cVar = c.i;
        }
        yg0 yg0VarA = a(list);
        boolean z = (((i & 896) ^ 384) > 256 && ((kk0) ck0Var).h(lg2Var)) || (i & 384) == 256;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = new mg2(lg2Var);
            kk0Var.l0(objP);
        }
        vb2 vb2Var = (vb2) objP;
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
        su2 su2VarN = kk0Var.n();
        c cVarD = b.d(kk0Var, cVar);
        a.j.getClass();
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
        pe peVarH = fq2.h(kk0Var, vb2Var, kk0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        yg0VarA.invoke(kk0Var, 0);
        kk0Var.r(true);
    }

    public static final void Layout(ne1 ne1Var, c cVar, vb2 vb2Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            cVar = c.i;
        }
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVar);
        a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        int i3 = ((i << 6) & 896) | 6;
        kk0 kk0Var = (kk0) ck0Var;
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
        pe peVarG = fq2.g(ck0Var, vb2Var, ck0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        ne1Var.invoke(ck0Var, Integer.valueOf((i3 >> 6) & 14));
        kk0Var.r(true);
    }

    @cv0
    public static final void MultiMeasureLayout(c cVar, ne1 ne1Var, vb2 vb2Var, ck0 ck0Var, int i, int i2) {
        int i3;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(1949933075);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = 16;
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= kk0Var.h(vb2Var) ? FontInfo.NUMBER_OF_CHAR_CODES : Uuid.SIZE_BITS;
        }
        if (kk0Var.S(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                cVar = c.i;
            }
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            c cVarD = b.d(kk0Var, cVar);
            su2 su2VarN = kk0Var.n();
            d4 d4Var = d4.J;
            int i7 = ((i3 << 3) & 896) | 6;
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
            a.j.getClass();
            xp1.E(kk0Var, vb2Var, ComposeUiNode$Companion.getSetMeasurePolicy());
            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
            if (kk0Var.O) {
                kk0Var.c(w84.a, new gb4(i5, i6));
            }
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            fq2.w((i7 >> 6) & 14, ne1Var, kk0Var, true);
        } else {
            kk0Var.V();
        }
        c cVar2 = cVar;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new ra(cVar2, ne1Var, vb2Var, i, i2));
        }
    }

    public static final yg0 a(List list) {
        return new yg0(-1953651383, new hx1(list), true);
    }
}

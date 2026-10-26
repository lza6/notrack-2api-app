package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class vw {
    public static final fi2 a = b(true);
    public static final fi2 b = b(false);
    public static final yw c = new yw(Alignment$Companion.getTopStart(), false);
    public static final ua d = ua.e;

    public static final void Box(c cVar, a8 a8Var, boolean z, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            cVar = c.i;
        }
        if ((i2 & 2) != 0) {
            a8Var = Alignment$Companion.getTopStart();
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        vb2 vb2VarC = c(a8Var, z);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVar);
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
        pe peVarG = fq2.g(ck0Var, vb2VarC, ck0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        oe1Var.invoke(androidx.compose.foundation.layout.b.a, ck0Var, Integer.valueOf(((i >> 6) & 112) | 6));
        kk0Var.r(true);
    }

    public static final void Box(c cVar, ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-211209833);
        if ((i & 6) == 0) {
            i2 = (kk0Var.h(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
            c cVarD = b.d(kk0Var, cVar);
            su2 su2VarN = kk0Var.n();
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
            xp1.E(kk0Var, d, ComposeUiNode$Companion.getSetMeasurePolicy());
            xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
            xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
            pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
            if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
                fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
            }
            kk0Var.r(true);
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uw(i, i3, cVar));
        }
    }

    public static final void a(mv2 mv2Var, nv2 nv2Var, qb2 qb2Var, dx1 dx1Var, int i, int i2, a8 a8Var) {
        yt ytVar;
        Object objI = qb2Var.i();
        tw twVar = objI instanceof tw ? (tw) objI : null;
        mv2.e(mv2Var, nv2Var, ((twVar == null || (ytVar = twVar.c) == null) ? a8Var : ytVar).a((((long) nv2Var.c) << 32) | (((long) nv2Var.d) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), dx1Var));
    }

    public static final fi2 b(boolean z) {
        fi2 fi2Var = new fi2(9);
        fi2Var.l(Alignment$Companion.getTopStart(), new yw(Alignment$Companion.getTopStart(), z));
        fi2Var.l(Alignment$Companion.getTopCenter(), new yw(Alignment$Companion.getTopCenter(), z));
        fi2Var.l(Alignment$Companion.getTopEnd(), new yw(Alignment$Companion.getTopEnd(), z));
        fi2Var.l(Alignment$Companion.getCenterStart(), new yw(Alignment$Companion.getCenterStart(), z));
        fi2Var.l(Alignment$Companion.getCenter(), new yw(Alignment$Companion.getCenter(), z));
        fi2Var.l(Alignment$Companion.getCenterEnd(), new yw(Alignment$Companion.getCenterEnd(), z));
        fi2Var.l(Alignment$Companion.getBottomStart(), new yw(Alignment$Companion.getBottomStart(), z));
        fi2Var.l(Alignment$Companion.getBottomCenter(), new yw(Alignment$Companion.getBottomCenter(), z));
        fi2Var.l(Alignment$Companion.getBottomEnd(), new yw(Alignment$Companion.getBottomEnd(), z));
        return fi2Var;
    }

    public static final vb2 c(a8 a8Var, boolean z) {
        vb2 vb2Var = (vb2) (z ? a : b).g(a8Var);
        return vb2Var == null ? new yw(a8Var, z) : vb2Var;
    }

    public static final vb2 rememberBoxMeasurePolicy(a8 a8Var, boolean z, ck0 ck0Var, int i) {
        if (kr1.n(a8Var, Alignment$Companion.getTopStart()) && !z) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(-1709785313);
            kk0Var.r(false);
            return c;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(-1709737635);
        boolean z2 = true;
        boolean z3 = (((i & 14) ^ 6) > 4 && kk0Var2.h(a8Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !kk0Var2.i(z)) && (i & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objP = kk0Var2.P();
        if (z4 || objP == Composer$Companion.getEmpty()) {
            objP = new yw(a8Var, z);
            kk0Var2.l0(objP);
        }
        yw ywVar = (yw) objP;
        kk0Var2.r(false);
        return ywVar;
    }
}

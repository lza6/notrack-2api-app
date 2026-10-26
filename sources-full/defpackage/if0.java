package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class if0 {
    public static final kf0 a = new kf0(hl.c, Alignment$Companion.getStart());

    public static final void Column(c cVar, gl glVar, y7 y7Var, oe1 oe1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            cVar = c.i;
        }
        if ((i2 & 2) != 0) {
            glVar = hl.c;
        }
        if ((i2 & 4) != 0) {
            y7Var = Alignment$Companion.getStart();
        }
        vb2 vb2VarColumnMeasurePolicy = columnMeasurePolicy(glVar, y7Var, ck0Var, (i >> 3) & 126);
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
        pe peVarG = fq2.g(ck0Var, vb2VarColumnMeasurePolicy, ck0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        oe1Var.invoke(mf0.a, ck0Var, Integer.valueOf(((i >> 6) & 112) | 6));
        kk0Var.r(true);
    }

    public static final vb2 columnMeasurePolicy(gl glVar, y7 y7Var, ck0 ck0Var, int i) {
        if (kr1.n(glVar, hl.c) && kr1.n(y7Var, Alignment$Companion.getStart())) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(346089448);
            kk0Var.r(false);
            return a;
        }
        kk0 kk0Var2 = (kk0) ck0Var;
        kk0Var2.a0(346143295);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && kk0Var2.h(glVar)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !kk0Var2.h(y7Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objP = kk0Var2.P();
        if (z3 || objP == Composer$Companion.getEmpty()) {
            objP = new kf0(glVar, y7Var);
            kk0Var2.l0(objP);
        }
        kf0 kf0Var = (kf0) objP;
        kk0Var2.r(false);
        return kf0Var;
    }
}

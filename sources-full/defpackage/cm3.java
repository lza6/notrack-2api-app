package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class cm3 {
    public static final void Spacer(c cVar, ck0 ck0Var, int i) {
        ua uaVar = ua.j;
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
        xp1.E(ck0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(ck0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
        }
        kk0Var.r(true);
    }
}

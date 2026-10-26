package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class xg extends ww1 implements oe1 {
    public final /* synthetic */ oe1 c;
    public final /* synthetic */ ne1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(oe1 oe1Var, ne1 ne1Var) {
        super(3);
        this.c = oe1Var;
        this.d = ne1Var;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        invoke((g83) obj, (ck0) obj2, ((Number) obj3).intValue());
        return w84.a;
    }

    public final void invoke(g83 g83Var, ck0 ck0Var, int i) {
        if ((i & 6) == 0) {
            i |= ((kk0) ck0Var).h(g83Var) ? 4 : 2;
        }
        if ((i & 19) == 18) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        c cVarA = g83Var.a(c.i, true);
        vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), ck0Var, 54);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVarA);
        a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        kk0 kk0Var2 = (kk0) ck0Var;
        if (kk0Var2.a == null) {
            rj0.a();
            throw null;
        }
        kk0Var2.e0();
        if (kk0Var2.O) {
            kk0Var2.m(constructor);
        } else {
            kk0Var2.o0();
        }
        pe peVarG = fq2.g(ck0Var, vb2VarRowMeasurePolicy, ck0Var, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        this.c.invoke(h83.a, ck0Var, 6);
        kk0Var2.r(true);
        ne1 ne1Var = this.d;
        if (ne1Var != null) {
            c cVarO = androidx.compose.foundation.layout.a.o(d.b, 0.0f, wh.b, wh.a, 0.0f, 9);
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
            su2 su2VarN2 = kk0Var2.n();
            c cVarD2 = b.d(ck0Var, cVarO);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor2);
            } else {
                kk0Var2.o0();
            }
            pe peVarG2 = fq2.g(ck0Var, vb2VarC, ck0Var, su2VarN2);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarG2);
            }
            xp1.E(ck0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            ne1Var.invoke(ck0Var, 0);
            kk0Var2.r(true);
        }
    }
}

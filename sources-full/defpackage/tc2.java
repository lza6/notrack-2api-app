package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class tc2 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ rb3 d;
    public final /* synthetic */ oe1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc2(c cVar, rb3 rb3Var, oe1 oe1Var) {
        super(2);
        this.c = cVar;
        this.d = rb3Var;
        this.h = oe1Var;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        if ((i & 3) == 2) {
            kk0 kk0Var = (kk0) ck0Var;
            if (kk0Var.F()) {
                kk0Var.V();
                return;
            }
        }
        c cVarA = mb3.a(a.p(a.m(this.c, 0.0f, 8.0f, 1)), this.d, true);
        vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), ck0Var, 0);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVarA);
        androidx.compose.ui.node.a.j.getClass();
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
        pe peVarG = fq2.g(ck0Var, vb2VarColumnMeasurePolicy, ck0Var, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        this.h.invoke(mf0.a, ck0Var, 6);
        kk0Var2.r(true);
    }
}

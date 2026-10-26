package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.e;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class mj2 extends ww1 implements ne1 {
    public final /* synthetic */ e01 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ e h;
    public final /* synthetic */ oe1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj2(e01 e01Var, boolean z, e eVar, oe1 oe1Var) {
        super(2);
        this.c = e01Var;
        this.d = z;
        this.h = eVar;
        this.l = oe1Var;
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
        e01 e01Var = this.c;
        c cVarA = e01Var != null ? a.a(c.i, new tj2(e01Var, this.d, 0)) : c.i;
        Modifier$Companion modifier$Companion = c.i;
        t64 t64Var = uj2.a;
        c cVarA2 = fh4.a(d.l(modifier$Companion, 240.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 360.0f, Float.NaN).then(cVarA), this.h);
        vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), ck0Var, 0);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVarA2);
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
        this.l.invoke(mf0.a, ck0Var, 6);
        kk0Var2.r(true);
    }
}

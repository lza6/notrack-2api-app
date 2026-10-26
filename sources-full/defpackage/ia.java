package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class ia extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(long j, c cVar) {
        super(2);
        this.c = j;
        this.d = cVar;
    }

    @Override // defpackage.ne1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((ck0) obj, ((Number) obj2).intValue());
        return w84.a;
    }

    public final void invoke(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!kk0Var.S(i & 1, (i & 3) != 2)) {
            kk0Var.V();
            return;
        }
        long j = this.c;
        if (j == 9205357640488583168L) {
            kk0Var.a0(1829298756);
            oa.DefaultCursorHandle(this.d, kk0Var, 0, 0);
            kk0Var.r(false);
            return;
        }
        kk0Var.a0(1828931592);
        c cVarI = d.i(this.d, ux0.b(j), ux0.a(j), 0.0f, 0.0f, 12);
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopCenter(), false);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
        su2 su2VarN = kk0Var.n();
        c cVarD = b.d(kk0Var, cVarI);
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
        pe peVarH = fq2.h(kk0Var, vb2VarC, kk0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        oa.DefaultCursorHandle(null, kk0Var, 0, 1);
        kk0Var.r(true);
        kk0Var.r(false);
    }
}

package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class w7 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ ne1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(c cVar, ne1 ne1Var) {
        super(2);
        this.c = cVar;
        this.d = ne1Var;
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
        String strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_dialog, ck0Var, 0);
        is2 is2Var = x7.a;
        c cVarL = d.l(this.c, 280.0f, (10 & 2) != 0 ? Float.NaN : 48.0f, 560.0f, Float.NaN);
        Modifier$Companion modifier$Companion = c.i;
        kk0 kk0Var2 = (kk0) ck0Var;
        boolean zH = kk0Var2.h(strM1830xa862b2cd);
        Object objP = kk0Var2.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new v7(strM1830xa862b2cd, 0);
            kk0Var2.l0(objP);
        }
        c cVarThen = cVarL.then(we3.b(modifier$Companion, false, (le1) objP));
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
        su2 su2VarN = kk0Var2.n();
        c cVarD = b.d(kk0Var2, cVarThen);
        a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
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
        pe peVarH = fq2.h(kk0Var2, vb2VarC, kk0Var2, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
        this.d.invoke(kk0Var2, 0);
        kk0Var2.r(true);
    }
}

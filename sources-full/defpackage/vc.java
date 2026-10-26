package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class vc extends ww1 implements ne1 {
    public final /* synthetic */ rx2 c;
    public final /* synthetic */ gn3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(rx2 rx2Var, gn3 gn3Var) {
        super(2);
        this.c = rx2Var;
        this.d = gn3Var;
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
        c cVarB = we3.b(c.i, false, v1.o);
        rx2 rx2Var = this.c;
        boolean zJ = kk0Var.j(rx2Var);
        Object objP = kk0Var.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new sc(rx2Var, 1);
            kk0Var.l0(objP);
        }
        c cVarL = g13.l(a.e(cVarB, (le1) objP), rx2Var.getCanCalculatePosition() ? 1.0f : 0.0f);
        ne1 ne1Var = (ne1) this.d.getValue();
        ua uaVar = ua.c;
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var, 0);
        su2 su2VarN = kk0Var.n();
        c cVarD = b.d(kk0Var, cVarL);
        androidx.compose.ui.node.a.j.getClass();
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
        xp1.E(kk0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(kk0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, setCompositeKeyHash);
        }
        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        ne1Var.invoke(kk0Var, 0);
        kk0Var.r(true);
    }
}

package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class gd extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ c h;
    public final /* synthetic */ pn2 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(long j, boolean z, c cVar, pn2 pn2Var) {
        super(2);
        this.c = j;
        this.d = z;
        this.h = cVar;
        this.l = pn2Var;
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
        pn2 pn2Var = this.l;
        boolean z = this.d;
        if (j == 9205357640488583168L) {
            kk0Var.a0(-836697680);
            boolean zJ = kk0Var.j(pn2Var);
            Object objP = kk0Var.P();
            if (zJ || objP == Composer$Companion.getEmpty()) {
                objP = new fd(pn2Var, 1);
                kk0Var.l0(objP);
            }
            od.SelectionHandleIcon(this.h, (je1) objP, z, kk0Var, 0);
            kk0Var.r(false);
            return;
        }
        kk0Var.a0(-837626688);
        cl clVar = z ? g13.b : g13.a;
        c cVarI = d.i(this.h, ux0.b(j), ux0.a(j), 0.0f, 0.0f, 12);
        vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(clVar, Alignment$Companion.getTop(), kk0Var, 0);
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
        pe peVarH = fq2.h(kk0Var, vb2VarRowMeasurePolicy, kk0Var, su2VarN);
        if (kk0Var.O || !kr1.n(kk0Var.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        Modifier$Companion modifier$Companion = c.i;
        boolean zJ2 = kk0Var.j(pn2Var);
        Object objP2 = kk0Var.P();
        if (zJ2 || objP2 == Composer$Companion.getEmpty()) {
            objP2 = new fd(pn2Var, 0);
            kk0Var.l0(objP2);
        }
        od.SelectionHandleIcon(modifier$Companion, (je1) objP2, z, kk0Var, 6);
        kk0Var.r(true);
        kk0Var.r(false);
    }
}

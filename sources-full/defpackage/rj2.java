package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class rj2 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ qs0 d;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj2(ne1 ne1Var, qs0 qs0Var, boolean z, ne1 ne1Var2, ne1 ne1Var3) {
        super(2);
        this.c = ne1Var;
        this.d = qs0Var;
        this.h = z;
        this.l = ne1Var2;
        this.m = ne1Var3;
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
        Modifier$Companion modifier$Companion = c.i;
        c cVarO = a.o(modifier$Companion, 16.0f, 0.0f, 24.0f, 0.0f, 10);
        vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), ck0Var, 48);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVarO);
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
        pe peVarG = fq2.g(ck0Var, vb2VarRowMeasurePolicy, ck0Var, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        kk0Var2.a0(-449396056);
        ne1 ne1Var = this.c;
        qs0 qs0Var = this.d;
        boolean z = this.h;
        if (ne1Var != null) {
            yk0.CompositionLocalProvider(fq2.k(((re0) qs0Var.iconColor(z, ck0Var, 0).getValue()).a, gn0.a), ne1Var, ck0Var, 8);
            cm3.Spacer(d.n(modifier$Companion, 12.0f), ck0Var, 6);
        }
        kk0Var2.r(false);
        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
        int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN2 = kk0Var2.n();
        c cVarD2 = b.d(ck0Var, layoutWeightElement);
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
        long j = ((re0) qs0Var.textColor(z, ck0Var, 0).getValue()).a;
        dl0 dl0Var = gn0.a;
        yk0.CompositionLocalProvider(fq2.k(j, dl0Var), this.m, ck0Var, 8);
        kk0Var2.r(true);
        kk0Var2.a0(-449381075);
        ne1 ne1Var2 = this.l;
        if (ne1Var2 != null) {
            cm3.Spacer(d.n(modifier$Companion, 12.0f), ck0Var, 6);
            yk0.CompositionLocalProvider(fq2.k(((re0) qs0Var.badgeColor(z, ck0Var, 0).getValue()).a, dl0Var), ne1Var2, ck0Var, 8);
        }
        kk0Var2.r(false);
        kk0Var2.r(true);
    }
}

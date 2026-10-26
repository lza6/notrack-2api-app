package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class fc0 extends ww1 implements ne1 {
    public final /* synthetic */ float c;
    public final /* synthetic */ hs2 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ ne1 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ ne1 o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(float f, hs2 hs2Var, ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, long j, ne1 ne1Var4, long j2) {
        super(2);
        this.c = f;
        this.d = hs2Var;
        this.h = ne1Var;
        this.l = ne1Var2;
        this.m = ne1Var3;
        this.n = j;
        this.o = ne1Var4;
        this.p = j2;
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
        c cVarJ = a.j(d.b(modifier$Companion, this.c, 1), this.d);
        ua uaVar = ua.f;
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVarJ);
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
        xp1.E(ck0Var, uaVar, ComposeUiNode$Companion.getSetMeasurePolicy());
        xp1.E(ck0Var, su2VarN, ComposeUiNode$Companion.getSetResolvedCompositionLocals());
        pe setCompositeKeyHash = ComposeUiNode$Companion.getSetCompositeKeyHash();
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, setCompositeKeyHash);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        kk0Var2.a0(-1293169671);
        ne1 ne1Var = this.h;
        ne1 ne1Var2 = this.l;
        if (ne1Var != null || ne1Var2 != null) {
            c cVarC = androidx.compose.ui.layout.a.c(modifier$Companion, "leadingIcon");
            vb2 vb2VarC = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
            su2 su2VarN2 = kk0Var2.n();
            c cVarD2 = b.d(ck0Var, cVarC);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor2);
            } else {
                kk0Var2.o0();
            }
            pe peVarG = fq2.g(ck0Var, vb2VarC, ck0Var, su2VarN2);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarG);
            }
            xp1.E(ck0Var, cVarD2, ComposeUiNode$Companion.getSetModifier());
            if (ne1Var != null) {
                kk0Var2.a0(832680499);
                ne1Var.invoke(ck0Var, 0);
                kk0Var2.r(false);
            } else if (ne1Var2 != null) {
                kk0Var2.a0(832788565);
                yk0.CompositionLocalProvider(fq2.k(this.n, gn0.a), ne1Var2, ck0Var, 8);
                kk0Var2.r(false);
            } else {
                kk0Var2.a0(833040347);
                kk0Var2.r(false);
            }
            kk0Var2.r(true);
        }
        kk0Var2.r(false);
        c cVarC2 = androidx.compose.ui.layout.a.c(modifier$Companion, "label");
        is2 is2Var = pc0.a;
        c cVarL = a.l(cVarC2, 8.0f, 0.0f);
        vb2 vb2VarRowMeasurePolicy = e83.rowMeasurePolicy(hl.a, Alignment$Companion.getCenterVertically(), ck0Var, 54);
        int currentCompositeKeyHash3 = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN3 = kk0Var2.n();
        c cVarD3 = b.d(ck0Var, cVarL);
        d4 constructor3 = ComposeUiNode$Companion.getConstructor();
        kk0Var2.e0();
        if (kk0Var2.O) {
            kk0Var2.m(constructor3);
        } else {
            kk0Var2.o0();
        }
        pe peVarG2 = fq2.g(ck0Var, vb2VarRowMeasurePolicy, ck0Var, su2VarN3);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash3))) {
            fq2.v(currentCompositeKeyHash3, kk0Var2, currentCompositeKeyHash3, peVarG2);
        }
        xp1.E(ck0Var, cVarD3, ComposeUiNode$Companion.getSetModifier());
        this.o.invoke(ck0Var, 0);
        kk0Var2.r(true);
        kk0Var2.a0(-1293135324);
        ne1 ne1Var3 = this.m;
        if (ne1Var3 != null) {
            c cVarC3 = androidx.compose.ui.layout.a.c(modifier$Companion, "trailingIcon");
            vb2 vb2VarC2 = vw.c(Alignment$Companion.getCenter(), false);
            int currentCompositeKeyHash4 = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
            su2 su2VarN4 = kk0Var2.n();
            c cVarD4 = b.d(ck0Var, cVarC3);
            d4 constructor4 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor4);
            } else {
                kk0Var2.o0();
            }
            pe peVarG3 = fq2.g(ck0Var, vb2VarC2, ck0Var, su2VarN4);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash4))) {
                fq2.v(currentCompositeKeyHash4, kk0Var2, currentCompositeKeyHash4, peVarG3);
            }
            xp1.E(ck0Var, cVarD4, ComposeUiNode$Companion.getSetModifier());
            yk0.CompositionLocalProvider(fq2.k(this.p, gn0.a), ne1Var3, ck0Var, 8);
            kk0Var2.r(true);
        }
        kk0Var2.r(false);
        kk0Var2.r(true);
    }
}

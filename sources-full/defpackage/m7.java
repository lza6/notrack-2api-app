package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class m7 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ ne1 d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ ne1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(ne1 ne1Var, ne1 ne1Var2, ne1 ne1Var3, long j, long j2, long j3, long j4, ne1 ne1Var4) {
        super(2);
        this.c = ne1Var;
        this.d = ne1Var2;
        this.h = ne1Var3;
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.o = j4;
        this.p = ne1Var4;
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
        c cVarJ = a.j(c.i, x7.a);
        vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), ck0Var, 0);
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
        pe peVarG = fq2.g(ck0Var, vb2VarColumnMeasurePolicy, ck0Var, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        kk0Var2.a0(-1924971291);
        ne1 ne1Var = this.c;
        if (ne1Var != null) {
            yk0.CompositionLocalProvider(fq2.k(this.l, gn0.a), zg0.rememberComposableLambda(934657765, true, new j7(ne1Var), ck0Var, 54), ck0Var, 56);
        }
        kk0Var2.r(false);
        kk0Var2.a0(-1924961479);
        ne1 ne1Var2 = this.d;
        if (ne1Var2 != null) {
            r13.m1803xc0df08af(this.m, o74.getValue(n74.l, ck0Var, 6), zg0.rememberComposableLambda(434448772, true, new k7(ne1Var, ne1Var2), ck0Var, 54), ck0Var, 384);
        }
        kk0Var2.r(false);
        kk0Var2.a0(-1924936431);
        ne1 ne1Var3 = this.h;
        if (ne1Var3 != null) {
            r13.m1803xc0df08af(this.n, o74.getValue(n74.d, ck0Var, 6), zg0.rememberComposableLambda(-796843771, true, new l7(ne1Var3), ck0Var, 54), ck0Var, 384);
        }
        kk0Var2.r(false);
        HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment$Companion.getEnd());
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
        int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN2 = kk0Var2.n();
        c cVarD2 = b.d(ck0Var, horizontalAlignElement);
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
        r13.m1803xc0df08af(this.o, o74.getValue(n74.m, ck0Var, 6), this.p, ck0Var, 0);
        kk0Var2.r(true);
        kk0Var2.r(true);
    }
}

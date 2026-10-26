package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class eq3 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ rg3 d;
    public final /* synthetic */ long h;
    public final /* synthetic */ float l;
    public final /* synthetic */ iw m;
    public final /* synthetic */ gh2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ je1 p;
    public final /* synthetic */ float q;
    public final /* synthetic */ ne1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq3(c cVar, rg3 rg3Var, long j, float f, iw iwVar, gh2 gh2Var, boolean z, je1 je1Var, float f2, ne1 ne1Var) {
        super(2);
        this.c = cVar;
        this.d = rg3Var;
        this.h = j;
        this.l = f;
        this.m = iwVar;
        this.n = gh2Var;
        this.o = z;
        this.p = je1Var;
        this.q = f2;
        this.r = ne1Var;
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
        un3 un3Var = vq1.a;
        kk0 kk0Var2 = (kk0) ck0Var;
        c cVarD = a.d(hq3.a(this.c.then(MinimumInteractiveModifier.c), this.d, hq3.m214x10dc4ab7(this.h, this.l, ck0Var, 0), this.m, ((wu0) kk0Var2.l(CompositionLocalsKt.getLocalDensity())).w(this.q)), this.n, g73.m194xaeb141ad(false, 0.0f, 0L, kk0Var2, 0, 7), this.o, null, this.p, 24);
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), true);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
        su2 su2VarN = kk0Var2.n();
        c cVarD2 = b.d(kk0Var2, cVarD);
        androidx.compose.ui.node.a.j.getClass();
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
        xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
        this.r.invoke(kk0Var2, 0);
        kk0Var2.r(true);
    }
}

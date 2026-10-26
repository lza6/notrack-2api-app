package defpackage;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dq3 extends ww1 implements ne1 {
    public final /* synthetic */ c c;
    public final /* synthetic */ rg3 d;
    public final /* synthetic */ long h;
    public final /* synthetic */ float l;
    public final /* synthetic */ iw m;
    public final /* synthetic */ float n;
    public final /* synthetic */ ne1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq3(c cVar, rg3 rg3Var, long j, float f, iw iwVar, float f2, ne1 ne1Var) {
        super(2);
        this.c = cVar;
        this.d = rg3Var;
        this.h = j;
        this.l = f;
        this.m = iwVar;
        this.n = f2;
        this.o = ne1Var;
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
        long jM214x10dc4ab7 = hq3.m214x10dc4ab7(this.h, this.l, ck0Var, 0);
        kk0 kk0Var2 = (kk0) ck0Var;
        c cVarThen = we3.b(hq3.a(this.c, this.d, jM214x10dc4ab7, this.m, ((wu0) kk0Var2.l(CompositionLocalsKt.getLocalDensity())).w(this.n)), false, ba3.H).then(new SuspendPointerInputElement(w84.a, null, null, new nq3(new e22(2, 1, null)), 6));
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
        this.o.invoke(kk0Var2, 0);
        kk0Var2.r(true);
    }
}

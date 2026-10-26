package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ev3 extends ww1 implements ne1 {
    public final /* synthetic */ gn3 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ uz3 h;
    public final /* synthetic */ ne1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev3(gn3 gn3Var, long j, uz3 uz3Var, ne1 ne1Var) {
        super(2);
        this.c = gn3Var;
        this.d = j;
        this.h = uz3Var;
        this.l = ne1Var;
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
        kk0 kk0Var2 = (kk0) ck0Var;
        gn3 gn3Var = this.c;
        boolean zH = kk0Var2.h(gn3Var);
        Object objP = kk0Var2.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new jz0(gn3Var, 4);
            kk0Var2.l0(objP);
        }
        c cVarA = a.a(modifier$Companion, (le1) objP);
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
        su2 su2VarN = kk0Var2.n();
        c cVarD = b.d(kk0Var2, cVarA);
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
        xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
        ov3.m1794xaca17d46(this.d, this.h, this.l, kk0Var2, 0);
        kk0Var2.r(true);
    }
}

package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class we2 extends ww1 implements ne1 {
    public final /* synthetic */ long c;
    public final /* synthetic */ je1 d;
    public final /* synthetic */ hh3 h;
    public final /* synthetic */ ue l;
    public final /* synthetic */ gq0 m;
    public final /* synthetic */ le1 n;
    public final /* synthetic */ c o;
    public final /* synthetic */ float p;
    public final /* synthetic */ rg3 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ float t;
    public final /* synthetic */ ne1 u;
    public final /* synthetic */ ne1 v;
    public final /* synthetic */ oe1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we2(long j, je1 je1Var, hh3 hh3Var, ue ueVar, gq0 gq0Var, le1 le1Var, c cVar, float f, rg3 rg3Var, long j2, long j3, float f2, ne1 ne1Var, ne1 ne1Var2, oe1 oe1Var) {
        super(2);
        this.c = j;
        this.d = je1Var;
        this.h = hh3Var;
        this.l = ueVar;
        this.m = gq0Var;
        this.n = le1Var;
        this.o = cVar;
        this.p = f;
        this.q = rg3Var;
        this.r = j2;
        this.s = j3;
        this.t = f2;
        this.u = ne1Var;
        this.v = ne1Var2;
        this.w = oe1Var;
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
        c cVarB = we3.b(lh4.a(d.c), false, fl1.D);
        vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, cVarB);
        a.j.getClass();
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
        pe peVarG = fq2.g(ck0Var, vb2VarC, ck0Var, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        hh3 hh3Var = this.h;
        boolean z = ((ih3) ((fv0) hh3Var.c.h).getValue()) != ih3.c;
        long j = this.c;
        je1 je1Var = this.d;
        hf2.m208x3ca40b1c(j, je1Var, z, ck0Var, 0);
        hf2.m207xe7dbe27c(androidx.compose.foundation.layout.b.a, this.l, this.m, je1Var, this.n, this.o, hh3Var, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, ck0Var, 70, 0, 0);
        kk0Var2.r(true);
    }
}

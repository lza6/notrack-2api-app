package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.node.ComposeUiNode$Companion;
import androidx.compose.ui.node.a;

/* JADX INFO: loaded from: classes.dex */
public final class qh extends ww1 implements ne1 {
    public final /* synthetic */ e c;
    public final /* synthetic */ float d;
    public final /* synthetic */ t44 h;
    public final /* synthetic */ ne1 l;
    public final /* synthetic */ uz3 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ ne1 p;
    public final /* synthetic */ ne1 q;
    public final /* synthetic */ float r;
    public final /* synthetic */ v44 s;
    public final /* synthetic */ ne1 t;
    public final /* synthetic */ uz3 u;
    public final /* synthetic */ float v;
    public final /* synthetic */ o43 w;
    public final /* synthetic */ boolean x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(e eVar, float f, t44 t44Var, ne1 ne1Var, uz3 uz3Var, float f2, boolean z, ne1 ne1Var2, wg0 wg0Var, float f3, v44 v44Var, ne1 ne1Var3, uz3 uz3Var2, float f4, o43 o43Var, boolean z2) {
        super(2);
        this.c = eVar;
        this.d = f;
        this.h = t44Var;
        this.l = ne1Var;
        this.m = uz3Var;
        this.n = f2;
        this.o = z;
        this.p = ne1Var2;
        this.q = wg0Var;
        this.r = f3;
        this.s = v44Var;
        this.t = ne1Var3;
        this.u = uz3Var2;
        this.v = f4;
        this.w = o43Var;
        this.x = z2;
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
        vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), ck0Var, 0);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(ck0Var, 0);
        su2 su2VarN = ((kk0) ck0Var).n();
        c cVarD = b.d(ck0Var, modifier$Companion);
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
        pe peVarG = fq2.g(ck0Var, vb2VarColumnMeasurePolicy, ck0Var, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarG);
        }
        xp1.E(ck0Var, cVarD, ComposeUiNode$Companion.getSetModifier());
        e eVar = this.c;
        c cVarO = xr0.O(fh4.a(modifier$Companion, eVar));
        float f = this.d;
        c cVarF = d.f(cVarO, 0.0f, f, 1);
        ph phVar = new ph();
        t44 t44Var = this.h;
        long j = t44Var.c;
        long j2 = t44Var.d;
        long j3 = t44Var.e;
        ne1 ne1Var = this.l;
        uz3 uz3Var = this.m;
        float f2 = this.n;
        bg1 bg1Var = hl.e;
        cl clVar = hl.a;
        wh.m1867xb14448e9(cVarF, phVar, j, j2, j3, ne1Var, uz3Var, f2, bg1Var, clVar, 0, this.o, this.p, this.q, ck0Var, 905969712, 3078);
        c cVarF2 = d.f(xr0.O(fh4.a(modifier$Companion, new v32(eVar, mh4.e))), 0.0f, this.r - f, 1);
        v44 v44Var = this.s;
        boolean zH = kk0Var2.h(v44Var);
        Object objP = kk0Var2.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new fh(v44Var, 1);
            kk0Var2.l0(objP);
        }
        wh.m1867xb14448e9(cVarF2, (ic3) objP, t44Var.c, t44Var.d, t44Var.e, this.t, this.u, this.v, hl.d, clVar, this.w.c, this.x, wh0.q, wh0.r, ck0Var, 905969664, 3456);
        kk0Var2.r(true);
    }
}

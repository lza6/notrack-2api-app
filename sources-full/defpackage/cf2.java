package defpackage;

import ai.notrack.app.R;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.layout.e;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.b;
import androidx.compose.ui.c;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.node.ComposeUiNode$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class cf2 extends ww1 implements ne1 {
    public final /* synthetic */ ne1 c;
    public final /* synthetic */ ue d;
    public final /* synthetic */ ne1 h;
    public final /* synthetic */ hh3 l;
    public final /* synthetic */ je1 m;
    public final /* synthetic */ gq0 n;
    public final /* synthetic */ oe1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf2(ne1 ne1Var, ue ueVar, ne1 ne1Var2, hh3 hh3Var, je1 je1Var, gq0 gq0Var, oe1 oe1Var) {
        super(2);
        this.c = ne1Var;
        this.d = ueVar;
        this.h = ne1Var2;
        this.l = hh3Var;
        this.m = je1Var;
        this.n = gq0Var;
        this.o = oe1Var;
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
        c cVarA = fh4.a(d.a, (e) this.c.invoke(ck0Var, 0));
        kk0 kk0Var2 = (kk0) ck0Var;
        ue ueVar = this.d;
        boolean zJ = kk0Var2.j(ueVar);
        xk xkVar = kk0Var2.a;
        Object objP = kk0Var2.P();
        if (zJ || objP == Composer$Companion.getEmpty()) {
            objP = new e8(29, ueVar);
            kk0Var2.l0(objP);
        }
        c cVarA2 = a.a(cVarA, (le1) objP);
        vb2 vb2VarColumnMeasurePolicy = if0.columnMeasurePolicy(hl.c, Alignment$Companion.getStart(), kk0Var2, 0);
        int currentCompositeKeyHash = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
        su2 su2VarN = kk0Var2.n();
        c cVarD = b.d(kk0Var2, cVarA2);
        androidx.compose.ui.node.a.j.getClass();
        d4 constructor = ComposeUiNode$Companion.getConstructor();
        if (xkVar == null) {
            rj0.a();
            throw null;
        }
        kk0Var2.e0();
        if (kk0Var2.O) {
            kk0Var2.m(constructor);
        } else {
            kk0Var2.o0();
        }
        pe peVarH = fq2.h(kk0Var2, vb2VarColumnMeasurePolicy, kk0Var2, su2VarN);
        if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash))) {
            fq2.v(currentCompositeKeyHash, kk0Var2, currentCompositeKeyHash, peVarH);
        }
        xp1.E(kk0Var2, cVarD, ComposeUiNode$Companion.getSetModifier());
        mf0 mf0Var = mf0.a;
        kk0Var2.a0(-1636564008);
        ne1 ne1Var = this.h;
        if (ne1Var != null) {
            String strM1830xa862b2cd = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_collapse_description, kk0Var2, 0);
            String strM1830xa862b2cd2 = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_dismiss_description, kk0Var2, 0);
            String strM1830xa862b2cd3 = uo3.m1830xa862b2cd(R.string.m3c_bottom_sheet_expand_description, kk0Var2, 0);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment$Companion.getCenterHorizontally());
            modifier$Companion.then(horizontalAlignElement);
            hh3 hh3Var = this.l;
            boolean zH = kk0Var2.h(hh3Var) | kk0Var2.h(strM1830xa862b2cd2);
            je1 je1Var = this.m;
            boolean zH2 = zH | kk0Var2.h(je1Var) | kk0Var2.h(strM1830xa862b2cd3);
            gq0 gq0Var = this.n;
            boolean zJ2 = zH2 | kk0Var2.j(gq0Var) | kk0Var2.h(strM1830xa862b2cd);
            Object objP2 = kk0Var2.P();
            if (zJ2 || objP2 == Composer$Companion.getEmpty()) {
                xw xwVar = new xw(hh3Var, strM1830xa862b2cd2, strM1830xa862b2cd3, strM1830xa862b2cd, je1Var, gq0Var, 2);
                kk0Var2.l0(xwVar);
                objP2 = xwVar;
            }
            c cVarB = we3.b(horizontalAlignElement, true, (le1) objP2);
            vb2 vb2VarC = vw.c(Alignment$Companion.getTopStart(), false);
            int currentCompositeKeyHash2 = rj0.getCurrentCompositeKeyHash(kk0Var2, 0);
            su2 su2VarN2 = kk0Var2.n();
            c cVarD2 = b.d(kk0Var2, cVarB);
            d4 constructor2 = ComposeUiNode$Companion.getConstructor();
            kk0Var2.e0();
            if (kk0Var2.O) {
                kk0Var2.m(constructor2);
            } else {
                kk0Var2.o0();
            }
            pe peVarH2 = fq2.h(kk0Var2, vb2VarC, kk0Var2, su2VarN2);
            if (kk0Var2.O || !kr1.n(kk0Var2.P(), Integer.valueOf(currentCompositeKeyHash2))) {
                fq2.v(currentCompositeKeyHash2, kk0Var2, currentCompositeKeyHash2, peVarH2);
            }
            xp1.E(kk0Var2, cVarD2, ComposeUiNode$Companion.getSetModifier());
            ne1Var.invoke(kk0Var2, 0);
            kk0Var2.r(true);
        }
        kk0Var2.r(false);
        this.o.invoke(mf0Var, kk0Var2, 6);
        kk0Var2.r(true);
    }
}

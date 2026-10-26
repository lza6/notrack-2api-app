package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.a;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class zx3 extends ww1 implements oe1 {
    public final /* synthetic */ uz3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(uz3 uz3Var) {
        super(3);
        this.c = uz3Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1582736677);
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        kb1 kb1Var = (kb1) kk0Var.l(CompositionLocalsKt.getLocalFontFamilyResolver());
        dx1 dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
        uz3 uz3Var = this.c;
        boolean zH = kk0Var.h(uz3Var) | kk0Var.h(dx1Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = yh4.Q(uz3Var, dx1Var);
            kk0Var.l0(objP);
        }
        uz3 uz3Var2 = (uz3) objP;
        boolean zH2 = kk0Var.h(kb1Var) | kk0Var.h(uz3Var2);
        Object objP2 = kk0Var.P();
        if (zH2 || objP2 == Composer$Companion.getEmpty()) {
            em3 em3Var = uz3Var2.a;
            lb1 lb1Var = em3Var.f;
            ic1 ic1Var = em3Var.c;
            if (ic1Var == null) {
                ic1Var = ic1.h;
            }
            gc1 gc1Var = em3Var.d;
            int i2 = gc1Var != null ? gc1Var.a : 0;
            hc1 hc1Var = em3Var.e;
            objP2 = ((mb1) kb1Var).b(lb1Var, ic1Var, i2, hc1Var != null ? hc1Var.a : 65535);
            kk0Var.l0(objP2);
        }
        gn3 gn3Var = (gn3) objP2;
        Object objP3 = kk0Var.P();
        Object obj = objP3;
        if (objP3 == Composer$Companion.getEmpty()) {
            Object value = gn3Var.getValue();
            yx3 yx3Var = new yx3();
            yx3Var.a = dx1Var;
            yx3Var.b = wu0Var;
            yx3Var.c = kb1Var;
            yx3Var.d = uz3Var;
            yx3Var.e = value;
            yx3Var.f = uu3.a(uz3Var, wu0Var, kb1Var, uu3.a, 1);
            kk0Var.l0(yx3Var);
            obj = yx3Var;
        }
        yx3 yx3Var2 = (yx3) obj;
        Object value2 = gn3Var.getValue();
        if (dx1Var != yx3Var2.a || !kr1.n(wu0Var, yx3Var2.b) || !kr1.n(kb1Var, yx3Var2.c) || !kr1.n(uz3Var2, yx3Var2.d) || !kr1.n(value2, yx3Var2.e)) {
            yx3Var2.a = dx1Var;
            yx3Var2.b = wu0Var;
            yx3Var2.c = kb1Var;
            yx3Var2.d = uz3Var2;
            yx3Var2.e = value2;
            yx3Var2.f = uu3.a(uz3Var2, wu0Var, kb1Var, uu3.a, 1);
        }
        Modifier$Companion modifier$Companion = c.i;
        boolean zJ = kk0Var.j(yx3Var2);
        Object objP4 = kk0Var.P();
        if (zJ || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new zg(4, yx3Var2);
            kk0Var.l0(objP4);
        }
        c cVarB = a.b(modifier$Companion, (oe1) objP4);
        kk0Var.r(false);
        return cVarB;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

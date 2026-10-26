package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public final class zh1 extends ww1 implements oe1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ uz3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh1(int i, int i2, uz3 uz3Var) {
        super(3);
        this.c = i;
        this.d = i2;
        this.h = uz3Var;
    }

    public final c invoke(c cVar, ck0 ck0Var, int i) {
        long j;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(408240218);
        int i2 = this.c;
        int i3 = this.d;
        av1.O(i2, i3);
        if (i2 == 1 && i3 == Integer.MAX_VALUE) {
            Modifier$Companion modifier$Companion = c.i;
            kk0Var.r(false);
            return modifier$Companion;
        }
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        kb1 kb1Var = (kb1) kk0Var.l(CompositionLocalsKt.getLocalFontFamilyResolver());
        dx1 dx1Var = (dx1) kk0Var.l(CompositionLocalsKt.getLocalLayoutDirection());
        uz3 uz3Var = this.h;
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
            int i4 = gc1Var != null ? gc1Var.a : 0;
            hc1 hc1Var = em3Var.e;
            objP2 = ((mb1) kb1Var).b(lb1Var, ic1Var, i4, hc1Var != null ? hc1Var.a : 65535);
            kk0Var.l0(objP2);
        }
        gn3 gn3Var = (gn3) objP2;
        boolean zH3 = kk0Var.h(gn3Var.getValue()) | kk0Var.h(wu0Var) | kk0Var.h(kb1Var) | kk0Var.h(uz3Var) | kk0Var.h(dx1Var);
        Object objP3 = kk0Var.P();
        if (zH3 || objP3 == Composer$Companion.getEmpty()) {
            j = 4294967295L;
            objP3 = Integer.valueOf((int) (uu3.a(uz3Var2, wu0Var, kb1Var, uu3.a, 1) & 4294967295L));
            kk0Var.l0(objP3);
        } else {
            j = 4294967295L;
        }
        int iIntValue = ((Number) objP3).intValue();
        boolean zH4 = kk0Var.h(uz3Var) | kk0Var.h(wu0Var) | kk0Var.h(kb1Var) | kk0Var.h(dx1Var) | kk0Var.h(gn3Var.getValue());
        Object objP4 = kk0Var.P();
        if (zH4 || objP4 == Composer$Companion.getEmpty()) {
            StringBuilder sb = new StringBuilder();
            String str = uu3.a;
            sb.append(str);
            sb.append('\n');
            sb.append(str);
            objP4 = Integer.valueOf((int) (uu3.a(uz3Var2, wu0Var, kb1Var, sb.toString(), 2) & j));
            kk0Var.l0(objP4);
        }
        int iIntValue2 = ((Number) objP4).intValue() - iIntValue;
        Integer numValueOf = i2 == 1 ? null : Integer.valueOf(((i2 - 1) * iIntValue2) + iIntValue);
        Integer numValueOf2 = i3 != Integer.MAX_VALUE ? Integer.valueOf(((i3 - 1) * iIntValue2) + iIntValue) : null;
        c cVarE = d.e(c.i, numValueOf != null ? wu0Var.q0(numValueOf.intValue()) : Float.NaN, numValueOf2 != null ? wu0Var.q0(numValueOf2.intValue()) : Float.NaN);
        kk0Var.r(false);
        return cVarE;
    }

    @Override // defpackage.oe1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((c) obj, (ck0) obj2, ((Number) obj3).intValue());
    }
}

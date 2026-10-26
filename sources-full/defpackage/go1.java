package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class go1 {
    public final oi2 a = new oi2(0, new eo1[16]);
    public final ft2 b = cl3.d(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final ft2 d = cl3.d(Boolean.TRUE);

    public final void run$animation_core_release(ck0 ck0Var, int i) {
        int i2;
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-318043801);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (kk0Var.j(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (kk0Var.S(i2 & 1, (i2 & 3) != 2)) {
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = cl3.d(null);
                kk0Var.l0(objP);
            }
            mi2 mi2Var = (mi2) objP;
            if (((Boolean) this.d.getValue()).booleanValue() || ((Boolean) this.b.getValue()).booleanValue()) {
                kk0Var.a0(1719883733);
                boolean zJ = kk0Var.j(this);
                Object objP2 = kk0Var.P();
                if (zJ || objP2 == Composer$Companion.getEmpty()) {
                    objP2 = new qb(mi2Var, this, null);
                    kk0Var.l0(objP2);
                }
                r11.LaunchedEffect(this, (ne1) objP2, kk0Var, i2 & 14);
                kk0Var.r(false);
            } else {
                kk0Var.a0(1721270456);
                kk0Var.r(false);
            }
        } else {
            kk0Var.V();
        }
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new uw(i, i3, this));
        }
    }
}

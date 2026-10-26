package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class rr2 {
    public static final dl0 a = new dl0(xq2.l);

    public static final pr2 rememberOverscrollEffect(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(282942128);
        qr2 qr2Var = (qr2) kk0Var.l(a);
        if (qr2Var == null) {
            kk0Var.r(false);
            return null;
        }
        boolean zH = kk0Var.h(qr2Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            cb cbVar = (cb) qr2Var;
            bb bbVar = new bb(cbVar.a, cbVar.b, cbVar.c, cbVar.d);
            kk0Var.l0(bbVar);
            objP = bbVar;
        }
        pr2 pr2Var = (pr2) objP;
        kk0Var.r(false);
        return pr2Var;
    }
}

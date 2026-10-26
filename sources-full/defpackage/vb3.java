package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class vb3 {
    public static final vb3 a = new vb3();

    public final w71 flingBehavior(ck0 ck0Var, int i) {
        zr0 zr0VarRememberSplineBasedDecay = rm3.rememberSplineBasedDecay(ck0Var, 0);
        kk0 kk0Var = (kk0) ck0Var;
        boolean zH = kk0Var.h(zr0VarRememberSplineBasedDecay);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new vs0(zr0VarRememberSplineBasedDecay);
            kk0Var.l0(objP);
        }
        return (vs0) objP;
    }

    @cv0
    public final pr2 overscrollEffect(ck0 ck0Var, int i) {
        pr2 pr2VarRememberPlatformOverscrollEffect = ac.rememberPlatformOverscrollEffect(ck0Var, 0);
        return pr2VarRememberPlatformOverscrollEffect == null ? ub3.a : pr2VarRememberPlatformOverscrollEffect;
    }
}

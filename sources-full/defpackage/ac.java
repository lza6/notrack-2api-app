package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class ac {
    public static final long a = gb2.d(4284900966L);
    public static final is2 b = a.a(0.0f, 0.0f, 3);

    public static final pr2 rememberPlatformOverscrollEffect(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        nr2 nr2Var = (nr2) kk0Var.l(or2.a);
        if (nr2Var == null) {
            kk0Var.a0(-461477086);
            kk0Var.r(false);
            return null;
        }
        kk0Var.a0(-461444412);
        boolean zH = kk0Var.h(context) | kk0Var.h(wu0Var) | kk0Var.h(nr2Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            bb bbVar = new bb(context, wu0Var, nr2Var.a, nr2Var.b);
            kk0Var.l0(bbVar);
            objP = bbVar;
        }
        bb bbVar2 = (bb) objP;
        kk0Var.r(false);
        return bbVar2;
    }

    /* JADX INFO: renamed from: rememberPlatformOverscrollFactory-3J-VO9M, reason: not valid java name */
    public static final qr2 m0xcee97a5f(long j, hs2 hs2Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 1) != 0) {
            j = a;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            hs2Var = b;
        }
        kk0 kk0Var = (kk0) ck0Var;
        return new cb((Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext()), (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity()), j2, hs2Var);
    }
}

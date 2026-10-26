package defpackage;

import android.view.View;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class f04 {
    public static final ye0 a;
    public static final ye0 b;

    static {
        long j = ue0.a;
        long j2 = ue0.c;
        long j3 = ue0.j;
        long j4 = ue0.e;
        long j5 = ue0.i;
        long j6 = ue0.l;
        long j7 = ue0.m;
        long j8 = ue0.n;
        long j9 = ue0.p;
        long j10 = ue0.q;
        long j11 = ue0.o;
        un3 un3Var = af0.a;
        a = new ye0(j, j2, j8, j9, se0.c, j4, se0.g, se0.l, se0.h, se0.o, se0.i, se0.p, se0.j, j6, j9, j7, j9, j8, j10, j3, se0.d, se0.b, j5, se0.e, se0.a, se0.f, j11, j11, se0.k, se0.m, se0.n, j7, j8, j8, j7, j6);
        long j12 = ue0.b;
        long j13 = ue0.d;
        long j14 = ue0.k;
        long j15 = ue0.f;
        long j16 = ue0.r;
        long j17 = ue0.s;
        long j18 = ue0.t;
        long j19 = ue0.v;
        long j20 = ue0.w;
        long j21 = ue0.u;
        b = af0.c(j12, j13, j18, j19, j15, 0L, 0L, j16, j19, j17, j19, j18, j20, j14, j5, j21, j21, j17, j18, j18, j17, j17, 867180496, 8);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    public static final void NotrackAiTheme(g04 g04Var, ne1 ne1Var, ck0 ck0Var, int i, int i2) {
        int i3;
        int i4;
        ne1Var.getClass();
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.c0(-1346284682);
        if ((i & 6) == 0) {
            if ((i2 & 1) != 0) {
                i4 = 2;
            } else {
                if (kk0Var.f(g04Var == null ? -1 : g04Var.ordinal())) {
                    i4 = 4;
                } else {
                    i4 = 2;
                }
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= kk0Var.j(ne1Var) ? 32 : 16;
        }
        if (kk0Var.S(i3 & 1, (i3 & 19) != 18)) {
            kk0Var.X();
            int i5 = i & 1;
            g04 g04Var2 = g04.d;
            if (i5 != 0 && !kk0Var.D()) {
                kk0Var.V();
                int i6 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                g04Var = g04Var2;
            }
            kk0Var.s();
            boolean z = g04Var == g04Var2;
            ye0 ye0Var = z ? a : b;
            View view = (View) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalView());
            if (view.isInEditMode()) {
                kk0Var.a0(-764638964);
            } else {
                kk0Var.a0(-761995470);
                boolean zJ = kk0Var.j(view) | kk0Var.h(ye0Var) | kk0Var.i(z);
                Object objP = kk0Var.P();
                if (zJ || objP == Composer$Companion.getEmpty()) {
                    objP = new up(view, ye0Var, z);
                    kk0Var.l0(objP);
                }
                r11.SideEffect((je1) objP, kk0Var, 0);
            }
            kk0Var.r(false);
            yk0.CompositionLocalProvider(gx.c.c(z ? gx.a : gx.b), zg0.rememberComposableLambda(449517622, true, new dn(ye0Var, 11, ne1Var), kk0Var, 54), kk0Var, 56);
        } else {
            kk0Var.V();
        }
        g04 g04Var3 = g04Var;
        w33 w33VarV = kk0Var.v();
        if (w33VarV != null) {
            w33VarV.updateScope(new d70(g04Var3, ne1Var, i, i2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w84 NotrackAiTheme$lambda$2(ye0 ye0Var, ne1 ne1Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (kk0Var.S(i & 1, (i & 3) != 2)) {
            fb2.MaterialTheme(ye0Var, null, k72.rememberLocalizedTypography(z64.a, kk0Var, 6), ne1Var, kk0Var, 0, 2);
        } else {
            kk0Var.V();
        }
        return w84.a;
    }
}

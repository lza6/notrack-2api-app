package defpackage;

import androidx.compose.runtime.Composer$Companion;

/* JADX INFO: loaded from: classes.dex */
public abstract class we {
    public static final tm3 a = kr1.l0(7, null);
    public static final tm3 b;
    public static final tm3 c;
    public static final tm3 d;
    public static final tm3 e;
    public static final tm3 f;
    public static final tm3 g;
    public static final tm3 h;

    static {
        h43 h43Var = ae4.a;
        b = kr1.l0(3, new rx0(0.1f));
        c = kr1.l0(3, new bi3((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)));
        d = kr1.l0(3, new ln2((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(0.5f)) & 4294967295L)));
        e = kr1.l0(3, ae4.a);
        f = kr1.l0(3, 1);
        g = kr1.l0(3, new iq1(4294967297L));
        h = kr1.l0(3, new qq1(4294967297L));
    }

    /* JADX INFO: renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final gn3 m1848xa75b2f6b(float f2, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = b;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        int i3 = i << 6;
        return animateValueAsState(new rx0(f2), mb4.c, wfVar2, null, str2, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    @cv0
    /* JADX INFO: renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ gn3 m1849xd08e7bec(float f2, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = b;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(new rx0(f2), mb4.c, wfVar2, null, null, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
    }

    public static final gn3 animateFloatAsState(float f2, wf wfVar, float f3, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        wf wfVar2;
        int i3 = i2 & 2;
        tm3 tm3Var = a;
        if (i3 != 0) {
            wfVar = tm3Var;
        }
        float f4 = (i2 & 4) != 0 ? 0.01f : f3;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        le1 le1Var2 = (i2 & 16) != 0 ? null : le1Var;
        if (wfVar == tm3Var) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(1125558999);
            boolean z = (((i & 896) ^ 384) > 256 && kk0Var.e(f4)) || (i & 384) == 256;
            Object objP = kk0Var.P();
            if (z || objP == Composer$Companion.getEmpty()) {
                objP = kr1.l0(3, Float.valueOf(f4));
                kk0Var.l0(objP);
            }
            kk0Var.r(false);
            wfVar2 = (tm3) objP;
        } else {
            kk0 kk0Var2 = (kk0) ck0Var;
            kk0Var2.a0(1125668925);
            kk0Var2.r(false);
            wfVar2 = wfVar;
        }
        int i4 = i << 3;
        return animateValueAsState(Float.valueOf(f2), mb4.a, wfVar2, Float.valueOf(f4), str2, le1Var2, ck0Var, (i & 14) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
    }

    @cv0
    public static final /* synthetic */ gn3 animateFloatAsState(float f2, wf wfVar, float f3, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = a;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            f3 = 0.01f;
        }
        float f4 = f3;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        return animateFloatAsState(f2, wfVar2, f4, null, le1Var, ck0Var, (i & 1022) | ((i << 3) & 57344), 8);
    }

    public static final gn3 animateIntAsState(int i, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            wfVar = f;
        }
        wf wfVar2 = wfVar;
        if ((i3 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            le1Var = null;
        }
        int i4 = i2 << 6;
        return animateValueAsState(Integer.valueOf(i), mb4.b, wfVar2, null, str2, le1Var, ck0Var, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
    }

    @cv0
    public static final /* synthetic */ gn3 animateIntAsState(int i, wf wfVar, le1 le1Var, ck0 ck0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            wfVar = f;
        }
        wf wfVar2 = wfVar;
        if ((i3 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(Integer.valueOf(i), mb4.b, wfVar2, null, null, le1Var, ck0Var, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
    }

    @cv0
    /* JADX INFO: renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ gn3 m1850xc869e5a9(long j, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = g;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(new iq1(j), mb4.g, wfVar2, null, null, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
    }

    /* JADX INFO: renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final gn3 m1851x389843c3(long j, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = g;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        int i3 = i << 6;
        return animateValueAsState(new iq1(j), mb4.g, wfVar2, null, str2, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    /* JADX INFO: renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final gn3 m1852xdce78cfd(long j, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = h;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        int i3 = i << 6;
        return animateValueAsState(new qq1(j), mb4.h, wfVar2, null, str2, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    @cv0
    /* JADX INFO: renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ gn3 m1853x31c05c84(long j, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = h;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(new qq1(j), mb4.h, wfVar2, null, null, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
    }

    /* JADX INFO: renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final gn3 m1854x3c2c0bc1(long j, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = d;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        int i3 = i << 6;
        return animateValueAsState(new ln2(j), mb4.f, wfVar2, null, str2, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    @cv0
    /* JADX INFO: renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ gn3 m1855x4a7a5a0(long j, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = d;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(new ln2(j), mb4.f, wfVar2, null, null, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
    }

    public static final gn3 animateRectAsState(h43 h43Var, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = e;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        int i3 = i << 6;
        return animateValueAsState(h43Var, mb4.i, wfVar2, null, str2, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    @cv0
    public static final /* synthetic */ gn3 animateRectAsState(h43 h43Var, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = e;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(h43Var, mb4.i, wfVar2, null, null, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
    }

    @cv0
    /* JADX INFO: renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ gn3 m1856xa61efe30(long j, wf wfVar, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = c;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            le1Var = null;
        }
        return animateValueAsState(new bi3(j), mb4.e, wfVar2, null, null, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | ((i << 9) & 458752), 24);
    }

    /* JADX INFO: renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final gn3 m1857x242ab5cd(long j, wf wfVar, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            wfVar = c;
        }
        wf wfVar2 = wfVar;
        if ((i2 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            le1Var = null;
        }
        int i3 = i << 6;
        return animateValueAsState(new bi3(j), mb4.e, wfVar2, null, str2, le1Var, ck0Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    public static final <T, V extends cg> gn3 animateValueAsState(T t, w64 w64Var, wf wfVar, T t2, String str, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            kk0 kk0Var = (kk0) ck0Var;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = kr1.l0(7, null);
                kk0Var.l0(objP);
            }
            wfVar = (tm3) objP;
        }
        T t3 = (i2 & 8) != 0 ? null : t2;
        le1 le1Var2 = (i2 & 32) != 0 ? null : le1Var;
        kk0 kk0Var2 = (kk0) ck0Var;
        Object objP2 = kk0Var2.P();
        if (objP2 == Composer$Companion.getEmpty()) {
            objP2 = cl3.d(null);
            kk0Var2.l0(objP2);
        }
        mi2 mi2Var = (mi2) objP2;
        Object objP3 = kk0Var2.P();
        if (objP3 == Composer$Companion.getEmpty()) {
            objP3 = new ue(t, w64Var, t3);
            kk0Var2.l0(objP3);
        }
        ue ueVar = (ue) objP3;
        gn3 gn3VarRememberUpdatedState = cl3.rememberUpdatedState(le1Var2, kk0Var2, (i >> 15) & 14);
        if (t3 != null && (wfVar instanceof tm3)) {
            tm3 tm3Var = (tm3) wfVar;
            if (!kr1.n(tm3Var.c, t3)) {
                wfVar = new tm3(tm3Var.a, tm3Var.b, t3);
            }
        }
        gn3 gn3VarRememberUpdatedState2 = cl3.rememberUpdatedState(wfVar, kk0Var2, 0);
        Object objP4 = kk0Var2.P();
        if (objP4 == Composer$Companion.getEmpty()) {
            objP4 = gm4.b(-1, 6, null);
            kk0Var2.l0(objP4);
        }
        w20 w20Var = (w20) objP4;
        int i3 = 1;
        boolean zJ = kk0Var2.j(w20Var) | ((((i & 14) ^ 6) > 4 && kk0Var2.j(t)) || (i & 6) == 4);
        Object objP5 = kk0Var2.P();
        if (zJ || objP5 == Composer$Companion.getEmpty()) {
            objP5 = new c9(w20Var, i3, t);
            kk0Var2.l0(objP5);
        }
        r11.SideEffect((je1) objP5, kk0Var2, 0);
        boolean zJ2 = kk0Var2.j(w20Var) | kk0Var2.j(ueVar) | kk0Var2.h(gn3VarRememberUpdatedState2) | kk0Var2.h(gn3VarRememberUpdatedState);
        Object objP6 = kk0Var2.P();
        if (zJ2 || objP6 == Composer$Companion.getEmpty()) {
            ve veVar = new ve(w20Var, ueVar, gn3VarRememberUpdatedState2, gn3VarRememberUpdatedState, null, 0);
            kk0Var2.l0(veVar);
            objP6 = veVar;
        }
        r11.LaunchedEffect(w20Var, (ne1) objP6, kk0Var2, 0);
        gn3 gn3Var = (gn3) mi2Var.getValue();
        return gn3Var == null ? ueVar.c : gn3Var;
    }

    @cv0
    public static final /* synthetic */ gn3 animateValueAsState(Object obj, w64 w64Var, wf wfVar, Object obj2, le1 le1Var, ck0 ck0Var, int i, int i2) {
        if ((i2 & 4) != 0) {
            kk0 kk0Var = (kk0) ck0Var;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = kr1.l0(7, null);
                kk0Var.l0(objP);
            }
            wfVar = (tm3) objP;
        }
        wf wfVar2 = wfVar;
        int i3 = i & 8;
        return animateValueAsState(obj, w64Var, wfVar2, (i2 & 8) != 0 ? null : obj2, "ValueAnimation", (i2 & 16) != 0 ? null : le1Var, ck0Var, (i3 << 9) | i3 | 24576 | (i & 14) | (i & 112) | (i & 896) | (i & 7168) | ((i << 3) & 458752), 0);
    }
}

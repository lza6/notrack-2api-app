package androidx.compose.animation;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.c;
import defpackage.ae4;
import defpackage.b64;
import defpackage.ck0;
import defpackage.cl3;
import defpackage.d4;
import defpackage.d41;
import defpackage.e41;
import defpackage.ft2;
import defpackage.g41;
import defpackage.h43;
import defpackage.hg1;
import defpackage.hi3;
import defpackage.iq1;
import defpackage.j61;
import defpackage.je1;
import defpackage.k41;
import defpackage.k54;
import defpackage.kk0;
import defpackage.kr1;
import defpackage.l41;
import defpackage.lb4;
import defpackage.le1;
import defpackage.mb4;
import defpackage.mi2;
import defpackage.na3;
import defpackage.o54;
import defpackage.o71;
import defpackage.p54;
import defpackage.qq1;
import defpackage.sx;
import defpackage.t20;
import defpackage.t64;
import defpackage.tm3;
import defpackage.wt;
import defpackage.x51;
import defpackage.x64;
import defpackage.xt;
import defpackage.y51;
import defpackage.yt;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final x64 a;
    public static final tm3 b;
    public static final tm3 c;
    public static final tm3 d;

    static {
        sx sxVar = sx.z;
        sx sxVar2 = sx.A;
        x64 x64Var = mb4.a;
        a = new x64(sxVar, sxVar2);
        b = kr1.l0(5, null);
        h43 h43Var = ae4.a;
        c = kr1.l0(1, new iq1(4294967297L));
        d = kr1.l0(1, new qq1(4294967297L));
    }

    public static l41 a() {
        h43 h43Var = ae4.a;
        return b(k(Alignment$Companion.getEnd()), kr1.l0(1, new qq1(4294967297L)), new lb4(1, 17));
    }

    public static final l41 b(yt ytVar, o71 o71Var, le1 le1Var) {
        return new l41(new p54((j61) null, (hi3) null, new t20(ytVar, o71Var, le1Var), (na3) null, (LinkedHashMap) null, 59));
    }

    public static /* synthetic */ l41 c() {
        h43 h43Var = ae4.a;
        return b(Alignment$Companion.getBottomEnd(), kr1.l0(1, new qq1(4294967297L)), sx.C);
    }

    private static final hg1 createGraphicsLayerBlock(o54 o54Var, k41 k41Var, x51 x51Var, String str, ck0 ck0Var, int i) {
        k54 k54VarCreateDeferredAnimation;
        k54 k54VarCreateDeferredAnimation2;
        boolean z = true;
        boolean z2 = (((l41) k41Var).b.a == null && ((y51) x51Var).c.a == null) ? false : true;
        boolean z3 = (((l41) k41Var).b.d == null && ((y51) x51Var).c.d == null) ? false : true;
        k54 k54VarCreateDeferredAnimation3 = null;
        if (z2) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(-675026101);
            x64 x64Var = mb4.a;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = str + " alpha";
                kk0Var.l0(objP);
            }
            k54VarCreateDeferredAnimation = b64.createDeferredAnimation(o54Var, x64Var, (String) objP, kk0Var, (i & 14) | 384, 0);
            kk0Var.r(false);
        } else {
            kk0 kk0Var2 = (kk0) ck0Var;
            kk0Var2.a0(-674857617);
            kk0Var2.r(false);
            k54VarCreateDeferredAnimation = null;
        }
        if (z3) {
            kk0 kk0Var3 = (kk0) ck0Var;
            kk0Var3.a0(-674790005);
            x64 x64Var2 = mb4.a;
            Object objP2 = kk0Var3.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = str + " scale";
                kk0Var3.l0(objP2);
            }
            k54VarCreateDeferredAnimation2 = b64.createDeferredAnimation(o54Var, x64Var2, (String) objP2, kk0Var3, (i & 14) | 384, 0);
            kk0Var3.r(false);
        } else {
            kk0 kk0Var4 = (kk0) ck0Var;
            kk0Var4.a0(-674621521);
            kk0Var4.r(false);
            k54VarCreateDeferredAnimation2 = null;
        }
        if (z3) {
            kk0 kk0Var5 = (kk0) ck0Var;
            kk0Var5.a0(-674543896);
            k54VarCreateDeferredAnimation3 = b64.createDeferredAnimation(o54Var, a, "TransformOriginInterruptionHandling", kk0Var5, (i & 14) | 384, 0);
            kk0Var5.r(false);
        } else {
            kk0 kk0Var6 = (kk0) ck0Var;
            kk0Var6.a0(-674372529);
            kk0Var6.r(false);
        }
        kk0 kk0Var7 = (kk0) ck0Var;
        boolean zJ = kk0Var7.j(k54VarCreateDeferredAnimation) | ((((i & 112) ^ 48) > 32 && kk0Var7.h(k41Var)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && kk0Var7.h(x51Var)) || (i & 384) == 256) | kk0Var7.j(k54VarCreateDeferredAnimation2);
        if ((((i & 14) ^ 6) <= 4 || !kk0Var7.h(o54Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zJ2 = zJ | z | kk0Var7.j(k54VarCreateDeferredAnimation3);
        Object objP3 = kk0Var7.P();
        if (zJ2 || objP3 == Composer$Companion.getEmpty()) {
            e41 e41Var = new e41(k54VarCreateDeferredAnimation, k54VarCreateDeferredAnimation2, o54Var, k41Var, x51Var, k54VarCreateDeferredAnimation3);
            kk0Var7.l0(e41Var);
            objP3 = e41Var;
        }
        return (hg1) objP3;
    }

    public static final c createModifier(o54 o54Var, k41 k41Var, x51 x51Var, je1 je1Var, String str, ck0 ck0Var, int i, int i2) {
        k54 k54Var;
        k54 k54Var2;
        je1 je1Var2 = (i2 & 4) != 0 ? d4.D : je1Var;
        int i3 = i & 14;
        k41 k41VarTrackActiveEnter = trackActiveEnter(o54Var, k41Var, ck0Var, i & 126);
        int i4 = i >> 3;
        x51 x51VarTrackActiveExit = trackActiveExit(o54Var, x51Var, ck0Var, (i4 & 112) | i3);
        boolean z = true;
        int i5 = 0;
        boolean z2 = (((l41) k41VarTrackActiveEnter).b.b == null && ((y51) x51VarTrackActiveExit).c.b == null) ? false : true;
        boolean z3 = (((l41) k41VarTrackActiveEnter).b.c == null && ((y51) x51VarTrackActiveExit).c.c == null) ? false : true;
        k54 k54VarCreateDeferredAnimation = null;
        if (z2) {
            kk0 kk0Var = (kk0) ck0Var;
            kk0Var.a0(-821159459);
            x64 x64Var = mb4.g;
            Object objP = kk0Var.P();
            if (objP == Composer$Companion.getEmpty()) {
                objP = str + " slide";
                kk0Var.l0(objP);
            }
            k54 k54VarCreateDeferredAnimation2 = b64.createDeferredAnimation(o54Var, x64Var, (String) objP, kk0Var, i3 | 384, 0);
            kk0Var.r(false);
            k54Var = k54VarCreateDeferredAnimation2;
        } else {
            kk0 kk0Var2 = (kk0) ck0Var;
            kk0Var2.a0(-821053656);
            kk0Var2.r(false);
            k54Var = null;
        }
        if (z3) {
            kk0 kk0Var3 = (kk0) ck0Var;
            kk0Var3.a0(-820961865);
            x64 x64Var2 = mb4.h;
            Object objP2 = kk0Var3.P();
            if (objP2 == Composer$Companion.getEmpty()) {
                objP2 = str + " shrink/expand";
                kk0Var3.l0(objP2);
            }
            k54 k54VarCreateDeferredAnimation3 = b64.createDeferredAnimation(o54Var, x64Var2, (String) objP2, kk0Var3, i3 | 384, 0);
            kk0Var3.r(false);
            k54Var2 = k54VarCreateDeferredAnimation3;
        } else {
            kk0 kk0Var4 = (kk0) ck0Var;
            kk0Var4.a0(-820851041);
            kk0Var4.r(false);
            k54Var2 = null;
        }
        if (z3) {
            kk0 kk0Var5 = (kk0) ck0Var;
            kk0Var5.a0(-820777446);
            x64 x64Var3 = mb4.g;
            Object objP3 = kk0Var5.P();
            if (objP3 == Composer$Companion.getEmpty()) {
                objP3 = str + " InterruptionHandlingOffset";
                kk0Var5.l0(objP3);
            }
            k54VarCreateDeferredAnimation = b64.createDeferredAnimation(o54Var, x64Var3, (String) objP3, kk0Var5, i3 | 384, 0);
            kk0Var5.r(false);
        } else {
            kk0 kk0Var6 = (kk0) ck0Var;
            kk0Var6.a0(-820608001);
            kk0Var6.r(false);
        }
        p54 p54Var = ((y51) x51VarTrackActiveExit).c;
        boolean z4 = !z3;
        hg1 hg1VarCreateGraphicsLayerBlock = createGraphicsLayerBlock(o54Var, k41VarTrackActiveEnter, x51VarTrackActiveExit, str, ck0Var, i3 | (i4 & 7168));
        Modifier$Companion modifier$Companion = c.i;
        kk0 kk0Var7 = (kk0) ck0Var;
        boolean zI = kk0Var7.i(z4);
        if ((((i & 7168) ^ 3072) <= 2048 || !kk0Var7.h(je1Var2)) && (i & 3072) != 2048) {
            z = false;
        }
        boolean z5 = zI | z;
        Object objP4 = kk0Var7.P();
        if (z5 || objP4 == Composer$Companion.getEmpty()) {
            objP4 = new g41(i5, je1Var2, z4);
            kk0Var7.l0(objP4);
        }
        return androidx.compose.ui.graphics.a.a(modifier$Companion, (le1) objP4).then(new EnterExitTransitionElement(o54Var, k54Var2, k54VarCreateDeferredAnimation, k54Var, k41VarTrackActiveEnter, x51VarTrackActiveExit, je1Var2, hg1VarCreateGraphicsLayerBlock));
    }

    public static l41 d(t64 t64Var, int i) {
        int i2 = 1;
        o71 o71VarL0 = t64Var;
        if ((i & 1) != 0) {
            h43 h43Var = ae4.a;
            o71VarL0 = kr1.l0(1, new qq1(4294967297L));
        }
        return b(l(Alignment$Companion.getBottom()), o71VarL0, new lb4(i2, 18));
    }

    public static l41 e(t64 t64Var, int i) {
        o71 o71VarL0 = t64Var;
        if ((i & 1) != 0) {
            o71VarL0 = kr1.l0(5, null);
        }
        return new l41(new p54(new j61(o71VarL0), (hi3) null, (t20) null, (na3) null, (LinkedHashMap) null, 62));
    }

    public static y51 f(t64 t64Var, int i) {
        o71 o71VarL0 = t64Var;
        if ((i & 1) != 0) {
            o71VarL0 = kr1.l0(5, null);
        }
        return new y51(new p54(new j61(o71VarL0), (hi3) null, (t20) null, (na3) null, (LinkedHashMap) null, 62));
    }

    public static y51 g() {
        h43 h43Var = ae4.a;
        return h(k(Alignment$Companion.getEnd()), kr1.l0(1, new qq1(4294967297L)), new lb4(1, 19));
    }

    public static final y51 h(yt ytVar, o71 o71Var, le1 le1Var) {
        return new y51(new p54((j61) null, (hi3) null, new t20(ytVar, o71Var, le1Var), (na3) null, (LinkedHashMap) null, 59));
    }

    public static /* synthetic */ y51 i() {
        h43 h43Var = ae4.a;
        return h(Alignment$Companion.getBottomEnd(), kr1.l0(1, new qq1(4294967297L)), sx.D);
    }

    public static y51 j(t64 t64Var, int i) {
        int i2 = 1;
        o71 o71VarL0 = t64Var;
        if ((i & 1) != 0) {
            h43 h43Var = ae4.a;
            o71VarL0 = kr1.l0(1, new qq1(4294967297L));
        }
        return h(l(Alignment$Companion.getBottom()), o71VarL0, new lb4(i2, 20));
    }

    public static final yt k(wt wtVar) {
        if (wtVar.equals(Alignment$Companion.getStart())) {
            return Alignment$Companion.getCenterStart();
        }
        return wtVar.equals(Alignment$Companion.getEnd()) ? Alignment$Companion.getCenterEnd() : Alignment$Companion.getCenter();
    }

    public static final yt l(xt xtVar) {
        if (xtVar.equals(Alignment$Companion.getTop())) {
            return Alignment$Companion.getTopCenter();
        }
        return xtVar.equals(Alignment$Companion.getBottom()) ? Alignment$Companion.getBottomCenter() : Alignment$Companion.getCenter();
    }

    public static final k41 trackActiveEnter(o54 o54Var, k41 k41Var, ck0 ck0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(o54Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(k41Var);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        Object objB = o54Var.b();
        ft2 ft2Var = o54Var.d;
        Object value = ft2Var.getValue();
        d41 d41Var = d41.d;
        if (objB == value && o54Var.b() == d41Var) {
            if (o54Var.f()) {
                mi2Var.setValue(k41Var);
            } else {
                mi2Var.setValue(k41.a);
            }
        } else if (ft2Var.getValue() == d41Var) {
            mi2Var.setValue(((k41) mi2Var.getValue()).a(k41Var));
        }
        return (k41) mi2Var.getValue();
    }

    public static final x51 trackActiveExit(o54 o54Var, x51 x51Var, ck0 ck0Var, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((kk0) ck0Var).h(o54Var)) || (i & 6) == 4;
        kk0 kk0Var = (kk0) ck0Var;
        Object objP = kk0Var.P();
        if (z || objP == Composer$Companion.getEmpty()) {
            objP = cl3.d(x51Var);
            kk0Var.l0(objP);
        }
        mi2 mi2Var = (mi2) objP;
        Object objB = o54Var.b();
        ft2 ft2Var = o54Var.d;
        Object value = ft2Var.getValue();
        d41 d41Var = d41.d;
        if (objB == value && o54Var.b() == d41Var) {
            if (o54Var.f()) {
                mi2Var.setValue(x51Var);
            } else {
                mi2Var.setValue(x51.a);
            }
        } else if (ft2Var.getValue() != d41Var) {
            mi2Var.setValue(((x51) mi2Var.getValue()).a(x51Var));
        }
        return (x51) mi2Var.getValue();
    }
}

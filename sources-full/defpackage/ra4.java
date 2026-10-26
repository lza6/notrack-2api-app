package defpackage;

import android.content.Context;
import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.layout.ContentScale$Companion;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class ra4 {
    public static final long a = wm0.b(0, 0, 5);
    public static final /* synthetic */ int b = 0;

    public static final ym AsyncImageState(Object obj, im1 im1Var, ck0 ck0Var, int i) {
        return new ym(obj, (mm) ((kk0) ck0Var).l(a72.a), im1Var);
    }

    public static final long a(long j) {
        int iR = gb2.R(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) gb2.R(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iR) << 32);
    }

    public static void b(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + fq2.n("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }

    public static final xm previewHandler(ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        if (!((Boolean) kk0Var.l(InspectionModeKt.getLocalInspectionMode())).booleanValue()) {
            kk0Var.a0(2019129125);
            kk0Var.r(false);
            return null;
        }
        kk0Var.a0(2019071620);
        xm xmVar = (xm) kk0Var.l(c72.a);
        kk0Var.r(false);
        return xmVar;
    }

    private static final gi3 rememberSizeResolver(sn0 sn0Var, ck0 ck0Var, int i) {
        Object obj;
        Object obj2;
        boolean zN = kr1.n(sn0Var, ContentScale$Companion.getNone());
        kk0 kk0Var = (kk0) ck0Var;
        boolean zI = kk0Var.i(zN);
        Object objP = kk0Var.P();
        if (zI || objP == Composer$Companion.getEmpty()) {
            if (zN) {
                obj = gi3.e;
            } else {
                ym0 ym0Var = new ym0();
                ym0Var.c = a;
                ym0Var.d = new ArrayList();
                obj = ym0Var;
            }
            Object obj3 = obj;
            kk0Var.l0(obj3);
            obj2 = obj3;
        }
        obj2 = objP;
        return (gi3) obj2;
    }

    public static final pm1 requestOf(Object obj, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(1319639034);
        if (obj instanceof pm1) {
            kk0Var.a0(1530922508);
            pm1 pm1Var = (pm1) obj;
            kk0Var.r(false);
            kk0Var.r(false);
            return pm1Var;
        }
        kk0Var.a0(1530961754);
        Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zH = kk0Var.h(context) | kk0Var.h(obj);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            mm1 mm1Var = new mm1(context);
            mm1Var.c = obj;
            objP = mm1Var.a();
            kk0Var.l0(objP);
        }
        pm1 pm1Var2 = (pm1) objP;
        kk0Var.r(false);
        kk0Var.r(false);
        return pm1Var2;
    }

    public static final pm1 requestOfWithSizeResolver(Object obj, sn0 sn0Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        kk0Var.a0(-329318062);
        if (!(obj instanceof pm1)) {
            kk0Var.a0(-1008549326);
            Context context = (Context) kk0Var.l(AndroidCompositionLocals_androidKt.getLocalContext());
            gi3 gi3VarRememberSizeResolver = rememberSizeResolver(sn0Var, kk0Var, (i >> 3) & 14);
            boolean zH = kk0Var.h(context) | kk0Var.h(obj) | kk0Var.h(gi3VarRememberSizeResolver);
            Object objP = kk0Var.P();
            if (zH || objP == Composer$Companion.getEmpty()) {
                mm1 mm1Var = new mm1(context);
                mm1Var.c = obj;
                mm1Var.n = gi3VarRememberSizeResolver;
                objP = mm1Var.a();
                kk0Var.l0(objP);
            }
            pm1 pm1Var = (pm1) objP;
            kk0Var.r(false);
            kk0Var.r(false);
            return pm1Var;
        }
        kk0Var.a0(-1008895720);
        pm1 pm1Var2 = (pm1) obj;
        if (pm1Var2.u.g != null) {
            kk0Var.a0(-1008855668);
            kk0Var.r(false);
            kk0Var.r(false);
            kk0Var.r(false);
            return pm1Var2;
        }
        kk0Var.a0(-1008807494);
        gi3 gi3VarRememberSizeResolver2 = rememberSizeResolver(sn0Var, kk0Var, (i >> 3) & 14);
        boolean zH2 = kk0Var.h(pm1Var2) | kk0Var.h(gi3VarRememberSizeResolver2);
        Object objP2 = kk0Var.P();
        if (zH2 || objP2 == Composer$Companion.getEmpty()) {
            mm1 mm1VarA = pm1.a(pm1Var2);
            mm1VarA.n = gi3VarRememberSizeResolver2;
            objP2 = mm1VarA.a();
            kk0Var.l0(objP2);
        }
        pm1 pm1Var3 = (pm1) objP2;
        kk0Var.r(false);
        kk0Var.r(false);
        kk0Var.r(false);
        return pm1Var3;
    }
}

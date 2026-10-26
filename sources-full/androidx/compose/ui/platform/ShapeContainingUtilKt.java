package androidx.compose.ui.platform;

import android.graphics.Path;
import android.graphics.RectF;
import defpackage.h43;
import defpackage.ic;
import defpackage.kc;
import defpackage.lt2;
import defpackage.nt2;
import defpackage.oq2;
import defpackage.pq2;
import defpackage.qq2;
import defpackage.rq2;
import defpackage.u41;
import defpackage.x73;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeContainingUtilKt {
    private static final boolean cornersFit(x73 x73Var) {
        long j = x73Var.e;
        long j2 = x73Var.g;
        long j3 = x73Var.h;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long j4 = x73Var.f;
        if (Float.intBitsToFloat((int) (j4 >> 32)) + fIntBitsToFloat > x73Var.b()) {
            return false;
        }
        if (Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j3 >> 32)) > x73Var.b()) {
            return false;
        }
        if (Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat((int) (x73Var.e & 4294967295L)) <= x73Var.a()) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat((int) (j4 & 4294967295L)) <= x73Var.a();
        }
        return false;
    }

    public static final boolean isInOutline(rq2 rq2Var, float f, float f2, nt2 nt2Var, nt2 nt2Var2) {
        if (rq2Var instanceof pq2) {
            return isInRectangle(((pq2) rq2Var).a, f, f2);
        }
        if (rq2Var instanceof qq2) {
            return isInRoundedRect((qq2) rq2Var, f, f2, nt2Var, nt2Var2);
        }
        if (rq2Var instanceof oq2) {
            return isInPath(((oq2) rq2Var).a, f, f2, nt2Var, nt2Var2);
        }
        u41.e();
        return false;
    }

    public static /* synthetic */ boolean isInOutline$default(rq2 rq2Var, float f, float f2, nt2 nt2Var, nt2 nt2Var2, int i, Object obj) {
        if ((i & 8) != 0) {
            nt2Var = null;
        }
        if ((i & 16) != 0) {
            nt2Var2 = null;
        }
        return isInOutline(rq2Var, f, f2, nt2Var, nt2Var2);
    }

    private static final boolean isInPath(nt2 nt2Var, float f, float f2, nt2 nt2Var2, nt2 nt2Var3) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        if (nt2Var2 == null) {
            nt2Var2 = kc.a();
        }
        ic icVar = (ic) nt2Var2;
        if (Float.isNaN(f3) || Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6)) {
            kc.c("Invalid rectangle, make sure no value is NaN");
        }
        if (icVar.b == null) {
            icVar.b = new RectF();
        }
        RectF rectF = icVar.b;
        rectF.getClass();
        rectF.set(f3, f4, f5, f6);
        Path path = icVar.a;
        RectF rectF2 = icVar.b;
        rectF2.getClass();
        path.addRect(rectF2, kc.b(lt2.c));
        if (nt2Var3 == null) {
            nt2Var3 = kc.a();
        }
        ic icVar2 = (ic) nt2Var3;
        icVar2.d(nt2Var, nt2Var2, 1);
        boolean zIsEmpty = icVar2.a.isEmpty();
        icVar2.e();
        ((ic) nt2Var2).e();
        return !zIsEmpty;
    }

    private static final boolean isInRectangle(h43 h43Var, float f, float f2) {
        return h43Var.a <= f && f < h43Var.c && h43Var.b <= f2 && f2 < h43Var.d;
    }

    private static final boolean isInRoundedRect(qq2 qq2Var, float f, float f2, nt2 nt2Var, nt2 nt2Var2) {
        x73 x73Var = qq2Var.a;
        float f3 = x73Var.a;
        long j = x73Var.h;
        long j2 = x73Var.g;
        long j3 = x73Var.f;
        long j4 = x73Var.e;
        float f4 = x73Var.d;
        float f5 = x73Var.b;
        float f6 = x73Var.c;
        if (f < f3 || f >= f6 || f2 < f5 || f2 >= f4) {
            return false;
        }
        if (!cornersFit(x73Var)) {
            nt2 nt2VarA = nt2Var2 == null ? kc.a() : nt2Var2;
            nt2.b(nt2VarA, x73Var);
            return isInPath(nt2VarA, f, f2, nt2Var, nt2Var2);
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32)) + f3;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L)) + f5;
        float fIntBitsToFloat3 = f6 - Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) + f5;
        float fIntBitsToFloat5 = f6 - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat6 = f4 - Float.intBitsToFloat((int) (j2 & 4294967295L));
        float fIntBitsToFloat7 = f4 - Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (j >> 32)) + f3;
        if (f < fIntBitsToFloat && f2 < fIntBitsToFloat2) {
            return m125x5e132d35(f, f2, x73Var.e, fIntBitsToFloat, fIntBitsToFloat2);
        }
        if (f < fIntBitsToFloat8 && f2 > fIntBitsToFloat7) {
            return m125x5e132d35(f, f2, x73Var.h, fIntBitsToFloat8, fIntBitsToFloat7);
        }
        if (f > fIntBitsToFloat3 && f2 < fIntBitsToFloat4) {
            return m125x5e132d35(f, f2, x73Var.f, fIntBitsToFloat3, fIntBitsToFloat4);
        }
        if (f <= fIntBitsToFloat5 || f2 <= fIntBitsToFloat6) {
            return true;
        }
        return m125x5e132d35(f, f2, x73Var.g, fIntBitsToFloat5, fIntBitsToFloat6);
    }

    /* JADX INFO: renamed from: isWithinEllipse-VE1yxkc, reason: not valid java name */
    private static final boolean m125x5e132d35(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return ((f6 * f6) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f5 * f5) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }
}

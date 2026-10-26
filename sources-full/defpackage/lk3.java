package defpackage;

import androidx.compose.runtime.Composer$Companion;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk3 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(pb3 pb3Var, float f, xf xfVar, zr0 zr0Var, le1 le1Var, uo0 uo0Var) {
        ik3 ik3Var;
        float f2;
        n43 n43Var;
        if (uo0Var instanceof ik3) {
            ik3Var = (ik3) uo0Var;
            int i = ik3Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                ik3Var.m = i - Integer.MIN_VALUE;
            } else {
                ik3Var = new ik3(uo0Var);
            }
        } else {
            ik3Var = new ik3(uo0Var);
        }
        Object obj = ik3Var.l;
        int i2 = ik3Var.m;
        if (i2 == 0) {
            g13.O(obj);
            n43 n43Var2 = new n43();
            boolean z = ((Number) xfVar.b()).floatValue() == 0.0f;
            jk3 jk3Var = new jk3(f, n43Var2, pb3Var, le1Var, 0);
            ik3Var.d = xfVar;
            ik3Var.h = n43Var2;
            ik3Var.c = f;
            ik3Var.m = 1;
            Object objP = vl0.p(xfVar, zr0Var, !z, jk3Var, ik3Var);
            hq0 hq0Var = hq0.c;
            if (objP == hq0Var) {
                return hq0Var;
            }
            f2 = f;
            n43Var = n43Var2;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = ik3Var.c;
            n43Var = ik3Var.h;
            xfVar = ik3Var.d;
            g13.O(obj);
        }
        return new tf(new Float(f2 - n43Var.c), xfVar);
    }

    public static final void b(vf vfVar, pb3 pb3Var, le1 le1Var, float f) {
        float fA;
        try {
            fA = pb3Var.a(f);
        } catch (CancellationException unused) {
            vfVar.a();
            fA = 0.0f;
        }
        le1Var.invoke(Float.valueOf(fA));
        if (Math.abs(f - fA) > 0.5f) {
            vfVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object c(pb3 pb3Var, float f, float f2, xf xfVar, tm3 tm3Var, le1 le1Var, uo0 uo0Var) {
        kk3 kk3Var;
        float fFloatValue;
        xf xfVar2;
        n43 n43Var;
        float f3 = f;
        if (uo0Var instanceof kk3) {
            kk3Var = (kk3) uo0Var;
            int i = kk3Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                kk3Var.n = i - Integer.MIN_VALUE;
            } else {
                kk3Var = new kk3(uo0Var);
            }
        } else {
            kk3Var = new kk3(uo0Var);
        }
        kk3 kk3Var2 = kk3Var;
        Object obj = kk3Var2.m;
        int i2 = kk3Var2.n;
        if (i2 == 0) {
            g13.O(obj);
            n43 n43Var2 = new n43();
            fFloatValue = ((Number) xfVar.b()).floatValue();
            Float f4 = new Float(f3);
            boolean z = ((Number) xfVar.b()).floatValue() == 0.0f;
            jk3 jk3Var = new jk3(f2, n43Var2, pb3Var, le1Var, 1);
            kk3Var2.h = xfVar;
            kk3Var2.l = n43Var2;
            kk3Var2.c = f3;
            kk3Var2.d = fFloatValue;
            kk3Var2.n = 1;
            Object objQ = vl0.q(xfVar, f4, tm3Var, !z, jk3Var, kk3Var2);
            hq0 hq0Var = hq0.c;
            if (objQ == hq0Var) {
                return hq0Var;
            }
            xfVar2 = xfVar;
            n43Var = n43Var2;
        } else {
            if (i2 != 1) {
                u41.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f5 = kk3Var2.d;
            float f6 = kk3Var2.c;
            n43Var = kk3Var2.l;
            xfVar2 = kk3Var2.h;
            g13.O(obj);
            fFloatValue = f5;
            f3 = f6;
        }
        return new tf(new Float(f3 - n43Var.c), av1.k(xfVar2, 0.0f, d(((Number) xfVar2.b()).floatValue(), fFloatValue), 29));
    }

    public static final float d(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final rs3 rememberSnapFlingBehavior(mk3 mk3Var, ck0 ck0Var, int i) {
        kk0 kk0Var = (kk0) ck0Var;
        wu0 wu0Var = (wu0) kk0Var.l(CompositionLocalsKt.getLocalDensity());
        zr0 zr0VarRememberSplineBasedDecay = rm3.rememberSplineBasedDecay(kk0Var, 0);
        boolean zH = kk0Var.h(zr0VarRememberSplineBasedDecay) | ((((i & 14) ^ 6) > 4 && kk0Var.h(mk3Var)) || (i & 6) == 4) | kk0Var.h(wu0Var);
        Object objP = kk0Var.P();
        if (zH || objP == Composer$Companion.getEmpty()) {
            objP = new hk3(mk3Var, zr0VarRememberSplineBasedDecay, kr1.l0(5, null));
            kk0Var.l0(objP);
        }
        return (rs3) objP;
    }
}

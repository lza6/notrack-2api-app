package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.dx1;
import defpackage.f01;
import defpackage.fs2;
import defpackage.hs2;
import defpackage.is2;
import defpackage.kj2;
import defpackage.lb4;
import defpackage.le1;
import defpackage.mn2;
import defpackage.pj2;
import defpackage.um0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static is2 a(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new is2(f, f2, f, f2);
    }

    public static final is2 b(float f, float f2, float f3, float f4) {
        return new is2(f, f2, f3, f4);
    }

    public static is2 c(float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        float f4 = (i & 2) != 0 ? 0.0f : 4.0f;
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            f3 = 0.0f;
        }
        return new is2(f, f4, f2, f3);
    }

    public static androidx.compose.ui.c d(androidx.compose.ui.c cVar) {
        return cVar.then(new AspectRatioElement(InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(1, 15) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final float e(hs2 hs2Var, dx1 dx1Var) {
        return dx1Var == dx1.c ? hs2Var.b(dx1Var) : hs2Var.a(dx1Var);
    }

    public static final float f(hs2 hs2Var, dx1 dx1Var) {
        return dx1Var == dx1.c ? hs2Var.a(dx1Var) : hs2Var.b(dx1Var);
    }

    public static final boolean g(int i, int i2, long j) {
        int iJ = um0.j(j);
        if (i > um0.h(j) || iJ > i) {
            return false;
        }
        return i2 <= um0.g(j) && um0.i(j) <= i2;
    }

    public static final androidx.compose.ui.c h(androidx.compose.ui.c cVar, le1 le1Var) {
        return cVar.then(new OffsetPxElement(le1Var, new f01(le1Var, 6)));
    }

    public static final androidx.compose.ui.c i(androidx.compose.ui.c cVar, float f, float f2) {
        return cVar.then(new OffsetElement(f, f2, new mn2(f, f2, 0)));
    }

    public static final androidx.compose.ui.c j(androidx.compose.ui.c cVar, hs2 hs2Var) {
        return cVar.then(new PaddingValuesElement(hs2Var, new pj2(4, hs2Var)));
    }

    public static final androidx.compose.ui.c k(androidx.compose.ui.c cVar, float f) {
        return cVar.then(new PaddingElement(f, f, f, f, new kj2(f, 1)));
    }

    public static final androidx.compose.ui.c l(androidx.compose.ui.c cVar, float f, float f2) {
        return cVar.then(new PaddingElement(f, f2, f, f2, new mn2(f, f2, 1)));
    }

    public static androidx.compose.ui.c m(androidx.compose.ui.c cVar, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return l(cVar, f, f2);
    }

    public static final androidx.compose.ui.c n(androidx.compose.ui.c cVar, float f, float f2, float f3, float f4) {
        return cVar.then(new PaddingElement(f, f2, f3, f4, new fs2(f, f2, f3, f4, 0)));
    }

    public static androidx.compose.ui.c o(androidx.compose.ui.c cVar, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return n(cVar, f, f2, f3, f4);
    }

    public static final androidx.compose.ui.c p(androidx.compose.ui.c cVar) {
        return cVar.then(new IntrinsicWidthElement(InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(1, 23) : InspectableValueKt.getNoInspectorInfo()));
    }
}

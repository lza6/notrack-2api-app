package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.Modifier$Companion;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.ea;
import defpackage.fs2;
import defpackage.fw0;
import defpackage.kj2;
import defpackage.kr1;
import defpackage.lb4;
import defpackage.le1;
import defpackage.mn2;
import defpackage.wt;
import defpackage.xt;
import defpackage.yt;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final FillElement a;
    public static final FillElement b;
    public static final FillElement c;
    public static final WrapContentElement d;
    public static final WrapContentElement e;
    public static final WrapContentElement f;
    public static final WrapContentElement g;
    public static final WrapContentElement h;
    public static final WrapContentElement i;

    static {
        fw0 fw0Var = fw0.d;
        a = new FillElement(fw0Var, "fillMaxWidth");
        fw0 fw0Var2 = fw0.c;
        b = new FillElement(fw0Var2, "fillMaxHeight");
        fw0 fw0Var3 = fw0.h;
        c = new FillElement(fw0Var3, "fillMaxSize");
        int i2 = WrapContentElement.m;
        wt centerHorizontally = Alignment$Companion.getCenterHorizontally();
        int i3 = 19;
        d = new WrapContentElement(fw0Var, new ea(i3, centerHorizontally), centerHorizontally, "wrapContentWidth");
        wt start = Alignment$Companion.getStart();
        e = new WrapContentElement(fw0Var, new ea(i3, start), start, "wrapContentWidth");
        xt centerVertically = Alignment$Companion.getCenterVertically();
        int i4 = 17;
        f = new WrapContentElement(fw0Var2, new ea(i4, centerVertically), centerVertically, "wrapContentHeight");
        xt top = Alignment$Companion.getTop();
        g = new WrapContentElement(fw0Var2, new ea(i4, top), top, "wrapContentHeight");
        yt center = Alignment$Companion.getCenter();
        int i5 = 18;
        h = new WrapContentElement(fw0Var3, new ea(i5, center), center, "wrapContentSize");
        yt topStart = Alignment$Companion.getTopStart();
        i = new WrapContentElement(fw0Var3, new ea(i5, topStart), topStart, "wrapContentSize");
    }

    public static final androidx.compose.ui.c a(androidx.compose.ui.c cVar, float f2, float f3) {
        return cVar.then(new UnspecifiedConstraintsElement(f2, f3));
    }

    public static /* synthetic */ androidx.compose.ui.c b(Modifier$Companion modifier$Companion, float f2, int i2) {
        float f3 = (i2 & 1) != 0 ? Float.NaN : 24.0f;
        if ((i2 & 2) != 0) {
            f2 = Float.NaN;
        }
        return a(modifier$Companion, f3, f2);
    }

    public static androidx.compose.ui.c c(androidx.compose.ui.c cVar) {
        return cVar.then(a);
    }

    public static final androidx.compose.ui.c d(androidx.compose.ui.c cVar, float f2) {
        return cVar.then(new SizeElement(0.0f, f2, 0.0f, f2, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj2(f2, 2) : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    public static final androidx.compose.ui.c e(androidx.compose.ui.c cVar, float f2, float f3) {
        return cVar.then(new SizeElement(0.0f, f2, 0.0f, f3, InspectableValueKt.isDebugInspectorInfoEnabled() ? new mn2(f2, f3, 2) : InspectableValueKt.getNoInspectorInfo(), 5));
    }

    public static /* synthetic */ androidx.compose.ui.c f(androidx.compose.ui.c cVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return e(cVar, f2, f3);
    }

    public static final androidx.compose.ui.c g(androidx.compose.ui.c cVar) {
        return cVar.then(new SizeElement(20.0f, 20.0f, 20.0f, 20.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(1, 25) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final androidx.compose.ui.c h(androidx.compose.ui.c cVar) {
        return cVar.then(new SizeElement(52.0f, 32.0f, 52.0f, 32.0f, false, InspectableValueKt.isDebugInspectorInfoEnabled() ? new lb4(1, 26) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static androidx.compose.ui.c i(androidx.compose.ui.c cVar, float f2, float f3, float f4, float f5, int i2) {
        float f6;
        le1 noInspectorInfo;
        float f7 = (i2 & 2) != 0 ? Float.NaN : f3;
        float f8 = (i2 & 4) != 0 ? Float.NaN : f4;
        float f9 = (i2 & 8) != 0 ? Float.NaN : f5;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            f6 = f2;
            noInspectorInfo = new fs2(f6, f7, f8, f9, 1);
        } else {
            f6 = f2;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return cVar.then(new SizeElement(f6, f7, f8, f9, false, noInspectorInfo));
    }

    public static final androidx.compose.ui.c j(androidx.compose.ui.c cVar, float f2) {
        return cVar.then(new SizeElement(f2, f2, f2, f2, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj2(f2, 3) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final androidx.compose.ui.c k(androidx.compose.ui.c cVar, float f2, float f3) {
        return cVar.then(new SizeElement(f2, f3, f2, f3, true, InspectableValueKt.isDebugInspectorInfoEnabled() ? new mn2(f2, f3, 3) : InspectableValueKt.getNoInspectorInfo()));
    }

    public static final androidx.compose.ui.c l(androidx.compose.ui.c cVar, float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        le1 noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            f7 = f3;
            f9 = f5;
            noInspectorInfo = new fs2(f2, f7, f4, f9, 2);
            f6 = f2;
            f8 = f4;
        } else {
            f6 = f2;
            f7 = f3;
            f8 = f4;
            f9 = f5;
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return cVar.then(new SizeElement(f6, f7, f8, f9, true, noInspectorInfo));
    }

    public static final androidx.compose.ui.c n(androidx.compose.ui.c cVar, float f2) {
        return cVar.then(new SizeElement(f2, 0.0f, f2, 0.0f, InspectableValueKt.isDebugInspectorInfoEnabled() ? new kj2(f2, 4) : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    public static androidx.compose.ui.c o(androidx.compose.ui.c cVar, float f2, int i2) {
        float f3 = (i2 & 1) != 0 ? Float.NaN : 16.0f;
        float f4 = (i2 & 2) != 0 ? Float.NaN : f2;
        return cVar.then(new SizeElement(f3, 0.0f, f4, 0.0f, InspectableValueKt.isDebugInspectorInfoEnabled() ? new mn2(f3, f4, 4) : InspectableValueKt.getNoInspectorInfo(), 10));
    }

    public static androidx.compose.ui.c p(androidx.compose.ui.c cVar) {
        WrapContentElement wrapContentElement;
        xt centerVertically = Alignment$Companion.getCenterVertically();
        if (kr1.n(centerVertically, Alignment$Companion.getCenterVertically())) {
            wrapContentElement = f;
        } else if (kr1.n(centerVertically, Alignment$Companion.getTop())) {
            wrapContentElement = g;
        } else {
            wrapContentElement = new WrapContentElement(fw0.c, new ea(17, centerVertically), centerVertically, "wrapContentHeight");
        }
        return cVar.then(wrapContentElement);
    }

    public static androidx.compose.ui.c q(androidx.compose.ui.c cVar, yt ytVar) {
        WrapContentElement wrapContentElement;
        if (ytVar.equals(Alignment$Companion.getCenter())) {
            wrapContentElement = h;
        } else if (ytVar.equals(Alignment$Companion.getTopStart())) {
            wrapContentElement = i;
        } else {
            wrapContentElement = new WrapContentElement(fw0.h, new ea(18, ytVar), ytVar, "wrapContentSize");
        }
        return cVar.then(wrapContentElement);
    }

    public static androidx.compose.ui.c r(androidx.compose.ui.c cVar) {
        WrapContentElement wrapContentElement;
        wt centerHorizontally = Alignment$Companion.getCenterHorizontally();
        if (kr1.n(centerHorizontally, Alignment$Companion.getCenterHorizontally())) {
            wrapContentElement = d;
        } else if (kr1.n(centerHorizontally, Alignment$Companion.getStart())) {
            wrapContentElement = e;
        } else {
            wrapContentElement = new WrapContentElement(fw0.d, new ea(19, centerHorizontally), centerHorizontally, "wrapContentWidth");
        }
        return cVar.then(wrapContentElement);
    }
}

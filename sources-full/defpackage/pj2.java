package defpackage;

import android.content.ClipDescription;
import androidx.compose.foundation.layout.e;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class pj2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj2(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj2(ne1 ne1Var) {
        super(1);
        this.c = 19;
        x64 x64Var = mb4.a;
        this.d = ne1Var;
    }

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        h43 h43VarW0;
        Object objJ = null;
        boolean z = true;
        int iR = 0;
        switch (this.c) {
            case 0:
                wu0 wu0Var = (wu0) obj;
                h01 h01Var = (h01) this.d;
                float f = ((bt2) h01Var.a.j).f();
                if (!Float.isNaN(f)) {
                    iR = gb2.R(f);
                } else if (!h01Var.c()) {
                    iR = -wu0Var.O(360.0f);
                }
                return new iq1(((long) iR) << 32);
            case 1:
                gz0 gz0Var = (gz0) obj;
                i01 i01Var = i01.c;
                ah2 ah2Var = (ah2) this.d;
                t64 t64Var = uj2.a;
                gz0Var.a(i01Var, ((bt2) ah2Var).f());
                gz0Var.a(i01.d, 0.0f);
                return w84.a;
            case 2:
                return obj == ((dn2) this.d) ? "(this)" : String.valueOf(obj);
            case 3:
                return obj == ((wh2) this.d) ? "(this)" : String.valueOf(obj);
            case 4:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("padding");
                inspectorInfo.getProperties().set("paddingValues", (hs2) this.d);
                return w84.a;
            case 5:
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                d43 d43Var = (d43) this.d;
                synchronized (d43Var.b) {
                    try {
                        gs1 gs1Var = d43Var.c;
                        if (gs1Var != null) {
                            jn3 jn3Var = d43Var.t;
                            z33 z33Var = z33.d;
                            jn3Var.getClass();
                            jn3Var.p(null, z33Var);
                            jn3 jn3Var2 = d43.x;
                            gs1Var.c(cancellationException);
                            d43Var.q = null;
                            gs1Var.A(new sg2(d43Var, 3, th));
                        } else {
                            d43Var.d = cancellationException;
                            jn3 jn3Var3 = d43Var.t;
                            z33 z33Var2 = z33.c;
                            jn3Var3.getClass();
                            jn3Var3.p(null, z33Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return w84.a;
            case 6:
                ((tk0) this.d).c(obj);
                return w84.a;
            case 7:
                ((f43) this.d).a((n11) obj);
                return w84.a;
            case 8:
                mi2 mi2Var = (mi2) obj;
                if (!(mi2Var instanceof zk3)) {
                    u41.k("Failed requirement.");
                    return null;
                }
                if (mi2Var.getValue() != null) {
                    x93 x93Var = (x93) this.d;
                    Object value = mi2Var.getValue();
                    value.getClass();
                    objJ = x93Var.j(value);
                }
                bl3 bl3VarA = ((zk3) mi2Var).a();
                bl3VarA.getClass();
                return new ft2(objJ, bl3VarA);
            case 9:
                g93 g93Var = ((d93) this.d).c;
                return Boolean.valueOf(g93Var != null ? g93Var.canBeSaved(obj) : true);
            case 10:
                float fFloatValue = ((Number) obj).floatValue();
                rb3 rb3Var = (rb3) this.d;
                ct2 ct2Var = rb3Var.a;
                float f2 = ct2Var.f() + fFloatValue + rb3Var.e;
                float fW = py.w(f2, 0.0f, rb3Var.d.f());
                z = f2 == fW;
                float f3 = fW - ct2Var.f();
                int iRound = Math.round(f3);
                ct2Var.h(ct2Var.f() + iRound);
                rb3Var.e = f3 - iRound;
                if (!z) {
                    fFloatValue = f3;
                }
                return Float.valueOf(fFloatValue);
            case 11:
                jn0 jn0Var = ((fc3) this.d).z;
                jn0Var.m = (cx1) obj;
                if (jn0Var.o && (h43VarW0 = jn0Var.w0()) != null && !jn0Var.x0(jn0Var.p, h43VarW0)) {
                    jn0Var.n = true;
                    jn0Var.y0();
                }
                jn0Var.o = false;
                return w84.a;
            case 12:
                long j = ((ln2) obj).a;
                oc3 oc3Var = (oc3) this.d;
                return new ln2(oc3.a(oc3Var, oc3Var.j, j, oc3Var.i));
            case 13:
                ef3.j((gf3) obj, ((n73) this.d).a);
                return w84.a;
            case 14:
                ((List) obj).add((Float) ((i12) this.d).invoke());
                return true;
            case 15:
                n63 n63Var = (n63) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.d;
                n63Var.j(n63Var.w.getDensity() * 3.0f);
                n63Var.m(shadowGraphicsLayerElement.c);
                n63Var.d(shadowGraphicsLayerElement.d);
                n63Var.c(shadowGraphicsLayerElement.h);
                n63Var.n(shadowGraphicsLayerElement.l);
                return w84.a;
            case 16:
                ((Number) obj).floatValue();
                return Float.valueOf(((wu0) this.d).w(56.0f));
            case 17:
                n63 n63Var2 = (n63) obj;
                qh3 qh3Var = (qh3) this.d;
                n63Var2.g(qh3Var.c);
                n63Var2.i(qh3Var.d);
                n63Var2.a(qh3Var.h);
                n63Var2.j(qh3Var.l);
                n63Var2.e(qh3Var.m);
                float f4 = qh3Var.n;
                if (n63Var2.q != f4) {
                    n63Var2.c |= 2048;
                    n63Var2.q = f4;
                }
                n63Var2.o(qh3Var.o);
                n63Var2.m(qh3Var.p);
                n63Var2.d(qh3Var.q);
                n63Var2.c(qh3Var.r);
                n63Var2.n(qh3Var.s);
                if (n63Var2.u != 0) {
                    n63Var2.c |= 32768;
                    n63Var2.u = 0;
                }
                return w84.a;
            case 18:
                ol3 ol3Var = (ol3) this.d;
                synchronized (ol3Var.g) {
                    nl3 nl3Var = ol3Var.i;
                    nl3Var.getClass();
                    Object obj2 = nl3Var.b;
                    obj2.getClass();
                    int i = nl3Var.d;
                    rh2 rh2Var = nl3Var.c;
                    if (rh2Var == null) {
                        rh2Var = new rh2();
                        nl3Var.c = rh2Var;
                        nl3Var.f.l(obj2, rh2Var);
                    }
                    nl3Var.c(obj, i, obj2, rh2Var);
                }
                return w84.a;
            case 19:
                vf vfVar = (vf) obj;
                ne1 ne1Var = (ne1) this.d;
                Object value2 = vfVar.e.getValue();
                x64 x64Var = mb4.a;
                ne1Var.invoke(value2, Float.valueOf(((yf) vfVar.f).a));
                return w84.a;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                Throwable th3 = (Throwable) obj;
                rq3 rq3Var = (rq3) this.d;
                t00 t00Var = rq3Var.h;
                if (t00Var != null) {
                    t00Var.g(th3);
                }
                rq3Var.h = null;
                return w84.a;
            case 21:
                return (gg) ((au3) this.d).c.get(((Number) obj).intValue());
            case 22:
                float[] fArr = ((ob2) obj).a;
                cx1 cx1Var = (cx1) this.d;
                if (cx1Var.z()) {
                    y64.u(cx1Var).F(cx1Var, fArr);
                }
                return w84.a;
            case 23:
                ClipDescription clipDescription = ((wx0) obj).a.getClipDescription();
                Iterable<bc2> iterable = (Iterable) ((hu3) this.d).invoke();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    z = false;
                } else {
                    for (bc2 bc2Var : iterable) {
                        if (kr1.n(bc2Var, bc2.c) || clipDescription.hasMimeType(bc2Var.a)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 24:
                float fFloatValue2 = ((Number) obj).floatValue();
                rw3 rw3Var = (rw3) this.d;
                bt2 bt2Var = rw3Var.a;
                float f5 = bt2Var.f() + fFloatValue2;
                bt2 bt2Var2 = rw3Var.b;
                if (f5 > bt2Var2.f()) {
                    fFloatValue2 = bt2Var2.f() - bt2Var.f();
                } else if (f5 < 0.0f) {
                    fFloatValue2 = -bt2Var.f();
                }
                bt2Var.h(bt2Var.f() + fFloatValue2);
                return Float.valueOf(fFloatValue2);
            case 25:
                return new g4(12, (pk0) this.d);
            default:
                InspectorInfo inspectorInfo2 = (InspectorInfo) obj;
                inspectorInfo2.setName("windowInsetsPadding");
                inspectorInfo2.getProperties().set("insets", (e) this.d);
                return w84.a;
        }
    }
}

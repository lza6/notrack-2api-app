package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.view.InputDevice;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.text.input.internal.c;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class sg2 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg2(Object obj, int i, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sg2(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.c = i;
        this.d = obj2;
        this.h = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [so0] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        em3 em3VarC;
        em3 em3VarC2;
        dz3 dz3VarA;
        em3 em3Var;
        dz3 dz3VarA2;
        em3 em3Var2;
        dz3 dz3VarA3;
        em3 em3Var3;
        xy3 xy3Var;
        ic icVarI;
        int i = 22;
        int i2 = 5;
        int i3 = 6;
        int i4 = 4;
        int i5 = 2;
        boolean zF = false;
        zF = false;
        zF = false;
        zF = false;
        zF = false;
        zF = false;
        em3 em3VarC3 = 0;
        em3VarC3 = 0;
        int i6 = 1;
        switch (this.c) {
            case 0:
                bd3 bd3Var = (bd3) obj;
                tg2.m((lh2) this.d, (fd3) this.h, bd3Var, 0, bd3Var.f.a.a.d.length());
                return w84.a;
            case 1:
                wx1 wx1Var = (wx1) obj;
                long j = ((bi3) ((sa1) this.d).invoke()).a;
                float fD = bi3.d(j);
                if (fD > 0.0f) {
                    int i7 = ir2.b;
                    float fW = wx1Var.w(4.0f);
                    a10 a10Var = wx1Var.c;
                    float fW2 = wx1Var.w(((hs2) this.h).a(wx1Var.getLayoutDirection())) - fW;
                    float fD2 = (fW * 2.0f) + fD + fW2;
                    dx1 layoutDirection = wx1Var.getLayoutDirection();
                    int[] iArr = hr2.a;
                    float fD3 = iArr[layoutDirection.ordinal()] == 1 ? bi3.d(a10Var.b()) - fD2 : fW2 < 0.0f ? 0.0f : fW2;
                    if (iArr[wx1Var.getLayoutDirection().ordinal()] == 1) {
                        fD2 = bi3.d(a10Var.b()) - (fW2 >= 0.0f ? fW2 : 0.0f);
                    }
                    float f = fD2;
                    float fB = bi3.b(j);
                    float f2 = (-fB) / 2.0f;
                    float f3 = fB / 2.0f;
                    ci4 ci4Var = a10Var.d;
                    long jC = ci4Var.C();
                    ci4Var.y().l();
                    try {
                        ((jb) ci4Var.d).u(fD3, f2, f, f3, 0);
                        wx1Var.a();
                    } finally {
                        fq2.x(ci4Var, jC);
                    }
                } else {
                    wx1Var.a();
                }
                return w84.a;
            case 2:
                MotionEvent motionEvent = (MotionEvent) obj;
                lx2 lx2Var = (lx2) this.h;
                if (motionEvent.getActionMasked() == 0) {
                    ci4 ci4Var2 = (ci4) this.d;
                    ge geVar = lx2Var.c;
                    if (geVar == null) {
                        kr1.n0("onTouchEvent");
                        throw null;
                    }
                    ci4Var2.h = ((Boolean) geVar.invoke(motionEvent)).booleanValue() ? jx2.d : jx2.h;
                } else {
                    ge geVar2 = lx2Var.c;
                    if (geVar2 == null) {
                        kr1.n0("onTouchEvent");
                        throw null;
                    }
                    geVar2.invoke(motionEvent);
                }
                return w84.a;
            case 3:
                Throwable th = (Throwable) obj;
                d43 d43Var = (d43) this.d;
                Object obj2 = d43Var.b;
                Throwable th2 = (Throwable) this.h;
                synchronized (obj2) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th != null) {
                        try {
                            if (th instanceof CancellationException) {
                                th = null;
                            }
                            if (th != null) {
                                gb2.l(th2, th);
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    d43Var.d = th2;
                    jn3 jn3Var = d43Var.t;
                    z33 z33Var = z33.c;
                    jn3Var.getClass();
                    jn3Var.p(null, z33Var);
                }
                return w84.a;
            case 4:
                ((tk0) this.d).y(obj);
                gi2 gi2Var = (gi2) this.h;
                if (gi2Var != null) {
                    gi2Var.a(obj);
                }
                return w84.a;
            case 5:
                ((qi2) this.d).b.setValue(new g51((e) this.h, (e) obj));
                return w84.a;
            case 6:
                mc3 mc3Var = (mc3) this.d;
                oc3 oc3Var = (oc3) this.h;
                long j2 = ((cy0) obj).a;
                long jA = oc3Var.d == nq2.d ? ln2.a(0.0f, 1, j2) : ln2.a(0.0f, 2, j2);
                oc3 oc3Var2 = mc3Var.a;
                oc3Var2.i = 1;
                pr2 pr2Var = oc3Var2.b;
                if (pr2Var == null || !(oc3Var2.a.c() || oc3Var2.a.a())) {
                    oc3.a(oc3Var2, oc3Var2.j, jA, 1);
                } else {
                    pr2Var.a(jA, oc3Var2.i, oc3Var2.l);
                }
                return w84.a;
            case 7:
                py.F((gq0) this.d, null, jq0.l, new k((Clipboard) this.h, (hg) obj, em3VarC3, 26), 1);
                return w84.a;
            case 8:
                fd3 fd3Var = (fd3) obj;
                ((le3) this.d).m(fd3Var);
                ((le1) this.h).invoke(fd3Var);
                return w84.a;
            case 9:
                co0 co0Var = (co0) obj;
                ho0 ho0Var = (ho0) this.d;
                st3 st3Var = st3.Copy;
                le3 le3Var = (le3) this.h;
                if (le3Var.h()) {
                    co0.a(co0Var, new mo0(st3Var), new ne3(ho0Var, le3Var, zF ? 1 : 0));
                }
                w84 w84Var = w84.a;
                st3 st3Var2 = st3.SelectAll;
                if (!le3Var.f()) {
                    co0.a(co0Var, new mo0(st3Var2), new ne3(ho0Var, le3Var, i6));
                }
                kr1.U(w84Var, w84Var);
                return w84Var;
            case 10:
                mv2.i((mv2) obj, (nv2) this.d, 0, 0, ((qh3) this.h).t, 4);
                return w84.a;
            case 11:
                float f4 = ln2.f(py.L((dx2) obj, false));
                n23 n23Var = (n23) this.d;
                boolean z = ((l43) this.h).c;
                if (((Boolean) n23Var.n.getValue()).booleanValue()) {
                    f4 = -f4;
                }
                n23Var.e(f4, z);
                return w84.a;
            case 12:
                KeyEvent keyEvent = ((yu1) obj).a;
                pa1 pa1Var = (pa1) this.d;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && !device.isVirtual() && av1.A(keyEvent) == 2 && keyEvent.getSource() != 257) {
                    if (yh4.k(19, keyEvent)) {
                        zF = ((va1) pa1Var).f(5);
                    } else if (yh4.k(20, keyEvent)) {
                        zF = ((va1) pa1Var).f(6);
                    } else if (yh4.k(21, keyEvent)) {
                        zF = ((va1) pa1Var).f(3);
                    } else if (yh4.k(22, keyEvent)) {
                        zF = ((va1) pa1Var).f(4);
                    } else if (yh4.k(23, keyEvent)) {
                        SoftwareKeyboardController softwareKeyboardController = ((z22) this.h).c;
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.show();
                        }
                        zF = true;
                    }
                }
                return Boolean.valueOf(zF);
            case 13:
                kr1.C((tz0) obj, (rq2) this.d, ((su3) this.h).a());
                return w84.a;
            case 14:
                rz rzVar = (rz) obj;
                return rzVar.a(new e8(8, new sg2(((rg3) this.d).l(rzVar.c.b(), rzVar.c.getLayoutDirection(), rzVar), 13, (su3) this.h)));
            case 15:
                return new ho1((mi2) this.d, i5, (gh2) this.h);
            case 16:
                pt3 pt3Var = (pt3) obj;
                ct2 ct2Var = ((r42) this.h).b;
                gg ggVar = (gg) this.d;
                Object obj3 = ggVar.a;
                dz3 dz3VarA4 = ((m42) obj3).a();
                em3 em3Var4 = dz3VarA4 != null ? dz3VarA4.a : null;
                if ((ct2Var.f() & 1) == 0 || (dz3VarA3 = ((m42) obj3).a()) == null) {
                    em3VarC = null;
                } else {
                    em3Var3 = dz3VarA3.b;
                }
                if (em3Var4 != null) {
                    em3VarC = em3Var3;
                    em3VarC = em3Var4.c(em3VarC);
                }
                em3VarC = em3Var3;
                if ((ct2Var.f() & 2) == 0 || (dz3VarA2 = ((m42) obj3).a()) == null) {
                    em3VarC2 = null;
                } else {
                    em3Var2 = dz3VarA2.c;
                }
                if (em3VarC != null) {
                    em3VarC2 = em3Var2;
                    em3VarC2 = em3VarC.c(em3VarC2);
                }
                em3VarC2 = em3Var2;
                if ((ct2Var.f() & 4) != 0 && (dz3VarA = ((m42) obj3).a()) != null) {
                    em3Var = dz3VarA.d;
                }
                if (em3VarC2 != null) {
                    em3VarC3 = em3Var;
                    em3VarC3 = em3VarC2.c(em3VarC3);
                }
                em3VarC3 = em3Var;
                l43 l43Var = new l43();
                hg hgVar = pt3Var.a;
                ie ieVar = new ie(l43Var, ggVar, em3VarC3, i);
                hgVar.getClass();
                fg fgVar = new fg(hgVar);
                ArrayList arrayList = fgVar.h;
                int size = arrayList.size();
                for (int i8 = 0; i8 < size; i8++) {
                    gg ggVar2 = (gg) ieVar.invoke(((eg) arrayList.get(i8)).a(Integer.MIN_VALUE));
                    arrayList.set(i8, new eg(ggVar2.b, ggVar2.c, ggVar2.a, ggVar2.d));
                }
                pt3Var.b = fgVar.d();
                return w84.a;
            case 17:
                n63 n63Var = (n63) obj;
                cz3 cz3Var = (cz3) this.d;
                gg ggVar3 = (gg) this.h;
                if (((Boolean) new et(cz3Var, i5).invoke()).booleanValue() && (xy3Var = (xy3) cz3Var.a.getValue()) != null) {
                    pg2 pg2Var = xy3Var.b;
                    gg ggVarB = cz3.b(ggVar3, xy3Var);
                    if (ggVarB == null) {
                        icVarI = null;
                    } else {
                        int i9 = ggVarB.c;
                        int i10 = ggVarB.b;
                        icVarI = xy3Var.i(i10, i9);
                        h43 h43VarB = xy3Var.b(i10);
                        int i11 = i9 - 1;
                        long jFloatToRawIntBits = ((((long) Float.floatToRawIntBits(pg2Var.d(i10) == pg2Var.d(i11) ? Math.min(xy3Var.b(i11).a, h43VarB.a) : 0.0f)) << 32) | (((long) Float.floatToRawIntBits(h43VarB.b)) & 4294967295L)) ^ (-9223372034707292160L);
                        Matrix matrix = icVarI.d;
                        if (matrix == null) {
                            icVarI.d = new Matrix();
                        } else {
                            matrix.reset();
                        }
                        Matrix matrix2 = icVarI.d;
                        matrix2.getClass();
                        matrix2.setTranslate(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)));
                        Path path = icVarI.a;
                        Matrix matrix3 = icVarI.d;
                        matrix3.getClass();
                        path.transform(matrix3);
                    }
                } else {
                    icVarI = null;
                }
                sk3 sk3Var = icVarI != null ? new sk3(9, icVarI) : null;
                if (sk3Var != null) {
                    n63Var.m(sk3Var);
                    n63Var.d(true);
                }
                return w84.a;
            case 18:
                mv2 mv2Var = (mv2) obj;
                List list = (List) this.d;
                if (list != null) {
                    int size2 = list.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        ps2 ps2Var = (ps2) list.get(i12);
                        mv2.e(mv2Var, (nv2) ps2Var.c, ((iq1) ps2Var.d).a);
                    }
                }
                List list2 = (List) this.h;
                if (list2 != null) {
                    int size3 = list2.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        ps2 ps2Var2 = (ps2) list2.get(i13);
                        nv2 nv2Var = (nv2) ps2Var2.c;
                        je1 je1Var = (je1) ps2Var2.d;
                        mv2.e(mv2Var, nv2Var, je1Var != null ? ((iq1) je1Var.invoke()).a : 0L);
                    }
                }
                return w84.a;
            case 19:
                ((c) this.d).a.f.l((xd) this.h);
                return w84.a;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                py.F((gq0) this.d, null, jq0.l, new u90((o54) this.h, null), 1);
                return new qc(2);
            case 21:
                o54 o54Var = (o54) this.d;
                o54 o54Var2 = (o54) this.h;
                o54Var.j.add(o54Var2);
                return new ho1(o54Var, i4, o54Var2);
            case 22:
                return new ho1((o54) this.d, i2, (k54) this.h);
            case 23:
                o54 o54Var3 = (o54) this.d;
                n54 n54Var = (n54) this.h;
                o54Var3.i.add(n54Var);
                return new ho1(o54Var3, i3, n54Var);
            case 24:
                k74 k74Var = (k74) obj;
                fy2 fy2Var = (fy2) this.d;
                sb3 sb3Var = (sb3) fy2Var.c;
                j74 j74Var = (j74) this.h;
                synchronized (sb3Var) {
                    try {
                        boolean z2 = k74Var.d;
                        t82 t82Var = (t82) fy2Var.d;
                        if (z2) {
                            t82Var.b(j74Var, k74Var);
                        } else {
                            t82Var.c(j74Var);
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return w84.a;
            case 25:
                ((Number) obj).longValue();
                s94 s94Var = (s94) this.d;
                float f5 = s94Var.e;
                s94Var.e = 0.0f;
                ((le1) this.h).invoke(Float.valueOf(f5));
                return w84.a;
            case 26:
                ch4 ch4Var = (ch4) this.d;
                View view = (View) this.h;
                qp1 qp1Var = ch4Var.w;
                if (ch4Var.v == 0) {
                    WeakHashMap weakHashMap = zc4.a;
                    sc4.i(view, qp1Var);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(qp1Var);
                    zc4.j(view, qp1Var);
                }
                ch4Var.v++;
                return new ho1(ch4Var, 7, view);
            case 27:
                Throwable th5 = (Throwable) obj;
                if (th5 instanceof ri4) {
                    ((s62) this.d).c.compareAndSet(-256, ((ri4) th5).c);
                }
                ((m62) this.h).cancel(false);
                return w84.a;
            default:
                mv2 mv2Var2 = (mv2) obj;
                nv2 nv2Var2 = (nv2) this.d;
                float f6 = ((rj4) this.h).c;
                mv2Var2.getClass();
                mv2.a(mv2Var2, nv2Var2);
                nv2Var2.i0(iq1.c(0L, nv2Var2.m), f6, null);
                return w84.a;
        }
    }
}

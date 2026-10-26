package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.CancellationSignal;
import androidx.compose.material3.a;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.InspectorInfo;
import java.util.List;
import java.util.Map;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class e8 extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e8(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(n11 n11Var, fp1 fp1Var) {
        super(1);
        this.c = 15;
        this.d = n11Var;
    }

    /* JADX WARN: Code duplicated, block: B:249:0x0529  */
    /* JADX WARN: Code duplicated, block: B:262:0x057b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v2, types: [nt2] */
    /* JADX WARN: Type inference failed for: r3v16, types: [ic, java.lang.Object, nt2] */
    /* JADX WARN: Type inference failed for: r3v20, types: [ic, nt2] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v4 */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r44v6 */
    /* JADX WARN: Type inference failed for: r44v7 */
    /* JADX WARN: Type inference failed for: r44v8 */
    /* JADX WARN: Type inference failed for: r44v9 */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        jv jvVar;
        int i;
        boolean z;
        ?? r44;
        ?? r45;
        a10 a10Var;
        ci4 ci4Var;
        float f;
        float f2;
        long jC;
        ?? r46;
        String strConcat;
        jz1 jz1Var;
        z12 z12Var;
        int i2 = this.c;
        int i3 = 8;
        jz1 jz1Var2 = null;
        z12 z12Var2 = null;
        float f3 = 0.0f;
        w84 w84Var = w84.a;
        Object obj2 = this.d;
        switch (i2) {
            case 0:
                f8 f8Var = (f8) obj;
                vx1 vx1Var = (vx1) obj2;
                if (f8Var.x()) {
                    if (f8Var.a().b) {
                        f8Var.q();
                    }
                    for (Map.Entry entry : f8Var.a().i.entrySet()) {
                        vx1.a(vx1Var, (ti1) entry.getKey(), ((Number) entry.getValue()).intValue(), f8Var.o());
                    }
                    wl2 wl2Var = f8Var.o().v;
                    wl2Var.getClass();
                    while (!wl2Var.equals(vx1Var.a.o())) {
                        for (ti1 ti1Var : vx1Var.b(wl2Var).keySet()) {
                            vx1.a(vx1Var, ti1Var, vx1Var.c(wl2Var, ti1Var), wl2Var);
                        }
                        wl2Var = wl2Var.v;
                        wl2Var.getClass();
                    }
                }
                return w84Var;
            case 1:
                ((ue3) ((gf3) obj)).j(ee3.a, new de3(ah1.c, ((pn2) obj2).a(), ce3.d, true));
                return w84Var;
            case 2:
                ((ux1) obj2).V((wu0) obj);
                return w84Var;
            case 3:
                float fFloatValue = ((Number) obj).floatValue();
                lw lwVar = (lw) ((a) ((ci4) ((kw) obj2)).d);
                lwVar.d.h(py.w(lwVar.d.f() - fFloatValue, lwVar.b.f(), 0.0f));
                return w84Var;
            case 4:
                ((w44) obj2).b(((Number) ((vf) obj).e.getValue()).floatValue());
                return w84Var;
            case 5:
                lw lwVar2 = (lw) obj2;
                lwVar2.d.h(py.w(((Number) ((vf) obj).e.getValue()).floatValue(), lwVar2.b.f(), 0.0f));
                return w84Var;
            case 6:
                rz rzVar = (rz) obj;
                hw hwVar = (hw) obj2;
                if (rzVar.getDensity() * hwVar.l < 0.0f || bi3.c(rzVar.c.b()) <= 0.0f) {
                    return rzVar.a(v1.J);
                }
                float fMin = Math.min(rx0.a(hwVar.l, 0.0f) ? 1.0f : (float) Math.ceil(rzVar.getDensity() * hwVar.l), (float) Math.ceil(bi3.c(rzVar.c.b()) / 2.0f));
                float f4 = fMin / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (rzVar.c.b() >> 32)) - fMin)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (rzVar.c.b() & 4294967295L)) - fMin)) & 4294967295L);
                float f5 = fMin * 2.0f;
                boolean z2 = f5 > bi3.c(rzVar.c.b());
                rq2 rq2VarL = hwVar.n.l(rzVar.c.b(), rzVar.c.getLayoutDirection(), rzVar);
                if (!(rq2VarL instanceof oq2)) {
                    if (!(rq2VarL instanceof qq2)) {
                        boolean z3 = z2;
                        if (!(rq2VarL instanceof pq2)) {
                            u41.e();
                            return null;
                        }
                        vl3 vl3Var = hwVar.m;
                        if (z3) {
                            jFloatToRawIntBits = 0;
                        }
                        long j = jFloatToRawIntBits;
                        if (z3) {
                            jFloatToRawIntBits2 = rzVar.c.b();
                        }
                        return rzVar.a(new ew(vl3Var, j, jFloatToRawIntBits2, z3 ? b71.a : new vo3(0, fMin, 0, 0.0f, 30), 0));
                    }
                    vl3 vl3Var2 = hwVar.m;
                    x73 x73Var = ((qq2) rq2VarL).a;
                    if (yh4.K(x73Var)) {
                        return rzVar.a(new gw(z2, vl3Var2, x73Var.e, f4, fMin, jFloatToRawIntBits, jFloatToRawIntBits2, new vo3(0, fMin, 0, 0.0f, 30)));
                    }
                    boolean z4 = z2;
                    if (hwVar.h == null) {
                        hwVar.h = new dw();
                    }
                    dw dwVar = hwVar.h;
                    dwVar.getClass();
                    ic icVar = dwVar.d;
                    ?? r3 = icVar;
                    if (icVar == null) {
                        ic icVarA = kc.a();
                        dwVar.d = icVarA;
                        r3 = icVarA;
                    }
                    r3.e();
                    nt2.b(r3, x73Var);
                    if (!z4) {
                        ic icVarA2 = kc.a();
                        nt2.b(icVarA2, new x73(fMin, fMin, x73Var.b() - fMin, x73Var.a() - fMin, sf3.T(fMin, x73Var.e), sf3.T(fMin, x73Var.f), sf3.T(fMin, x73Var.g), sf3.T(fMin, x73Var.h)));
                        r3.d(r3, icVarA2, 0);
                    }
                    return rzVar.a(new rc(r3, i3, vl3Var2));
                }
                vl3 vl3Var3 = hwVar.m;
                oq2 oq2Var = (oq2) rq2VarL;
                nt2 nt2Var = oq2Var.a;
                if (z2) {
                    return rzVar.a(new rc(oq2Var, 7, vl3Var3));
                }
                if (vl3Var3 != null) {
                    jvVar = new jv(re0.b(1.0f, vl3Var3.a), 5);
                    i = 1;
                } else {
                    jvVar = null;
                    i = 0;
                }
                h43 h43VarC = ((ic) nt2Var).c();
                float f6 = h43VarC.b;
                float f7 = h43VarC.a;
                if (hwVar.h == null) {
                    hwVar.h = new dw();
                }
                dw dwVar2 = hwVar.h;
                dwVar2.getClass();
                ic icVar2 = dwVar2.d;
                ?? r4 = icVar2;
                if (icVar2 == null) {
                    ic icVarA3 = kc.a();
                    dwVar2.d = icVarA3;
                    r4 = icVarA3;
                }
                r4.e();
                nt2.a(r4, h43VarC);
                r4.d(r4, nt2Var, 0);
                q43 q43Var = new q43();
                long jCeil = (((long) ((int) Math.ceil(h43VarC.d - f6))) & 4294967295L) | (((long) ((int) Math.ceil(h43VarC.c - f7))) << 32);
                dw dwVar3 = hwVar.h;
                dwVar3.getClass();
                ib ibVarB = dwVar3.a;
                o9 o9VarA = dwVar3.b;
                cm1 cm1Var = ibVarB != null ? new cm1(ibVarB.a()) : null;
                if (cm1Var != null && cm1Var.a == 0) {
                    z = true;
                } else {
                    cm1 cm1Var2 = ibVarB != null ? new cm1(ibVarB.a()) : null;
                    if (cm1Var2 != null && i == cm1Var2.a) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                try {
                    try {
                        if (ibVarB != null && o9VarA != null) {
                            r46 = r4;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (rzVar.c.b() >> 32));
                            Bitmap bitmap = ibVarB.b;
                            if (fIntBitsToFloat > bitmap.getWidth() || Float.intBitsToFloat((int) (rzVar.c.b() & 4294967295L)) > bitmap.getHeight() || !z) {
                            }
                            a10Var = dwVar3.c;
                            if (a10Var == null) {
                                a10Var = new a10();
                                dwVar3.c = a10Var;
                            }
                            ci4Var = a10Var.d;
                            z00 z00Var = a10Var.c;
                            long jW = y64.W(jCeil);
                            dx1 layoutDirection = rzVar.c.getLayoutDirection();
                            wu0 wu0Var = z00Var.a;
                            a10 a10Var2 = a10Var;
                            dx1 dx1Var = z00Var.b;
                            jv jvVar2 = jvVar;
                            y00 y00Var = z00Var.c;
                            long j2 = z00Var.d;
                            z00Var.a = rzVar;
                            z00Var.b = layoutDirection;
                            z00Var.c = o9VarA;
                            z00Var.d = jW;
                            o9VarA.l();
                            tz0.f(a10Var2, re0.b, 0L, jW, 0.0f, null, 58);
                            f = -f7;
                            f2 = -f6;
                            ((jb) ci4Var.d).B(f, f2);
                            tz0.h(a10Var2, oq2Var.a, vl3Var3, 0.0f, new vo3(0, f5, 0, 0.0f, 30), 52);
                            float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (a10Var2.b() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (a10Var2.b() >> 32));
                            float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (a10Var2.b() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (a10Var2.b() & 4294967295L));
                            long jW2 = a10Var2.W();
                            ib ibVar = ibVarB;
                            o9 o9Var = o9VarA;
                            jC = ci4Var.C();
                            ci4Var.y().l();
                            ((jb) ci4Var.d).A(fIntBitsToFloat2, fIntBitsToFloat3, jW2);
                            tz0.h(a10Var2, r45, vl3Var3, 0.0f, null, 28);
                            ci4Var.y().i();
                            ci4Var.N(jC);
                            ((jb) ci4Var.d).B(-f, -f2);
                            o9Var.i();
                            z00Var.a = wu0Var;
                            z00Var.b = dx1Var;
                            z00Var.c = y00Var;
                            z00Var.d = j2;
                            ibVar.b.prepareToDraw();
                            q43Var.c = ibVar;
                            return rzVar.a(new fw(h43VarC, q43Var, jCeil, jvVar2));
                        }
                        r44 = r4;
                        ((jb) ci4Var.d).A(fIntBitsToFloat2, fIntBitsToFloat3, jW2);
                        tz0.h(a10Var2, r45, vl3Var3, 0.0f, null, 28);
                        ci4Var.y().i();
                        ci4Var.N(jC);
                        ((jb) ci4Var.d).B(-f, -f2);
                        o9Var.i();
                        z00Var.a = wu0Var;
                        z00Var.b = dx1Var;
                        z00Var.c = y00Var;
                        z00Var.d = j2;
                        ibVar.b.prepareToDraw();
                        q43Var.c = ibVar;
                        return rzVar.a(new fw(h43VarC, q43Var, jCeil, jvVar2));
                    } catch (Throwable th) {
                        ci4Var.y().i();
                        ci4Var.N(jC);
                        throw th;
                    }
                    tz0.h(a10Var2, oq2Var.a, vl3Var3, 0.0f, new vo3(0, f5, 0, 0.0f, 30), 52);
                    float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (a10Var2.b() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (a10Var2.b() >> 32));
                    float fIntBitsToFloat5 = (Float.intBitsToFloat((int) (a10Var2.b() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (a10Var2.b() & 4294967295L));
                    long jW3 = a10Var2.W();
                    ib ibVar2 = ibVarB;
                    o9 o9Var2 = o9VarA;
                    jC = ci4Var.C();
                    ci4Var.y().l();
                } catch (Throwable th2) {
                    ((jb) ci4Var.d).B(-f, -f2);
                    throw th2;
                }
                r44 = r46;
                r45 = r46;
                r44 = r46;
                r44 = r46;
                r44 = r46;
                ibVarB = sf3.b((int) (jCeil >> 32), (int) (jCeil & 4294967295L), i);
                dwVar3.a = ibVarB;
                o9VarA = g13.a(ibVarB);
                dwVar3.b = o9VarA;
                r45 = r44;
                a10Var = dwVar3.c;
                if (a10Var == null) {
                    a10Var = new a10();
                    dwVar3.c = a10Var;
                }
                ci4Var = a10Var.d;
                z00 z00Var2 = a10Var.c;
                long jW4 = y64.W(jCeil);
                dx1 layoutDirection2 = rzVar.c.getLayoutDirection();
                wu0 wu0Var2 = z00Var2.a;
                a10 a10Var3 = a10Var;
                dx1 dx1Var2 = z00Var2.b;
                jv jvVar3 = jvVar;
                y00 y00Var2 = z00Var2.c;
                long j3 = z00Var2.d;
                z00Var2.a = rzVar;
                z00Var2.b = layoutDirection2;
                z00Var2.c = o9VarA;
                z00Var2.d = jW4;
                o9VarA.l();
                tz0.f(a10Var3, re0.b, 0L, jW4, 0.0f, null, 58);
                f = -f7;
                f2 = -f6;
                ((jb) ci4Var.d).B(f, f2);
                break;
            case 7:
                InspectorInfo inspectorInfo = (InspectorInfo) obj;
                inspectorInfo.setName("align");
                inspectorInfo.setValue((yt) obj2);
                return w84Var;
            case 8:
                wx1 wx1Var = (wx1) obj;
                ((sg2) obj2).invoke(wx1Var);
                wx1Var.a();
                return w84Var;
            case 9:
                long j4 = ((ln2) obj).a;
                gd0 gd0Var = (gd0) obj2;
                if (gd0Var.o) {
                    gd0Var.p.invoke();
                }
                return w84Var;
            case 10:
                bg bgVar = (bg) obj;
                float f8 = bgVar.b;
                if (f8 < 0.0f) {
                    f8 = 0.0f;
                }
                if (f8 > 1.0f) {
                    f8 = 1.0f;
                }
                float f9 = bgVar.c;
                if (f9 < -0.5f) {
                    f9 = -0.5f;
                }
                if (f9 > 0.5f) {
                    f9 = 0.5f;
                }
                float f10 = bgVar.d;
                float f11 = f10 >= -0.5f ? f10 : -0.5f;
                float f12 = f11 <= 0.5f ? f11 : 0.5f;
                float f13 = bgVar.a;
                f3 = f13 >= 0.0f ? f13 : 0.0f;
                return new re0(re0.a(gb2.a(f8, f9, f12, f3 <= 1.0f ? f3 : 1.0f, ef0.x), (bf0) obj2));
            case 11:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return w84Var;
            case 12:
                Canvas canvas = (Canvas) obj;
                canvas.getClass();
                super/*android.view.View*/.onDraw(canvas);
                return w84Var;
            case 13:
                yx0 yx0Var = (yx0) obj;
                if (!yx0Var.getNode().isAttached()) {
                    return h64.d;
                }
                zx0 zx0Var = yx0Var.h;
                if (zx0Var != null) {
                    zx0Var.M((wx0) obj2);
                }
                yx0Var.h = null;
                yx0Var.d = null;
                return h64.c;
            case 14:
                dx2 dx2Var = (dx2) obj;
                ((r90) obj2).invoke(dx2Var, Float.valueOf(Float.intBitsToFloat((int) (py.L(dx2Var, false) >> 32))));
                dx2Var.a();
                return w84Var;
            case 15:
                n11 n11Var = (n11) obj;
                String str = ((n11) obj2) == n11Var ? " > " : "   ";
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (n11Var instanceof wf0) {
                    StringBuilder sb2 = new StringBuilder("CommitTextCommand(text.length=");
                    wf0 wf0Var = (wf0) n11Var;
                    sb2.append(wf0Var.a.d.length());
                    sb2.append(", newCursorPosition=");
                    strConcat = fq2.p(sb2, wf0Var.b, ')');
                } else if (n11Var instanceof kg3) {
                    StringBuilder sb3 = new StringBuilder("SetComposingTextCommand(text.length=");
                    kg3 kg3Var = (kg3) n11Var;
                    sb3.append(kg3Var.a.d.length());
                    sb3.append(", newCursorPosition=");
                    strConcat = fq2.p(sb3, kg3Var.b, ')');
                } else if ((n11Var instanceof jg3) || (n11Var instanceof pu0) || (n11Var instanceof qu0) || (n11Var instanceof lg3)) {
                    strConcat = n11Var.toString();
                } else if (n11Var instanceof n71) {
                    strConcat = "FinishComposingTextCommand()";
                } else if (n11Var instanceof ou0) {
                    strConcat = "DeleteAllCommand()";
                } else {
                    String classSimpleName = Options$Companion.getClassSimpleName(r43.a(n11Var.getClass()).c);
                    if (classSimpleName == null) {
                        classSimpleName = "{anonymous EditCommand}";
                    }
                    strConcat = "Unknown EditCommand: ".concat(classSimpleName);
                }
                sb.append(strConcat);
                return sb.toString();
            case 16:
                j74 j74Var = (j74) obj;
                return ((mb1) obj2).a(new j74(null, j74Var.b, j74Var.c, j74Var.d, j74Var.e)).c;
            case 17:
                tz0 tz0Var = (tz0) obj;
                gg1 gg1Var = (gg1) obj2;
                nt2 nt2Var2 = gg1Var.l;
                if (gg1Var.n && gg1Var.w && nt2Var2 != null) {
                    ci4 ci4VarA = tz0Var.A();
                    long jC2 = ci4VarA.C();
                    ci4VarA.y().l();
                    try {
                        ((ci4) ((jb) ci4VarA.d).d).y().o(nt2Var2);
                        gg1Var.c(tz0Var);
                    } finally {
                        fq2.x(ci4VarA, jC2);
                    }
                } else {
                    gg1Var.c(tz0Var);
                }
                return w84Var;
            case 18:
                wa4 wa4Var = (wa4) obj;
                ug1 ug1Var = (ug1) obj2;
                ug1Var.g(wa4Var);
                le1 le1Var = ug1Var.i;
                if (le1Var != null) {
                    le1Var.invoke(wa4Var);
                }
                return w84Var;
            case 19:
                List list = (List) obj;
                return new wz1(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), (mz1) obj2);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                wz1 wz1Var = (wz1) obj2;
                float f14 = -((Number) obj).floatValue();
                if ((f14 >= 0.0f || wz1Var.c()) && (f14 <= 0.0f || wz1Var.a())) {
                    if (Math.abs(wz1Var.g) > 0.5f) {
                        so1.c("entered drag with non-zero pending scroll");
                    }
                    float f15 = wz1Var.g + f14;
                    wz1Var.g = f15;
                    if (Math.abs(f15) > 0.5f) {
                        float f16 = wz1Var.g;
                        int iR = gb2.R(f16);
                        jz1 jz1VarD = ((jz1) wz1Var.e.getValue()).d(iR, !wz1Var.b);
                        if (jz1VarD == null || (jz1Var = wz1Var.c) == null) {
                            jz1Var2 = jz1VarD;
                        } else {
                            jz1 jz1VarD2 = jz1Var.d(iR, true);
                            if (jz1VarD2 != null) {
                                wz1Var.c = jz1VarD2;
                                jz1Var2 = jz1VarD;
                            }
                        }
                        if (jz1Var2 != null) {
                            wz1Var.f(jz1Var2, wz1Var.b, true);
                            wz1Var.r.setValue(w84Var);
                            wz1Var.h(f16 - wz1Var.g, jz1Var2);
                        } else {
                            ux1 ux1Var = wz1Var.j;
                            if (ux1Var != null) {
                                ux1Var.k();
                            }
                            wz1Var.h(f16 - wz1Var.g, wz1Var.g());
                        }
                    }
                    if (Math.abs(wz1Var.g) > 0.5f) {
                        f14 -= wz1Var.g;
                        wz1Var.g = 0.0f;
                    }
                    f3 = f14;
                }
                return Float.valueOf(-f3);
            case 21:
                return new g4(6, (m02) obj2);
            case 22:
                return new g4(i3, (w02) obj2);
            case 23:
                ((Number) obj).intValue();
                return obj2;
            case 24:
                w12 w12Var = (w12) obj2;
                return w12Var.a(w12Var.c, ((Number) obj).intValue());
            case 25:
                List list2 = (List) obj;
                return new g22(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue(), (b22) obj2);
            case 26:
                g22 g22Var = (g22) obj2;
                float f17 = -((Number) obj).floatValue();
                if ((f17 >= 0.0f || g22Var.c()) && (f17 <= 0.0f || g22Var.a())) {
                    if (Math.abs(g22Var.g) > 0.5f) {
                        so1.c("entered drag with non-zero pending scroll");
                    }
                    float f18 = g22Var.g + f17;
                    g22Var.g = f18;
                    if (Math.abs(f18) > 0.5f) {
                        float f19 = g22Var.g;
                        int iRound = Math.round(f19);
                        z12 z12VarD = ((z12) g22Var.e.getValue()).d(iRound, !g22Var.b);
                        if (z12VarD == null || (z12Var = g22Var.c) == null) {
                            z12Var2 = z12VarD;
                        } else {
                            z12 z12VarD2 = z12Var.d(iRound, true);
                            if (z12VarD2 != null) {
                                g22Var.c = z12VarD2;
                                z12Var2 = z12VarD;
                            }
                        }
                        if (z12Var2 != null) {
                            g22Var.f(z12Var2, g22Var.b, true);
                            g22Var.u.setValue(w84Var);
                            g22Var.h(f19 - g22Var.g, z12Var2);
                        } else {
                            ux1 ux1Var2 = g22Var.j;
                            if (ux1Var2 != null) {
                                ux1Var2.k();
                            }
                            g22Var.h(f19 - g22Var.g, g22Var.g());
                        }
                    }
                    if (Math.abs(g22Var.g) > 0.5f) {
                        f17 -= g22Var.g;
                        g22Var.g = 0.0f;
                    }
                    f3 = f17;
                }
                return Float.valueOf(-f3);
            case 27:
                g93 g93Var = (g93) obj2;
                return Boolean.valueOf(g93Var != null ? g93Var.canBeSaved(obj) : true);
            case 28:
                ((m62) obj2).cancel(false);
                return w84Var;
            default:
                n63 n63Var = (n63) obj;
                float fFloatValue2 = ((Number) ((ue) obj2).d()).floatValue();
                float fB = hf2.b(n63Var, fFloatValue2);
                float fC = hf2.c(n63Var, fFloatValue2);
                n63Var.i(fC != 0.0f ? fB / fC : 1.0f);
                n63Var.o(hf2.a);
                return w84Var;
        }
    }
}

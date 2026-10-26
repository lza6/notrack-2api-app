package defpackage;

import android.os.Build;
import androidx.compose.material3.a;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.List;
import java.util.concurrent.CancellationException;
import okhttp3.Protocol$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class ie extends ww1 implements le1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(bd4 bd4Var, ux1 ux1Var, bd4 bd4Var2) {
        super(1);
        this.c = 0;
        this.d = bd4Var;
        this.l = ux1Var;
        this.h = bd4Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ie(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ie(n43 n43Var, c22 c22Var, n43 n43Var2, vs0 vs0Var) {
        super(1);
        this.c = 8;
        this.d = n43Var;
        this.h = c22Var;
        this.l = n43Var2;
    }

    private final Object a(Object obj) {
        co0 co0Var = (co0) obj;
        int i = ((rc2) ((gn3) this.d).getValue()).a;
        ho0 ho0Var = (ho0) this.h;
        st3 st3Var = st3.Cut;
        int i2 = 0;
        int i3 = 1;
        int i4 = 4;
        boolean z = (i & 4) == 4;
        xw3 xw3Var = (xw3) this.l;
        if (z) {
            co0.a(co0Var, new mo0(st3Var), new bx3(ho0Var, xw3Var, i2));
        }
        st3 st3Var2 = st3.Copy;
        if ((i & 1) == 1) {
            co0.a(co0Var, new mo0(st3Var2), new bx3(ho0Var, xw3Var, i3));
        }
        st3 st3Var3 = st3.Paste;
        int i5 = 2;
        if ((i & 2) == 2) {
            co0.a(co0Var, new mo0(st3Var3), new bx3(ho0Var, xw3Var, i5));
        }
        st3 st3Var4 = st3.SelectAll;
        if ((i & 8) == 8) {
            co0.a(co0Var, new mo0(st3Var4), new bx3(ho0Var, xw3Var, 3));
        }
        if (Build.VERSION.SDK_INT >= 26) {
            st3 st3Var5 = st3.Autofill;
            if (xw3Var.h() && jz3.c(xw3Var.k().b)) {
                co0.a(co0Var, new mo0(st3Var5), new bx3(ho0Var, xw3Var, i4));
            }
        }
        return w84.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:268:0x05d7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [so0] */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        AndroidComposeView androidComposeView;
        gg ggVar;
        Integer numE;
        Integer numD;
        Integer numD2;
        Integer numE2;
        xy3 xy3Var;
        xy3 xy3Var2;
        yy3 yy3Var;
        yy3 yy3Var2;
        xy3 xy3Var3;
        xy3 xy3Var4;
        yy3 yy3Var3;
        yy3 yy3Var4;
        Integer numD3;
        Integer numE3;
        Integer numE4;
        Integer numD4;
        bi4 bi4Var;
        int i = this.c;
        h64 h64Var = h64.c;
        int i2 = 3;
        boolean zBooleanValue = false;
        int i3 = 1;
        AndroidComposeView androidComposeView2 = 0;
        ey3 ey3Var = null;
        ey3Var = null;
        ey3 ey3Var2 = null;
        e54Var = null;
        e54 e54Var = null;
        w84 w84Var = w84.a;
        Object obj2 = this.l;
        Object obj3 = this.h;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                bd4 bd4Var = (bd4) obj4;
                ux1 ux1Var = (ux1) obj2;
                bd4 bd4Var2 = (bd4) obj3;
                y00 y00VarY = ((tz0) obj).A().y();
                if (bd4Var.getView().getVisibility() != 8) {
                    bd4Var.F = true;
                    yr2 yr2Var = ux1Var.v;
                    if (yr2Var instanceof AndroidComposeView) {
                        androidComposeView = (AndroidComposeView) yr2Var;
                    }
                    if (androidComposeView2 != 0) {
                        androidComposeView2 = androidComposeView;
                        androidComposeView2.drawAndroidView(bd4Var2, p9.a(y00VarY));
                    }
                    androidComposeView2 = androidComposeView;
                    bd4Var.F = false;
                }
                return w84Var;
            case 1:
                vf vfVar = (vf) obj;
                ue ueVar = (ue) obj4;
                vl0.h0(vfVar, ueVar.c);
                ft2 ft2Var = vfVar.e;
                Object objA = ue.a(ueVar, ft2Var.getValue());
                if (!kr1.n(objA, ft2Var.getValue())) {
                    ueVar.c.d.setValue(objA);
                    ((xf) obj3).d.setValue(objA);
                    vfVar.a();
                    ((l43) obj2).c = true;
                }
                return w84Var;
            case 2:
                vf vfVar2 = (vf) obj;
                n43 n43Var = (n43) obj4;
                float fFloatValue = ((Number) vfVar2.e.getValue()).floatValue() - n43Var.c;
                w44 w44Var = (w44) obj3;
                float f = w44Var.c.f();
                w44Var.b(f + fFloatValue);
                float fAbs = Math.abs(f - w44Var.c.f());
                n43Var.c = ((Number) vfVar2.e.getValue()).floatValue();
                ((n43) obj2).c = ((Number) ((x64) vfVar2.a).b.invoke(vfVar2.f)).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    vfVar2.a();
                }
                return w84Var;
            case 3:
                vf vfVar3 = (vf) obj;
                n43 n43Var2 = (n43) obj4;
                float fFloatValue2 = ((Number) vfVar3.e.getValue()).floatValue() - n43Var2.c;
                lw lwVar = (lw) ((a) obj3);
                float f2 = lwVar.d.f();
                bt2 bt2Var = lwVar.d;
                bt2Var.h(py.w(f2 + fFloatValue2, lwVar.b.f(), 0.0f));
                float fAbs2 = Math.abs(f2 - bt2Var.f());
                n43Var2.c = ((Number) vfVar3.e.getValue()).floatValue();
                ((n43) obj2).c = ((Number) ((x64) vfVar3.a).b.invoke(vfVar3.f)).floatValue();
                if (Math.abs(fFloatValue2 - fAbs2) > 0.5f) {
                    vfVar3.a();
                }
                return w84Var;
            case 4:
                cr crVar = (cr) obj2;
                ((go2) obj4).a((n32) obj3, crVar);
                return new g4(i2, crVar);
            case 5:
                ey3 ey3Var3 = (ey3) obj;
                ((mi2) obj3).setValue(ey3Var3);
                mi2 mi2Var = (mi2) obj2;
                boolean zN = kr1.n((String) mi2Var.getValue(), ey3Var3.a.d);
                hg hgVar = ey3Var3.a;
                mi2Var.setValue(hgVar.d);
                if (!zN) {
                    ((le1) obj4).invoke(hgVar.d);
                }
                return w84Var;
            case 6:
                float fFloatValue3 = ((Number) obj).floatValue();
                jn0 jn0Var = (jn0) obj4;
                float f3 = jn0Var.h ? 1.0f : -1.0f;
                oc3 oc3Var = jn0Var.d;
                long jE = oc3Var.e(oc3Var.h(f3 * fFloatValue3));
                oc3 oc3Var2 = ((mc3) obj2).a;
                float fG = oc3Var.g(oc3Var.e(oc3.a(oc3Var2, oc3Var2.j, jE, 1))) * f3;
                if (Math.abs(fG) < Math.abs(fFloatValue3)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fG + " < " + fFloatValue3 + ')');
                    cancellationException.initCause(null);
                    ((gs1) obj3).c(cancellationException);
                }
                return w84Var;
            case 7:
                tz0 tz0Var = (tz0) obj;
                z22 z22Var = (z22) obj4;
                yy3 yy3VarD = z22Var.d();
                if (yy3VarD != null) {
                    Protocol$Companion.m1781xcadc9c24(tz0Var.A().y(), (ey3) obj3, ((jz3) z22Var.z.getValue()).a, ((jz3) z22Var.A.getValue()).a, (nn2) obj2, yy3VarD.a, z22Var.x, z22Var.y);
                }
                return w84Var;
            case 8:
                vf vfVar4 = (vf) obj;
                n43 n43Var3 = (n43) obj4;
                float fFloatValue4 = ((Number) vfVar4.e.getValue()).floatValue() - n43Var3.c;
                float fA = ((c22) obj3).a(fFloatValue4);
                n43Var3.c = ((Number) vfVar4.e.getValue()).floatValue();
                ((n43) obj2).c = ((Number) ((x64) vfVar4.a).b.invoke(vfVar4.f)).floatValue();
                if (Math.abs(fFloatValue4 - fA) > 0.5f) {
                    vfVar4.a();
                }
                return w84Var;
            case 9:
                yx0 yx0Var = (yx0) obj;
                if (!yx0Var.isAttached()) {
                    return h64.d;
                }
                if (yx0Var.h != null) {
                    po1.b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                le1 le1Var = yx0Var.c;
                zx0 zx0Var = le1Var != null ? (zx0) le1Var.invoke((wx0) obj4) : null;
                yx0Var.h = zx0Var;
                boolean z = zx0Var != null;
                if (z) {
                    ((ya) y64.N((yx0) obj3).getDragAndDropManager()).b.add(yx0Var);
                }
                l43 l43Var = (l43) obj2;
                l43Var.c = l43Var.c || z;
                return h64Var;
            case 10:
                i64 i64Var = (i64) obj;
                yx0 yx0Var2 = (yx0) i64Var;
                if (!((ya) y64.N((yx0) obj3).getDragAndDropManager()).b.contains(yx0Var2) || !xp1.c(yx0Var2, jr1.w((wx0) obj2))) {
                    return h64Var;
                }
                ((q43) obj4).c = i64Var;
                return h64.h;
            case 11:
                q33 q33Var = (q33) obj4;
                fc4 fc4Var = (fc4) q33Var.c;
                fc4 fc4Var2 = (fc4) q33Var.b;
                yo4.g(q33Var, (dx2) obj);
                sq3 sq3Var = (sq3) ((ix2) obj3);
                sq3Var.getClass();
                float maximumFlingVelocity = y64.M(sq3Var).I.getMaximumFlingVelocity();
                long jC = gm4.c(maximumFlingVelocity, maximumFlingVelocity);
                if (dc4.b(jC) <= 0.0f || dc4.c(jC) <= 0.0f) {
                    po1.b("maximumVelocity should be a positive value. You specified=" + ((Object) dc4.g(jC)));
                }
                long jC2 = gm4.c(fc4Var2.b(dc4.b(jC)), fc4Var.b(dc4.c(jC)));
                pr0[] pr0VarArr = fc4Var2.d;
                vl.p0(0, pr0VarArr.length, null, pr0VarArr);
                fc4Var2.e = 0;
                pr0[] pr0VarArr2 = fc4Var.d;
                vl.p0(0, pr0VarArr2.length, null, pr0VarArr2);
                fc4Var.e = 0;
                q33Var.a = 0L;
                jy jyVar = ((bz0) obj2).o;
                if (jyVar != null) {
                    iz0 iz0Var = kz0.a;
                    jyVar.i(new ey0(gm4.c(Float.isNaN(dc4.b(jC2)) ? 0.0f : dc4.b(jC2), Float.isNaN(dc4.c(jC2)) ? 0.0f : dc4.c(jC2))));
                }
                return w84Var;
            case 12:
                mv2 mv2Var = (mv2) obj;
                boolean zR = ((xb2) obj4).r();
                hz0 hz0Var = (hz0) obj3;
                ji4 ji4Var = hz0Var.c;
                float fD = zR ? ji4Var.f().d(((fv0) hz0Var.c.h).getValue()) : ji4Var.p();
                nq2 nq2Var = hz0Var.h;
                mv2.d(mv2Var, (nv2) obj2, gb2.R(nq2Var == nq2.d ? fD : 0.0f), gb2.R(nq2Var == nq2.c ? fD : 0.0f));
                return w84Var;
            case 13:
                n63 n63Var = (n63) obj;
                gn3 gn3Var = (gn3) obj3;
                gn3 gn3Var2 = (gn3) obj4;
                n63Var.a(gn3Var2 != null ? ((Number) gn3Var2.getValue()).floatValue() : 1.0f);
                n63Var.g(gn3Var != null ? ((Number) gn3Var.getValue()).floatValue() : 1.0f);
                n63Var.i(gn3Var != null ? ((Number) gn3Var.getValue()).floatValue() : 1.0f);
                gn3 gn3Var3 = (gn3) obj2;
                n63Var.o(gn3Var3 != null ? ((e54) gn3Var3.getValue()).a : e54.b);
                return w84Var;
            case 14:
                k41 k41Var = (k41) obj3;
                x51 x51Var = (x51) obj2;
                int iOrdinal = ((d41) obj).ordinal();
                if (iOrdinal == 0) {
                    na3 na3Var = ((l41) k41Var).b.d;
                    if (na3Var != null) {
                        e54Var = new e54(na3Var.a);
                    } else {
                        na3 na3Var2 = ((y51) x51Var).c.d;
                        if (na3Var2 != null) {
                            e54Var = new e54(na3Var2.a);
                        }
                    }
                } else if (iOrdinal == 1) {
                    e54Var = (e54) obj4;
                } else {
                    if (iOrdinal != 2) {
                        u41.e();
                        return null;
                    }
                    na3 na3Var3 = ((y51) x51Var).c.d;
                    if (na3Var3 != null) {
                        e54Var = new e54(na3Var3.a);
                    } else {
                        na3 na3Var4 = ((l41) k41Var).b.d;
                        if (na3Var4 != null) {
                            e54Var = new e54(na3Var4.a);
                        }
                    }
                }
                return new e54(e54Var != null ? e54Var.a : e54.b);
            case 15:
                db1 db1Var = (db1) obj;
                if (!kr1.n(db1Var, (db1) obj4)) {
                    if (kr1.n(db1Var, ((va1) obj3).f)) {
                        u41.r("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) ((le1) obj2).invoke(db1Var)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 16:
                hh3 hh3Var = (hh3) obj3;
                py.F((gq0) obj4, null, null, new l8(hh3Var, ((Number) obj).floatValue(), androidComposeView2, i3), 3).A(new ye2(hh3Var, (je1) obj2, i3));
                return w84Var;
            case 17:
                mv2 mv2Var2 = (mv2) obj;
                xb2 xb2Var = (xb2) obj2;
                on2 on2Var = (on2) obj4;
                boolean z2 = on2Var.h;
                nv2 nv2Var = (nv2) obj3;
                float f4 = on2Var.c;
                if (z2) {
                    mv2.f(mv2Var2, nv2Var, xb2Var.O(f4), xb2Var.O(on2Var.d));
                } else {
                    mv2.d(mv2Var2, nv2Var, xb2Var.O(f4), xb2Var.O(on2Var.d));
                }
                return w84Var;
            case 18:
                mv2 mv2Var3 = (mv2) obj;
                qn2 qn2Var = (qn2) obj4;
                long j = ((iq1) qn2Var.c.invoke((xb2) obj3)).a;
                boolean z3 = qn2Var.d;
                nv2 nv2Var2 = (nv2) obj2;
                if (z3) {
                    mv2.g(mv2Var3, nv2Var2, (int) (j >> 32), (int) (j & 4294967295L));
                } else {
                    mv2.i(mv2Var3, nv2Var2, (int) (j >> 32), (int) (j & 4294967295L), null, 12);
                }
                return w84Var;
            case 19:
                mv2 mv2Var4 = (mv2) obj;
                xb2 xb2Var2 = (xb2) obj2;
                gs2 gs2Var = (gs2) obj4;
                boolean z4 = gs2Var.m;
                nv2 nv2Var3 = (nv2) obj3;
                float f5 = gs2Var.c;
                if (z4) {
                    mv2.f(mv2Var4, nv2Var3, xb2Var2.O(f5), xb2Var2.O(gs2Var.d));
                } else {
                    mv2.d(mv2Var4, nv2Var3, xb2Var2.O(f5), xb2Var2.O(gs2Var.d));
                }
                return w84Var;
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                by2 by2Var = (by2) obj2;
                ((go2) obj4).a((n32) obj3, by2Var);
                return new g4(10, by2Var);
            case 21:
                g93 g93Var = (g93) obj2;
                d93 d93Var = (d93) obj4;
                fi2 fi2Var = d93Var.b;
                if (fi2Var.b(obj3)) {
                    j93.i(obj3, " was used multiple times ", "Key ");
                    return null;
                }
                d93Var.a.remove(obj3);
                fi2Var.l(obj3, g93Var);
                return new c93(d93Var, obj3, g93Var);
            case 22:
                gg ggVar2 = (gg) obj;
                gg ggVar3 = (gg) obj3;
                l43 l43Var2 = (l43) obj4;
                if (l43Var2.c) {
                    Object obj5 = ggVar2.a;
                    int i4 = ggVar2.c;
                    int i5 = ggVar2.b;
                    if ((obj5 instanceof em3) && i5 == ggVar3.b && i4 == ggVar3.c) {
                        em3 em3Var = (em3) obj2;
                        if (em3Var == null) {
                            em3Var = new em3(0L, 0L, (ic1) null, (gc1) null, (hc1) null, (lb1) null, (String) null, 0L, (zr) null, (iy3) null, (g72) null, 0L, (tt3) null, (pg3) null, 65535);
                        }
                        ggVar = new gg(i5, i4, em3Var);
                    } else {
                        ggVar = ggVar2;
                    }
                } else {
                    ggVar = ggVar2;
                }
                l43Var2.c = ggVar3.equals(ggVar2);
                return ggVar;
            case 23:
                le1 le1Var2 = (le1) obj3;
                py3 py3Var = (py3) ((q43) obj2).c;
                ey3 ey3VarB = ((fp1) obj4).b((List) obj);
                if (py3Var != null) {
                    py3Var.a(null, ey3VarB);
                }
                le1Var2.invoke(ey3VarB);
                return w84Var;
            case 24:
                jw3 jw3Var = (jw3) obj;
                qv3 qv3Var = (qv3) obj3;
                switch (((uu1) obj4).ordinal()) {
                    case 0:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            if (jz3.c(jw3Var.f)) {
                                jw3Var.i();
                            } else {
                                boolean zF = jw3Var.f();
                                long j2 = jw3Var.f;
                                if (zF) {
                                    int iF = jz3.f(j2);
                                    jw3Var.p(iF, iF);
                                } else {
                                    int iE = jz3.e(j2);
                                    jw3Var.p(iE, iE);
                                }
                            }
                        }
                        return w84Var;
                    case 1:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            if (jz3.c(jw3Var.f)) {
                                jw3Var.l();
                            } else {
                                boolean zF2 = jw3Var.f();
                                long j3 = jw3Var.f;
                                if (zF2) {
                                    int iE2 = jz3.e(j3);
                                    jw3Var.p(iE2, iE2);
                                } else {
                                    int iF2 = jz3.f(j3);
                                    jw3Var.p(iF2, iF2);
                                }
                            }
                        }
                        return w84Var;
                    case 2:
                        iz3 iz3Var = jw3Var.e;
                        iz3Var.a = null;
                        hg hgVar2 = jw3Var.g;
                        String str = hgVar2.d;
                        String str2 = hgVar2.d;
                        if (str.length() > 0) {
                            if (jw3Var.f()) {
                                iz3Var.a = null;
                                if (str2.length() > 0 && (numD = jw3Var.d()) != null) {
                                    int iIntValue = numD.intValue();
                                    jw3Var.p(iIntValue, iIntValue);
                                }
                            } else {
                                iz3Var.a = null;
                                if (str2.length() > 0 && (numE = jw3Var.e()) != null) {
                                    int iIntValue2 = numE.intValue();
                                    jw3Var.p(iIntValue2, iIntValue2);
                                }
                            }
                        }
                        return w84Var;
                    case 3:
                        iz3 iz3Var2 = jw3Var.e;
                        iz3Var2.a = null;
                        hg hgVar3 = jw3Var.g;
                        String str3 = hgVar3.d;
                        String str4 = hgVar3.d;
                        if (str3.length() > 0) {
                            if (jw3Var.f()) {
                                iz3Var2.a = null;
                                if (str4.length() > 0 && (numE2 = jw3Var.e()) != null) {
                                    int iIntValue3 = numE2.intValue();
                                    jw3Var.p(iIntValue3, iIntValue3);
                                }
                            } else {
                                iz3Var2.a = null;
                                if (str4.length() > 0 && (numD2 = jw3Var.d()) != null) {
                                    int iIntValue4 = numD2.intValue();
                                    jw3Var.p(iIntValue4, iIntValue4);
                                }
                            }
                        }
                        return w84Var;
                    case 4:
                        jw3Var.j();
                        return w84Var;
                    case 5:
                        jw3Var.k();
                        return w84Var;
                    case 6:
                        jw3Var.n();
                        return w84Var;
                    case 7:
                        jw3Var.m();
                        return w84Var;
                    case 8:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            if (jw3Var.f()) {
                                jw3Var.n();
                            } else {
                                jw3Var.m();
                            }
                        }
                        return w84Var;
                    case 9:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            if (jw3Var.f()) {
                                jw3Var.m();
                            } else {
                                jw3Var.n();
                            }
                        }
                        return w84Var;
                    case 10:
                        if (jw3Var.g.d.length() > 0 && (xy3Var = jw3Var.c) != null) {
                            int iG = jw3Var.g(xy3Var, -1);
                            jw3Var.p(iG, iG);
                        }
                        return w84Var;
                    case 11:
                        if (jw3Var.g.d.length() > 0 && (xy3Var2 = jw3Var.c) != null) {
                            int iG2 = jw3Var.g(xy3Var2, 1);
                            jw3Var.p(iG2, iG2);
                        }
                        return w84Var;
                    case 12:
                        if (jw3Var.g.d.length() > 0 && (yy3Var = jw3Var.i) != null) {
                            int iH = jw3Var.h(yy3Var, -1);
                            jw3Var.p(iH, iH);
                        }
                        return w84Var;
                    case 13:
                        if (jw3Var.g.d.length() > 0 && (yy3Var2 = jw3Var.i) != null) {
                            int iH2 = jw3Var.h(yy3Var2, 1);
                            jw3Var.p(iH2, iH2);
                        }
                        return w84Var;
                    case 14:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            jw3Var.p(0, 0);
                        }
                        return w84Var;
                    case 15:
                        jw3Var.e.a = null;
                        hg hgVar4 = jw3Var.g;
                        if (hgVar4.d.length() > 0) {
                            int length = hgVar4.d.length();
                            jw3Var.p(length, length);
                        }
                        return w84Var;
                    case 16:
                        qv3Var.b.b(false);
                        return w84Var;
                    case 17:
                        qv3Var.b.m();
                        return w84Var;
                    case 18:
                        qv3Var.b.d();
                        return w84Var;
                    case 19:
                        List listA = jw3Var.a(ba3.L);
                        if (listA != null) {
                            qv3Var.a(listA);
                        }
                        return w84Var;
                    case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                        List listA2 = jw3Var.a(ba3.M);
                        if (listA2 != null) {
                            qv3Var.a(listA2);
                        }
                        return w84Var;
                    case 21:
                        List listA3 = jw3Var.a(pv3.d);
                        if (listA3 != null) {
                            qv3Var.a(listA3);
                        }
                        return w84Var;
                    case 22:
                        List listA4 = jw3Var.a(pv3.h);
                        if (listA4 != null) {
                            qv3Var.a(listA4);
                        }
                        return w84Var;
                    case 23:
                        List listA5 = jw3Var.a(pv3.l);
                        if (listA5 != null) {
                            qv3Var.a(listA5);
                        }
                        return w84Var;
                    case 24:
                        List listA6 = jw3Var.a(pv3.m);
                        if (listA6 != null) {
                            qv3Var.a(listA6);
                        }
                        return w84Var;
                    case 25:
                        jw3Var.e.a = null;
                        hg hgVar5 = jw3Var.g;
                        if (hgVar5.d.length() > 0) {
                            jw3Var.p(0, hgVar5.d.length());
                        }
                        return w84Var;
                    case 26:
                        jw3Var.i();
                        jw3Var.o();
                        return w84Var;
                    case 27:
                        jw3Var.l();
                        jw3Var.o();
                        return w84Var;
                    case 28:
                        if (jw3Var.g.d.length() > 0 && (xy3Var3 = jw3Var.c) != null) {
                            int iG3 = jw3Var.g(xy3Var3, -1);
                            jw3Var.p(iG3, iG3);
                        }
                        jw3Var.o();
                        return w84Var;
                    case 29:
                        if (jw3Var.g.d.length() > 0 && (xy3Var4 = jw3Var.c) != null) {
                            int iG4 = jw3Var.g(xy3Var4, 1);
                            jw3Var.p(iG4, iG4);
                        }
                        jw3Var.o();
                        return w84Var;
                    case 30:
                        if (jw3Var.g.d.length() > 0 && (yy3Var3 = jw3Var.i) != null) {
                            int iH3 = jw3Var.h(yy3Var3, -1);
                            jw3Var.p(iH3, iH3);
                        }
                        jw3Var.o();
                        return w84Var;
                    case 31:
                        if (jw3Var.g.d.length() > 0 && (yy3Var4 = jw3Var.i) != null) {
                            int iH4 = jw3Var.h(yy3Var4, 1);
                            jw3Var.p(iH4, iH4);
                        }
                        jw3Var.o();
                        return w84Var;
                    case 32:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            jw3Var.p(0, 0);
                        }
                        jw3Var.o();
                        return w84Var;
                    case 33:
                        jw3Var.e.a = null;
                        hg hgVar6 = jw3Var.g;
                        if (hgVar6.d.length() > 0) {
                            int length2 = hgVar6.d.length();
                            jw3Var.p(length2, length2);
                        }
                        jw3Var.o();
                        return w84Var;
                    case 34:
                        iz3 iz3Var3 = jw3Var.e;
                        iz3Var3.a = null;
                        hg hgVar7 = jw3Var.g;
                        String str5 = hgVar7.d;
                        String str6 = hgVar7.d;
                        if (str5.length() > 0) {
                            if (jw3Var.f()) {
                                iz3Var3.a = null;
                                if (str6.length() > 0 && (numE3 = jw3Var.e()) != null) {
                                    int iIntValue5 = numE3.intValue();
                                    jw3Var.p(iIntValue5, iIntValue5);
                                }
                            } else {
                                iz3Var3.a = null;
                                if (str6.length() > 0 && (numD3 = jw3Var.d()) != null) {
                                    int iIntValue6 = numD3.intValue();
                                    jw3Var.p(iIntValue6, iIntValue6);
                                }
                            }
                        }
                        jw3Var.o();
                        return w84Var;
                    case 35:
                        iz3 iz3Var4 = jw3Var.e;
                        iz3Var4.a = null;
                        hg hgVar8 = jw3Var.g;
                        String str7 = hgVar8.d;
                        String str8 = hgVar8.d;
                        if (str7.length() > 0) {
                            if (jw3Var.f()) {
                                iz3Var4.a = null;
                                if (str8.length() > 0 && (numD4 = jw3Var.d()) != null) {
                                    int iIntValue7 = numD4.intValue();
                                    jw3Var.p(iIntValue7, iIntValue7);
                                }
                            } else {
                                iz3Var4.a = null;
                                if (str8.length() > 0 && (numE4 = jw3Var.e()) != null) {
                                    int iIntValue8 = numE4.intValue();
                                    jw3Var.p(iIntValue8, iIntValue8);
                                }
                            }
                        }
                        jw3Var.o();
                        return w84Var;
                    case 36:
                        jw3Var.j();
                        jw3Var.o();
                        return w84Var;
                    case 37:
                        jw3Var.k();
                        jw3Var.o();
                        return w84Var;
                    case 38:
                        jw3Var.n();
                        jw3Var.o();
                        return w84Var;
                    case 39:
                        jw3Var.m();
                        jw3Var.o();
                        return w84Var;
                    case 40:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            if (jw3Var.f()) {
                                jw3Var.n();
                            } else {
                                jw3Var.m();
                            }
                        }
                        jw3Var.o();
                        return w84Var;
                    case 41:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            if (jw3Var.f()) {
                                jw3Var.m();
                            } else {
                                jw3Var.n();
                            }
                        }
                        jw3Var.o();
                        return w84Var;
                    case 42:
                        jw3Var.e.a = null;
                        if (jw3Var.g.d.length() > 0) {
                            long j4 = jw3Var.f;
                            int i6 = jz3.c;
                            int i7 = (int) (j4 & 4294967295L);
                            jw3Var.p(i7, i7);
                        }
                        return w84Var;
                    case 43:
                        if (qv3Var.e) {
                            qv3Var.a.w.invoke(new en1(qv3Var.l));
                        } else {
                            qv3Var.a(kr1.T(new wf0("\n", 1)));
                        }
                        return w84Var;
                    case 44:
                        if (qv3Var.e) {
                            ((l43) obj2).c = false;
                        } else {
                            qv3Var.a(kr1.T(new wf0("\t", 1)));
                        }
                        return w84Var;
                    case 45:
                        q84 q84Var = qv3Var.h;
                        if (q84Var != null) {
                            q84Var.a(ey3.a(jw3Var.h, jw3Var.g, jw3Var.f, 4));
                        }
                        q84 q84Var2 = qv3Var.h;
                        if (q84Var2 != null) {
                            bi4 bi4Var2 = q84Var2.a;
                            if (bi4Var2 != null && (bi4Var = (bi4) bi4Var2.c) != null) {
                                q84Var2.a = bi4Var;
                                q84Var2.c -= ((ey3) bi4Var2.d).a.d.length();
                                q84Var2.b = new bi4(q84Var2.b, (ey3) bi4Var2.d);
                                ey3Var2 = (ey3) bi4Var.d;
                            }
                            if (ey3Var2 != null) {
                                qv3Var.k.invoke(ey3Var2);
                            }
                        }
                        return w84Var;
                    case 46:
                        q84 q84Var3 = qv3Var.h;
                        if (q84Var3 != null) {
                            bi4 bi4Var3 = q84Var3.b;
                            if (bi4Var3 != null) {
                                q84Var3.b = (bi4) bi4Var3.c;
                                ey3 ey3Var4 = (ey3) bi4Var3.d;
                                q84Var3.a = new bi4(q84Var3.a, ey3Var4);
                                q84Var3.c = ey3Var4.a.d.length() + q84Var3.c;
                                ey3Var = (ey3) bi4Var3.d;
                            }
                            if (ey3Var != null) {
                                qv3Var.k.invoke(ey3Var);
                            }
                        }
                        return w84Var;
                    default:
                        return w84Var;
                }
            case 25:
                return a(obj);
            case 26:
                long j5 = ((ln2) obj).a;
                p43 p43Var = (p43) obj4;
                wx3 wx3Var = (wx3) obj3;
                p43Var.c = ee3.a(wx3Var.l().b());
                ((p43) obj2).c = 0L;
                wx3Var.k.setValue(Boolean.TRUE);
                cx1 cx1VarQ = wx3Var.q();
                wx3Var.n.setValue(new ln2(cx1VarQ != null ? cx1VarQ.g(0L) : 9205357640488583168L));
                wx3Var.z(ah1.c, p43Var.c);
                return w84Var;
            default:
                long j6 = ((ln2) obj).a;
                ((c9) obj4).invoke();
                wx3 wx3Var2 = (wx3) obj3;
                boolean z5 = wx3Var2.d;
                az3 az3Var = wx3Var2.b;
                if (z5 && wx3Var2.f) {
                    if (!wx3Var2.e) {
                        ((hu3) obj2).invoke();
                        if (wx3Var2.a.d().d.length() > 0) {
                            wx3Var2.w(true);
                        }
                    }
                    wx3Var2.x(vz3.c);
                    wx3.c(wx3Var2, kr1.E(az3Var, az3Var.a(j6)));
                }
                return w84Var;
        }
    }
}

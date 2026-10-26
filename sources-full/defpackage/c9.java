package defpackage;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.platform.WindowInfo;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedHashSet;
import java.util.UUID;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class c9 extends ww1 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(cz3 cz3Var, gg ggVar, UriHandler uriHandler) {
        super(0);
        this.c = 26;
        this.h = ggVar;
        this.d = uriHandler;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9(Object obj, int i, Object obj2) {
        super(0);
        this.c = i;
        this.h = obj;
        this.d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:268:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7 A[LOOP:0: B:82:0x01c4->B:92:0x01f7, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [of2] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [oi2] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [oi2] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v43 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.je1
    public final Object invoke() {
        h43 h43Var;
        long j;
        yy3 yy3VarD;
        z22 z22Var;
        hg hgVar;
        long jP = 9205357640488583168L;
        int i = 2;
        int i2 = 0;
        int i3 = 3;
        so0 so0Var = null;
        switch (this.c) {
            case 0:
                ji4 ji4Var = (ji4) this.h;
                y8 y8Var = (y8) ji4Var.n;
                Object obj = this.d;
                float fD = ji4Var.f().d(obj);
                if (!Float.isNaN(fD)) {
                    ji4 ji4Var2 = y8Var.a;
                    ((bt2) ji4Var2.j).h(fD);
                    ((bt2) ji4Var2.k).h(0.0f);
                    ji4Var.s(null);
                }
                ji4Var.r(obj);
                return w84.a;
            case 1:
                ((w20) this.h).i(this.d);
                return w84.a;
            case 2:
                jr jrVar = (jr) this.h;
                rg3 rg3Var = jrVar.l;
                wx1 wx1Var = (wx1) this.d;
                jrVar.q = rg3Var.l(wx1Var.c.b(), wx1Var.getLayoutDirection(), wx1Var);
                return w84.a;
            case 3:
                im0 im0Var = ((vr) this.h).a;
                ur urVar = (ur) this.d;
                im0Var.getClass();
                synchronized (im0Var.d) {
                    if (((LinkedHashSet) im0Var.f).remove(urVar) && ((LinkedHashSet) im0Var.f).isEmpty()) {
                        im0Var.i();
                    }
                    break;
                }
                return w84.a;
            case 4:
                ey3 ey3Var = (ey3) this.h;
                long j2 = ey3Var.b;
                mi2 mi2Var = (mi2) this.d;
                if (!jz3.b(j2, ((ey3) mi2Var.getValue()).b) || !kr1.n(ey3Var.c, ((ey3) mi2Var.getValue()).c)) {
                    mi2Var.setValue(ey3Var);
                }
                return w84.a;
            case 5:
                cz3 cz3Var = (cz3) this.h;
                if (cz3Var != null) {
                    ml3 ml3Var = cz3Var.c;
                    boolean zIsEmpty = ml3Var.isEmpty();
                    hg hgVar2 = cz3Var.b;
                    if (!zIsEmpty) {
                        pt3 pt3Var = new pt3(hgVar2);
                        int size = ml3Var.size();
                        while (i2 < size) {
                            ((le1) ml3Var.get(i2)).invoke(pt3Var);
                            i2++;
                        }
                        hgVar2 = pt3Var.b;
                    }
                    cz3Var.b = hgVar2;
                    if (hgVar2 != null) {
                        return hgVar2;
                    }
                }
                return (hg) this.d;
            case 6:
                je1 je1Var = (je1) this.h;
                if (je1Var != null && (h43Var = (h43) je1Var.invoke()) != null) {
                    return h43Var;
                }
                wl2 wl2Var = (wl2) this.d;
                if (!wl2Var.z()) {
                    wl2Var = null;
                }
                if (wl2Var != null) {
                    return xp1.a(0L, y64.W(wl2Var.h));
                }
                return null;
            case 7:
                ((qz) this.h).h.invoke((rz) this.d);
                return w84.a;
            case 8:
                wh4 wh4Var = (wh4) this.h;
                WorkDatabase workDatabase = wh4Var.c;
                workDatabase.getClass();
                workDatabase.o(new ba(wh4Var, i3, (UUID) this.d));
                ya3.b(wh4Var.b, wh4Var.c, wh4Var.e);
                return w84.a;
            case 9:
                ((q43) this.h).c = ((db1) this.d).w0();
                return w84.a;
            case 10:
                ((q43) this.h).c = gm4.t((gb1) this.d, kv2.a);
                return w84.a;
            case 11:
                ((fi1) this.h).d((of2) this.d);
                return w84.a;
            case 12:
                yd ydVar = ((ux1) this.h).N;
                q43 q43Var = (q43) this.d;
                if ((((of2) ydVar.f).getAggregateChildKindSet$ui_release() & 8) != 0) {
                    for (of2 parent$ui_release = (es3) ydVar.e; parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                        if ((parent$ui_release.getKindSet$ui_release() & 8) != 0) {
                            ?? E = parent$ui_release;
                            ?? oi2Var = 0;
                            while (E != 0) {
                                if (E instanceof xe3) {
                                    xe3 xe3Var = (xe3) E;
                                    if (xe3Var.getShouldClearDescendantSemantics()) {
                                        ue3 ue3Var = new ue3();
                                        q43Var.c = ue3Var;
                                        ue3Var.l = true;
                                    }
                                    if (xe3Var.getShouldMergeDescendantSemantics()) {
                                        ((ue3) q43Var.c).h = true;
                                    }
                                    xe3Var.applySemantics((gf3) q43Var.c);
                                } else if ((E.getKindSet$ui_release() & 8) != 0 && (E instanceof ju0)) {
                                    of2 child$ui_release = ((ju0) E).d;
                                    int i4 = 0;
                                    while (child$ui_release != null) {
                                        if ((child$ui_release.getKindSet$ui_release() & 8) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                E = E;
                                                oi2Var = oi2Var;
                                                oi2Var = oi2Var;
                                                E = child$ui_release;
                                            } else {
                                                if (oi2Var == 0) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (E != 0) {
                                                    oi2Var.c(E);
                                                    E = 0;
                                                }
                                                oi2Var.c(child$ui_release);
                                            }
                                        } else {
                                            E = E;
                                            oi2Var = oi2Var;
                                        }
                                        child$ui_release = child$ui_release.getChild$ui_release();
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                    if (i4 == 1) {
                                        E = E;
                                        oi2Var = oi2Var;
                                    } else {
                                        E = E;
                                        oi2Var = oi2Var;
                                    }
                                }
                                E = y64.e(oi2Var);
                            }
                        }
                    }
                }
                return w84.a;
            case 13:
                uy1 uy1Var = (uy1) ((fv0) this.h).getValue();
                wz1 wz1Var = (wz1) this.d;
                return new xy1(wz1Var, uy1Var, new gj((lq1) wz1Var.d.f.getValue(), uy1Var));
            case 14:
                return new i22((g93) this.h, a31.c, (b93) this.d);
            case 15:
                le1 le1VarC = ((pv2) this.h).c.c();
                if (le1VarC != null) {
                    le1VarC.invoke(new l82((m82) this.d));
                }
                return w84.a;
            case 16:
                s82 s82Var = (s82) this.h;
                yx1 yx1Var = s82Var.n;
                yx1Var.h = 0;
                oi2 oi2VarX = yx1Var.a.x();
                Object[] objArr = oi2VarX.c;
                int i5 = oi2VarX.h;
                for (int i6 = 0; i6 < i5; i6++) {
                    s82 s82Var2 = ((ux1) objArr[i6]).O.q;
                    s82Var2.getClass();
                    s82Var2.p = s82Var2.q;
                    s82Var2.q = IntCompanionObject.MAX_VALUE;
                    if (s82Var2.r == sx1.d) {
                        s82Var2.r = sx1.h;
                    }
                }
                ux1 ux1Var = yx1Var.a;
                ux1 ux1Var2 = yx1Var.a;
                oi2 oi2VarX2 = ux1Var.x();
                Object[] objArr2 = oi2VarX2.c;
                int i7 = oi2VarX2.h;
                for (int i8 = 0; i8 < i7; i8++) {
                    s82 s82Var3 = ((ux1) objArr2[i8]).O.q;
                    s82Var3.getClass();
                    s82Var3.z.d = false;
                }
                wo1 wo1Var = s82Var.o().U;
                if (wo1Var != null) {
                    boolean z = wo1Var.p;
                    th2 th2Var = (th2) ux1Var2.n();
                    int i9 = ((oi2) th2Var.d).h;
                    for (int i10 = 0; i10 < i9; i10++) {
                        o82 o82VarN0 = ((wl2) ((ux1) th2Var.get(i10)).N.d).N0();
                        if (o82VarN0 != null) {
                            o82VarN0.p = z;
                        }
                    }
                }
                ((o82) this.d).y0().b();
                if (s82Var.o().U != null) {
                    th2 th2Var2 = (th2) ux1Var2.n();
                    int i11 = ((oi2) th2Var2.d).h;
                    for (int i12 = 0; i12 < i11; i12++) {
                        o82 o82VarN1 = ((wl2) ((ux1) th2Var2.get(i12)).N.d).N0();
                        if (o82VarN1 != null) {
                            o82VarN1.p = false;
                        }
                    }
                }
                oi2 oi2VarX3 = ux1Var2.x();
                Object[] objArr3 = oi2VarX3.c;
                int i13 = oi2VarX3.h;
                for (int i14 = 0; i14 < i13; i14++) {
                    s82 s82Var4 = ((ux1) objArr3[i14]).O.q;
                    s82Var4.getClass();
                    int i15 = s82Var4.p;
                    int i16 = s82Var4.q;
                    if (i15 != i16 && i16 == Integer.MAX_VALUE) {
                        s82Var4.n0(true);
                    }
                }
                oi2 oi2VarX4 = ux1Var2.x();
                Object[] objArr4 = oi2VarX4.c;
                int i17 = oi2VarX4.h;
                while (i2 < i17) {
                    s82 s82Var5 = ((ux1) objArr4[i2]).O.q;
                    s82Var5.getClass();
                    vx1 vx1Var = s82Var5.z;
                    vx1Var.e = vx1Var.d;
                    i2++;
                }
                return w84.a;
            case 17:
                hh3 hh3Var = (hh3) this.h;
                if (((Boolean) ((le1) hh3Var.c.d).invoke(ih3.h)).booleanValue()) {
                    py.F((gq0) this.d, null, null, new ve2(hh3Var, so0Var, 5), 3);
                }
                return Boolean.TRUE;
            case 18:
                float f = ((bt2) ((ah2) this.d)).f();
                return Float.valueOf(py.w((((h01) this.h).a.p() - f) / (0.0f - f), 0.0f, 1.0f));
            case 19:
                return new h01((i01) this.h, (le1) this.d);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                v72.f().c(ph4.a, "NetworkRequestConstraintController unregister callback");
                ((fl2) this.h).a.unregisterNetworkCallback((el2) this.d);
                return w84.a;
            case 21:
                gi2 gi2Var = (gi2) this.h;
                tk0 tk0Var = (tk0) this.d;
                Object[] objArr5 = gi2Var.b;
                long[] jArr = gi2Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j3 = jArr[i18];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i19 = 8 - ((~(i18 - length)) >>> 31);
                            for (int i20 = 0; i20 < i19; i20++) {
                                if ((255 & j3) < 128) {
                                    tk0Var.y(objArr5[(i18 << 3) + i20]);
                                }
                                j3 >>= 8;
                            }
                            if (i19 == 8) {
                                if (i18 != length) {
                                    i18++;
                                }
                            }
                        } else if (i18 != length) {
                            i18++;
                        }
                    }
                }
                return w84.a;
            case 22:
                le3 le3Var = (le3) this.h;
                long j4 = ((qq1) ((mi2) this.d).getValue()).a;
                fd3 fd3VarE = le3Var.e();
                if (fd3VarE != null) {
                    ah1 ah1VarD = le3Var.d();
                    int i21 = ah1VarD == null ? -1 : me3.a[ah1VarD.ordinal()];
                    if (i21 != -1) {
                        if (i21 == 1) {
                            jP = vl0.P(le3Var, j4, fd3VarE.a);
                        } else {
                            if (i21 != 2) {
                                if (i21 != 3) {
                                    u41.e();
                                    return null;
                                }
                                u41.r("SelectionContainer does not support cursor");
                                return null;
                            }
                            jP = vl0.P(le3Var, j4, fd3VarE.b);
                        }
                    }
                }
                return new ln2(jP);
            case 23:
                o43 o43Var = (o43) this.d;
                du3 du3Var = (du3) this.h;
                du3Var.n.d();
                if (du3Var.isAttached() && ((WindowInfo) gm4.t(du3Var, CompositionLocalsKt.getLocalWindowInfo())).isWindowFocused()) {
                    i = 1;
                }
                Integer numValueOf = Integer.valueOf(i * o43Var.c);
                o43Var.c *= -1;
                return numValueOf;
            case 24:
                if (!((wx3) this.h).f) {
                    xp1.A((nu3) this.d);
                }
                return w84.a;
            case 25:
                xw3 xw3Var = (xw3) this.h;
                long j5 = ((qq1) ((mi2) this.d).getValue()).a;
                ln2 ln2VarG = xw3Var.g();
                if (ln2VarG != null) {
                    long j6 = ln2VarG.a;
                    z22 z22Var2 = xw3Var.d;
                    hg hgVar3 = z22Var2 != null ? (hg) z22Var2.a.b : null;
                    if (hgVar3 != null && hgVar3.d.length() != 0) {
                        ah1 ah1Var = (ah1) xw3Var.r.getValue();
                        int i22 = ah1Var == null ? -1 : zw3.a[ah1Var.ordinal()];
                        if (i22 != -1) {
                            if (i22 == 1 || i22 == 2) {
                                long j7 = xw3Var.k().b;
                                int i23 = jz3.c;
                                j = j7 >> 32;
                            } else {
                                if (i22 != 3) {
                                    u41.e();
                                    return null;
                                }
                                long j8 = xw3Var.k().b;
                                int i24 = jz3.c;
                                j = j8 & 4294967295L;
                            }
                            int i25 = (int) j;
                            z22 z22Var3 = xw3Var.d;
                            if (z22Var3 != null && (yy3VarD = z22Var3.d()) != null && (z22Var = xw3Var.d) != null && (hgVar = (hg) z22Var.a.b) != null) {
                                int iX = py.x(xw3Var.b.o(i25), 0, hgVar.d.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (yy3VarD.d(j6) >> 32));
                                xy3 xy3Var = yy3VarD.a;
                                pg2 pg2Var = xy3Var.b;
                                int iD = pg2Var.d(iX);
                                float fE = xy3Var.e(iD);
                                float f2 = xy3Var.f(iD);
                                float fW = py.w(fIntBitsToFloat, Math.min(fE, f2), Math.max(fE, f2));
                                if (qq1.a(j5, 0L) || Math.abs(fIntBitsToFloat - fW) <= ((int) (j5 >> 32)) / 2) {
                                    float f3 = pg2Var.f(iD);
                                    jP = (((long) Float.floatToRawIntBits(fW)) << 32) | (((long) Float.floatToRawIntBits(((pg2Var.b(iD) - f3) / 2.0f) + f3)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new ln2(jP);
            default:
                m42 m42Var = (m42) ((gg) this.h).a;
                UriHandler uriHandler = (UriHandler) this.d;
                if (m42Var instanceof l42) {
                    try {
                        uriHandler.openUri(((l42) m42Var).a);
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return w84.a;
        }
    }
}

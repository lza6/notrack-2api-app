package defpackage;

import androidx.compose.ui.Alignment$Companion;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.viewinterop.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pe extends ww1 implements ne1 {
    public static final pe A;
    public static final pe B;
    public static final pe C;
    public static final pe D;
    public static final pe E;
    public static final pe F;
    public static final pe G;
    public static final pe H;
    public static final pe I;
    public static final pe J;
    public static final pe K;
    public static final pe L;
    public static final pe M;
    public static final pe d;
    public static final pe h;
    public static final pe l;
    public static final pe m;
    public static final pe n;
    public static final pe o;
    public static final pe p;
    public static final pe q;
    public static final pe r;
    public static final pe s;
    public static final pe t;
    public static final pe u;
    public static final pe v;
    public static final pe w;
    public static final pe x;
    public static final pe y;
    public static final pe z;
    public final /* synthetic */ int c;

    static {
        int i = 2;
        d = new pe(i, 0);
        h = new pe(i, 1);
        l = new pe(i, 2);
        m = new pe(i, 3);
        n = new pe(i, 4);
        o = new pe(i, 5);
        p = new pe(i, 6);
        q = new pe(i, 7);
        r = new pe(i, 8);
        s = new pe(i, 9);
        t = new pe(i, 10);
        u = new pe(i, 11);
        v = new pe(i, 12);
        w = new pe(i, 13);
        x = new pe(i, 14);
        y = new pe(i, 15);
        z = new pe(i, 16);
        A = new pe(i, 17);
        B = new pe(i, 18);
        C = new pe(i, 19);
        D = new pe(i, 20);
        E = new pe(i, 21);
        F = new pe(i, 22);
        G = new pe(i, 23);
        H = new pe(i, 24);
        I = new pe(i, 25);
        J = new pe(i, 26);
        K = new pe(i, 27);
        L = new pe(i, 28);
        M = new pe(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe(int i, int i2) {
        super(i);
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x006b A[LOOP:0: B:7:0x0024->B:20:0x006b, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [of2] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [of2] */
    /* JADX WARN: Type inference failed for: r7v10, types: [oi2] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [oi2] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.ne1
    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        int i2 = 1;
        w84 w84Var = w84.a;
        switch (i) {
            case 0:
                a.a((ux1) obj).setResetBlock((le1) obj2);
                return w84Var;
            case 1:
                a.a((ux1) obj).setUpdateBlock((le1) obj2);
                return w84Var;
            case 2:
                a.a((ux1) obj).setReleaseBlock((le1) obj2);
                return w84Var;
            case 3:
                a.a((ux1) obj).setUpdateBlock((le1) obj2);
                return w84Var;
            case 4:
                a.a((ux1) obj).setReleaseBlock((le1) obj2);
                return w84Var;
            case 5:
                a.a((ux1) obj).setModifier((c) obj2);
                return w84Var;
            case 6:
                a.a((ux1) obj).setDensity((wu0) obj2);
                return w84Var;
            case 7:
                a.a((ux1) obj).setLifecycleOwner((n32) obj2);
                return w84Var;
            case 8:
                a.a((ux1) obj).setSavedStateRegistryOwner((u93) obj2);
                return w84Var;
            case 9:
                bd4 bd4VarA = a.a((ux1) obj);
                int iOrdinal = ((dx1) obj2).ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    u41.e();
                    return null;
                }
                bd4VarA.setLayoutDirection(i2);
                return w84Var;
            case 10:
                d41 d41Var = (d41) obj2;
                return Boolean.valueOf(((d41) obj) == d41Var && d41Var == d41.h);
            case 11:
                return Integer.valueOf(Alignment$Companion.getStart().a(0, ((Number) obj).intValue(), (dx1) obj2));
            case 12:
                lw lwVar = (lw) ((androidx.compose.material3.a) obj2);
                return kr1.U(Float.valueOf(lwVar.b.f()), Float.valueOf(lwVar.d.f()), Float.valueOf(lwVar.c.f()));
            case 13:
                String str = (String) obj;
                nf2 nf2Var = (nf2) obj2;
                if (str.length() == 0) {
                    return nf2Var.toString();
                }
                return str + ", " + nf2Var;
            case 14:
                ((Number) obj2).intValue();
                ((androidx.compose.ui.node.a) obj).getClass();
                return w84Var;
            case 15:
                ((ux1) ((androidx.compose.ui.node.a) obj)).X((vb2) obj2);
                return w84Var;
            case 16:
                ((ux1) ((androidx.compose.ui.node.a) obj)).Y((c) obj2);
                return w84Var;
            case 17:
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                ux1 ux1Var = (ux1) ((androidx.compose.ui.node.a) obj);
                ux1Var.J = aVar;
                yd ydVar = ux1Var.N;
                o13 localDensity = CompositionLocalsKt.getLocalDensity();
                su2 su2Var = (su2) aVar;
                su2Var.getClass();
                ux1Var.V((wu0) yo4.O(su2Var, localDensity));
                su2 su2Var2 = (su2) aVar;
                dx1 dx1Var = (dx1) yo4.O(su2Var2, CompositionLocalsKt.getLocalLayoutDirection());
                if (ux1Var.H != dx1Var) {
                    ux1Var.H = dx1Var;
                    ux1Var.C();
                    ux1 ux1VarT = ux1Var.t();
                    if (ux1VarT != null) {
                        ux1VarT.A();
                    }
                    ux1Var.B();
                    for (of2 child$ui_release = (of2) ydVar.f; child$ui_release != null; child$ui_release = child$ui_release.getChild$ui_release()) {
                        child$ui_release.onLayoutDirectionChange();
                    }
                }
                ux1Var.Z((ViewConfiguration) yo4.O(su2Var2, CompositionLocalsKt.getLocalViewConfiguration()));
                if ((((of2) ydVar.f).getAggregateChildKindSet$ui_release() & 32768) != 0) {
                    for (of2 child$ui_release2 = (of2) ydVar.f; child$ui_release2 != null; child$ui_release2 = child$ui_release2.getChild$ui_release()) {
                        if ((child$ui_release2.getKindSet$ui_release() & 32768) != 0) {
                            ?? E2 = child$ui_release2;
                            ?? oi2Var = 0;
                            while (E2 != 0) {
                                if (E2 instanceof wk0) {
                                    of2 node = ((of2) ((wk0) E2)).getNode();
                                    if (node.isAttached()) {
                                        xl2.d(node);
                                    } else {
                                        node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                                    }
                                } else if ((E2.getKindSet$ui_release() & 32768) != 0 && (E2 instanceof ju0)) {
                                    of2 child$ui_release3 = ((ju0) E2).d;
                                    int i3 = 0;
                                    while (child$ui_release3 != null) {
                                        if ((child$ui_release3.getKindSet$ui_release() & 32768) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E2 = E2;
                                                oi2Var = oi2Var;
                                                oi2Var = oi2Var;
                                                E2 = child$ui_release3;
                                            } else {
                                                if (oi2Var == 0) {
                                                    oi2Var = new oi2(0, new of2[16]);
                                                }
                                                if (E2 != 0) {
                                                    oi2Var.c(E2);
                                                    E2 = 0;
                                                }
                                                oi2Var.c(child$ui_release3);
                                            }
                                        } else {
                                            E2 = E2;
                                            oi2Var = oi2Var;
                                        }
                                        child$ui_release3 = child$ui_release3.getChild$ui_release();
                                        E2 = E2;
                                        oi2Var = oi2Var;
                                    }
                                    if (i3 == 1) {
                                        E2 = E2;
                                        oi2Var = oi2Var;
                                    } else {
                                        E2 = E2;
                                        oi2Var = oi2Var;
                                    }
                                }
                                E2 = y64.e(oi2Var);
                            }
                        }
                        if ((child$ui_release2.getAggregateChildKindSet$ui_release() & 32768) != 0) {
                        }
                    }
                }
                return w84Var;
            case 18:
                return (i01) ((ft2) ((h01) obj2).a.g).getValue();
            case 19:
                ((Number) obj2).intValue();
                return new sg1(1L);
            case AndroidComposeViewAccessibilityDelegateCompat.AccessibilitySliderStepsCount /* 20 */:
                wz1 wz1Var = (wz1) obj2;
                return kr1.U(Integer.valueOf(wz1Var.d.b.f()), Integer.valueOf(wz1Var.d.c.f()));
            case 21:
                wz1 wz1Var2 = (wz1) obj2;
                return kr1.U(Integer.valueOf(wz1Var2.d.b.f()), Integer.valueOf(wz1Var2.d.c.f()));
            case 22:
                g22 g22Var = (g22) obj2;
                return kr1.U(Integer.valueOf(g22Var.d.b.f()), Integer.valueOf(g22Var.d.c.f()));
            case 23:
                g22 g22Var2 = (g22) obj2;
                return kr1.U(Integer.valueOf(g22Var2.d.b.f()), Integer.valueOf(g22Var2.d.c.f()));
            case 24:
                Map mapPerformSave = ((i22) obj2).performSave();
                if (mapPerformSave.isEmpty()) {
                    return null;
                }
                return mapPerformSave;
            case 25:
                return Integer.valueOf(((qb2) obj).d(((Number) obj2).intValue()));
            case 26:
                return Integer.valueOf(((qb2) obj).Q(((Number) obj2).intValue()));
            case 27:
                return Integer.valueOf(((qb2) obj).R(((Number) obj2).intValue()));
            case 28:
                return Integer.valueOf(((qb2) obj).M(((Number) obj2).intValue()));
            default:
                d93 d93Var = (d93) obj2;
                Map map = d93Var.a;
                fi2 fi2Var = d93Var.b;
                Object[] objArr = fi2Var.b;
                Object[] objArr2 = fi2Var.c;
                long[] jArr = fi2Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((255 & j) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    Object obj3 = objArr[i7];
                                    Map mapPerformSave2 = ((g93) objArr2[i7]).performSave();
                                    if (mapPerformSave2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapPerformSave2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i5 == 8) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        } else if (i4 != length) {
                            i4++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
        }
    }
}

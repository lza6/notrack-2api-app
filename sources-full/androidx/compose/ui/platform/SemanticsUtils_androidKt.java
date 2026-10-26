package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import defpackage.af3;
import defpackage.cf3;
import defpackage.cx1;
import defpackage.dh2;
import defpackage.ei2;
import defpackage.ff3;
import defpackage.fi2;
import defpackage.gq1;
import defpackage.h43;
import defpackage.hq1;
import defpackage.iu0;
import defpackage.le1;
import defpackage.me;
import defpackage.of2;
import defpackage.te3;
import defpackage.ue3;
import defpackage.ux1;
import defpackage.wl2;
import defpackage.xe3;
import defpackage.xy3;
import defpackage.y64;
import defpackage.yh4;
import defpackage.z0;
import defpackage.ze3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SemanticsUtils_androidKt {
    private static final h43 DefaultFakeNodeBounds = new h43(0.0f, 0.0f, 10.0f, 10.0f);

    public static final ScrollObservationScope findById(List<ScrollObservationScope> list, int i) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (list.get(i2).getSemanticsNodeId() == i) {
                return list.get(i2);
            }
        }
        return null;
    }

    public static final gq1 getAllUncoveredSemanticsNodesToIntObjectMap(af3 af3Var) {
        ze3 ze3VarA = af3Var.a();
        ux1 ux1Var = ze3VarA.c;
        if (!ux1Var.G() || !ux1Var.F()) {
            dh2 dh2Var = hq1.a;
            dh2Var.getClass();
            return dh2Var;
        }
        dh2 dh2Var2 = new dh2(48);
        h43 h43VarE = ze3VarA.e();
        getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(new Region(Math.round(h43VarE.a), Math.round(h43VarE.b), Math.round(h43VarE.c), Math.round(h43VarE.d)), ze3VarA, dh2Var2, ze3VarA, new Region());
        return dh2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[EDGE_INSN: B:44:0x00c7->B:47:0x00dd BREAK  A[LOOP:1: B:41:0x00bc->B:45:0x00ca]] */
    private static final void getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(Region region, ze3 ze3Var, dh2 dh2Var, ze3 ze3Var2, Region region2) {
        h43 h43Var;
        ux1 ux1Var;
        xe3 xe3VarD;
        ux1 ux1Var2 = ze3Var2.c;
        int i = ze3Var2.g;
        boolean z = (ux1Var2.G() && ux1Var2.F()) ? false : true;
        if (!region.isEmpty() || i == ze3Var.g) {
            if (!z || ze3Var2.e) {
                iu0 iu0Var = ze3Var2.a;
                ue3 ue3Var = ze3Var2.d;
                if (ue3Var.h && (xe3VarD = yh4.D(ux1Var2)) != null) {
                    iu0Var = xe3VarD;
                }
                of2 node = iu0Var.getNode();
                Object objG = ue3Var.c.g(te3.b);
                if (objG == null) {
                    objG = null;
                }
                boolean z2 = objG != null;
                if (!node.getNode().isAttached()) {
                    h43Var = h43.e;
                    break;
                }
                if (z2) {
                    wl2 wl2VarK = y64.K(node, 8);
                    if (!wl2VarK.z()) {
                        h43Var = h43.e;
                        break;
                    }
                    cx1 cx1VarU = y64.u(wl2VarK);
                    ei2 ei2Var = wl2VarK.G;
                    if (ei2Var == null) {
                        ei2Var = new ei2();
                        wl2VarK.G = ei2Var;
                    }
                    long jF0 = wl2VarK.F0(wl2VarK.O0());
                    int i2 = (int) (jF0 >> 32);
                    ei2Var.a = -Float.intBitsToFloat(i2);
                    int i3 = (int) (jF0 & 4294967295L);
                    ei2Var.b = -Float.intBitsToFloat(i3);
                    ei2Var.c = Float.intBitsToFloat(i2) + wl2VarK.e0();
                    ei2Var.d = Float.intBitsToFloat(i3) + wl2VarK.X();
                    while (true) {
                        if (wl2VarK == cx1VarU) {
                            h43Var = new h43(ei2Var.a, ei2Var.b, ei2Var.c, ei2Var.d);
                            break;
                        }
                        wl2VarK.g1(ei2Var, false, true);
                        if (ei2Var.b()) {
                            h43Var = h43.e;
                            break;
                        } else {
                            wl2VarK = wl2VarK.v;
                            wl2VarK.getClass();
                        }
                    }
                } else {
                    wl2 wl2VarK2 = y64.K(node, 8);
                    h43Var = y64.u(wl2VarK2).G(wl2VarK2, true);
                }
                int iRound = Math.round(h43Var.a);
                int iRound2 = Math.round(h43Var.b);
                int iRound3 = Math.round(h43Var.c);
                int iRound4 = Math.round(h43Var.d);
                region2.set(iRound, iRound2, iRound3, iRound4);
                if (i == ze3Var.g) {
                    i = -1;
                }
                if (!region2.op(region, Region.Op.INTERSECT)) {
                    if (ze3Var2.e) {
                        ze3 ze3VarJ = ze3Var2.j();
                        h43 h43VarE = (ze3VarJ == null || (ux1Var = ze3VarJ.c) == null || !ux1Var.G()) ? DefaultFakeNodeBounds : ze3VarJ.e();
                        dh2Var.h(i, new SemanticsNodeWithAdjustedBounds(ze3Var2, new Rect(Math.round(h43VarE.a), Math.round(h43VarE.b), Math.round(h43VarE.c), Math.round(h43VarE.d))));
                        return;
                    } else {
                        if (i == -1) {
                            dh2Var.h(i, new SemanticsNodeWithAdjustedBounds(ze3Var2, region2.getBounds()));
                            return;
                        }
                        return;
                    }
                }
                dh2Var.h(i, new SemanticsNodeWithAdjustedBounds(ze3Var2, region2.getBounds()));
                List listH = ze3.h(ze3Var2, 4);
                for (int size = listH.size() - 1; -1 < size; size--) {
                    if (!((ze3) listH.get(size)).i().c.c(cf3.y)) {
                        getAllUncoveredSemanticsNodesToIntObjectMap$findAllSemanticNodesRecursive(region, ze3Var, dh2Var, (ze3) listH.get(size), region2);
                    }
                }
                if (isImportantForAccessibility(ze3Var2)) {
                    region.op(iRound, iRound2, iRound3, iRound4, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final h43 getDefaultFakeNodeBounds() {
        return DefaultFakeNodeBounds;
    }

    public static final Float getScrollViewportLength(ue3 ue3Var) {
        le1 le1Var;
        ArrayList arrayList = new ArrayList();
        ff3 ff3Var = te3.a;
        z0 z0Var = (z0) y64.B(ue3Var, te3.B);
        if (z0Var == null || (le1Var = (le1) z0Var.b) == null || !((Boolean) le1Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final xy3 getTextLayoutResult(ue3 ue3Var) {
        le1 le1Var;
        ArrayList arrayList = new ArrayList();
        ff3 ff3Var = te3.a;
        z0 z0Var = (z0) y64.B(ue3Var, te3.a);
        if (z0Var == null || (le1Var = (le1) z0Var.b) == null || !((Boolean) le1Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (xy3) arrayList.get(0);
    }

    public static final boolean isHidden(ze3 ze3Var) {
        wl2 wl2VarC = ze3Var.c();
        fi2 fi2Var = ze3Var.d.c;
        return (wl2VarC != null ? wl2VarC.X0() : false) || fi2Var.c(cf3.o) || fi2Var.c(cf3.n);
    }

    public static /* synthetic */ void isHidden$annotations(ze3 ze3Var) {
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean isImportantForAccessibility(ze3 ze3Var) {
        if (!isHidden(ze3Var)) {
            ue3 ue3Var = ze3Var.d;
            if (ue3Var.h) {
                return true;
            }
            fi2 fi2Var = ue3Var.c;
            Object[] objArr = fi2Var.b;
            Object[] objArr2 = fi2Var.c;
            long[] jArr = fi2Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((ff3) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    public static final View semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i) {
        Object next;
        Iterator<T> it = androidViewsHandler.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ux1) ((Map.Entry) next).getKey()).d != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (me) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m124x239bb0bb(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}

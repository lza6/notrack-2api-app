package androidx.compose.ui.platform;

import ai.notrack.app.R;
import android.content.res.Resources;
import androidx.compose.ui.contentcapture.ContentCaptureManager$Companion;
import defpackage.bh2;
import defpackage.cf3;
import defpackage.cv0;
import defpackage.dh2;
import defpackage.dx1;
import defpackage.e14;
import defpackage.ff3;
import defpackage.fi2;
import defpackage.gq1;
import defpackage.h03;
import defpackage.h43;
import defpackage.hg;
import defpackage.hq1;
import defpackage.ke0;
import defpackage.kr1;
import defpackage.le1;
import defpackage.lk0;
import defpackage.n73;
import defpackage.ne1;
import defpackage.od0;
import defpackage.oe0;
import defpackage.ps2;
import defpackage.py;
import defpackage.se1;
import defpackage.ue3;
import defpackage.ux1;
import defpackage.y9;
import defpackage.yh4;
import defpackage.z0;
import defpackage.ze3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat_androidKt {
    private static final ne1 UnmergedConfigComparator;
    private static final Comparator<ze3>[] semanticComparators;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[e14.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Comparator<ze3>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            final Comparator comparator = i == 0 ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE;
            final lk0 lk0Var = ux1.a0;
            final Comparator comparator2 = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator.compare(t, t2);
                    return iCompare != 0 ? iCompare : lk0Var.compare(((ze3) t).c, ((ze3) t2).c);
                }
            };
            comparatorArr[i] = new Comparator() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat_androidKt$special$$inlined$thenBy$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    int iCompare = comparator2.compare(t, t2);
                    return iCompare != 0 ? iCompare : yh4.s(Integer.valueOf(((ze3) t).g), Integer.valueOf(((ze3) t2).g));
                }
            };
            i++;
        }
        semanticComparators = comparatorArr;
        UnmergedConfigComparator = AndroidComposeViewAccessibilityDelegateCompat_androidKt$UnmergedConfigComparator$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean accessibilityEquals(z0 z0Var, Object obj) {
        if (z0Var == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        String str = z0Var.a;
        z0 z0Var2 = (z0) obj;
        se1 se1Var = z0Var2.b;
        if (!kr1.n(str, z0Var2.a)) {
            return false;
        }
        se1 se1Var2 = z0Var.b;
        if (se1Var2 != null || se1Var == null) {
            return se1Var2 == null || se1Var != null;
        }
        return false;
    }

    private static final String createStateDescriptionForTextField(ze3 ze3Var, Resources resources) {
        ue3 ue3VarI = new ze3(ze3Var.a, true, ze3Var.c, ze3Var.d).i();
        ff3 ff3Var = cf3.a;
        fi2 fi2Var = ue3VarI.c;
        Object objG = fi2Var.g(ff3Var);
        if (objG == null) {
            objG = null;
        }
        Collection collection = (Collection) objG;
        if (collection == null || collection.isEmpty()) {
            Object objG2 = fi2Var.g(cf3.z);
            if (objG2 == null) {
                objG2 = null;
            }
            Collection collection2 = (Collection) objG2;
            if (collection2 == null || collection2.isEmpty()) {
                Object objG3 = fi2Var.g(cf3.D);
                if (objG3 == null) {
                    objG3 = null;
                }
                CharSequence charSequence = (CharSequence) objG3;
                if (charSequence == null || charSequence.length() == 0) {
                    return resources.getString(R.string.state_empty);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean enabled(ze3 ze3Var) {
        return !ze3Var.i().c.c(cf3.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean excludeLineAndPageGranularities(ze3 ze3Var) {
        boolean zN;
        if (ze3Var.d.c.c(cf3.D)) {
            Object objG = ze3Var.d.c.g(cf3.k);
            if (objG == null) {
                objG = null;
            }
            if (!kr1.n(objG, Boolean.TRUE)) {
                return true;
            }
        }
        ux1 ux1VarFindClosestParentNode = findClosestParentNode(ze3Var.c, AndroidComposeViewAccessibilityDelegateCompat_androidKt$excludeLineAndPageGranularities$ancestor$1.INSTANCE);
        if (ux1VarFindClosestParentNode != null) {
            ue3 ue3VarV = ux1VarFindClosestParentNode.v();
            if (ue3VarV != null) {
                Object objG2 = ue3VarV.c.g(cf3.k);
                zN = kr1.n(objG2 != null ? objG2 : null, Boolean.TRUE);
            } else {
                zN = false;
            }
            if (!zN) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ux1 findClosestParentNode(ux1 ux1Var, le1 le1Var) {
        for (ux1 ux1VarT = ux1Var.t(); ux1VarT != null; ux1VarT = ux1VarT.t()) {
            if (((Boolean) le1Var.invoke(ux1VarT)).booleanValue()) {
                return ux1VarT;
            }
        }
        return null;
    }

    private static final void geometryDepthFirstSearch(ze3 ze3Var, ArrayList<ze3> arrayList, dh2 dh2Var, gq1 gq1Var, Resources resources) {
        boolean zIsRtl = isRtl(ze3Var);
        ue3 ue3Var = ze3Var.d;
        int i = ze3Var.g;
        ff3 ff3Var = cf3.m;
        AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1 androidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1 = AndroidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1.INSTANCE;
        Object objG = ue3Var.c.g(ff3Var);
        if (objG == null) {
            objG = androidComposeViewAccessibilityDelegateCompat_androidKt$geometryDepthFirstSearch$isTraversalGroup$1.invoke();
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || isScreenReaderFocusable(ze3Var, resources)) && gq1Var.a(i)) {
            arrayList.add(ze3Var);
        }
        if (zBooleanValue) {
            dh2Var.h(i, subtreeSortedByGeometryGrouping(zIsRtl, ze3.h(ze3Var, 7), gq1Var, resources));
            return;
        }
        List listH = ze3.h(ze3Var, 7);
        int size = listH.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch((ze3) listH.get(i2), arrayList, dh2Var, gq1Var, resources);
        }
    }

    public static final boolean getDisableContentCapture() {
        return ContentCaptureManager$Companion.isEnabled();
    }

    @cv0
    public static /* synthetic */ void getDisableContentCapture$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getInfoIsCheckable(ze3 ze3Var) {
        Object objG = ze3Var.d.c.g(cf3.H);
        if (objG == null) {
            objG = null;
        }
        e14 e14Var = (e14) objG;
        fi2 fi2Var = ze3Var.d.c;
        Object objG2 = fi2Var.g(cf3.w);
        if (objG2 == null) {
            objG2 = null;
        }
        n73 n73Var = (n73) objG2;
        boolean z = e14Var != null;
        Object objG3 = fi2Var.g(cf3.G);
        if (((Boolean) (objG3 != null ? objG3 : null)) == null || (n73Var != null && n73Var.a == 4)) {
            return z;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getInfoStateDescriptionOrNull(ze3 ze3Var, Resources resources) {
        int iX;
        Object objG = ze3Var.d.c.g(cf3.b);
        if (objG == null) {
            objG = null;
        }
        fi2 fi2Var = ze3Var.d.c;
        Object objG2 = fi2Var.g(cf3.H);
        if (objG2 == null) {
            objG2 = null;
        }
        e14 e14Var = (e14) objG2;
        Object objG3 = fi2Var.g(cf3.w);
        if (objG3 == null) {
            objG3 = null;
        }
        n73 n73Var = (n73) objG3;
        if (e14Var != null) {
            int iOrdinal = e14Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && objG == null) {
                        objG = resources.getString(R.string.indeterminate);
                    }
                } else if (n73Var != null && n73Var.a == 2 && objG == null) {
                    objG = resources.getString(R.string.state_off);
                }
            } else if (n73Var != null && n73Var.a == 2 && objG == null) {
                objG = resources.getString(R.string.state_on);
            }
        }
        Object objG4 = fi2Var.g(cf3.G);
        if (objG4 == null) {
            objG4 = null;
        }
        Boolean bool = (Boolean) objG4;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((n73Var == null || n73Var.a != 4) && objG == null) {
                objG = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object objG5 = fi2Var.g(cf3.c);
        h03 h03Var = (h03) (objG5 != null ? objG5 : null);
        if (h03Var != null) {
            if (h03Var != h03.d) {
                if (objG == null) {
                    od0 od0Var = h03Var.b;
                    float f = od0Var.b;
                    float f2 = od0Var.a;
                    float f3 = f - f2 == 0.0f ? 0.0f : (h03Var.a - f2) / (od0Var.b - f2);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    if (f3 == 0.0f) {
                        iX = 0;
                    } else {
                        iX = f3 == 1.0f ? 100 : py.x(Math.round(f3 * 100.0f), 1, 99);
                    }
                    objG = resources.getString(R.string.template_percent, Integer.valueOf(iX));
                }
            } else if (objG == null) {
                objG = resources.getString(R.string.in_progress);
            }
        }
        if (fi2Var.c(cf3.D)) {
            objG = createStateDescriptionForTextField(ze3Var, resources);
        }
        return (String) objG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hg getInfoText(ze3 ze3Var) {
        Object objG = ze3Var.d.c.g(cf3.D);
        if (objG == null) {
            objG = null;
        }
        hg hgVar = (hg) objG;
        Object objG2 = ze3Var.d.c.g(cf3.z);
        if (objG2 == null) {
            objG2 = null;
        }
        List list = (List) objG2;
        return hgVar == null ? list != null ? (hg) ke0.z0(list) : null : hgVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isRtl(ze3 ze3Var) {
        return ze3Var.c.H == dx1.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScreenReaderFocusable(ze3 ze3Var, Resources resources) {
        Object objG = ze3Var.d.c.g(cf3.a);
        if (objG == null) {
            objG = null;
        }
        List list = (List) objG;
        return !SemanticsUtils_androidKt.isHidden(ze3Var) && (ze3Var.d.h || (ze3Var.l() && ((list != null ? (String) ke0.z0(list) : null) != null || getInfoText(ze3Var) != null || getInfoStateDescriptionOrNull(ze3Var, resources) != null || getInfoIsCheckable(ze3Var))));
    }

    private static final boolean placedEntryRowOverlaps(ArrayList<ps2> arrayList, ze3 ze3Var) {
        float f = ze3Var.f().b;
        float f2 = ze3Var.f().d;
        boolean z = f >= f2;
        int iH = kr1.H(arrayList);
        if (iH >= 0) {
            int i = 0;
            while (true) {
                h43 h43Var = (h43) arrayList.get(i).c;
                float f3 = h43Var.b;
                float f4 = h43Var.d;
                boolean z2 = f3 >= f4;
                if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                    arrayList.set(i, new ps2(new h43(Math.max(h43Var.a, 0.0f), Math.max(h43Var.b, f), Math.min(h43Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), arrayList.get(i).d));
                    ((List) arrayList.get(i).d).add(ze3Var);
                    return true;
                }
                if (i != iH) {
                    i++;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean propertiesDeleted(ze3 ze3Var, ue3 ue3Var) {
        Iterator it = ue3Var.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ue3 ue3VarI = ze3Var.i();
            if (!ue3VarI.c.c((ff3) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public static final void setDisableContentCapture(boolean z) {
        ContentCaptureManager$Companion.setEnabled(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setTraversalValues(gq1 gq1Var, bh2 bh2Var, bh2 bh2Var2, Resources resources) {
        bh2Var.a();
        bh2Var2.a();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) gq1Var.b(-1);
        ze3 semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        semanticsNode.getClass();
        List<ze3> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(isRtl(semanticsNode), kr1.T(semanticsNode), gq1Var, resources);
        int iH = kr1.H(listSubtreeSortedByGeometryGrouping);
        int i = 1;
        if (1 > iH) {
            return;
        }
        while (true) {
            int i2 = listSubtreeSortedByGeometryGrouping.get(i - 1).g;
            int i3 = listSubtreeSortedByGeometryGrouping.get(i).g;
            bh2Var.f(i2, i3);
            bh2Var2.f(i3, i2);
            if (i == iH) {
                return;
            } else {
                i++;
            }
        }
    }

    private static final List<ze3> sortByGeometryGroupings(boolean z, ArrayList<ze3> arrayList, Resources resources, dh2 dh2Var) {
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size = arrayList.size() - 1;
        int size2 = 0;
        if (size >= 0) {
            int i = 0;
            while (true) {
                ze3 ze3Var = arrayList.get(i);
                if (i == 0 || !placedEntryRowOverlaps(arrayList2, ze3Var)) {
                    arrayList2.add(new ps2(ze3Var.f(), kr1.V(ze3Var)));
                }
                if (i == size) {
                    break;
                }
                i++;
            }
        }
        oe0.r0(arrayList2, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList3 = new ArrayList();
        Comparator<ze3> comparator = semanticComparators[!z ? 1 : 0];
        int size3 = arrayList2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ps2 ps2Var = (ps2) arrayList2.get(i2);
            oe0.r0((List) ps2Var.d, comparator);
            arrayList3.addAll((Collection) ps2Var.d);
        }
        oe0.r0(arrayList3, new y9(size2, UnmergedConfigComparator));
        while (size2 <= arrayList3.size() - 1) {
            List list = (List) dh2Var.b(((ze3) arrayList3.get(size2)).g);
            if (list != null) {
                if (isScreenReaderFocusable((ze3) arrayList3.get(size2), resources)) {
                    size2++;
                } else {
                    arrayList3.remove(size2);
                }
                arrayList3.addAll(size2, list);
                size2 += list.size();
            } else {
                size2++;
            }
        }
        return arrayList3;
    }

    public static List sortByGeometryGroupings$default(boolean z, ArrayList arrayList, Resources resources, dh2 dh2Var, int i, Object obj) {
        if ((i & 8) != 0) {
            dh2 dh2Var2 = hq1.a;
            dh2Var = new dh2();
        }
        return sortByGeometryGroupings(z, arrayList, resources, dh2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$5(ne1 ne1Var, Object obj, Object obj2) {
        return ((Number) ne1Var.invoke(obj, obj2)).intValue();
    }

    private static final List<ze3> subtreeSortedByGeometryGrouping(boolean z, List<ze3> list, gq1 gq1Var, Resources resources) {
        dh2 dh2Var = hq1.a;
        dh2 dh2Var2 = new dh2();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            geometryDepthFirstSearch(list.get(i), arrayList, dh2Var2, gq1Var, resources);
        }
        return sortByGeometryGroupings(z, arrayList, resources, dh2Var2);
    }
}

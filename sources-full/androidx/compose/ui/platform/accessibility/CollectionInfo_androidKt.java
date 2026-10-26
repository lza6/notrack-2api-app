package androidx.compose.ui.platform.accessibility;

import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.cf3;
import defpackage.ff3;
import defpackage.he0;
import defpackage.ie0;
import defpackage.je1;
import defpackage.k62;
import defpackage.ke0;
import defpackage.ln2;
import defpackage.m51;
import defpackage.n1;
import defpackage.o1;
import defpackage.p1;
import defpackage.ue3;
import defpackage.ww1;
import defpackage.z21;
import defpackage.ze3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionInfo_androidKt {

    /* JADX INFO: renamed from: androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt$toAccessibilityCollectionItemInfo$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ww1 implements je1 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.je1
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean calculateIfHorizontallyStacked(List<ze3> list) {
        List list2;
        long j;
        if (list.size() >= 2) {
            if (list.size() <= 1) {
                list2 = z21.c;
            } else {
                ArrayList arrayList = new ArrayList();
                ze3 ze3Var = list.get(0);
                int size = list.size() - 1;
                int i = 0;
                while (i < size) {
                    i++;
                    ze3 ze3Var2 = list.get(i);
                    ze3 ze3Var3 = ze3Var2;
                    ze3 ze3Var4 = ze3Var;
                    arrayList.add(new ln2((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (ze3Var4.e().c() >> 32)) - Float.intBitsToFloat((int) (ze3Var3.e().c() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (ze3Var4.e().c() & 4294967295L)) - Float.intBitsToFloat((int) (ze3Var3.e().c() & 4294967295L))))) & 4294967295L)));
                    ze3Var = ze3Var2;
                }
                list2 = arrayList;
            }
            if (list2.size() == 1) {
                j = ((ln2) ke0.y0(list2)).a;
            } else {
                if (list2.isEmpty()) {
                    k62.b("Empty collection can't be reduced.");
                }
                Object objY0 = ke0.y0(list2);
                int size2 = list2.size() - 1;
                if (1 <= size2) {
                    int i2 = 1;
                    while (true) {
                        objY0 = new ln2(ln2.i(((ln2) objY0).a, ((ln2) list2.get(i2)).a));
                        if (i2 == size2) {
                            break;
                        }
                        i2++;
                    }
                }
                j = ((ln2) objY0).a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j)) >= Float.intBitsToFloat((int) (j >> 32))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean hasCollectionInfo(ze3 ze3Var) {
        Object objG = ze3Var.i().c.g(cf3.f);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            return true;
        }
        Object objG2 = ze3Var.i().c.g(cf3.e);
        return (objG2 != null ? objG2 : null) != null;
    }

    private static final boolean isLazyCollection(he0 he0Var) {
        return he0Var.a < 0 || he0Var.b < 0;
    }

    public static final void setCollectionInfo(ze3 ze3Var, p1 p1Var) {
        Object objG = ze3Var.i().c.g(cf3.f);
        if (objG == null) {
            objG = null;
        }
        he0 he0Var = (he0) objG;
        if (he0Var != null) {
            n1 accessibilityCollectionInfo = toAccessibilityCollectionInfo(he0Var);
            p1Var.a.setCollectionInfo(accessibilityCollectionInfo != null ? (AccessibilityNodeInfo.CollectionInfo) accessibilityCollectionInfo.a : null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object objG2 = ze3Var.i().c.g(cf3.e);
        if ((objG2 != null ? objG2 : null) != null) {
            List listH = ze3.h(ze3Var, 4);
            int size = listH.size();
            for (int i = 0; i < size; i++) {
                ze3 ze3Var2 = (ze3) listH.get(i);
                if (ze3Var2.i().c.c(cf3.G)) {
                    arrayList.add(ze3Var2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
        p1Var.a.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(zCalculateIfHorizontallyStacked ? 1 : arrayList.size(), zCalculateIfHorizontallyStacked ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(ze3 ze3Var, p1 p1Var) {
        Object objG = ze3Var.i().c.g(cf3.g);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            m51.t();
            return;
        }
        ze3 ze3VarJ = ze3Var.j();
        if (ze3VarJ == null) {
            return;
        }
        Object objG2 = ze3VarJ.i().c.g(cf3.e);
        if (objG2 == null) {
            objG2 = null;
        }
        if (objG2 != null) {
            Object objG3 = ze3VarJ.i().c.g(cf3.f);
            he0 he0Var = (he0) (objG3 != null ? objG3 : null);
            if (he0Var == null || !isLazyCollection(he0Var)) {
                if (ze3Var.i().c.c(cf3.G)) {
                    ArrayList arrayList = new ArrayList();
                    List listH = ze3.h(ze3VarJ, 4);
                    int size = listH.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        ze3 ze3Var2 = (ze3) listH.get(i2);
                        if (ze3Var2.i().c.c(cf3.G)) {
                            arrayList.add(ze3Var2);
                            if (ze3Var2.c.u() < ze3Var.c.u()) {
                                i++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zCalculateIfHorizontallyStacked = calculateIfHorizontallyStacked(arrayList);
                    int i3 = zCalculateIfHorizontallyStacked ? 0 : i;
                    int i4 = zCalculateIfHorizontallyStacked ? i : 0;
                    ue3 ue3VarI = ze3Var.i();
                    ff3 ff3Var = cf3.G;
                    CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1 = CollectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.INSTANCE;
                    Object objG4 = ue3VarI.c.g(ff3Var);
                    if (objG4 == null) {
                        objG4 = collectionInfo_androidKt$setCollectionItemInfo$itemInfo$1.invoke();
                    }
                    p1Var.a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i3, 1, i4, 1, false, ((Boolean) objG4).booleanValue()));
                }
            }
        }
    }

    private static final n1 toAccessibilityCollectionInfo(he0 he0Var) {
        return new n1(AccessibilityNodeInfo.CollectionInfo.obtain(he0Var.a, he0Var.b, false, 0));
    }

    private static final o1 toAccessibilityCollectionItemInfo(ie0 ie0Var, ze3 ze3Var) {
        throw null;
    }
}

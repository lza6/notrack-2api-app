package androidx.compose.ui.platform;

import defpackage.h43;
import defpackage.ps2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class TopBottomBoundsComparator implements Comparator<ps2> {
    public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

    private TopBottomBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(ps2 ps2Var, ps2 ps2Var2) {
        int iCompare = Float.compare(((h43) ps2Var.c).b, ((h43) ps2Var2.c).b);
        return iCompare != 0 ? iCompare : Float.compare(((h43) ps2Var.c).d, ((h43) ps2Var2.c).d);
    }
}

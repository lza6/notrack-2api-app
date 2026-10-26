package androidx.compose.ui.platform;

import defpackage.h43;
import defpackage.ze3;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class RtlBoundsComparator implements Comparator<ze3> {
    public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

    private RtlBoundsComparator() {
    }

    @Override // java.util.Comparator
    public int compare(ze3 ze3Var, ze3 ze3Var2) {
        h43 h43VarF = ze3Var.f();
        h43 h43VarF2 = ze3Var2.f();
        int iCompare = Float.compare(h43VarF2.c, h43VarF.c);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(h43VarF.b, h43VarF2.b);
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(h43VarF.d, h43VarF2.d);
        return iCompare3 != 0 ? iCompare3 : Float.compare(h43VarF2.a, h43VarF.a);
    }
}

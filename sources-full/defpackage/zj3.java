package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zj3 implements Iterable, gu1 {
    public final yj3 c;
    public final int d;
    public final int h;

    public zj3(yj3 yj3Var, int i, int i2) {
        this.c = yj3Var;
        this.d = i;
        this.h = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i;
        ArrayList arrayList;
        int iD;
        yj3 yj3Var = this.c;
        if (yj3Var.p != this.h) {
            ak3.e();
        }
        HashMap map = yj3Var.r;
        h8 h8Var = null;
        int i2 = this.d;
        if (map != null) {
            if (yj3Var.o) {
                mk0.c("use active SlotWriter to crate an anchor for location instead");
            }
            if (i2 >= 0 && i2 < (i = yj3Var.d) && (iD = ak3.d((arrayList = yj3Var.q), i2, i)) >= 0) {
                h8Var = (h8) arrayList.get(iD);
            }
            if (h8Var != null) {
            }
        }
        return new wg1(yj3Var, i2 + 1, yj3Var.c[(i2 * 5) + 3] + i2);
    }
}

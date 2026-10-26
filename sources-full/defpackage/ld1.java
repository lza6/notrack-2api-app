package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ld1 implements kd1 {
    public final int a;
    public final /* synthetic */ nd1 b;

    public ld1(nd1 nd1Var, int i) {
        this.b = nd1Var;
        this.a = i;
    }

    @Override // defpackage.kd1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        nd1 nd1Var = this.b;
        xc1 xc1Var = nd1Var.z;
        int i = this.a;
        if (xc1Var == null || i >= 0 || !xc1Var.i().T(-1, 0)) {
            return nd1Var.U(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}

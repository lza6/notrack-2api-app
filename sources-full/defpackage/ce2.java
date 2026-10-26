package defpackage;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class ce2 {
    public final SparseArray a;
    public h74 b;

    public ce2(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(h74 h74Var, int i, int i2) {
        int iA = h74Var.a(i);
        SparseArray sparseArray = this.a;
        ce2 ce2Var = sparseArray == null ? null : (ce2) sparseArray.get(iA);
        if (ce2Var == null) {
            ce2Var = new ce2(1);
            sparseArray.put(h74Var.a(i), ce2Var);
        }
        if (i2 > i) {
            ce2Var.a(h74Var, i + 1, i2);
        } else {
            ce2Var.b = h74Var;
        }
    }
}

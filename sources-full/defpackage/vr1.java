package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class vr1 {
    public final bi4 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public vr1(bi4 bi4Var, int[] iArr, String[] strArr) {
        this.a = bi4Var;
        this.b = iArr;
        this.c = strArr;
        this.d = strArr.length == 0 ? f31.c : py.R(strArr[0]);
        if (iArr.length == strArr.length) {
            return;
        }
        u41.r("Check failed.");
        throw null;
    }

    public final void a(Set set) {
        set.getClass();
        int[] iArr = this.b;
        int length = iArr.length;
        Collection collectionP = f31.c;
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                ig3 ig3Var = new ig3();
                int length2 = iArr.length;
                int i2 = 0;
                while (i < length2) {
                    int i3 = i2 + 1;
                    if (set.contains(Integer.valueOf(iArr[i]))) {
                        ig3Var.add(this.c[i2]);
                    }
                    i++;
                    i2 = i3;
                }
                collectionP = py.p(ig3Var);
            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                collectionP = this.d;
            }
        }
        if (collectionP.isEmpty()) {
            return;
        }
        ((jy) this.a.d).i(w84.a);
    }
}

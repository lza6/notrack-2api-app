package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qg1 implements rg1 {
    public final ArrayList a(int i, int i2) {
        int i3 = i - (3 * i2);
        int i4 = i3 / 4;
        int i5 = i3 % 4;
        ArrayList arrayList = new ArrayList(4);
        int i6 = 0;
        while (i6 < 4) {
            arrayList.add(Integer.valueOf((i6 < i5 ? 1 : 0) + i4));
            i6++;
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return obj instanceof qg1;
    }

    public final int hashCode() {
        return -4;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface vb2 {
    default int a(er1 er1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new zs0((qb2) list.get(i3), fr1.d, hr1.d, i2));
        }
        return c(new qr1(er1Var, er1Var.getLayoutDirection()), arrayList, wm0.b(i, 0, 13)).getHeight();
    }

    default int b(er1 er1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new zs0((qb2) list.get(i3), fr1.d, hr1.c, i2));
        }
        return c(new qr1(er1Var, er1Var.getLayoutDirection()), arrayList, wm0.b(0, i, 7)).getWidth();
    }

    wb2 c(xb2 xb2Var, List list, long j);

    default int d(er1 er1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new zs0((qb2) list.get(i3), fr1.c, hr1.d, i2));
        }
        return c(new qr1(er1Var, er1Var.getLayoutDirection()), arrayList, wm0.b(i, 0, 13)).getHeight();
    }

    default int e(er1 er1Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(new zs0((qb2) list.get(i3), fr1.c, hr1.c, i2));
        }
        return c(new qr1(er1Var, er1Var.getLayoutDirection()), arrayList, wm0.b(0, i, 7)).getWidth();
    }
}

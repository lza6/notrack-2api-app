package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v42 extends f0 {
    public final int a;

    public v42(int i) {
        this.a = i;
    }

    @Override // defpackage.f0
    public final void e(iy2 iy2Var) {
        f0 f0Var;
        f0 f0Var2;
        ArrayList arrayList = (ArrayList) iy2Var.d;
        ArrayList arrayList2 = (ArrayList) iy2Var.h;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        do {
            f0Var = null;
            if (i2 >= size) {
                f0Var2 = null;
                break;
            } else {
                Object obj = arrayList2.get(i2);
                i2++;
                f0Var2 = (f0) obj;
            }
        } while (!ba2.class.isAssignableFrom(f0Var2.getClass()));
        if (f0Var2 == null) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                f0 f0Var3 = (f0) obj2;
                if (ba2.class.isAssignableFrom(f0Var3.getClass())) {
                    f0Var = f0Var3;
                    break;
                }
            }
            if (f0Var == null) {
                throw new IllegalStateException("Requested plugin is not added: " + ba2.class.getName() + ", plugins: " + arrayList);
            }
            iy2Var.b(f0Var);
            f0Var2 = f0Var;
        }
        ((ba2) f0Var2).d.add(new u42(this.a));
    }
}

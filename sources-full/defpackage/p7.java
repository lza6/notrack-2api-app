package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p7 implements vb2 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;

    public p7(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public static final void f(ArrayList arrayList, o43 o43Var, xb2 xb2Var, float f, ArrayList arrayList2, ArrayList arrayList3, o43 o43Var2, ArrayList arrayList4, o43 o43Var3, o43 o43Var4) {
        if (!arrayList.isEmpty()) {
            o43Var.c = xb2Var.O(f) + o43Var.c;
        }
        arrayList.add(0, ke0.O0(arrayList2));
        arrayList3.add(Integer.valueOf(o43Var2.c));
        arrayList4.add(Integer.valueOf(o43Var.c));
        o43Var.c += o43Var2.c;
        o43Var3.c = Math.max(o43Var3.c, o43Var4.c);
        arrayList2.clear();
        o43Var4.c = 0;
        o43Var2.c = 0;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        nv2 nv2Var;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        o43 o43Var = new o43();
        o43 o43Var2 = new o43();
        ArrayList arrayList4 = new ArrayList();
        o43 o43Var3 = new o43();
        o43 o43Var4 = new o43();
        int size = list.size();
        int i = 0;
        while (i < size) {
            nv2 nv2VarC = ((qb2) list.get(i)).c(j);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i2 = size;
            float f = this.a;
            if (zIsEmpty) {
                nv2Var = nv2VarC;
            } else {
                ArrayList arrayList5 = arrayList;
                o43 o43Var5 = o43Var2;
                if (xb2Var.O(f) + o43Var3.c + nv2VarC.c <= um0.h(j)) {
                    arrayList = arrayList5;
                    o43Var2 = o43Var5;
                    nv2Var = nv2VarC;
                } else {
                    o43Var2 = o43Var5;
                    nv2Var = nv2VarC;
                    arrayList = arrayList5;
                    f(arrayList, o43Var2, xb2Var, this.b, arrayList4, arrayList2, o43Var4, arrayList3, o43Var, o43Var3);
                }
            }
            if (!arrayList4.isEmpty()) {
                o43Var3.c = xb2Var.O(f) + o43Var3.c;
            }
            arrayList4.add(nv2Var);
            o43Var3.c += nv2Var.c;
            o43Var4.c = Math.max(o43Var4.c, nv2Var.d);
            i++;
            size = i2;
        }
        if (!arrayList4.isEmpty()) {
            f(arrayList, o43Var2, xb2Var, this.b, arrayList4, arrayList2, o43Var4, arrayList3, o43Var, o43Var3);
        }
        int iMax = Math.max(o43Var.c, um0.j(j));
        return xb2Var.s(iMax, Math.max(o43Var2.c, um0.i(j)), a31.c, new o7(arrayList, xb2Var, this.a, iMax, arrayList3));
    }
}

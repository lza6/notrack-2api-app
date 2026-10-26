package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tc implements vb2 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ tc(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.vb2
    public final wb2 c(xb2 xb2Var, List list, long j) {
        ArrayList arrayList;
        ps2 ps2Var;
        int i = this.a;
        a31 a31Var = a31.c;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((rx2) obj).setParentLayoutDirection((dx1) obj2);
                return xb2Var.s(0, 0, a31Var, v1.n);
            case 1:
                nv2 nv2VarC = ((qb2) list.get(0)).c(j);
                nv2 nv2VarC2 = ((qb2) list.get(1)).c(j);
                return xb2Var.s(nv2VarC2.c, nv2VarC2.d, a31Var, new cp0((h01) obj, nv2VarC, nv2VarC2, (mi2) obj2, 4));
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (!(((qb2) obj3).i() instanceof kz3)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((je1) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int i3 = 0;
                    for (int size2 = list2.size(); i3 < size2; size2 = size2) {
                        h43 h43Var = (h43) list2.get(i3);
                        if (h43Var != null) {
                            float f = h43Var.b;
                            float f2 = h43Var.a;
                            ps2Var = new ps2(((qb2) arrayList2.get(i3)).c(wm0.b((int) Math.floor(h43Var.c - f2), (int) Math.floor(h43Var.d - f), 5)), new iq1((((long) Math.round(f2)) << 32) | (((long) Math.round(f)) & 4294967295L)));
                        } else {
                            ps2Var = null;
                        }
                        if (ps2Var != null) {
                            arrayList3.add(ps2Var);
                        }
                        i3++;
                        list2 = list2;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Object obj4 = list.get(i4);
                    if (((qb2) obj4).i() instanceof kz3) {
                        arrayList4.add(obj4);
                    }
                }
                return xb2Var.s(um0.h(j), um0.g(j), a31Var, new sg2(arrayList, 18, gt.b(arrayList4, (je1) obj)));
        }
    }
}

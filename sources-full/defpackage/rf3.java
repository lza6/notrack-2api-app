package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class rf3 extends sf3 {
    public static Object Y(g71 g71Var) {
        f71 f71Var = new f71(g71Var);
        if (f71Var.hasNext()) {
            return f71Var.next();
        }
        return null;
    }

    public static pf3 Z(Object obj, le1 le1Var) {
        return obj == null ? e31.a : new su0(new wl(18, obj), le1Var, 1);
    }

    public static g71 a0(pf3 pf3Var, le1 le1Var) {
        return new g71(new su0(pf3Var, le1Var, 2), false, new s80(19));
    }

    public static List b0(pf3 pf3Var) {
        Iterator it = pf3Var.iterator();
        if (!it.hasNext()) {
            return z21.c;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return kr1.T(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

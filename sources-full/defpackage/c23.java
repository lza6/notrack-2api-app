package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c23 {
    public xm4 a;

    public void a(List list) {
        if (list.isEmpty()) {
            u41.k("Product list cannot be empty.");
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d23 d23Var = (d23) it.next();
            if (!"play_pass_subs".equals(d23Var.b)) {
                hashSet.add(d23Var.b);
            }
        }
        if (hashSet.size() <= 1) {
            this.a = xm4.o(list);
        } else {
            u41.k("All products should be of the same product type.");
        }
    }
}

package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class yn implements an2 {
    public static final yn a = new yn();
    public static final u61 b;
    public static final u61 c;

    static {
        bn bnVar = new bn(1);
        HashMap map = new HashMap();
        map.put(i13.class, bnVar);
        b = new u61("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(map)));
        bn bnVar2 = new bn(3);
        HashMap map2 = new HashMap();
        map2.put(i13.class, bnVar2);
        c = new u61("reason", Collections.unmodifiableMap(new HashMap(map2)));
    }

    @Override // defpackage.h31
    public final void a(Object obj, Object obj2) {
        r72 r72Var = (r72) obj;
        bn2 bn2Var = (bn2) obj2;
        bn2Var.d(b, r72Var.a);
        bn2Var.a(c, r72Var.b);
    }
}

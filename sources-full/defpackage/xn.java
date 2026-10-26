package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xn implements an2 {
    public static final xn a = new xn();
    public static final u61 b;

    static {
        bn bnVar = new bn(1);
        HashMap map = new HashMap();
        map.put(i13.class, bnVar);
        b = new u61("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // defpackage.h31
    public final void a(Object obj, Object obj2) {
        ((bn2) obj2).a(b, ((mf1) obj).a);
    }
}

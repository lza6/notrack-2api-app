package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class wn implements an2 {
    public static final wn a = new wn();
    public static final u61 b;
    public static final u61 c;
    public static final u61 d;
    public static final u61 e;

    static {
        bn bnVar = new bn(1);
        HashMap map = new HashMap();
        map.put(i13.class, bnVar);
        b = new u61("window", Collections.unmodifiableMap(new HashMap(map)));
        bn bnVar2 = new bn(2);
        HashMap map2 = new HashMap();
        map2.put(i13.class, bnVar2);
        c = new u61("logSourceMetrics", Collections.unmodifiableMap(new HashMap(map2)));
        bn bnVar3 = new bn(3);
        HashMap map3 = new HashMap();
        map3.put(i13.class, bnVar3);
        d = new u61("globalMetrics", Collections.unmodifiableMap(new HashMap(map3)));
        bn bnVar4 = new bn(4);
        HashMap map4 = new HashMap();
        map4.put(i13.class, bnVar4);
        e = new u61("appNamespace", Collections.unmodifiableMap(new HashMap(map4)));
    }

    @Override // defpackage.h31
    public final void a(Object obj, Object obj2) {
        kd0 kd0Var = (kd0) obj;
        bn2 bn2Var = (bn2) obj2;
        bn2Var.a(b, kd0Var.a);
        bn2Var.a(c, kd0Var.b);
        bn2Var.a(d, kd0Var.c);
        bn2Var.a(e, kd0Var.d);
    }
}

package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class fq4 {
    public static final fq4 b = new fq4();
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public final jq4 a(Class cls) {
        jq4 jq4VarU;
        ConcurrentHashMap concurrentHashMap = this.a;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (jq4) obj;
        }
        zf3 zf3Var = kq4.a;
        if (!sp4.class.isAssignableFrom(cls)) {
            int i = gp4.a;
        }
        int i2 = gp4.a;
        if (!sp4.class.isAssignableFrom(cls)) {
            u41.k("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            iq4 iq4Var = (iq4) sp4.m(cls.asSubclass(sp4.class)).j(3);
            if ((iq4Var.d & 2) == 2) {
                jq4VarU = new eq4(kq4.a, iq4Var.a);
            } else {
                jq4VarU = dq4.u(iq4Var, kq4.a, iq4Var.a() + (-1) != 1 ? pp4.a : null);
            }
            jq4 jq4Var = (jq4) concurrentHashMap.putIfAbsent(cls, jq4VarU);
            return jq4Var != null ? jq4Var : jq4VarU;
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }
}

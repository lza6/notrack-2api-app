package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j13 {
    public static final j13 c = new j13();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final jb a = new jb(1);

    public final za3 a(Class cls) {
        za3 za3VarB;
        Class cls2;
        zq1.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.b;
        za3 za3Var = (za3) concurrentHashMap.get(cls);
        if (za3Var != null) {
            return za3Var;
        }
        jb jbVar = this.a;
        jbVar.getClass();
        Class cls3 = cb3.a;
        if (!ef1.class.isAssignableFrom(cls) && (cls2 = cb3.a) != null && !cls2.isAssignableFrom(cls)) {
            u41.k("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
            return null;
        }
        o23 o23VarA = ((k92) jbVar.d).a(cls);
        if ((o23VarA.d & 2) == 2) {
            if (ef1.class.isAssignableFrom(cls)) {
                za3VarB = new wd2(cb3.d, d61.a, o23VarA.a);
            } else {
                z84 z84Var = cb3.b;
                c61 c61Var = d61.b;
                if (c61Var == null) {
                    u41.r("Protobuf runtime is not correctly loaded.");
                    return null;
                }
                za3VarB = new wd2(z84Var, c61Var, o23VarA.a);
            }
        } else if (ef1.class.isAssignableFrom(cls)) {
            za3VarB = (o23VarA.d & 1) == 1 ? vd2.B(o23VarA, ml2.b, g52.b, cb3.d, d61.a, v92.b) : vd2.B(o23VarA, ml2.b, g52.b, cb3.d, null, v92.b);
        } else if ((o23VarA.d & 1) == 1) {
            ll2 ll2Var = ml2.a;
            e52 e52Var = g52.a;
            z84 z84Var2 = cb3.b;
            c61 c61Var2 = d61.b;
            if (c61Var2 == null) {
                u41.r("Protobuf runtime is not correctly loaded.");
                return null;
            }
            za3VarB = vd2.B(o23VarA, ll2Var, e52Var, z84Var2, c61Var2, v92.a);
        } else {
            za3VarB = vd2.B(o23VarA, ml2.a, g52.a, cb3.c, null, v92.a);
        }
        za3 za3Var2 = (za3) concurrentHashMap.putIfAbsent(cls, za3VarB);
        return za3Var2 != null ? za3Var2 : za3VarB;
    }
}

package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class w43 {
    public static final AtomicReference a;
    public static final ConcurrentHashMap b;
    public static final ConcurrentHashMap c;
    public static final ConcurrentHashMap d;

    static {
        Logger.getLogger(w43.class.getName());
        a = new AtomicReference(new fv1());
        b = new ConcurrentHashMap();
        c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        d = new ConcurrentHashMap();
    }

    public static synchronized void a(String str, Map map, boolean z) {
        if (z) {
            try {
                ConcurrentHashMap concurrentHashMap = c;
                if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            if (((fv1) a.get()).a.containsKey(str)) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!d.containsKey(entry.getKey())) {
                        throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                    }
                }
            } else {
                for (Map.Entry entry2 : map.entrySet()) {
                    if (d.containsKey(entry2.getKey())) {
                        throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                    }
                }
            }
        }
    }

    public static Object b(kr1 kr1Var, Class cls) {
        fz2 fz2Var = (fz2) zh2.b.a.get();
        fz2Var.getClass();
        ez2 ez2Var = new ez2(kr1Var.getClass(), cls);
        HashMap map = fz2Var.a;
        if (map.containsKey(ez2Var)) {
            return ((az2) map.get(ez2Var)).b.a(kr1Var);
        }
        m51.q(ez2Var, " available", "No PrimitiveConstructor for ");
        return null;
    }

    public static Object c(String str, mz mzVar, Class cls) {
        fv1 fv1Var = (fv1) a.get();
        fv1Var.getClass();
        ev1 ev1VarA = fv1Var.a(str);
        Set setKeySet = ((Map) ev1VarA.a.c).keySet();
        sv1 sv1Var = ev1VarA.a;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(sv1Var.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet2 = ((Map) sv1Var.c).keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!((Map) sv1Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + sv1Var.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                g0 g0VarI = sv1Var.i(mzVar);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                sv1Var.k(g0VarI);
                a5 a5Var = (a5) ((Map) sv1Var.c).get(cls);
                if (a5Var != null) {
                    return a5Var.a(g0VarI);
                }
                j93.e(cls.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            } catch (sr1 e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) sv1Var.a).getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static Object d(String str, byte[] bArr) {
        kz kzVar = mz.d;
        return c(str, mz.g(bArr, 0, bArr.length), p4.class);
    }

    public static synchronized xu1 e(ov1 ov1Var) {
        sz0 sz0Var;
        sv1 sv1Var = ((fv1) a.get()).a(ov1Var.B()).a;
        sz0Var = new sz0(sv1Var, (Class) sv1Var.b);
        if (!((Boolean) c.get(ov1Var.B())).booleanValue()) {
            throw new GeneralSecurityException("newKey-operation not permitted for key type " + ov1Var.B());
        }
        return sz0Var.q(ov1Var.C());
    }

    public static synchronized void f(sv1 sv1Var, boolean z) {
        try {
            AtomicReference atomicReference = a;
            fv1 fv1Var = new fv1((fv1) atomicReference.get());
            fv1Var.b(sv1Var);
            String strF = sv1Var.f();
            a(strF, z ? sv1Var.g().b() : Collections.EMPTY_MAP, z);
            if (!((fv1) atomicReference.get()).a.containsKey(strF)) {
                b.put(strF, new rn0(27));
                if (z) {
                    g(strF, sv1Var.g().b());
                }
            }
            c.put(strF, Boolean.valueOf(z));
            atomicReference.set(fv1Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void g(String str, Map map) {
        lr2 lr2Var;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrE = ((g0) ((rv1) entry.getValue()).a).e();
            int i = ((rv1) entry.getValue()).b;
            nv1 nv1VarD = ov1.D();
            nv1VarD.e();
            ov1.w((ov1) nv1VarD.d, str);
            kz kzVarG = mz.g(bArrE, 0, bArrE.length);
            nv1VarD.e();
            ov1.x((ov1) nv1VarD.d, kzVarG);
            int iZ = fq2.z(i);
            if (iZ == 0) {
                lr2Var = lr2.TINK;
            } else if (iZ == 1) {
                lr2Var = lr2.LEGACY;
            } else if (iZ == 2) {
                lr2Var = lr2.RAW;
            } else {
                if (iZ != 3) {
                    u41.k("Unknown output prefix type");
                    return;
                }
                lr2Var = lr2.CRUNCHY;
            }
            nv1VarD.e();
            ov1.y((ov1) nv1VarD.d, lr2Var);
            d.put(str2, new pv1((ov1) nv1VarD.b()));
        }
    }

    public static synchronized void h(jz2 jz2Var) {
        zh2 zh2Var = zh2.b;
        synchronized (zh2Var) {
            fy2 fy2Var = new fy2((fz2) zh2Var.a.get());
            HashMap map = (HashMap) fy2Var.d;
            if (jz2Var != null) {
                Class clsC = jz2Var.c();
                if (map.containsKey(clsC)) {
                    jz2 jz2Var2 = (jz2) map.get(clsC);
                    if (!jz2Var2.equals(jz2Var) || !jz2Var.equals(jz2Var2)) {
                        m51.w(clsC, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type");
                    }
                } else {
                    map.put(clsC, jz2Var);
                }
            } else {
                m51.x("wrapper must be non-null");
            }
            zh2Var.a.set(new fz2(fy2Var));
        }
    }
}

package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class a5 {
    public final Class a;
    public final /* synthetic */ int b;

    public a5(Class cls, int i) {
        this.b = i;
        this.a = cls;
    }

    public final Object a(g0 g0Var) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                w4 w4Var = (w4) g0Var;
                return new wy2(new iy2(w4Var.z().k()), w4Var.A().y());
            case 1:
                j5 j5Var = (j5) g0Var;
                a5[] a5VarArr = {new a5(n5.class, 2)};
                HashMap map = new HashMap();
                for (a5 a5Var : a5VarArr) {
                    boolean zContainsKey = map.containsKey(a5Var.a);
                    Class cls = a5Var.a;
                    if (zContainsKey) {
                        u41.k(ud2.n(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, a5Var);
                }
                if (a5VarArr.length > 0) {
                    Class cls2 = a5VarArr[0].a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                p5 p5VarZ = j5Var.z();
                a5 a5Var2 = (a5) mapUnmodifiableMap.get(n5.class);
                if (a5Var2 == null) {
                    j93.e(n5.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                    return null;
                }
                n5 n5Var = (n5) a5Var2.a(p5VarZ);
                a5[] a5VarArr2 = {new a5(u82.class, 8)};
                HashMap map2 = new HashMap();
                for (a5 a5Var3 : a5VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(a5Var3.a);
                    Class cls3 = a5Var3.a;
                    if (zContainsKey2) {
                        u41.k(ud2.n(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, a5Var3);
                }
                if (a5VarArr2.length > 0) {
                    Class cls4 = a5VarArr2[0].a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                ki1 ki1VarA = j5Var.A();
                a5 a5Var4 = (a5) mapUnmodifiableMap2.get(u82.class);
                if (a5Var4 != null) {
                    return new l31(n5Var, (u82) a5Var4.a(ki1VarA), j5Var.A().B().A());
                }
                j93.e(u82.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            case 2:
                p5 p5Var = (p5) g0Var;
                return new n5(p5Var.B().y(), p5Var.A().k());
            case 3:
                w5 w5Var = (w5) g0Var;
                return new u5(w5Var.A().y(), w5Var.z().k());
            case 4:
                return new e6(0, ((g6) g0Var).y().k());
            case 5:
                return new m6(((o6) g0Var).y().k());
            case 6:
                return new u6(((w6) g0Var).y().k());
            case 7:
                return new e6(2, ((l20) g0Var).y().k());
            case 8:
                ki1 ki1Var = (ki1) g0Var;
                qh1 qh1VarZ = ki1Var.B().z();
                SecretKeySpec secretKeySpec = new SecretKeySpec(ki1Var.A().k(), "HMAC");
                int iA = ki1Var.B().A();
                int iOrdinal = qh1VarZ.ordinal();
                if (iOrdinal == 1) {
                    return new wy2(new bc("HMACSHA1", secretKeySpec), iA);
                }
                if (iOrdinal == 2) {
                    return new wy2(new bc("HMACSHA384", secretKeySpec), iA);
                }
                if (iOrdinal == 3) {
                    return new wy2(new bc("HMACSHA256", secretKeySpec), iA);
                }
                if (iOrdinal == 4) {
                    return new wy2(new bc("HMACSHA512", secretKeySpec), iA);
                }
                if (iOrdinal == 5) {
                    return new wy2(new bc("HMACSHA224", secretKeySpec), iA);
                }
                m51.v("unknown hash");
                return null;
            case 9:
                String strX = ((nw1) g0Var).y().x();
                return pw1.a(strX).c(strX);
            case 10:
                sw1 sw1Var = (sw1) g0Var;
                String strY = sw1Var.y().y();
                return new qw1(sw1Var.y().x(), pw1.a(strY).c(strY));
            default:
                return new e6(3, ((jj4) g0Var).y().k());
        }
    }
}

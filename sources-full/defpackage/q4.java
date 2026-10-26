package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q4 {
    static {
        a5[] a5VarArr = {new a5(p4.class, 1)};
        HashMap map = new HashMap();
        a5 a5Var = a5VarArr[0];
        boolean zContainsKey = map.containsKey(a5Var.a);
        Class cls = a5Var.a;
        if (zContainsKey) {
            u41.k(ud2.n(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, a5Var);
        Class cls2 = a5VarArr[0].a;
        Collections.unmodifiableMap(map);
        a5[] a5VarArr2 = {new a5(p4.class, 4)};
        HashMap map2 = new HashMap();
        a5 a5Var2 = a5VarArr2[0];
        boolean zContainsKey2 = map2.containsKey(a5Var2.a);
        Class cls3 = a5Var2.a;
        if (zContainsKey2) {
            u41.k(ud2.n(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map2.put(cls3, a5Var2);
        Class cls4 = a5VarArr2[0].a;
        Collections.unmodifiableMap(map2);
        a5[] a5VarArr3 = {new a5(p4.class, 5)};
        HashMap map3 = new HashMap();
        a5 a5Var3 = a5VarArr3[0];
        boolean zContainsKey3 = map3.containsKey(a5Var3.a);
        Class cls5 = a5Var3.a;
        if (zContainsKey3) {
            u41.k(ud2.n(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map3.put(cls5, a5Var3);
        Class cls6 = a5VarArr3[0].a;
        Collections.unmodifiableMap(map3);
        a5[] a5VarArr4 = {new a5(p4.class, 3)};
        HashMap map4 = new HashMap();
        a5 a5Var4 = a5VarArr4[0];
        boolean zContainsKey4 = map4.containsKey(a5Var4.a);
        Class cls7 = a5Var4.a;
        if (zContainsKey4) {
            u41.k(ud2.n(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map4.put(cls7, a5Var4);
        Class cls8 = a5VarArr4[0].a;
        Collections.unmodifiableMap(map4);
        a5[] a5VarArr5 = {new a5(p4.class, 9)};
        HashMap map5 = new HashMap();
        a5 a5Var5 = a5VarArr5[0];
        boolean zContainsKey5 = map5.containsKey(a5Var5.a);
        Class cls9 = a5Var5.a;
        if (zContainsKey5) {
            u41.k(ud2.n(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map5.put(cls9, a5Var5);
        Class cls10 = a5VarArr5[0].a;
        Collections.unmodifiableMap(map5);
        a5[] a5VarArr6 = {new a5(p4.class, 10)};
        HashMap map6 = new HashMap();
        a5 a5Var6 = a5VarArr6[0];
        boolean zContainsKey6 = map6.containsKey(a5Var6.a);
        Class cls11 = a5Var6.a;
        if (zContainsKey6) {
            u41.k(ud2.n(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map6.put(cls11, a5Var6);
        Class cls12 = a5VarArr6[0].a;
        Collections.unmodifiableMap(map6);
        a5[] a5VarArr7 = {new a5(p4.class, 7)};
        HashMap map7 = new HashMap();
        a5 a5Var7 = a5VarArr7[0];
        boolean zContainsKey7 = map7.containsKey(a5Var7.a);
        Class cls13 = a5Var7.a;
        if (zContainsKey7) {
            u41.k(ud2.n(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map7.put(cls13, a5Var7);
        Class cls14 = a5VarArr7[0].a;
        Collections.unmodifiableMap(map7);
        a5[] a5VarArr8 = {new a5(p4.class, 11)};
        HashMap map8 = new HashMap();
        a5 a5Var8 = a5VarArr8[0];
        boolean zContainsKey8 = map8.containsKey(a5Var8.a);
        Class cls15 = a5Var8.a;
        if (zContainsKey8) {
            u41.k(ud2.n(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map8.put(cls15, a5Var8);
        Class cls16 = a5VarArr8[0].a;
        Collections.unmodifiableMap(map8);
        int i = x43.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        w43.h(u4.b);
        v82.a();
        w43.f(new c5(j5.class, new a5[]{new a5(p4.class, 1)}, 2), true);
        Class<g6> cls = g6.class;
        w43.f(new c5(cls, new a5[]{new a5(p4.class, 4)}, 4), true);
        at2 at2Var = l6.a;
        hi2 hi2Var = hi2.b;
        hi2Var.e(l6.a);
        hi2Var.d(l6.b);
        hi2Var.c(l6.c);
        hi2Var.b(l6.d);
        if (y04.a()) {
            return;
        }
        Class<w5> cls2 = w5.class;
        w43.f(new c5(cls2, new a5[]{new a5(p4.class, 3)}, 3), true);
        hi2Var.e(d6.a);
        hi2Var.d(d6.b);
        hi2Var.c(d6.c);
        hi2Var.b(d6.d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            Class<o6> cls3 = o6.class;
            w43.f(new c5(cls3, new a5[]{new a5(p4.class, 5)}, 5), true);
            hi2Var.e(t6.a);
            hi2Var.d(t6.b);
            hi2Var.c(t6.c);
            hi2Var.b(t6.d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        Class<l20> cls4 = l20.class;
        w43.f(new c5(cls4, new a5[]{new a5(p4.class, 7)}, 7), true);
        at2 at2Var2 = q20.a;
        hi2 hi2Var2 = hi2.b;
        hi2Var2.e(q20.a);
        hi2Var2.d(q20.b);
        hi2Var2.c(q20.c);
        hi2Var2.b(q20.d);
        w43.f(new c5(nw1.class, new a5[]{new a5(p4.class, 9)}, 8), true);
        Class<sw1> cls5 = sw1.class;
        w43.f(new c5(cls5, new a5[]{new a5(p4.class, 10)}, 9), true);
        Class<jj4> cls6 = jj4.class;
        w43.f(new c5(cls6, new a5[]{new a5(p4.class, 11)}, 10), true);
        hi2Var2.e(nj4.a);
        hi2Var2.d(nj4.b);
        hi2Var2.c(nj4.c);
        hi2Var2.b(nj4.d);
    }
}

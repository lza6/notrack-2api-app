package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import okio.Options$Companion;

/* JADX INFO: loaded from: classes.dex */
public final class or0 {
    public static final or0 b;
    public final HashMap a;

    static {
        or0 or0Var = new or0(new LinkedHashMap());
        Options$Companion.toByteArrayInternalV1(or0Var);
        b = or0Var;
    }

    public or0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.a = new HashMap(linkedHashMap);
    }

    public or0(or0 or0Var) {
        or0Var.getClass();
        this.a = new HashMap(or0Var.a);
    }

    public final boolean a(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && or0.class.equals(obj.getClass())) {
                HashMap map = ((or0) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (kr1.n(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = vl.g0(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return fq2.r(new StringBuilder("Data {"), ke0.D0(this.a.entrySet(), null, null, null, sx.u, 31), "}");
    }
}

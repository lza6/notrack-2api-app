package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y92 extends av1 {
    public static Object R(Object obj, Map map) {
        map.getClass();
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int S(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        return i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : IntCompanionObject.MAX_VALUE;
    }

    public static Map T(ps2... ps2VarArr) {
        if (ps2VarArr.length <= 0) {
            return a31.c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(ps2VarArr.length));
        U(linkedHashMap, ps2VarArr);
        return linkedHashMap;
    }

    public static final void U(HashMap map, ps2[] ps2VarArr) {
        for (ps2 ps2Var : ps2VarArr) {
            map.put(ps2Var.c, ps2Var.d);
        }
    }

    public static Map V(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return a31.c;
        }
        int i = 0;
        if (size == 1) {
            ps2 ps2Var = (ps2) arrayList.get(0);
            ps2Var.getClass();
            Map mapSingletonMap = Collections.singletonMap(ps2Var.c, ps2Var.d);
            mapSingletonMap.getClass();
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ps2 ps2Var2 = (ps2) obj;
            linkedHashMap.put(ps2Var2.c, ps2Var2.d);
        }
        return linkedHashMap;
    }

    public static Map W(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return a31.c;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}

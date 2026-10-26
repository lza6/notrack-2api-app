package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xc0 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public xc0(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            f32 f32Var = (f32) entry.getValue();
            List arrayList = (List) this.a.get(f32Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(f32Var, arrayList);
            }
            arrayList.add((yc0) entry.getKey());
        }
    }

    public static void a(List list, n32 n32Var, f32 f32Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                yc0 yc0Var = (yc0) list.get(size);
                Method method = yc0Var.b;
                try {
                    int i = yc0Var.a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, n32Var);
                    } else if (i == 2) {
                        method.invoke(obj, n32Var, f32Var);
                    }
                } catch (IllegalAccessException e) {
                    m51.n(e);
                    return;
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u92 {
    public static void a(Object obj, Object obj2) {
        t92 t92Var = (t92) obj;
        if (obj2 != null) {
            m51.t();
            return;
        }
        if (t92Var.isEmpty()) {
            return;
        }
        Iterator it = t92Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static t92 b(Object obj, Object obj2) {
        t92 t92VarC = (t92) obj;
        t92 t92Var = (t92) obj2;
        if (!t92Var.isEmpty()) {
            if (!t92VarC.c) {
                t92VarC = t92VarC.c();
            }
            t92VarC.b();
            if (!t92Var.isEmpty()) {
                t92VarC.putAll(t92Var);
            }
        }
        return t92VarC;
    }
}

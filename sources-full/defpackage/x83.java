package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class x83 implements Iterable {
    public u83 c;
    public u83 d;
    public final WeakHashMap h = new WeakHashMap();
    public int l = 0;

    public u83 b(Object obj) {
        u83 u83Var = this.c;
        while (u83Var != null && !u83Var.c.equals(obj)) {
            u83Var = u83Var.h;
        }
        return u83Var;
    }

    public Object d(Object obj) {
        u83 u83VarB = b(obj);
        if (u83VarB == null) {
            return null;
        }
        this.l--;
        WeakHashMap weakHashMap = this.h;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((w83) it.next()).a(u83VarB);
            }
        }
        u83 u83Var = u83VarB.l;
        u83 u83Var2 = u83VarB.h;
        if (u83Var != null) {
            u83Var.h = u83Var2;
        } else {
            this.c = u83Var2;
        }
        u83 u83Var3 = u83VarB.h;
        if (u83Var3 != null) {
            u83Var3.l = u83Var;
        } else {
            this.d = u83Var;
        }
        u83VarB.h = null;
        u83VarB.l = null;
        return u83VarB.d;
    }

    public final boolean equals(Object obj) {
        t83 t83Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x83)) {
            return false;
        }
        x83 x83Var = (x83) obj;
        if (this.l != x83Var.l) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = x83Var.iterator();
        while (true) {
            t83Var = (t83) it;
            if (!t83Var.hasNext()) {
                break;
            }
            t83 t83Var2 = (t83) it2;
            if (!t83Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) t83Var.next();
            Object next = t83Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (t83Var.hasNext() || ((t83) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            t83 t83Var = (t83) it;
            if (!t83Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) t83Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        t83 t83Var = new t83(this.c, this.d, 0);
        this.h.put(t83Var, Boolean.FALSE);
        return t83Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            t83 t83Var = (t83) it;
            if (!t83Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) t83Var.next()).toString());
            if (t83Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}

package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class t82 {
    public final int a;
    public final nr0 b;
    public final rn0 c;
    public int d;
    public int e;
    public int f;

    public t82(int i) {
        this.a = i;
        if (i <= 0) {
            u41.k("maxSize <= 0");
            throw null;
        }
        this.b = new nr0(1);
        this.c = new rn0(17);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            nr0 nr0Var = this.b;
            nr0Var.getClass();
            Object obj2 = nr0Var.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            nr0 nr0Var = this.b;
            nr0Var.getClass();
            objPut = nr0Var.a.put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d > i && !this.b.a.isEmpty()) {
                        Set setEntrySet = this.b.a.entrySet();
                        setEntrySet.getClass();
                        Set set = setEntrySet;
                        Object next = null;
                        if (set instanceof List) {
                            List list = (List) set;
                            if (!list.isEmpty()) {
                                next = list.get(0);
                            }
                        } else {
                            Iterator it = set.iterator();
                            if (it.hasNext()) {
                                next = it.next();
                            }
                        }
                        Map.Entry entry = (Map.Entry) next;
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        nr0 nr0Var2 = this.b;
                        nr0Var2.getClass();
                        key.getClass();
                        nr0Var2.a.remove(key);
                        int i2 = this.d;
                        value.getClass();
                        this.d = i2 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final Object c(Object obj) {
        Object objRemove;
        synchronized (this.c) {
            nr0 nr0Var = this.b;
            nr0Var.getClass();
            objRemove = nr0Var.a.remove(obj);
            if (objRemove != null) {
                this.d--;
            }
        }
        return objRemove;
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}

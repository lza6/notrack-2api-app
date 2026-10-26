package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ru2 extends AbstractMap implements Map, iu1 {
    public rn0 c = new rn0(18);
    public n64 d;
    public Object h;
    public int l;
    public int m;
    public su2 n;

    public ru2(su2 su2Var) {
        this.d = su2Var.c;
        this.m = su2Var.d;
        this.n = su2Var;
    }

    public final su2 a() {
        n64 n64Var = this.d;
        su2 su2Var = this.n;
        if (n64Var != su2Var.c) {
            this.c = new rn0(18);
            su2Var = new su2(this.d, this.m);
        }
        this.n = su2Var;
        return su2Var;
    }

    public final boolean b(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final Object c(Object obj) {
        return this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d = n64.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof vk0) {
            return b((vk0) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof bb4) {
            return super.containsValue((bb4) obj);
        }
        return false;
    }

    public final Object d(Object obj) {
        this.h = null;
        n64 n64VarN = this.d.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (n64VarN == null) {
            n64VarN = n64.e;
        }
        this.d = n64VarN;
        return this.h;
    }

    public final void e(int i) {
        this.m = i;
        this.l++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new xu2(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof vk0) {
            return (bb4) c((vk0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof vk0) ? obj2 : (bb4) super.getOrDefault((vk0) obj, (bb4) obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new xu2(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.h = null;
        this.d = this.d.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        uu2 uu2VarA = null;
        uu2 uu2Var = map instanceof uu2 ? (uu2) map : null;
        if (uu2Var == null) {
            ru2 ru2Var = map instanceof ru2 ? (ru2) map : null;
            if (ru2Var != null) {
                uu2VarA = ru2Var.a();
            }
        } else {
            uu2VarA = uu2Var;
        }
        if (uu2VarA == null) {
            super.putAll(map);
            return;
        }
        vu0 vu0Var = new vu0();
        vu0Var.a = 0;
        int i = this.m;
        n64 n64Var = this.d;
        n64 n64Var2 = uu2VarA.c;
        n64Var2.getClass();
        this.d = n64Var.m(n64Var2, 0, vu0Var, this);
        int i2 = (uu2VarA.d + i) - vu0Var.a;
        if (i != i2) {
            e(i2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof vk0) {
            return (bb4) d((vk0) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.m;
        n64 n64VarO = this.d.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (n64VarO == null) {
            n64VarO = n64.e;
        }
        this.d = n64VarO;
        return i != this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new q92(1, this);
    }
}

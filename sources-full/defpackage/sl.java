package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class sl extends ph3 implements Map {
    public nl l;
    public pl m;
    public rl n;

    @Override // java.util.Map
    public final Set entrySet() {
        nl nlVar = this.l;
        if (nlVar != null) {
            return nlVar;
        }
        nl nlVar2 = new nl(this);
        this.l = nlVar2;
        return nlVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.h;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.h;
    }

    @Override // java.util.Map
    public final Set keySet() {
        pl plVar = this.m;
        if (plVar != null) {
            return plVar;
        }
        pl plVar2 = new pl(this);
        this.m = plVar2;
        return plVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.h;
        int i = this.h;
        int[] iArr = this.c;
        if (iArr.length < size) {
            this.c = Arrays.copyOf(iArr, size);
            this.d = Arrays.copyOf(this.d, size * 2);
        }
        if (this.h != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        rl rlVar = this.n;
        if (rlVar != null) {
            return rlVar;
        }
        rl rlVar2 = new rl(this);
        this.n = rlVar2;
        return rlVar2;
    }
}

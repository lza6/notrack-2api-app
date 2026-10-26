package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class en4 extends zm4 {
    public final transient hn4 l;
    public final transient Object[] m;
    public final transient int n;

    public en4(hn4 hn4Var, Object[] objArr, int i) {
        this.l = hn4Var;
        this.m = objArr;
        this.n = i;
    }

    @Override // defpackage.nm4
    public final int b(Object[] objArr) {
        return j().b(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // defpackage.zm4
    public final xm4 n() {
        return new dn4(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.n;
    }
}

package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ql implements Iterator, Map.Entry {
    public int c;
    public int d = -1;
    public boolean h;
    public final /* synthetic */ sl l;

    public ql(sl slVar) {
        this.l = slVar;
        this.c = slVar.h - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.h) {
            u41.r("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.d;
            sl slVar = this.l;
            if (kr1.n(key, slVar.e(i)) && kr1.n(entry.getValue(), slVar.h(this.d))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.h) {
            return this.l.e(this.d);
        }
        u41.r("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.h) {
            return this.l.h(this.d);
        }
        u41.r("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.h) {
            u41.r("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.d;
        sl slVar = this.l;
        Object objE = slVar.e(i);
        Object objH = slVar.h(this.d);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            m51.o();
            return null;
        }
        this.d++;
        this.h = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            throw new IllegalStateException();
        }
        this.l.f(this.d);
        this.d--;
        this.c--;
        this.h = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.h) {
            return this.l.g(this.d, obj);
        }
        u41.r("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}

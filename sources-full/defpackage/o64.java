package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o64 implements Iterator, gu1 {
    public Object[] c = n64.e.d;
    public int d;
    public int h;

    public final void a(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.h = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h < this.d;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

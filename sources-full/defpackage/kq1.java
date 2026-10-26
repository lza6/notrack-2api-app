package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kq1 implements Iterator, gu1 {
    public final int c;
    public final int d;
    public boolean h;
    public int l;

    public kq1(int i, int i2, int i3) {
        this.c = i3;
        this.d = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.h = z;
        this.l = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.l;
        if (i != this.d) {
            this.l = this.c + i;
            return i;
        }
        if (this.h) {
            this.h = false;
            return i;
        }
        m51.o();
        return 0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

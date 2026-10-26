package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class qf3 implements Iterator, so0, gu1 {
    public int c;
    public Object d;
    public so0 h;

    public final RuntimeException a() {
        int i = this.c;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.c);
    }

    public final void b(so0 so0Var, Object obj) {
        this.d = obj;
        this.c = 3;
        this.h = so0Var;
        so0Var.getClass();
    }

    @Override // defpackage.so0
    public final xp0 getContext() {
        return x21.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.c;
            if (i != 0) {
                break;
            }
            this.c = 5;
            so0 so0Var = this.h;
            so0Var.getClass();
            this.h = null;
            so0Var.resumeWith(w84.a);
        }
        if (i == 1) {
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw a();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            m51.o();
            return null;
        }
        if (i == 2) {
            this.c = 1;
            throw null;
        }
        if (i != 3) {
            throw a();
        }
        this.c = 0;
        Object obj = this.d;
        this.d = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // defpackage.so0
    public final void resumeWith(Object obj) throws Throwable {
        g13.O(obj);
        this.c = 4;
    }
}

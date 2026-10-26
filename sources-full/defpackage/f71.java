package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class f71 implements Iterator, gu1 {
    public final Iterator c;
    public int d = -1;
    public Object h;
    public final /* synthetic */ g71 l;

    public f71(g71 g71Var) {
        this.l = g71Var;
        this.c = g71Var.a.iterator();
    }

    public final void a() {
        Object next;
        g71 g71Var;
        do {
            Iterator it = this.c;
            if (!it.hasNext()) {
                this.d = 0;
                return;
            } else {
                next = it.next();
                g71Var = this.l;
            }
        } while (((Boolean) g71Var.c.invoke(next)).booleanValue() != g71Var.b);
        this.h = next;
        this.d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == -1) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d == -1) {
            a();
        }
        if (this.d == 0) {
            m51.o();
            return null;
        }
        Object obj = this.h;
        this.h = null;
        this.d = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

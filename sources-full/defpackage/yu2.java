package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yu2 implements Iterator, gu1 {
    public final /* synthetic */ int c = 1;
    public final Iterator d;

    public yu2(ob4 ob4Var) {
        this.d = ob4Var.r.iterator();
    }

    public yu2(ru2 ru2Var) {
        o64[] o64VarArr = new o64[8];
        for (int i = 0; i < 8; i++) {
            o64VarArr[i] = new q64(this);
        }
        this.d = new wu2(ru2Var, o64VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                return ((wu2) this.d).h;
            default:
                return this.d.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.c) {
            case 0:
                return (Map.Entry) ((wu2) this.d).next();
            default:
                return (qb4) this.d.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                ((wu2) this.d).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}

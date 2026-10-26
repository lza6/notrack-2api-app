package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ol implements Iterator, gu1 {
    public int c;
    public int d;
    public boolean h;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public ol(int i) {
        this.c = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ol(sl slVar, int i) {
        this(slVar.h);
        this.l = i;
        switch (i) {
            case 1:
                this.m = slVar;
                this(slVar.h);
                break;
            default:
                this.m = slVar;
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ol(ul ulVar) {
        this(ulVar.h);
        this.l = 2;
        this.m = ulVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d < this.c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            m51.o();
            return null;
        }
        int i = this.d;
        int i2 = this.l;
        Object obj = this.m;
        switch (i2) {
            case 0:
                objE = ((sl) obj).e(i);
                break;
            case 1:
                objE = ((sl) obj).h(i);
                break;
            default:
                objE = ((ul) obj).d[i];
                break;
        }
        this.d++;
        this.h = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.h) {
            u41.r("Call next() before removing an element.");
            return;
        }
        int i = this.d - 1;
        this.d = i;
        int i2 = this.l;
        Object obj = this.m;
        switch (i2) {
            case 0:
                ((sl) obj).f(i);
                break;
            case 1:
                ((sl) obj).f(i);
                break;
            default:
                ((ul) obj).b(i);
                break;
        }
        this.c--;
        this.h = false;
    }
}

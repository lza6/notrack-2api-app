package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class hz implements Iterator {
    public final /* synthetic */ int c = 1;
    public int d = 0;
    public final int h;
    public final /* synthetic */ Object l;

    public hz(jp4 jp4Var) {
        this.l = jp4Var;
        this.h = jp4Var.g();
    }

    public hz(kz kzVar) {
        this.l = kzVar;
        this.h = kzVar.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.c) {
            case 0:
                return this.d < this.h;
            default:
                return this.d < this.h;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.c;
        Object obj = this.l;
        int i2 = this.h;
        switch (i) {
            case 0:
                int i3 = this.d;
                if (i3 < i2) {
                    this.d = i3 + 1;
                    return Byte.valueOf(((kz) obj).m(i3));
                }
                m51.o();
                return null;
            default:
                int i4 = this.d;
                if (i4 < i2) {
                    this.d = i4 + 1;
                    return Byte.valueOf(((jp4) obj).b(i4));
                }
                m51.o();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}

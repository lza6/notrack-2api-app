package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ey extends e0 {
    public final /* synthetic */ int h = 1;
    public final Object l;

    public ey(int i, Object obj) {
        super(i, 1);
        this.l = obj;
    }

    public ey(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.l = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.h;
        Object obj = this.l;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    m51.o();
                    return null;
                }
                int i2 = this.c;
                this.c = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.c++;
                    return obj;
                }
                m51.o();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.h;
        Object obj = this.l;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    m51.o();
                    return null;
                }
                int i2 = this.c - 1;
                this.c = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.c--;
                    return obj;
                }
                m51.o();
                return null;
        }
    }
}

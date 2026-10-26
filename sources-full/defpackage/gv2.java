package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gv2 extends e0 {
    public final Object[] h;
    public final m64 l;

    public gv2(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.h = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.l = new m64(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            m51.o();
            return null;
        }
        m64 m64Var = this.l;
        if (m64Var.hasNext()) {
            this.c++;
            return m64Var.next();
        }
        int i = this.c;
        this.c = i + 1;
        return this.h[i - m64Var.d];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            m51.o();
            return null;
        }
        int i = this.c;
        m64 m64Var = this.l;
        int i2 = m64Var.d;
        if (i <= i2) {
            this.c = i - 1;
            return m64Var.previous();
        }
        int i3 = i - 1;
        this.c = i3;
        return this.h[i3 - i2];
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m64 extends e0 {
    public int h;
    public Object[] l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public m64(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        this.h = i3;
        Object[] objArr2 = new Object[i3];
        this.l = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.m = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.c & 31;
        Object obj = this.l[this.h - 1];
        obj.getClass();
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.h - i2) * 5;
        while (i2 < this.h) {
            Object[] objArr = this.l;
            Object obj = objArr[i2 - 1];
            obj.getClass();
            objArr[i2] = ((Object[]) obj)[y64.D(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (y64.D(this.c, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.c, ((this.h - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            m51.o();
            return null;
        }
        Object objA = a();
        int i = this.c + 1;
        this.c = i;
        if (i == this.d) {
            this.m = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            m51.o();
            return null;
        }
        this.c--;
        if (this.m) {
            this.m = false;
            return a();
        }
        c(31);
        return a();
    }
}

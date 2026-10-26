package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: loaded from: classes.dex */
public final class hv2 extends e0 {
    public final fv2 h;
    public int l;
    public m64 m;
    public int n;

    public hv2(fv2 fv2Var, int i) {
        super(i, fv2Var.p);
        this.h = fv2Var;
        this.l = fv2Var.k();
        this.n = -1;
        b();
    }

    public final void a() {
        if (this.l != this.h.k()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.e0, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i = this.c;
        fv2 fv2Var = this.h;
        fv2Var.add(i, obj);
        this.c++;
        this.d = fv2Var.b();
        this.l = fv2Var.k();
        this.n = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b() {
        fv2 fv2Var = this.h;
        Object[] objArr = fv2Var.n;
        if (objArr == null) {
            this.m = null;
            return;
        }
        int i = (fv2Var.p - 1) & (-32);
        int i2 = this.c;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (fv2Var.l / 5) + 1;
        m64 m64Var = this.m;
        if (m64Var == null) {
            this.m = new m64(objArr, i2, i, i3);
            return;
        }
        m64Var.c = i2;
        m64Var.d = i;
        m64Var.h = i3;
        if (m64Var.l.length < i3) {
            m64Var.l = new Object[i3];
        }
        m64Var.l[0] = objArr;
        ?? r0 = i2 == i ? 1 : 0;
        m64Var.m = r0;
        m64Var.b(i2 - r0, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (!hasNext()) {
            m51.o();
            return null;
        }
        int i = this.c;
        this.n = i;
        m64 m64Var = this.m;
        fv2 fv2Var = this.h;
        if (m64Var == null) {
            Object[] objArr = fv2Var.o;
            this.c = i + 1;
            return objArr[i];
        }
        if (m64Var.hasNext()) {
            this.c++;
            return m64Var.next();
        }
        Object[] objArr2 = fv2Var.o;
        int i2 = this.c;
        this.c = i2 + 1;
        return objArr2[i2 - m64Var.d];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (!hasPrevious()) {
            m51.o();
            return null;
        }
        int i = this.c;
        this.n = i - 1;
        m64 m64Var = this.m;
        fv2 fv2Var = this.h;
        if (m64Var == null) {
            Object[] objArr = fv2Var.o;
            int i2 = i - 1;
            this.c = i2;
            return objArr[i2];
        }
        int i3 = m64Var.d;
        if (i <= i3) {
            this.c = i - 1;
            return m64Var.previous();
        }
        Object[] objArr2 = fv2Var.o;
        int i4 = i - 1;
        this.c = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.e0, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i = this.n;
        if (i == -1) {
            throw new IllegalStateException();
        }
        fv2 fv2Var = this.h;
        fv2Var.d(i);
        int i2 = this.n;
        if (i2 < this.c) {
            this.c = i2;
        }
        this.d = fv2Var.b();
        this.l = fv2Var.k();
        this.n = -1;
        b();
    }

    @Override // defpackage.e0, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i = this.n;
        if (i == -1) {
            throw new IllegalStateException();
        }
        fv2 fv2Var = this.h;
        fv2Var.set(i, obj);
        this.l = fv2Var.k();
        b();
    }
}

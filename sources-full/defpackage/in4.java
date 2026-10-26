package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class in4 extends zm4 {
    public static final Object[] q;
    public static final in4 r;
    public final transient Object[] l;
    public final transient int m;
    public final transient Object[] n;
    public final transient int o;
    public final transient int p;

    static {
        Object[] objArr = new Object[0];
        q = objArr;
        r = new in4(0, 0, 0, objArr, objArr);
    }

    public in4(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.l = objArr;
        this.m = i;
        this.n = objArr2;
        this.o = i2;
        this.p = i3;
    }

    @Override // defpackage.nm4
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.l;
        int i = this.p;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.n;
            if (objArr.length != 0) {
                int iB = ug4.b(obj.hashCode());
                while (true) {
                    int i = iB & this.o;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nm4
    public final int d() {
        return this.p;
    }

    @Override // defpackage.nm4
    public final int g() {
        return 0;
    }

    @Override // defpackage.zm4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // defpackage.nm4
    public final Object[] l() {
        return this.l;
    }

    @Override // defpackage.zm4
    public final xm4 n() {
        return xm4.n(this.p, this.l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.p;
    }
}

package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class k13 extends m0 implements RandomAccess {
    public static final k13 l;
    public Object[] d;
    public int h;

    static {
        k13 k13Var = new k13(0, new Object[0]);
        l = k13Var;
        k13Var.c = false;
    }

    public k13(int i, Object[] objArr) {
        this.d = objArr;
        this.h = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.h)) {
            m51.h(this.h, ud2.s("Index:", ", Size:", i));
            return;
        }
        Object[] objArr = this.d;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.d, i, objArr2, i + 1, this.h - i);
            this.d = objArr2;
        }
        this.d[i] = obj;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.m0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.h;
        Object[] objArr = this.d;
        if (i == objArr.length) {
            this.d = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.d;
        int i2 = this.h;
        this.h = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.h) {
            m51.h(this.h, ud2.s("Index:", ", Size:", i));
        }
    }

    @Override // defpackage.yq1
    public final yq1 e(int i) {
        if (i < this.h) {
            throw new IllegalArgumentException();
        }
        return new k13(this.h, Arrays.copyOf(this.d, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.d[i];
    }

    @Override // defpackage.m0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        Object[] objArr = this.d;
        Object obj = objArr[i];
        int i2 = this.h;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        d(i);
        Object[] objArr = this.d;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }
}

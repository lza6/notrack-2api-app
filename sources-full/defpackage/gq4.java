package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class gq4 extends fp4 implements RandomAccess {
    public static final Object[] l;
    public static final gq4 m;
    public Object[] d;
    public int h;

    static {
        Object[] objArr = new Object[0];
        l = objArr;
        m = new gq4(objArr, 0, false);
    }

    public gq4(Object[] objArr, int i, boolean z) {
        super(z);
        this.d = objArr;
        this.h = i;
    }

    @Override // defpackage.vp4
    public final /* bridge */ /* synthetic */ vp4 a(int i) {
        if (i >= this.h) {
            return new gq4(i == 0 ? l : Arrays.copyOf(this.d, i), this.h, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.h)) {
            m51.s(ud2.l(i, this.h, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.d;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, objArr2, 0, i);
            System.arraycopy(this.d, i, objArr2, i3, this.h - i);
            this.d = objArr2;
        }
        this.d[i] = obj;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.h;
        int length = this.d.length;
        if (i == length) {
            this.d = Arrays.copyOf(this.d, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.d;
        int i2 = this.h;
        this.h = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.h) {
            m51.s(ud2.l(i, this.h, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.fp4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.h;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof gq4)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.d[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        gq4 gq4Var = (gq4) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.d[i3].equals(gq4Var.d[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return this.d[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.h;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.d[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.fp4, java.util.AbstractList, java.util.List
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

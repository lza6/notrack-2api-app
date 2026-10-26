package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class tp4 extends fp4 implements RandomAccess, up4 {
    public static final int[] l;
    public static final tp4 m;
    public int[] d;
    public int h;

    static {
        int[] iArr = new int[0];
        l = iArr;
        m = new tp4(iArr, 0, false);
    }

    public tp4(int[] iArr, int i, boolean z) {
        super(z);
        this.d = iArr;
        this.h = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i2 = this.h)) {
            m51.s(ud2.l(i, this.h, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.d;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, iArr2, 0, i);
            System.arraycopy(this.d, i, iArr2, i3, this.h - i);
            this.d = iArr2;
        }
        this.d[i] = iIntValue;
        this.h++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }

    @Override // defpackage.fp4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof tp4)) {
            return super.addAll(collection);
        }
        tp4 tp4Var = (tp4) collection;
        int i = tp4Var.h;
        if (i == 0) {
            return false;
        }
        int i2 = this.h;
        if (IntCompanionObject.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.d;
        if (i3 > iArr.length) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(tp4Var.d, 0, this.d, this.h, tp4Var.h);
        this.h = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        k(i);
        return this.d[i];
    }

    @Override // defpackage.fp4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp4)) {
            return super.equals(obj);
        }
        tp4 tp4Var = (tp4) obj;
        if (this.h != tp4Var.h) {
            return false;
        }
        int[] iArr = tp4Var.d;
        for (int i = 0; i < this.h; i++) {
            if (this.d[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.vp4
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final tp4 a(int i) {
        if (i >= this.h) {
            return new tp4(i == 0 ? l : Arrays.copyOf(this.d, i), this.h, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        k(i);
        return Integer.valueOf(this.d[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.h; i2++) {
            i = (i * 31) + this.d[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.d[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    public final void j(int i) {
        b();
        int i2 = this.h;
        int length = this.d.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.d, 0, iArr, 0, this.h);
            this.d = iArr;
        }
        int[] iArr2 = this.d;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr2[i3] = i;
    }

    public final void k(int i) {
        if (i < 0 || i >= this.h) {
            m51.s(ud2.l(i, this.h, "Index:", ", Size:"));
        }
    }

    @Override // defpackage.fp4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        k(i);
        int[] iArr = this.d;
        int i2 = iArr[i];
        int i3 = this.h;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            m51.s("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.d;
        System.arraycopy(iArr, i2, iArr, i, this.h - i2);
        this.h -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        k(i);
        int[] iArr = this.d;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.h;
    }
}

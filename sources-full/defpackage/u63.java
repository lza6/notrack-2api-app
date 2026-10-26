package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class u63 extends d0 implements RandomAccess {
    public final Object[] c;
    public final int d;
    public int h;
    public int l;

    public u63(int i, Object[] objArr) {
        this.c = objArr;
        if (i < 0) {
            u41.h(ud2.m(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.d = objArr.length;
            this.l = i;
        } else {
            StringBuilder sbS = ud2.s("ring buffer filled size: ", " cannot be larger than the buffer size: ", i);
            sbS.append(objArr.length);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
    }

    @Override // defpackage.t
    public final int b() {
        return this.l;
    }

    public final void d(int i) {
        if (i < 0) {
            u41.h(ud2.m(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.l) {
            StringBuilder sbS = ud2.s("n shouldn't be greater than the buffer size: n = ", ", size = ", i);
            sbS.append(this.l);
            throw new IllegalArgumentException(sbS.toString().toString());
        }
        if (i > 0) {
            int i2 = this.h;
            int i3 = this.d;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.c;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.h = i4;
            this.l -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.l;
        if (i < 0 || i >= i2) {
            m51.s(ud2.l(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.c[(this.h + i) % this.d];
    }

    @Override // defpackage.d0, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ru0(this);
    }

    @Override // defpackage.t, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // defpackage.t, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int length = objArr.length;
        int i = this.l;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.l;
        int i3 = this.h;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.c;
            if (i5 >= i2 || i3 >= this.d) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}

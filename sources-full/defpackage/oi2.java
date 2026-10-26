package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class oi2 implements RandomAccess {
    public Object[] c;
    public th2 d;
    public int h;

    public oi2(int i, Object[] objArr) {
        this.c = objArr;
        this.h = i;
    }

    public final void b(int i, Object obj) {
        int i2 = this.h + 1;
        if (this.c.length < i2) {
            o(i2);
        }
        Object[] objArr = this.c;
        int i3 = this.h;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.h++;
    }

    public final void c(Object obj) {
        int i = this.h + 1;
        if (this.c.length < i) {
            o(i);
        }
        Object[] objArr = this.c;
        int i2 = this.h;
        objArr[i2] = obj;
        this.h = i2 + 1;
    }

    public final void d(int i, oi2 oi2Var) {
        int i2 = oi2Var.h;
        if (i2 == 0) {
            return;
        }
        int i3 = this.h + i2;
        if (this.c.length < i3) {
            o(i3);
        }
        Object[] objArr = this.c;
        int i4 = this.h;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(oi2Var.c, 0, objArr, i, i2);
        this.h += i2;
    }

    public final void f(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.h + size;
        if (this.c.length < i2) {
            o(i2);
        }
        Object[] objArr = this.c;
        int i3 = this.h;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.h += size;
    }

    public final boolean g(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.h + size;
        if (this.c.length < i3) {
            o(i3);
        }
        Object[] objArr = this.c;
        int i4 = this.h;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                kr1.m0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.h += size;
        return true;
    }

    public final List h() {
        th2 th2Var = this.d;
        if (th2Var != null) {
            return th2Var;
        }
        th2 th2Var2 = new th2(1, this);
        this.d = th2Var2;
        return th2Var2;
    }

    public final void i() {
        Object[] objArr = this.c;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.h = 0;
    }

    public final boolean j(Object obj) {
        int i = this.h - 1;
        if (i >= 0) {
            for (int i2 = 0; !kr1.n(this.c[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    public final int k(Object obj) {
        Object[] objArr = this.c;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (kr1.n(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean l(Object obj) {
        int iK = k(obj);
        if (iK < 0) {
            return false;
        }
        m(iK);
        return true;
    }

    public final Object m(int i) {
        Object[] objArr = this.c;
        Object obj = objArr[i];
        int i2 = this.h;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.h - 1;
        this.h = i4;
        objArr[i4] = null;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > i) {
            int i3 = this.h;
            if (i2 < i3) {
                Object[] objArr = this.c;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.h;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.c[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.h = i5;
        }
    }

    public final void o(int i) {
        Object[] objArr = this.c;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.c = objArr2;
    }
}

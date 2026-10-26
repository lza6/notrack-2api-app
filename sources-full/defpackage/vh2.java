package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vh2 extends dn2 {
    public th2 c;

    public /* synthetic */ vh2() {
        this(16);
    }

    public vh2(int i) {
        this.a = i == 0 ? en2.a : new Object[i];
    }

    public final void g(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            m(i, objArr);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final void h(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.b;
        int size = list.size() + i;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(size, objArr);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.b = list.size() + this.b;
    }

    public final void i() {
        vl.p0(0, this.b, null, this.a);
        this.b = 0;
    }

    public final boolean j(Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            return false;
        }
        k(iC);
        return true;
    }

    public final Object k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            f(i);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            vl.j0(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
        return obj;
    }

    public final void l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.b);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.a;
                vl.j0(i, i2, i3, objArr, objArr);
            }
            int i4 = this.b;
            int i5 = i4 - (i2 - i);
            vl.p0(i5, i4, null, this.a);
            this.b = i5;
        }
    }

    public final void m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        vl.j0(0, 0, length, objArr, objArr2);
        this.a = objArr2;
    }

    public final void n(int i) {
        StringBuilder sbS = ud2.s("Index ", " must be in 0..", i);
        sbS.append(this.b);
        throw new IndexOutOfBoundsException(sbS.toString());
    }
}

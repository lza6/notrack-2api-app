package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class vu2 implements Iterator, gu1 {
    public final o64[] c;
    public int d;
    public boolean h = true;

    public vu2(n64 n64Var, o64[] o64VarArr) {
        this.c = o64VarArr;
        o64VarArr[0].a(n64Var.d, Integer.bitCount(n64Var.a) * 2, 0);
        this.d = 0;
        a();
    }

    public final void a() {
        int i = this.d;
        o64[] o64VarArr = this.c;
        o64 o64Var = o64VarArr[i];
        if (o64Var.h < o64Var.d) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                o64 o64Var2 = o64VarArr[i];
                int i2 = o64Var2.h;
                Object[] objArr = o64Var2.c;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    o64Var2.h = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.d = iB;
                return;
            }
            if (i > 0) {
                o64 o64Var3 = o64VarArr[i - 1];
                int i3 = o64Var3.h;
                int length2 = o64Var3.c.length;
                o64Var3.h = i3 + 1;
            }
            o64VarArr[i].a(n64.e.d, 0, 0);
            i--;
        }
        this.h = false;
    }

    public final int b(int i) {
        o64[] o64VarArr = this.c;
        o64 o64Var = o64VarArr[i];
        int i2 = o64Var.h;
        if (i2 < o64Var.d) {
            return i;
        }
        Object[] objArr = o64Var.c;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        n64 n64Var = (n64) obj;
        if (i == 6) {
            o64 o64Var2 = o64VarArr[i + 1];
            Object[] objArr2 = n64Var.d;
            o64Var2.a(objArr2, objArr2.length, 0);
        } else {
            o64VarArr[i + 1].a(n64Var.d, Integer.bitCount(n64Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.h;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.h) {
            m51.o();
            return null;
        }
        Object next = this.c[this.d].next();
        a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

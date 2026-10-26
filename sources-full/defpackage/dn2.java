package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn2 {
    public Object[] a;
    public int b;

    public final Object a() {
        if (!d()) {
            return this.a[0];
        }
        j93.g("ObjectList is empty.");
        return null;
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(Object obj) {
        Object[] objArr = this.a;
        int i = 0;
        if (obj == null) {
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final int e(Object obj) {
        Object[] objArr = this.a;
        if (obj == null) {
            for (int i = this.b - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i2 = this.b - 1; -1 < i2; i2--) {
                if (obj.equals(objArr[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dn2) {
            dn2 dn2Var = (dn2) obj;
            int i = dn2Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = dn2Var.a;
                lq1 lq1VarX = py.X(0, i2);
                int i3 = lq1VarX.c;
                int i4 = lq1VarX.d;
                if (i3 > i4) {
                    return true;
                }
                while (kr1.n(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder sbS = ud2.s("Index ", " must be in 0..", i);
        sbS.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        pj2 pj2Var = new pj2(2, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                return sb.toString();
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) pj2Var.invoke(obj));
        }
        sb.append((CharSequence) "]");
        return sb.toString();
    }
}

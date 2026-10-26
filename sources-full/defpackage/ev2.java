package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ev2 extends k0 {
    public final Object[] c;
    public final Object[] d;
    public final int h;
    public final int l;

    public ev2(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.c = objArr;
        this.d = objArr2;
        this.h = i;
        this.l = i2;
        if (!(b() > 32)) {
            zx2.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] o(Object[] objArr, int i, int i2, Object obj, f61 f61Var) {
        int iD = y64.D(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iD == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            vl.j0(iD + 1, iD, 31, objArr, objArrCopyOf);
            f61Var.c = objArr[31];
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        Object obj2 = objArr[iD];
        obj2.getClass();
        objArrCopyOf2[iD] = o((Object[]) obj2, i3, i2, obj, f61Var);
        while (true) {
            iD++;
            if (iD >= 32 || objArrCopyOf2[iD] == null) {
                break;
            }
            Object obj3 = objArr[iD];
            obj3.getClass();
            objArrCopyOf2[iD] = o((Object[]) obj3, i3, 0, f61Var.c, f61Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] q(Object[] objArr, int i, int i2, f61 f61Var) {
        Object[] objArrQ;
        int iD = y64.D(i2, i);
        if (i == 5) {
            f61Var.c = objArr[iD];
            objArrQ = null;
        } else {
            Object obj = objArr[iD];
            obj.getClass();
            objArrQ = q((Object[]) obj, i - 5, i2, f61Var);
        }
        if (objArrQ == null && iD == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        objArrCopyOf[iD] = objArrQ;
        return objArrCopyOf;
    }

    public static Object[] w(int i, int i2, Object obj, Object[] objArr) {
        int iD = y64.D(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            objArrCopyOf[iD] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[iD];
        obj2.getClass();
        objArrCopyOf[iD] = w(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.t
    public final int b() {
        return this.h;
    }

    @Override // defpackage.k0
    public final k0 d(int i, Object obj) {
        int i2 = this.h;
        gm4.l(i, i2);
        if (i == i2) {
            return g(obj);
        }
        int iV = v();
        Object[] objArr = this.c;
        if (i >= iV) {
            return p(i - iV, obj, objArr);
        }
        f61 f61Var = new f61(null);
        return p(0, f61Var.c, o(objArr, this.l, i, obj, f61Var));
    }

    @Override // defpackage.k0
    public final k0 g(Object obj) {
        int iV = v();
        int i = this.h;
        int i2 = i - iV;
        Object[] objArr = this.c;
        Object[] objArr2 = this.d;
        if (i2 < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            objArrCopyOf[i2] = obj;
            return new ev2(objArr, objArrCopyOf, i + 1, this.l);
        }
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj;
        return r(objArr, objArr2, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        gm4.k(i, b());
        if (v() <= i) {
            objArr = this.d;
        } else {
            Object[] objArr2 = this.c;
            for (int i2 = this.l; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[y64.D(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // defpackage.k0
    public final fv2 k() {
        return new fv2(this, this.c, this.d, this.l);
    }

    @Override // defpackage.k0
    public final k0 l(j0 j0Var) {
        fv2 fv2Var = new fv2(this, this.c, this.d, this.l);
        fv2Var.E(j0Var);
        return fv2Var.g();
    }

    @Override // defpackage.d0, java.util.List
    public final ListIterator listIterator(int i) {
        gm4.l(i, this.h);
        return new gv2(i, this.h, (this.l / 5) + 1, this.c, this.d);
    }

    @Override // defpackage.k0
    public final k0 m(int i) {
        gm4.k(i, b());
        int iV = v();
        int i2 = this.l;
        Object[] objArr = this.c;
        return i >= iV ? u(objArr, iV, i2, i - iV) : u(t(objArr, i2, i, new f61(this.d[0])), iV, i2, 0);
    }

    @Override // defpackage.k0
    public final k0 n(int i, Object obj) {
        int i2 = this.h;
        gm4.k(i, i2);
        int iV = v();
        Object[] objArr = this.c;
        Object[] objArr2 = this.d;
        int i3 = this.l;
        if (iV > i) {
            return new ev2(w(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        objArrCopyOf[i & 31] = obj;
        return new ev2(objArr, objArrCopyOf, i2, i3);
    }

    public final ev2 p(int i, Object obj, Object[] objArr) {
        int iV = v();
        int i2 = this.h;
        int i3 = i2 - iV;
        Object[] objArr2 = this.d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        if (i3 < 32) {
            vl.j0(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new ev2(objArr, objArrCopyOf, i2 + 1, this.l);
        }
        Object obj2 = objArr2[31];
        vl.j0(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return r(objArr, objArrCopyOf, objArr3);
    }

    public final ev2 r(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.l;
        if (i2 <= (1 << i3)) {
            return new ev2(s(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new ev2(s(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] s(int i, Object[] objArr, Object[] objArr2) {
        int iD = y64.D(b() - 1, i);
        Object[] objArrCopyOf = objArr != null ? Arrays.copyOf(objArr, 32) : new Object[32];
        if (i == 5) {
            objArrCopyOf[iD] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[iD] = s(i - 5, (Object[]) objArrCopyOf[iD], objArr2);
        return objArrCopyOf;
    }

    public final Object[] t(Object[] objArr, int i, int i2, f61 f61Var) {
        int iD = y64.D(i2, i);
        if (i == 0) {
            Object[] objArrCopyOf = iD == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            vl.j0(iD, iD + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = f61Var.c;
            f61Var.c = objArr[iD];
            return objArrCopyOf;
        }
        int iD2 = objArr[31] == null ? y64.D(v() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        int i3 = i - 5;
        int i4 = iD + 1;
        if (i4 <= iD2) {
            while (true) {
                Object obj = objArrCopyOf2[iD2];
                obj.getClass();
                objArrCopyOf2[iD2] = t((Object[]) obj, i3, 0, f61Var);
                if (iD2 == i4) {
                    break;
                }
                iD2--;
            }
        }
        Object obj2 = objArrCopyOf2[iD];
        obj2.getClass();
        objArrCopyOf2[iD] = t((Object[]) obj2, i3, i2, f61Var);
        return objArrCopyOf2;
    }

    public final k0 u(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        if (i4 != 1) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            int i5 = i4 - 1;
            if (i3 < i5) {
                vl.j0(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new ev2(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new ck3(objArr);
        }
        f61 f61Var = new f61(null);
        Object[] objArrQ = q(objArr, i2, i - 1, f61Var);
        objArrQ.getClass();
        Object obj = f61Var.c;
        obj.getClass();
        Object[] objArr3 = (Object[]) obj;
        if (objArrQ[1] != null) {
            return new ev2(objArrQ, objArr3, i, i2);
        }
        Object obj2 = objArrQ[0];
        obj2.getClass();
        return new ev2((Object[]) obj2, objArr3, i, i2 - 5);
    }

    public final int v() {
        return (this.h - 1) & (-32);
    }
}

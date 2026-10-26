package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class fv2 extends h0 implements Collection, hu1 {
    public k0 c;
    public Object[] d;
    public Object[] h;
    public int l;
    public rn0 m = new rn0(18);
    public Object[] n;
    public Object[] o;
    public int p;

    public fv2(k0 k0Var, Object[] objArr, Object[] objArr2, int i) {
        this.c = k0Var;
        this.d = objArr;
        this.h = objArr2;
        this.l = i;
        this.n = objArr;
        this.o = objArr2;
        this.p = k0Var.b();
    }

    public static void j(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final Object[] A(int i, Object[] objArr, Object[] objArr2) {
        int iD = y64.D(b() - 1, i);
        Object[] objArrQ = q(objArr);
        if (i == 5) {
            objArrQ[iD] = objArr2;
            return objArrQ;
        }
        objArrQ[iD] = A(i - 5, (Object[]) objArrQ[iD], objArr2);
        return objArrQ;
    }

    public final int B(le1 le1Var, Object[] objArr, int i, int i2, f61 f61Var, ArrayList arrayList, ArrayList arrayList2) {
        if (o(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = f61Var.c;
        obj.getClass();
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrS = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) le1Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrS = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : s();
                    i2 = 0;
                }
                objArrS[i2] = obj2;
                i2++;
            }
        }
        f61Var.c = objArrS;
        if (objArr2 != objArrS) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int C(le1 le1Var, Object[] objArr, int i, f61 f61Var) {
        Object[] objArrQ = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) le1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrQ = q(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrQ[i2] = obj;
                i2++;
            }
        }
        f61Var.c = objArrQ;
        return i2;
    }

    public final int D(le1 le1Var, int i, f61 f61Var) {
        int iC = C(le1Var, this.o, i, f61Var);
        Object obj = f61Var.c;
        if (iC == i) {
            return i;
        }
        obj.getClass();
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iC, i, (Object) null);
        this.o = objArr;
        this.p -= i - iC;
        return iC;
    }

    public final boolean E(le1 le1Var) {
        int i;
        le1 le1Var2 = le1Var;
        int iK = K();
        Object[] objArrU = null;
        f61 f61Var = new f61(null);
        boolean z = false;
        if (this.n != null) {
            e0 e0VarP = p(0);
            int iC = 32;
            while (iC == 32 && e0VarP.hasNext()) {
                iC = C(le1Var2, (Object[]) e0VarP.next(), 32, f61Var);
            }
            if (iC == 32) {
                int iD = D(le1Var2, iK, f61Var);
                if (iD == 0) {
                    w(this.n, this.p, this.l);
                }
                if (iD != iK) {
                }
            } else {
                int i2 = (e0VarP.c - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iB = iC;
                while (e0VarP.hasNext()) {
                    iB = B(le1Var2, (Object[]) e0VarP.next(), 32, iB, f61Var, arrayList2, arrayList);
                    le1Var2 = le1Var;
                }
                int iB2 = B(le1Var, this.o, iK, iB, f61Var, arrayList2, arrayList);
                Object obj = f61Var.c;
                obj.getClass();
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iB2, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrX = this.n;
                if (zIsEmpty) {
                    objArrX.getClass();
                } else {
                    objArrX = x(objArrX, i2, this.l, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    zx2.a("invalid size");
                }
                if (size == 0) {
                    this.l = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.l;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.l = i - 5;
                        Object[] objArr2 = objArrX[0];
                        objArr2.getClass();
                        objArrX = objArr2;
                    }
                    objArrU = u(objArrX, i3, i);
                }
                this.n = objArrU;
                this.o = objArr;
                this.p = size + iB2;
            }
            z = true;
        } else if (D(le1Var2, iK, f61Var) != iK) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] F(Object[] objArr, int i, int i2, f61 f61Var) {
        int iD = y64.D(i2, i);
        if (i == 0) {
            Object obj = objArr[iD];
            Object[] objArrQ = q(objArr);
            vl.j0(iD, iD + 1, 32, objArr, objArrQ);
            objArrQ[31] = f61Var.c;
            f61Var.c = obj;
            return objArrQ;
        }
        int iD2 = objArr[31] == null ? y64.D(H() - 1, i) : 31;
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        int i4 = iD + 1;
        if (i4 <= iD2) {
            while (true) {
                Object obj2 = objArrQ2[iD2];
                obj2.getClass();
                objArrQ2[iD2] = F((Object[]) obj2, i3, 0, f61Var);
                if (iD2 == i4) {
                    break;
                }
                iD2--;
            }
        }
        Object obj3 = objArrQ2[iD];
        obj3.getClass();
        objArrQ2[iD] = F((Object[]) obj3, i3, i2, f61Var);
        return objArrQ2;
    }

    public final Object G(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.p - i;
        Object[] objArr2 = this.o;
        if (i4 == 1) {
            Object obj = objArr2[0];
            w(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrQ = q(objArr2);
        vl.j0(i3, i3 + 1, i4, objArr2, objArrQ);
        objArrQ[i4 - 1] = null;
        this.n = objArr;
        this.o = objArrQ;
        this.p = (i + i4) - 1;
        this.l = i2;
        return obj2;
    }

    public final int H() {
        int i = this.p;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] I(Object[] objArr, int i, int i2, Object obj, f61 f61Var) {
        int iD = y64.D(i2, i);
        Object[] objArrQ = q(objArr);
        if (i != 0) {
            Object obj2 = objArrQ[iD];
            obj2.getClass();
            objArrQ[iD] = I((Object[]) obj2, i - 5, i2, obj, f61Var);
            return objArrQ;
        }
        if (objArrQ != objArr) {
            ((AbstractList) this).modCount++;
        }
        f61Var.c = objArrQ[iD];
        objArrQ[iD] = obj;
        return objArrQ;
    }

    public final void J(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrS;
        if (i3 < 1) {
            zx2.a("requires at least one nullBuffer");
        }
        Object[] objArrQ = q(objArr);
        objArr2[0] = objArrQ;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            vl.j0(size + 1, i4, i2, objArrQ, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrS = objArrQ;
            } else {
                objArrS = s();
                i3--;
                objArr2[i3] = objArrS;
            }
            int i7 = i2 - i6;
            vl.j0(0, i7, i2, objArrQ, objArr3);
            vl.j0(size + 1, i4, i7, objArrQ, objArrS);
            objArr3 = objArrS;
        }
        Iterator it = collection.iterator();
        j(objArrQ, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrS2 = s();
            j(objArrS2, 0, it);
            objArr2[i8] = objArrS2;
        }
        j(objArr3, 0, it);
    }

    public final int K() {
        int i = this.p;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        gm4.l(i, b());
        if (i == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iH = H();
        if (i >= iH) {
            n(i - iH, obj, this.n);
            return;
        }
        f61 f61Var = new f61(null);
        Object[] objArr = this.n;
        objArr.getClass();
        n(0, f61Var.c, m(objArr, this.l, i, obj, f61Var));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iK = K();
        if (iK < 32) {
            Object[] objArrQ = q(this.o);
            objArrQ[iK] = obj;
            this.o = objArrQ;
            this.p = b() + 1;
        } else {
            z(this.n, this.o, t(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrS;
        gm4.l(i, this.p);
        if (i == this.p) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.p - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.o;
            Object[] objArrQ = q(objArr);
            vl.j0(size2 + 1, i3, K(), objArr, objArrQ);
            j(objArrQ, i3, collection.iterator());
            this.o = objArrQ;
            this.p = collection.size() + this.p;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iK = K();
        int size3 = collection.size() + this.p;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= H()) {
            objArrS = s();
            collection2 = collection;
            J(collection2, i, this.o, iK, objArr2, size, objArrS);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.o;
            if (size3 > iK) {
                int i4 = size3 - iK;
                Object[] objArrR = r(i4, objArr3);
                l(collection2, i, i4, objArr2, size, objArrR);
                objArr2 = objArr2;
                objArrS = objArrR;
            } else {
                objArrS = s();
                int i5 = iK - size3;
                vl.j0(0, i5, iK, objArr3, objArrS);
                int i6 = 32 - i5;
                Object[] objArrR2 = r(i6, this.o);
                int i7 = size - 1;
                objArr2[i7] = objArrR2;
                l(collection2, i, i6, objArr2, i7, objArrR2);
                collection2 = collection2;
            }
        }
        this.n = y(this.n, i2, objArr2);
        this.o = objArrS;
        this.p = collection2.size() + this.p;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iK = K();
        Iterator it = collection.iterator();
        if (32 - iK >= collection.size()) {
            Object[] objArrQ = q(this.o);
            j(objArrQ, iK, it);
            this.o = objArrQ;
            this.p = collection.size() + this.p;
            return true;
        }
        int size = ((collection.size() + iK) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrQ2 = q(this.o);
        j(objArrQ2, iK, it);
        objArr[0] = objArrQ2;
        for (int i = 1; i < size; i++) {
            Object[] objArrS = s();
            j(objArrS, 0, it);
            objArr[i] = objArrS;
        }
        this.n = y(this.n, H(), objArr);
        Object[] objArrS2 = s();
        j(objArrS2, 0, it);
        this.o = objArrS2;
        this.p = collection.size() + this.p;
        return true;
    }

    @Override // defpackage.h0
    public final int b() {
        return this.p;
    }

    @Override // defpackage.h0
    public final Object d(int i) {
        gm4.k(i, b());
        ((AbstractList) this).modCount++;
        int iH = H();
        if (i >= iH) {
            return G(this.n, iH, this.l, i - iH);
        }
        f61 f61Var = new f61(this.o[0]);
        Object[] objArr = this.n;
        objArr.getClass();
        G(F(objArr, this.l, i, f61Var), iH, this.l, 0);
        return f61Var.c;
    }

    public final k0 g() {
        k0 ev2Var;
        Object[] objArr = this.n;
        if (objArr == this.d && this.o == this.h) {
            ev2Var = this.c;
        } else {
            this.m = new rn0(18);
            this.d = objArr;
            Object[] objArr2 = this.o;
            this.h = objArr2;
            if (objArr == null) {
                ev2Var = objArr2.length == 0 ? ck3.d : new ck3(Arrays.copyOf(objArr2, this.p));
            } else {
                ev2Var = new ev2(objArr, objArr2, this.p, this.l);
            }
        }
        this.c = ev2Var;
        return ev2Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        gm4.k(i, b());
        if (H() <= i) {
            objArr = this.o;
        } else {
            Object[] objArr2 = this.n;
            objArr2.getClass();
            for (int i2 = this.l; i2 > 0; i2 -= 5) {
                Object[] objArr3 = objArr2[y64.D(i, i2)];
                objArr3.getClass();
                objArr2 = objArr3;
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final int k() {
        return ((AbstractList) this).modCount;
    }

    public final void l(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.n == null) {
            u41.r("root is null");
            return;
        }
        int i4 = i >> 5;
        e0 e0VarP = p(H() >> 5);
        int i5 = i3;
        Object[] objArrR = objArr2;
        while (e0VarP.c - 1 != i4) {
            Object[] objArr3 = (Object[]) e0VarP.previous();
            vl.j0(0, 32 - i2, 32, objArr3, objArrR);
            objArrR = r(i2, objArr3);
            i5--;
            objArr[i5] = objArrR;
        }
        Object[] objArr4 = (Object[]) e0VarP.previous();
        int iH = i3 - (((H() >> 5) - 1) - i4);
        if (iH < i3) {
            objArr2 = objArr[iH];
            objArr2.getClass();
        }
        J(collection, i, objArr4, 32, objArr, iH, objArr2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        gm4.l(i, this.p);
        return new hv2(this, i);
    }

    public final Object[] m(Object[] objArr, int i, int i2, Object obj, f61 f61Var) {
        Object obj2;
        int iD = y64.D(i2, i);
        if (i == 0) {
            f61Var.c = objArr[31];
            Object[] objArrQ = q(objArr);
            vl.j0(iD + 1, iD, 31, objArr, objArrQ);
            objArrQ[iD] = obj;
            return objArrQ;
        }
        Object[] objArrQ2 = q(objArr);
        int i3 = i - 5;
        Object obj3 = objArrQ2[iD];
        obj3.getClass();
        objArrQ2[iD] = m((Object[]) obj3, i3, i2, obj, f61Var);
        while (true) {
            iD++;
            if (iD >= 32 || (obj2 = objArrQ2[iD]) == null) {
                break;
            }
            objArrQ2[iD] = m((Object[]) obj2, i3, 0, f61Var.c, f61Var);
        }
        return objArrQ2;
    }

    public final void n(int i, Object obj, Object[] objArr) {
        int iK = K();
        Object[] objArrQ = q(this.o);
        Object[] objArr2 = this.o;
        if (iK >= 32) {
            Object obj2 = objArr2[31];
            vl.j0(i + 1, i, 31, objArr2, objArrQ);
            objArrQ[i] = obj;
            z(objArr, objArrQ, t(obj2));
            return;
        }
        vl.j0(i + 1, i, iK, objArr2, objArrQ);
        objArrQ[i] = obj;
        this.n = objArr;
        this.o = objArrQ;
        this.p++;
    }

    public final boolean o(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.m;
    }

    public final e0 p(int i) {
        Object[] objArr = this.n;
        if (objArr == null) {
            u41.r("Invalid root");
            return null;
        }
        int iH = H() >> 5;
        gm4.l(i, iH);
        int i2 = this.l;
        return i2 == 0 ? new ey(i, objArr) : new m64(objArr, i, iH, i2 / 5);
    }

    public final Object[] q(Object[] objArr) {
        if (objArr == null) {
            return s();
        }
        if (o(objArr)) {
            return objArr;
        }
        Object[] objArrS = s();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        vl.n0(0, length, 6, objArr, objArrS);
        return objArrS;
    }

    public final Object[] r(int i, Object[] objArr) {
        if (o(objArr)) {
            vl.j0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrS = s();
        vl.j0(i, 0, 32 - i, objArr, objArrS);
        return objArrS;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return E(new j0(1, collection));
    }

    public final Object[] s() {
        Object[] objArr = new Object[33];
        objArr[32] = this.m;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        gm4.k(i, b());
        if (H() > i) {
            f61 f61Var = new f61(null);
            Object[] objArr = this.n;
            objArr.getClass();
            this.n = I(objArr, this.l, i, obj, f61Var);
            return f61Var.c;
        }
        Object[] objArrQ = q(this.o);
        if (objArrQ != this.o) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrQ[i2];
        objArrQ[i2] = obj;
        this.o = objArrQ;
        return obj2;
    }

    public final Object[] t(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.m;
        return objArr;
    }

    public final Object[] u(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            zx2.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iD = y64.D(i, i2);
        Object obj = objArr[iD];
        obj.getClass();
        Object objU = u((Object[]) obj, i, i2 - 5);
        if (iD < 31) {
            int i3 = iD + 1;
            if (objArr[i3] != null) {
                if (o(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrS = s();
                vl.j0(0, 0, i3, objArr, objArrS);
                objArr = objArrS;
            }
        }
        if (objU == objArr[iD]) {
            return objArr;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iD] = objU;
        return objArrQ;
    }

    public final Object[] v(Object[] objArr, int i, int i2, f61 f61Var) {
        Object[] objArrV;
        int iD = y64.D(i2 - 1, i);
        if (i == 5) {
            f61Var.c = objArr[iD];
            objArrV = null;
        } else {
            Object obj = objArr[iD];
            obj.getClass();
            objArrV = v((Object[]) obj, i - 5, i2, f61Var);
        }
        if (objArrV == null && iD == 0) {
            return null;
        }
        Object[] objArrQ = q(objArr);
        objArrQ[iD] = objArrV;
        return objArrQ;
    }

    public final void w(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.n = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.o = objArr;
            this.p = i;
            this.l = i2;
            return;
        }
        f61 f61Var = new f61(null);
        objArr.getClass();
        Object[] objArrV = v(objArr, i2, i, f61Var);
        objArrV.getClass();
        Object obj = f61Var.c;
        obj.getClass();
        this.o = (Object[]) obj;
        this.p = i;
        if (objArrV[1] == null) {
            this.n = (Object[]) objArrV[0];
            this.l = i2 - 5;
        } else {
            this.n = objArrV;
            this.l = i2;
        }
    }

    public final Object[] x(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            zx2.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            zx2.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrQ = q(objArr);
        int iD = y64.D(i, i2);
        int i3 = i2 - 5;
        objArrQ[iD] = x((Object[]) objArrQ[iD], i, i3, it);
        while (true) {
            iD++;
            if (iD >= 32 || !it.hasNext()) {
                break;
            }
            objArrQ[iD] = x((Object[]) objArrQ[iD], 0, i3, it);
        }
        return objArrQ;
    }

    public final Object[] y(Object[] objArr, int i, Object[][] objArr2) {
        a0 a0Var = new a0(objArr2);
        int i2 = i >> 5;
        int i3 = this.l;
        Object[] objArrX = i2 < (1 << i3) ? x(objArr, i, i3, a0Var) : q(objArr);
        while (a0Var.hasNext()) {
            this.l += 5;
            objArrX = t(objArrX);
            int i4 = this.l;
            x(objArrX, 1 << i4, i4, a0Var);
        }
        return objArrX;
    }

    public final void z(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.p;
        int i2 = i >> 5;
        int i3 = this.l;
        if (i2 > (1 << i3)) {
            this.n = A(this.l + 5, t(objArr), objArr2);
            this.o = objArr3;
            this.l += 5;
            this.p++;
            return;
        }
        if (objArr == null) {
            this.n = objArr2;
            this.o = objArr3;
            this.p = i + 1;
        } else {
            this.n = A(i3, objArr, objArr2);
            this.o = objArr3;
            this.p++;
        }
    }
}

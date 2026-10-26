package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ck3 extends k0 {
    public static final ck3 d = new ck3(new Object[0]);
    public final Object[] c;

    public ck3(Object[] objArr) {
        this.c = objArr;
    }

    @Override // defpackage.t
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.k0
    public final k0 d(int i, Object obj) {
        Object[] objArr = this.c;
        gm4.l(i, objArr.length);
        if (i == objArr.length) {
            return g(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            vl.n0(0, i, 6, objArr, objArr2);
            vl.j0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new ck3(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        vl.j0(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new ev2(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.k0
    public final k0 g(Object obj) {
        Object[] objArr = this.c;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new ck3(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new ev2(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.c;
        gm4.k(i, objArr.length);
        return objArr[i];
    }

    @Override // defpackage.d0, java.util.List
    public final int indexOf(Object obj) {
        return vl.x0(this.c, obj);
    }

    @Override // defpackage.k0
    public final k0 j(Collection collection) {
        Object[] objArr = this.c;
        if (collection.size() + objArr.length > 32) {
            fv2 fv2VarK = k();
            fv2VarK.addAll(collection);
            return fv2VarK.g();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new ck3(objArrCopyOf);
    }

    @Override // defpackage.k0
    public final fv2 k() {
        return new fv2(this, null, this.c, 0);
    }

    @Override // defpackage.k0
    public final k0 l(j0 j0Var) {
        Object[] objArr = this.c;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) j0Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? d : new ck3(vl.o0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.d0, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.c;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.d0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.c;
        gm4.l(i, objArr.length);
        return new ey(objArr, i, objArr.length);
    }

    @Override // defpackage.k0
    public final k0 m(int i) {
        Object[] objArr = this.c;
        gm4.k(i, objArr.length);
        if (objArr.length == 1) {
            return d;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        vl.j0(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new ck3(objArrCopyOf);
    }

    @Override // defpackage.k0
    public final k0 n(int i, Object obj) {
        Object[] objArr = this.c;
        gm4.k(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new ck3(objArrCopyOf);
    }
}

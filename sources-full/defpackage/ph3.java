package defpackage;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ph3 {
    public int[] c;
    public Object[] d;
    public int h;

    public ph3(int i) {
        this.c = i == 0 ? gm4.b : new int[i];
        this.d = i == 0 ? gm4.d : new Object[i << 1];
    }

    public final int a(Object obj) {
        int i = this.h * 2;
        Object[] objArr = this.d;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i, Object obj) {
        int i2 = this.h;
        if (i2 == 0) {
            return -1;
        }
        int iG = gm4.g(i2, i, this.c);
        if (iG < 0 || kr1.n(obj, this.d[iG << 1])) {
            return iG;
        }
        int i3 = iG + 1;
        while (i3 < i2 && this.c[i3] == i) {
            if (kr1.n(obj, this.d[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iG - 1; i4 >= 0 && this.c[i4] == i; i4--) {
            if (kr1.n(obj, this.d[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.h > 0) {
            this.c = gm4.b;
            this.d = gm4.d;
            this.h = 0;
        }
        if (this.h > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i = this.h;
        if (i == 0) {
            return -1;
        }
        int iG = gm4.g(i, 0, this.c);
        if (iG < 0 || this.d[iG << 1] == null) {
            return iG;
        }
        int i2 = iG + 1;
        while (i2 < i && this.c[i2] == 0) {
            if (this.d[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iG - 1; i3 >= 0 && this.c[i3] == 0; i3--) {
            if (this.d[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.h) {
            z = true;
        }
        if (z) {
            return this.d[i << 1];
        }
        u41.k(ud2.m(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof ph3) {
                int i = this.h;
                if (i != ((ph3) obj).h) {
                    return false;
                }
                ph3 ph3Var = (ph3) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objE = e(i2);
                    Object objH = h(i2);
                    Object obj2 = ph3Var.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !ph3Var.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.h != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objE2 = e(i4);
                Object objH2 = h(i4);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.h)) {
            u41.k(ud2.m(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.d;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.c;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                vl.i0(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.d;
                vl.j0(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.d;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.c = Arrays.copyOf(iArr, i7);
            this.d = Arrays.copyOf(this.d, i7 << 1);
            if (i2 != this.h) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                vl.i0(0, 0, i, iArr, this.c);
                vl.j0(0, 0, i3, objArr, this.d);
            }
            if (i < i4) {
                int i8 = i + 1;
                vl.i0(i, i8, i2, iArr, this.c);
                vl.j0(i3, i8 << 1, i2 << 1, objArr, this.d);
            }
        }
        if (i2 != this.h) {
            throw new ConcurrentModificationException();
        }
        this.h = i4;
        return obj;
    }

    public final Object g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.h) {
            z = true;
        }
        if (!z) {
            u41.k(ud2.m(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.d;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.d[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.d[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.h) {
            z = true;
        }
        if (z) {
            return this.d[(i << 1) + 1];
        }
        u41.k(ud2.m(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int hashCode() {
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i = this.h;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.h <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.h;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i2 = (iB << 1) + 1;
            Object[] objArr = this.d;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iB;
        int[] iArr = this.c;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.c = Arrays.copyOf(iArr, i4);
            this.d = Arrays.copyOf(this.d, i4 << 1);
            if (i != this.h) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.c;
            int i5 = i3 + 1;
            vl.i0(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.d;
            vl.j0(i5 << 1, i3 << 1, this.h << 1, objArr2, objArr2);
        }
        int i6 = this.h;
        if (i == i6) {
            int[] iArr3 = this.c;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.d;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.h = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !kr1.n(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !kr1.n(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }

    public final int size() {
        return this.h;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.h * 28);
        sb.append('{');
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objE = e(i2);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i2);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

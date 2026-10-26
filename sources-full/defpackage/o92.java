package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class o92 implements Map, Serializable, iu1 {
    public static final o92 v;
    public Object[] c;
    public Object[] d;
    public int[] h;
    public int[] l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public p92 r;
    public q92 s;
    public p92 t;
    public boolean u;

    static {
        o92 o92Var = new o92(0);
        o92Var.u = true;
        v = o92Var;
    }

    public o92() {
        this(8);
    }

    public o92(int i) {
        if (i < 0) {
            u41.k("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.c = objArr;
        this.d = null;
        this.h = iArr;
        this.l = new int[iHighestOneBit];
        this.m = 2;
        this.n = 0;
        this.o = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.m * 2;
            int length = this.l.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.l;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.n;
                    Object[] objArr = this.c;
                    if (i5 >= objArr.length) {
                        f(1);
                        break;
                    }
                    int i6 = i5 + 1;
                    this.n = i6;
                    objArr[i5] = obj;
                    this.h[i5] = i;
                    iArr[i] = i6;
                    this.q++;
                    this.p++;
                    if (i3 > this.m) {
                        this.m = i3;
                    }
                    return i5;
                }
                if (kr1.n(this.c[i4 - 1], obj)) {
                    return -i4;
                }
                i3++;
                if (i3 > i2) {
                    j(this.l.length * 2);
                    break;
                }
                i = i == 0 ? this.l.length - 1 : i - 1;
            }
        }
    }

    public final o92 b() {
        c();
        this.u = true;
        if (this.q > 0) {
            return this;
        }
        o92 o92Var = v;
        o92Var.getClass();
        return o92Var;
    }

    public final void c() {
        if (this.u) {
            m51.e();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.n - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.h;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.l[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        sf3.S(this.c, 0, this.n);
        Object[] objArr = this.d;
        if (objArr != null) {
            sf3.S(objArr, 0, this.n);
        }
        this.q = 0;
        this.n = 0;
        this.p++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.d;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.n;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.h;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.c;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.l[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        sf3.S(this.c, i3, i);
        if (objArr != null) {
            sf3.S(objArr, i3, this.n);
        }
        this.n = i3;
    }

    public final boolean e(Collection collection) {
        boolean zN;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zN = false;
                    } else {
                        Object[] objArr = this.d;
                        objArr.getClass();
                        zN = kr1.n(objArr[iG], entry.getValue());
                    }
                    if (!zN) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        p92 p92Var = this.t;
        if (p92Var != null) {
            return p92Var;
        }
        p92 p92Var2 = new p92(this, 0);
        this.t = p92Var2;
        return p92Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.q == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.c;
        int length = objArr.length;
        int i2 = this.n;
        int i3 = length - i2;
        int i4 = i2 - this.q;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? IntCompanionObject.MAX_VALUE : 2147483639;
            }
            this.c = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.d;
            this.d = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.h = Arrays.copyOf(this.h, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.l.length) {
                j(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.m;
        while (true) {
            int i3 = this.l[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (kr1.n(this.c[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.l.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr[iG];
    }

    public final int h(Object obj) {
        int i = this.n;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.h[i] >= 0) {
                Object[] objArr = this.d;
                objArr.getClass();
                if (kr1.n(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        l92 l92Var = new l92(this, 0);
        int i = 0;
        while (l92Var.hasNext()) {
            int i2 = l92Var.c;
            o92 o92Var = (o92) l92Var.l;
            if (i2 >= o92Var.n) {
                m51.o();
                return 0;
            }
            l92Var.c = i2 + 1;
            l92Var.d = i2;
            Object obj = o92Var.c[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = o92Var.d;
            objArr.getClass();
            Object obj2 = objArr[l92Var.d];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            l92Var.e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.o;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.q == 0;
    }

    public final void j(int i) {
        int[] iArr;
        this.p++;
        int i2 = 0;
        if (this.n > this.q) {
            d(false);
        }
        this.l = new int[i];
        this.o = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.n) {
            int i3 = i2 + 1;
            int i4 = i(this.c[i2]);
            int i5 = this.m;
            while (true) {
                iArr = this.l;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    u41.r("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
            iArr[i4] = i3;
            this.h[i2] = i4;
            i2 = i3;
        }
    }

    public final void k(int i) {
        Object[] objArr = this.c;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.d;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.h[i];
        int i2 = this.m * 2;
        int length2 = this.l.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        do {
            length = length == 0 ? this.l.length - 1 : length - 1;
            i4++;
            int i6 = this.m;
            int[] iArr = this.l;
            if (i4 > i6) {
                iArr[i5] = 0;
            } else {
                int i7 = iArr[length];
                if (i7 == 0) {
                    iArr[i5] = 0;
                } else {
                    if (i7 < 0) {
                        iArr[i5] = -1;
                    } else {
                        int i8 = i7 - 1;
                        int i9 = i(this.c[i8]) - length;
                        int[] iArr2 = this.l;
                        if ((i9 & (iArr2.length - 1)) >= i4) {
                            iArr2[i5] = i7;
                            this.h[i8] = i5;
                        }
                        i3--;
                    }
                    i5 = length;
                    i4 = 0;
                    i3--;
                }
            }
            this.h[i] = -1;
            this.q--;
            this.p++;
        } while (i3 >= 0);
        this.l[i5] = -1;
        this.h[i] = -1;
        this.q--;
        this.p++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        p92 p92Var = this.r;
        if (p92Var != null) {
            return p92Var;
        }
        p92 p92Var2 = new p92(this, 1);
        this.r = p92Var2;
        return p92Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.d;
        if (objArr == null) {
            int length = this.c.length;
            if (length < 0) {
                u41.k("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.d = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.d;
            if (objArr == null) {
                int length = this.c.length;
                if (length < 0) {
                    u41.k("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.d = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!kr1.n(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.d;
        objArr.getClass();
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.q;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.q * 3) + 2);
        sb.append("{");
        int i = 0;
        l92 l92Var = new l92(this, 0);
        while (l92Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = l92Var.c;
            o92 o92Var = (o92) l92Var.l;
            if (i2 >= o92Var.n) {
                m51.o();
                return null;
            }
            l92Var.c = i2 + 1;
            l92Var.d = i2;
            Object obj = o92Var.c[i2];
            if (obj == o92Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = o92Var.d;
            objArr.getClass();
            Object obj2 = objArr[l92Var.d];
            if (obj2 == o92Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            l92Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        q92 q92Var = this.s;
        if (q92Var != null) {
            return q92Var;
        }
        q92 q92Var2 = new q92(0, this);
        this.s = q92Var2;
        return q92Var2;
    }
}

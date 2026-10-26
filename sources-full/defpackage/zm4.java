package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zm4 extends nm4 implements Set {
    public static final /* synthetic */ int h = 0;
    public transient xm4 d;

    public static int m(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        u41.k("collection too large");
        return 0;
    }

    public static zm4 o(int i, Object... objArr) {
        if (i == 0) {
            return in4.r;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new jn4(obj);
        }
        int iM = m(i);
        Object[] objArr2 = new Object[iM];
        int i2 = iM - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                m51.x(ud2.m(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iB = ug4.b(iHashCode);
            while (true) {
                int i6 = iB & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new jn4(obj4);
        }
        if (m(i4) < iM / 2) {
            return o(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new in4(i3, i2, i4, objArr, objArr2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zm4) && (this instanceof in4) && (((zm4) obj) instanceof in4) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                return size() == set.size() && containsAll(set);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // defpackage.nm4
    public xm4 j() {
        xm4 xm4Var = this.d;
        if (xm4Var != null) {
            return xm4Var;
        }
        xm4 xm4VarN = n();
        this.d = xm4VarN;
        return xm4VarN;
    }

    public xm4 n() {
        Object[] array = toArray(nm4.c);
        pm4 pm4Var = xm4.d;
        return xm4.n(array.length, array);
    }
}

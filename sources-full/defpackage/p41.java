package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class p41 extends d0 implements o41, Serializable {
    public final Enum[] c;

    public p41(Enum[] enumArr) {
        enumArr.getClass();
        this.c = enumArr;
    }

    @Override // defpackage.t
    public final int b() {
        return this.c.length;
    }

    @Override // defpackage.t, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        Enum[] enumArr = this.c;
        enumArr.getClass();
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.c;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        m51.s(ud2.l(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.d0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.c;
        enumArr.getClass();
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.d0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        Enum[] enumArr = this.c;
        enumArr.getClass();
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}

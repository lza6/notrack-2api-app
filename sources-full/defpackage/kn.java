package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kn implements Iterable, Cloneable {
    public static final String[] l = new String[0];
    public int c = 0;
    public String[] d;
    public String[] h;

    public kn() {
        String[] strArr = l;
        this.d = strArr;
        this.h = strArr;
    }

    public final int b(String str) {
        if (str == null) {
            u41.k("Object must not be null");
            return 0;
        }
        for (int i = 0; i < this.c; i++) {
            if (str.equals(this.d[i])) {
                return i;
            }
        }
        return -1;
    }

    public final Object clone() {
        try {
            kn knVar = (kn) super.clone();
            knVar.c = this.c;
            String[] strArr = this.d;
            int i = this.c;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.d = strArr2;
            String[] strArr3 = this.h;
            int i2 = this.c;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.h = strArr4;
            return knVar;
        } catch (CloneNotSupportedException e) {
            m51.n(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kn.class != obj.getClass()) {
            return false;
        }
        kn knVar = (kn) obj;
        if (this.c == knVar.c && Arrays.equals(this.d, knVar.d)) {
            return Arrays.equals(this.h, knVar.h);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.c * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.h);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jn(this);
    }
}

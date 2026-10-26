package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b84 implements Comparable {
    public final long c;

    public /* synthetic */ b84(long j) {
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((b84) obj).c;
        long j2 = this.c ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b84) {
            return this.c == ((b84) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        long j = this.c;
        if (j >= 0) {
            yo4.m(10);
            String string = Long.toString(j, 10);
            string.getClass();
            return string;
        }
        long j2 = ((j >>> 1) / 10) << 1;
        long j3 = j - (j2 * 10);
        if (j3 >= 10) {
            j3 -= 10;
            j2++;
        }
        yo4.m(10);
        String string2 = Long.toString(j2, 10);
        string2.getClass();
        yo4.m(10);
        String string3 = Long.toString(j3, 10);
        string3.getClass();
        return string2.concat(string3);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w74 implements Comparable {
    public final int c;

    public /* synthetic */ w74(int i) {
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kr1.z(this.c ^ Integer.MIN_VALUE, ((w74) obj).c ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w74) {
            return this.c == ((w74) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }

    public final String toString() {
        return String.valueOf(((long) this.c) & 4294967295L);
    }
}

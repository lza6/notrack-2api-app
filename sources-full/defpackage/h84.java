package defpackage;

import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
public final class h84 implements Comparable {
    public final short c;

    public /* synthetic */ h84(short s) {
        this.c = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kr1.z(this.c & UShort.MAX_VALUE, ((h84) obj).c & UShort.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h84) {
            return this.c == ((h84) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.c);
    }

    public final String toString() {
        return String.valueOf(this.c & UShort.MAX_VALUE);
    }
}

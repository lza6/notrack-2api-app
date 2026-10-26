package defpackage;

import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class r74 implements Comparable {
    public final byte c;

    public /* synthetic */ r74(byte b) {
        this.c = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return kr1.z(this.c & UByte.MAX_VALUE, ((r74) obj).c & UByte.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r74) {
            return this.c == ((r74) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.c);
    }

    public final String toString() {
        return String.valueOf(this.c & UByte.MAX_VALUE);
    }
}

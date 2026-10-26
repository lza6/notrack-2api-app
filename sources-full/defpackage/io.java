package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class io extends jt {
    public final ArrayList a;

    public io(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jt)) {
            return false;
        }
        return this.a.equals(((io) ((jt) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}

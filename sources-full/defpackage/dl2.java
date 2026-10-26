package defpackage;

import android.net.NetworkRequest;

/* JADX INFO: loaded from: classes.dex */
public final class dl2 {
    public static final String b = v72.h("NetworkRequestCompat");
    public final Object a;

    public dl2(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl2) && kr1.n(this.a, ((dl2) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }
}

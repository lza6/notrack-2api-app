package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class i63 implements Serializable {
    public final Throwable c;

    public i63(Throwable th) {
        th.getClass();
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i63) {
            return kr1.n(this.c, ((i63) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.c + ')';
    }
}

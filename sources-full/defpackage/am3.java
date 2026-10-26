package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class am3 implements AutoCloseable {
    public final ny c;

    public /* synthetic */ am3(ny nyVar) {
        this.c = nyVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof am3) {
            return this.c.equals(((am3) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "SourceResponseBody(source=" + this.c + ')';
    }
}

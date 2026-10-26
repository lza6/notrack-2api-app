package defpackage;

import java.io.EOFException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class iv implements zh3 {
    @Override // defpackage.zh3
    public final c b() {
        return c.d;
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) throws EOFException {
        dyVar.skip(j);
    }

    @Override // defpackage.zh3, java.io.Flushable
    public final void flush() {
    }
}

package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public interface zh3 extends Closeable, Flushable {
    c b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d(dy dyVar, long j);

    void flush();
}

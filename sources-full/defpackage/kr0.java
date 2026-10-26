package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class kr0 implements Closeable {
    public t13 c;
    public f61 d;
    public t13 h;
    public b51 l;
    public t13 m;
    public t13 n;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((o83) this.m.get()).close();
    }
}

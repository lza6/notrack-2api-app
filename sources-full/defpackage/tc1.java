package defpackage;

import java.io.IOException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class tc1 implements wl3 {
    public final wl3 c;

    public tc1(wl3 wl3Var) {
        wl3Var.getClass();
        this.c = wl3Var;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.c.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.c + ')';
    }

    @Override // defpackage.wl3
    public long y(dy dyVar, long j) {
        dyVar.getClass();
        return this.c.y(dyVar, j);
    }
}

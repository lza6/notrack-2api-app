package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class xj1 extends tj1 {
    public boolean l;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        if (!this.l) {
            a();
        }
        this.d = true;
    }

    @Override // defpackage.tj1, defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        dyVar.getClass();
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return 0L;
        }
        if (this.d) {
            u41.r("closed");
            return 0L;
        }
        if (this.l) {
            return -1L;
        }
        long jY = super.y(dyVar, j);
        if (jY != -1) {
            return jY;
        }
        this.l = true;
        a();
        return -1L;
    }
}

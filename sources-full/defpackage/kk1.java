package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;
import kotlin.jvm.internal.IntCompanionObject;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class kk1 implements wl3 {
    public final ny c;
    public int d;
    public int h;
    public int l;
    public int m;
    public int n;

    public kk1(ny nyVar) {
        nyVar.getClass();
        this.c = nyVar;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        int i;
        int i2;
        dyVar.getClass();
        do {
            int i3 = this.m;
            ny nyVar = this.c;
            if (i3 == 0) {
                nyVar.skip(this.n);
                this.n = 0;
                if ((this.h & 4) == 0) {
                    i = this.l;
                    int iS = ka4.s(nyVar);
                    this.m = iS;
                    this.d = iS;
                    int i4 = nyVar.readByte() & UByte.MAX_VALUE;
                    this.h = nyVar.readByte() & UByte.MAX_VALUE;
                    Logger logger = lk1.l;
                    if (logger.isLoggable(Level.FINE)) {
                        lz lzVar = zj1.a;
                        logger.fine(zj1.a(true, this.l, this.d, i4, this.h));
                    }
                    i2 = nyVar.readInt() & IntCompanionObject.MAX_VALUE;
                    this.l = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jY = nyVar.y(dyVar, Math.min(j, i3));
                if (jY != -1) {
                    this.m -= (int) jY;
                    return jY;
                }
            }
            return -1L;
        } while (i2 == i);
        m51.l("TYPE_CONTINUATION streamId changed");
        return 0L;
    }
}

package defpackage;

import java.nio.ByteBuffer;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class ez implements wl3 {
    public final ByteBuffer c;
    public final int d;

    public ez(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        this.c = byteBufferSlice;
        this.d = byteBufferSlice.capacity();
    }

    @Override // defpackage.wl3
    public final c b() {
        return c.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) {
        ByteBuffer byteBuffer = this.c;
        int iPosition = byteBuffer.position();
        int i = this.d;
        if (iPosition == i) {
            return -1L;
        }
        int iPosition2 = (int) (((long) byteBuffer.position()) + j);
        if (iPosition2 <= i) {
            i = iPosition2;
        }
        byteBuffer.limit(i);
        return dyVar.write(byteBuffer);
    }
}

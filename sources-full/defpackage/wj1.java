package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class wj1 extends tj1 {
    public long l;
    public final /* synthetic */ yj1 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj1(yj1 yj1Var, long j) {
        super(yj1Var);
        this.m = yj1Var;
        this.l = j;
        if (j == 0) {
            a();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.d) {
            return;
        }
        if (this.l != 0) {
            byte[] bArr = ka4.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zT = ka4.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                this.m.b.k();
                a();
            }
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
        long j2 = this.l;
        if (j2 == 0) {
            return -1L;
        }
        long jY = super.y(dyVar, Math.min(j2, j));
        if (jY == -1) {
            this.m.b.k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a();
            throw protocolException;
        }
        long j3 = this.l - jY;
        this.l = j3;
        if (j3 == 0) {
            a();
        }
        return jY;
    }
}

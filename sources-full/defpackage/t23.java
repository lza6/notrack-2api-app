package defpackage;

import java.nio.ByteBuffer;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class t23 implements my {
    public final zh3 c;
    public final dy d;
    public boolean h;

    public t23(zh3 zh3Var) {
        zh3Var.getClass();
        this.c = zh3Var;
        this.d = new dy();
    }

    @Override // defpackage.my
    public final my E(int i, byte[] bArr) {
        bArr.getClass();
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.S(i, bArr);
        a();
        return this;
    }

    @Override // defpackage.my
    public final my H(String str) {
        str.getClass();
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.b0(str);
        a();
        return this;
    }

    @Override // defpackage.my
    public final my I(long j) {
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.W(j);
        a();
        return this;
    }

    public final my a() {
        if (this.h) {
            u41.r("closed");
            return null;
        }
        dy dyVar = this.d;
        long jC = dyVar.c();
        if (jC > 0) {
            this.c.d(dyVar, jC);
        }
        return this;
    }

    @Override // defpackage.zh3
    public final c b() {
        return this.c.b();
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zh3 zh3Var = this.c;
        if (this.h) {
            return;
        }
        dy dyVar = this.d;
        long j = dyVar.d;
        if (j > 0) {
            zh3Var.d(dyVar, j);
        }
        th = null;
        try {
            zh3Var.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.h = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) {
        dyVar.getClass();
        if (this.h) {
            u41.r("closed");
        } else {
            this.d.d(dyVar, j);
            a();
        }
    }

    @Override // defpackage.my
    public final my e(lz lzVar) {
        lzVar.getClass();
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.T(lzVar);
        a();
        return this;
    }

    @Override // defpackage.my
    public final my f(long j) {
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.X(j);
        a();
        return this;
    }

    @Override // defpackage.my, defpackage.zh3, java.io.Flushable
    public final void flush() {
        if (this.h) {
            u41.r("closed");
            return;
        }
        dy dyVar = this.d;
        long j = dyVar.d;
        zh3 zh3Var = this.c;
        if (j > 0) {
            zh3Var.d(dyVar, j);
        }
        zh3Var.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.h) {
            u41.r("closed");
            return 0;
        }
        int iWrite = this.d.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // defpackage.my
    public final my write(byte[] bArr) {
        bArr.getClass();
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.S(bArr.length, bArr);
        a();
        return this;
    }

    @Override // defpackage.my
    public final my writeByte(int i) {
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.V(i);
        a();
        return this;
    }

    @Override // defpackage.my
    public final my writeInt(int i) {
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.Y(i);
        a();
        return this;
    }

    @Override // defpackage.my
    public final my writeShort(int i) {
        if (this.h) {
            u41.r("closed");
            return null;
        }
        this.d.Z(i);
        a();
        return this;
    }
}

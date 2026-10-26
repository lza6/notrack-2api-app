package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class u51 extends InputStream {
    public final InputStream c;
    public int d = 1073741824;

    public u51(InputStream inputStream) {
        this.c = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.d;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.c.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.c.read();
        if (i == -1) {
            this.d = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.c.read(bArr);
        if (i == -1) {
            this.d = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c.read(bArr, i, i2);
        if (i3 == -1) {
            this.d = 0;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.c.skip(j);
    }
}

package defpackage;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class n51 extends MediaDataSource {
    public long c;
    public final /* synthetic */ s51 d;

    public n51(s51 s51Var) {
        this.d = s51Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        s51 s51Var = this.d;
        DataInputStream dataInputStream = s51Var.c;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.c;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                        s51Var.c(j);
                        this.c = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = s51Var.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.c += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.c = -1L;
            return -1;
        }
        return -1;
    }
}

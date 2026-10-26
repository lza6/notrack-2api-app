package defpackage;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class s51 extends o51 {
    public s51(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.c.mark(IntCompanionObject.MAX_VALUE);
        } else {
            u41.k("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public s51(byte[] bArr) {
        super(bArr);
        this.c.mark(IntCompanionObject.MAX_VALUE);
    }

    public final void c(long j) throws IOException {
        int i = this.d;
        if (i > j) {
            this.d = 0;
            this.c.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }
}

package defpackage;

import android.util.Log;
import java.io.Writer;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class u72 extends Writer {
    public final StringBuilder d = new StringBuilder(Uuid.SIZE_BITS);
    public final String c = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.d;
        if (sb.length() > 0) {
            Log.d(this.c, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.d.append(c);
            }
        }
    }
}

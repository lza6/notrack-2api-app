package okio;

import defpackage.u04;
import defpackage.u41;
import defpackage.ud2;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static final u04 d = new u04();
    public boolean a;
    public long b;
    public long c;

    public c a() {
        this.a = false;
        return this;
    }

    public c b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        u41.r("No deadline");
        return 0L;
    }

    public c d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public c g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.c = timeUnit.toNanos(j);
            return this;
        }
        u41.h(ud2.o("timeout < 0: ", j));
        return null;
    }
}

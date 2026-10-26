package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class uc1 extends c {
    public c e;

    public uc1(c cVar) {
        cVar.getClass();
        this.e = cVar;
    }

    @Override // okio.c
    public final c a() {
        return this.e.a();
    }

    @Override // okio.c
    public final c b() {
        return this.e.b();
    }

    @Override // okio.c
    public final long c() {
        return this.e.c();
    }

    @Override // okio.c
    public final c d(long j) {
        return this.e.d(j);
    }

    @Override // okio.c
    public final boolean e() {
        return this.e.e();
    }

    @Override // okio.c
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // okio.c
    public final c g(long j) {
        TimeUnit.MILLISECONDS.getClass();
        return this.e.g(j);
    }
}

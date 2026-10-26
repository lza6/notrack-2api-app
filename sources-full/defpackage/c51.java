package defpackage;

import java.io.IOException;
import java.net.ProtocolException;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class c51 implements zh3 {
    public final zh3 c;
    public final long d;
    public boolean h;
    public long l;
    public boolean m;
    public final /* synthetic */ sd n;

    public c51(sd sdVar, zh3 zh3Var, long j) {
        zh3Var.getClass();
        this.n = sdVar;
        this.c = zh3Var;
        this.d = j;
    }

    public final void a() {
        this.c.close();
    }

    @Override // defpackage.zh3
    public final c b() {
        return this.c.b();
    }

    public final IOException c(IOException iOException) {
        if (this.h) {
            return iOException;
        }
        this.h = true;
        return this.n.a(false, true, iOException);
    }

    @Override // defpackage.zh3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.m) {
            return;
        }
        this.m = true;
        long j = this.d;
        if (j != -1 && this.l != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            a();
            c(null);
        } catch (IOException e) {
            throw c(e);
        }
    }

    @Override // defpackage.zh3
    public final void d(dy dyVar, long j) throws IOException {
        if (this.m) {
            u41.r("closed");
            return;
        }
        long j2 = this.d;
        if (j2 == -1 || this.l + j <= j2) {
            try {
                this.c.d(dyVar, j);
                this.l += j;
                return;
            } catch (IOException e) {
                throw c(e);
            }
        }
        throw new ProtocolException("expected " + j2 + " bytes but received " + (this.l + j));
    }

    @Override // defpackage.zh3, java.io.Flushable
    public final void flush() throws IOException {
        try {
            h();
        } catch (IOException e) {
            throw c(e);
        }
    }

    public final void h() {
        this.c.flush();
    }

    public final String toString() {
        return c51.class.getSimpleName() + '(' + this.c + ')';
    }
}

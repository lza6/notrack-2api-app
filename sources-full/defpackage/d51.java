package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class d51 extends tc1 {
    public final long d;
    public long h;
    public boolean l;
    public boolean m;
    public boolean n;
    public final /* synthetic */ sd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d51(sd sdVar, wl3 wl3Var, long j) {
        super(wl3Var);
        wl3Var.getClass();
        this.o = sdVar;
        this.d = j;
        this.l = true;
        if (j == 0) {
            a(null);
        }
    }

    public final IOException a(IOException iOException) {
        if (this.m) {
            return iOException;
        }
        this.m = true;
        if (iOException == null && this.l) {
            this.l = false;
        }
        return this.o.a(true, false, iOException);
    }

    @Override // defpackage.tc1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.n) {
            return;
        }
        this.n = true;
        try {
            super.close();
            a(null);
        } catch (IOException e) {
            throw a(e);
        }
    }

    @Override // defpackage.tc1, defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        dyVar.getClass();
        if (this.n) {
            u41.r("closed");
            return 0L;
        }
        try {
            long jY = this.c.y(dyVar, j);
            if (this.l) {
                this.l = false;
            }
            if (jY == -1) {
                a(null);
                return -1L;
            }
            long j2 = this.h + jY;
            long j3 = this.d;
            if (j3 == -1 || j2 <= j3) {
                this.h = j2;
                if (j2 == j3) {
                    a(null);
                }
                return jY;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            throw a(e);
        }
    }
}

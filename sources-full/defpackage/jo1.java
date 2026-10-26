package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class jo1 implements wl3 {
    public final u23 c;
    public final Inflater d;
    public int h;
    public boolean l;

    public jo1(u23 u23Var, Inflater inflater) {
        this.c = u23Var;
        this.d = inflater;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.c.c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.l) {
            return;
        }
        this.d.end();
        this.l = true;
        this.c.close();
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        long j2;
        dyVar.getClass();
        while (j >= 0) {
            if (this.l) {
                u41.r("closed");
                return 0L;
            }
            u23 u23Var = this.c;
            Inflater inflater = this.d;
            if (j == 0) {
                j2 = 0;
            } else {
                try {
                    uc3 uc3VarR = dyVar.R(1);
                    int iMin = (int) Math.min(j, 8192 - uc3VarR.c);
                    if (inflater.needsInput() && !u23Var.r()) {
                        uc3 uc3Var = u23Var.d.c;
                        uc3Var.getClass();
                        int i = uc3Var.c;
                        int i2 = uc3Var.b;
                        int i3 = i - i2;
                        this.h = i3;
                        inflater.setInput(uc3Var.a, i2, i3);
                    }
                    int iInflate = inflater.inflate(uc3VarR.a, uc3VarR.c, iMin);
                    int i4 = this.h;
                    if (i4 != 0) {
                        int remaining = i4 - inflater.getRemaining();
                        this.h -= remaining;
                        u23Var.skip(remaining);
                    }
                    if (iInflate > 0) {
                        uc3VarR.c += iInflate;
                        j2 = iInflate;
                        dyVar.d += j2;
                    } else {
                        if (uc3VarR.b == uc3VarR.c) {
                            dyVar.c = uc3VarR.a();
                            xc3.a(uc3VarR);
                        }
                        j2 = 0;
                    }
                } catch (DataFormatException e) {
                    throw new IOException(e);
                }
            }
            if (j2 > 0) {
                return j2;
            }
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
            if (u23Var.r()) {
                throw new EOFException("source exhausted prematurely");
            }
        }
        u41.h(ud2.o("byteCount < 0: ", j));
        return 0L;
    }
}

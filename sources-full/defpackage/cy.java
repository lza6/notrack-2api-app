package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.UByte;

/* JADX INFO: loaded from: classes.dex */
public final class cy extends InputStream {
    public final /* synthetic */ int c;
    public final /* synthetic */ ny d;

    public /* synthetic */ cy(ny nyVar, int i) {
        this.c = i;
        this.d = nyVar;
    }

    private final void a() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        int i = this.c;
        ny nyVar = this.d;
        switch (i) {
            case 0:
                return (int) Math.min(((dy) nyVar).d, 2147483647L);
            default:
                u23 u23Var = (u23) nyVar;
                if (!u23Var.h) {
                    return (int) Math.min(u23Var.d.d, 2147483647L);
                }
                m51.l("closed");
                return 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.c) {
            case 0:
                break;
            default:
                ((u23) this.d).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.c;
        ny nyVar = this.d;
        switch (i) {
            case 0:
                dy dyVar = (dy) nyVar;
                if (dyVar.d > 0) {
                    return dyVar.readByte() & UByte.MAX_VALUE;
                }
                return -1;
            default:
                u23 u23Var = (u23) nyVar;
                dy dyVar2 = u23Var.d;
                if (u23Var.h) {
                    m51.l("closed");
                    return 0;
                }
                if (dyVar2.d == 0 && u23Var.c.y(dyVar2, 8192L) == -1) {
                    return -1;
                }
                return dyVar2.readByte() & UByte.MAX_VALUE;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        ny nyVar = this.d;
        bArr.getClass();
        switch (i3) {
            case 0:
                return ((dy) nyVar).read(bArr, i, i2);
            default:
                u23 u23Var = (u23) nyVar;
                dy dyVar = u23Var.d;
                if (u23Var.h) {
                    m51.l("closed");
                    return 0;
                }
                vl0.w(bArr.length, i, i2);
                if (dyVar.d == 0 && u23Var.c.y(dyVar, 8192L) == -1) {
                    return -1;
                }
                return dyVar.read(bArr, i, i2);
        }
    }

    public final String toString() {
        int i = this.c;
        ny nyVar = this.d;
        switch (i) {
            case 0:
                return ((dy) nyVar) + ".inputStream()";
            default:
                return ((u23) nyVar) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(OutputStream outputStream) throws IOException {
        switch (this.c) {
            case 1:
                outputStream.getClass();
                u23 u23Var = (u23) this.d;
                dy dyVar = u23Var.d;
                if (u23Var.h) {
                    m51.l("closed");
                    return 0L;
                }
                long j = 0;
                while (true) {
                    if (dyVar.d == 0 && u23Var.c.y(dyVar, 8192L) == -1) {
                        return j;
                    }
                    long j2 = dyVar.d;
                    j += j2;
                    vl0.w(j2, 0L, j2);
                    uc3 uc3Var = dyVar.c;
                    while (j2 > 0) {
                        uc3Var.getClass();
                        int iMin = (int) Math.min(j2, uc3Var.c - uc3Var.b);
                        outputStream.write(uc3Var.a, uc3Var.b, iMin);
                        int i = uc3Var.b + iMin;
                        uc3Var.b = i;
                        long j3 = iMin;
                        dyVar.d -= j3;
                        j2 -= j3;
                        if (i == uc3Var.c) {
                            uc3 uc3VarA = uc3Var.a();
                            dyVar.c = uc3VarA;
                            xc3.a(uc3Var);
                            uc3Var = uc3VarA;
                        }
                    }
                }
                break;
            default:
                return super.transferTo(outputStream);
        }
    }
}

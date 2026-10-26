package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.IntCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements Closeable {
    public static final Logger n = Logger.getLogger(zj1.class.getName());
    public final my c;
    public final dy d;
    public int h;
    public boolean l;
    public final fj1 m;

    public qk1(t23 t23Var) {
        t23Var.getClass();
        this.c = t23Var;
        dy dyVar = new dy();
        this.d = dyVar;
        this.h = 16384;
        this.m = new fj1(dyVar);
    }

    public final synchronized void A(int i, int i2) {
        try {
            if (i2 == 0) {
                throw null;
            }
            if (this.l) {
                throw new IOException("closed");
            }
            if (fq2.z(i2) == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            h(i, 4, 3, 0);
            this.c.writeInt(fq2.z(i2));
            this.c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void K(long j, int i) {
        if (this.l) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        h(i, 4, 8, 0);
        this.c.writeInt((int) j);
        this.c.flush();
    }

    public final synchronized void a(mg3 mg3Var) {
        try {
            mg3Var.getClass();
            if (this.l) {
                throw new IOException("closed");
            }
            int i = this.h;
            int i2 = mg3Var.a;
            if ((i2 & 32) != 0) {
                i = mg3Var.b[5];
            }
            this.h = i;
            if (((i2 & 2) != 0 ? mg3Var.b[1] : -1) != -1) {
                fj1 fj1Var = this.m;
                int i3 = (i2 & 2) != 0 ? mg3Var.b[1] : -1;
                fj1Var.getClass();
                int iMin = Math.min(i3, 16384);
                int i4 = fj1Var.d;
                if (i4 != iMin) {
                    if (iMin < i4) {
                        fj1Var.b = Math.min(fj1Var.b, iMin);
                    }
                    fj1Var.c = true;
                    fj1Var.d = iMin;
                    int i5 = fj1Var.h;
                    if (iMin < i5) {
                        if (iMin == 0) {
                            rh1[] rh1VarArr = fj1Var.e;
                            vl.p0(0, rh1VarArr.length, null, rh1VarArr);
                            fj1Var.f = fj1Var.e.length - 1;
                            fj1Var.g = 0;
                            fj1Var.h = 0;
                        } else {
                            fj1Var.a(i5 - iMin);
                        }
                    }
                }
            }
            h(0, 0, 4, 1);
            this.c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(boolean z, int i, dy dyVar, int i2) {
        if (this.l) {
            throw new IOException("closed");
        }
        h(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            my myVar = this.c;
            dyVar.getClass();
            myVar.d(dyVar, i2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.l = true;
        this.c.close();
    }

    public final synchronized void flush() {
        if (this.l) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    public final void h(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = n;
        if (logger.isLoggable(level)) {
            logger.fine(zj1.a(false, i, i2, i3, i4));
        }
        if (i2 > this.h) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.h + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            u41.h(ud2.m(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = ka4.a;
        my myVar = this.c;
        myVar.getClass();
        myVar.writeByte((i2 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        myVar.writeByte((i2 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        myVar.writeByte(i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        myVar.writeByte(i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        myVar.writeByte(i4 & KotlinVersion.MAX_COMPONENT_VALUE);
        myVar.writeInt(i & IntCompanionObject.MAX_VALUE);
    }

    public final synchronized void l(byte[] bArr, int i, int i2) {
        try {
            if (i2 == 0) {
                throw null;
            }
            if (this.l) {
                throw new IOException("closed");
            }
            if (fq2.z(i2) == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            h(0, bArr.length + 8, 7, 0);
            this.c.writeInt(i);
            this.c.writeInt(fq2.z(i2));
            if (bArr.length != 0) {
                this.c.write(bArr);
            }
            this.c.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void p(boolean z, int i, ArrayList arrayList) {
        if (this.l) {
            throw new IOException("closed");
        }
        this.m.d(arrayList);
        long j = this.d.d;
        long jMin = Math.min(this.h, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        h(i, (int) jMin, 1, i2);
        this.c.d(this.d, jMin);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.h, j2);
                j2 -= jMin2;
                h(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.c.d(this.d, jMin2);
            }
        }
    }

    public final synchronized void x(int i, int i2, boolean z) {
        if (this.l) {
            throw new IOException("closed");
        }
        h(0, 8, 6, z ? 1 : 0);
        this.c.writeInt(i);
        this.c.writeInt(i2);
        this.c.flush();
    }
}

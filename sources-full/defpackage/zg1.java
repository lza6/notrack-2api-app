package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.UShort;
import kotlin.jvm.internal.LongCompanionObject;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class zg1 implements wl3 {
    public byte c;
    public final u23 d;
    public final Inflater h;
    public final jo1 l;
    public final CRC32 m;

    public zg1(wl3 wl3Var) {
        wl3Var.getClass();
        u23 u23Var = new u23(wl3Var);
        this.d = u23Var;
        Inflater inflater = new Inflater(true);
        this.h = inflater;
        this.l = new jo1(u23Var, inflater);
        this.m = new CRC32();
    }

    public static void a(int i, int i2, String str) throws IOException {
        if (i2 == i) {
            return;
        }
        throw new IOException(str + ": actual 0x" + mo3.H0(8, vl0.f0(i2)) + " != expected 0x" + mo3.H0(8, vl0.f0(i)));
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.d.c.b();
    }

    public final void c(dy dyVar, long j, long j2) {
        uc3 uc3Var = dyVar.c;
        uc3Var.getClass();
        while (true) {
            int i = uc3Var.c;
            int i2 = uc3Var.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            uc3Var = uc3Var.f;
            uc3Var.getClass();
        }
        while (j2 > 0) {
            int i3 = (int) (((long) uc3Var.b) + j);
            int iMin = (int) Math.min(uc3Var.c - i3, j2);
            this.m.update(uc3Var.a, i3, iMin);
            j2 -= (long) iMin;
            uc3Var = uc3Var.f;
            uc3Var.getClass();
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.l.close();
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) throws IOException {
        zg1 zg1Var = this;
        dyVar.getClass();
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return 0L;
        }
        if (j == 0) {
            return 0L;
        }
        byte b = zg1Var.c;
        CRC32 crc32 = zg1Var.m;
        u23 u23Var = zg1Var.d;
        if (b == 0) {
            u23Var.F(10L);
            dy dyVar2 = u23Var.d;
            byte bL = dyVar2.l(3L);
            boolean z = ((bL >> 1) & 1) == 1;
            if (z) {
                zg1Var.c(dyVar2, 0L, 10L);
            }
            a(8075, u23Var.readShort(), "ID1ID2");
            u23Var.skip(8L);
            if (((bL >> 2) & 1) == 1) {
                u23Var.F(2L);
                if (z) {
                    c(dyVar2, 0L, 2L);
                }
                long jL = dyVar2.L() & UShort.MAX_VALUE;
                u23Var.F(jL);
                if (z) {
                    c(dyVar2, 0L, jL);
                }
                u23Var.skip(jL);
            }
            if (((bL >> 3) & 1) == 1) {
                long jA = u23Var.a((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z) {
                    c(dyVar2, 0L, jA + 1);
                }
                u23Var.skip(jA + 1);
            }
            if (((bL >> 4) & 1) == 1) {
                long jA2 = u23Var.a((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    zg1Var = this;
                    zg1Var.c(dyVar2, 0L, jA2 + 1);
                } else {
                    zg1Var = this;
                }
                u23Var.skip(jA2 + 1);
            } else {
                zg1Var = this;
            }
            if (z) {
                a(u23Var.l(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            zg1Var.c = (byte) 1;
        }
        if (zg1Var.c == 1) {
            long j2 = dyVar.d;
            long jY = zg1Var.l.y(dyVar, j);
            if (jY != -1) {
                zg1Var.c(dyVar, j2, jY);
                return jY;
            }
            zg1Var.c = (byte) 2;
        }
        if (zg1Var.c == 2) {
            a(u23Var.c(), (int) crc32.getValue(), "CRC");
            a(u23Var.c(), (int) zg1Var.h.getBytesWritten(), "ISIZE");
            zg1Var.c = (byte) 3;
            if (!u23Var.r()) {
                m51.l("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }
}

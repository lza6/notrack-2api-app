package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.Typography;
import okio.c;

/* JADX INFO: loaded from: classes.dex */
public final class u23 implements ny {
    public final wl3 c;
    public final dy d;
    public boolean h;

    public u23(wl3 wl3Var) {
        wl3Var.getClass();
        this.c = wl3Var;
        this.d = new dy();
    }

    @Override // defpackage.ny
    public final long B(my myVar) {
        dy dyVar;
        long j = 0;
        while (true) {
            wl3 wl3Var = this.c;
            dyVar = this.d;
            if (wl3Var.y(dyVar, 8192L) == -1) {
                break;
            }
            long jC = dyVar.c();
            if (jC > 0) {
                j += jC;
                myVar.d(dyVar, jC);
            }
        }
        long j2 = dyVar.d;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        myVar.d(dyVar, j2);
        return j3;
    }

    @Override // defpackage.ny
    public final void F(long j) throws EOFException {
        if (!j(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.ny
    public final boolean G(long j, lz lzVar) {
        long jA;
        boolean z;
        boolean z2;
        long j2;
        lzVar.getClass();
        int iC = lzVar.c();
        if (this.h) {
            u41.r("closed");
            return false;
        }
        if (iC < 0 || j < 0 || iC > lzVar.c()) {
            return false;
        }
        if (iC == 0) {
            return true;
        }
        long j3 = 1;
        long j4 = j + 1;
        long j5 = iC;
        vl0.w(lzVar.c(), 0L, j5);
        if (this.h) {
            u41.r("closed");
            return false;
        }
        long jMax = j;
        loop0: while (true) {
            dy dyVar = this.d;
            jA = b.a(dyVar, lzVar, jMax, j4, iC);
            if (jA == -1) {
                long j6 = dyVar.d;
                z = false;
                z2 = true;
                long j7 = (j6 - j5) + j3;
                if (j7 < j4) {
                    if (j6 < j4) {
                        j2 = j4;
                    } else {
                        int iMax = (int) Math.max(j3, (j6 - j4) + j3);
                        int iMin = ((int) Math.min(j5, (dyVar.d - jMax) + j3)) - 1;
                        if (iMax <= iMin) {
                            while (true) {
                                j2 = j4;
                                if (!dyVar.A(dyVar.d - ((long) iMin), lzVar, iMin)) {
                                    if (iMin != iMax) {
                                        iMin--;
                                        j4 = j2;
                                    }
                                }
                            }
                        }
                    }
                    if (this.c.y(dyVar, 8192L) != -1) {
                        jMax = Math.max(jMax, j7);
                        j4 = j2;
                        j3 = 1;
                    }
                }
                jA = -1;
                break loop0;
            }
            z = false;
            z2 = true;
            break;
        }
        return jA != -1 ? z2 : z;
    }

    @Override // defpackage.ny
    public final long M() throws EOFException {
        dy dyVar;
        F(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            boolean zJ = j(i2);
            dyVar = this.d;
            if (!zJ) {
                break;
            }
            byte bL = dyVar.l(i);
            if ((bL < 48 || bL > 57) && ((bL < 97 || bL > 102) && (bL < 65 || bL > 70))) {
                if (i != 0) {
                    break;
                }
                yo4.m(16);
                String string = Integer.toString(bL, 16);
                string.getClass();
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i2;
        }
        return dyVar.M();
    }

    @Override // defpackage.ny
    public final String N(Charset charset) {
        wl3 wl3Var = this.c;
        dy dyVar = this.d;
        dyVar.U(wl3Var);
        return dyVar.O(dyVar.d, charset);
    }

    @Override // defpackage.ny
    public final InputStream P() {
        return new cy(this, 1);
    }

    public final long a(byte b, long j, long j2) {
        if (this.h) {
            u41.r("closed");
            return 0L;
        }
        if (0 > j2) {
            u41.h(ud2.o("fromIndex=0 toIndex=", j2));
            return 0L;
        }
        long jMax = 0;
        while (jMax < j2) {
            dy dyVar = this.d;
            byte b2 = b;
            long j3 = j2;
            long jP = dyVar.p(b2, jMax, j3);
            if (jP != -1) {
                return jP;
            }
            long j4 = dyVar.d;
            if (j4 >= j3 || this.c.y(dyVar, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, j4);
            b = b2;
            j2 = j3;
        }
        return -1L;
    }

    @Override // defpackage.wl3
    public final c b() {
        return this.c.b();
    }

    public final int c() throws EOFException {
        F(4L);
        int i = this.d.readInt();
        return ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.close();
        this.d.a();
    }

    @Override // defpackage.ny
    public final lz g(long j) throws EOFException {
        F(j);
        return this.d.g(j);
    }

    public final long h() throws EOFException {
        char c;
        char c2;
        long j;
        F(8L);
        dy dyVar = this.d;
        if (dyVar.d < 8) {
            throw new EOFException();
        }
        uc3 uc3Var = dyVar.c;
        uc3Var.getClass();
        int i = uc3Var.b;
        int i2 = uc3Var.c;
        if (i2 - i < 8) {
            j = ((((long) dyVar.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) dyVar.readInt()));
            c = 24;
            c2 = '(';
        } else {
            byte[] bArr = uc3Var.a;
            c = 24;
            c2 = '(';
            int i3 = i + 7;
            long j2 = ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
            int i4 = i + 8;
            long j3 = j2 | (((long) bArr[i3]) & 255);
            dyVar.d -= 8;
            if (i4 == i2) {
                dyVar.c = uc3Var.a();
                xc3.a(uc3Var);
            } else {
                uc3Var.b = i4;
            }
            j = j3;
        }
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> c2) | ((280375465082880L & j) >>> c) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << c) | ((65280 & j) << c2);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.h;
    }

    @Override // defpackage.ny
    public final boolean j(long j) {
        dy dyVar;
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return false;
        }
        if (this.h) {
            u41.r("closed");
            return false;
        }
        do {
            dyVar = this.d;
            if (dyVar.d >= j) {
                return true;
            }
        } while (this.c.y(dyVar, 8192L) != -1);
        return false;
    }

    public final short l() throws EOFException {
        F(2L);
        return this.d.L();
    }

    @Override // defpackage.ny
    public final String n() {
        return z(LongCompanionObject.MAX_VALUE);
    }

    @Override // defpackage.ny
    public final byte[] o() {
        wl3 wl3Var = this.c;
        dy dyVar = this.d;
        dyVar.U(wl3Var);
        return dyVar.K(dyVar.d);
    }

    public final String p(long j) throws EOFException {
        F(j);
        return this.d.O(j, q30.a);
    }

    @Override // defpackage.ny
    public final u23 peek() {
        return new u23(new nu2(this));
    }

    @Override // defpackage.ny
    public final dy q() {
        return this.d;
    }

    @Override // defpackage.ny
    public final boolean r() {
        if (this.h) {
            u41.r("closed");
            return false;
        }
        dy dyVar = this.d;
        return dyVar.r() && this.c.y(dyVar, 8192L) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        dy dyVar = this.d;
        if (dyVar.d == 0 && this.c.y(dyVar, 8192L) == -1) {
            return -1;
        }
        return dyVar.read(byteBuffer);
    }

    @Override // defpackage.ny
    public final byte readByte() throws EOFException {
        F(1L);
        return this.d.readByte();
    }

    @Override // defpackage.ny
    public final int readInt() throws EOFException {
        F(4L);
        return this.d.readInt();
    }

    @Override // defpackage.ny
    public final short readShort() throws EOFException {
        F(2L);
        return this.d.readShort();
    }

    @Override // defpackage.ny
    public final void skip(long j) throws EOFException {
        if (this.h) {
            u41.r("closed");
            return;
        }
        while (j > 0) {
            dy dyVar = this.d;
            if (dyVar.d == 0 && this.c.y(dyVar, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, dyVar.d);
            dyVar.skip(jMin);
            j -= jMin;
        }
    }

    @Override // defpackage.ny
    public final int t(iq2 iq2Var) throws EOFException {
        dy dyVar;
        iq2Var.getClass();
        if (this.h) {
            u41.r("closed");
            return 0;
        }
        do {
            dyVar = this.d;
            int iD = b.d(dyVar, iq2Var, true);
            if (iD != -2) {
                if (iD == -1) {
                    break;
                }
                dyVar.skip(iq2Var.c[iD].c());
                return iD;
            }
        } while (this.c.y(dyVar, 8192L) != -1);
        return -1;
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    @Override // defpackage.ny
    public final String v() {
        long jA = a((byte) 10, 0L, LongCompanionObject.MAX_VALUE);
        dy dyVar = this.d;
        if (jA != -1) {
            return b.c(dyVar, jA);
        }
        long j = dyVar.d;
        if (j != 0) {
            return p(j);
        }
        return null;
    }

    @Override // defpackage.wl3
    public final long y(dy dyVar, long j) {
        dyVar.getClass();
        if (j < 0) {
            u41.h(ud2.o("byteCount < 0: ", j));
            return 0L;
        }
        if (this.h) {
            u41.r("closed");
            return 0L;
        }
        dy dyVar2 = this.d;
        if (dyVar2.d == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.c.y(dyVar2, 8192L) == -1) {
                return -1L;
            }
        }
        return dyVar2.y(dyVar, Math.min(j, dyVar2.d));
    }

    @Override // defpackage.ny
    public final String z(long j) throws EOFException {
        if (j < 0) {
            u41.h(ud2.o("limit < 0: ", j));
            return null;
        }
        long j2 = j == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jA = a((byte) 10, 0L, j2);
        dy dyVar = this.d;
        if (jA != -1) {
            return b.c(dyVar, jA);
        }
        if (j2 < LongCompanionObject.MAX_VALUE && j(j2) && dyVar.l(j2 - 1) == 13 && j(j2 + 1) && dyVar.l(j2) == 10) {
            return b.c(dyVar, j2);
        }
        dy dyVar2 = new dy();
        dyVar.h(dyVar2, 0L, Math.min(32L, dyVar.d));
        throw new EOFException("\\n not found: limit=" + Math.min(dyVar.d, j) + " content=" + dyVar2.g(dyVar2.d).d() + Typography.ellipsis);
    }
}

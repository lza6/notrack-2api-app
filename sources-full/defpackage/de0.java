package defpackage;

import java.util.logging.Logger;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class de0 {
    public static final Logger e = Logger.getLogger(de0.class.getName());
    public static final boolean f = o94.e;
    public jb a;
    public final byte[] b;
    public final int c;
    public int d;

    public de0(int i, byte[] bArr) {
        if (((bArr.length - i) | i) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
        }
        this.b = bArr;
        this.d = 0;
        this.c = i;
    }

    public static int a(int i, mz mzVar) {
        return b(mzVar) + h(i);
    }

    public static int b(mz mzVar) {
        int size = mzVar.size();
        return i(size) + size;
    }

    public static int c(int i) {
        return h(i) + 4;
    }

    public static int d(int i) {
        return h(i) + 8;
    }

    public static int e(int i, g0 g0Var, za3 za3Var) {
        return g0Var.b(za3Var) + (h(i) * 2);
    }

    public static int f(int i) {
        if (i >= 0) {
            return i(i);
        }
        return 10;
    }

    public static int g(String str) {
        int length;
        try {
            length = ha4.b(str);
        } catch (ga4 unused) {
            length = str.getBytes(zq1.a).length;
        }
        return i(length) + length;
    }

    public static int h(int i) {
        return i(i << 3);
    }

    public static int i(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public final void k(byte b) throws ee0 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            this.d = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e2) {
            throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void l(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.b, this.d, i2);
            this.d += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), Integer.valueOf(i2)), e2);
        }
    }

    public final void m(int i, int i2) throws ee0 {
        r(i, 5);
        n(i2);
    }

    public final void n(int i) throws ee0 {
        try {
            byte[] bArr = this.b;
            int i2 = this.d;
            int i3 = i2 + 1;
            this.d = i3;
            bArr[i2] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i2 + 2;
            this.d = i4;
            bArr[i3] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i2 + 3;
            this.d = i5;
            bArr[i4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.d = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e2) {
            throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void o(long j, int i) throws ee0 {
        r(i, 1);
        p(j);
    }

    public final void p(long j) throws ee0 {
        try {
            byte[] bArr = this.b;
            int i = this.d;
            int i2 = i + 1;
            this.d = i2;
            bArr[i] = (byte) (((int) j) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i3 = i + 2;
            this.d = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i4 = i + 3;
            this.d = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i5 = i + 4;
            this.d = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i6 = i + 5;
            this.d = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i7 = i + 6;
            this.d = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            int i8 = i + 7;
            this.d = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.d = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        } catch (IndexOutOfBoundsException e2) {
            throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void q(int i) throws ee0 {
        if (i >= 0) {
            s(i);
        } else {
            u(i);
        }
    }

    public final void r(int i, int i2) {
        s((i << 3) | i2);
    }

    public final void s(int i) {
        while (true) {
            int i2 = i & (-128);
            int i3 = this.d;
            byte[] bArr = this.b;
            if (i2 == 0) {
                this.d = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            } else {
                try {
                    this.d = i3 + 1;
                    bArr[i3] = (byte) ((i & 127) | Uuid.SIZE_BITS);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
                }
            }
            throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.c), 1), e2);
        }
    }

    public final void t(long j, int i) throws ee0 {
        r(i, 0);
        u(j);
    }

    public final void u(long j) throws ee0 {
        boolean z = f;
        int i = this.c;
        byte[] bArr = this.b;
        if (!z || i - this.d < 10) {
            while (true) {
                long j2 = j & (-128);
                int i2 = this.d;
                if (j2 == 0) {
                    this.d = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                } else {
                    try {
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((((int) j) & 127) | Uuid.SIZE_BITS);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
                    }
                }
                throw new ee0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(i), 1), e2);
            }
        }
        while (true) {
            long j3 = j & (-128);
            int i3 = this.d;
            if (j3 == 0) {
                this.d = i3 + 1;
                o94.k(bArr, i3, (byte) j);
                return;
            } else {
                this.d = i3 + 1;
                o94.k(bArr, i3, (byte) ((((int) j) & 127) | Uuid.SIZE_BITS));
                j >>>= 7;
            }
        }
    }
}

package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class be0 {
    public int c;
    public Object d;

    public be0(int i) {
        this.c = i;
    }

    public static int d(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long e(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zd0 i(byte[] bArr, int i, int i2, boolean z) {
        zd0 zd0Var = new zd0(bArr, i, i2, z);
        try {
            zd0Var.q(i2);
            return zd0Var;
        } catch (sr1 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract String E();

    public abstract String F();

    public abstract int G();

    public abstract int H();

    public abstract long I();

    public ByteBuffer a(int i, byte[] bArr) {
        int[] iArrC = c(r20.c(bArr), i);
        int[] iArr = (int[]) iArrC.clone();
        r20.b(iArr);
        for (int i2 = 0; i2 < iArrC.length; i2++) {
            iArrC[i2] = iArrC[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public abstract void b(int i);

    public abstract int[] c(int[] iArr, int i);

    public abstract int g();

    public abstract boolean h();

    public abstract int j();

    public void k(ig4 ig4Var) {
    }

    public void l() {
    }

    public abstract wg4 m(wg4 wg4Var);

    public abstract mi4 n(mi4 mi4Var);

    public abstract void o(int i);

    public void p(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != j()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + j());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferA = a(this.c + i3, bArr);
            if (i3 == i) {
                xp1.L(byteBuffer, byteBuffer2, byteBufferA, iRemaining % 64);
            } else {
                xp1.L(byteBuffer, byteBuffer2, byteBufferA, 64);
            }
        }
    }

    public abstract int q(int i);

    public abstract boolean r();

    public abstract kz s();

    public abstract double t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract float x();

    public abstract int y();

    public abstract long z();
}

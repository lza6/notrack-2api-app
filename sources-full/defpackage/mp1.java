package defpackage;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mp1 extends be0 {
    public final /* synthetic */ int h;

    public mp1(byte[] bArr, int i, int i2) throws InvalidKeyException {
        this.h = i2;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.d = r20.c(bArr);
        this.c = i;
    }

    @Override // defpackage.be0
    public final int[] c(int[] iArr, int i) {
        switch (this.h) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.d;
                int[] iArr4 = r20.a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = (int[]) this.d;
                int[] iArr7 = new int[16];
                int[] iArr8 = r20.a;
                System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
                System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
                iArr7[12] = iArr[0];
                iArr7[13] = iArr[1];
                iArr7[14] = iArr[2];
                iArr7[15] = iArr[3];
                r20.b(iArr7);
                iArr7[4] = iArr7[12];
                iArr7[5] = iArr7[13];
                iArr7[6] = iArr7[14];
                iArr7[7] = iArr7[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
                System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override // defpackage.be0
    public final int j() {
        switch (this.h) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}

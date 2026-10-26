package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class u6 implements hv0 {
    public static final List c = Arrays.asList(64);
    public static final byte[] d = new byte[16];
    public static final byte[] e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final iy2 a;
    public final byte[] b;

    public u6(byte[] bArr) throws GeneralSecurityException {
        if (!ud2.a(1)) {
            m51.v("Can not use AES-SIV in FIPS-mode.");
            throw null;
        }
        if (!c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(fq2.q(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.a = new iy2(bArrCopyOfRange);
    }

    @Override // defpackage.hv0
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            m51.v("plaintext too long");
            return null;
        }
        Cipher cipher = (Cipher) r31.b.a.a("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        return xp1.h(bArrC, cipher.doFinal(bArr));
    }

    @Override // defpackage.hv0
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            m51.v("Ciphertext too short.");
            return null;
        }
        Cipher cipher = (Cipher) r31.b.a.a("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & ByteCompanionObject.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & ByteCompanionObject.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrN;
        int length = bArr.length;
        iy2 iy2Var = this.a;
        if (length == 0) {
            return iy2Var.a(16, e);
        }
        byte[] bArrA = iy2Var.a(16, d);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrA = xp1.N(gb2.w(bArrA), iy2Var.a(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrA.length) {
                u41.k("xorEnd requires a.length >= b.length");
                return null;
            }
            int length2 = bArr3.length - bArrA.length;
            bArrN = Arrays.copyOf(bArr3, bArr3.length);
            for (int i2 = 0; i2 < bArrA.length; i2++) {
                int i3 = length2 + i2;
                bArrN[i3] = (byte) (bArrN[i3] ^ bArrA[i2]);
            }
        } else {
            if (bArr3.length >= 16) {
                u41.k("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = ByteCompanionObject.MIN_VALUE;
            bArrN = xp1.N(bArrCopyOf, gb2.w(bArrA));
        }
        return iy2Var.a(16, bArrN);
    }
}

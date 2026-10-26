package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class m6 implements p4 {
    public static final m5 b = new m5(3);
    public final SecretKeySpec a;

    public m6(byte[] bArr) {
        ya4.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(int i, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(Uuid.SIZE_BITS, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if ("The Android Project".equals(System.getProperty("java.vendor"))) {
                return new IvParameterSpec(bArr, 0, i);
            }
            m51.v("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            return null;
        }
    }

    @Override // defpackage.p4
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            m51.v("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrA = k23.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecC = c(bArrA.length, bArrA);
        m5 m5Var = b;
        ((Cipher) m5Var.get()).init(1, this.a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) m5Var.get()).updateAAD(bArr2);
        }
        int iDoFinal = ((Cipher) m5Var.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(ud2.q("encryption failed; GCM tag must be 16 bytes, but got only ", " bytes", iDoFinal - bArr.length));
    }

    @Override // defpackage.p4
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            m51.v("ciphertext too short");
            return null;
        }
        AlgorithmParameterSpec algorithmParameterSpecC = c(12, bArr);
        m5 m5Var = b;
        ((Cipher) m5Var.get()).init(2, this.a, algorithmParameterSpecC);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) m5Var.get()).updateAAD(bArr2);
        }
        return ((Cipher) m5Var.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}

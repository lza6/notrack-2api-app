package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.uuid.Uuid;

/* JADX INFO: loaded from: classes.dex */
public final class e6 implements p4 {
    public final /* synthetic */ int a;
    public final Object b;

    public e6(int i, byte[] bArr) throws GeneralSecurityException {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new np1(0, bArr);
                return;
            case 3:
                this.b = new np1(1, bArr);
                return;
            default:
                if (ud2.b(2)) {
                    this.b = new lp1(bArr);
                    return;
                } else {
                    m51.v("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                    throw null;
                }
        }
    }

    public e6(String str, KeyStore keyStore) throws InvalidKeyException {
        this.a = 1;
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(str));
        }
    }

    @Override // defpackage.p4
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArrA = k23.a(12);
                lp1 lp1Var = (lp1) obj;
                boolean z = lp1Var.b;
                if (bArrA.length != 12) {
                    m51.v("iv is wrong size");
                    return null;
                }
                if (bArr.length > 2147483619) {
                    m51.v("plaintext too long");
                    return null;
                }
                byte[] bArr3 = new byte[z ? bArr.length + 28 : bArr.length + 16];
                if (z) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = lp1.a(bArrA);
                m5 m5Var = lp1.c;
                ((Cipher) m5Var.get()).init(1, lp1Var.a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) m5Var.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) m5Var.get()).doFinal(bArr, 0, bArr.length, bArr3, z ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(ud2.q("encryption failed; GCM tag must be 16 bytes, but got only ", " bytes", iDoFinal - bArr.length));
            case 1:
                try {
                    return d(bArr, bArr2);
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w("e6", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return d(bArr, bArr2);
                }
            case 2:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = k23.a(12);
                byteBufferAllocate.put(bArrA2);
                ((np1) obj).f(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = k23.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((np1) obj).f(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override // defpackage.p4
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                lp1 lp1Var = (lp1) obj;
                boolean z = lp1Var.b;
                if (bArrCopyOf.length != 12) {
                    m51.v("iv is wrong size");
                    return null;
                }
                if (bArr.length < (z ? 28 : 16)) {
                    m51.v("ciphertext too short");
                    return null;
                }
                if (z && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    m51.v("iv does not match prepended iv");
                    return null;
                }
                AlgorithmParameterSpec algorithmParameterSpecA = lp1.a(bArrCopyOf);
                m5 m5Var = lp1.c;
                ((Cipher) m5Var.get()).init(2, lp1Var.a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) m5Var.get()).updateAAD(bArr2);
                }
                int i2 = z ? 12 : 0;
                int length = bArr.length;
                if (z) {
                    length -= 12;
                }
                return ((Cipher) m5Var.get()).doFinal(bArr, i2, length);
            case 1:
                if (bArr.length < 28) {
                    m51.v("ciphertext too short");
                    return null;
                }
                try {
                    return c(bArr, bArr2);
                } catch (ProviderException e) {
                    e = e;
                    Log.w("e6", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    try {
                        Thread.sleep((int) (Math.random() * 100.0d));
                        break;
                    } catch (InterruptedException unused) {
                    }
                    return c(bArr, bArr2);
                } catch (AEADBadTagException e2) {
                    throw e2;
                } catch (GeneralSecurityException e3) {
                    e = e3;
                    Log.w("e6", "encountered a potentially transient KeyStore error, will wait and retry", e);
                    Thread.sleep((int) (Math.random() * 100.0d));
                    return c(bArr, bArr2);
                }
            case 2:
                if (bArr.length >= 28) {
                    return ((np1) obj).e(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                m51.v("ciphertext too short");
                return null;
            default:
                if (bArr.length >= 40) {
                    return ((np1) obj).e(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                m51.v("ciphertext too short");
                return null;
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(Uuid.SIZE_BITS, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, (SecretKey) this.b, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, bArr.length - 12);
    }

    public byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            m51.v("plaintext too long");
            return null;
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, (SecretKey) this.b);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }
}

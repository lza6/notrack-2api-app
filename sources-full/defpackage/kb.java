package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import org.scilab.forge.jlatexmath.FontInfo;

/* JADX INFO: loaded from: classes.dex */
public final class kb {
    public static final Object b = new Object();
    public KeyStore a;

    public kb() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            this.a = keyStore;
        } catch (IOException | GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    public static boolean a(String str) {
        kb kbVar = new kb();
        synchronized (b) {
            try {
                if (kbVar.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        String strB = ya4.b(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(strB, 3).setKeySize(FontInfo.NUMBER_OF_CHAR_CODES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized e6 c(String str) {
        e6 e6Var;
        e6Var = new e6(ya4.b(str), this.a);
        byte[] bArrA = k23.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(bArrA, e6Var.b(e6Var.a(bArrA, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return e6Var;
    }

    public final synchronized boolean d(String str) {
        String strB;
        strB = ya4.b(str);
        try {
        } catch (NullPointerException unused) {
            Log.w("kb", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                try {
                    Thread.sleep((int) (Math.random() * 40.0d));
                } catch (InterruptedException unused2) {
                }
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.a = keyStore;
                keyStore.load(null);
                return this.a.containsAlias(strB);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            }
        }
        return this.a.containsAlias(strB);
    }
}

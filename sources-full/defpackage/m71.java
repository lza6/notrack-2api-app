package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public abstract class m71 {
    public static void a(Object obj, Object obj2, CancellationSignal cancellationSignal, l71 l71Var) {
        ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, 0, l71Var, null);
    }

    public static FingerprintManager.CryptoObject b(Object obj) {
        return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
    }

    public static FingerprintManager c(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        return null;
    }

    public static boolean d(Object obj) {
        return ((FingerprintManager) obj).hasEnrolledFingerprints();
    }

    public static boolean e(Object obj) {
        return ((FingerprintManager) obj).isHardwareDetected();
    }

    public static ci4 f(Object obj) {
        FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new ci4(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new ci4(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new ci4(cryptoObject.getMac());
        }
        return null;
    }

    public static FingerprintManager.CryptoObject g(ci4 ci4Var) {
        if (ci4Var == null) {
            return null;
        }
        Mac mac = (Mac) ci4Var.l;
        Signature signature = (Signature) ci4Var.d;
        Cipher cipher = (Cipher) ci4Var.h;
        if (cipher != null) {
            return new FingerprintManager.CryptoObject(cipher);
        }
        if (signature != null) {
            return new FingerprintManager.CryptoObject(signature);
        }
        if (mac != null) {
            return new FingerprintManager.CryptoObject(mac);
        }
        return null;
    }
}

package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.PresentationSession;

/* JADX INFO: loaded from: classes.dex */
public abstract class wq0 {
    public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
        return new BiometricPrompt.CryptoObject(presentationSession);
    }

    public static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getPresentationSession();
    }
}

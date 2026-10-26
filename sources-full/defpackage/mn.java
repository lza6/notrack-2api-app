package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class mn {
    public static BiometricPrompt$AuthenticationCallback a(on onVar) {
        return new ln(onVar);
    }

    public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }
}

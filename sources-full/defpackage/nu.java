package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* JADX INFO: loaded from: classes.dex */
public abstract class nu {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}

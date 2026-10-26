package defpackage;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ru {
    public static int a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }
}

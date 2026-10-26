package defpackage;

import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class es2 {
    public static boolean a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    public static boolean b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}

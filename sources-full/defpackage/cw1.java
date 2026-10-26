package defpackage;

import android.app.KeyguardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class cw1 {
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}

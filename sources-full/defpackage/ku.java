package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class ku {
    public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}

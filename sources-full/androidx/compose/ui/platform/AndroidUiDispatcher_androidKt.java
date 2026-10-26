package androidx.compose.ui.platform;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiDispatcher_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}

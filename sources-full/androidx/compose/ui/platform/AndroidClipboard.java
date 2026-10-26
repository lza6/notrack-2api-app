package androidx.compose.ui.platform;

import android.content.Context;
import defpackage.so0;
import defpackage.w84;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidClipboard implements Clipboard {
    public static final int $stable = 8;
    private final AndroidClipboardManager androidClipboardManager;

    public AndroidClipboard(Context context) {
        this(new AndroidClipboardManager(context));
    }

    public AndroidClipboard(AndroidClipboardManager androidClipboardManager) {
        this.androidClipboardManager = androidClipboardManager;
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object getClipEntry(so0 so0Var) {
        return this.androidClipboardManager.getClip();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public android.content.ClipboardManager getNativeClipboard() {
        return this.androidClipboardManager.getNativeClipboard();
    }

    @Override // androidx.compose.ui.platform.Clipboard
    public Object setClipEntry(ClipEntry clipEntry, so0 so0Var) {
        this.androidClipboardManager.setClip(clipEntry);
        return w84.a;
    }
}

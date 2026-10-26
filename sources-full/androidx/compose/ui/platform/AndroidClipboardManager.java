package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.os.Build;
import app.template.extension.BuildConfig;
import defpackage.hg;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidClipboardManager implements ClipboardManager {
    public static final int $stable = 8;
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(android.content.ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AndroidClipboardManager(Context context) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        this((android.content.ClipboardManager) systemService);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public ClipEntry getClip() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip != null) {
            return new ClipEntry(primaryClip);
        }
        return null;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public android.content.ClipboardManager getNativeClipboard() {
        return this.clipboardManager;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public hg getText() {
        ClipData primaryClip = this.clipboardManager.getPrimaryClip();
        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
            return null;
        }
        ClipData.Item itemAt = primaryClip.getItemAt(0);
        return AndroidClipboardManager_androidKt.convertToAnnotatedString(itemAt != null ? itemAt.getText() : null);
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public boolean hasText() {
        ClipDescription primaryClipDescription = this.clipboardManager.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setClip(ClipEntry clipEntry) {
        if (clipEntry != null) {
            this.clipboardManager.setPrimaryClip(clipEntry.getClipData());
            return;
        }
        int i = Build.VERSION.SDK_INT;
        android.content.ClipboardManager clipboardManager = this.clipboardManager;
        if (i >= 28) {
            Api28ClipboardManagerClipClear.clearPrimaryClip(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME));
        }
    }

    @Override // androidx.compose.ui.platform.ClipboardManager
    public void setText(hg hgVar) {
        this.clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", AndroidClipboardManager_androidKt.convertToCharSequence(hgVar)));
    }
}

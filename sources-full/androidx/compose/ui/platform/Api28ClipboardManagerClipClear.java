package androidx.compose.ui.platform;

/* JADX INFO: loaded from: classes.dex */
final class Api28ClipboardManagerClipClear {
    public static final Api28ClipboardManagerClipClear INSTANCE = new Api28ClipboardManagerClipClear();

    private Api28ClipboardManagerClipClear() {
    }

    public static final void clearPrimaryClip(android.content.ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }
}

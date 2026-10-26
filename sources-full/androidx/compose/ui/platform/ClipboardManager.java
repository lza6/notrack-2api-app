package androidx.compose.ui.platform;

import defpackage.cv0;
import defpackage.hg;

/* JADX INFO: loaded from: classes.dex */
@cv0
public interface ClipboardManager {
    default ClipEntry getClip() {
        return null;
    }

    default android.content.ClipboardManager getNativeClipboard() {
        throw new UnsupportedOperationException("This platform does not offer a native Clipboard");
    }

    hg getText();

    default boolean hasText() {
        hg text = getText();
        return text != null && text.length() > 0;
    }

    default void setClip(ClipEntry clipEntry) {
    }

    void setText(hg hgVar);
}

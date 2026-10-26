package androidx.compose.ui.platform;

import defpackage.so0;

/* JADX INFO: loaded from: classes.dex */
public interface Clipboard {
    Object getClipEntry(so0 so0Var);

    android.content.ClipboardManager getNativeClipboard();

    Object setClipEntry(ClipEntry clipEntry, so0 so0Var);
}

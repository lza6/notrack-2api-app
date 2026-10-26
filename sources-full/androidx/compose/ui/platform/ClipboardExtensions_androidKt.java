package androidx.compose.ui.platform;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ClipboardExtensions_androidKt {
    public static final Uri firstUriOrNull(ClipEntry clipEntry) {
        int itemCount = clipEntry.getClipData().getItemCount();
        for (int i = 0; i < itemCount; i++) {
            Uri uri = clipEntry.getClipData().getItemAt(i).getUri();
            if (uri != null) {
                return uri;
            }
        }
        return null;
    }
}

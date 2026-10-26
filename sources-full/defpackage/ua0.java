package defpackage;

import androidx.compose.ui.platform.UriHandler;

/* JADX INFO: loaded from: classes.dex */
public final class ua0 implements UriHandler {
    public final /* synthetic */ UriHandler a;

    public ua0(UriHandler uriHandler) {
        this.a = uriHandler;
    }

    @Override // androidx.compose.ui.platform.UriHandler
    public final void openUri(String str) {
        str.getClass();
        try {
            this.a.openUri(str);
        } catch (Throwable unused) {
        }
    }
}

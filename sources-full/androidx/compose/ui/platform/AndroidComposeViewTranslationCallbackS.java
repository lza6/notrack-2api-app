package androidx.compose.ui.platform;

import android.view.View;
import defpackage.s9;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeViewTranslationCallbackS {
    public static final int $stable = 0;
    public static final AndroidComposeViewTranslationCallbackS INSTANCE = new AndroidComposeViewTranslationCallbackS();

    private AndroidComposeViewTranslationCallbackS() {
    }

    public final void clearViewTranslationCallback(View view) {
        view.clearViewTranslationCallback();
    }

    public final void setViewTranslationCallback(View view) {
        view.setViewTranslationCallback(s9.k(AndroidComposeViewTranslationCallback.INSTANCE));
    }
}

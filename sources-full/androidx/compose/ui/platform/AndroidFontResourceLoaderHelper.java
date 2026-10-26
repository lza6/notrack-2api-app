package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
final class AndroidFontResourceLoaderHelper {
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    public final Typeface create(Context context, int i) {
        return context.getResources().getFont(i);
    }
}

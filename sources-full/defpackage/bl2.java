package defpackage;

import android.text.PrecomputedText;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class bl2 {
    public static /* synthetic */ PrecomputedText.Params.Builder k(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean z(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}

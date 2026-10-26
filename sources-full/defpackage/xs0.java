package defpackage;

import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class xs0 {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    public xs0() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}

package defpackage;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class t21 extends MetricAffectingSpan {
    public final /* synthetic */ int c;

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.c) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.setFakeBoldText(true);
                break;
            case 2:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                break;
            default:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.c) {
            case 0:
                textPaint.setTextSkewX(-0.25f);
                break;
            case 1:
                textPaint.setFakeBoldText(true);
                break;
            case 2:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift -= (int) (textPaint.ascent() / 2.0f);
                break;
            default:
                textPaint.setTextSize(textPaint.getTextSize() * 0.75f);
                textPaint.baselineShift += (int) (textPaint.ascent() / 2.0f);
                break;
        }
    }
}

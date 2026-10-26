package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends MetricAffectingSpan {
    public final /* synthetic */ int c;
    public final Object d;

    public /* synthetic */ yd0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                va2 va2Var = (va2) obj;
                int i2 = va2Var.f;
                if (i2 != 0) {
                    textPaint.setColor(i2);
                }
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                int iH = va2Var.g;
                if (iH == 0) {
                    iH = y64.h(textPaint.getColor(), 25);
                }
                textPaint.bgColor = iH;
                break;
            case 1:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                int i2 = ((va2) obj).f;
                if (i2 != 0) {
                    textPaint.setColor(i2);
                }
                textPaint.setTypeface(Typeface.MONOSPACE);
                textPaint.setTextSize(textPaint.getTextSize() * 0.87f);
                break;
            case 1:
                textPaint.setFontFeatureSettings((String) obj);
                break;
            default:
                textPaint.setTypeface((Typeface) obj);
                break;
        }
    }
}

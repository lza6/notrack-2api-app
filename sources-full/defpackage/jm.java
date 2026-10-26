package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class jm extends ReplacementSpan {
    public final va2 c;
    public final em d;
    public final boolean h;

    public jm(va2 va2Var, em emVar, boolean z) {
        this.c = va2Var;
        this.d = emVar;
        this.h = z;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int iP = av1.P(canvas, charSequence);
        float textSize = paint.getTextSize();
        em emVar = this.d;
        emVar.h = iP;
        emVar.i = textSize;
        if (emVar.j) {
            emVar.b();
        }
        if (emVar.a()) {
            int i6 = i5 - emVar.getBounds().bottom;
            int iSave = canvas.save();
            try {
                canvas.translate(f, i6);
                emVar.draw(canvas);
                return;
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        float fAscent = (int) ((((i5 - i3) / 2) + i3) - (((paint.ascent() + paint.descent()) / 2.0f) + 0.5f));
        if (this.h) {
            paint.setUnderlineText(this.c.a);
            if (paint instanceof TextPaint) {
                paint.setColor(((TextPaint) paint).linkColor);
            }
        }
        canvas.drawText(charSequence, i, i2, f, fAscent, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        em emVar = this.d;
        if (!emVar.a()) {
            if (this.h) {
                paint.setUnderlineText(this.c.a);
                if (paint instanceof TextPaint) {
                    paint.setColor(((TextPaint) paint).linkColor);
                }
            }
            return (int) (paint.measureText(charSequence, i, i2) + 0.5f);
        }
        Rect bounds = emVar.getBounds();
        if (fontMetricsInt != null) {
            int i3 = -bounds.bottom;
            fontMetricsInt.ascent = i3;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i3;
            fontMetricsInt.bottom = 0;
        }
        return bounds.right;
    }
}

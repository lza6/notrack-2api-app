package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class i74 extends ReplacementSpan {
    public final h74 d;
    public TextPaint m;
    public final Paint.FontMetricsInt c = new Paint.FontMetricsInt();
    public short h = -1;
    public float l = 1.0f;

    public i74(h74 h74Var) {
        p23.n(h74Var, "rasterizer cannot be null");
        this.d = h74Var;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.m;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.m = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.h, i5, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        y11.a().getClass();
        float f2 = i4;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        h74 h74Var = this.d;
        ir3 ir3Var = h74Var.b;
        Typeface typeface = (Typeface) ir3Var.l;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) ir3Var.d, h74Var.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.c;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        h74 h74Var = this.d;
        ae2 ae2VarB = h74Var.b();
        int iA = ae2VarB.a(14);
        this.l = fAbs / (iA != 0 ? ((ByteBuffer) ae2VarB.l).getShort(iA + ae2VarB.c) : (short) 0);
        ae2 ae2VarB2 = h74Var.b();
        int iA2 = ae2VarB2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) ae2VarB2.l).getShort(iA2 + ae2VarB2.c);
        }
        ae2 ae2VarB3 = h74Var.b();
        int iA3 = ae2VarB3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) ae2VarB3.l).getShort(iA3 + ae2VarB3.c) : (short) 0) * this.l);
        this.h = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}

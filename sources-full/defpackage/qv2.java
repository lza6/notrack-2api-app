package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class qv2 extends ReplacementSpan {
    public Paint.FontMetricsInt c;
    public int d;
    public int h;
    public boolean l;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.c;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        kr1.n0("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.l) {
            qo1.b("PlaceholderSpan is not laid out yet.");
        }
        return this.h;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        this.l = true;
        paint.getTextSize();
        this.c = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            qo1.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.d = (int) Math.ceil(0.0d);
        this.h = (int) Math.ceil(0.0d);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.l) {
            qo1.b("PlaceholderSpan is not laid out yet.");
        }
        return this.d;
    }
}

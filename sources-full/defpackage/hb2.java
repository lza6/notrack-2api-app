package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import ru.noties.jlatexmath.JLatexMathDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class hb2 extends ReplacementSpan {
    public final JLatexMathDrawable c;
    public final boolean d;
    public final int h;

    public hb2(JLatexMathDrawable jLatexMathDrawable, boolean z, int i) {
        this.c = jLatexMathDrawable;
        this.d = z;
        this.h = i;
    }

    public final int a() {
        Object i63Var;
        try {
            i63Var = Integer.valueOf(this.c.icon().getIconDepth());
        } catch (Throwable th) {
            i63Var = new i63(th);
        }
        if (i63Var instanceof i63) {
            i63Var = 0;
        }
        return ((Number) i63Var).intValue();
    }

    public final float b() {
        JLatexMathDrawable jLatexMathDrawable = this.c;
        int intrinsicWidth = jLatexMathDrawable.getIntrinsicWidth();
        int i = this.h;
        if (intrinsicWidth > i) {
            return Math.max(i / jLatexMathDrawable.getIntrinsicWidth(), 0.6f);
        }
        return 1.0f;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.getClass();
        paint.getClass();
        float fB = b();
        JLatexMathDrawable jLatexMathDrawable = this.c;
        float intrinsicWidth = jLatexMathDrawable.getIntrinsicWidth() * fB;
        float intrinsicHeight = jLatexMathDrawable.getIntrinsicHeight() * fB;
        float fA = a() * fB;
        boolean z = this.d;
        int i6 = this.h;
        float fMax = z ? Math.max(0.0f, (i6 - intrinsicWidth) / 2.0f) + f : f;
        canvas.save();
        if (b() * jLatexMathDrawable.getIntrinsicWidth() > i6 + 0.5f) {
            canvas.clipRect(f, i3, i6 + f, i5);
        }
        canvas.translate(fMax, (i4 + fA) - intrinsicHeight);
        canvas.scale(fB, fB);
        jLatexMathDrawable.draw(canvas);
        canvas.restore();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        paint.getClass();
        float fB = b();
        JLatexMathDrawable jLatexMathDrawable = this.c;
        int intrinsicWidth = (int) (jLatexMathDrawable.getIntrinsicWidth() * fB);
        boolean z = this.d;
        if (fontMetricsInt != null) {
            int intrinsicHeight = (int) (jLatexMathDrawable.getIntrinsicHeight() * fB);
            int iA = (int) (a() * fB);
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int textSize = z ? (int) (paint.getTextSize() * 0.25f) : 0;
            int iMax = Math.max(fontMetricsInt2.descent, iA + textSize);
            int iMin = Math.min(fontMetricsInt2.ascent, (-(intrinsicHeight - iA)) - textSize);
            fontMetricsInt.ascent = iMin;
            fontMetricsInt.top = iMin;
            fontMetricsInt.descent = iMax;
            fontMetricsInt.bottom = iMax;
        }
        int i3 = this.h;
        return z ? Math.max(Math.min(intrinsicWidth, i3), i3) : Math.min(intrinsicWidth, i3);
    }
}

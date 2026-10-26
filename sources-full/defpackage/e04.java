package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
public final class e04 implements LeadingMarginSpan {
    public final va2 c;
    public final Rect d = hn2.a;
    public final Paint h = hn2.c;

    public e04(va2 va2Var) {
        this.c = va2Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int width;
        int i8 = ((i5 - i3) / 2) + i3;
        Paint paint2 = this.h;
        paint2.set(paint);
        va2 va2Var = this.c;
        va2Var.getClass();
        paint2.setColor(y64.h(paint2.getColor(), 25));
        paint2.setStyle(Paint.Style.FILL);
        int i9 = va2Var.k;
        if (i9 >= 0) {
            paint2.setStrokeWidth(i9);
        }
        int strokeWidth = (int) ((((int) (paint2.getStrokeWidth() + 0.5f)) / 2.0f) + 0.5f);
        if (i2 > 0) {
            width = canvas.getWidth();
        } else {
            width = i;
            i -= canvas.getWidth();
        }
        Rect rect = this.d;
        rect.set(i, i8 - strokeWidth, width, i8 + strokeWidth);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}

package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
public final class qv implements LeadingMarginSpan {
    public final va2 c;
    public final Rect d = hn2.a;
    public final Paint h = hn2.c;

    public qv(va2 va2Var) {
        this.c = va2Var;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        va2 va2Var = this.c;
        int i8 = va2Var.c;
        if (i8 == 0) {
            i8 = (int) ((va2Var.b * 0.25f) + 0.5f);
        }
        Paint paint2 = this.h;
        paint2.set(paint);
        va2Var.getClass();
        int iH = y64.h(paint2.getColor(), 25);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(iH);
        int i9 = i2 * i8;
        int i10 = i + i9;
        int i11 = i9 + i10;
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(i10, i11);
        Rect rect = this.d;
        rect.set(iMin, i3, iMax, i5);
        canvas.drawRect(rect, paint2);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.c.b;
    }
}

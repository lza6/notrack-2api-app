package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
public final class lq2 implements LeadingMarginSpan {
    public final va2 c;
    public final String d;
    public final Paint h = hn2.c;
    public int l;

    public lq2(va2 va2Var, String str) {
        this.c = va2Var;
        this.d = str;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int i8;
        if (z && av1.I(charSequence, this, i6)) {
            Paint paint2 = this.h;
            paint2.set(paint);
            va2 va2Var = this.c;
            va2Var.getClass();
            paint2.setColor(paint2.getColor());
            int i9 = va2Var.d;
            if (i9 != 0) {
                paint2.setStrokeWidth(i9);
            }
            String str = this.d;
            int iMeasureText = (int) (paint2.measureText(str) + 0.5f);
            int i10 = va2Var.b;
            if (iMeasureText > i10) {
                this.l = iMeasureText;
                i10 = iMeasureText;
            } else {
                this.l = 0;
            }
            if (i2 > 0) {
                i8 = ((i10 * i2) + i) - iMeasureText;
            } else {
                i8 = (i10 - iMeasureText) + (i2 * i10) + i;
            }
            canvas.drawText(str, i8, i4, paint2);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return Math.max(this.l, this.c.b);
    }
}

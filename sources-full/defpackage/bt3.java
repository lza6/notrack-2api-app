package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* JADX INFO: loaded from: classes.dex */
public final class bt3 implements LeadingMarginSpan {
    public static final int[] l = {R.attr.state_checked};
    public static final int[] m = new int[0];
    public final va2 c;
    public final xs3 d;
    public final boolean h;

    public bt3(va2 va2Var, xs3 xs3Var, boolean z) {
        this.c = va2Var;
        this.d = xs3Var;
        this.h = z;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        xs3 xs3Var = this.d;
        if (z && av1.I(charSequence, this, i6)) {
            float fDescent = paint.descent();
            float fAscent = paint.ascent();
            int iSave = canvas.save();
            try {
                int i8 = this.c.b;
                int i9 = (int) ((fDescent - fAscent) + 0.5f);
                int i10 = (int) ((i8 * 0.75f) + 0.5f);
                int i11 = (int) ((i9 * 0.75f) + 0.5f);
                xs3Var.setBounds(0, 0, i10, i11);
                xs3Var.setState(this.h ? l : m);
                canvas.translate(i2 > 0 ? i + ((i8 - i10) / 2) : (i - ((i8 - i10) / 2)) - i10, ((int) (i4 + fAscent + 0.5f)) + ((i9 - i11) / 2));
                xs3Var.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return this.c.b;
    }
}

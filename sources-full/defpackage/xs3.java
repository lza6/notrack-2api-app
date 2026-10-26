package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class xs3 extends Drawable {
    public final int a;
    public final int b;
    public final Paint c = new Paint(1);
    public final RectF d = new RectF();
    public final Paint e;
    public final Path f;
    public boolean g;

    static {
        new zf3(0.3888889f, 0.6944444f);
        new zf3(0.8472222f, 0.2638889f);
    }

    public xs3(int i, int i2, int i3) {
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Path();
        this.a = i;
        this.b = i2;
        paint.setColor(i3);
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint.Style style;
        int i;
        if (this.g) {
            style = Paint.Style.FILL_AND_STROKE;
            i = this.a;
        } else {
            style = Paint.Style.STROKE;
            i = this.b;
        }
        Paint paint = this.c;
        paint.setStyle(style);
        paint.setColor(i);
        Rect bounds = getBounds();
        float fWidth = bounds.width();
        RectF rectF = this.d;
        float fWidth2 = (fWidth - rectF.width()) / 2.0f;
        float fHeight = (bounds.height() - rectF.height()) / 2.0f;
        float fWidth3 = rectF.width() / 8.0f;
        int iSave = canvas.save();
        try {
            canvas.translate(fWidth2, fHeight);
            canvas.drawRoundRect(rectF, fWidth3, fWidth3, paint);
            if (this.g) {
                canvas.drawPath(this.f, this.e);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float fMin = Math.min(rect.width(), rect.height());
        float f = fMin / 8.0f;
        float f2 = fMin - f;
        this.d.set(0.0f, 0.0f, f2, f2);
        this.c.setStrokeWidth(f);
        this.e.setStrokeWidth(f);
        Path path = this.f;
        path.reset();
        path.moveTo(0.15277778f * f2, 0.45833334f * f2);
        path.lineTo(0.3888889f * f2, 0.6944444f * f2);
        path.lineTo(0.8472222f * f2, f2 * 0.2638889f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int length = iArr != null ? iArr.length : 0;
        if (length <= 0) {
            z = false;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (16842912 == iArr[i]) {
                z = true;
                break;
            }
            i++;
        }
        boolean z2 = z != this.g;
        if (z2) {
            invalidateSelf();
            this.g = z;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class kg2 extends Drawable implements Animatable {
    public boolean B;
    public final Movie c;
    public final Bitmap.Config d;
    public final ma3 h;
    public Canvas p;
    public Bitmap q;
    public float t;
    public float u;
    public boolean v;
    public long w;
    public long x;
    public Picture z;
    public final Paint l = new Paint(3);
    public final ArrayList m = new ArrayList();
    public final Rect n = new Rect();
    public final Rect o = new Rect();
    public float r = 1.0f;
    public float s = 1.0f;
    public int y = -1;
    public lv2 A = lv2.c;

    public kg2(Movie movie, Bitmap.Config config, ma3 ma3Var) {
        this.c = movie;
        this.d = config;
        this.h = ma3Var;
        if (yh4.I(config)) {
            u41.k("Bitmap config must not be hardware.");
            throw null;
        }
    }

    public final void a(Canvas canvas) {
        Paint paint = this.l;
        Canvas canvas2 = this.p;
        Bitmap bitmap = this.q;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int iSave = canvas2.save();
        try {
            float f = this.r;
            canvas2.scale(f, f);
            this.c.draw(canvas2, 0.0f, 0.0f, paint);
            Picture picture = this.z;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(iSave);
            int iSave2 = canvas.save();
            try {
                canvas.translate(this.t, this.u);
                float f2 = this.s;
                canvas.scale(f2, f2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas2.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(Rect rect) {
        Rect rect2 = this.n;
        if (kr1.n(rect2, rect)) {
            return;
        }
        rect2.set(rect);
        int iWidth = rect.width();
        int iHeight = rect.height();
        Movie movie = this.c;
        int iWidth2 = movie.width();
        int iHeight2 = movie.height();
        if (iWidth2 <= 0 || iHeight2 <= 0) {
            return;
        }
        ma3 ma3Var = this.h;
        double dG = av1.g(iWidth2, iHeight2, iWidth, iHeight, ma3Var);
        if (!this.B && dG > 1.0d) {
            dG = 1.0d;
        }
        float f = (float) dG;
        this.r = f;
        int i = (int) (iWidth2 * f);
        int i2 = (int) (f * iHeight2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, this.d);
        Bitmap bitmap = this.q;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.q = bitmapCreateBitmap;
        this.p = new Canvas(bitmapCreateBitmap);
        if (this.B) {
            this.s = 1.0f;
            this.t = 0.0f;
            this.u = 0.0f;
        } else {
            float fG = (float) av1.g(i, i2, iWidth, iHeight, ma3Var);
            this.s = fG;
            this.t = ((iWidth - (i * fG)) / 2.0f) + rect.left;
            this.u = ((iHeight - (fG * i2)) / 2.0f) + rect.top;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Movie movie = this.c;
        int iDuration = movie.duration();
        if (iDuration == 0) {
            iDuration = 0;
            z = false;
        } else {
            if (this.v) {
                this.x = SystemClock.uptimeMillis();
            }
            int i = (int) (this.x - this.w);
            int i2 = i / iDuration;
            int i3 = this.y;
            z = i3 == -1 || i2 <= i3;
            if (z) {
                iDuration = i - (i2 * iDuration);
            }
        }
        movie.setTime(iDuration);
        if (this.B) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            Rect rect = this.o;
            rect.set(0, 0, width, height);
            b(rect);
            int iSave = canvas.save();
            try {
                float f = 1.0f / this.r;
                canvas.scale(f, f);
                a(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        } else {
            b(getBounds());
            a(canvas);
        }
        if (this.v && z) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.l.getAlpha() != 255) {
            return -3;
        }
        lv2 lv2Var = this.A;
        if (lv2Var != lv2.d) {
            return (lv2Var == lv2.c && this.c.isOpaque()) ? -1 : -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.v;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            u41.h(ud2.m(i, "Invalid alpha: "));
        } else {
            this.l.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.w = SystemClock.uptimeMillis();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            je1 je1Var = ((oa4) arrayList.get(i)).a;
            if (je1Var != null) {
                je1Var.invoke();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.v) {
            this.v = false;
            ArrayList arrayList = this.m;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                je1 je1Var = ((oa4) arrayList.get(i)).b;
                if (je1Var != null) {
                    je1Var.invoke();
                }
            }
        }
    }
}

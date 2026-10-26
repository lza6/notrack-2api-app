package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class hm implements Drawable.Callback {
    public final TextView c;
    public final im d;
    public Rect h;

    public hm(TextView textView, im imVar, Rect rect) {
        this.c = textView;
        this.d = imVar;
        this.h = new Rect(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Looper looperMyLooper = Looper.myLooper();
        Looper mainLooper = Looper.getMainLooper();
        TextView textView = this.c;
        if (looperMyLooper != mainLooper) {
            textView.post(new io4(5, this, drawable, false));
            return;
        }
        Rect bounds = drawable.getBounds();
        if (this.h.equals(bounds)) {
            textView.postInvalidate();
            return;
        }
        im imVar = this.d;
        TextView textView2 = (TextView) imVar.d;
        textView2.removeCallbacks(imVar);
        textView2.post(imVar);
        this.h = new Rect(bounds);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.c.postDelayed(runnable, j - SystemClock.uptimeMillis());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.c.removeCallbacks(runnable);
    }
}

package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class dm implements Drawable.Callback {
    public final Drawable.Callback c;
    public final /* synthetic */ em d;

    public dm(em emVar, Drawable.Callback callback) {
        this.d = emVar;
        this.c = callback;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.c.invalidateDrawable(this.d);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.c.scheduleDrawable(this.d, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.c.unscheduleDrawable(this.d, runnable);
    }
}

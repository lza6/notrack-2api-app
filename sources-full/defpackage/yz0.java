package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class yz0 implements Drawable.Callback {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yz0(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    private final void a(Drawable drawable, Runnable runnable, long j) {
    }

    private final void b(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                drawable.getClass();
                zz0 zz0Var = (zz0) obj;
                ft2 ft2Var = zz0Var.o;
                ft2Var.setValue(Integer.valueOf(((Number) ft2Var.getValue()).intValue() + 1));
                Drawable drawable2 = zz0Var.n;
                ly1 ly1Var = a01.a;
                zz0Var.p.setValue(new bi3((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : vl0.g(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
            default:
                ((bs3) obj).run();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.c) {
            case 0:
                drawable.getClass();
                runnable.getClass();
                ((Handler) a01.a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.c) {
            case 0:
                drawable.getClass();
                runnable.getClass();
                ((Handler) a01.a.getValue()).removeCallbacks(runnable);
                break;
        }
    }
}

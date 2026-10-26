package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class so2 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View c;
    public ViewTreeObserver d;
    public final Runnable h;

    public so2(View view, Runnable runnable) {
        this.c = view;
        this.d = view.getViewTreeObserver();
        this.h = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view == null) {
            m51.x("view == null");
            return;
        }
        so2 so2Var = new so2(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(so2Var);
        view.addOnAttachStateChangeListener(so2Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.d.isAlive();
        View view = this.c;
        if (zIsAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.d = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.d.isAlive();
        View view2 = this.c;
        if (zIsAlive) {
            this.d.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}

package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class e20 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ dd2 d;

    public /* synthetic */ e20(dd2 dd2Var, int i) {
        this.c = i;
        this.d = dd2Var;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        dd2 dd2Var = this.d;
        switch (i) {
            case 0:
                h20 h20Var = (h20) dd2Var;
                ViewTreeObserver viewTreeObserver = h20Var.F;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        h20Var.F = view.getViewTreeObserver();
                    }
                    h20Var.F.removeGlobalOnLayoutListener(h20Var.q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                an3 an3Var = (an3) dd2Var;
                ViewTreeObserver viewTreeObserver2 = an3Var.w;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        an3Var.w = view.getViewTreeObserver();
                    }
                    an3Var.w.removeGlobalOnLayoutListener(an3Var.q);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}

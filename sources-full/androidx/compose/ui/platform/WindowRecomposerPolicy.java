package androidx.compose.ui.platform;

import android.os.Handler;
import android.view.View;
import defpackage.d43;
import defpackage.eh1;
import defpackage.fh1;
import defpackage.gb2;
import defpackage.je1;
import defpackage.pf1;
import defpackage.py;
import defpackage.u41;
import defpackage.ym3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class WindowRecomposerPolicy {
    public static final WindowRecomposerPolicy INSTANCE = new WindowRecomposerPolicy();
    private static final AtomicReference<WindowRecomposerFactory> factory = new AtomicReference<>(WindowRecomposerFactory.Companion.getLifecycleAware());
    public static final int $stable = 8;

    private WindowRecomposerPolicy() {
    }

    public final boolean compareAndSetFactory(WindowRecomposerFactory windowRecomposerFactory, WindowRecomposerFactory windowRecomposerFactory2) {
        AtomicReference<WindowRecomposerFactory> atomicReference = factory;
        while (!atomicReference.compareAndSet(windowRecomposerFactory, windowRecomposerFactory2)) {
            if (atomicReference.get() != windowRecomposerFactory) {
                return false;
            }
        }
        return true;
    }

    public final d43 createAndInstallWindowRecomposer$ui_release(View view) {
        d43 d43VarCreateRecomposer = factory.get().createRecomposer(view);
        WindowRecomposer_androidKt.setCompositionContext(view, d43VarCreateRecomposer);
        Handler handler = view.getHandler();
        int i = fh1.a;
        eh1 eh1Var = new eh1(handler, "windowRecomposer cleanup", false);
        final ym3 ym3VarF = py.F(pf1.c, eh1Var.l, null, new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(d43VarCreateRecomposer, view, null), 2);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                view2.removeOnAttachStateChangeListener(this);
                ym3VarF.c(null);
            }
        });
        return d43VarCreateRecomposer;
    }

    public final WindowRecomposerFactory getAndSetFactory(WindowRecomposerFactory windowRecomposerFactory) {
        return factory.getAndSet(windowRecomposerFactory);
    }

    public final void setFactory(WindowRecomposerFactory windowRecomposerFactory) {
        factory.set(windowRecomposerFactory);
    }

    public final <R> R withFactory(WindowRecomposerFactory windowRecomposerFactory, je1 je1Var) {
        WindowRecomposerFactory andSetFactory = getAndSetFactory(windowRecomposerFactory);
        try {
            R r = (R) je1Var.invoke();
            if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                return r;
            }
            u41.r("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state");
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (compareAndSetFactory(windowRecomposerFactory, andSetFactory)) {
                    throw th2;
                }
                gb2.l(th, new IllegalStateException("WindowRecomposerFactory was set to unexpected value; cannot safely restore old state"));
                throw th;
            }
        }
    }
}

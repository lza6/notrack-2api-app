package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mg0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long c = SystemClock.uptimeMillis() + 10000;
    public Runnable d;
    public boolean h;
    public final /* synthetic */ qg0 l;

    public mg0(qg0 qg0Var) {
        this.l = qg0Var;
    }

    public final void a(View view) {
        if (this.h) {
            return;
        }
        this.h = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        this.d = runnable;
        View decorView = this.l.getWindow().getDecorView();
        decorView.getClass();
        if (!this.h) {
            decorView.postOnAnimation(new m3(4, this));
        } else if (kr1.n(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.d;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.c) {
                this.h = false;
                this.l.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.d = null;
        ie1 ie1Var = (ie1) this.l.o.getValue();
        synchronized (ie1Var.a) {
            z = ie1Var.b;
        }
        if (z) {
            this.h = false;
            this.l.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.l.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}

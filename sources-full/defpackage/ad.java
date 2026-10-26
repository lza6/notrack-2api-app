package defpackage;

import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ad implements jy2, a53, Runnable, Choreographer.FrameCallback {
    public static long o;
    public final View c;
    public boolean h;
    public boolean m;
    public long n;
    public final oi2 d = new oi2(0, new hy2[16]);
    public final Choreographer l = Choreographer.getInstance();

    /* JADX WARN: Code duplicated, block: B:10:0x0036  */
    public ad(View view) {
        float refreshRate;
        this.c = view;
        if (o == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                refreshRate = display.getRefreshRate();
                refreshRate = refreshRate < 30.0f ? 60.0f : refreshRate;
            }
            o = (long) (1.0E9f / refreshRate);
        }
    }

    @Override // defpackage.a53
    public final void a() {
        this.m = true;
    }

    @Override // defpackage.a53
    public final void b() {
    }

    @Override // defpackage.a53
    public final void d() {
        this.m = false;
        this.c.removeCallbacks(this);
        this.l.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.m) {
            this.n = j;
            this.c.post(this);
        }
    }

    @Override // defpackage.jy2
    public final void e(hy2 hy2Var) {
        this.d.c(hy2Var);
        if (this.h) {
            return;
        }
        this.h = true;
        this.c.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        oi2 oi2Var = this.d;
        if (oi2Var.h == 0 || !this.h || !this.m || this.c.getWindowVisibility() != 0) {
            this.h = false;
            return;
        }
        zc zcVar = new zc(this.n + o);
        boolean z = false;
        while (oi2Var.h != 0 && !z) {
            if (Math.max(0L, zcVar.a - System.nanoTime()) <= 0 || ((hy2) oi2Var.c[0]).b(zcVar)) {
                z = true;
            } else {
                oi2Var.m(0);
            }
        }
        if (z) {
            this.l.postFrameCallback(this);
        } else {
            this.h = false;
        }
    }
}

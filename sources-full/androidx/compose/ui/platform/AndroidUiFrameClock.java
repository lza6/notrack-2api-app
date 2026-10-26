package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.bg1;
import defpackage.gm4;
import defpackage.i63;
import defpackage.kr1;
import defpackage.le1;
import defpackage.ne1;
import defpackage.r00;
import defpackage.so0;
import defpackage.t00;
import defpackage.t73;
import defpackage.vp0;
import defpackage.wp0;
import defpackage.xf2;
import defpackage.xp0;
import defpackage.y64;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiFrameClock implements xf2 {
    public static final int $stable = 8;
    private final Choreographer choreographer;
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(Choreographer choreographer) {
        this(choreographer, null);
    }

    public AndroidUiFrameClock(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // defpackage.xp0
    public <R> R fold(R r, ne1 ne1Var) {
        return (R) y64.v(this, r, ne1Var);
    }

    @Override // defpackage.xp0
    public <E extends vp0> E get(wp0 wp0Var) {
        return (E) y64.w(this, wp0Var);
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // defpackage.xf2, defpackage.vp0
    public /* bridge */ /* synthetic */ wp0 getKey() {
        return bg1.t;
    }

    @Override // defpackage.xp0
    public xp0 minusKey(wp0 wp0Var) {
        return y64.H(this, wp0Var);
    }

    @Override // defpackage.xp0
    public xp0 plus(xp0 xp0Var) {
        return y64.I(this, xp0Var);
    }

    @Override // defpackage.xf2
    public <R> Object withFrameNanos(final le1 le1Var, so0 so0Var) {
        AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            vp0 vp0Var = so0Var.getContext().get(t73.m);
            androidUiDispatcher = vp0Var instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) vp0Var : null;
        }
        final t00 t00Var = new t00(1, gm4.G(so0Var));
        t00Var.u();
        Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Object i63Var;
                r00 r00Var = t00Var;
                try {
                    i63Var = le1Var.invoke(Long.valueOf(j));
                } catch (Throwable th) {
                    i63Var = new i63(th);
                }
                r00Var.resumeWith(i63Var);
            }
        };
        if (androidUiDispatcher == null || !kr1.n(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            t00Var.w(new AndroidUiFrameClock$withFrameNanos$2$2(this, frameCallback));
        } else {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            t00Var.w(new AndroidUiFrameClock$withFrameNanos$2$1(androidUiDispatcher, frameCallback));
        }
        return t00Var.s();
    }
}

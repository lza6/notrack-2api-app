package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.kl;
import defpackage.ly1;
import defpackage.ms0;
import defpackage.u41;
import defpackage.xf2;
import defpackage.xp0;
import defpackage.xp1;
import defpackage.yo4;
import defpackage.zp0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AndroidUiDispatcher extends zp0 {
    private final Choreographer choreographer;
    private final AndroidUiDispatcher$dispatchCallback$1 dispatchCallback;
    private final xf2 frameClock;
    private final Handler handler;
    private final Object lock;
    private boolean scheduledFrameDispatch;
    private boolean scheduledTrampolineDispatch;
    private List<Choreographer.FrameCallback> spareToRunOnFrame;
    private List<Choreographer.FrameCallback> toRunOnFrame;
    private final kl toRunTrampolined;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final ly1 Main$delegate = yo4.I(AndroidUiDispatcher$Companion$Main$2.INSTANCE);
    private static final ThreadLocal<xp0> currentThread = new ThreadLocal<xp0>() { // from class: androidx.compose.ui.platform.AndroidUiDispatcher$Companion$currentThread$1
        @Override // java.lang.ThreadLocal
        public xp0 initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            ms0 ms0Var = null;
            if (looperMyLooper != null) {
                AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(choreographer, xp1.j(looperMyLooper), ms0Var);
                return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
            }
            u41.r("no Looper on this thread");
            return null;
        }
    };

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ms0 ms0Var) {
            this();
        }

        public final xp0 getCurrentThread() {
            if (AndroidUiDispatcher_androidKt.isMainThread()) {
                return getMain();
            }
            xp0 xp0Var = (xp0) AndroidUiDispatcher.currentThread.get();
            if (xp0Var != null) {
                return xp0Var;
            }
            u41.r("no AndroidUiDispatcher for this thread");
            return null;
        }

        public final xp0 getMain() {
            return (xp0) AndroidUiDispatcher.Main$delegate.getValue();
        }
    }

    private AndroidUiDispatcher(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new kl();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new AndroidUiDispatcher$dispatchCallback$1(this);
        this.frameClock = new AndroidUiFrameClock(choreographer, this);
    }

    public /* synthetic */ AndroidUiDispatcher(Choreographer choreographer, Handler handler, ms0 ms0Var) {
        this(choreographer, handler);
    }

    private final Runnable nextTask() {
        Runnable runnable;
        synchronized (this.lock) {
            kl klVar = this.toRunTrampolined;
            runnable = (Runnable) (klVar.isEmpty() ? null : klVar.removeFirst());
        }
        return runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performFrameDispatch(long j) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    list.get(i).doFrame(j);
                }
                list.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performTrampolineDispatch() {
        boolean z;
        do {
            Runnable runnableNextTask = nextTask();
            while (runnableNextTask != null) {
                runnableNextTask.run();
                runnableNextTask = nextTask();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    @Override // defpackage.zp0
    public void dispatch(xp0 xp0Var, Runnable runnable) {
        synchronized (this.lock) {
            this.toRunTrampolined.addLast(runnable);
            if (!this.scheduledTrampolineDispatch) {
                this.scheduledTrampolineDispatch = true;
                this.handler.post(this.dispatchCallback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
            }
        }
    }

    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public final xf2 getFrameClock() {
        return this.frameClock;
    }

    public final void postFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.add(frameCallback);
            if (!this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = true;
                this.choreographer.postFrameCallback(this.dispatchCallback);
            }
        }
    }

    public final void removeFrameCallback$ui_release(Choreographer.FrameCallback frameCallback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(frameCallback);
        }
    }
}

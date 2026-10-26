package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class wf3 implements Executor {
    public final /* synthetic */ int c;
    public final Executor d;
    public final ArrayDeque h;
    public Runnable l;
    public final Object m;

    public wf3(Executor executor, int i) {
        this.c = i;
        switch (i) {
            case 1:
                executor.getClass();
                this.d = executor;
                this.h = new ArrayDeque();
                this.m = new Object();
                break;
            default:
                this.d = executor;
                this.h = new ArrayDeque();
                this.m = new Object();
                break;
        }
    }

    public wf3(ki kiVar) {
        this.c = 2;
        this.m = new Object();
        this.h = new ArrayDeque();
        this.d = kiVar;
    }

    public final void a() {
        switch (this.c) {
            case 0:
                Runnable runnable = (Runnable) this.h.poll();
                this.l = runnable;
                if (runnable != null) {
                    this.d.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.m) {
                    Object objPoll = this.h.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.l = runnable2;
                    if (objPoll != null) {
                        this.d.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.m) {
                    try {
                        Runnable runnable3 = (Runnable) this.h.poll();
                        this.l = runnable3;
                        if (runnable3 != null) {
                            ((ki) this.d).execute(runnable3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.c) {
            case 0:
                synchronized (this.m) {
                    try {
                        this.h.add(new io4(this, 11, runnable));
                        if (this.l == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.m) {
                    this.h.offer(new ba(runnable, 13, this));
                    if (this.l == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.m) {
                    try {
                        this.h.add(new ba(this, 1, runnable));
                        if (this.l == null) {
                            a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}

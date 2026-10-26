package defpackage;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class tv extends w {
    public final Thread n;
    public final v41 o;

    public tv(xp0 xp0Var, Thread thread, v41 v41Var) {
        super(xp0Var, true);
        this.n = thread;
        this.o = v41Var;
    }

    @Override // defpackage.os1
    public final void k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.n;
        if (kr1.n(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

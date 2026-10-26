package okio;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                ReentrantLock reentrantLock = b.h;
                ReentrantLock reentrantLock2 = b.h;
                reentrantLock2.lock();
                try {
                    b bVarAwaitTimeout = Path$Companion.awaitTimeout();
                    if (bVarAwaitTimeout == b.l) {
                        b.l = null;
                        reentrantLock2.unlock();
                        return;
                    } else {
                        reentrantLock2.unlock();
                        if (bVarAwaitTimeout != null) {
                            bVarAwaitTimeout.j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}

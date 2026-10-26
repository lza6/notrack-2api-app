package defpackage;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class au1 implements Closeable {
    public boolean c;
    public int d;
    public final ReentrantLock h = new ReentrantLock();
    public final RandomAccessFile l;

    public au1(RandomAccessFile randomAccessFile) {
        this.l = randomAccessFile;
    }

    public final x61 a(long j) {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            this.d++;
            reentrantLock.unlock();
            return new x61(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.c) {
                reentrantLock.unlock();
                return;
            }
            this.c = true;
            if (this.d != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.l.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.l.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}

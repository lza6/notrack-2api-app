package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.uuid.Uuid;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class ei4 {
    public final AtomicReferenceArray a = new AtomicReferenceArray(Uuid.SIZE_BITS);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(ei4.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ long f = u00.a.objectFieldOffset(ei4.class.getDeclaredField("lastScheduledTask$volatile"));
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(ei4.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(ei4.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ei4.class, "blockingTasksInBuffer$volatile");

    public final ts3 a(ts3 ts3Var, boolean z) {
        if (z) {
            return b(ts3Var);
        }
        b.getClass();
        ts3 ts3Var2 = (ts3) u00.a.getAndSetObject(this, f, ts3Var);
        if (ts3Var2 == null) {
            return null;
        }
        return b(ts3Var2);
    }

    public final ts3 b(ts3 ts3Var) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return ts3Var;
        }
        if (ts3Var.d) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, ts3Var);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final int c() {
        b.getClass();
        Object objectVolatile = u00.a.getObjectVolatile(this, f);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c;
        return objectVolatile != null ? (atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this)) + 1 : atomicIntegerFieldUpdater2.get(this) - atomicIntegerFieldUpdater.get(this);
    }

    public final void d(of1 of1Var) {
        b.getClass();
        ts3 ts3Var = (ts3) u00.a.getAndSetObject(this, f, (Object) null);
        if (ts3Var != null) {
            of1Var.a(ts3Var);
        }
        while (true) {
            ts3 ts3VarF = f();
            if (ts3VarF == null) {
                return;
            } else {
                of1Var.a(ts3VarF);
            }
        }
    }

    public final ts3 e() {
        b.getClass();
        ts3 ts3Var = (ts3) u00.a.getAndSetObject(this, f, (Object) null);
        return ts3Var == null ? f() : ts3Var;
    }

    public final ts3 f() {
        ts3 ts3Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (ts3Var = (ts3) this.a.getAndSet(i2, null)) != null) {
                if (ts3Var.d) {
                    e.decrementAndGet(this);
                }
                return ts3Var;
            }
        }
    }

    public final ts3 g() {
        ei4 ei4Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = u00.a;
            long j = f;
            ts3 ts3Var = (ts3) unsafe.getObjectVolatile(this, j);
            if (ts3Var == null || !ts3Var.d) {
                break;
            }
            while (true) {
                Unsafe unsafe2 = u00.a;
                ei4Var = this;
                if (unsafe2.compareAndSwapObject(ei4Var, f, ts3Var, (Object) null)) {
                    return ts3Var;
                }
                if (unsafe2.getObjectVolatile(ei4Var, j) != ts3Var) {
                    break;
                }
                this = ei4Var;
            }
            this = ei4Var;
        }
        ei4 ei4Var2 = this;
        int i = d.get(ei4Var2);
        int i2 = c.get(ei4Var2);
        while (i != i2 && e.get(ei4Var2) != 0) {
            i2--;
            ts3 ts3VarH = ei4Var2.h(i2, true);
            if (ts3VarH != null) {
                return ts3VarH;
            }
        }
        return null;
    }

    public final ts3 h(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        ts3 ts3Var = (ts3) atomicReferenceArray.get(i2);
        if (ts3Var != null && ts3Var.d == z) {
            while (!atomicReferenceArray.compareAndSet(i2, ts3Var, null)) {
                if (atomicReferenceArray.get(i2) != ts3Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return ts3Var;
        }
        return null;
    }

    public final long i(int i, q43 q43Var) {
        ei4 ei4Var;
        while (true) {
            b.getClass();
            Unsafe unsafe = u00.a;
            long j = f;
            ts3 ts3Var = (ts3) unsafe.getObjectVolatile(this, j);
            if (ts3Var == null) {
                return -2L;
            }
            if (((ts3Var.d ? 1 : 2) & i) == 0) {
                return -2L;
            }
            ft3.f.getClass();
            long jNanoTime = System.nanoTime() - ts3Var.c;
            long j2 = ft3.b;
            if (jNanoTime < j2) {
                return j2 - jNanoTime;
            }
            while (true) {
                Unsafe unsafe2 = u00.a;
                ei4Var = this;
                if (unsafe2.compareAndSwapObject(ei4Var, f, ts3Var, (Object) null)) {
                    q43Var.c = ts3Var;
                    return -1L;
                }
                if (unsafe2.getObjectVolatile(ei4Var, j) != ts3Var) {
                    break;
                }
                this = ei4Var;
            }
            this = ei4Var;
        }
    }
}

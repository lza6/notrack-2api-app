package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public class m72 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(m72.class, Object.class, "_cur$volatile");
    public static final /* synthetic */ long b = u00.a.objectFieldOffset(m72.class.getDeclaredField("_cur$volatile"));
    private volatile /* synthetic */ Object _cur$volatile = new o72(8, false);

    public final boolean a(Runnable runnable) {
        m72 m72Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u00.a;
            long j = b;
            o72 o72Var = (o72) unsafe.getObjectVolatile(this, j);
            int iA = o72Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                o72 o72VarD = o72Var.d();
                while (true) {
                    Unsafe unsafe2 = u00.a;
                    m72Var = this;
                    if (unsafe2.compareAndSwapObject(m72Var, b, o72Var, o72VarD) || unsafe2.getObjectVolatile(m72Var, j) != o72Var) {
                        break;
                    }
                    this = m72Var;
                }
            } else {
                if (iA == 2) {
                    return false;
                }
                m72Var = this;
            }
            this = m72Var;
        }
    }

    public final void b() {
        m72 m72Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u00.a;
            long j = b;
            o72 o72Var = (o72) unsafe.getObjectVolatile(this, j);
            if (o72Var.c()) {
                return;
            }
            o72 o72VarD = o72Var.d();
            while (true) {
                Unsafe unsafe2 = u00.a;
                m72Var = this;
                if (unsafe2.compareAndSwapObject(m72Var, b, o72Var, o72VarD) || unsafe2.getObjectVolatile(m72Var, j) != o72Var) {
                    break;
                } else {
                    this = m72Var;
                }
            }
            this = m72Var;
        }
    }

    public final int c() {
        a.getClass();
        o72 o72Var = (o72) u00.a.getObjectVolatile(this, b);
        o72Var.getClass();
        long j = o72.f.get(o72Var);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        m72 m72Var;
        while (true) {
            a.getClass();
            Unsafe unsafe = u00.a;
            long j = b;
            o72 o72Var = (o72) unsafe.getObjectVolatile(this, j);
            Object objE = o72Var.e();
            if (objE != o72.g) {
                return objE;
            }
            o72 o72VarD = o72Var.d();
            while (true) {
                Unsafe unsafe2 = u00.a;
                m72Var = this;
                if (unsafe2.compareAndSwapObject(m72Var, b, o72Var, o72VarD) || unsafe2.getObjectVolatile(m72Var, j) != o72Var) {
                    break;
                }
                this = m72Var;
            }
            this = m72Var;
        }
    }
}

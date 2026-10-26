package defpackage;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ft3 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final bg1 f;

    static {
        String property;
        int i = lr3.a;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        a = property;
        b = xr0.s0("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, LongCompanionObject.MAX_VALUE);
        int i2 = lr3.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = xr0.t0(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = xr0.t0(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(xr0.s0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, LongCompanionObject.MAX_VALUE));
        f = bg1.u;
    }
}

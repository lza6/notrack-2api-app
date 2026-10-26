package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class et3 {
    public static final et3 h = new et3(new sk3(new ia4(fq2.r(new StringBuilder(), ka4.h, " TaskRunner"), true)));
    public static final Logger i;
    public final sk3 a;
    public boolean c;
    public long d;
    public int b = 10000;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final im g = new im(12, this);

    static {
        Logger logger = Logger.getLogger(et3.class.getName());
        logger.getClass();
        i = logger;
    }

    public et3(sk3 sk3Var) {
        this.a = sk3Var;
    }

    public static final void a(et3 et3Var, ss3 ss3Var) {
        byte[] bArr = ka4.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(ss3Var.a);
        try {
            long jA = ss3Var.a();
            synchronized (et3Var) {
                et3Var.b(ss3Var, jA);
            }
        } finally {
            synchronized (et3Var) {
                et3Var.b(ss3Var, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(ss3 ss3Var, long j) {
        byte[] bArr = ka4.a;
        dt3 dt3Var = ss3Var.c;
        dt3Var.getClass();
        if (dt3Var.d != ss3Var) {
            u41.r("Check failed.");
            return;
        }
        boolean z = dt3Var.f;
        dt3Var.f = false;
        dt3Var.d = null;
        this.e.remove(dt3Var);
        if (j != -1 && !z && !dt3Var.c) {
            dt3Var.d(ss3Var, j, true);
        }
        if (dt3Var.e.isEmpty()) {
            return;
        }
        this.f.add(dt3Var);
    }

    public final ss3 c() {
        long j;
        ss3 ss3Var;
        boolean z;
        byte[] bArr = ka4.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long jNanoTime = System.nanoTime();
            int size = arrayList.size();
            long jMin = LongCompanionObject.MAX_VALUE;
            int i2 = 0;
            ss3 ss3Var2 = null;
            while (true) {
                if (i2 >= size) {
                    j = jNanoTime;
                    ss3Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                ss3 ss3Var3 = (ss3) ((dt3) obj).e.get(0);
                j = jNanoTime;
                ss3Var = null;
                long jMax = Math.max(0L, ss3Var3.d - j);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (ss3Var2 != null) {
                        z = true;
                        break;
                    }
                    ss3Var2 = ss3Var3;
                }
                jNanoTime = j;
            }
            ArrayList arrayList2 = this.e;
            if (ss3Var2 != null) {
                byte[] bArr2 = ka4.a;
                ss3Var2.d = -1L;
                dt3 dt3Var = ss3Var2.c;
                dt3Var.getClass();
                dt3Var.e.remove(ss3Var2);
                arrayList.remove(dt3Var);
                dt3Var.d = ss3Var2;
                arrayList2.add(dt3Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    im imVar = this.g;
                    imVar.getClass();
                    ((ThreadPoolExecutor) this.a.d).execute(imVar);
                }
                return ss3Var2;
            }
            if (this.c) {
                if (jMin >= this.d - j) {
                    return ss3Var;
                }
                notify();
                return ss3Var;
            }
            this.c = true;
            this.d = j + jMin;
            try {
                try {
                    long j2 = jMin / 1000000;
                    long j3 = jMin - (1000000 * j2);
                    if (j2 > 0 || jMin > 0) {
                        wait(j2, (int) j3);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((dt3) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        dt3 dt3Var2 = (dt3) arrayList.get(size3);
                        dt3Var2.b();
                        if (dt3Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
                this.c = false;
            } catch (Throwable th) {
                this.c = false;
                throw th;
            }
        }
    }

    public final void d(dt3 dt3Var) {
        dt3Var.getClass();
        byte[] bArr = ka4.a;
        if (dt3Var.d == null) {
            boolean zIsEmpty = dt3Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (zIsEmpty) {
                arrayList.remove(dt3Var);
            } else {
                arrayList.getClass();
                if (!arrayList.contains(dt3Var)) {
                    arrayList.add(dt3Var);
                }
            }
        }
        if (this.c) {
            notify();
            return;
        }
        im imVar = this.g;
        imVar.getClass();
        ((ThreadPoolExecutor) this.a.d).execute(imVar);
    }

    public final dt3 e() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new dt3(this, ud2.m(i2, "Q"));
    }
}

package androidx.work.impl;

import android.database.Cursor;
import android.os.Looper;
import defpackage.a31;
import defpackage.aq3;
import defpackage.be1;
import defpackage.bi4;
import defpackage.bv0;
import defpackage.ci4;
import defpackage.cq3;
import defpackage.f31;
import defpackage.fy2;
import defpackage.ir3;
import defpackage.ji4;
import defpackage.kr1;
import defpackage.ku0;
import defpackage.mi4;
import defpackage.sr0;
import defpackage.u41;
import defpackage.wr1;
import defpackage.z21;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase {
    public volatile be1 a;
    public Executor b;
    public aq3 c;
    public boolean e;
    public List f;
    public final Map j;
    public final LinkedHashMap k;
    public final wr1 d = d();
    public final LinkedHashMap g = new LinkedHashMap();
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();
    public final ThreadLocal i = new ThreadLocal();

    public WorkDatabase() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        mapSynchronizedMap.getClass();
        this.j = mapSynchronizedMap;
        this.k = new LinkedHashMap();
    }

    public static Object r(Class cls, aq3 aq3Var) {
        if (cls.isInstance(aq3Var)) {
            return aq3Var;
        }
        if (aq3Var instanceof ku0) {
            return r(cls, ((ku0) aq3Var).getDelegate());
        }
        return null;
    }

    public final void a() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            u41.r("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (h().J().A() || this.i.get() == null) {
            return;
        }
        u41.r("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final void c() {
        a();
        a();
        be1 be1VarJ = h().J();
        this.d.d(be1VarJ);
        if (be1VarJ.K()) {
            be1VarJ.c();
        } else {
            be1VarJ.a();
        }
    }

    public abstract wr1 d();

    public abstract aq3 e(sr0 sr0Var);

    public abstract bv0 f();

    public List g(Map map) {
        map.getClass();
        return z21.c;
    }

    public final aq3 h() {
        aq3 aq3Var = this.c;
        if (aq3Var != null) {
            return aq3Var;
        }
        kr1.n0("internalOpenHelper");
        throw null;
    }

    public Set i() {
        return f31.c;
    }

    public Map j() {
        return a31.c;
    }

    public final void k() {
        h().J().l();
        if (h().J().A()) {
            return;
        }
        wr1 wr1Var = this.d;
        if (wr1Var.f.compareAndSet(false, true)) {
            Executor executor = wr1Var.a.b;
            if (executor != null) {
                executor.execute(wr1Var.m);
            } else {
                kr1.n0("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract fy2 l();

    public final Cursor m(cq3 cq3Var) {
        a();
        b();
        return h().J().L(cq3Var);
    }

    public final Object n(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            p();
            return objCall;
        } finally {
            k();
        }
    }

    public final void o(Runnable runnable) {
        c();
        try {
            runnable.run();
            p();
        } finally {
            k();
        }
    }

    public final void p() {
        h().J().O();
    }

    public abstract ir3 q();

    public abstract bi4 s();

    public abstract ci4 t();

    public abstract ji4 u();

    public abstract mi4 v();
}

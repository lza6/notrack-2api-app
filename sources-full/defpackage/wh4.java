package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wh4 {
    public static wh4 k;
    public static wh4 l;
    public static final Object m;
    public final Context a;
    public final jl0 b;
    public final WorkDatabase c;
    public final zh4 d;
    public final List e;
    public final tz2 f;
    public final yl1 g;
    public boolean h = false;
    public BroadcastReceiver.PendingResult i;
    public final a54 j;

    static {
        v72.h("WorkManagerImpl");
        k = null;
        l = null;
        m = new Object();
    }

    public wh4(Context context, final jl0 jl0Var, zh4 zh4Var, final WorkDatabase workDatabase, final List list, tz2 tz2Var, a54 a54Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            u41.r("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        v72 v72Var = new v72(jl0Var.h);
        synchronized (v72.d) {
            try {
                if (v72.h == null) {
                    v72.h = v72Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = applicationContext;
        this.d = zh4Var;
        this.c = workDatabase;
        this.f = tz2Var;
        this.j = a54Var;
        this.b = jl0Var;
        this.e = list;
        zp0 zp0Var = zh4Var.b;
        zp0Var.getClass();
        qo0 qo0VarA = yo4.a(zp0Var);
        int i = 1;
        this.g = new yl1(workDatabase, 1);
        final wf3 wf3Var = zh4Var.a;
        String str = ya3.a;
        tz2Var.a(new h51() { // from class: wa3
            @Override // defpackage.h51
            public final void d(final vh4 vh4Var, boolean z) {
                final List list2 = list;
                final jl0 jl0Var2 = jl0Var;
                final WorkDatabase workDatabase2 = workDatabase;
                wf3Var.execute(new Runnable() { // from class: xa3
                    @Override // java.lang.Runnable
                    public final void run() {
                        List list3 = list2;
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            ((ua3) it.next()).a(vh4Var.a);
                        }
                        ya3.b(jl0Var2, workDatabase2, list3);
                    }
                });
            }
        });
        zh4Var.a(new oc1(applicationContext, this));
        String str2 = t84.a;
        if (rz2.a(applicationContext, jl0Var)) {
            ji4 ji4VarU = workDatabase.u();
            ji4VarU.getClass();
            so0 so0Var = null;
            int i2 = 3;
            py.F(qo0VarA, null, null, new f60(new t81(sf3.x(sf3.i(new t81(new pm0(i2, new qb((WorkDatabase_Impl) ji4VarU.a, new String[]{"workspec"}, new ii4(ji4VarU, q73.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")), so0Var, 13)), new s84(4, null), i), -1)), new ia2(applicationContext, null), i2), so0Var, 5), 3);
        }
    }

    public static wh4 a(Context context) {
        wh4 wh4Var;
        Object obj = m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        wh4Var = k;
                        if (wh4Var == null) {
                            wh4Var = l;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return wh4Var;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (wh4Var != null) {
            return wh4Var;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void b() {
        synchronized (m) {
            try {
                this.h = true;
                BroadcastReceiver.PendingResult pendingResult = this.i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        t73 t73Var = this.b.m;
        wl wlVar = new wl(22, this);
        t73Var.getClass();
        boolean zB = jr1.B();
        if (zB) {
            try {
                Trace.beginSection(jr1.O("ReschedulingWork"));
            } finally {
                if (zB) {
                    Trace.endSection();
                }
            }
        }
        wlVar.invoke();
    }
}

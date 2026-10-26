package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class tz2 {
    public static final String l = v72.h("Processor");
    public final Context b;
    public final jl0 c;
    public final zh4 d;
    public final WorkDatabase e;
    public final HashMap g = new HashMap();
    public final HashMap f = new HashMap();
    public final HashSet i = new HashSet();
    public final ArrayList j = new ArrayList();
    public PowerManager.WakeLock a = null;
    public final Object k = new Object();
    public final HashMap h = new HashMap();

    public tz2(Context context, jl0 jl0Var, zh4 zh4Var, WorkDatabase workDatabase) {
        this.b = context;
        this.c = jl0Var;
        this.d = zh4Var;
        this.e = workDatabase;
    }

    public static boolean d(String str, aj4 aj4Var, int i) {
        String str2 = l;
        if (aj4Var == null) {
            v72.f().c(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        aj4Var.m.o(new ri4(i));
        v72.f().c(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(h51 h51Var) {
        synchronized (this.k) {
            this.j.add(h51Var);
        }
    }

    public final aj4 b(String str) {
        aj4 aj4Var = (aj4) this.f.remove(str);
        boolean z = aj4Var != null;
        if (!z) {
            aj4Var = (aj4) this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            synchronized (this.k) {
                try {
                    if (this.f.isEmpty()) {
                        Context context = this.b;
                        String str2 = fr3.r;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.b.startService(intent);
                        } catch (Throwable th) {
                            v72.f().e(l, "Unable to stop foreground service", th);
                        }
                        PowerManager.WakeLock wakeLock = this.a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.a = null;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return aj4Var;
    }

    public final aj4 c(String str) {
        aj4 aj4Var = (aj4) this.f.get(str);
        return aj4Var == null ? (aj4) this.g.get(str) : aj4Var;
    }

    public final boolean e(String str) {
        boolean z;
        synchronized (this.k) {
            z = c(str) != null;
        }
        return z;
    }

    public final void f(h51 h51Var) {
        synchronized (this.k) {
            this.j.remove(h51Var);
        }
    }

    public final boolean g(dn3 dn3Var, zf3 zf3Var) {
        vh4 vh4Var = dn3Var.a;
        final String str = vh4Var.a;
        final ArrayList arrayList = new ArrayList();
        hi4 hi4Var = (hi4) this.e.n(new Callable() { // from class: sz2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WorkDatabase workDatabase = this.a.e;
                mi4 mi4VarV = workDatabase.v();
                String str2 = str;
                arrayList.addAll(mi4VarV.h(str2));
                return workDatabase.u().l(str2);
            }
        });
        int i = 10;
        if (hi4Var == null) {
            v72.f().i(l, "Didn't find WorkSpec for id " + vh4Var);
            this.d.d.execute(new ba(this, i, vh4Var));
            return false;
        }
        synchronized (this.k) {
            try {
                if (e(str)) {
                    Set set = (Set) this.h.get(str);
                    if (((dn3) set.iterator().next()).a.b == vh4Var.b) {
                        set.add(dn3Var);
                        v72.f().c(l, "Work " + vh4Var + " is already enqueued for processing");
                    } else {
                        this.d.d.execute(new ba(this, i, vh4Var));
                    }
                    return false;
                }
                if (hi4Var.t != vh4Var.b) {
                    this.d.d.execute(new ba(this, i, vh4Var));
                    return false;
                }
                Context context = this.b;
                jl0 jl0Var = this.c;
                zh4 zh4Var = this.d;
                WorkDatabase workDatabase = this.e;
                context.getClass();
                s44 s44Var = new s44();
                s44Var.d = jl0Var;
                s44Var.h = zh4Var;
                s44Var.l = this;
                s44Var.m = workDatabase;
                s44Var.n = hi4Var;
                s44Var.o = arrayList;
                Context applicationContext = context.getApplicationContext();
                applicationContext.getClass();
                s44Var.c = applicationContext;
                aj4 aj4Var = new aj4(s44Var);
                i00 i00VarG = py.G(aj4Var.d.b.plus(yo4.c()), new yi4(aj4Var, null, 1));
                i00VarG.d.a(new p00(this, i00VarG, aj4Var, 4), this.d.d);
                this.g.put(str, aj4Var);
                HashSet hashSet = new HashSet();
                hashSet.add(dn3Var);
                this.h.put(str, hashSet);
                v72.f().c(l, tz2.class.getSimpleName() + ": processing " + vh4Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

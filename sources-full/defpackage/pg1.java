package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 implements ua3, jo2, h51 {
    public static final String w = v72.h("GreedyScheduler");
    public final Context c;
    public final hu0 h;
    public boolean l;
    public final tz2 o;
    public final fp1 p;
    public final jl0 q;
    public Boolean s;
    public final sh1 t;
    public final zh4 u;
    public final ir3 v;
    public final HashMap d = new HashMap();
    public final Object m = new Object();
    public final mi4 n = new mi4(new nr0(4));
    public final HashMap r = new HashMap();

    public pg1(Context context, jl0 jl0Var, a54 a54Var, tz2 tz2Var, fp1 fp1Var, zh4 zh4Var) {
        this.c = context;
        jb jbVar = jl0Var.g;
        this.h = new hu0(this, jbVar, jl0Var.d);
        jbVar.getClass();
        ir3 ir3Var = new ir3();
        ir3Var.c = jbVar;
        ir3Var.d = fp1Var;
        ir3Var.h = new Object();
        ir3Var.l = new LinkedHashMap();
        this.v = ir3Var;
        this.u = zh4Var;
        this.t = new sh1(a54Var);
        this.q = jl0Var;
        this.o = tz2Var;
        this.p = fp1Var;
    }

    @Override // defpackage.ua3
    public final void a(String str) {
        Runnable runnable;
        if (this.s == null) {
            this.s = Boolean.valueOf(rz2.a(this.c, this.q));
        }
        boolean zBooleanValue = this.s.booleanValue();
        String str2 = w;
        if (!zBooleanValue) {
            v72.f().g(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.l) {
            this.o.a(this);
            this.l = true;
        }
        v72.f().c(str2, "Cancelling work ID " + str);
        hu0 hu0Var = this.h;
        if (hu0Var != null && (runnable = (Runnable) hu0Var.d.remove(str)) != null) {
            ((Handler) hu0Var.b.d).removeCallbacks(runnable);
        }
        for (dn3 dn3Var : this.n.j(str)) {
            this.v.J(dn3Var);
            fp1 fp1Var = this.p;
            fp1Var.getClass();
            fp1Var.p(dn3Var, -512);
        }
    }

    @Override // defpackage.jo2
    public final void b(hi4 hi4Var, bn0 bn0Var) {
        vh4 vh4VarA = ki4.a(hi4Var);
        boolean z = bn0Var instanceof zm0;
        fp1 fp1Var = this.p;
        ir3 ir3Var = this.v;
        String str = w;
        mi4 mi4Var = this.n;
        if (z) {
            if (mi4Var.g(vh4VarA)) {
                return;
            }
            v72.f().c(str, "Constraints met: Scheduling work ID " + vh4VarA);
            dn3 dn3VarK = mi4Var.k(vh4VarA);
            ir3Var.j0(dn3VarK);
            fp1Var.getClass();
            fp1Var.o(dn3VarK, null);
            return;
        }
        v72.f().c(str, "Constraints not met: Cancelling work ID " + vh4VarA);
        dn3 dn3VarI = mi4Var.i(vh4VarA);
        if (dn3VarI != null) {
            ir3Var.J(dn3VarI);
            int i = ((an0) bn0Var).a;
            fp1Var.getClass();
            fp1Var.p(dn3VarI, i);
        }
    }

    @Override // defpackage.ua3
    public final void c(hi4... hi4VarArr) {
        long jMax;
        if (this.s == null) {
            this.s = Boolean.valueOf(rz2.a(this.c, this.q));
        }
        if (!this.s.booleanValue()) {
            v72.f().g(w, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.l) {
            this.o.a(this);
            this.l = true;
        }
        HashSet<hi4> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (hi4 hi4Var : hi4VarArr) {
            if (!this.n.g(ki4.a(hi4Var))) {
                synchronized (this.m) {
                    try {
                        vh4 vh4VarA = ki4.a(hi4Var);
                        og1 og1Var = (og1) this.r.get(vh4VarA);
                        if (og1Var == null) {
                            int i = hi4Var.k;
                            this.q.d.getClass();
                            og1Var = new og1(System.currentTimeMillis(), i);
                            this.r.put(vh4VarA, og1Var);
                        }
                        jMax = (((long) Math.max((hi4Var.k - og1Var.a) - 5, 0)) * 30000) + og1Var.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                long jMax2 = Math.max(hi4Var.a(), jMax);
                this.q.d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (hi4Var.b == 1) {
                    if (jCurrentTimeMillis < jMax2) {
                        hu0 hu0Var = this.h;
                        if (hu0Var != null) {
                            jb jbVar = hu0Var.b;
                            HashMap map = hu0Var.d;
                            Runnable runnable = (Runnable) map.remove(hi4Var.a);
                            if (runnable != null) {
                                ((Handler) jbVar.d).removeCallbacks(runnable);
                            }
                            io4 io4Var = new io4(7, hu0Var, hi4Var, false);
                            map.put(hi4Var.a, io4Var);
                            hu0Var.c.getClass();
                            ((Handler) jbVar.d).postDelayed(io4Var, jMax2 - System.currentTimeMillis());
                        }
                    } else if (hi4Var.c()) {
                        tm0 tm0Var = hi4Var.j;
                        if (tm0Var.d) {
                            v72.f().c(w, "Ignoring " + hi4Var + ". Requires device idle.");
                        } else if (tm0Var.i.isEmpty()) {
                            hashSet.add(hi4Var);
                            hashSet2.add(hi4Var.a);
                        } else {
                            v72.f().c(w, "Ignoring " + hi4Var + ". Requires ContentUri triggers.");
                        }
                    } else if (!this.n.g(ki4.a(hi4Var))) {
                        v72.f().c(w, "Starting work for " + hi4Var.a);
                        mi4 mi4Var = this.n;
                        mi4Var.getClass();
                        dn3 dn3VarK = mi4Var.k(ki4.a(hi4Var));
                        this.v.j0(dn3VarK);
                        fp1 fp1Var = this.p;
                        fp1Var.getClass();
                        fp1Var.o(dn3VarK, null);
                    }
                }
            }
        }
        synchronized (this.m) {
            try {
                if (!hashSet.isEmpty()) {
                    v72.f().c(w, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (hi4 hi4Var2 : hashSet) {
                        vh4 vh4VarA2 = ki4.a(hi4Var2);
                        if (!this.d.containsKey(vh4VarA2)) {
                            this.d.put(vh4VarA2, ph4.a(this.t, hi4Var2, this.u.b, this));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.h51
    public final void d(vh4 vh4Var, boolean z) {
        gs1 gs1Var;
        dn3 dn3VarI = this.n.i(vh4Var);
        if (dn3VarI != null) {
            this.v.J(dn3VarI);
        }
        synchronized (this.m) {
            gs1Var = (gs1) this.d.remove(vh4Var);
        }
        if (gs1Var != null) {
            v72.f().c(w, "Stopping tracking for " + vh4Var);
            gs1Var.c(null);
        }
        if (z) {
            return;
        }
        synchronized (this.m) {
            this.r.remove(vh4Var);
        }
    }

    @Override // defpackage.ua3
    public final boolean e() {
        return false;
    }
}

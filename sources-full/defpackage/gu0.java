package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes.dex */
public final class gu0 implements jo2 {
    public static final String w = v72.h("DelayMetCommandHandler");
    public final Context c;
    public final int d;
    public final vh4 h;
    public final br3 l;
    public final sh1 m;
    public final Object n;
    public int o;
    public final wf3 p;
    public final y83 q;
    public PowerManager.WakeLock r;
    public boolean s;
    public final dn3 t;
    public final zp0 u;
    public volatile is1 v;

    public gu0(Context context, int i, br3 br3Var, dn3 dn3Var) {
        this.c = context;
        this.d = i;
        this.l = br3Var;
        this.h = dn3Var.a;
        this.t = dn3Var;
        a54 a54Var = br3Var.m.j;
        zh4 zh4Var = br3Var.d;
        this.p = zh4Var.a;
        this.q = zh4Var.d;
        this.u = zh4Var.b;
        this.m = new sh1(a54Var);
        this.s = false;
        this.o = 0;
        this.n = new Object();
    }

    public static void a(gu0 gu0Var) {
        int i = gu0Var.d;
        y83 y83Var = gu0Var.q;
        Context context = gu0Var.c;
        br3 br3Var = gu0Var.l;
        vh4 vh4Var = gu0Var.h;
        String str = vh4Var.a;
        int i2 = gu0Var.o;
        String str2 = w;
        if (i2 >= 2) {
            v72.f().c(str2, "Already stopped work for " + str);
            return;
        }
        gu0Var.o = 2;
        v72.f().c(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        vf0.c(intent, vh4Var);
        y83Var.execute(new ck(i, 1, br3Var, intent));
        if (!br3Var.l.e(vh4Var.a)) {
            v72.f().c(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        v72.f().c(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        vf0.c(intent2, vh4Var);
        y83Var.execute(new ck(i, 1, br3Var, intent2));
    }

    public static void c(gu0 gu0Var) {
        if (gu0Var.o != 0) {
            v72.f().c(w, "Already started work for " + gu0Var.h);
            return;
        }
        gu0Var.o = 1;
        v72.f().c(w, "onAllConstraintsMet for " + gu0Var.h);
        if (!gu0Var.l.l.g(gu0Var.t, null)) {
            gu0Var.d();
            return;
        }
        oi4 oi4Var = gu0Var.l.h;
        vh4 vh4Var = gu0Var.h;
        synchronized (oi4Var.d) {
            v72.f().c(oi4.e, "Starting timer for " + vh4Var);
            oi4Var.a(vh4Var);
            ni4 ni4Var = new ni4(oi4Var, vh4Var);
            oi4Var.b.put(vh4Var, ni4Var);
            oi4Var.c.put(vh4Var, gu0Var);
            ((Handler) oi4Var.a.d).postDelayed(ni4Var, 600000L);
        }
    }

    @Override // defpackage.jo2
    public final void b(hi4 hi4Var, bn0 bn0Var) {
        boolean z = bn0Var instanceof zm0;
        wf3 wf3Var = this.p;
        if (z) {
            wf3Var.execute(new fu0(this, 1));
        } else {
            wf3Var.execute(new fu0(this, 0));
        }
    }

    public final void d() {
        synchronized (this.n) {
            try {
                if (this.v != null) {
                    this.v.c(null);
                }
                this.l.h.a(this.h);
                PowerManager.WakeLock wakeLock = this.r;
                if (wakeLock != null && wakeLock.isHeld()) {
                    v72.f().c(w, "Releasing wakelock " + this.r + "for WorkSpec " + this.h);
                    this.r.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() throws Throwable {
        String str = this.h.a;
        this.r = mf4.a(this.c, str + " (" + this.d + ")");
        v72 v72VarF = v72.f();
        String str2 = w;
        v72VarF.c(str2, "Acquiring wakelock " + this.r + "for WorkSpec " + str);
        this.r.acquire();
        hi4 hi4VarL = this.l.m.c.u().l(str);
        if (hi4VarL == null) {
            this.p.execute(new fu0(this, 0));
            return;
        }
        boolean zC = hi4VarL.c();
        this.s = zC;
        if (zC) {
            this.v = ph4.a(this.m, hi4VarL, this.u, this);
        } else {
            v72.f().c(str2, "No constraints for ".concat(str));
            this.p.execute(new fu0(this, 1));
        }
    }

    public final void f(boolean z) {
        v72 v72VarF = v72.f();
        StringBuilder sb = new StringBuilder("onExecuted ");
        vh4 vh4Var = this.h;
        sb.append(vh4Var);
        sb.append(", ");
        sb.append(z);
        v72VarF.c(w, sb.toString());
        d();
        int i = this.d;
        br3 br3Var = this.l;
        y83 y83Var = this.q;
        Context context = this.c;
        if (z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            vf0.c(intent, vh4Var);
            y83Var.execute(new ck(i, 1, br3Var, intent));
        }
        if (this.s) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            y83Var.execute(new ck(i, 1, br3Var, intent2));
        }
    }
}

package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class br3 implements h51 {
    public static final String s = v72.h("SystemAlarmDispatcher");
    public final Context c;
    public final zh4 d;
    public final oi4 h;
    public final tz2 l;
    public final wh4 m;
    public final vf0 n;
    public final ArrayList o;
    public Intent p;
    public SystemAlarmService q;
    public final fp1 r;

    public br3(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.c = applicationContext;
        mi4 mi4Var = new mi4(new nr0(4));
        wh4 wh4VarA = wh4.a(systemAlarmService);
        jl0 jl0Var = wh4VarA.b;
        this.m = wh4VarA;
        this.n = new vf0(applicationContext, jl0Var.d, mi4Var);
        this.h = new oi4(jl0Var.g);
        tz2 tz2Var = wh4VarA.f;
        this.l = tz2Var;
        zh4 zh4Var = wh4VarA.d;
        this.d = zh4Var;
        this.r = new fp1(tz2Var, zh4Var);
        tz2Var.a(this);
        this.o = new ArrayList();
        this.p = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        u41.r("Needs to be invoked on the main thread.");
    }

    public final void a(Intent intent, int i) {
        v72 v72VarF = v72.f();
        String str = s;
        v72VarF.c(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            v72.f().i(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.o) {
                try {
                    ArrayList arrayList = this.o;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) obj).getAction())) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.o) {
            try {
                boolean zIsEmpty = this.o.isEmpty();
                this.o.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockA = mf4.a(this.c, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.m.d.a(new ar3(this, 0));
        } finally {
            wakeLockA.release();
        }
    }

    @Override // defpackage.h51
    public final void d(vh4 vh4Var, boolean z) {
        y83 y83Var = this.d.d;
        String str = vf0.n;
        Intent intent = new Intent(this.c, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        vf0.c(intent, vh4Var);
        y83Var.execute(new ck(0, 1, this, intent));
    }
}

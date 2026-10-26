package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fr3 implements jo2, h51 {
    public static final String r = v72.h("SystemFgDispatcher");
    public final wh4 c;
    public final zh4 d;
    public final Object h = new Object();
    public vh4 l;
    public final LinkedHashMap m;
    public final HashMap n;
    public final HashMap o;
    public final sh1 p;
    public SystemForegroundService q;

    public fr3(Context context) {
        wh4 wh4VarA = wh4.a(context);
        this.c = wh4VarA;
        this.d = wh4VarA.d;
        this.l = null;
        this.m = new LinkedHashMap();
        this.o = new HashMap();
        this.n = new HashMap();
        this.p = new sh1(wh4VarA.j);
        wh4VarA.f.a(this);
    }

    public static Intent a(Context context, vh4 vh4Var, pc1 pc1Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", vh4Var.a);
        intent.putExtra("KEY_GENERATION", vh4Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", pc1Var.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pc1Var.b);
        intent.putExtra("KEY_NOTIFICATION", pc1Var.c);
        return intent;
    }

    @Override // defpackage.jo2
    public final void b(hi4 hi4Var, bn0 bn0Var) {
        if (bn0Var instanceof an0) {
            String str = hi4Var.a;
            v72.f().c(r, "Constraints unmet for WorkSpec " + str);
            vh4 vh4VarA = ki4.a(hi4Var);
            int i = ((an0) bn0Var).a;
            wh4 wh4Var = this.c;
            wh4Var.d.a(new xn3(wh4Var.f, new dn3(vh4VarA), true, i));
        }
    }

    public final void c(Intent intent) {
        if (this.q == null) {
            u41.r("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        vh4 vh4Var = new vh4(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        v72.f().c(r, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            u41.k("Notification passed in the intent was null.");
            return;
        }
        pc1 pc1Var = new pc1(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.m;
        linkedHashMap.put(vh4Var, pc1Var);
        pc1 pc1Var2 = (pc1) linkedHashMap.get(this.l);
        if (pc1Var2 == null) {
            this.l = vh4Var;
        } else {
            this.q.l.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((pc1) ((Map.Entry) it.next()).getValue()).b;
                }
                pc1Var = new pc1(pc1Var2.a, pc1Var2.c, i);
            } else {
                pc1Var = pc1Var2;
            }
        }
        SystemForegroundService systemForegroundService = this.q;
        int i2 = pc1Var.a;
        int i3 = pc1Var.b;
        Notification notification2 = pc1Var.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            vk.h(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            vk.g(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // defpackage.h51
    public final void d(vh4 vh4Var, boolean z) {
        Map.Entry entry;
        synchronized (this.h) {
            try {
                gs1 gs1Var = ((hi4) this.n.remove(vh4Var)) != null ? (gs1) this.o.remove(vh4Var) : null;
                if (gs1Var != null) {
                    gs1Var.c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pc1 pc1Var = (pc1) this.m.remove(vh4Var);
        if (vh4Var.equals(this.l)) {
            if (this.m.size() > 0) {
                Iterator it = this.m.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.l = (vh4) entry.getKey();
                if (this.q != null) {
                    pc1 pc1Var2 = (pc1) entry.getValue();
                    SystemForegroundService systemForegroundService = this.q;
                    int i = pc1Var2.a;
                    int i2 = pc1Var2.b;
                    Notification notification = pc1Var2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        vk.h(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        vk.g(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.q.l.cancel(pc1Var2.a);
                }
            } else {
                this.l = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.q;
        if (pc1Var == null || systemForegroundService2 == null) {
            return;
        }
        v72.f().c(r, "Removing Notification (id: " + pc1Var.a + ", workSpecId: " + vh4Var + ", notificationType: " + pc1Var.b);
        systemForegroundService2.l.cancel(pc1Var.a);
    }

    public final void e() {
        this.q = null;
        synchronized (this.h) {
            try {
                Iterator it = this.o.values().iterator();
                while (it.hasNext()) {
                    ((gs1) it.next()).c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.f.f(this);
    }

    public final void f(int i) {
        v72.f().g(r, "Foreground service timed out, FGS type: " + i);
        for (Map.Entry entry : this.m.entrySet()) {
            if (((pc1) entry.getValue()).b == i) {
                vh4 vh4Var = (vh4) entry.getKey();
                wh4 wh4Var = this.c;
                wh4Var.d.a(new xn3(wh4Var.f, new dn3(vh4Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.q;
        if (systemForegroundService != null) {
            systemForegroundService.d = true;
            v72.f().c(SystemForegroundService.m, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}

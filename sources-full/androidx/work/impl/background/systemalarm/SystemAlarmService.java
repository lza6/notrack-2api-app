package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.br3;
import defpackage.mf4;
import defpackage.nf4;
import defpackage.r32;
import defpackage.v72;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends r32 {
    public static final String l = v72.h("SystemAlarmService");
    public br3 d;
    public boolean h;

    public final void c() {
        this.h = true;
        v72.f().c(l, "All commands completed in dispatcher");
        String str = mf4.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (nf4.a) {
            linkedHashMap.putAll(nf4.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                v72.f().i(mf4.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.r32, android.app.Service
    public final void onCreate() {
        super.onCreate();
        br3 br3Var = new br3(this);
        this.d = br3Var;
        if (br3Var.q != null) {
            v72.f().d(br3.s, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            br3Var.q = this;
        }
        this.h = false;
    }

    @Override // defpackage.r32, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.h = true;
        br3 br3Var = this.d;
        br3Var.getClass();
        v72.f().c(br3.s, "Destroying SystemAlarmDispatcher");
        br3Var.l.f(br3Var);
        br3Var.q = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.h) {
            v72.f().g(l, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            br3 br3Var = this.d;
            br3Var.getClass();
            v72 v72VarF = v72.f();
            String str = br3.s;
            v72VarF.c(str, "Destroying SystemAlarmDispatcher");
            br3Var.l.f(br3Var);
            br3Var.q = null;
            br3 br3Var2 = new br3(this);
            this.d = br3Var2;
            if (br3Var2.q != null) {
                v72.f().d(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                br3Var2.q = this;
            }
            this.h = false;
        }
        if (intent == null) {
            return 3;
        }
        this.d.a(intent, i2);
        return 3;
    }
}

package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import defpackage.c9;
import defpackage.fr3;
import defpackage.io4;
import defpackage.py;
import defpackage.r32;
import defpackage.t73;
import defpackage.v72;
import defpackage.wf3;
import defpackage.wh4;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends r32 {
    public static final String m = v72.h("SystemFgService");
    public boolean d;
    public fr3 h;
    public NotificationManager l;

    public final void c() {
        this.l = (NotificationManager) getApplicationContext().getSystemService("notification");
        fr3 fr3Var = new fr3(getApplicationContext());
        this.h = fr3Var;
        if (fr3Var.q != null) {
            v72.f().d(fr3.r, "A callback already exists.");
        } else {
            fr3Var.q = this;
        }
    }

    @Override // defpackage.r32, android.app.Service
    public final void onCreate() {
        super.onCreate();
        c();
    }

    @Override // defpackage.r32, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.h.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.d;
        boolean z2 = false;
        String str = m;
        if (z) {
            v72.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.h.e();
            c();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        fr3 fr3Var = this.h;
        fr3Var.getClass();
        String str2 = fr3.r;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            v72.f().g(str2, "Started foreground service " + intent);
            fr3Var.d.a(new io4(12, fr3Var, intent.getStringExtra("KEY_WORKSPEC_ID"), z2));
            fr3Var.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            fr3Var.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            v72.f().g(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = fr3Var.q;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.d = true;
            v72.f().c(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        v72.f().g(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        wh4 wh4Var = fr3Var.c;
        UUID uuidFromString = UUID.fromString(stringExtra);
        wh4Var.getClass();
        uuidFromString.getClass();
        t73 t73Var = wh4Var.b.m;
        wf3 wf3Var = wh4Var.d.a;
        wf3Var.getClass();
        py.H(t73Var, "CancelWorkById", wf3Var, new c9(wh4Var, 8, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.h.f(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.h.f(i2);
    }
}

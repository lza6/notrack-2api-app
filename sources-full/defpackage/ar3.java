package defpackage;

import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* JADX INFO: loaded from: classes.dex */
public final class ar3 implements Runnable {
    public final /* synthetic */ int c;
    public final br3 d;

    public /* synthetic */ ar3(br3 br3Var, int i) {
        this.c = i;
        this.d = br3Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008c A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005a, B:20:0x0064, B:22:0x006c, B:23:0x006e, B:27:0x0078, B:29:0x0085, B:37:0x0097, B:33:0x008b, B:34:0x008c, B:36:0x0094, B:41:0x009b, B:24:0x006f, B:25:0x0075, B:17:0x005b, B:18:0x0061), top: B:66:0x001b, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0094 A[Catch: all -> 0x0048, TryCatch #1 {all -> 0x0048, blocks: (B:6:0x001b, B:8:0x001f, B:10:0x0044, B:13:0x004a, B:14:0x0051, B:15:0x0052, B:16:0x005a, B:20:0x0064, B:22:0x006c, B:23:0x006e, B:27:0x0078, B:29:0x0085, B:37:0x0097, B:33:0x008b, B:34:0x008c, B:36:0x0094, B:41:0x009b, B:24:0x006f, B:25:0x0075, B:17:0x005b, B:18:0x0061), top: B:66:0x001b, inners: #3, #4 }] */
    @Override // java.lang.Runnable
    public final void run() {
        y83 y83Var;
        ar3 ar3Var;
        boolean zIsEmpty;
        boolean zIsEmpty2;
        switch (this.c) {
            case 0:
                synchronized (this.d.o) {
                    br3 br3Var = this.d;
                    br3Var.p = (Intent) br3Var.o.get(0);
                    break;
                }
                Intent intent = this.d.p;
                if (intent != null) {
                    String action = intent.getAction();
                    int intExtra = this.d.p.getIntExtra("KEY_START_ID", 0);
                    v72 v72VarF = v72.f();
                    String str = br3.s;
                    v72VarF.c(str, "Processing command " + this.d.p + ", " + intExtra);
                    PowerManager.WakeLock wakeLockA = mf4.a(this.d.c, action + " (" + intExtra + ")");
                    int i = 1;
                    try {
                        v72.f().c(str, "Acquiring operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.acquire();
                        br3 br3Var2 = this.d;
                        br3Var2.n.a(br3Var2.p, intExtra, br3Var2);
                        v72.f().c(str, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                        wakeLockA.release();
                        br3 br3Var3 = this.d;
                        y83Var = br3Var3.d.d;
                        ar3Var = new ar3(br3Var3, i);
                    } catch (Throwable th) {
                        try {
                            v72 v72VarF2 = v72.f();
                            String str2 = br3.s;
                            v72VarF2.e(str2, "Unexpected error in onHandleIntent", th);
                            v72.f().c(str2, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                            wakeLockA.release();
                            br3 br3Var4 = this.d;
                            y83Var = br3Var4.d.d;
                            ar3Var = new ar3(br3Var4, i);
                        } catch (Throwable th2) {
                            v72.f().c(br3.s, "Releasing operation wake lock (" + action + ") " + wakeLockA);
                            wakeLockA.release();
                            br3 br3Var5 = this.d;
                            br3Var5.d.d.execute(new ar3(br3Var5, i));
                            throw th2;
                        }
                    }
                    y83Var.execute(ar3Var);
                    return;
                }
                return;
            default:
                br3 br3Var6 = this.d;
                v72 v72VarF3 = v72.f();
                String str3 = br3.s;
                v72VarF3.c(str3, "Checking if commands are complete.");
                br3.b();
                synchronized (br3Var6.o) {
                    try {
                        if (br3Var6.p != null) {
                            v72.f().c(str3, "Removing command " + br3Var6.p);
                            if (!((Intent) br3Var6.o.remove(0)).equals(br3Var6.p)) {
                                throw new IllegalStateException("Dequeue-d command is not the first.");
                            }
                            br3Var6.p = null;
                        }
                        wf3 wf3Var = br3Var6.d.a;
                        vf0 vf0Var = br3Var6.n;
                        synchronized (vf0Var.h) {
                            zIsEmpty = vf0Var.d.isEmpty();
                            break;
                        }
                        if (zIsEmpty && br3Var6.o.isEmpty()) {
                            synchronized (wf3Var.m) {
                                zIsEmpty2 = wf3Var.h.isEmpty();
                                break;
                            }
                            if (zIsEmpty2) {
                                v72.f().c(str3, "No more commands & intents.");
                                SystemAlarmService systemAlarmService = br3Var6.q;
                                if (systemAlarmService != null) {
                                    systemAlarmService.c();
                                }
                            } else if (!br3Var6.o.isEmpty()) {
                                br3Var6.c();
                            }
                        } else if (!br3Var6.o.isEmpty()) {
                            br3Var6.c();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
        }
    }
}

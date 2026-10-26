package defpackage;

import ai.notrack.app.R;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.widget.Toast;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c40 implements je1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ c40(ClipboardManager clipboardManager, String str, lh1 lh1Var, Context context) {
        this.c = 1;
        this.h = clipboardManager;
        this.d = str;
        this.l = lh1Var;
        this.m = context;
    }

    public /* synthetic */ c40(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
        this.m = obj4;
    }

    @Override // defpackage.je1
    public final Object invoke() throws Throwable {
        switch (this.c) {
            case 0:
                String str = (String) this.d;
                le1 le1Var = (le1) this.h;
                le1 le1Var2 = (le1) this.l;
                tt ttVar = (tt) this.m;
                if (kr1.n(str, "own")) {
                    le1Var.invoke("bg");
                } else {
                    le1Var2.invoke(tt.b(ttVar, str, null, 0, null, null, 0, 62));
                }
                return w84.a;
            case 1:
                ClipboardManager clipboardManager = (ClipboardManager) this.h;
                String str2 = (String) this.d;
                lh1 lh1Var = (lh1) this.l;
                Context context = (Context) this.m;
                clipboardManager.setText(new hg(str2));
                lh1Var.mo63x70bb4fce(9);
                Toast.makeText(context, context.getString(R.string.action_copied), 0).show();
                return w84.a;
            case 2:
                ClipboardManager clipboardManager2 = (ClipboardManager) this.d;
                yd2 yd2Var = (yd2) this.h;
                lh1 lh1Var2 = (lh1) this.l;
                Context context2 = (Context) this.m;
                clipboardManager2.setText(new hg(yd2Var.b));
                lh1Var2.mo63x70bb4fce(9);
                Toast.makeText(context2, context2.getString(R.string.action_copied), 0).show();
                return w84.a;
            default:
                uh4 uh4Var = (uh4) this.d;
                UUID uuid = (UUID) this.h;
                pc1 pc1Var = (pc1) this.l;
                Context context3 = (Context) this.m;
                String string = uuid.toString();
                hi4 hi4VarL = uh4Var.c.l(string);
                if (hi4VarL == null || ud2.c(hi4VarL.b)) {
                    u41.r("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    return null;
                }
                tz2 tz2Var = uh4Var.b;
                synchronized (tz2Var.k) {
                    try {
                        v72.f().g(tz2.l, "Moving WorkSpec (" + string + ") to the foreground");
                        aj4 aj4Var = (aj4) tz2Var.g.remove(string);
                        if (aj4Var != null) {
                            if (tz2Var.a == null) {
                                PowerManager.WakeLock wakeLockA = mf4.a(tz2Var.b, "ProcessorForegroundLck");
                                tz2Var.a = wakeLockA;
                                wakeLockA.acquire();
                            }
                            tz2Var.f.put(string, aj4Var);
                            Intent intentA = fr3.a(tz2Var.b, ki4.a(aj4Var.a), pc1Var);
                            Context context4 = tz2Var.b;
                            if (Build.VERSION.SDK_INT >= 26) {
                                df0.u(context4, intentA);
                            } else {
                                context4.startService(intentA);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                vh4 vh4VarA = ki4.a(hi4VarL);
                String str3 = fr3.r;
                Intent intent = new Intent(context3, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", pc1Var.a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pc1Var.b);
                intent.putExtra("KEY_NOTIFICATION", pc1Var.c);
                intent.putExtra("KEY_WORKSPEC_ID", vh4VarA.a);
                intent.putExtra("KEY_GENERATION", vh4VarA.b);
                context3.startService(intent);
                return null;
        }
    }
}

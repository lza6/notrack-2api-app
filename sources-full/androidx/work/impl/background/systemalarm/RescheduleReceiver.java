package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.v72;
import defpackage.wh4;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = v72.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        v72.f().c(a, "Received intent " + intent);
        try {
            wh4 wh4VarA = wh4.a(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (wh4.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = wh4VarA.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    wh4VarA.i = pendingResultGoAsync;
                    if (wh4VarA.h) {
                        pendingResultGoAsync.finish();
                        wh4VarA.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            v72.f().e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

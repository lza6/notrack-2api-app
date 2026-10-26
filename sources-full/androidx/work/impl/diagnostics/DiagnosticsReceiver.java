package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.kr1;
import defpackage.qh4;
import defpackage.to2;
import defpackage.uo2;
import defpackage.v72;
import defpackage.wh4;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = v72.h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        v72 v72VarF = v72.f();
        String str = a;
        v72VarF.c(str, "Requesting diagnostics");
        try {
            context.getClass();
            wh4 wh4VarA = wh4.a(context);
            List listT = kr1.T((uo2) new to2(DiagnosticsWorker.class, 0).b());
            if (listT.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new qh4(wh4VarA, null, 2, listT, 0).a();
        } catch (IllegalStateException e) {
            v72.f().e(str, "WorkManager is not initialized", e);
        }
    }
}

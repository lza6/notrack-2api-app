package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class rk4 extends el4 {
    public final Context a;
    public final /* synthetic */ vf1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk4(vf1 vf1Var, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.b = vf1Var;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i2 = wf1.a;
        vf1 vf1Var = this.b;
        Context context = this.a;
        int iB = vf1Var.b(context, i2);
        int i3 = ag1.c;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = vf1Var.a(iB, context, "n");
            vf1Var.f(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}

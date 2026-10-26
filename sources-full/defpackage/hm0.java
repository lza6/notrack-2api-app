package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;

/* JADX INFO: loaded from: classes.dex */
public final class hm0 implements Runnable {
    public final /* synthetic */ int c;
    public Object d;
    public Object h;
    public Object l;

    public /* synthetic */ hm0() {
        this.c = 1;
    }

    public /* synthetic */ hm0(Object obj, Object obj2, Object obj3, int i) {
        this.c = i;
        this.d = obj;
        this.h = obj2;
        this.l = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        switch (this.c) {
            case 0:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.l;
                Context context = (Context) this.h;
                Intent intent = (Intent) this.d;
                try {
                    boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    v72.f().c(ConstraintProxyUpdateReceiver.a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    bs2.a(context, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    bs2.a(context, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    bs2.a(context, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    bs2.a(context, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 1:
                try {
                    objCall = ((vb1) this.d).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.l).post(new io4((wb1) this.h, 9, objCall));
                return;
            default:
                super/*au*/.b((c23) this.h, (bu) this.l);
                return;
        }
    }
}

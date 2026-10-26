package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.install.zza;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class vi extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ia0 ia0Var;
        switch (this.a) {
            case 0:
                ((wi) this.b).k();
                return;
            case 1:
                context.getClass();
                intent.getClass();
                lt ltVar = (lt) this.b;
                switch (ltVar.h) {
                    case 0:
                        String action = intent.getAction();
                        if (action == null) {
                            return;
                        }
                        v72.f().c(mt.a, "Received ".concat(action));
                        switch (action) {
                            case "android.intent.action.ACTION_POWER_DISCONNECTED":
                                ltVar.g(Boolean.FALSE);
                                return;
                            case "android.os.action.DISCHARGING":
                                ltVar.g(Boolean.FALSE);
                                return;
                            case "android.os.action.CHARGING":
                                ltVar.g(Boolean.TRUE);
                                return;
                            case "android.intent.action.ACTION_POWER_CONNECTED":
                                ltVar.g(Boolean.TRUE);
                                return;
                            default:
                                return;
                        }
                    case 1:
                        if (intent.getAction() == null) {
                            return;
                        }
                        v72.f().c(nt.a, "Received " + intent.getAction());
                        String action2 = intent.getAction();
                        if (action2 != null) {
                            int iHashCode = action2.hashCode();
                            if (iHashCode == -1980154005) {
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    ltVar.g(Boolean.TRUE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    ltVar.g(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    default:
                        if (intent.getAction() == null) {
                            return;
                        }
                        v72.f().c(ao3.a, "Received " + intent.getAction());
                        String action3 = intent.getAction();
                        if (action3 != null) {
                            int iHashCode2 = action3.hashCode();
                            if (iHashCode2 == -1181163412) {
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    ltVar.g(Boolean.FALSE);
                                    return;
                                }
                                return;
                            } else {
                                if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    ltVar.g(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                }
            default:
                um4 um4Var = (um4) this.b;
                boolean zEquals = context.getPackageName().equals(intent.getStringExtra("package.name"));
                d5 d5Var = um4Var.a;
                if (!zEquals) {
                    d5Var.d("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", intent.getStringExtra("package.name"));
                    return;
                }
                d5Var.d("List of extras in received intent:", new Object[0]);
                for (String str : intent.getExtras().keySet()) {
                    um4Var.a.d("Key: %s; value: %s", str, intent.getExtras().get(str));
                }
                d5 d5Var2 = um4Var.a;
                d5Var2.d("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                d5Var2.d("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
                d5Var2.d("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
                zza zzaVar = new zza(intent.getIntExtra("install.status", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
                um4Var.a.d("ListenerRegistryBroadcastReceiver.onReceive: %s", zzaVar);
                synchronized (um4Var) {
                    Iterator it = new HashSet(um4Var.d).iterator();
                    while (it.hasNext()) {
                        ir3 ir3Var = ((l33) it.next()).a;
                        if (zzaVar.a == 11 && (ia0Var = (ia0) ir3Var.d) != null) {
                            ia0Var.invoke();
                        }
                    }
                }
                return;
        }
    }
}

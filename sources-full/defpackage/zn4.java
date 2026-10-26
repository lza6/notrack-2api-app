package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zn4 implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zn4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        hm4 cm4Var;
        switch (this.a) {
            case 0:
                tm4.g("BillingClientTesting", "Billing Override Service connected.");
                fo4 fo4Var = (fo4) this.b;
                int i = dm4.e;
                if (iBinder == null) {
                    cm4Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
                    cm4Var = iInterfaceQueryLocalInterface instanceof hm4 ? (hm4) iInterfaceQueryLocalInterface : new cm4(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService", 1);
                }
                fo4Var.F = cm4Var;
                fo4Var.E = 2;
                int i2 = go4.a;
                cr4 cr4VarC = go4.c(26, gr4.BROADCAST_ACTION_UNSPECIFIED);
                Objects.requireNonNull(cr4VarC, "ApiSuccess should not be null");
                fy2 fy2Var = fo4Var.h;
                fy2Var.getClass();
                try {
                    fy2Var.v(cr4VarC, (lr4) fy2Var.c);
                } catch (Throwable th) {
                    tm4.i("BillingLogger", "Unable to log.", th);
                    return;
                }
                break;
            default:
                dt4 dt4Var = (dt4) this.b;
                dt4Var.b.f("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                dt4Var.a().post(new ys4(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                tm4.h("BillingClientTesting", "Billing Override Service disconnected.");
                fo4 fo4Var = (fo4) this.b;
                fo4Var.F = null;
                fo4Var.E = 0;
                break;
            default:
                dt4 dt4Var = (dt4) this.b;
                dt4Var.b.f("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                dt4Var.a().post(new us4(1, this));
                break;
        }
    }
}

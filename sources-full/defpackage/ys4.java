package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ys4 extends gs4 {
    public final /* synthetic */ IBinder d;
    public final /* synthetic */ zn4 h;

    public ys4(zn4 zn4Var, IBinder iBinder) {
        this.h = zn4Var;
        this.d = iBinder;
    }

    @Override // defpackage.gs4
    public final void a() {
        dp4 co4Var;
        dt4 dt4Var = (dt4) this.h.b;
        int i = ro4.e;
        IBinder iBinder = this.d;
        if (iBinder == null) {
            co4Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            co4Var = iInterfaceQueryLocalInterface instanceof dp4 ? (dp4) iInterfaceQueryLocalInterface : new co4(iBinder);
        }
        dt4Var.m = co4Var;
        d5 d5Var = dt4Var.b;
        int i2 = 0;
        d5Var.f("linkToDeath", new Object[0]);
        try {
            dt4Var.m.asBinder().linkToDeath(dt4Var.j, 0);
        } catch (RemoteException e) {
            d5Var.e(e, "linkToDeath failed", new Object[0]);
        }
        dt4Var.g = false;
        ArrayList arrayList = dt4Var.d;
        int size = arrayList.size();
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Runnable) obj).run();
        }
        dt4Var.d.clear();
    }
}

package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class po4 implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public po4(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        a aVar = this.b;
        if (iBinder == null) {
            synchronized (aVar.f) {
                i = aVar.m;
            }
            if (i == 3) {
                aVar.t = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            em4 em4Var = aVar.e;
            em4Var.sendMessage(em4Var.obtainMessage(i2, aVar.v.get(), 16));
            return;
        }
        synchronized (aVar.g) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar.h = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jl4)) ? new jl4(iBinder) : (jl4) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        a aVar2 = this.b;
        int i3 = this.a;
        aVar2.getClass();
        lp4 lp4Var = new lp4(aVar2, 0, null);
        em4 em4Var2 = aVar2.e;
        em4Var2.sendMessage(em4Var2.obtainMessage(7, i3, -1, lp4Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar = this.b;
        synchronized (aVar.g) {
            aVar.h = null;
        }
        a aVar2 = this.b;
        int i = this.a;
        em4 em4Var = aVar2.e;
        em4Var.sendMessage(em4Var.obtainMessage(6, i, 1));
    }
}

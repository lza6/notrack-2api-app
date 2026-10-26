package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class jl2 extends im0 {
    public final ConnectivityManager g;
    public final il2 h;

    public jl2(Context context, zh4 zh4Var) {
        super(context, zh4Var);
        Object systemService = ((Context) this.c).getSystemService("connectivity");
        systemService.getClass();
        this.g = (ConnectivityManager) systemService;
        this.h = new il2(this);
    }

    @Override // defpackage.im0
    public final Object e() {
        return kl2.a(this.g);
    }

    @Override // defpackage.im0
    public final void h() {
        try {
            v72.f().c(kl2.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.g;
            il2 il2Var = this.h;
            connectivityManager.getClass();
            il2Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(il2Var);
        } catch (IllegalArgumentException e) {
            v72.f().e(kl2.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            v72.f().e(kl2.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.im0
    public final void i() {
        try {
            v72.f().c(kl2.a, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.g;
            il2 il2Var = this.h;
            connectivityManager.getClass();
            il2Var.getClass();
            connectivityManager.unregisterNetworkCallback(il2Var);
        } catch (IllegalArgumentException e) {
            v72.f().e(kl2.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            v72.f().e(kl2.a, "Received exception while unregistering network callback", e2);
        }
    }
}

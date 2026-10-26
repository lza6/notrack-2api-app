package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class el2 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ym3 a;
    public final /* synthetic */ wz2 b;

    public el2(ym3 ym3Var, wz2 wz2Var) {
        this.a = ym3Var;
        this.b = wz2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        this.a.c(null);
        v72.f().c(ph4.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.b.i(zm0.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.c(null);
        v72.f().c(ph4.a, "NetworkRequestConstraintController onLost callback");
        this.b.i(new an0(7));
    }
}

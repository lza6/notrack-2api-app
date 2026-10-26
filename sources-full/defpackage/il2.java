package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class il2 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ jl2 a;

    public il2(jl2 jl2Var) {
        this.a = jl2Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        v72.f().c(kl2.a, "Network capabilities changed: " + networkCapabilities);
        int i = Build.VERSION.SDK_INT;
        jl2 jl2Var = this.a;
        jl2Var.g(i >= 28 ? new hl2(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : kl2.a(jl2Var.g));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        v72.f().c(kl2.a, "Network connection lost");
        jl2 jl2Var = this.a;
        jl2Var.g(kl2.a(jl2Var.g));
    }
}

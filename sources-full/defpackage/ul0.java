package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class ul0 implements tl0 {
    public final ConnectivityManager b;

    public ul0(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.tl0
    public final boolean a() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}

package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class kl2 {
    public static final String a = v72.h("NetworkStateTracker");

    public static final hl2 a(ConnectivityManager connectivityManager) {
        boolean zHasCapability;
        connectivityManager.getClass();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
        } catch (SecurityException e) {
            v72.f().e(a, "Unable to validate active network", e);
        }
        return new hl2(z, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}

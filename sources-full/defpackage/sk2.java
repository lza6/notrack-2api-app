package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk2 extends we1 implements le1 {
    public static final sk2 c = new sk2(1, vl0.class, "ConnectivityChecker", "ConnectivityChecker(Landroid/content/Context;)Lcoil3/network/ConnectivityChecker;", 1);

    @Override // defpackage.le1
    public final Object invoke(Object obj) {
        Context applicationContext = ((Context) obj).getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        if (connectivityManager != null && jr1.h(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                return new ul0(connectivityManager);
            } catch (Exception unused) {
            }
        }
        return tl0.a;
    }
}

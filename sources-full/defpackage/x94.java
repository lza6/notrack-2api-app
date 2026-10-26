package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x94 implements Runnable {
    public final /* synthetic */ ca4 c;
    public final /* synthetic */ vo d;
    public final /* synthetic */ int h;
    public final /* synthetic */ Runnable l;

    public /* synthetic */ x94(ca4 ca4Var, vo voVar, int i, Runnable runnable) {
        this.c = ca4Var;
        this.d = voVar;
        this.h = i;
        this.l = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final vo voVar = this.d;
        final int i = this.h;
        Runnable runnable = this.l;
        final ca4 ca4Var = this.c;
        o83 o83Var = ca4Var.f;
        try {
            o83 o83Var2 = ca4Var.c;
            Objects.requireNonNull(o83Var2);
            o83Var.x(new y94(o83Var2, 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ca4Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                o83Var.x(new xq3() { // from class: z94
                    @Override // defpackage.xq3
                    public final Object d() {
                        ca4Var.d.H(voVar, i + 1, false);
                        return null;
                    }
                });
            } else {
                ca4Var.a(voVar, i);
            }
        } catch (wq3 unused) {
            ca4Var.d.H(voVar, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}

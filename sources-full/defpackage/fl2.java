package defpackage;

import android.net.ConnectivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class fl2 implements fm0 {
    public final ConnectivityManager a;
    public final long b;

    public fl2(ConnectivityManager connectivityManager) {
        long j = ph4.b;
        this.a = connectivityManager;
        this.b = j;
    }

    @Override // defpackage.fm0
    public final boolean a(hi4 hi4Var) {
        hi4Var.getClass();
        return hi4Var.j.a() != null;
    }

    @Override // defpackage.fm0
    public final boolean b(hi4 hi4Var) {
        if (!a(hi4Var)) {
            return false;
        }
        u41.r("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.fm0
    public final e00 c(tm0 tm0Var) {
        tm0Var.getClass();
        return new e00(new q8(tm0Var, this, (so0) null, 22), x21.c, -2, fy.c);
    }
}

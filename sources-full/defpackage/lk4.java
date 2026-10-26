package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public abstract class lk4 {
    public final int a;

    public lk4(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(ek4 ek4Var);

    public abstract o61[] b(ek4 ek4Var);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(ek4 ek4Var);

    public abstract void f(bi4 bi4Var, boolean z);
}

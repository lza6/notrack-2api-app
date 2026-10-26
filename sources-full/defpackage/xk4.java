package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class xk4 extends lk4 {
    public final us3 b;

    public xk4(us3 us3Var) {
        super(4);
        this.b = us3Var;
    }

    @Override // defpackage.lk4
    public final boolean a(ek4 ek4Var) {
        if (ek4Var.i.get(null) == null) {
            return false;
        }
        m51.t();
        return false;
    }

    @Override // defpackage.lk4
    public final o61[] b(ek4 ek4Var) {
        if (ek4Var.i.get(null) == null) {
            return null;
        }
        m51.t();
        return null;
    }

    @Override // defpackage.lk4
    public final void c(Status status) {
        this.b.a(new ug(status));
    }

    @Override // defpackage.lk4
    public final void d(Exception exc) {
        this.b.a(exc);
    }

    @Override // defpackage.lk4
    public final void e(ek4 ek4Var) throws DeadObjectException {
        try {
            h(ek4Var);
        } catch (DeadObjectException e) {
            c(lk4.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(lk4.g(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    @Override // defpackage.lk4
    public final /* bridge */ /* synthetic */ void f(bi4 bi4Var, boolean z) {
    }

    public final void h(ek4 ek4Var) {
        if (ek4Var.i.remove(null) == null) {
            this.b.b(Boolean.FALSE);
        } else {
            m51.t();
        }
    }
}

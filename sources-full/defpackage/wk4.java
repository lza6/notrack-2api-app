package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wk4 extends lk4 {
    public final cr1 b;
    public final us3 c;
    public final t73 d;

    public wk4(cr1 cr1Var, us3 us3Var, t73 t73Var) {
        super(2);
        this.c = us3Var;
        this.b = cr1Var;
        this.d = t73Var;
        if (cr1Var.a) {
            u41.k("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.lk4
    public final boolean a(ek4 ek4Var) {
        return this.b.a;
    }

    @Override // defpackage.lk4
    public final o61[] b(ek4 ek4Var) {
        return (o61[]) this.b.b;
    }

    @Override // defpackage.lk4
    public final void c(Status status) {
        this.d.getClass();
        this.c.a(status.h != null ? new wp1(status) : new ug(status));
    }

    @Override // defpackage.lk4
    public final void d(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.lk4
    public final void e(ek4 ek4Var) throws DeadObjectException {
        us3 us3Var = this.c;
        try {
            this.b.c(ek4Var.e, us3Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(lk4.g(e2));
        } catch (RuntimeException e3) {
            us3Var.a(e3);
        }
    }

    @Override // defpackage.lk4
    public final void f(bi4 bi4Var, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) bi4Var.d;
        us3 us3Var = this.c;
        map.put(us3Var, boolValueOf);
        sd sdVar = us3Var.a;
        fy2 fy2Var = new fy2();
        fy2Var.d = bi4Var;
        fy2Var.c = us3Var;
        sdVar.getClass();
        ((cr1) sdVar.c).g(new uq4(vs3.a, fy2Var));
        sdVar.j();
    }
}

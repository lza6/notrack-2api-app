package defpackage;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class es4 extends gs4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ us3 h;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es4(Object obj, us3 us3Var, us3 us3Var2, Object obj2, int i) {
        super(us3Var);
        this.d = i;
        this.m = obj;
        this.h = us3Var2;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es4(ts4 ts4Var, us3 us3Var, String str, us3 us3Var2) {
        super(us3Var);
        this.d = 0;
        this.m = ts4Var;
        this.l = str;
        this.h = us3Var2;
    }

    @Override // defpackage.gs4
    public final void a() {
        switch (this.d) {
            case 0:
                us3 us3Var = this.h;
                ts4 ts4Var = (ts4) this.m;
                String str = (String) this.l;
                try {
                    ts4Var.a.m.a(ts4Var.b, ts4.a(ts4Var, str), new rs4(ts4Var, us3Var, str));
                    return;
                } catch (RemoteException e) {
                    ts4.e.e(e, "requestUpdateInfo(%s)", str);
                    us3Var.a(new RuntimeException(e));
                    return;
                }
            case 1:
                us3 us3Var2 = this.h;
                ts4 ts4Var2 = (ts4) this.m;
                try {
                    ts4Var2.a.m.f(ts4Var2.b, ts4.b(), new ns4(ts4Var2, new d5("OnCompleteUpdateCallback"), us3Var2));
                    return;
                } catch (RemoteException e2) {
                    ts4.e.e(e2, "completeUpdate(%s)", (String) this.l);
                    us3Var2.a(new RuntimeException(e2));
                    return;
                }
            default:
                synchronized (((dt4) this.m).f) {
                    try {
                        dt4 dt4Var = (dt4) this.m;
                        us3 us3Var3 = this.h;
                        dt4Var.e.add(us3Var3);
                        sd sdVar = us3Var3.a;
                        mi4 mi4Var = new mi4(dt4Var, 13, us3Var3);
                        sdVar.getClass();
                        ((cr1) sdVar.c).g(new uq4(vs3.a, mi4Var));
                        sdVar.j();
                        if (((dt4) this.m).k.getAndIncrement() > 0) {
                            ((dt4) this.m).b.f("Already connected to the service.", new Object[0]);
                        }
                        dt4.b((dt4) this.m, (gs4) this.l);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}

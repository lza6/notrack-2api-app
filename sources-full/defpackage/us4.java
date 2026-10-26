package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us4 extends gs4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object h;

    public /* synthetic */ us4(int i, Object obj) {
        this.d = i;
        this.h = obj;
    }

    @Override // defpackage.gs4
    public final void a() {
        switch (this.d) {
            case 0:
                synchronized (((dt4) this.h).f) {
                    try {
                        if (((dt4) this.h).k.get() > 0 && ((dt4) this.h).k.decrementAndGet() > 0) {
                            ((dt4) this.h).b.f("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        dt4 dt4Var = (dt4) this.h;
                        if (dt4Var.m != null) {
                            dt4Var.b.f("Unbind from service.", new Object[0]);
                            dt4 dt4Var2 = (dt4) this.h;
                            dt4Var2.a.unbindService(dt4Var2.l);
                            dt4 dt4Var3 = (dt4) this.h;
                            dt4Var3.g = false;
                            dt4Var3.m = null;
                            dt4Var3.l = null;
                        }
                        ((dt4) this.h).d();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            default:
                dt4 dt4Var4 = (dt4) ((zn4) this.h).b;
                dt4Var4.b.f("unlinkToDeath", new Object[0]);
                dt4Var4.m.asBinder().unlinkToDeath(dt4Var4.j, 0);
                dt4Var4.m = null;
                dt4Var4.g = false;
                return;
        }
    }
}

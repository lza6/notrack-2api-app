package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class uq4 implements qs4 {
    public final Executor b;
    public final Object d;
    public final /* synthetic */ int a = 1;
    public final Object c = new Object();

    public uq4(Executor executor, f4 f4Var) {
        this.b = executor;
        this.d = f4Var;
    }

    public uq4(Executor executor, io2 io2Var) {
        this.b = executor;
        this.d = io2Var;
    }

    @Override // defpackage.qs4
    public final void a(sd sdVar) {
        boolean z = false;
        switch (this.a) {
            case 0:
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new io4(19, this, sdVar, z));
                return;
            default:
                if (sdVar.e()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new io4(21, this, sdVar, z));
                    return;
                }
                return;
        }
    }
}

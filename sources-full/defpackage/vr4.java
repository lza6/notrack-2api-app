package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vr4 implements qs4 {
    public final Executor a;
    public final Object b = new Object();

    public vr4(Executor executor, m51 m51Var) {
        this.a = executor;
    }

    @Override // defpackage.qs4
    public final void a(sd sdVar) {
        if (sdVar.e()) {
            return;
        }
        synchronized (this.b) {
        }
        this.a.execute(new io4(20, this, sdVar, false));
    }
}

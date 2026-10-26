package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class al implements Executor {
    public final /* synthetic */ int c;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.c) {
            case 0:
                bl.q0().m.n.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}

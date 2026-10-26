package defpackage;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy3 implements Executor {
    public final /* synthetic */ Choreographer c;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.postFrameCallback(new e03(runnable));
    }
}

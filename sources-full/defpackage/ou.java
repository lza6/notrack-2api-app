package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class ou implements Executor {
    public final /* synthetic */ int c;
    public final Handler d;

    public ou(int i) {
        this.c = i;
        switch (i) {
            case 1:
                this.d = new Handler(Looper.getMainLooper());
                break;
            default:
                this.d = new Handler(Looper.getMainLooper());
                break;
        }
    }

    public /* synthetic */ ou(Handler handler, int i) {
        this.c = i;
        this.d = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        Handler handler = this.d;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            case 1:
                handler.post(runnable);
                return;
            case 2:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }
}

package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zh4 {
    public final wf3 a;
    public final zp0 b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final y83 d = new y83(1, this);

    public zh4(ExecutorService executorService) {
        wf3 wf3Var = new wf3(executorService, 0);
        this.a = wf3Var;
        this.b = g13.B(wf3Var);
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}

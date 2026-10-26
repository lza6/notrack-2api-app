package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y83 implements Executor {
    public final /* synthetic */ int c;
    public final Object d;

    public y83() {
        this.c = 2;
        el4 el4Var = new el4(Looper.getMainLooper());
        Looper.getMainLooper();
        this.d = el4Var;
    }

    public /* synthetic */ y83(int i, Object obj) {
        this.c = i;
        this.d = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new im(9, runnable));
                break;
            case 1:
                ((zh4) obj).c.post(runnable);
                break;
            default:
                ((el4) obj).post(runnable);
                break;
        }
    }
}

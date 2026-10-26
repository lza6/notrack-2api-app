package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e03 implements Choreographer.FrameCallback {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ Object d;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new hi((Context) obj, 2), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}

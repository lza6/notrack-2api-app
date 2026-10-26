package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class s62 {
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c = new AtomicInteger(-256);
    public boolean d;

    public s62(Context context, WorkerParameters workerParameters) {
        this.a = context;
        this.b = workerParameters;
    }

    public abstract i00 a();

    public abstract i00 b();
}

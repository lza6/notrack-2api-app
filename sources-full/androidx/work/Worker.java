package androidx.work;

import android.content.Context;
import defpackage.bb2;
import defpackage.i00;
import defpackage.i43;
import defpackage.kr1;
import defpackage.nj1;
import defpackage.q62;
import defpackage.s62;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends s62 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.s62
    public final i00 a() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return kr1.G(new nj1(executorService, 6, new bb2(this)));
    }

    @Override // defpackage.s62
    public final i00 b() {
        ExecutorService executorService = this.b.c;
        executorService.getClass();
        return kr1.G(new nj1(executorService, 6, new i43(20, this)));
    }

    public abstract q62 c();
}

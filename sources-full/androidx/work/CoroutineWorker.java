package androidx.work;

import android.content.Context;
import defpackage.i00;
import defpackage.kq0;
import defpackage.kr1;
import defpackage.lq0;
import defpackage.py;
import defpackage.s62;
import defpackage.xp0;
import defpackage.yo4;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends s62 {
    public final WorkerParameters e;
    public final kq0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = kq0.c;
    }

    @Override // defpackage.s62
    public final i00 a() {
        return py.G(this.f.plus(yo4.c()), new lq0(this, null, 0));
    }

    @Override // defpackage.s62
    public final i00 b() {
        kq0 kq0Var = kq0.c;
        xp0 xp0Var = this.f;
        if (kr1.n(xp0Var, kq0Var)) {
            xp0Var = this.e.d;
        }
        xp0Var.getClass();
        return py.G(xp0Var.plus(yo4.c()), new lq0(this, null, 1));
    }

    public abstract Object c(lq0 lq0Var);
}

package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class xw0 implements yw0 {
    public final ScheduledFuture c;

    public xw0(ScheduledFuture scheduledFuture) {
        this.c = scheduledFuture;
    }

    @Override // defpackage.yw0
    public final void dispose() {
        this.c.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.c + ']';
    }
}

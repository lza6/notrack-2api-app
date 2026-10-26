package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes.dex */
public final class m00 implements hm2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((le1) obj).getClass().getSimpleName() + '@' + xr0.a0(this) + ']';
            default:
                return "DisposeOnCancel[" + ((yw0) obj) + ']';
        }
    }
}

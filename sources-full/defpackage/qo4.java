package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class qo4 {
    public static final qo4 b;
    public static final qo4 c;
    public final Throwable a;

    static {
        if (js4.l) {
            c = null;
            b = null;
        } else {
            c = new qo4(null);
            b = new qo4(null);
        }
    }

    public qo4(CancellationException cancellationException) {
        this.a = cancellationException;
    }
}

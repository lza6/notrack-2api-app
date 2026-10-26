package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pn4 {
    public static final pn4 d = new pn4();
    public final Runnable a;
    public final Executor b;
    public pn4 c;

    public pn4() {
        this.a = null;
        this.b = null;
    }

    public pn4(Runnable runnable, Executor executor) {
        this.a = runnable;
        this.b = executor;
    }
}

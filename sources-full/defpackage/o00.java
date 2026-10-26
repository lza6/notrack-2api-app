package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class o00 extends CancellationException {
    public static final o00 c = new o00();

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(g13.g);
        return this;
    }
}

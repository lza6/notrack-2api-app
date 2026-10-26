package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends CancellationException {
    public final transient Object c;

    public d(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.c = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

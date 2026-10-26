package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nv0 extends RuntimeException {
    public final transient xp0 c;

    public nv0(xp0 xp0Var) {
        this.c = xp0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.c);
    }
}

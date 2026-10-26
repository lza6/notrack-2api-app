package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mw0 extends Exception {
    public final Throwable c;

    public mw0(Throwable th, zp0 zp0Var, xp0 xp0Var) {
        super("Coroutine dispatcher " + zp0Var + " threw an exception, context = " + xp0Var, th);
        this.c = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.c;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class de1 extends RuntimeException {
    public final int c;
    public final Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de1(int i, Throwable th) {
        super(th);
        if (i == 0) {
            throw null;
        }
        this.c = i;
        this.d = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.d;
    }
}

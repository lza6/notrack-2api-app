package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b33 implements AutoCloseable {
    public final jw0 c;

    public b33(jw0 jw0Var) {
        this.c = jw0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nd0 implements AutoCloseable, gq0 {
    public final xp0 c;

    public nd0(xp0 xp0Var) {
        xp0Var.getClass();
        this.c = xp0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        yo4.k(this.c, null);
    }

    @Override // defpackage.gq0
    public final xp0 getCoroutineContext() {
        return this.c;
    }
}

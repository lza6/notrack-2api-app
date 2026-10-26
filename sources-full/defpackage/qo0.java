package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qo0 implements gq0 {
    public final xp0 c;

    public qo0(xp0 xp0Var) {
        this.c = xp0Var;
    }

    @Override // defpackage.gq0
    public final xp0 getCoroutineContext() {
        return this.c;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.c + ')';
    }
}

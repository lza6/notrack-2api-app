package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q94 extends UnsupportedOperationException {
    public final o61 c;

    public q94(o61 o61Var) {
        this.c = o61Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.c));
    }
}

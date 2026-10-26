package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wj0 extends IllegalStateException {
    public final String c;

    public wj0(String str) {
        this.c = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }
}

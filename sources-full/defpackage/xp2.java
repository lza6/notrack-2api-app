package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp2 extends yo4 {
    public final Throwable n;

    public xp2(Throwable th) {
        super(20);
        this.n = th;
    }

    @Override // defpackage.yo4
    public final String toString() {
        return "FAILURE (" + this.n.getMessage() + ")";
    }
}

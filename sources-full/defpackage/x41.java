package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x41 extends y41 {
    public final w04 h;

    public x41(long j, w04 w04Var) {
        super(j);
        this.h = w04Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.h.run();
    }

    @Override // defpackage.y41
    public final String toString() {
        return super.toString() + this.h;
    }
}

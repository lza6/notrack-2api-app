package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w04 extends db3 implements Runnable {
    public final long o;

    public w04(long j, x04 x04Var) {
        super(x04Var, x04Var.getContext());
        this.o = j;
    }

    @Override // defpackage.os1
    public final String P() {
        return super.P() + "(timeMillis=" + this.o + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        p23.y(this.m);
        o(new v04("Timed out waiting for " + this.o + " ms", this));
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jw0 implements AutoCloseable {
    public final iw0 c;
    public boolean d;
    public final /* synthetic */ lw0 h;

    public jw0(lw0 lw0Var, iw0 iw0Var) {
        this.h = lw0Var;
        this.c = iw0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.d) {
            return;
        }
        this.d = true;
        lw0 lw0Var = this.h;
        synchronized (lw0Var.p) {
            iw0 iw0Var = this.c;
            int i = iw0Var.h - 1;
            iw0Var.h = i;
            if (i == 0 && iw0Var.f) {
                lw0Var.O(iw0Var);
            }
        }
    }
}

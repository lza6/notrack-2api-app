package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mn4 implements Runnable {
    public final oo4 c;
    public final mo4 d;

    public mn4(oo4 oo4Var, mo4 mo4Var) {
        this.c = oo4Var;
        this.d = mo4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.c != this) {
            return;
        }
        mo4 mo4Var = this.d;
        if (un4.o.g(this.c, this, oo4.h(mo4Var))) {
            oo4.j(this.c);
        }
    }
}

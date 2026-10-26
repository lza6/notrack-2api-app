package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k33 {
    public final q33 a;
    public final kn4 b;
    public final Object c = new Object();

    public k33(q33 q33Var, kn4 kn4Var) {
        this.a = q33Var;
        this.b = kn4Var;
    }

    public final void a(long j) {
        synchronized (this.c) {
            p33 p33Var = (p33) this.a.c;
            p33Var.c = j;
            p33Var.l(j);
        }
    }
}

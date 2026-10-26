package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class f00 {
    public Object a;
    public i00 b;
    public t53 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        i00 i00Var = this.b;
        if (i00Var != null) {
            h00 h00Var = i00Var.d;
            h00Var.getClass();
            if (obj == null) {
                obj = u0.o;
            }
            if (u0.n.u(h00Var, null, obj)) {
                u0.d(h00Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        i00 i00Var = this.b;
        if (i00Var == null || !i00Var.d.j(th)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        t53 t53Var;
        i00 i00Var = this.b;
        if (i00Var != null) {
            h00 h00Var = i00Var.d;
            if (!h00Var.isDone()) {
                h00Var.j(new o0("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 1));
            }
        }
        if (this.d || (t53Var = this.c) == null) {
            return;
        }
        t53Var.k(null);
    }
}

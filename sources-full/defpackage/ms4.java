package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ms4 {
    public Object a;
    public ws4 b;
    public bt4 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        ws4 ws4Var = this.b;
        if (ws4Var != null) {
            vs4 vs4Var = ws4Var.d;
            vs4Var.getClass();
            if (obj == null) {
                obj = js4.o;
            }
            if (js4.n.e(vs4Var, null, obj)) {
                js4.d(vs4Var);
                this.a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void finalize() {
        bt4 bt4Var;
        ws4 ws4Var = this.b;
        if (ws4Var != null) {
            vs4 vs4Var = ws4Var.d;
            if (!vs4Var.isDone()) {
                if (js4.n.e(vs4Var, null, new mp4(new o0("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.a)), 3)))) {
                    js4.d(vs4Var);
                }
            }
        }
        if (this.d || (bt4Var = this.c) == null) {
            return;
        }
        bt4Var.i(null);
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j54 implements gn3 {
    public final n54 c;
    public le1 d;
    public le1 h;
    public final /* synthetic */ k54 l;

    public j54(k54 k54Var, n54 n54Var, le1 le1Var, le1 le1Var2) {
        this.l = k54Var;
        this.c = n54Var;
        this.d = le1Var;
        this.h = le1Var2;
    }

    public final void b(l54 l54Var) {
        Object objInvoke = this.h.invoke(((m54) l54Var).b);
        boolean zF = this.l.c.f();
        n54 n54Var = this.c;
        if (zF) {
            n54Var.e(this.h.invoke(((m54) l54Var).a), objInvoke, (o71) this.d.invoke(l54Var));
        } else {
            n54Var.f(objInvoke, (o71) this.d.invoke(l54Var));
        }
    }

    @Override // defpackage.gn3
    public final Object getValue() {
        b(this.l.c.e());
        return this.c.p.getValue();
    }
}

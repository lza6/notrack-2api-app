package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum a34 extends e44 {
    public a34() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.k("--")) {
            o14Var.n.a();
            o14Var.c = e44.Z;
        } else if (p30Var.l("DOCTYPE")) {
            o14Var.c = e44.f0;
        } else if (p30Var.k("[CDATA[")) {
            o14Var.e();
            o14Var.c = e44.v0;
        } else {
            o14Var.m(this);
            o14Var.a(e44.X);
        }
    }
}

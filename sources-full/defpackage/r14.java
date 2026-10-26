package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum r14 extends e44 {
    public r14() {
        super("RCDATAEndTagOpen", 11);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (!p30Var.o()) {
            o14Var.h("</");
            o14Var.c = e44.h;
            return;
        }
        o14Var.d(false);
        m14 m14Var = o14Var.i;
        char cI = p30Var.i();
        m14Var.getClass();
        m14Var.g(String.valueOf(cI));
        o14Var.h.append(p30Var.i());
        o14Var.a(e44.t);
    }
}

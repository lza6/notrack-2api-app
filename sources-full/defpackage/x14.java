package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum x14 extends e44 {
    public x14() {
        super("ScriptDataEndTagOpen", 17);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.o()) {
            o14Var.d(false);
            o14Var.c = e44.z;
        } else {
            o14Var.h("</");
            o14Var.c = e44.n;
        }
    }
}

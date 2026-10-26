package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum d24 extends e44 {
    public d24() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        if (p30Var.j()) {
            o14Var.l(this);
            o14Var.c = e44.c;
            return;
        }
        char cD = p30Var.d();
        c24 c24Var = e44.C;
        if (cD == 0) {
            o14Var.m(this);
            o14Var.f((char) 65533);
            o14Var.c = c24Var;
        } else if (cD == '-') {
            o14Var.f(cD);
            o14Var.c = e44.E;
        } else if (cD == '<') {
            o14Var.c = e44.F;
        } else {
            o14Var.f(cD);
            o14Var.c = c24Var;
        }
    }
}

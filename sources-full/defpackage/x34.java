package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum x34 extends e44 {
    public x34() {
        super("AfterDoctypeSystemIdentifier", 64);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            return;
        }
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.j();
            o14Var.c = z14Var;
        } else if (cD != 65535) {
            o14Var.m(this);
            o14Var.c = e44.u0;
        } else {
            o14Var.l(this);
            o14Var.m.getClass();
            o14Var.j();
            o14Var.c = z14Var;
        }
    }
}

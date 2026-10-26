package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum w34 extends e44 {
    public w34() {
        super("DoctypeSystemIdentifier_singleQuoted", 63);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            i14Var.d.append((char) 65533);
            return;
        }
        if (cD == '\'') {
            o14Var.c = e44.t0;
            return;
        }
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.m(this);
            i14Var.getClass();
            o14Var.j();
            o14Var.c = z14Var;
            return;
        }
        if (cD != 65535) {
            i14Var.d.append(cD);
            return;
        }
        o14Var.l(this);
        i14Var.getClass();
        o14Var.j();
        o14Var.c = z14Var;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum o34 extends e44 {
    public o34() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        char cD = p30Var.d();
        if (cD == 0) {
            o14Var.m(this);
            i14Var.c.append((char) 65533);
            return;
        }
        if (cD == '\"') {
            o14Var.c = e44.n0;
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
            i14Var.c.append(cD);
            return;
        }
        o14Var.l(this);
        i14Var.getClass();
        o14Var.j();
        o14Var.c = z14Var;
    }
}

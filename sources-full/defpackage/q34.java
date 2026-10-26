package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum q34 extends e44 {
    public q34() {
        super("AfterDoctypePublicIdentifier", 58);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        char cD = p30Var.d();
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            o14Var.c = e44.o0;
            return;
        }
        if (cD == '\"') {
            o14Var.m(this);
            o14Var.c = e44.r0;
            return;
        }
        if (cD == '\'') {
            o14Var.m(this);
            o14Var.c = e44.s0;
            return;
        }
        z14 z14Var = e44.c;
        if (cD == '>') {
            o14Var.j();
            o14Var.c = z14Var;
        } else if (cD != 65535) {
            o14Var.m(this);
            i14Var.getClass();
            o14Var.c = e44.u0;
        } else {
            o14Var.l(this);
            i14Var.getClass();
            o14Var.j();
            o14Var.c = z14Var;
        }
    }
}

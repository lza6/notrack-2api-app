package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum i34 extends e44 {
    public i34() {
        super("Doctype", 50);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        i14 i14Var = o14Var.m;
        char cD = p30Var.d();
        j34 j34Var = e44.g0;
        if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r' || cD == ' ') {
            o14Var.c = j34Var;
            return;
        }
        if (cD != '>') {
            if (cD != 65535) {
                o14Var.m(this);
                o14Var.c = j34Var;
                return;
            }
            o14Var.l(this);
        }
        o14Var.m(this);
        i14Var.a();
        i14Var.getClass();
        o14Var.j();
        o14Var.c = e44.c;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum p24 extends e44 {
    public p24() {
        super("BeforeAttributeName", 33);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        q24 q24Var = e44.P;
        if (cD == 0) {
            o14Var.m(this);
            o14Var.i.i();
            p30Var.q();
            o14Var.c = q24Var;
            return;
        }
        if (cD != ' ') {
            if (cD != '\"' && cD != '\'') {
                if (cD == '/') {
                    o14Var.c = e44.W;
                    return;
                }
                z14 z14Var = e44.c;
                if (cD == 65535) {
                    o14Var.l(this);
                    o14Var.c = z14Var;
                    return;
                }
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                    return;
                }
                switch (cD) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        o14Var.k();
                        o14Var.c = z14Var;
                        break;
                    default:
                        o14Var.i.i();
                        p30Var.q();
                        o14Var.c = q24Var;
                        break;
                }
                return;
            }
            o14Var.m(this);
            o14Var.i.i();
            o14Var.i.c(cD);
            o14Var.c = q24Var;
        }
    }
}

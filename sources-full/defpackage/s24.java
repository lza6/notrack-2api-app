package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final enum s24 extends e44 {
    public s24() {
        super("BeforeAttributeValue", 36);
    }

    @Override // defpackage.e44
    public final void d(o14 o14Var, p30 p30Var) {
        char cD = p30Var.d();
        w24 w24Var = e44.U;
        if (cD == 0) {
            o14Var.m(this);
            o14Var.i.d((char) 65533);
            o14Var.c = w24Var;
            return;
        }
        if (cD != ' ') {
            if (cD == '\"') {
                o14Var.c = e44.S;
                return;
            }
            if (cD != '`') {
                z14 z14Var = e44.c;
                if (cD == 65535) {
                    o14Var.l(this);
                    o14Var.k();
                    o14Var.c = z14Var;
                    return;
                }
                if (cD == '\t' || cD == '\n' || cD == '\f' || cD == '\r') {
                    return;
                }
                if (cD == '&') {
                    p30Var.q();
                    o14Var.c = w24Var;
                    return;
                }
                if (cD == '\'') {
                    o14Var.c = e44.T;
                    return;
                }
                switch (cD) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        o14Var.m(this);
                        o14Var.k();
                        o14Var.c = z14Var;
                        break;
                    default:
                        p30Var.q();
                        o14Var.c = w24Var;
                        break;
                }
                return;
            }
            o14Var.m(this);
            o14Var.i.d(cD);
            o14Var.c = w24Var;
        }
    }
}
